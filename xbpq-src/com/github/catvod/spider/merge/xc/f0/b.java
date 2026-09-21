/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.o;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.g0.g;

public final class b
extends g {
    public int a;
    public final p b;
    public final Object c;

    public b(d d2, p p2, Object object) {
        this.b = p2;
        this.c = object;
        i.c(d2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(d2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object invokeSuspend(Object object) {
        int n2 = this.a;
        if (n2 == 0) {
            this.a = 1;
            com.github.catvod.spider.merge.xc.a.a.C(object);
            object = this.b;
            i.c(object, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            o.a(object);
            return object.invoke(this.c, this);
        }
        if (n2 != 1) throw new IllegalStateException("This coroutine had already completed".toString());
        this.a = 2;
        com.github.catvod.spider.merge.xc.a.a.C(object);
        return object;
    }
}

