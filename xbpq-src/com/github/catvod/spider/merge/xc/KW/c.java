/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.KW.a;
import com.github.catvod.spider.merge.xc.KW.b;
import com.github.catvod.spider.merge.xc.KW.f;
import com.github.catvod.spider.merge.xc.KW.i;
import com.github.catvod.spider.merge.xc.KW.j;
import com.github.catvod.spider.merge.xc.KW.k;
import com.github.catvod.spider.merge.xc.KW.l;
import com.github.catvod.spider.merge.xc.KW.n;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.t0.r;
import com.github.catvod.spider.merge.xc.t0.z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class c
implements Executor,
Closeable {
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final A k = new A(5, "NOT_IN_STACK");
    private volatile int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile long controlState$volatile;
    public final String d;
    public final f e;
    public final f f;
    public final z g;
    private volatile long parkedWorkersStack$volatile;

    public c(int n2, int n3, long l2, String charSequence) {
        this.a = n2;
        this.b = n3;
        this.c = l2;
        this.d = charSequence;
        if (n2 >= 1) {
            if (n3 >= n2) {
                if (n3 <= 0x1FFFFE) {
                    if (l2 > 0L) {
                        this.e = new f();
                        this.f = new f();
                        this.g = new z((n2 + 1) * 2);
                        this.controlState$volatile = (long)n2 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    charSequence = new StringBuilder("Idle worker keep alive time ");
                    ((StringBuilder)charSequence).append(l2);
                    ((StringBuilder)charSequence).append(" must be positive");
                    throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
                }
                charSequence = new StringBuilder("Max pool size ");
                ((StringBuilder)charSequence).append(n3);
                ((StringBuilder)charSequence).append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
            }
            charSequence = new StringBuilder("Max pool size ");
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append(" should be greater than or equals to core pool size ");
            ((StringBuilder)charSequence).append(n2);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        charSequence = new StringBuilder("Core pool size ");
        ((StringBuilder)charSequence).append(n2);
        ((StringBuilder)charSequence).append(" should be at least 1");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        z z2 = this.g;
        synchronized (z2) {
            Throwable throwable2;
            block14: {
                block13: {
                    int n2;
                    long l2;
                    AtomicLongFieldUpdater atomicLongFieldUpdater;
                    int n3;
                    block12: {
                        int n4;
                        block11: {
                            block10: {
                                try {
                                    n3 = j.get(this);
                                    if (n3 == 0) break block10;
                                }
                                catch (Throwable throwable2) {}
                                return -1;
                            }
                            atomicLongFieldUpdater = i;
                            l2 = atomicLongFieldUpdater.get(this);
                            n4 = (int)(l2 & 0x1FFFFFL);
                            n3 = n2 = n4 - (int)((l2 & 0x3FFFFE00000L) >> 21);
                            if (n2 < 0) {
                                n3 = 0;
                            }
                            n2 = this.a;
                            if (n3 < n2) break block11;
                            return 0;
                        }
                        n2 = this.b;
                        if (n4 < n2) break block12;
                        return 0;
                    }
                    n2 = (int)(atomicLongFieldUpdater.get(this) & 0x1FFFFFL) + 1;
                    if (n2 <= 0 || this.g.b(n2) != null) break block13;
                    Object object = new a(this, n2);
                    this.g.c(n2, (a)object);
                    l2 = atomicLongFieldUpdater.incrementAndGet(this);
                    if (n2 == (int)(0x1FFFFFL & l2)) {
                        // MONITOREXIT @DISABLED, blocks:[6, 8] lbl32 : MonitorExitStatement: MONITOREXIT : var6_1
                        ((Thread)object).start();
                        return n3 + 1;
                    }
                    object = new IllegalArgumentException("Failed requirement.".toString());
                    throw object;
                    break block14;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.".toString());
                throw illegalArgumentException;
            }
            throw throwable2;
        }
    }

    public final void b(Runnable runnable, j object, boolean bl) {
        boolean bl2;
        Object object2;
        l.f.getClass();
        long l2 = System.nanoTime();
        if (runnable instanceof i) {
            runnable = (i)runnable;
            ((i)runnable).a = l2;
            ((i)runnable).b = object;
        } else {
            runnable = new k(runnable, l2, (j)object);
        }
        int n2 = ((i)runnable).b.a;
        boolean bl3 = false;
        n2 = n2 == 1 ? 1 : 0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        l2 = n2 != 0 ? atomicLongFieldUpdater.addAndGet(this, 0x200000L) : 0L;
        object = Thread.currentThread();
        object = object instanceof a ? (a)object : null;
        if (object == null || !com.github.catvod.spider.merge.mI.i.a(((a)object).h, this)) {
            object = null;
        }
        if (object != null && (object2 = ((a)object).c) != com.github.catvod.spider.merge.xc.KW.b.e && (((i)runnable).b.a != 0 || object2 != com.github.catvod.spider.merge.xc.KW.b.b)) {
            ((a)object).g = true;
            object2 = ((a)object).a;
            if (bl) {
                runnable = ((n)object2).a((i)runnable);
            } else {
                object2.getClass();
                runnable = (i)n.b.getAndSet(object2, runnable);
                runnable = runnable == null ? null : ((n)object2).a((i)runnable);
            }
        }
        if (runnable != null && !(bl2 = ((i)runnable).b.a == 1 ? this.f.a(runnable) : this.e.a(runnable))) {
            throw new RejectedExecutionException(m.h(new StringBuilder(), this.d, " was terminated"));
        }
        boolean bl4 = bl3;
        if (bl) {
            bl4 = bl3;
            if (object != null) {
                bl4 = true;
            }
        }
        if (n2 != 0) {
            if (!(bl4 || this.e() || this.d(l2))) {
                this.e();
            }
        } else {
            if (bl4) {
                return;
            }
            if (!this.e() && !this.d(atomicLongFieldUpdater.get(this))) {
                this.e();
            }
        }
    }

    public final void c(a a2, int n2, int n3) {
        long l2;
        long l3;
        int n4;
        block0: do {
            int n5;
            l3 = h.get(this);
            n4 = n5 = (int)(0x1FFFFFL & l3);
            if (n5 != n2) continue;
            if (n3 == 0) {
                Object object = a2.c();
                while (true) {
                    if (object == k) {
                        n4 = -1;
                        continue block0;
                    }
                    if (object == null) {
                        n4 = 0;
                        continue block0;
                    }
                    n4 = ((a)(object = (a)object)).b();
                    if (n4 != 0) continue block0;
                    object = ((a)object).c();
                }
            }
            n4 = n3;
        } while (n4 < 0 || !h.compareAndSet(this, l3, 0x200000L + l3 & 0xFFFFFFFFFFE00000L | (l2 = (long)n4)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void close() {
        Object object;
        boolean bl;
        Object object2;
        Object object3;
        block18: {
            if (!j.compareAndSet(this, 0, 1)) {
                return;
            }
            object3 = Thread.currentThread();
            object3 = object3 instanceof a ? (a)object3 : null;
            object2 = object3 != null && com.github.catvod.spider.merge.mI.i.a(((a)object3).h, this) ? object3 : null;
            object3 = this.g;
            // MONITORENTER : object3
            long l2 = i.get(this);
            int n2 = (int)(l2 & 0x1FFFFFL);
            // MONITOREXIT : object3
            if (1 > n2) break block18;
            int n3 = 1;
            while (true) {
                object3 = this.g.b(n3);
                com.github.catvod.spider.merge.mI.i.b(object3);
                object3 = (a)object3;
                if (object3 != object2) {
                    while (((Thread)object3).getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark((Thread)object3);
                        ((Thread)object3).join(10000L);
                    }
                    bl = D.a;
                    object = ((a)object3).a;
                    object3 = this.f;
                    object.getClass();
                    i i2 = n.b.getAndSet(object, null);
                    if (i2 != null) {
                        ((r)object3).a(i2);
                    }
                    while ((i2 = ((n)object).b()) != null) {
                        ((r)object3).a(i2);
                    }
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        this.f.b();
        this.e.b();
        while (true) {
            block20: {
                block19: {
                    if (object2 == null) break block19;
                    object3 = object = ((a)object2).a(true);
                    if (object != null) break block20;
                }
                object3 = object = (i)this.e.d();
                if (object == null) {
                    object3 = object = (i)this.f.d();
                    if (object == null) {
                        if (object2 != null) {
                            ((a)object2).h(com.github.catvod.spider.merge.xc.KW.b.e);
                        }
                        bl = D.a;
                        h.set(this, 0L);
                        i.set(this, 0L);
                        return;
                    }
                }
            }
            try {
                object3.run();
            }
            catch (Throwable throwable) {
                object = Thread.currentThread();
                ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
                continue;
            }
            break;
        }
    }

    public final boolean d(long l2) {
        int n2;
        int n3 = n2 = (int)(0x1FFFFFL & l2) - (int)((l2 & 0x3FFFFE00000L) >> 21);
        if (n2 < 0) {
            n3 = 0;
        }
        if (n3 < (n2 = this.a)) {
            n3 = this.a();
            if (n3 == 1 && n2 > 1) {
                this.a();
            }
            if (n3 > 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean e() {
        block0: while (true) {
            block6: {
                if ((var5_4 = (a)this.g.b(var1_1 = (int)(0x1FFFFFL & (var2_2 = (var6_5 = com.github.catvod.spider.merge.xc.KW.c.h).get(this))))) != null) break block6;
                var4_3 = null;
                ** GOTO lbl22
            }
            var4_3 = var5_4.c();
            while (true) {
                block10: {
                    block8: {
                        block9: {
                            block7: {
                                if (var4_3 != (var7_6 = com.github.catvod.spider.merge.xc.KW.c.k)) break block7;
                                var1_1 = -1;
                                break block8;
                            }
                            if (var4_3 != null) break block9;
                            var1_1 = 0;
                            break block8;
                        }
                        var1_1 = (var4_3 = (a)var4_3).b();
                        if (var1_1 == 0) break block10;
                    }
                    if (var1_1 < 0 || !var6_5.compareAndSet(this, var2_2, 0x200000L + var2_2 & -2097152L | (long)var1_1)) continue block0;
                    var5_4.g(var7_6);
                    var4_3 = var5_4;
lbl22:
                    // 2 sources

                    if (var4_3 == null) {
                        return false;
                    }
                    if (com.github.catvod.spider.merge.xc.KW.a.i.compareAndSet(var4_3, -1, 0)) ** break;
                    continue block0;
                    LockSupport.unpark((Thread)var4_3);
                    return true;
                }
                var4_3 = var4_3.c();
            }
            break;
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        this.b(runnable, l.g, false);
    }

    public final String toString() {
        int n2;
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = this.g;
        int n3 = ((z)object).a();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (n2 = 1; n2 < n3; ++n2) {
            int n9;
            int n10;
            int n11;
            int n12;
            a a2 = (a)((z)object).b(n2);
            if (a2 == null) {
                n12 = n4;
                n11 = n5;
                n10 = n6;
                n9 = n8;
            } else {
                Object object2 = a2.a;
                object2.getClass();
                int n13 = n.b.get(object2) != null ? n.c.get(object2) - n.d.get(object2) + 1 : n.c.get(object2) - n.d.get(object2);
                n11 = a2.c.ordinal();
                if (n11 != 0) {
                    if (n11 != 1) {
                        if (n11 != 2) {
                            if (n11 != 3) {
                                if (n11 != 4) {
                                    n12 = n4;
                                    n11 = n5;
                                    n10 = n6;
                                    n9 = n8;
                                } else {
                                    n9 = n8 + 1;
                                    n12 = n4;
                                    n11 = n5;
                                    n10 = n6;
                                }
                            } else {
                                int n14 = n7 + 1;
                                n12 = n4;
                                n11 = n5;
                                n10 = n6;
                                n7 = n14;
                                n9 = n8;
                                if (n13 > 0) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append(n13);
                                    ((StringBuilder)object2).append('d');
                                    arrayList.add(((StringBuilder)object2).toString());
                                    n12 = n4;
                                    n11 = n5;
                                    n10 = n6;
                                    n7 = n14;
                                    n9 = n8;
                                }
                            }
                        } else {
                            n10 = n6 + 1;
                            n12 = n4;
                            n11 = n5;
                            n9 = n8;
                        }
                    } else {
                        n11 = n5 + 1;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(n13);
                        ((StringBuilder)object2).append('b');
                        arrayList.add(((StringBuilder)object2).toString());
                        n12 = n4;
                        n10 = n6;
                        n9 = n8;
                    }
                } else {
                    n12 = n4 + 1;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(n13);
                    ((StringBuilder)object2).append('c');
                    arrayList.add(((StringBuilder)object2).toString());
                    n9 = n8;
                    n10 = n6;
                    n11 = n5;
                }
            }
            n4 = n12;
            n5 = n11;
            n6 = n10;
            n8 = n9;
        }
        long l2 = i.get(this);
        object = new StringBuilder();
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append('@');
        ((StringBuilder)object).append(E.c(this));
        ((StringBuilder)object).append("[Pool Size {core = ");
        n2 = this.a;
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", max = ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append("}, Worker States {CPU = ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(", blocking = ");
        ((StringBuilder)object).append(n5);
        ((StringBuilder)object).append(", parked = ");
        ((StringBuilder)object).append(n6);
        ((StringBuilder)object).append(", dormant = ");
        ((StringBuilder)object).append(n7);
        ((StringBuilder)object).append(", terminated = ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append("}, running workers queues = ");
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", global CPU queue size = ");
        ((StringBuilder)object).append(this.e.c());
        ((StringBuilder)object).append(", global blocking queue size = ");
        ((StringBuilder)object).append(this.f.c());
        ((StringBuilder)object).append(", Control State {created workers= ");
        ((StringBuilder)object).append((int)(0x1FFFFFL & l2));
        ((StringBuilder)object).append(", blocking tasks = ");
        ((StringBuilder)object).append((int)((0x3FFFFE00000L & l2) >> 21));
        ((StringBuilder)object).append(", CPUs acquired = ");
        ((StringBuilder)object).append(n2 - (int)((l2 & 0x7FFFFC0000000000L) >> 42));
        ((StringBuilder)object).append("}]");
        return ((StringBuilder)object).toString();
    }
}

