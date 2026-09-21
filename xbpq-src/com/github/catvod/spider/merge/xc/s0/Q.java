/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.d0.f;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.F;
import com.github.catvod.spider.merge.xc.s0.J;
import com.github.catvod.spider.merge.xc.s0.P;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.r0;
import com.github.catvod.spider.merge.xc.t0.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class Q
extends S
implements J {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile = 0;
    private volatile Object _queue$volatile;

    @Override
    public final void d(i i2, Runnable runnable) {
        this.n(runnable);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public final long k() {
        if (this.l()) {
            return 0L;
        }
        Object object = (P)h.get(this);
        block0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object v2 = atomicReferenceFieldUpdater.get(this);
            object = null;
            boolean bl = true;
            do {
                block6: {
                    block5: {
                        block9: {
                            block7: {
                                block8: {
                                    if (!bl || (bl = false)) break block5;
                                    if (v2 == null) break block6;
                                    if (!(v2 instanceof t)) break block7;
                                    object = (t)v2;
                                    Object object2 = ((t)object).d();
                                    if (object2 == t.g) break block8;
                                    object = (Runnable)object2;
                                    break block6;
                                }
                                object = ((t)object).c();
                                break block9;
                            }
                            if (v2 != E.b) break block5;
                            break block6;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, v2, object) && atomicReferenceFieldUpdater.get(this) == v2) {
                        }
                        continue block0;
                    }
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, v2, null)) continue;
                    object = (Runnable)v2;
                }
                if (object != null) {
                    object.run();
                    return 0L;
                }
                return this.o();
            } while (atomicReferenceFieldUpdater.get(this) == v2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void m() {
        r0.a.set(null);
        i.set(this, 1);
        boolean bl = D.a;
        block0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object v2 = atomicReferenceFieldUpdater.get(this);
            Object object = E.b;
            if (v2 != null) {
                if (v2 instanceof t) {
                    ((t)v2).b();
                    break;
                }
                if (v2 == object) break;
                object = new t(8, true);
                ((t)object).a((Runnable)v2);
            } else {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, object)) {
                    if (atomicReferenceFieldUpdater.get(this) == null) continue;
                    continue block0;
                }
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v2, object)) {
                if (atomicReferenceFieldUpdater.get(this) == v2) continue;
                continue block0;
            }
            break;
        }
        while (this.k() <= 0L) {
        }
        System.nanoTime();
        P p2 = (P)h.get(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void n(Runnable runnable) {
        block0: while (true) {
            t t2;
            Object v2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            block10: {
                block5: {
                    block9: {
                        block6: {
                            block7: {
                                block8: {
                                    atomicReferenceFieldUpdater = g;
                                    v2 = atomicReferenceFieldUpdater.get(this);
                                    if (i.get(this) != 0) break block5;
                                    if (v2 == null) break block6;
                                    if (!(v2 instanceof t)) break block7;
                                    t2 = (t)v2;
                                    int n2 = t2.a(runnable);
                                    if (n2 == 0) break;
                                    if (n2 == 1) break block8;
                                    if (n2 != 2) {
                                        continue;
                                    }
                                    break block5;
                                }
                                t2 = t2.c();
                                break block9;
                            }
                            if (v2 == E.b) break block5;
                            t2 = new t(8, true);
                            t2.a((Runnable)v2);
                            t2.a(runnable);
                            break block10;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            if (atomicReferenceFieldUpdater.get(this) == null) continue;
                            continue block0;
                        }
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, v2, t2) && atomicReferenceFieldUpdater.get(this) == v2) {
                    }
                    continue;
                }
                F.j.n(runnable);
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v2, t2)) {
                if (atomicReferenceFieldUpdater.get(this) == v2) continue;
                continue block0;
            }
            break;
        }
        runnable = this.i();
        if (Thread.currentThread() == runnable) return;
        LockSupport.unpark((Thread)runnable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long o() {
        Object object = this.e;
        if (object != null) {
            if (!((f)object).isEmpty()) return 0L;
        }
        long l2 = Long.MAX_VALUE;
        if (l2 == 0L) {
            return 0L;
        }
        object = g.get(this);
        if (object != null) {
            if (object instanceof t) {
                l2 = t.f.get(object = (t)object);
                if ((int)(0x3FFFFFFFL & l2) != (int)((l2 & 0xFFFFFFFC0000000L) >> 30)) {
                    return 0L;
                }
            } else {
                if (object != E.b) return 0L;
                return Long.MAX_VALUE;
            }
        }
        object = (P)h.get(this);
        return Long.MAX_VALUE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean p() {
        Object object = this.e;
        boolean bl = true;
        boolean bl2 = object != null ? ((f)object).isEmpty() : true;
        if (!bl2) {
            return false;
        }
        object = (P)h.get(this);
        object = g.get(this);
        if (object == null) {
            return bl;
        }
        if (object instanceof t) {
            long l2 = t.f.get(object = (t)object);
            if ((int)(0x3FFFFFFFL & l2) != (int)((l2 & 0xFFFFFFFC0000000L) >> 30)) return false;
            return bl;
        }
        if (object != E.b) return false;
        return bl;
    }
}

