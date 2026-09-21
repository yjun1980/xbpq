/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.F.e;
import com.github.catvod.spider.merge.N.c;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.O.i;
import com.github.catvod.spider.merge.O.n;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public final class a
extends Thread {
    static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(a.class, cYh.d("103F333A322824242D"));
    public final n c;
    public int d;
    private long e;
    private long f;
    private int g;
    public boolean h;
    final b i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile int workerCtl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public a(b object, int n2) {
        this.i = object;
        this.setDaemon(true);
        this.c = new n();
        this.d = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = b.m;
        object = com.github.catvod.spider.merge.F.e.c;
        this.g = com.github.catvod.spider.merge.F.e.a().b();
        this.f(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final i e() {
        Object object;
        if (this.d(2) == 0) {
            object = (i)this.i.c.d();
            if (object != null) {
                return object;
            }
            object = this.i.d;
            return (i)((c)object).d();
        }
        object = (i)this.i.d.d();
        if (object != null) {
            return object;
        }
        object = this.i.c;
        return (i)((c)object).d();
    }

    private final i i(boolean bl) {
        int n2 = (int)(this.i.controlState & 0x1FFFFFL);
        if (n2 < 2) {
            return null;
        }
        int n3 = this.d(n2);
        long l2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            n3 = n4 = n3 + 1;
            if (n4 > n2) {
                n3 = 1;
            }
            Object object = this.i.e.get(n3);
            long l3 = l2;
            if (object != null) {
                l3 = l2;
                if (object != this) {
                    n n5 = this.c;
                    object = ((a)object).c;
                    long l4 = bl ? n5.g((n)object) : n5.h((n)object);
                    if (l4 == -1L) {
                        return this.c.e();
                    }
                    l3 = l2;
                    if (l4 > 0L) {
                        l3 = Math.min(l2, l4);
                    }
                }
            }
            l2 = l3;
        }
        if (l2 == Long.MAX_VALUE) {
            l2 = 0L;
        }
        this.f = l2;
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public final i a(boolean var1_1) {
        block7: {
            var2_2 = this.d;
            var3_3 = 1;
            if (var2_2 == 1) ** GOTO lbl14
            var6_4 = this.i;
            do {
                if ((int)((9223367638808264704L & (var4_5 = var6_4.controlState)) >> 42) != 0) continue;
                var2_2 = 0;
                break block7;
            } while (!b.k.compareAndSet(var6_4, var4_5, var4_5 - 0x40000000000L));
            var2_2 = 1;
        }
        if (var2_2 != 0) {
            this.d = 1;
lbl14:
            // 2 sources

            var2_2 = 1;
        } else {
            var2_2 = 0;
        }
        if (var2_2 != 0) {
            if (!(var1_1 != false ? (var2_2 = this.d(this.i.f * 2) == 0 ? var3_3 : 0) != 0 && (var6_4 = this.e()) != null || (var6_4 = this.c.e()) != null || var2_2 == 0 && (var6_4 = this.e()) != null : (var6_4 = this.e()) != null)) {
                var6_4 = this.i(false);
            }
            return var6_4;
        }
        if (!var1_1 || (var6_4 = this.c.e()) == null) {
            var6_4 = (i)this.i.d.d();
        }
        if (var6_4 == null) {
            var6_4 = this.i(true);
        }
        return var6_4;
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int n2) {
        int n3;
        int n4 = this.g;
        n4 ^= n4 << 13;
        n4 ^= n4 >> 17;
        this.g = n3 = n4 ^ n4 << 5;
        n4 = n2 - 1;
        if ((n4 & n2) == 0) {
            return n3 & n4;
        }
        return (n3 & Integer.MAX_VALUE) % n2;
    }

    public final void f(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i.i);
        stringBuilder.append(cYh.d("4A272E233C3F157D"));
        String string = n2 == 0 ? cYh.d("3315131C1E1426040415") : String.valueOf(n2);
        stringBuilder.append(string);
        this.setName(stringBuilder.toString());
        this.indexInArray = n2;
    }

    public final void g(Object object) {
        this.nextParkedWorker = object;
    }

    public final boolean h(int n2) {
        int n3 = this.d;
        boolean bl = true;
        if (n3 != 1) {
            bl = false;
        }
        if (bl) {
            b b2 = this.i;
            b.k.addAndGet(b2, 0x40000000000L);
        }
        if (n3 != n2) {
            this.d = n2;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block7: while (true) {
            int n2 = 0;
            while (!this.i.isTerminated() && this.d != 5) {
                Object object;
                Object object2 = this.a(this.h);
                if (object2 != null) {
                    this.f = 0L;
                    n2 = ((i)object2).d.a();
                    this.e = 0L;
                    if (this.d == 3) {
                        this.d = 2;
                    }
                    if (n2 != 0 && this.h(2)) {
                        this.i.h();
                    }
                    this.i.getClass();
                    try {
                        object2.run();
                    }
                    catch (Throwable throwable) {
                        object = Thread.currentThread();
                        ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
                    }
                    if (n2 == 0) continue block7;
                    object2 = this.i;
                    b.k.addAndGet(object2, -2097152L);
                    if (this.d == 5) continue block7;
                    this.d = 4;
                    continue block7;
                }
                this.h = false;
                if (this.f != 0L) {
                    if (n2 == 0) {
                        n2 = 1;
                        continue;
                    }
                    this.h(3);
                    Thread.interrupted();
                    LockSupport.parkNanos(this.f);
                    this.f = 0L;
                    continue block7;
                }
                int n3 = this.nextParkedWorker != b.m ? 1 : 0;
                if (n3 == 0) {
                    this.i.f(this);
                    continue;
                }
                this.workerCtl = -1;
                while ((n3 = this.nextParkedWorker != b.m ? 1 : 0) != 0 && this.workerCtl == -1 && !this.i.isTerminated() && this.d != 5) {
                    this.h(3);
                    Thread.interrupted();
                    if (this.e == 0L) {
                        this.e = System.nanoTime() + this.i.h;
                    }
                    LockSupport.parkNanos(this.i.h);
                    if (System.nanoTime() - this.e < 0L) continue;
                    this.e = 0L;
                    object2 = this.i.e;
                    synchronized (object2) {
                        boolean bl;
                        if (this.i.isTerminated() || (int)(this.i.controlState & 0x1FFFFFL) <= this.i.f || !(bl = j.compareAndSet(this, -1, 1))) {
                            continue;
                        }
                        n3 = this.indexInArray;
                        this.f(0);
                        this.i.g(this, n3, 0);
                        object = this.i;
                        int n4 = (int)(0x1FFFFFL & b.k.getAndDecrement(object));
                        if (n4 != n3) {
                            object = this.i.e.get(n4);
                            com.github.catvod.spider.merge.E.f.b(object);
                            object = (a)object;
                            this.i.e.set(n3, (a)object);
                            ((a)object).f(n3);
                            this.i.g((a)object, n4, n3);
                        }
                        this.i.e.set(n4, null);
                    }
                    this.d = 5;
                }
            }
            break;
        }
        this.h(5);
    }
}

