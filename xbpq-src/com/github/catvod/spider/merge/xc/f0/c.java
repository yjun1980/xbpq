/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.o;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.i;

public final class c
extends com.github.catvod.spider.merge.xc.g0.c {
    public int c;
    public final p d;
    public final Object e;

    public c(d d2, i i2, p p2, Object object) {
        this.d = p2;
        this.e = object;
        com.github.catvod.spider.merge.mI.i.c(d2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(d2, i2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object invokeSuspend(Object object) {
        int n2 = this.c;
        if (n2 == 0) {
            this.c = 1;
            com.github.catvod.spider.merge.xc.a.a.C(object);
            object = this.d;
            com.github.catvod.spider.merge.mI.i.c(object, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            o.a(object);
            return object.invoke(this.e, this);
        }
        if (n2 != 1) throw new IllegalStateException("This coroutine had already completed".toString());
        this.c = 2;
        com.github.catvod.spider.merge.xc.a.a.C(object);
        return object;
    }
}

