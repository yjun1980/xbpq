/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.i;
import com.github.catvod.spider.merge.L.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.L.o;
import com.github.catvod.spider.merge.L.p;
import com.github.catvod.spider.merge.N.e;
import com.github.catvod.spider.merge.N.j;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class n
extends o {
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("38213434223F"));
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, cYh.d("3834243D36230234"));
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    private final boolean j(Runnable runnable) {
        while (true) {
            int n2;
            block10: {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
                e<Runnable> e2;
                Object object = this._queue;
                boolean bl = this.k();
                int n3 = 0;
                n2 = 0;
                if (bl) {
                    return false;
                }
                if (object == null) {
                    object = g;
                    do {
                        if (!((AtomicReferenceFieldUpdater)object).compareAndSet(this, null, runnable)) continue;
                        n2 = 1;
                        break;
                    } while (((AtomicReferenceFieldUpdater)object).get(this) == null);
                    if (n2 == 0) continue;
                    return true;
                }
                if (object instanceof e) {
                    e2 = (e<Runnable>)object;
                    n2 = e2.a(runnable);
                    if (n2 != 0) {
                        if (n2 != 1) {
                            if (n2 != 2) continue;
                            return false;
                        }
                        atomicReferenceFieldUpdater = g;
                        e2 = e2.e();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, object, e2) && atomicReferenceFieldUpdater.get(this) == object) {
                        }
                        continue;
                    }
                    return true;
                }
                if (object == p.a()) {
                    return false;
                }
                e2 = new e<Runnable>(8, true);
                e2.a((Runnable)object);
                e2.a(runnable);
                atomicReferenceFieldUpdater = g;
                do {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, object, e2)) continue;
                    n2 = 1;
                    break block10;
                } while (atomicReferenceFieldUpdater.get(this) == object);
                n2 = n3;
            }
            if (n2 != 0) break;
        }
        return true;
    }

    private final boolean k() {
        return this._isCompleted != 0;
    }

    public final void i(Runnable runnable) {
        if (this.j(runnable)) {
            runnable = this.h();
            if (Thread.currentThread() != runnable) {
                LockSupport.unpark((Thread)runnable);
            }
        } else {
            i.j.i(runnable);
        }
    }

    protected final boolean l() {
        boolean bl;
        block7: {
            block5: {
                Object object;
                block6: {
                    boolean bl2 = this.f();
                    bl = false;
                    if (!bl2) {
                        return false;
                    }
                    object = (m)this._delayed;
                    if (object != null && !((j)object).b()) {
                        return false;
                    }
                    object = this._queue;
                    if (object == null) break block5;
                    if (!(object instanceof e)) break block6;
                    bl = ((e)object).d();
                    break block7;
                }
                if (object != p.a()) break block7;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long m() {
        Object object;
        long l2;
        Object var10_4;
        long l3;
        block19: {
            boolean bl;
            boolean bl2 = this.g();
            l3 = 0L;
            if (bl2) {
                return 0L;
            }
            e e2 = (m)this._delayed;
            var10_4 = null;
            if (e2 != null && !((j)((Object)e2)).b()) {
                l2 = System.nanoTime();
                do {
                    synchronized (e2) {
                        object = ((j)((Object)e2)).a();
                        if (object != null) {
                            object = (l)object;
                            bl = l2 - ((l)object).d >= 0L;
                            bl2 = bl ? this.j((Runnable)object) : false;
                            object = bl2 ? ((j)((Object)e2)).c() : null;
                            continue;
                        }
                    }
                    object = null;
                } while ((l)object != null);
            }
            while (true) {
                block20: {
                    block23: {
                        Object object2;
                        block22: {
                            block21: {
                                if ((object = this._queue) == null) {
                                    object = var10_4;
                                    break block19;
                                }
                                if (!(object instanceof e)) break block21;
                                e2 = (e)object;
                                object2 = e2.f();
                                if (object2 != e.g) {
                                    object = (Runnable)object2;
                                    break block19;
                                }
                                object2 = g;
                                e2 = e2.e();
                                break block22;
                            }
                            if (object == p.a()) {
                                object = var10_4;
                                break block19;
                            }
                            break block23;
                        }
                        while (!((AtomicReferenceFieldUpdater)object2).compareAndSet(this, object, e2) && ((AtomicReferenceFieldUpdater)object2).get(this) == object) {
                        }
                        continue;
                    }
                    e2 = g;
                    do {
                        if (!((AtomicReferenceFieldUpdater)((Object)e2)).compareAndSet(this, object, null)) continue;
                        bl = true;
                        break block20;
                    } while (((AtomicReferenceFieldUpdater)((Object)e2)).get(this) == object);
                    bl = false;
                }
                if (bl) break;
            }
            object = (Runnable)object;
        }
        if (object != null) {
            object.run();
            return 0L;
        }
        if (super.d() == 0L) {
            return l3;
        }
        object = this._queue;
        long l4 = Long.MAX_VALUE;
        if (object != null) {
            if (!(object instanceof e)) {
                l2 = l3;
                if (object != p.a()) return l2;
                return l4;
            }
            if (!((e)object).d()) {
                return l3;
            }
        }
        object = (m)this._delayed;
        l2 = l4;
        if (object == null) return l2;
        synchronized (object) {
            var10_4 = ((j)object).a();
        }
        object = var10_4;
        l2 = l4;
        if (object == null) return l2;
        l2 = l4 = ((l)object).d - System.nanoTime();
        if (l4 >= 0L) return l2;
        return l3;
    }

    protected final void n() {
        this._queue = null;
        this._delayed = null;
    }
}

