/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;

final class p
extends A {
    @Override
    final boolean d(O o2, b b2) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        if (!o2.b()) break block4;
                        b2.F((I)o2);
                        break block5;
                    }
                    if (o2.c() || A.a(o2) || o2.f() && ((M)o2).c.equals(cYh.d("0F242C3D"))) break block6;
                    if (!o2.d()) break block7;
                }
                return true;
            }
            if (o2.f() && ((M)o2).c.equals(cYh.d("093F272336370223"))) {
                return b2.X(o2, A.f);
            }
            b2.n(this);
            return false;
        }
        return b2.X(o2, A.i);
    }
}

