/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.N.e;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class c<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, cYh.d("38333423"));
    private volatile Object _cur = new e(8, false);

    public final boolean a(E e2) {
        e e3;
        int n2;
        while ((n2 = (e3 = (e)this._cur).a(e2)) != 0) {
            if (n2 != 1) {
                if (n2 != 2) continue;
                return false;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e e4 = e3.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e3, e4) && atomicReferenceFieldUpdater.get(this) == e3) {
            }
        }
        return true;
    }

    public final void b() {
        e e2;
        while (!(e2 = (e)this._cur).b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e e3 = e2.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e2, e3) && atomicReferenceFieldUpdater.get(this) == e2) {
            }
        }
        return;
    }

    public final int c() {
        return ((e)this._cur).c();
    }

    public final E d() {
        e e2;
        Object object;
        while ((object = (e2 = (e)this._cur).f()) == e.g) {
            object = a;
            e e3 = e2.e();
            while (!((AtomicReferenceFieldUpdater)object).compareAndSet(this, e2, e3) && ((AtomicReferenceFieldUpdater)object).get(this) == e2) {
            }
        }
        return (E)object;
    }
}

