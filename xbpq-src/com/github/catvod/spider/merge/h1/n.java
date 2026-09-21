/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class n
implements Callable {
    public final int a;
    public final Object b;

    public /* synthetic */ n(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return NativePromise.k(this.b, context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.o((LambdaConstructor)this.b, context, scriptable, scriptable2, objectArray);
    }
}

