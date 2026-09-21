/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.u;

final class z
extends B {
    @Override
    final boolean i(P object, b b2) {
        block33: {
            block36: {
                block35: {
                    String string;
                    u u2;
                    block34: {
                        block21: {
                            block31: {
                                block32: {
                                    block27: {
                                        String string2;
                                        N n2;
                                        block29: {
                                            block30: {
                                                block28: {
                                                    block20: {
                                                        block26: {
                                                            block23: {
                                                                block25: {
                                                                    block24: {
                                                                        block22: {
                                                                            block19: {
                                                                                u2 = B.d;
                                                                                if (!object.b() || !com.github.catvod.spider.merge.d1.c.c(b2.a().g0(), A.A)) break block19;
                                                                                b2.U();
                                                                                b2.S();
                                                                                b2.s0(B.j);
                                                                                break block20;
                                                                            }
                                                                            if (object.c()) {
                                                                                b2.J((J)object);
                                                                                return true;
                                                                            }
                                                                            if (object.d()) {
                                                                                b2.r(this);
                                                                                return false;
                                                                            }
                                                                            if (!object.g()) break block21;
                                                                            n2 = (N)object;
                                                                            string2 = n2.e;
                                                                            if (!string2.equals("caption")) break block22;
                                                                            b2.o();
                                                                            b2.N();
                                                                            b2.H(n2);
                                                                            object = B.k;
                                                                            break block23;
                                                                        }
                                                                        if (!string2.equals("colgroup")) break block24;
                                                                        b2.o();
                                                                        b2.H(n2);
                                                                        object = B.l;
                                                                        break block23;
                                                                    }
                                                                    if (!string2.equals("col")) break block25;
                                                                    b2.o();
                                                                    b2.h("colgroup");
                                                                    break block20;
                                                                }
                                                                if (!com.github.catvod.spider.merge.d1.c.c(string2, A.s)) break block26;
                                                                b2.o();
                                                                b2.H(n2);
                                                                object = B.m;
                                                            }
                                                            b2.s0((B)((Object)object));
                                                            break block27;
                                                        }
                                                        if (!com.github.catvod.spider.merge.d1.c.c(string2, A.t)) break block28;
                                                        b2.o();
                                                        b2.h("tbody");
                                                    }
                                                    return b2.e((P)object);
                                                }
                                                if (string2.equals("table")) {
                                                    b2.r(this);
                                                    if (!b2.G(string2)) {
                                                        return false;
                                                    }
                                                    b2.a0(string2);
                                                    if (!b2.m0()) {
                                                        b2.H(n2);
                                                        return true;
                                                    }
                                                    return b2.e((P)object);
                                                }
                                                if (com.github.catvod.spider.merge.d1.c.c(string2, A.u)) {
                                                    return b2.d0((P)object, u2);
                                                }
                                                if (!string2.equals("input")) break block29;
                                                if (!n2.u() || !n2.n.o("type").equalsIgnoreCase("hidden")) break block30;
                                                b2.K(n2);
                                                break block27;
                                            }
                                            this.j((P)object, b2);
                                            return true;
                                        }
                                        if (!string2.equals("form")) break block31;
                                        b2.r(this);
                                        if (b2.x() != null || b2.W("template")) break block32;
                                        b2.L(n2, false, false);
                                    }
                                    return true;
                                }
                                return false;
                            }
                            this.j((P)object, b2);
                            return true;
                        }
                        if (!object.f()) break block33;
                        string = ((M)object).e;
                        if (!string.equals("table")) break block34;
                        if (!b2.G(string)) {
                            b2.r(this);
                            return false;
                        }
                        b2.a0("table");
                        b2.m0();
                        break block35;
                    }
                    if (com.github.catvod.spider.merge.d1.c.c(string, A.z)) {
                        b2.r(this);
                        return false;
                    }
                    if (!string.equals("template")) break block36;
                    b2.d0((P)object, u2);
                }
                return true;
            }
            this.j((P)object, b2);
            return true;
        }
        if (object.e()) {
            if (b2.b("html")) {
                b2.r(this);
            }
            return true;
        }
        this.j((P)object, b2);
        return true;
    }

    final void j(P p2, b b2) {
        b2.r(this);
        b2.o0(true);
        b2.d0(p2, B.g);
        b2.o0(false);
    }
}

