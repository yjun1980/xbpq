/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.CodeSource;
import java.security.PrivilegedExceptionAction;
import org.mozilla.javascript.SecureCaller;
import org.mozilla.javascript.SecureCaller$SecureClassLoaderImpl;

final class SecureCaller$2
implements PrivilegedExceptionAction<Object> {
    final ClassLoader val$classLoader;
    final CodeSource val$codeSource;

    SecureCaller$2(ClassLoader classLoader, CodeSource codeSource) {
        this.val$classLoader = classLoader;
        this.val$codeSource = codeSource;
    }

    @Override
    public Object run() {
        Object object = this.val$classLoader.loadClass(SecureCaller$2.class.getName()) != SecureCaller$2.class ? SecureCaller$2.class.getClassLoader() : this.val$classLoader;
        SecureCaller$SecureClassLoaderImpl secureCaller$SecureClassLoaderImpl = new SecureCaller$SecureClassLoaderImpl((ClassLoader)object);
        object = new StringBuilder();
        ((StringBuilder)object).append(SecureCaller.class.getName());
        ((StringBuilder)object).append("Impl");
        return secureCaller$SecureClassLoaderImpl.defineAndLinkClass(((StringBuilder)object).toString(), SecureCaller.access$000(), this.val$codeSource).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}

