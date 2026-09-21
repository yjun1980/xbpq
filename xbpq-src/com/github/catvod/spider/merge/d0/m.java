/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.i;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.J;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.r;

final class m
extends A {
    @Override
    final boolean d(O o2, b b2) {
        r r2;
        block7: {
            block6: {
                block5: {
                    r2 = A.d;
                    if (A.a(o2)) {
                        return true;
                    }
                    if (!o2.b()) break block5;
                    b2.F((I)o2);
                    break block6;
                }
                if (!o2.c()) break block7;
                o2 = (J)o2;
                i i2 = new i(b2.h.c(((J)o2).b.toString()), ((J)o2).d.toString(), ((J)o2).e.toString());
                i2.L(((J)o2).c);
                b2.d.L(i2);
                if (((J)o2).f) {
                    b2.d.v0();
                }
                b2.j0(r2);
            }
            return true;
        }
        b2.j0(r2);
        return b2.c(o2);
    }
}

