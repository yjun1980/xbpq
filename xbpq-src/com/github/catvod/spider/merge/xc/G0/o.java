/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;

public final class o
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block10: {
            block7: {
                block9: {
                    block8: {
                        block6: {
                            if (!B.a(n2)) break block6;
                            b2.s((G)n2);
                            break block7;
                        }
                        if (!n2.a()) break block8;
                        b2.t((H)n2);
                        break block7;
                    }
                    if (n2.b()) {
                        b2.h(this);
                        return false;
                    }
                    if (n2.e() && ((L)n2).c.equals("html")) {
                        x x2 = B.g;
                        b2.g = n2;
                        return x2.c(n2, b2);
                    }
                    if (!n2.d() || !((K)n2).c.equals("html")) break block9;
                    b2.l = B.w;
                    break block7;
                }
                if (n2.e() && ((L)n2).c.equals("noframes")) {
                    u u2 = B.d;
                    b2.g = n2;
                    return u2.c(n2, b2);
                }
                if (!n2.c()) break block10;
            }
            return true;
        }
        b2.h(this);
        return false;
    }
}

