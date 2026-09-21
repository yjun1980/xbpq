/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.z;

final class s
extends A {
    @Override
    final boolean d(O o2, b b2) {
        String string;
        block10: {
            block8: {
                block9: {
                    block7: {
                        if (!A.a(o2)) break block7;
                        b2.E((H)o2);
                        break block8;
                    }
                    if (!o2.b()) break block9;
                    b2.F((I)o2);
                    break block8;
                }
                if (o2.c()) {
                    b2.n(this);
                    return false;
                }
                if (o2.f() && ((M)o2).c.equals(cYh.d("0F242C3D"))) {
                    return A.i.d(o2, b2);
                }
                boolean bl = o2.f();
                string = cYh.d("0F352035");
                if (!bl) break block10;
                M m2 = (M)o2;
                if (!m2.c.equals(string)) break block10;
                b2.h0(b2.D(m2));
                b2.j0(A.f);
            }
            return true;
        }
        if (o2.e() && com.github.catvod.spider.merge.b0.b.b(((L)o2).c, z.e)) {
            b2.f(string);
            return b2.c(o2);
        }
        if (o2.e()) {
            b2.n(this);
            return false;
        }
        b2.f(string);
        return b2.c(o2);
    }
}

