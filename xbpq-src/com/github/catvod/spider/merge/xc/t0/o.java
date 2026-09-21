/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.G;
import com.github.catvod.spider.merge.xc.s0.J;
import com.github.catvod.spider.merge.xc.s0.w;
import com.github.catvod.spider.merge.xc.t0.n;
import com.github.catvod.spider.merge.xc.t0.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class o
extends w
implements J {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers$volatile");
    public final w c;
    public final int d;
    public final r e;
    public final Object f;
    private volatile int runningWorkers$volatile;

    public o(w object, int n2) {
        this.c = object;
        this.d = n2;
        object = object instanceof J ? (J)object : null;
        if (object == null) {
            n2 = G.a;
        }
        this.e = new r();
        this.f = new Object();
    }

    @Override
    public final void d(i object, Runnable object2) {
        block7: {
            this.e.a(object2);
            object2 = g;
            if (((AtomicIntegerFieldUpdater)object2).get(this) < this.d) {
                object = this.f;
                synchronized (object) {
                    block6: {
                        int n2 = ((AtomicIntegerFieldUpdater)object2).get(this);
                        int n3 = this.d;
                        if (n2 < n3) break block6;
                        break block7;
                    }
                    ((AtomicIntegerFieldUpdater)object2).incrementAndGet(this);
                    // MONITOREXIT @DISABLED, blocks:[1, 2, 5] lbl16 : MonitorExitStatement: MONITOREXIT : var1_1
                    object = this.h();
                    if (object != null) {
                        object = new n(this, (Runnable)object);
                        this.c.d(this, (Runnable)object);
                    }
                }
            }
        }
    }

    public final Runnable h() {
        Object object;
        while ((object = (Runnable)this.e.d()) == null) {
            object = this.f;
            synchronized (object) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                block5: {
                    atomicIntegerFieldUpdater = g;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    int n2 = this.e.c();
                    if (n2 != 0) break block5;
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
        return object;
    }
}

