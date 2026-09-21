package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class n extends o {
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("38213434223F"));
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("3834243D36230234"));
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    private final boolean j(Runnable runnable) {
        com.github.catvod.spider.merge.N.g gVar;
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (k()) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof com.github.catvod.spider.merge.N.e) {
                com.github.catvod.spider.merge.N.e eVar = (com.github.catvod.spider.merge.N.e) obj;
                int a = eVar.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                    com.github.catvod.spider.merge.N.e e = eVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a == 2) {
                    return false;
                }
            } else {
                gVar = p.b;
                if (obj == gVar) {
                    return false;
                }
                com.github.catvod.spider.merge.N.e eVar2 = new com.github.catvod.spider.merge.N.e(8, true);
                eVar2.a((Runnable) obj);
                eVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = g;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, eVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    private final boolean k() {
        return this._isCompleted;
    }

    public final void i(Runnable runnable) {
        if (j(runnable)) {
            Thread h2 = h();
            if (Thread.currentThread() != h2) {
                LockSupport.unpark(h2);
                return;
            }
            return;
        }
        i.j.i(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean l() {
        com.github.catvod.spider.merge.N.g gVar;
        if (!f()) {
            return false;
        }
        m mVar = (m) this._delayed;
        if (mVar != null && !mVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof com.github.catvod.spider.merge.N.e) {
                return ((com.github.catvod.spider.merge.N.e) obj).d();
            }
            gVar = p.b;
            if (obj != gVar) {
                return false;
            }
        }
        return true;
    }

    public final long m() {
        l a;
        com.github.catvod.spider.merge.N.g gVar;
        com.github.catvod.spider.merge.N.g gVar2;
        boolean z;
        com.github.catvod.spider.merge.N.k kVar;
        if (g()) {
            return 0L;
        }
        m mVar = (m) this._delayed;
        Runnable runnable = null;
        if (mVar != null && !mVar.b()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (mVar) {
                    l a2 = mVar.a();
                    if (a2 != null) {
                        l lVar = a2;
                        kVar = ((nanoTime - lVar.d) > 0L ? 1 : ((nanoTime - lVar.d) == 0L ? 0 : -1)) >= 0 ? j(lVar) : false ? mVar.c() : null;
                    } else {
                        kVar = null;
                    }
                }
            } while (((l) kVar) != null);
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            }
            if (obj instanceof com.github.catvod.spider.merge.N.e) {
                com.github.catvod.spider.merge.N.e eVar = (com.github.catvod.spider.merge.N.e) obj;
                Object f = eVar.f();
                if (f != com.github.catvod.spider.merge.N.e.g) {
                    runnable = (Runnable) f;
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                com.github.catvod.spider.merge.N.e e = eVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                gVar2 = p.b;
                if (obj == gVar2) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        if (super.d() == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        long j = Long.MAX_VALUE;
        if (obj2 != null) {
            if (!(obj2 instanceof com.github.catvod.spider.merge.N.e)) {
                gVar = p.b;
                if (obj2 != gVar) {
                    return 0L;
                }
                return j;
            }
            if (!((com.github.catvod.spider.merge.N.e) obj2).d()) {
                return 0L;
            }
        }
        m mVar2 = (m) this._delayed;
        if (mVar2 != null) {
            synchronized (mVar2) {
                a = mVar2.a();
            }
            l lVar2 = a;
            if (lVar2 != null) {
                j = lVar2.d - System.nanoTime();
                if (j < 0) {
                    return 0L;
                }
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        this._queue = null;
        this._delayed = null;
    }
}
