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
import com.github.catvod.spider.merge.xc.G0.e;
import com.github.catvod.spider.merge.xc.G0.f;
import com.github.catvod.spider.merge.xc.G0.g;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;
import com.github.catvod.spider.merge.xc.G0.z;
import com.github.catvod.spider.merge.xc.y0.a;

public final class k
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean c(N n2, b b2) {
        x x2;
        block13: {
            int n3 = com.github.catvod.spider.merge.xc.y0.a.a(n2.a);
            x2 = B.g;
            if (n3 != 0) {
                u u2 = B.d;
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3 && n3 != 4) {
                            if (n3 != 5) {
                                return true;
                            }
                            if (!b2.y("template")) {
                                return true;
                            }
                            b2.h(this);
                            b2.B("template");
                            b2.c();
                            b2.C();
                            b2.M();
                            if (b2.l == B.r) return true;
                            if (b2.r.size() >= 12) return true;
                            return b2.D(n2);
                        }
                        break block13;
                    } else {
                        if (((K)n2).c.equals("template")) {
                            b2.E(n2, u2);
                            return true;
                        }
                        b2.h(this);
                        return false;
                    }
                }
                String string = ((L)n2).c;
                if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.K)) {
                    b2.E(n2, u2);
                    return true;
                }
                if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.L)) {
                    b2.C();
                    z z2 = B.i;
                    b2.H(z2);
                    b2.l = z2;
                    return b2.D(n2);
                }
                if (string.equals("col")) {
                    b2.C();
                    e e2 = B.l;
                    b2.H(e2);
                    b2.l = e2;
                    return b2.D(n2);
                }
                if (string.equals("tr")) {
                    b2.C();
                    f f2 = B.m;
                    b2.H(f2);
                    b2.l = f2;
                    return b2.D(n2);
                }
                if (!string.equals("td") && !string.equals("th")) {
                    b2.C();
                    b2.H(x2);
                    b2.l = x2;
                    return b2.D(n2);
                }
                b2.C();
                g g2 = B.n;
                b2.H(g2);
                b2.l = g2;
                return b2.D(n2);
            }
        }
        b2.E(n2, x2);
        return true;
    }
}

