// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `PermissionsVerifier.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * The Glacier2 permissions verifier. This is called through the
 * process of establishing a session.
 * 
 * @see Router
 * 
 **/
public final class PermissionsVerifierPrxHelper extends Ice.ObjectPrxHelperBase implements PermissionsVerifierPrx
{
    /**
     * Check whether a user has permission to access the router.
     * 
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param reason The reason why access was denied.
     * 
     * @return True if access is granted, or false otherwise.
     * 
     **/
    public boolean
    checkPermissions(String userId, String password, Ice.StringHolder reason)
    {
        return checkPermissions(userId, password, reason, null, false);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param reason The reason why access was denied.
     * 
     * @param __ctx The Context map to send with the invocation.
     * @return True if access is granted, or false otherwise.
     * 
     **/
    public boolean
    checkPermissions(String userId, String password, Ice.StringHolder reason, java.util.Map<String, String> __ctx)
    {
        return checkPermissions(userId, password, reason, __ctx, true);
    }

    private boolean
    checkPermissions(String userId, String password, Ice.StringHolder reason, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("checkPermissions");
                __delBase = __getDelegate(false);
                _PermissionsVerifierDel __del = (_PermissionsVerifierDel)__delBase;
                return __del.checkPermissions(userId, password, reason, __ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __checkPermissions_name = "checkPermissions";

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password)
    {
        return begin_checkPermissions(userId, password, null, false, null);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password, java.util.Map<String, String> __ctx)
    {
        return begin_checkPermissions(userId, password, __ctx, true, null);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password, Ice.Callback __cb)
    {
        return begin_checkPermissions(userId, password, null, false, __cb);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_checkPermissions(userId, password, __ctx, true, __cb);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password, Callback_PermissionsVerifier_checkPermissions __cb)
    {
        return begin_checkPermissions(userId, password, null, false, __cb);
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_checkPermissions(String userId, String password, java.util.Map<String, String> __ctx, Callback_PermissionsVerifier_checkPermissions __cb)
    {
        return begin_checkPermissions(userId, password, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_checkPermissions(String userId, String password, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__checkPermissions_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __checkPermissions_name, __cb);
        try
        {
            __result.__prepare(__checkPermissions_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeString(userId);
            __os.writeString(password);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     * @param __ret (return value) True if access is granted, or false otherwise.
     * 
     * @param reason The reason why access was denied.
     * 
     **/
    public boolean end_checkPermissions(Ice.StringHolder reason, Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __checkPermissions_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name());
            }
        }
        boolean __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        reason.value = __is.readString();
        __ret = __is.readBool();
        __is.endReadEncaps();
        return __ret;
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     **/
    public boolean
    checkPermissions_async(AMI_PermissionsVerifier_checkPermissions __cb, String userId, String password)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__checkPermissions_name);
            __r = begin_checkPermissions(userId, password, null, false, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __checkPermissions_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    /**
     * Check whether a user has permission to access the router.
     * 
     * @param __cb The callback object for the operation.
     * @param userId The user id for which to check permission.
     * 
     * @param password The user's password.
     * 
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean
    checkPermissions_async(AMI_PermissionsVerifier_checkPermissions __cb, String userId, String password, java.util.Map<String, String> __ctx)
    {
        Ice.AsyncResult __r;
        try
        {
            __checkTwowayOnly(__checkPermissions_name);
            __r = begin_checkPermissions(userId, password, __ctx, true, __cb);
        }
        catch(Ice.TwowayOnlyException ex)
        {
            __r = new IceInternal.OutgoingAsync(this, __checkPermissions_name, __cb);
            __r.__exceptionAsync(ex);
        }
        return __r.sentSynchronously();
    }

    public static PermissionsVerifierPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (PermissionsVerifierPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Glacier2::PermissionsVerifier"))
                {
                    PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PermissionsVerifierPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (PermissionsVerifierPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA("::Glacier2::PermissionsVerifier", __ctx))
                {
                    PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PermissionsVerifierPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Glacier2::PermissionsVerifier"))
                {
                    PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PermissionsVerifierPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA("::Glacier2::PermissionsVerifier", __ctx))
                {
                    PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PermissionsVerifierPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (PermissionsVerifierPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PermissionsVerifierPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PermissionsVerifierPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PermissionsVerifierPrxHelper __h = new PermissionsVerifierPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _PermissionsVerifierDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _PermissionsVerifierDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, PermissionsVerifierPrx v)
    {
        __os.writeProxy(v);
    }

    public static PermissionsVerifierPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PermissionsVerifierPrxHelper result = new PermissionsVerifierPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
