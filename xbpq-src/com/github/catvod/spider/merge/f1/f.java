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
import com.github.catvod.spider.merge.f1.z;

final class f
extends B {
    private boolean j(P p2, b b2) {
        if (!(b2.G("tbody") || b2.G("thead") || b2.C("tfoot", null))) {
            b2.r(this);
            return false;
        }
        b2.n();
        b2.f(b2.a().g0());
        return b2.e(p2);
    }

    @Override
    final boolean i(P p2, b b2) {
        String string;
        N n2;
        z z2;
        block12: {
            block11: {
                block9: {
                    String string2;
                    block10: {
                        z2 = B.i;
                        int n3 = com.github.catvod.spider.merge.y.z.c(p2.a);
                        if (n3 == 1) break block9;
                        if (n3 != 2) {
                            return b2.d0(p2, z2);
                        }
                        string2 = ((M)p2).e;
                        if (!com.github.catvod.spider.merge.d1.c.c(string2, A.H)) break block10;
                        if (!b2.G(string2)) {
                            b2.r(this);
                            return false;
                        }
                        b2.n();
                        b2.Z();
                        b2.s0(z2);
                        break block11;
                    }
                    if (string2.equals("table")) {
                        return this.j(p2, b2);
                    }
                    if (com.github.catvod.spider.merge.d1.c.c(string2, A.C)) {
                        b2.r(this);
                        return false;
                    }
                    return b2.d0(p2, z2);
                }
                n2 = (N)p2;
                string = n2.e;
                if (!string.equals("tr")) break block12;
                b2.n();
                b2.H(n2);
                b2.s0(B.n);
            }
            return true;
        }
        if (com.github.catvod.spider.merge.d1.c.c(string, A.v)) {
            b2.r(this);
            b2.h("tr");
            return b2.e(n2);
        }
        if (com.github.catvod.spider.merge.d1.c.c(string, A.B)) {
            return this.j(p2, b2);
        }
        return b2.d0(p2, z2);
    }
}

