/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.z;

final class j
extends A {
    @Override
    final boolean d(O o2, b b2) {
        boolean bl = o2.f();
        String string = cYh.d("14352D34342E");
        if (bl && com.github.catvod.spider.merge.b0.b.b(((M)o2).c, z.I)) {
            b2.n(this);
            b2.d(string);
            return b2.c(o2);
        }
        if (o2.e()) {
            L l2 = (L)o2;
            if (com.github.catvod.spider.merge.b0.b.b(l2.c, z.I)) {
                b2.n(this);
                if (b2.B(l2.c)) {
                    b2.d(string);
                    return b2.c(o2);
                }
                return false;
            }
        }
        return b2.X(o2, A.r);
    }
}

