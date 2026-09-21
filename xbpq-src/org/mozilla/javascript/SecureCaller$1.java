/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;

final class SecureCaller$1
implements PrivilegedAction<Object> {
    final Thread val$thread;

    SecureCaller$1(Thread thread) {
        this.val$thread = thread;
    }

    @Override
    public Object run() {
        return this.val$thread.getContextClassLoader();
    }
}

