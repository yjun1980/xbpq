/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.H;
import com.github.catvod.spider.merge.xc.s0.I;
import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.d;
import com.github.catvod.spider.merge.xc.s0.e;
import com.github.catvod.spider.merge.xc.s0.h0;
import com.github.catvod.spider.merge.xc.s0.i;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.s0.p;
import com.github.catvod.spider.merge.xc.s0.p0;
import com.github.catvod.spider.merge.xc.s0.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class c
extends h0 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final i e;
    public M f;
    public final e g;

    public c(e e2, j j2) {
        this.g = e2;
        this.e = j2;
    }

    @Override
    public final void d(Throwable object) {
        Object object2 = this.e;
        if (object != null) {
            boolean bl;
            j j2;
            block13: {
                Object v2;
                j2 = (j)object2;
                j2.getClass();
                q q2 = new q((Throwable)object, false);
                while (true) {
                    object = j.g;
                    v2 = ((AtomicReferenceFieldUpdater)object).get(j2);
                    bl = v2 instanceof p0;
                    object2 = E.a;
                    if (!bl) break;
                    Object object3 = j.q((p0)v2, q2, j2.c, null);
                    do {
                        if (!((AtomicReferenceFieldUpdater)object).compareAndSet(j2, v2, object3)) continue;
                        object = object2;
                        if (!j2.m()) {
                            object = j.h;
                            object3 = (M)((AtomicReferenceFieldUpdater)object).get(j2);
                            if (object3 == null) {
                                object = object2;
                            } else {
                                object3.b();
                                ((AtomicReferenceFieldUpdater)object).set(j2, o0.a);
                                object = object2;
                            }
                        }
                        break block13;
                    } while (((AtomicReferenceFieldUpdater)object).get(j2) == v2);
                }
                bl = v2 instanceof p;
                object = null;
            }
            if (object != null) {
                j2.getClass();
                bl = D.a;
                j2.i(j2.c);
                object = (d)h.get(this);
                if (object != null) {
                    ((d)object).b();
                }
            }
        } else {
            object = com.github.catvod.spider.merge.xc.s0.e.b;
            Object object4 = this.g;
            if (((AtomicIntegerFieldUpdater)object).decrementAndGet(object4) == 0) {
                H[] hArray = ((e)object4).a;
                object = new ArrayList<Object>(hArray.length);
                int n2 = hArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    object4 = ((I)hArray[i2]).s();
                    if (object4 instanceof W ^ true) {
                        if (!(object4 instanceof q)) {
                            ((ArrayList)object).add(E.k(object4));
                            continue;
                        }
                        throw ((q)object4).a;
                    }
                    throw new IllegalStateException("This job has not completed yet".toString());
                }
                ((j)object2).resumeWith(object);
            }
        }
    }
}

