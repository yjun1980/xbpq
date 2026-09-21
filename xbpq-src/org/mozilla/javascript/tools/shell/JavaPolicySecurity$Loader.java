/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.security.ProtectionDomain;
import org.mozilla.javascript.GeneratedClassLoader;

class JavaPolicySecurity$Loader
extends ClassLoader
implements GeneratedClassLoader {
    private ProtectionDomain domain;

    JavaPolicySecurity$Loader(ClassLoader classLoader, ProtectionDomain protectionDomain) {
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        super(classLoader);
        this.domain = protectionDomain;
    }

    @Override
    public Class<?> defineClass(String string, byte[] byArray) {
        return super.defineClass(string, byArray, 0, byArray.length, this.domain);
    }

    @Override
    public void linkClass(Class<?> clazz) {
        this.resolveClass(clazz);
    }
}

