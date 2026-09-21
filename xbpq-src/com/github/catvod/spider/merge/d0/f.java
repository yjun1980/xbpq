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
import com.github.catvod.spider.merge.d0.y;
import com.github.catvod.spider.merge.d0.z;
import com.github.catvod.spider.merge.l.a;

final class f
extends A {
    private boolean e(O o2, b b2) {
        if (!(b2.B(cYh.d("13322E352E")) || b2.B(cYh.d("1338243033")) || b2.x(cYh.d("13362E3E23"), null))) {
            b2.n(this);
            return false;
        }
        b2.k();
        b2.d(b2.a().d0());
        return b2.c(o2);
    }

    @Override
    final boolean d(O o2, b b2) {
        String string;
        String string2;
        M m2;
        y y2;
        block13: {
            block11: {
                block12: {
                    block9: {
                        String string3;
                        block10: {
                            y2 = A.k;
                            int n2 = a.a(o2.a);
                            if (n2 == 1) break block9;
                            if (n2 != 2) {
                                return b2.X(o2, y2);
                            }
                            string3 = ((L)o2).c;
                            if (!com.github.catvod.spider.merge.b0.b.b(string3, z.J)) break block10;
                            if (!b2.B(string3)) {
                                b2.n(this);
                                return false;
                            }
                            b2.k();
                            b2.U();
                            b2.j0(y2);
                            break block11;
                        }
                        if (string3.equals(cYh.d("1331233D32"))) {
                            return this.e(o2, b2);
                        }
                        if (com.github.catvod.spider.merge.b0.b.b(string3, z.E)) {
                            b2.n(this);
                            return false;
                        }
                        return b2.X(o2, y2);
                    }
                    m2 = (M)o2;
                    string2 = m2.c;
                    if (!string2.equals(cYh.d("13352C213B3B1335"))) break block12;
                    b2.D(m2);
                    break block11;
                }
                string = cYh.d("1322");
                if (!string2.equals(string)) break block13;
                b2.k();
                b2.D(m2);
                b2.j0(A.p);
            }
            return true;
        }
        if (com.github.catvod.spider.merge.b0.b.b(string2, z.x)) {
            b2.n(this);
            b2.f(string);
            return b2.c(m2);
        }
        if (com.github.catvod.spider.merge.b0.b.b(string2, z.D)) {
            return this.e(o2, b2);
        }
        return b2.X(o2, y2);
    }
}

