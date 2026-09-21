/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.c;
import com.github.catvod.spider.merge.xc.KW.l;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.T;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class h
extends T {
    public final c c;

    public h(int n2, int n3, long l2, String string) {
        this.c = new c(n2, n3, l2, string);
    }

    @Override
    public final void d(i object, Runnable runnable) {
        object = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = com.github.catvod.spider.merge.xc.KW.c.h;
        ((c)object).b(runnable, l.g, false);
    }
}

