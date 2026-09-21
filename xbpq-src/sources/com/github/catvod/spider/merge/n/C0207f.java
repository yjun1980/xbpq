package com.github.catvod.spider.merge.n;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0207f extends AbstractC0202a {
    final AtomicReferenceFieldUpdater<C0215n, Thread> a;
    final AtomicReferenceFieldUpdater<C0215n, C0215n> b;
    final AtomicReferenceFieldUpdater<AbstractC0216o, C0215n> c;
    final AtomicReferenceFieldUpdater<AbstractC0216o, C0206e> d;
    final AtomicReferenceFieldUpdater<AbstractC0216o, Object> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0207f(AtomicReferenceFieldUpdater<C0215n, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0215n, C0215n> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0216o, C0215n> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0216o, C0206e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0216o, Object> atomicReferenceFieldUpdater5) {
        super((W) null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean a(AbstractC0216o<?> abstractC0216o, C0206e c0206e, C0206e c0206e2) {
        AtomicReferenceFieldUpdater<AbstractC0216o, C0206e> atomicReferenceFieldUpdater = this.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0216o, c0206e, c0206e2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0216o) != c0206e) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean b(AbstractC0216o<?> abstractC0216o, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<AbstractC0216o, Object> atomicReferenceFieldUpdater = this.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0216o, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0216o) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final boolean c(AbstractC0216o<?> abstractC0216o, C0215n c0215n, C0215n c0215n2) {
        AtomicReferenceFieldUpdater<AbstractC0216o, C0215n> atomicReferenceFieldUpdater = this.c;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0216o, c0215n, c0215n2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0216o) != c0215n) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0206e f(AbstractC0216o abstractC0216o) {
        return this.d.getAndSet(abstractC0216o, C0206e.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final C0215n g(AbstractC0216o abstractC0216o) {
        return this.c.getAndSet(abstractC0216o, C0215n.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void h(C0215n c0215n, C0215n c0215n2) {
        this.b.lazySet(c0215n, c0215n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void i(C0215n c0215n, Thread thread) {
        this.a.lazySet(c0215n, thread);
    }
}
