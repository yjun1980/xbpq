/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.Fs.u;
import com.github.catvod.spider.merge.Fs.v;
import com.github.catvod.spider.merge.Fs.x;
import com.github.catvod.spider.merge.Fs.z;

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
                int n2 = com.github.catvod.spider.merge.Dw.h.a(object.a);
                if (n2 == 0) {
                    var2_6.n(this);
                    return false;
                }
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            var2_6.d("head");
                            return var2_6.c((O)object);
                        }
                        var2_6.F((I)object);
                        return true;
                    }
                    String string2 = ((L)object).c;
                    if (string2.equals("head")) {
                        var2_6.U();
                        v v2 = A.h;
                        break block19;
                    } else {
                        if (com.github.catvod.spider.merge.Dw.e.b(string2, z.c)) {
                            var2_6.d("head");
                            return var2_6.c((O)object);
                        }
                        var2_6.n(this);
                        return false;
                    }
                }
                m2 = (M)object;
                string = m2.c;
                if (string.equals("html")) {
                    return A.i.d((O)object, (b)var2_6);
                }
                if (com.github.catvod.spider.merge.Dw.e.b(string, z.a)) {
                    l l2 = var2_6.G(m2);
                    if (!string.equals("base")) return true;
                    if (!l2.o("href")) return true;
                    var2_6.Q(l2);
                    return true;
                }
                if (string.equals("meta")) {
                    var2_6.G(m2);
                    return true;
                }
                if (string.equals("title")) {
                    var2_6.c.u(h1.e);
                    var2_6.P();
                    var2_6.j0(x2);
                    var2_6.D(m2);
                    return true;
                }
                if (com.github.catvod.spider.merge.Dw.e.b(string, z.b)) {
                    A.b(m2, (b)var2_6);
                    return true;
                }
                if (!string.equals("noscript")) break block20;
                var2_6.D(m2);
                u u2 = A.g;
            }
            var2_6.j0((A)var1_3);
            return true;
        }
        if (string.equals("script")) {
            var2_6.c.u(h1.h);
            var2_6.P();
            var2_6.j0(x2);
            var2_6.D(m2);
            return true;
        }
        if (string.equals("head")) {
            var2_6.n(this);
            return false;
        }
        var2_6.d("head");
        return var2_6.c((O)object);
    }
}

