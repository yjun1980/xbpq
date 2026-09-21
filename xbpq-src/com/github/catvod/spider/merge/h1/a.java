/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.Scriptable;

public final class a
implements ContextAction {
    public final Callable a;
    public final Scriptable b;
    public final Scriptable c;
    public final Object[] d;

    public /* synthetic */ a(Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        this.a = callable;
        this.b = scriptable;
        this.c = scriptable2;
        this.d = objectArray;
    }

    public final Object run(Context context) {
        return Context.a(this.a, this.b, this.c, this.d, context);
    }
}

