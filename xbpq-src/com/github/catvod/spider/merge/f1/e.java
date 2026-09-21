/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

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

final class e
extends B {
    private boolean j(P p2, b b2) {
        if (!b2.b("colgroup")) {
            b2.r(this);
            return false;
        }
        b2.Z();
        b2.s0(B.i);
        b2.e(p2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        N n2;
        int n3;
        block23: {
            u u2;
            block18: {
                block22: {
                    block21: {
                        String string;
                        block19: {
                            block20: {
                                int n4;
                                block17: {
                                    u2 = B.d;
                                    if (B.b(p2)) {
                                        b2.I((I)p2);
                                        return true;
                                    }
                                    n4 = z.c(p2.a);
                                    if (n4 == 0) {
                                        b2.r(this);
                                        return true;
                                    }
                                    n3 = 0;
                                    if (n4 == 1) break block17;
                                    if (n4 != 2) {
                                        if (n4 == 3) {
                                            b2.J((J)p2);
                                            return true;
                                        }
                                        if (n4 != 5) {
                                            return this.j(p2, b2);
                                        }
                                        if (!b2.b("html")) return this.j(p2, b2);
                                        return true;
                                    }
                                    String string2 = ((M)p2).e;
                                    Objects.requireNonNull(string2);
                                    if (!string2.equals("template")) {
                                        if (!string2.equals("colgroup")) {
                                            return this.j(p2, b2);
                                        }
                                        if (!b2.b(string2)) {
                                            b2.r(this);
                                            return false;
                                        }
                                        b2.Z();
                                        b2.s0(B.i);
                                        return true;
                                    }
                                    break block18;
                                }
                                n2 = (N)p2;
                                string = n2.e;
                                Objects.requireNonNull(string);
                                n4 = string.hashCode();
                                if (n4 == -1321546630) break block19;
                                if (n4 == 98688) break block20;
                                if (n4 != 3213227 || !string.equals("html")) break block21;
                                n3 = 2;
                                break block22;
                            }
                            if (!string.equals("col")) break block21;
                            n3 = 1;
                            break block22;
                        }
                        if (string.equals("template")) break block22;
                    }
                    n3 = -1;
                }
                if (n3 != 0) break block23;
            }
            b2.d0(p2, u2);
            return true;
        }
        if (n3 != 1) {
            if (n3 == 2) return b2.d0(p2, B.g);
            return this.j(p2, b2);
        }
        b2.K(n2);
        return true;
    }
}

