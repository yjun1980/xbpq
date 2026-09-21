package com.github.catvod.spider.merge.n;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0222v extends AbstractC0202a {
    final AtomicReferenceFieldUpdater<x<?>, Set<Throwable>> a;
    final AtomicIntegerFieldUpdater<x<?>> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0222v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((C0221u) null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void d(x xVar, Set set) {
        AtomicReferenceFieldUpdater<x<?>, Set<Throwable>> atomicReferenceFieldUpdater = this.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(xVar, null, set) && atomicReferenceFieldUpdater.get(xVar) == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final int e(x<?> xVar) {
        return this.b.decrementAndGet(xVar);
    }
}
