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
// Generated from file `Router.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * Get the router's server proxy, i.e., the proxy to use for
 * forwarding requests from the server to the router.
 * 
 **/

public abstract class Callback_Router_getServerProxy extends Ice.TwowayCallback
{
    public abstract void response(Ice.ObjectPrx __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        RouterPrx __proxy = (RouterPrx)__result.getProxy();
        Ice.ObjectPrx __ret = null;
        try
        {
            __ret = __proxy.end_getServerProxy(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
