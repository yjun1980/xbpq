/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.g.c;
import com.github.catvod.spider.merge.xc.g.f;
import com.github.catvod.spider.merge.xc.g.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d
extends b {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override
    public final void G(f f2, f f4) {
        this.c.lazySet(f2, f4);
    }

    @Override
    public final void H(f f2, Thread thread) {
        this.b.lazySet(f2, thread);
    }

    @Override
    public final boolean i(g g2, c c2, c c3) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                if (!(atomicReferenceFieldUpdater = this.e).compareAndSet(g2, c2, c3)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(g2) == c2);
            bl = false;
        }
        return bl;
    }

    @Override
    public final boolean j(g g2, Object object, Object object2) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                if (!(atomicReferenceFieldUpdater = this.f).compareAndSet(g2, object, object2)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(g2) == object);
            bl = false;
        }
        return bl;
    }

    @Override
    public final boolean k(g g2, f f2, f f4) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                if (!(atomicReferenceFieldUpdater = this.d).compareAndSet(g2, f2, f4)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(g2) == f2);
            bl = false;
        }
        return bl;
    }
}

