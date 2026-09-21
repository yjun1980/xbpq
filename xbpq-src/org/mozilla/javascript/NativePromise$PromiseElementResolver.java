/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise$PromiseAllResolver;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

class NativePromise$PromiseElementResolver {
    private boolean alreadyCalled = false;
    private final int index;

    NativePromise$PromiseElementResolver(int n2) {
        this.index = n2;
    }

    Object resolve(Context context, Scriptable scriptable, Object object, NativePromise$PromiseAllResolver nativePromise$PromiseAllResolver) {
        int n2;
        if (this.alreadyCalled) {
            return Undefined.instance;
        }
        this.alreadyCalled = true;
        nativePromise$PromiseAllResolver.values.set(this.index, object);
        nativePromise$PromiseAllResolver.remainingElements = n2 = nativePromise$PromiseAllResolver.remainingElements - 1;
        if (n2 == 0) {
            nativePromise$PromiseAllResolver.finalResolution(context, scriptable);
        }
        return Undefined.instance;
    }
}

