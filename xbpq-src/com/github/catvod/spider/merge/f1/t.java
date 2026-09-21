/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class t
extends B {
    @Override
    final boolean i(P p2, b b2) {
        block10: {
            block8: {
                block9: {
                    block7: {
                        if (!B.b(p2)) break block7;
                        b2.I((I)p2);
                        break block8;
                    }
                    if (!p2.c()) break block9;
                    b2.J((J)p2);
                    break block8;
                }
                if (p2.d()) {
                    b2.r(this);
                    return false;
                }
                if (p2.g() && ((N)p2).e.equals("html")) {
                    return B.g.i(p2, b2);
                }
                if (!p2.g()) break block10;
                N n2 = (N)p2;
                if (!n2.e.equals("head")) break block10;
                b2.p0(b2.H(n2));
                b2.s0(B.d);
            }
            return true;
        }
        if (p2.f() && com.github.catvod.spider.merge.d1.c.c(((M)p2).e, A.e)) {
            b2.h("head");
            return b2.e(p2);
        }
        if (p2.f()) {
            b2.r(this);
            return false;
        }
        b2.h("head");
        return b2.e(p2);
    }
}

