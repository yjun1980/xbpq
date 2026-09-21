/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise$Capability;
import org.mozilla.javascript.Scriptable;

public final class y
implements Callable {
    public final NativePromise$Capability a;

    public /* synthetic */ y(NativePromise$Capability nativePromise$Capability) {
        this.a = nativePromise$Capability;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise$Capability.a(this.a, context, scriptable, scriptable2, objectArray);
    }
}

