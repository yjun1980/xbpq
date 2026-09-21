/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Consumer;
import org.mozilla.javascript.NativeError;

public final class g
implements Consumer {
    public final NativeError a;

    public /* synthetic */ g(NativeError nativeError) {
        this.a = nativeError;
    }

    public final void accept(Object object) {
        this.a.setStackDelegated(object);
    }
}

