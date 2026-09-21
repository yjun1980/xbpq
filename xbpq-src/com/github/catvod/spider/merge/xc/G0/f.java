/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.z;
import com.github.catvod.spider.merge.xc.y0.a;

public final class f
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        String string;
        L l2;
        z z2;
        block12: {
            block11: {
                block9: {
                    String string2;
                    block10: {
                        int n3 = com.github.catvod.spider.merge.xc.y0.a.a(n2.a);
                        z2 = B.i;
                        if (n3 == 1) break block9;
                        if (n3 != 2) {
                            b2.g = n2;
                            return z2.c(n2, b2);
                        }
                        string2 = ((K)n2).c;
                        if (!com.github.catvod.spider.merge.xc.E0.b.c(string2, A.H)) break block10;
                        if (!b2.q(string2)) {
                            b2.h(this);
                            return false;
                        }
                        b2.d("tbody", "tfoot", "thead", "template");
                        b2.A();
                        b2.l = z2;
                        break block11;
                    }
                    if (string2.equals("table")) {
                        return this.d(n2, b2);
                    }
                    if (com.github.catvod.spider.merge.xc.E0.b.c(string2, A.C)) {
                        b2.h(this);
                        return false;
                    }
                    b2.g = n2;
                    return z2.c(n2, b2);
                }
                l2 = (L)n2;
                string = l2.c;
                if (!string.equals("tr")) break block12;
                b2.d("tbody", "tfoot", "thead", "template");
                b2.r(l2);
                b2.l = B.n;
            }
            return true;
        }
        if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.v)) {
            b2.h(this);
            b2.G("tr");
            return b2.D(l2);
        }
        if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.B)) {
            return this.d(n2, b2);
        }
        b2.g = n2;
        return z2.c(n2, b2);
    }

    public final boolean d(N n2, b b2) {
        if (!(b2.q("tbody") || b2.q("thead") || b2.n("tfoot"))) {
            b2.h(this);
            return false;
        }
        b2.d("tbody", "tfoot", "thead", "template");
        b2.F(b2.f().d.b);
        return b2.D(n2);
    }
}

