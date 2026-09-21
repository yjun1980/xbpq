/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import java.util.ArrayList;

public final class z
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        block28: {
            block31: {
                block30: {
                    String string;
                    u u2;
                    block29: {
                        block19: {
                            block26: {
                                block27: {
                                    block21: {
                                        String string2;
                                        L l2;
                                        block24: {
                                            block25: {
                                                block23: {
                                                    block22: {
                                                        block20: {
                                                            if (n2.a == 5 && com.github.catvod.spider.merge.xc.E0.b.c(b2.f().d.b, A.A)) {
                                                                b2.s = new ArrayList();
                                                                b2.m = b2.l;
                                                                b2.l = B.j;
                                                                return b2.D(n2);
                                                            }
                                                            if (n2.a()) {
                                                                b2.t((H)n2);
                                                                return true;
                                                            }
                                                            if (n2.b()) {
                                                                b2.h(this);
                                                                return false;
                                                            }
                                                            boolean bl = n2.e();
                                                            u2 = B.d;
                                                            if (!bl) break block19;
                                                            l2 = (L)n2;
                                                            string2 = l2.c;
                                                            if (!string2.equals("caption")) break block20;
                                                            b2.e();
                                                            b2.q.add(null);
                                                            b2.r(l2);
                                                            b2.l = B.k;
                                                            break block21;
                                                        }
                                                        if (!string2.equals("colgroup")) break block22;
                                                        b2.e();
                                                        b2.r(l2);
                                                        b2.l = B.l;
                                                        break block21;
                                                    }
                                                    if (string2.equals("col")) {
                                                        b2.e();
                                                        b2.G("colgroup");
                                                        return b2.D(n2);
                                                    }
                                                    if (!com.github.catvod.spider.merge.xc.E0.b.c(string2, A.s)) break block23;
                                                    b2.e();
                                                    b2.r(l2);
                                                    b2.l = B.m;
                                                    break block21;
                                                }
                                                if (com.github.catvod.spider.merge.xc.E0.b.c(string2, A.t)) {
                                                    b2.e();
                                                    b2.G("tbody");
                                                    return b2.D(n2);
                                                }
                                                if (string2.equals("table")) {
                                                    b2.h(this);
                                                    if (!b2.q(string2)) {
                                                        return false;
                                                    }
                                                    b2.B(string2);
                                                    if (!b2.M()) {
                                                        b2.r(l2);
                                                        return true;
                                                    }
                                                    return b2.D(n2);
                                                }
                                                if (com.github.catvod.spider.merge.xc.E0.b.c(string2, A.u)) {
                                                    b2.g = n2;
                                                    return u2.c(n2, b2);
                                                }
                                                if (!string2.equals("input")) break block24;
                                                if (!l2.l() || !l2.l.d("type").equalsIgnoreCase("hidden")) break block25;
                                                b2.u(l2);
                                                break block21;
                                            }
                                            this.d(n2, b2);
                                            return true;
                                        }
                                        if (!string2.equals("form")) break block26;
                                        b2.h(this);
                                        if (b2.p != null || b2.y("template")) break block27;
                                        b2.v(l2, false, false);
                                    }
                                    return true;
                                }
                                return false;
                            }
                            this.d(n2, b2);
                            return true;
                        }
                        if (!n2.d()) break block28;
                        string = ((K)n2).c;
                        if (!string.equals("table")) break block29;
                        if (!b2.q(string)) {
                            b2.h(this);
                            return false;
                        }
                        b2.B("table");
                        b2.M();
                        break block30;
                    }
                    if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.z)) {
                        b2.h(this);
                        return false;
                    }
                    if (!string.equals("template")) break block31;
                    b2.E(n2, u2);
                }
                return true;
            }
            this.d(n2, b2);
            return true;
        }
        if (n2.c()) {
            if (b2.g("html")) {
                b2.h(this);
            }
            return true;
        }
        this.d(n2, b2);
        return true;
    }

    public final void d(N n2, b b2) {
        b2.h(this);
        b2.v = true;
        b2.E(n2, B.g);
        b2.v = false;
    }
}

