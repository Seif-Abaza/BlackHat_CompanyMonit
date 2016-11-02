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
// Generated from file `Properties.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The PropertiesAdmin interface provides remote access to the properties
 * of a communicator.
 * 
 **/
public interface _PropertiesAdminOperations
{
    /**
     * Get a property by key. If the property is not set, an empty
     * string is returned.
     * 
     * @param key The property key.
     * 
     * @param __current The Current object for the invocation.
     * @return The property value.
     * 
     **/
    String getProperty(String key, Ice.Current __current);

    /**
     * Get all properties whose keys begins with
     * <em>prefix</em>. If
     * <em>prefix</em> is an empty string,
     * then all properties are returned.
     * 
     * @param prefix The prefix to search for (empty string if none).
     * @param __current The Current object for the invocation.
     * @return The matching property set.
     * 
     **/
    java.util.Map<java.lang.String, java.lang.String> getPropertiesForPrefix(String prefix, Ice.Current __current);
}
