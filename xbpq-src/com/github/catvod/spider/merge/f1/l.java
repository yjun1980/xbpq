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
import java.util.Objects;

final class l
extends B {
    @Override
    final boolean i(P p2, b b2) {
        block10: {
            block7: {
                block9: {
                    block8: {
                        block6: {
                            if (!B.b(p2)) break block6;
                            b2.I((I)p2);
                            break block7;
                        }
                        if (!p2.c()) break block8;
                        b2.J((J)p2);
                        break block7;
                    }
                    if (p2.d()) {
                        b2.r(this);
                        return false;
                    }
                    if (p2.g() && ((N)p2).e.equals("html")) {
                        return b2.d0(p2, B.g);
                    }
                    if (!p2.f() || !((M)p2).e.equals("html")) break block9;
                    Objects.requireNonNull(b2);
                    if (b2.W("html")) {
                        b2.a0("html");
                    }
                    b2.s0(B.v);
                    break block7;
                }
                if (!p2.e()) break block10;
            }
            return true;
        }
        b2.r(this);
        b2.l0();
        return b2.e(p2);
    }
}

