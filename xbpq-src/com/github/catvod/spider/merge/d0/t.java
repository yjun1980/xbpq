/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.h1;
import com.github.catvod.spider.merge.d0.u;
import com.github.catvod.spider.merge.d0.v;
import com.github.catvod.spider.merge.d0.x;
import com.github.catvod.spider.merge.d0.z;
import com.github.catvod.spider.merge.l.a;

final class t
extends A {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O object, b b2) {
        String string;
        M m2;
        String string2;
        void var2_6;
        x x2;
        block20: {
            void var1_3;
            block19: {
                x2 = A.j;
                if (A.a(object)) {
                    var2_6.E((H)object);
                    return true;
                }
                int n2 = a.a(object.a);
                if (n2 == 0) {
                    var2_6.n(this);
                    return false;
                }
                string2 = cYh.d("0F352035");
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            var2_6.d(string2);
                            return var2_6.c((O)object);
                        }
                        var2_6.F((I)object);
                        return true;
                    }
                    String string3 = ((L)object).c;
                    if (string3.equals(string2)) {
                        var2_6.U();
                        v v2 = A.h;
                        break block19;
                    } else {
                        if (com.github.catvod.spider.merge.b0.b.b(string3, z.c)) {
                            var2_6.d(string2);
                            return var2_6.c((O)object);
                        }
                        var2_6.n(this);
                        return false;
                    }
                }
                m2 = (M)object;
                string = m2.c;
                if (string.equals(cYh.d("0F242C3D"))) {
                    return A.i.d((O)object, (b)var2_6);
                }
                if (com.github.catvod.spider.merge.b0.b.b(string, z.a)) {
                    l l2 = var2_6.G(m2);
                    if (!string.equals(cYh.d("05313234"))) return true;
                    if (!l2.o(cYh.d("0F222437"))) return true;
                    var2_6.Q(l2);
                    return true;
                }
                if (string.equals(cYh.d("0A353530"))) {
                    var2_6.G(m2);
                    return true;
                }
                if (string.equals(cYh.d("1339353D32"))) {
                    var2_6.c.u(h1.e);
                    var2_6.P();
                    var2_6.j0(x2);
                    var2_6.D(m2);
                    return true;
                }
                if (com.github.catvod.spider.merge.b0.b.b(string, z.b)) {
                    A.b(m2, (b)var2_6);
                    return true;
                }
                if (!string.equals(cYh.d("093F323225331724"))) break block20;
                var2_6.D(m2);
                u u2 = A.g;
            }
            var2_6.j0((A)var1_3);
            return true;
        }
        if (string.equals(cYh.d("14333338272E"))) {
            var2_6.c.u(h1.h);
            var2_6.P();
            var2_6.j0(x2);
            var2_6.D(m2);
            return true;
        }
        if (string.equals(string2)) {
            var2_6.n(this);
            return false;
        }
        var2_6.d(string2);
        return var2_6.c((O)object);
    }
}

