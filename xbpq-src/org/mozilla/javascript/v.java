/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativePromise$Reaction;
import org.mozilla.javascript.Scriptable;

public final class v
implements Runnable {
    public final NativePromise$Reaction a;
    public final Context b;
    public final Scriptable c;
    public final Object d;

    public /* synthetic */ v(NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable, Object object) {
        this.a = nativePromise$Reaction;
        this.b = context;
        this.c = scriptable;
        this.d = object;
    }

    @Override
    public final void run() {
        NativePromise.f(this.a, this.b, this.c, this.d);
    }
}

