// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `LocalException.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * This exception indicates an unsupported protocol version.
 * 
 **/
public class UnsupportedProtocolException extends ProtocolException
{
    public UnsupportedProtocolException()
    {
        super();
    }

    public UnsupportedProtocolException(String reason, int badMajor, int badMinor, int major, int minor)
    {
        super(reason);
        this.badMajor = badMajor;
        this.badMinor = badMinor;
        this.major = major;
        this.minor = minor;
    }

    public String
    ice_name()
    {
        return "Ice::UnsupportedProtocolException";
    }

    /**
     * The major version number of the unsupported protocol.
     * 
     **/
    public int badMajor;

    /**
     * The minor version number of the unsupported protocol.
     * 
     **/
    public int badMinor;

    /**
     * The major version number of the protocol that is supported.
     * 
     **/
    public int major;

    /**
     * The highest minor version number of the protocol that can be supported.
     * 
     **/
    public int minor;
}
