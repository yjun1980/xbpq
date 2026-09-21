/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.x;

public final class p
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block4: {
            block6: {
                block3: {
                    block5: {
                        block2: {
                            if (!n2.a()) break block2;
                            b2.t((H)n2);
                            break block3;
                        }
                        if (n2.b() || n2.e() && ((L)n2).c.equals("html")) break block4;
                        if (!B.a(n2)) break block5;
                        b2.s((G)n2);
                        break block3;
                    }
                    if (!n2.c()) break block6;
                }
                return true;
            }
            b2.h(this);
            b2.L();
            return b2.D(n2);
        }
        x x2 = B.g;
        b2.g = n2;
        return x2.c(n2, b2);
    }
}

