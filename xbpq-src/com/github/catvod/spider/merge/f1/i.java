/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.u;
import com.github.catvod.spider.merge.y.z;
import java.util.Objects;

final class i
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        String string;
        N n2;
        u u2;
        block41: {
            block40: {
                block39: {
                    block35: {
                        block34: {
                            block38: {
                                block36: {
                                    String string2;
                                    block37: {
                                        u2 = B.d;
                                        int n3 = z.c(p2.a);
                                        if (n3 == 0) {
                                            b2.r(this);
                                            return false;
                                        }
                                        if (n3 == 1) break block35;
                                        if (n3 != 2) {
                                            if (n3 == 3) {
                                                b2.J((J)p2);
                                                return true;
                                            }
                                            if (n3 != 4) {
                                                if (n3 != 5) {
                                                    b2.r(this);
                                                    return false;
                                                }
                                                if (b2.b("html")) return true;
                                                break block34;
                                            } else {
                                                if (((I)(p2 = (I)p2)).l().equals(B.h())) {
                                                    b2.r(this);
                                                    return false;
                                                }
                                                b2.I((I)p2);
                                                return true;
                                            }
                                        }
                                        string2 = ((M)p2).e;
                                        Objects.requireNonNull(string2);
                                        int n4 = string2.hashCode();
                                        n3 = -1;
                                        switch (n4) {
                                            default: {
                                                break;
                                            }
                                            case -80773204: {
                                                if (!string2.equals("optgroup")) break;
                                                n3 = 3;
                                                break;
                                            }
                                            case -906021636: {
                                                if (!string2.equals("select")) break;
                                                n3 = 2;
                                                break;
                                            }
                                            case -1010136971: {
                                                if (!string2.equals("option")) break;
                                                n3 = 1;
                                                break;
                                            }
                                            case -1321546630: {
                                                if (!string2.equals("template")) break;
                                                n3 = 0;
                                            }
                                        }
                                        if (n3 == 0) return b2.d0(p2, u2);
                                        if (n3 == 1) break block36;
                                        if (n3 == 2) break block37;
                                        if (n3 != 3) {
                                            b2.r(this);
                                            return false;
                                        }
                                        if (b2.b("option") && b2.j(b2.a()) != null && b2.j(b2.a()).g0().equals("optgroup")) {
                                            b2.f("option");
                                        }
                                        if (!b2.b("optgroup")) break block34;
                                        break block38;
                                    }
                                    if (!b2.E(string2)) {
                                        b2.r(this);
                                        return false;
                                    }
                                    b2.a0(string2);
                                    b2.m0();
                                    return true;
                                }
                                if (!b2.b("option")) break block34;
                            }
                            b2.Z();
                            return true;
                        }
                        b2.r(this);
                        return true;
                    }
                    n2 = (N)p2;
                    string = n2.e;
                    if (string.equals("html")) {
                        return b2.d0(n2, B.g);
                    }
                    if (!string.equals("option")) break block39;
                    if (b2.b("option")) {
                        b2.f("option");
                    }
                    break block40;
                }
                if (!string.equals("optgroup")) break block41;
                if (b2.b("option")) {
                    b2.f("option");
                }
                if (b2.b("optgroup")) {
                    b2.f("optgroup");
                }
            }
            b2.H(n2);
            return true;
        }
        if (string.equals("select")) {
            b2.r(this);
            return b2.f("select");
        }
        if (com.github.catvod.spider.merge.d1.c.c(string, A.F)) {
            b2.r(this);
            if (!b2.E("select")) {
                return false;
            }
            b2.f("select");
            return b2.e(n2);
        }
        if (string.equals("script")) return b2.d0(p2, u2);
        if (string.equals("template")) {
            return b2.d0(p2, u2);
        }
        b2.r(this);
        return false;
    }
}

