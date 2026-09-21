/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.KT.u;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.g0.d;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.H;
import com.github.catvod.spider.merge.xc.s0.N;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.a;
import com.github.catvod.spider.merge.xc.s0.b0;
import com.github.catvod.spider.merge.xc.s0.i0;
import com.github.catvod.spider.merge.xc.s0.j;
import com.github.catvod.spider.merge.xc.s0.o0;
import com.github.catvod.spider.merge.xc.s0.p0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.t0.A;

public class I
extends a
implements H {
    public I(i i2, boolean bl) {
        super(i2, bl);
    }

    public final Object G(u object) {
        block4: {
            Object object2;
            do {
                if ((object2 = this.s()) instanceof W) continue;
                if (object2 instanceof q) {
                    object2 = ((q)object2).a;
                    if (D.b) {
                        throw A.a((Throwable)object2, (d)object);
                    }
                    throw object2;
                }
                object = E.k(object2);
                break block4;
            } while (this.C(object2) < 0);
            object2 = ((j)(object = new i0(com.github.catvod.spider.merge.xc.a.a.m((com.github.catvod.spider.merge.xc.e0.d)object), this))).l();
            if (object2 != null && j.g.get(object) instanceof p0 ^ true) {
                object2.b();
                object2 = o0.a;
                j.h.set(object, object2);
            }
            E.e((j)object, new N(E.f(this, false, new b0(1, object), 3)));
            object = ((j)object).k();
        }
        return object;
    }
}

