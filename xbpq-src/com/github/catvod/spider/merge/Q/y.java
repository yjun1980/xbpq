/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.P;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.b;
import com.github.catvod.spider.merge.Q.e0;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.l0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.n;
import com.github.catvod.spider.merge.Q.n0;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.Q.u0;
import com.github.catvod.spider.merge.S.f;
import com.github.catvod.spider.merge.S.j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Set;

public final class y {
    public final a a;

    public y(a a2) {
        this.a = a2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void a(m m2, X x2, j j2, Set set, BitSet bitSet) {
        Object object = l0.c;
        int n2 = 0;
        if (!set.add(new b(m2, 0, x2, (l0)object))) {
            return;
        }
        if (m2 == null) {
            if (x2 == null) {
                j2.a(-2);
                return;
            }
            if (x2.f()) {
                j2.a(-1);
                return;
            }
        }
        if (m2 instanceof e0) {
            if (x2 == null) {
                j2.a(-2);
                return;
            }
            if (x2.f()) {
                j2.a(-1);
                return;
            }
            if (x2 != X.b) {
                boolean bl = bitSet.get(m2.c);
                try {
                    bitSet.clear(m2.c);
                    while (n2 < x2.h()) {
                        this.a((m)((ArrayList)this.a.a).get(x2.d(n2)), x2.c(n2), j2, set, bitSet);
                        ++n2;
                    }
                    if (bl) {
                        bitSet.set(m2.c);
                    }
                    return;
                }
                catch (Throwable throwable) {
                    if (bl) {
                        bitSet.set(m2.c);
                    }
                    throw throwable;
                }
            }
        }
        int n3 = m2.b();
        for (n2 = 0; n2 < n3; ++n2) {
            Object object2;
            Object object3 = m2.d(n2);
            if (object3.getClass() == f0.class) {
                object = (f0)object3;
                if (bitSet.get(((t0)object).a.c)) continue;
                object2 = n0.i(x2, ((f0)object).c.b);
                try {
                    bitSet.set(((f0)object3).a.c);
                    this.a(((t0)object3).a, (X)object2, j2, set, bitSet);
                    continue;
                }
                finally {
                    bitSet.clear(((t0)object).a.c);
                }
            }
            if (object3 instanceof n || ((t0)object3).b()) {
                this.a(((t0)object3).a, x2, j2, set, bitSet);
                continue;
            }
            if (object3.getClass() == u0.class) {
                j2.c(j.g(1, this.a.f));
                continue;
            }
            object2 = ((t0)object3).c();
            if (object2 == null) continue;
            object = object2;
            if (object3 instanceof P) {
                object3 = j.g(1, this.a.f);
                if (((j)object3).f()) {
                    object = null;
                } else if (((j)object2).f()) {
                    object = new j(new int[0]);
                    ((j)object).c((f)object3);
                } else {
                    object = j.k((j)object3, (j)object2);
                }
            }
            j2.c((f)object);
        }
    }
}

