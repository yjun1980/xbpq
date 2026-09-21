/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Supplier;
import org.mozilla.javascript.NativeError$ProtoProps;

public final class i
implements Supplier {
    public final NativeError$ProtoProps a;

    public /* synthetic */ i(NativeError$ProtoProps nativeError$ProtoProps) {
        this.a = nativeError$ProtoProps;
    }

    public final Object get() {
        return this.a.getStackTraceLimit();
    }
}

