/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.z;

final class s
extends A {
    @Override
    final boolean d(O o2, b b2) {
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
                if (o2.f() && ((M)o2).c.equals("html")) {
                    return A.i.d(o2, b2);
                }
                if (!o2.f()) break block10;
                M m2 = (M)o2;
                if (!m2.c.equals("head")) break block10;
                b2.h0(b2.D(m2));
                b2.j0(A.f);
            }
            return true;
        }
        if (o2.e() && com.github.catvod.spider.merge.Dw.e.b(((L)o2).c, z.e)) {
            b2.f("head");
            return b2.c(o2);
        }
        if (o2.e()) {
            b2.n(this);
            return false;
        }
        b2.f("head");
        return b2.c(o2);
    }
}

