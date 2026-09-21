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
import com.github.catvod.spider.merge.d0.g;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.z;

final class h
extends A {
    @Override
    final boolean d(O o2, b b2) {
        g g2 = A.p;
        w w2 = A.i;
        boolean bl = o2.e();
        String string = cYh.d("1338");
        String string2 = cYh.d("1334");
        if (bl) {
            String string3 = ((L)o2).c;
            if (com.github.catvod.spider.merge.b0.b.b(string3, z.x)) {
                if (!b2.B(string3)) {
                    b2.n(this);
                    b2.j0(g2);
                    return false;
                }
                if (!b2.a().d0().equals(string3)) {
                    b2.n(this);
                }
                b2.V(string3);
                b2.i();
                b2.j0(g2);
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string3, z.y)) {
                b2.n(this);
                return false;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string3, z.z)) {
                if (!b2.B(string3)) {
                    b2.n(this);
                    return false;
                }
                if (b2.B(string2)) {
                    string = string2;
                }
                b2.d(string);
                return b2.c(o2);
            }
            return b2.X(o2, w2);
        }
        if (o2.f() && com.github.catvod.spider.merge.b0.b.b(((M)o2).c, z.A)) {
            if (!b2.B(string2) && !b2.B(string)) {
                b2.n(this);
                return false;
            }
            if (b2.B(string2)) {
                string = string2;
            }
            b2.d(string);
            return b2.c(o2);
        }
        return b2.X(o2, w2);
    }
}

