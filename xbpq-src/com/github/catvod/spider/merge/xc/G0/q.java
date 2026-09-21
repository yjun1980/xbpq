/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;

public final class q
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        if (!n2.a()) break block4;
                        b2.t((H)n2);
                        break block5;
                    }
                    if (n2.b() || B.a(n2) || n2.e() && ((L)n2).c.equals("html")) break block6;
                    if (!n2.c()) break block7;
                }
                return true;
            }
            if (n2.e() && ((L)n2).c.equals("noframes")) {
                u u2 = B.d;
                b2.g = n2;
                return u2.c(n2, b2);
            }
            b2.h(this);
            return false;
        }
        x x2 = B.g;
        b2.g = n2;
        return x2.c(n2, b2);
    }
}

