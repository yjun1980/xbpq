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

final class j
extends B {
    @Override
    final boolean i(P p2, b b2) {
        if (p2.g() && com.github.catvod.spider.merge.d1.c.c(((N)p2).e, A.G)) {
            b2.r(this);
            b2.a0("select");
            b2.m0();
            return b2.e(p2);
        }
        if (p2.f()) {
            M m2 = (M)p2;
            if (com.github.catvod.spider.merge.d1.c.c(m2.e, A.G)) {
                b2.r(this);
                if (b2.G(m2.e)) {
                    b2.a0("select");
                    b2.m0();
                    return b2.e(p2);
                }
                return false;
            }
        }
        return b2.d0(p2, B.p);
    }
}

