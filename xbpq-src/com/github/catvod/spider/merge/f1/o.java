/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class o
extends B {
    @Override
    final boolean i(P p2, b b2) {
        block14: {
            block8: {
                block13: {
                    B b3;
                    block11: {
                        block12: {
                            block10: {
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
                                if (!p2.g() || !((N)p2).e.equals("html")) break block10;
                                b3 = B.g;
                                break block11;
                            }
                            if (!p2.f() || !((M)p2).e.equals("html")) break block12;
                            b2.s0(B.w);
                            break block8;
                        }
                        if (!p2.g() || !((N)p2).e.equals("noframes")) break block13;
                        b3 = B.d;
                    }
                    return b2.d0(p2, b3);
                }
                if (!p2.e()) break block14;
            }
            return true;
        }
        b2.r(this);
        return false;
    }
}

