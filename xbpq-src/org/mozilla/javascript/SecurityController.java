/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController$1;

public abstract class SecurityController {
    private static SecurityController global;

    public static GeneratedClassLoader createLoader(ClassLoader object, Object object2) {
        Context context = Context.getContext();
        ClassLoader classLoader = object;
        if (object == null) {
            classLoader = context.getApplicationClassLoader();
        }
        object = (object = context.getSecurityController()) == null ? context.createClassLoader(classLoader) : ((SecurityController)object).createClassLoader(classLoader, ((SecurityController)object).getDynamicSecurityDomain(object2));
        return object;
    }

    public static Class<?> getStaticSecurityDomainClass() {
        Object object = Context.getContext().getSecurityController();
        object = object == null ? null : ((SecurityController)object).getStaticSecurityDomainClassInternal();
        return object;
    }

    static SecurityController global() {
        return global;
    }

    public static boolean hasGlobal() {
        boolean bl = global != null;
        return bl;
    }

    public static void initGlobal(SecurityController securityController) {
        if (securityController != null) {
            if (global == null) {
                global = securityController;
                return;
            }
            throw new SecurityException("Cannot overwrite already installed global SecurityController");
        }
        throw new IllegalArgumentException();
    }

    public Object callWithDomain(Object object, Context context, Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.execWithDomain(context, scriptable, new SecurityController$1(this, callable, scriptable2, objectArray), object);
    }

    public abstract GeneratedClassLoader createClassLoader(ClassLoader var1, Object var2);

    @Deprecated
    public Object execWithDomain(Context context, Scriptable scriptable, Script script, Object object) {
        throw new IllegalStateException("callWithDomain should be overridden");
    }

    public abstract Object getDynamicSecurityDomain(Object var1);

    public Class<?> getStaticSecurityDomainClassInternal() {
        return null;
    }
}

