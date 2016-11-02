// $Id: PacketCapture.java,v 1.16 2004/09/28 17:27:11 pcharles Exp $

/***************************************************************************
 * Copyright (C) 2001, Patrick Charles and Jonas Lehmann                   *
 * Distributed under the Mozilla Public License                            *
 *   http://www.mozilla.org/NPL/MPL-1.1.txt                                *
 ***************************************************************************/
package net.sourceforge.jpcap.capture;


/**
 * This class is the core of packet capture in jpcap. It provides a 
 * high-level interface for capturing network packets by encapsulating 
 * libpcap.
 * <p>
 * If you want to capture network packets, implement PacketListener
 * and register with an instance of this class. When packets arrive, 
 * the object will call you back via packetArrived().
 * <p>
 * Examples can be found in net.sourceforge.jpcap.tutorial.
 * <p>
 * For more documentation on this class's methods, see PacketCaptureCapable;
 * Javadoc is 'inherited' from this interface.
 * <p>
 * PacketCapture utilizes libpcap's pcap_loop().
 * See SyncPacketCapture for pcap_dispatch()-type behavior.
 *
 * @author Patrick Charles and Jonas Lehmann
 * @version $Revision: 1.16 $
 * @lastModifiedBy $Author: pcharles $
 * @lastModifiedAt $Date: 2004/09/28 17:27:11 $
 */
public class PacketCapture extends PacketCaptureBase
  implements PacketCaptureCapable
{
  /**
   * Name of the java-enabled wrapper around libpcap.
   */
  protected static String LIB_PCAP_WRAPPER = "jpcap";


  /**
   * Create a new packet capture instance.
   */
  public PacketCapture() {
    if(nextInstance >= INSTANCE_MAX) {
      throw new Error("Too many instances, exceeds " + INSTANCE_MAX);
    }

    instanceNum = nextInstance ++;
  }

  // methods for controlling a packet capture session

  public void open(String device, boolean promiscuous)
   throws CaptureDeviceOpenException {
    open(instanceNum, device, DEFAULT_SNAPLEN, promiscuous, DEFAULT_TIMEOUT);
  }

  public void open(String device, int snaplen, 
                   boolean promiscuous, int timeout) 
    throws CaptureDeviceOpenException {
    open(instanceNum, device, snaplen, promiscuous, timeout);
  }

  public native void open(int instance, String device, int snaplen, 
                          boolean promiscuous, int timeout) 
    throws CaptureDeviceOpenException;


  public void openOffline(String fileName) throws CaptureFileOpenException {
    openOffline(instanceNum, fileName);
  }

  public native void openOffline(int instance, String fileName)
    throws CaptureFileOpenException;

  public void setFilter(String filterExpression, boolean optimize)
    throws InvalidFilterException {
    setFilter(instanceNum, filterExpression, optimize);
  }

  public native void setFilter(int instance, String filterExpression, 
                               boolean optimize)
    throws InvalidFilterException;

  public void capture(int count) throws CapturePacketException {

    capture(instanceNum, count);
  }

  public native void capture(int instance, int count)
    throws CapturePacketException;

  public CaptureStatistics getStatistics() {
    setupStatistics();

    // transfer the values setup by the native method into
    // the container and return to the caller
    return new CaptureStatistics(receivedCount, droppedCount);
  }

  /**
   * Close cleans up after a packet capture session.
   * It does _not_ terminate a packet capture. 
   * capture() does not return control until 'count' packets are captured.
   * <p>
   * If you are looking for a way to signal an end to a capture session 
   * before a set number of packets are received, check out the class
   * SyncPacketCapture.
   */
  public native void close(int instance);

  public void close() {
    close(instanceNum);
  }

  public native void endCapture(int instance);

  public void endCapture() {
    endCapture(instanceNum);
  }


  /**
   * Get Interface List
   * @return Network device interface names.
   */
  public static native String[] lookupDevices() 
    throws CaptureDeviceLookupException;


  // the following methods could be static, but aren't so that they 
  // can be included in the PacketCaptureCapable interface.

  public native String findDevice() 
    throws CaptureDeviceNotFoundException;

  public native int getNetwork(String device)
    throws CaptureConfigurationException;

  public native int getNetmask(String device)
    throws CaptureConfigurationException;

  public int getLinkLayerType() throws CaptureConfigurationException {
    return getLinkLayerType(instanceNum);
  }

  public native int getLinkLayerType(int instance)
    throws CaptureConfigurationException;

  public int getSnapshotLength() {
    return getSnapshotLength(instanceNum);
  }

  public native int getSnapshotLength(int instance);


  /**
   * The packet capture library sets up the statistic counter members
   * when this method is invoked internally.
   */
  private native void setupStatistics(int instance);

  private void setupStatistics() {
    setupStatistics(instanceNum);
  }


  // static initialization

  static {
    System.err.print("PacketCapture: loading native library jpcap.. ");
    System.loadLibrary(LIB_PCAP_WRAPPER);
    System.err.println("ok");
  }


  private int instanceNum = 0; // the index of this instance
  private static int nextInstance = 0; // static instance counter
  private static int INSTANCE_MAX = 10;
  private String _rcsid = 
    "$Id: PacketCapture.java,v 1.16 2004/09/28 17:27:11 pcharles Exp $";
}
