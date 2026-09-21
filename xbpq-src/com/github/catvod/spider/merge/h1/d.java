/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Scriptable;

public final class d
implements ContextAction {
    public final Scriptable a;
    public final Scriptable b;
    public final Function c;
    public final Object[] d;
    public final long e;

    public /* synthetic */ d(Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objectArray, long l2) {
        this.a = scriptable;
        this.b = scriptable2;
        this.c = function;
        this.d = objectArray;
        this.e = l2;
    }

    public final Object run(Context context) {
        return JavaAdapter.a(this.a, this.b, this.c, this.d, this.e, context);
    }
}

