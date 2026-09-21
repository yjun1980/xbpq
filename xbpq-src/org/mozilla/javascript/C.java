/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativePromise$ResolvingFunctions;
import org.mozilla.javascript.Scriptable;

public final class C
implements Callable {
    public final NativePromise$ResolvingFunctions a;
    public final NativePromise b;

    public /* synthetic */ C(NativePromise$ResolvingFunctions nativePromise$ResolvingFunctions, NativePromise nativePromise) {
        this.a = nativePromise$ResolvingFunctions;
        this.b = nativePromise;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise$ResolvingFunctions.a(this.a, this.b, context, scriptable, scriptable2, objectArray);
    }
}

