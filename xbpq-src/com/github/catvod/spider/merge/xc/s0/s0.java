/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.A;
import com.github.catvod.spider.merge.xc.s0.w;

public final class s0
extends w {
    public static final int c = 0;

    static {
        new s0();
    }

    @Override
    public final void d(i i2, Runnable runnable) {
        m.l(i2.b(A.c));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

