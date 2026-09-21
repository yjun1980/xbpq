/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise$PromiseAllResolver;
import org.mozilla.javascript.NativePromise$PromiseElementResolver;
import org.mozilla.javascript.Scriptable;

public final class A
implements Callable {
    public final NativePromise$PromiseAllResolver a;
    public final NativePromise.PromiseElementResolver b;

    public /* synthetic */ A(NativePromise$PromiseAllResolver promiseAllResolver, NativePromise.PromiseElementResolver promiseElementResolver) {
        this.a = promiseAllResolver;
        this.b = promiseElementResolver;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise$PromiseAllResolver.b(this.a, this.b, context, scriptable, scriptable2, objectArray);
    }
}

