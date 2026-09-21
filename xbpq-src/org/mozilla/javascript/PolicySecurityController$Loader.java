/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.CodeSource;
import java.security.SecureClassLoader;
import org.mozilla.javascript.GeneratedClassLoader;

class PolicySecurityController$Loader
extends SecureClassLoader
implements GeneratedClassLoader {
    private final CodeSource codeSource;

    PolicySecurityController$Loader(ClassLoader classLoader, CodeSource codeSource) {
        super(classLoader);
        this.codeSource = codeSource;
    }

    @Override
    public Class<?> defineClass(String string, byte[] byArray) {
        return this.defineClass(string, byArray, 0, byArray.length, this.codeSource);
    }

    @Override
    public void linkClass(Class<?> clazz) {
        this.resolveClass(clazz);
    }
}

