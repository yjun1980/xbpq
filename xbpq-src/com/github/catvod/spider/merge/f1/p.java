/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class p
extends B {
    @Override
    final boolean i(P p2, b b2) {
        block4: {
            block6: {
                block3: {
                    block5: {
                        block2: {
                            if (!p2.c()) break block2;
                            b2.J((J)p2);
                            break block3;
                        }
                        if (p2.d() || p2.g() && ((N)p2).e.equals("html")) break block4;
                        if (!B.b(p2)) break block5;
                        b2.I((I)p2);
                        break block3;
                    }
                    if (!p2.e()) break block6;
                }
                return true;
            }
            b2.r(this);
            b2.l0();
            return b2.e(p2);
        }
        return b2.d0(p2, B.g);
    }
}

