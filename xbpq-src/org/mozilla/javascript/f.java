/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Consumer;
import org.mozilla.javascript.NativeError$ProtoProps;

public final class f
implements Consumer {
    public final NativeError$ProtoProps a;

    public /* synthetic */ f(NativeError$ProtoProps nativeError$ProtoProps) {
        this.a = nativeError$ProtoProps;
    }

    public final void accept(Object object) {
        this.a.setStackTraceLimit(object);
    }
}

