/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;

public final class t
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block10: {
            block8: {
                block9: {
                    block7: {
                        if (!B.a(n2)) break block7;
                        b2.s((G)n2);
                        break block8;
                    }
                    if (!n2.a()) break block9;
                    b2.t((H)n2);
                    break block8;
                }
                if (n2.b()) {
                    b2.h(this);
                    return false;
                }
                if (n2.e() && ((L)n2).c.equals("html")) {
                    return B.g.c(n2, b2);
                }
                if (!n2.e()) break block10;
                L l2 = (L)n2;
                if (!l2.c.equals("head")) break block10;
                b2.o = b2.r(l2);
                b2.l = B.d;
            }
            return true;
        }
        if (n2.d() && com.github.catvod.spider.merge.xc.E0.b.c(((K)n2).c, A.e)) {
            b2.G("head");
            return b2.D(n2);
        }
        if (n2.d()) {
            b2.h(this);
            return false;
        }
        b2.G("head");
        return b2.D(n2);
    }
}

