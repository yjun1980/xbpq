/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.a;
import com.github.catvod.spider.merge.n.u;
import com.github.catvod.spider.merge.n.x;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class v
extends a {
    final AtomicReferenceFieldUpdater<x<?>, Set<Throwable>> a;
    final AtomicIntegerFieldUpdater<x<?>> b;

    v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((u)null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    final void d(x x2, Set set) {
        AtomicReferenceFieldUpdater<x<?>, Set<Throwable>> atomicReferenceFieldUpdater = this.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(x2, null, set) && atomicReferenceFieldUpdater.get(x2) == null) {
        }
    }

    final int e(x<?> x2) {
        return this.b.decrementAndGet(x2);
    }
}

