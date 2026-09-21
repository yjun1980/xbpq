/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URL;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedActionException;
import java.util.Map;
import java.util.WeakHashMap;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecureCaller$1;
import org.mozilla.javascript.SecureCaller$2;
import org.mozilla.javascript.SecureCaller$3;

public abstract class SecureCaller {
    private static final Map<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>> callers;
    private static final byte[] secureCallerImplBytecode;

    static {
        secureCallerImplBytecode = SecureCaller.loadBytecode();
        callers = new WeakHashMap<CodeSource, Map<ClassLoader, SoftReference<SecureCaller>>>();
    }

    static /* synthetic */ byte[] access$000() {
        return secureCallerImplBytecode;
    }

    static /* synthetic */ byte[] access$100() {
        return SecureCaller.loadBytecodePrivileged();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Object callSecurely(CodeSource softReference, Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        WeakHashMap<ClassLoader, SoftReference<Object>> weakHashMap;
        Object object;
        ClassLoader classLoader = (ClassLoader)AccessController.doPrivileged(new SecureCaller$1(Thread.currentThread()));
        Object object2 = callers;
        synchronized (object2) {
            object = object2.get(softReference);
            weakHashMap = object;
            if (object == null) {
                weakHashMap = new WeakHashMap<ClassLoader, SoftReference<Object>>();
                object2.put((CodeSource)((Object)softReference), weakHashMap);
            }
        }
        synchronized (weakHashMap) {
            object = (SoftReference)weakHashMap.get(classLoader);
            object = object != null ? (SecureCaller)((SoftReference)object).get() : null;
            object2 = object;
            if (object == null) {
                try {
                    object = new SecureCaller$2(classLoader, (CodeSource)((Object)softReference));
                    object2 = (SecureCaller)AccessController.doPrivileged(object);
                    softReference = new SoftReference<Object>(object2);
                    weakHashMap.put(classLoader, softReference);
                }
                catch (PrivilegedActionException privilegedActionException) {
                    softReference = new SoftReference<Object>(privilegedActionException.getCause());
                    throw softReference;
                }
            }
            return ((SecureCaller)object2).call(callable, context, scriptable, scriptable2, objectArray);
        }
    }

    private static byte[] loadBytecode() {
        return (byte[])AccessController.doPrivileged(new SecureCaller$3());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static byte[] loadBytecodePrivileged() {
        int n2;
        Object object;
        Object object2 = SecureCaller.class.getResource("SecureCallerImpl.clazz");
        object2 = ((URL)object2).openStream();
        try {
            object = new ByteArrayOutputStream();
            while (true) {
                if ((n2 = ((InputStream)object2).read()) != -1) break block13;
                break;
            }
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                if (object2 == null) throw throwable2;
                try {
                    ((InputStream)object2).close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    try {
                        throwable.addSuppressed(throwable3);
                        throw throwable2;
                    }
                    catch (IOException iOException) {
                        throw new UndeclaredThrowableException(iOException);
                    }
                }
            }
        }
        {
            block13: {
                object = ((ByteArrayOutputStream)object).toByteArray();
                ((InputStream)object2).close();
                return object;
            }
            ((ByteArrayOutputStream)object).write(n2);
            continue;
        }
    }

    public abstract Object call(Callable var1, Context var2, Scriptable var3, Scriptable var4, Object[] var5);
}

