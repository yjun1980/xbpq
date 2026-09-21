/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class q
extends B {
    @Override
    final boolean i(P p2, b b2) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        if (!p2.c()) break block4;
                        b2.J((J)p2);
                        break block5;
                    }
                    if (p2.d() || B.b(p2) || p2.g() && ((N)p2).e.equals("html")) break block6;
                    if (!p2.e()) break block7;
                }
                return true;
            }
            if (p2.g() && ((N)p2).e.equals("noframes")) {
                return b2.d0(p2, B.d);
            }
            b2.r(this);
            return false;
        }
        return b2.d0(p2, B.g);
    }
}

