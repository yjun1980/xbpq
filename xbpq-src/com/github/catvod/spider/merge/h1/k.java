/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.BiConsumer;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMap;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public final class k
implements BiConsumer {
    public final Callable a;
    public final Context b;
    public final Scriptable c;
    public final ScriptableObject d;

    public /* synthetic */ k(Callable callable, Context context, Scriptable scriptable, ScriptableObject scriptableObject) {
        this.a = callable;
        this.b = context;
        this.c = scriptable;
        this.d = scriptableObject;
    }

    public final void accept(Object object, Object object2) {
        NativeMap.a(this.a, this.b, this.c, this.d, object, object2);
    }
}

