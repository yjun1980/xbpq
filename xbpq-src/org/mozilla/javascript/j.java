/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Supplier;
import org.mozilla.javascript.NativeError;

public final class j
implements Supplier {
    public final NativeError a;

    public /* synthetic */ j(NativeError nativeError) {
        this.a = nativeError;
    }

    public final Object get() {
        return this.a.getStackDelegated();
    }
}

