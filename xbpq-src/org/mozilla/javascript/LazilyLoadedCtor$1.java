/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import org.mozilla.javascript.LazilyLoadedCtor;

class LazilyLoadedCtor$1
implements PrivilegedAction<Object> {
    final LazilyLoadedCtor this$0;

    LazilyLoadedCtor$1(LazilyLoadedCtor lazilyLoadedCtor) {
        this.this$0 = lazilyLoadedCtor;
    }

    @Override
    public Object run() {
        return LazilyLoadedCtor.access$000(this.this$0);
    }
}

