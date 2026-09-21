/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class p
implements Callable {
    public final Scriptable a;
    public final Callable b;
    public final Object c;

    public /* synthetic */ p(Scriptable scriptable, Callable callable, Object object) {
        this.a = scriptable;
        this.b = callable;
        this.c = object;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.t(this.a, this.b, this.c, context, scriptable, scriptable2, objectArray);
    }
}

