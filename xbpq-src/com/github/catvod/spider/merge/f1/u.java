/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.k;
import com.github.catvod.spider.merge.f1.v;
import com.github.catvod.spider.merge.f1.w;
import com.github.catvod.spider.merge.f1.y;
import com.github.catvod.spider.merge.y.z;

final class u
extends B {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P object, b b2) {
        String string;
        N n2;
        void var2_7;
        y y2;
        block24: {
            void var1_3;
            block23: {
                y2 = B.h;
                if (B.b(object)) {
                    var2_7.I((I)object);
                    return true;
                }
                int n3 = z.c(object.a);
                if (n3 == 0) {
                    var2_7.r(this);
                    return false;
                }
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            var2_7.f("head");
                            return var2_7.e((P)object);
                        }
                        var2_7.J((J)object);
                        return true;
                    }
                    String string2 = ((M)object).e;
                    if (string2.equals("head")) {
                        var2_7.Z();
                        w w2 = B.f;
                        break block23;
                    } else {
                        if (com.github.catvod.spider.merge.d1.c.c(string2, A.c)) {
                            var2_7.f("head");
                            return var2_7.e((P)object);
                        }
                        if (!string2.equals("template")) {
                            var2_7.r(this);
                            return false;
                        }
                        if (!var2_7.W(string2)) {
                            var2_7.r(this);
                            return true;
                        }
                        var2_7.v(true);
                        if (!string2.equals(var2_7.a().g0())) {
                            var2_7.r(this);
                        }
                        var2_7.a0(string2);
                        var2_7.l();
                        var2_7.b0();
                        var2_7.m0();
                        return true;
                    }
                }
                n2 = (N)object;
                string = n2.e;
                if (string.equals("html")) {
                    return B.g.i((P)object, (b)var2_7);
                }
                if (com.github.catvod.spider.merge.d1.c.c(string, A.a)) {
                    m m2 = var2_7.K(n2);
                    if (!string.equals("base")) return true;
                    if (!m2.n("href")) return true;
                    var2_7.T(m2);
                    return true;
                }
                if (string.equals("meta")) {
                    var2_7.K(n2);
                    return true;
                }
                if (string.equals("title")) {
                    var2_7.c.v(i1.c);
                    var2_7.S();
                    var2_7.s0(y2);
                    var2_7.H(n2);
                    return true;
                }
                if (com.github.catvod.spider.merge.d1.c.c(string, A.b)) {
                    B.e(n2, (b)var2_7);
                    return true;
                }
                if (!string.equals("noscript")) break block24;
                var2_7.H(n2);
                v v2 = B.e;
            }
            var2_7.s0((B)var1_3);
            return true;
        }
        if (string.equals("script")) {
            var2_7.c.v(i1.f);
            var2_7.S();
            var2_7.s0(y2);
            var2_7.H(n2);
            return true;
        }
        if (string.equals("head")) {
            var2_7.r(this);
            return false;
        }
        if (string.equals("template")) {
            var2_7.H(n2);
            var2_7.N();
            var2_7.s(false);
            k k2 = B.r;
            var2_7.s0(k2);
            var2_7.f0(k2);
            return true;
        }
        var2_7.f("head");
        return var2_7.e((P)object);
    }
}

