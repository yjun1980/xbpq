/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class d
extends B {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean i(P p2, b b2) {
        if (p2.f()) {
            M m2 = (M)p2;
            if (m2.e.equals("caption")) {
                if (!b2.G(m2.e)) {
                    b2.r(this);
                    return false;
                }
                b2.v(false);
                if (!b2.b("caption")) {
                    b2.r(this);
                }
                b2.a0("caption");
                b2.l();
                b2.s0(B.i);
                return true;
            }
        }
        if (p2.g() && com.github.catvod.spider.merge.d1.c.c(((N)p2).e, A.y) || p2.f() && ((M)p2).e.equals("table")) {
            b2.r(this);
            if (!b2.f("caption")) return true;
            return b2.e(p2);
        }
        if (!p2.f() || !com.github.catvod.spider.merge.d1.c.c(((M)p2).e, A.J)) return b2.d0(p2, B.g);
        b2.r(this);
        return false;
    }
}

