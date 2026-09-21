/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.DefiningClassLoader;

class ContextFactory$1
implements PrivilegedAction<DefiningClassLoader> {
    final ContextFactory this$0;
    final ClassLoader val$parent;

    ContextFactory$1(ContextFactory contextFactory, ClassLoader classLoader) {
        this.this$0 = contextFactory;
        this.val$parent = classLoader;
    }

    @Override
    public DefiningClassLoader run() {
        return new DefiningClassLoader(this.val$parent);
    }
}

