/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.lang.reflect.Method;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.Scriptable;

public final class b
implements ContextAction {
    public final InterfaceAdapter a;
    public final Object b;
    public final Scriptable c;
    public final Object d;
    public final Method e;
    public final Object[] f;

    public /* synthetic */ b(InterfaceAdapter interfaceAdapter, Object object, Scriptable scriptable, Object object2, Method method, Object[] objectArray) {
        this.a = interfaceAdapter;
        this.b = object;
        this.c = scriptable;
        this.d = object2;
        this.e = method;
        this.f = objectArray;
    }

    public final Object run(Context context) {
        return InterfaceAdapter.a(this.a, this.b, this.c, this.d, this.e, this.f, context);
    }
}

