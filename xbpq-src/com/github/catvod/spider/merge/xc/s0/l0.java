/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.t0.a;
import com.github.catvod.spider.merge.xc.t0.b;
import com.github.catvod.spider.merge.xc.t0.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l0
extends b {
    public final q b;
    public q c;
    public final m0 d;
    public final Object e;

    public l0(q q2, m0 m02, W w2) {
        this.d = m02;
        this.e = w2;
        this.b = q2;
    }

    @Override
    public final void b(Object object, Object object2) {
        q q2 = (q)object;
        boolean bl = object2 == null;
        object2 = this.b;
        object = bl ? object2 : this.c;
        if (object != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q.a;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(q2, this, object)) continue;
                if (!bl) break;
                object = this.c;
                i.b(object);
                ((q)object2).g((q)object);
                break;
            } while (atomicReferenceFieldUpdater.get(q2) == this);
        }
    }

    @Override
    public final A c(Object object) {
        object = (q)object;
        object = this.d.s() == this.e ? null : com.github.catvod.spider.merge.xc.t0.a.d;
        return object;
    }
}

