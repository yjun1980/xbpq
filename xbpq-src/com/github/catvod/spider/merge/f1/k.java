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
import com.github.catvod.spider.merge.f1.e;
import com.github.catvod.spider.merge.f1.f;
import com.github.catvod.spider.merge.f1.g;
import com.github.catvod.spider.merge.f1.u;
import com.github.catvod.spider.merge.f1.x;
import com.github.catvod.spider.merge.f1.z;

final class k
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        x x2;
        block12: {
            String string;
            block16: {
                u u2;
                block15: {
                    block13: {
                        block14: {
                            u2 = B.d;
                            x2 = B.g;
                            int n2 = com.github.catvod.spider.merge.y.z.c(p2.a);
                            if (n2 == 0) break block12;
                            if (n2 == 1) break block13;
                            if (n2 == 2) break block14;
                            if (n2 != 3 && n2 != 4) {
                                if (n2 != 5) {
                                    return true;
                                }
                                if (!b2.W("template")) {
                                    return true;
                                }
                                b2.r(this);
                                b2.a0("template");
                                b2.l();
                                b2.b0();
                                b2.m0();
                                if (b2.q0() == B.r) return true;
                                if (b2.r0() >= 12) return true;
                                return b2.e(p2);
                            }
                            break block12;
                        }
                        if (!((M)p2).e.equals("template")) {
                            b2.r(this);
                            return false;
                        }
                        break block15;
                    }
                    string = ((N)p2).e;
                    if (!com.github.catvod.spider.merge.d1.c.c(string, A.K)) break block16;
                }
                b2.d0(p2, u2);
                return true;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string, A.L)) {
                b2.b0();
                z z2 = B.i;
                b2.f0(z2);
                b2.s0(z2);
                return b2.e(p2);
            }
            if (string.equals("col")) {
                b2.b0();
                e e2 = B.l;
                b2.f0(e2);
                b2.s0(e2);
                return b2.e(p2);
            }
            if (string.equals("tr")) {
                b2.b0();
                f f2 = B.m;
                b2.f0(f2);
                b2.s0(f2);
                return b2.e(p2);
            }
            if (!string.equals("td") && !string.equals("th")) {
                b2.b0();
                b2.f0(x2);
                b2.s0(x2);
                return b2.e(p2);
            }
            b2.b0();
            g g2 = B.n;
            b2.f0(g2);
            b2.s0(g2);
            return b2.e(p2);
        }
        b2.d0(p2, x2);
        return true;
    }
}

