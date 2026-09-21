/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.W;
import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.n;
import com.github.catvod.spider.merge.n.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class f
extends a {
    final AtomicReferenceFieldUpdater<n, Thread> a;
    final AtomicReferenceFieldUpdater<n, n> b;
    final AtomicReferenceFieldUpdater<o, n> c;
    final AtomicReferenceFieldUpdater<o, e> d;
    final AtomicReferenceFieldUpdater<o, Object> e;

    f(AtomicReferenceFieldUpdater<n, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<n, n> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o, n> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o, Object> atomicReferenceFieldUpdater5) {
        super((W)null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    final boolean a(o<?> o2, e e2, e e3) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater<o, e> atomicReferenceFieldUpdater = this.d;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(o2, e2, e3)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(o2) == e2);
            bl = false;
        }
        return bl;
    }

    final boolean b(o<?> o2, Object object, Object object2) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater<o, Object> atomicReferenceFieldUpdater = this.e;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(o2, object, object2)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(o2) == object);
            bl = false;
        }
        return bl;
    }

    final boolean c(o<?> o2, n n2, n n3) {
        boolean bl;
        block1: {
            AtomicReferenceFieldUpdater<o, n> atomicReferenceFieldUpdater = this.c;
            do {
                if (!atomicReferenceFieldUpdater.compareAndSet(o2, n2, n3)) continue;
                bl = true;
                break block1;
            } while (atomicReferenceFieldUpdater.get(o2) == n2);
            bl = false;
        }
        return bl;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    final e f(o o2) {
        e e2 = com.github.catvod.spider.merge.n.e.d;
        return this.d.getAndSet(o2, e2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    final n g(o o2) {
        n n2 = n.c;
        return this.c.getAndSet(o2, n2);
    }

    @Override
    final void h(n n2, n n3) {
        this.b.lazySet(n2, n3);
    }

    @Override
    final void i(n n2, Thread thread) {
        this.a.lazySet(n2, thread);
    }
}

