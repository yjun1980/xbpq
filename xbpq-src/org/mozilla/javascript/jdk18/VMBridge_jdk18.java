/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.jdk18;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.VMBridge;
import org.mozilla.javascript.jdk18.VMBridge_jdk18$1;

public class VMBridge_jdk18
extends VMBridge {
    private static final ThreadLocal<Object[]> contextLocal = new ThreadLocal();

    @Override
    protected Context getContext(Object object) {
        return (Context)((Object[])object)[0];
    }

    @Override
    protected Object getInterfaceProxyHelper(ContextFactory constructor, Class<?>[] classArray) {
        constructor = Proxy.getProxyClass(classArray[0].getClassLoader(), classArray);
        try {
            constructor = ((Class)((Object)constructor)).getConstructor(InvocationHandler.class);
            return constructor;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new IllegalStateException(noSuchMethodException);
        }
    }

    @Override
    protected Object getThreadContextHelper() {
        Object[] objectArray;
        ThreadLocal<Object[]> threadLocal = contextLocal;
        Object[] objectArray2 = objectArray = threadLocal.get();
        if (objectArray == null) {
            objectArray2 = new Object[1];
            threadLocal.set(objectArray2);
        }
        return objectArray2;
    }

    @Override
    protected Object newInterfaceProxy(Object object, ContextFactory object2, InterfaceAdapter interfaceAdapter, Object object3, Scriptable scriptable) {
        object = (Constructor)object;
        object2 = new VMBridge_jdk18$1(this, object3, interfaceAdapter, (ContextFactory)object2, scriptable);
        try {
            object = ((Constructor)object).newInstance(object2);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw Context.throwAsScriptRuntimeEx(invocationTargetException);
        }
    }

    @Override
    protected void setContext(Object object, Context context) {
        ((Object[])object)[0] = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean tryToMakeAccessible(AccessibleObject accessibleObject) {
        if (accessibleObject.isAccessible()) {
            return true;
        }
        try {
            accessibleObject.setAccessible(true);
            return accessibleObject.isAccessible();
        }
        catch (Exception exception) {
            return accessibleObject.isAccessible();
        }
    }
}

