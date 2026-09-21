/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.y;
import com.github.catvod.spider.merge.Fs.z;

final class f
extends A {
    private boolean e(O o2, b b2) {
        if (!(b2.B("tbody") || b2.B("thead") || b2.x("tfoot", null))) {
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
        M m2;
        y y2;
        block13: {
            block11: {
                block12: {
                    block9: {
                        String string2;
                        block10: {
                            y2 = A.k;
                            int n2 = com.github.catvod.spider.merge.Dw.h.a(o2.a);
                            if (n2 == 1) break block9;
                            if (n2 != 2) {
                                return b2.X(o2, y2);
                            }
                            string2 = ((L)o2).c;
                            if (!com.github.catvod.spider.merge.Dw.e.b(string2, z.J)) break block10;
                            if (!b2.B(string2)) {
                                b2.n(this);
                                return false;
                            }
                            b2.k();
                            b2.U();
                            b2.j0(y2);
                            break block11;
                        }
                        if (string2.equals("table")) {
                            return this.e(o2, b2);
                        }
                        if (com.github.catvod.spider.merge.Dw.e.b(string2, z.E)) {
                            b2.n(this);
                            return false;
                        }
                        return b2.X(o2, y2);
                    }
                    m2 = (M)o2;
                    string = m2.c;
                    if (!string.equals("template")) break block12;
                    b2.D(m2);
                    break block11;
                }
                if (!string.equals("tr")) break block13;
                b2.k();
                b2.D(m2);
                b2.j0(A.p);
            }
            return true;
        }
        if (com.github.catvod.spider.merge.Dw.e.b(string, z.x)) {
            b2.n(this);
            b2.f("tr");
            return b2.c(m2);
        }
        if (com.github.catvod.spider.merge.Dw.e.b(string, z.D)) {
            return this.e(o2, b2);
        }
        return b2.X(o2, y2);
    }
}

