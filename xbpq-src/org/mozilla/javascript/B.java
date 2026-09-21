/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativePromise$ResolvingFunctions;
import org.mozilla.javascript.Scriptable;

public final class B
implements Runnable {
    public final NativePromise a;
    public final Context b;
    public final Scriptable c;
    public final Object d;
    public final Object e;

    public /* synthetic */ B(NativePromise nativePromise, Context context, Scriptable scriptable, Object object, Object object2) {
        this.a = nativePromise;
        this.b = context;
        this.c = scriptable;
        this.d = object;
        this.e = object2;
    }

    @Override
    public final void run() {
        NativePromise$ResolvingFunctions.b(this.a, this.b, this.c, this.d, this.e);
    }
}

