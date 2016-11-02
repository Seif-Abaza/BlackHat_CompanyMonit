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
 * Get all properties whose keys begins with
 * <em>prefix</em>. If
 * <em>prefix</em> is an empty string,
 * then all properties are returned.
 * 
 **/

public abstract class AMI_PropertiesAdmin_getPropertiesForPrefix extends Callback_PropertiesAdmin_getPropertiesForPrefix
{
    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) The matching property set.
     * 
     **/
    public abstract void ice_response(java.util.Map<java.lang.String, java.lang.String> __ret);

    /**
     * ice_exception indicates to the caller that
     * the operation completed with an exception.
     * @param ex The Ice run-time exception to be raised.
     **/
    public abstract void ice_exception(Ice.LocalException ex);

    public final void response(java.util.Map<java.lang.String, java.lang.String> __ret)
    {
        ice_response(__ret);
    }

    public final void exception(Ice.LocalException __ex)
    {
        ice_exception(__ex);
    }

    @Override public final void sent(boolean sentSynchronously)
    {
        if(!sentSynchronously && this instanceof Ice.AMISentCallback)
        {
            ((Ice.AMISentCallback)this).ice_sent();
        }
    }
}
