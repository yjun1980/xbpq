/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import java.lang.ref.SoftReference;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedActionException;
import java.util.Map;
import java.util.WeakHashMap;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.PolicySecurityController$1;
import org.mozilla.javascript.PolicySecurityController$2;
import org.mozilla.javascript.PolicySecurityController$Loader;
import org.mozilla.javascript.PolicySecurityController$SecureCaller;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;

public class PolicySecurityController
extends SecurityController {
    private static final Map<CodeSource, Map<ClassLoader, SoftReference<PolicySecurityController$SecureCaller>>> callers;
    private static final byte[] secureCallerImplBytecode;

    static {
        secureCallerImplBytecode = PolicySecurityController.loadBytecode();
        callers = new WeakHashMap<CodeSource, Map<ClassLoader, SoftReference<PolicySecurityController$SecureCaller>>>();
    }

    static /* synthetic */ byte[] access$000() {
        return secureCallerImplBytecode;
    }

    private static byte[] loadBytecode() {
        String string = PolicySecurityController$SecureCaller.class.getName();
        ClassFileWriter classFileWriter = new ClassFileWriter(e.c(string, "Impl"), string, "<generated>");
        classFileWriter.startMethod("<init>", "()V", (short)1);
        classFileWriter.addALoad(0);
        classFileWriter.addInvoke(183, string, "<init>", "()V");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)1);
        classFileWriter.startMethod("call", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short)17);
        for (int i2 = 1; i2 < 6; ++i2) {
            classFileWriter.addALoad(i2);
        }
        classFileWriter.addInvoke(185, "org/mozilla/javascript/Callable", "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        classFileWriter.add(176);
        classFileWriter.stopMethod((short)6);
        return classFileWriter.toByteArray();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object callWithDomain(Object object, Context object2, Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        WeakHashMap<ClassLoader, SoftReference<Object>> weakHashMap;
        ClassLoader classLoader = (ClassLoader)AccessController.doPrivileged(new PolicySecurityController$2(this, (Context)object2));
        CodeSource codeSource = (CodeSource)object;
        Object object3 = callers;
        synchronized (object3) {
            object = object3.get(codeSource);
            weakHashMap = object;
            if (object == null) {
                weakHashMap = new WeakHashMap<ClassLoader, SoftReference<Object>>();
                object3.put((CodeSource)codeSource, weakHashMap);
            }
        }
        synchronized (weakHashMap) {
            object = (SoftReference)weakHashMap.get(classLoader);
            object = object != null ? (PolicySecurityController$SecureCaller)((SoftReference)object).get() : null;
            object3 = object;
            if (object == null) {
                try {
                    object = new Object(this, classLoader, codeSource);
                    object3 = (PolicySecurityController$SecureCaller)AccessController.doPrivileged(object);
                    object = new Object(object3);
                    weakHashMap.put(classLoader, (SoftReference<Object>)object);
                }
                catch (PrivilegedActionException privilegedActionException) {
                    object2 = new UndeclaredThrowableException(privilegedActionException.getCause());
                    throw object2;
                }
            }
            return ((PolicySecurityController$SecureCaller)object3).call(callable, (Context)object2, scriptable, scriptable2, objectArray);
        }
    }

    @Override
    public GeneratedClassLoader createClassLoader(ClassLoader classLoader, Object object) {
        return (PolicySecurityController$Loader)AccessController.doPrivileged(new PolicySecurityController$1(this, classLoader, object));
    }

    @Override
    public Object getDynamicSecurityDomain(Object object) {
        return object;
    }

    @Override
    public Class<?> getStaticSecurityDomainClassInternal() {
        return CodeSource.class;
    }
}

