/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.e;
import com.github.catvod.spider.merge.xc.e0.f;
import com.github.catvod.spider.merge.xc.g0.a;
import com.github.catvod.spider.merge.xc.g0.b;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.o0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class c
extends a {
    public final com.github.catvod.spider.merge.xc.e0.i a;
    public transient d b;

    public c(d d2) {
        com.github.catvod.spider.merge.xc.e0.i i2 = d2 != null ? d2.getContext() : null;
        this(d2, i2);
    }

    public c(d d2, com.github.catvod.spider.merge.xc.e0.i i2) {
        super(d2);
        this.a = i2;
    }

    @Override
    public final com.github.catvod.spider.merge.xc.e0.i getContext() {
        com.github.catvod.spider.merge.xc.e0.i i2 = this.a;
        i.b(i2);
        return i2;
    }

    @Override
    public final void releaseIntercepted() {
        d d2 = this.b;
        if (d2 != null && d2 != this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Object object = this.a;
            i.b(object);
            object = object.b(e.a);
            i.b(object);
            object = (f)object;
            d2 = (com.github.catvod.spider.merge.xc.t0.i)d2;
            while (((AtomicReferenceFieldUpdater)(object = com.github.catvod.spider.merge.xc.t0.i.h)).get(d2) == com.github.catvod.spider.merge.xc.t0.a.c) {
            }
            if ((d2 = (d2 = ((AtomicReferenceFieldUpdater)object).get(d2)) instanceof j ? (j)d2 : null) != null && (object = (M)(atomicReferenceFieldUpdater = j.h).get(d2)) != null) {
                object.b();
                atomicReferenceFieldUpdater.set(d2, o0.a);
            }
        }
        this.b = com.github.catvod.spider.merge.xc.g0.b.a;
    }
}

