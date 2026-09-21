/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.e1.i;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.K;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.s;

final class m
extends B {
    @Override
    final boolean i(P object, b b2) {
        s s2;
        block7: {
            block6: {
                block5: {
                    s2 = B.b;
                    if (B.b((P)object)) {
                        return true;
                    }
                    if (!((P)object).c()) break block5;
                    b2.J((J)object);
                    break block6;
                }
                if (!((P)object).d()) break block7;
                K k2 = (K)object;
                object = new i(b2.h.d(k2.d.toString()), k2.f.toString(), k2.g.toString());
                ((i)object).L(k2.e);
                b2.d.K((com.github.catvod.spider.merge.e1.s)object);
                if (k2.h) {
                    b2.d.E0();
                }
                b2.s0(s2);
            }
            return true;
        }
        b2.s0(s2);
        return b2.e((P)object);
    }
}

