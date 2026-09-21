/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.CodeSource;
import java.security.SecureClassLoader;

class SecureCaller$SecureClassLoaderImpl
extends SecureClassLoader {
    SecureCaller$SecureClassLoaderImpl(ClassLoader classLoader) {
        super(classLoader);
    }

    Class<?> defineAndLinkClass(String object, byte[] byArray, CodeSource codeSource) {
        object = this.defineClass((String)object, byArray, 0, byArray.length, codeSource);
        this.resolveClass((Class<?>)object);
        return object;
    }
}

