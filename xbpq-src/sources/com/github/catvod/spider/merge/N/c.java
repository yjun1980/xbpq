package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class c<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, cYh.d("38333423"));
    private volatile Object _cur = new e(8, false);

    public final boolean a(E e) {
        while (true) {
            e eVar = (e) this._cur;
            int a2 = eVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                e<E> e2 = eVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, e2) && atomicReferenceFieldUpdater.get(this) == eVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            e eVar = (e) this._cur;
            if (eVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e<E> e = eVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, e) && atomicReferenceFieldUpdater.get(this) == eVar) {
            }
        }
    }

    public final int c() {
        return ((e) this._cur).c();
    }

    public final E d() {
        while (true) {
            e eVar = (e) this._cur;
            E e = (E) eVar.f();
            if (e != e.g) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            e<E> e2 = eVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, e2) && atomicReferenceFieldUpdater.get(this) == eVar) {
            }
        }
    }
}
