/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativePromise$Reaction;
import org.mozilla.javascript.Scriptable;

public final class w
implements Runnable {
    public final NativePromise a;
    public final NativePromise$Reaction b;
    public final Context c;
    public final Scriptable d;

    public /* synthetic */ w(NativePromise nativePromise, NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable) {
        this.a = nativePromise;
        this.b = nativePromise$Reaction;
        this.c = context;
        this.d = scriptable;
    }

    @Override
    public final void run() {
        NativePromise.d(this.a, this.b, this.c, this.d);
    }
}

