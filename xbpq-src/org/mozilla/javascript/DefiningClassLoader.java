/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.SecurityUtilities;

public class DefiningClassLoader
extends ClassLoader
implements GeneratedClassLoader {
    private final ClassLoader parentLoader;

    public DefiningClassLoader() {
        this.parentLoader = this.getClass().getClassLoader();
    }

    public DefiningClassLoader(ClassLoader classLoader) {
        this.parentLoader = classLoader;
    }

    @Override
    public Class<?> defineClass(String string, byte[] byArray) {
        return super.defineClass(string, byArray, 0, byArray.length, SecurityUtilities.getProtectionDomain(this.getClass()));
    }

    @Override
    public void linkClass(Class<?> clazz) {
        this.resolveClass(clazz);
    }

    @Override
    public Class<?> loadClass(String string, boolean bl) {
        Class<?> clazz = this.findLoadedClass(string);
        Object object = clazz;
        if (clazz == null) {
            object = this.parentLoader;
            object = object != null ? ((ClassLoader)object).loadClass(string) : this.findSystemClass(string);
        }
        if (bl) {
            this.resolveClass((Class<?>)object);
        }
        return object;
    }
}

