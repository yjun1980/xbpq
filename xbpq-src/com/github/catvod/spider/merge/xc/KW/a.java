/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.KW;

import com.github.catvod.spider.merge.xc.KW.b;
import com.github.catvod.spider.merge.xc.KW.c;
import com.github.catvod.spider.merge.xc.KW.i;
import com.github.catvod.spider.merge.xc.KW.l;
import com.github.catvod.spider.merge.xc.KW.n;
import com.github.catvod.spider.merge.xc.s0.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class a
extends Thread {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final n a;
    public final com.github.catvod.spider.merge.mI.l b;
    public b c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final c h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c c2, int n2) {
        this.h = c2;
        this.setDaemon(true);
        this.setContextClassLoader(c2.getClass().getClassLoader());
        this.a = new n();
        this.b = new com.github.catvod.spider.merge.mI.l();
        this.c = com.github.catvod.spider.merge.xc.KW.b.d;
        this.nextParkedWorker = com.github.catvod.spider.merge.xc.KW.c.k;
        int n3 = (int)System.nanoTime();
        if (n3 == 0) {
            n3 = 42;
        }
        this.f = n3;
        this.f(n2);
    }

    public final i a(boolean bl) {
        Object object;
        block15: {
            block16: {
                block14: {
                    Object object2 = this.c;
                    object = com.github.catvod.spider.merge.xc.KW.b.a;
                    Object object3 = null;
                    n n2 = this.a;
                    int n3 = 1;
                    c c2 = this.h;
                    if (object2 != object) {
                        long l2;
                        c c3;
                        object2 = com.github.catvod.spider.merge.xc.KW.c.i;
                        do {
                            block13: {
                                if ((int)((0x7FFFFC0000000000L & (l2 = ((AtomicLongFieldUpdater)object2).get(c3 = this.h))) >> 42) != 0) continue;
                                n2.getClass();
                                block1: while ((object = (i)((AtomicReferenceFieldUpdater)(object2 = n.b)).get(n2)) != null && ((i)object).b.a == 1) {
                                    while (!((AtomicReferenceFieldUpdater)object2).compareAndSet(n2, object, null)) {
                                        if (((AtomicReferenceFieldUpdater)object2).get(n2) == object) continue;
                                        continue block1;
                                    }
                                    break block13;
                                }
                                int n4 = n.d.get(n2);
                                n3 = n.c.get(n2);
                                do {
                                    object = object3;
                                    if (n4 == n3) break;
                                    if (n.e.get(n2) != 0) continue;
                                    object = object3;
                                    break;
                                } while ((object = n2.c(--n3, true)) == null);
                            }
                            object3 = object;
                            if (object == null) {
                                object = (i)c2.f.d();
                                object3 = object;
                                if (object == null) {
                                    object3 = this.i(1);
                                }
                            }
                            return object3;
                        } while (!com.github.catvod.spider.merge.xc.KW.c.i.compareAndSet(c3, l2, l2 - 0x40000000000L));
                        this.c = object;
                    }
                    if (!bl) break block14;
                    if (this.d(c2.a * 2) != 0) {
                        n3 = 0;
                    }
                    if (n3 != 0 && (object = this.e()) != null) break block15;
                    n2.getClass();
                    object3 = n.b.getAndSet(n2, null);
                    object = object3;
                    if (object3 == null) {
                        object = n2.b();
                    }
                    if (object == null && (n3 != 0 || (object = this.e()) == null)) break block16;
                    break block15;
                }
                object = this.e();
                if (object != null) break block15;
            }
            object = this.i(3);
        }
        return object;
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int n2) {
        int n3 = this.f;
        n3 ^= n3 << 13;
        n3 ^= n3 >> 17;
        n3 ^= n3 << 5;
        this.f = n3;
        int n4 = n2 - 1;
        if ((n4 & n2) == 0) {
            return n3 & n4;
        }
        return (n3 & Integer.MAX_VALUE) % n2;
    }

    public final i e() {
        int n2 = this.d(2);
        c c2 = this.h;
        if (n2 == 0) {
            i i2 = (i)c2.e.d();
            if (i2 != null) {
                return i2;
            }
            return (i)c2.f.d();
        }
        i i4 = (i)c2.f.d();
        if (i4 != null) {
            return i4;
        }
        return (i)c2.e.d();
    }

    public final void f(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h.d);
        stringBuilder.append("-worker-");
        String string = n2 == 0 ? "TERMINATED" : String.valueOf(n2);
        stringBuilder.append(string);
        this.setName(stringBuilder.toString());
        this.indexInArray = n2;
    }

    public final void g(Object object) {
        this.nextParkedWorker = object;
    }

    public final boolean h(b b2) {
        b b3 = this.c;
        boolean bl = b3 == com.github.catvod.spider.merge.xc.KW.b.a;
        if (bl) {
            com.github.catvod.spider.merge.xc.KW.c.i.addAndGet(this.h, 0x40000000000L);
        }
        if (b3 != b2) {
            this.c = b2;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public final i i(int var1_1) {
        var14_2 = com.github.catvod.spider.merge.xc.KW.c.i;
        var16_3 = this.h;
        var5_4 = (int)(var14_2.get(var16_3) & 0x1FFFFFL);
        if (var5_4 < 2) {
            return null;
        }
        var2_5 = this.d(var5_4);
        var7_7 = 0x7FFFFFFFFFFFFFFFL;
        for (var4_6 = 0; var4_6 < var5_4; ++var4_6) {
            block18: {
                block19: {
                    block20: {
                        var2_5 = var3_8 = var2_5 + 1;
                        if (var3_8 > var5_4) {
                            var2_5 = 1;
                        }
                        if ((var14_2 = (a)var16_3.g.b(var2_5)) == null || var14_2 == this) break block19;
                        var17_14 = var14_2.a;
                        if (var1_1 == 3) {
                            var14_2 = var17_14.b();
                        } else {
                            var17_14.getClass();
                            var3_8 = n.d.get(var17_14);
                            var6_9 = n.c.get(var17_14);
                            var13_12 = var1_1 == 1;
                            while (true) {
                                if (var3_8 == var6_9 || var13_12 && n.e.get(var17_14) == 0) {
                                    var14_2 = null;
                                    break;
                                }
                                var14_2 = var15_13 = var17_14.c(var3_8, var13_12);
                                if (var15_13 != null) break;
                                ++var3_8;
                            }
                        }
                        var15_13 = this.b;
                        var3_8 = var2_5;
                        if (var14_2 == null) break block20;
                        var15_13.a = var14_2;
lbl34:
                        // 2 sources

                        while (true) {
                            var9_10 = -1L;
                            ** GOTO lbl58
                            break;
                        }
                    }
                    while (true) {
                        if ((var18_15 = (i)(var14_2 = n.b).get(var17_14)) == null) {
                            while (true) {
                                var2_5 = var3_8;
                                var9_10 = -2L;
                                break;
                            }
                        } else {
                            if (((var2_5 = var18_15.b.a == 1 ? 1 : 2) & var1_1) == 0) ** continue;
                            l.f.getClass();
                            var9_10 = System.nanoTime();
                            var2_5 = var3_8;
                            var11_11 = var9_10 - var18_15.a;
                            var9_10 = l.b;
                            if (var11_11 < var9_10) {
                                var9_10 -= var11_11;
                            } else {
                                while (true) {
                                    if (!var14_2.compareAndSet(var17_14, var18_15, null)) continue;
                                    var15_13.a = var18_15;
                                    ** continue;
                                    break;
                                }
                            }
                        }
lbl58:
                        // 3 sources

                        if (var9_10 == -1L) {
                            var14_2 = (i)var15_13.a;
                            var15_13.a = null;
                            return var14_2;
                        }
                        var11_11 = var7_7;
                        var3_8 = var2_5;
                        if (var9_10 > 0L) {
                            var11_11 = Math.min(var7_7, var9_10);
                            var3_8 = var2_5;
                        }
                        break block18;
                        if (var14_2.get(var17_14) == var18_15) ** continue;
                        var3_8 = var2_5;
                    }
                }
                var3_8 = var2_5;
                var11_11 = var7_7;
            }
            var2_5 = var3_8;
            var7_7 = var11_11;
        }
        if (var7_7 == 0x7FFFFFFFFFFFFFFFL) {
            var7_7 = 0L;
        }
        this.e = var7_7;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        boolean bl = false;
        block8: while (true) {
            int n2 = 0;
            boolean bl2 = bl;
            while (true) {
                int n3;
                Object object;
                Object object2 = this.h;
                object2.getClass();
                if (com.github.catvod.spider.merge.xc.KW.c.j.get(object2) != 0 || (object = this.c) == (object2 = com.github.catvod.spider.merge.xc.KW.b.e)) break block8;
                Object object3 = this.a(this.g);
                if (object3 != null) {
                    this.e = 0L;
                    n2 = ((i)object3).b.a;
                    this.d = 0L;
                    if (this.c == com.github.catvod.spider.merge.xc.KW.b.c) {
                        bl = D.a;
                        this.c = com.github.catvod.spider.merge.xc.KW.b.b;
                    }
                    object = this.h;
                    if (n2 != 0 && this.h(com.github.catvod.spider.merge.xc.KW.b.b) && !((c)object).e() && !((c)object).d(com.github.catvod.spider.merge.xc.KW.c.i.get(object))) {
                        ((c)object).e();
                    }
                    ((Object)object).getClass();
                    try {
                        object3.run();
                    }
                    catch (Throwable throwable) {
                        object3 = Thread.currentThread();
                        ((Thread)object3).getUncaughtExceptionHandler().uncaughtException((Thread)object3, throwable);
                    }
                    if (n2 == 0) {
                        bl = bl2;
                        continue block8;
                    }
                    com.github.catvod.spider.merge.xc.KW.c.i.addAndGet(object, -2097152L);
                    bl = bl2;
                    if (this.c == object2) continue block8;
                    bl = D.a;
                    this.c = com.github.catvod.spider.merge.xc.KW.b.d;
                    bl = bl2;
                    continue block8;
                }
                this.g = bl2;
                if (this.e != 0L) {
                    if (n2 == 0) {
                        n2 = 1;
                        continue;
                    }
                    this.h(com.github.catvod.spider.merge.xc.KW.b.c);
                    Thread.interrupted();
                    LockSupport.parkNanos(this.e);
                    this.e = 0L;
                    bl = bl2;
                    continue block8;
                }
                object = this.nextParkedWorker;
                object2 = com.github.catvod.spider.merge.xc.KW.c.k;
                int n4 = object != object2 ? 1 : 0;
                if (n4 == 0) {
                    object = this.h;
                    ((Object)object).getClass();
                    if (this.nextParkedWorker == object2) {
                        long l2;
                        do {
                            object2 = com.github.catvod.spider.merge.xc.KW.c.h;
                            l2 = ((AtomicLongFieldUpdater)object2).get(object);
                            n4 = (int)(l2 & 0x1FFFFFL);
                            n3 = this.indexInArray;
                            bl2 = D.a;
                            this.nextParkedWorker = ((c)object).g.b(n4);
                        } while (!((AtomicLongFieldUpdater)object2).compareAndSet(object, l2, 0x200000L + l2 & 0xFFFFFFFFFFE00000L | (long)n3));
                    }
                } else {
                    i.set(this, -1);
                    while (this.nextParkedWorker != com.github.catvod.spider.merge.xc.KW.c.k && ((AtomicIntegerFieldUpdater)(object3 = i)).get(this) == -1) {
                        object2 = this.h;
                        object2.getClass();
                        Object object4 = com.github.catvod.spider.merge.xc.KW.c.j;
                        if (((AtomicIntegerFieldUpdater)object4).get(object2) != 0 || (object = this.c) == (object2 = com.github.catvod.spider.merge.xc.KW.b.e)) break;
                        this.h(com.github.catvod.spider.merge.xc.KW.b.c);
                        Thread.interrupted();
                        if (this.d == 0L) {
                            this.d = System.nanoTime() + this.h.c;
                        }
                        LockSupport.parkNanos(this.h.c);
                        if (System.nanoTime() - this.d < 0L) continue;
                        this.d = 0L;
                        c c2 = this.h;
                        object = c2.g;
                        synchronized (object) {
                            Throwable throwable2;
                            block25: {
                                block24: {
                                    block23: {
                                        try {
                                            n4 = ((AtomicIntegerFieldUpdater)object4).get(c2);
                                            n4 = n4 != 0 ? 1 : 0;
                                            if (n4 == 0) break block23;
                                        }
                                        catch (Throwable throwable2) {}
                                        continue;
                                    }
                                    object4 = com.github.catvod.spider.merge.xc.KW.c.i;
                                    n3 = (int)(((AtomicLongFieldUpdater)object4).get(c2) & 0x1FFFFFL);
                                    n4 = c2.a;
                                    if (n3 > n4) break block24;
                                    continue;
                                }
                                bl2 = ((AtomicIntegerFieldUpdater)object3).compareAndSet(this, -1, 1);
                                if (bl2) break block25;
                                continue;
                            }
                            n4 = this.indexInArray;
                            this.f(0);
                            c2.c(this, n4, 0);
                            n3 = (int)(((AtomicLongFieldUpdater)object4).getAndDecrement(c2) & 0x1FFFFFL);
                            if (n3 != n4) {
                                object3 = c2.g.b(n3);
                                com.github.catvod.spider.merge.mI.i.b(object3);
                                object3 = (a)object3;
                                c2.g.c(n4, (a)object3);
                                ((a)object3).f(n4);
                                c2.c((a)object3, n3, n4);
                            }
                            c2.g.c(n3, null);
                            // MONITOREXIT @DISABLED, blocks:[20, 4, 5, 8, 9, 11] lbl122 : MonitorExitStatement: MONITOREXIT : var9_9 /* !! */ 
                            this.c = object2;
                            continue;
                            throw throwable2;
                        }
                    }
                }
                bl2 = false;
            }
            break;
        }
        this.h(com.github.catvod.spider.merge.xc.KW.b.e);
    }
}

