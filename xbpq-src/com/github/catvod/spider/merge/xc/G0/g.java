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
import com.github.catvod.spider.merge.xc.G0.f;
import com.github.catvod.spider.merge.xc.G0.z;

public final class g
extends B {
    @Override
    public final boolean c(N n2, b b2) {
        z z2;
        block12: {
            String string;
            block14: {
                block15: {
                    block11: {
                        f f2;
                        boolean bl;
                        block13: {
                            boolean bl2;
                            block9: {
                                String string2;
                                block10: {
                                    boolean bl3 = n2.e();
                                    z2 = B.i;
                                    bl = false;
                                    bl2 = false;
                                    if (!bl3) break block9;
                                    L l2 = (L)n2;
                                    string2 = l2.c;
                                    if (!com.github.catvod.spider.merge.xc.E0.b.c(string2, A.v)) break block10;
                                    b2.d("tr", "template");
                                    b2.r(l2);
                                    b2.l = B.o;
                                    b2.q.add(null);
                                    break block11;
                                }
                                if (com.github.catvod.spider.merge.xc.E0.b.c(string2, A.D)) {
                                    bl = bl2;
                                    if (b2.F("tr")) {
                                        bl = b2.D(n2);
                                    }
                                    return bl;
                                }
                                b2.g = n2;
                                return z2.c(n2, b2);
                            }
                            if (!n2.d()) break block12;
                            string = ((K)n2).c;
                            bl2 = string.equals("tr");
                            f2 = B.m;
                            if (!bl2) break block13;
                            if (!b2.q(string)) {
                                b2.h(this);
                                return false;
                            }
                            b2.d("tr", "template");
                            b2.A();
                            b2.l = f2;
                            break block11;
                        }
                        if (string.equals("table")) {
                            if (b2.F("tr")) {
                                bl = b2.D(n2);
                            }
                            return bl;
                        }
                        if (!com.github.catvod.spider.merge.xc.E0.b.c(string, A.s)) break block14;
                        if (!b2.q(string) || !b2.q("tr")) break block15;
                        b2.d("tr", "template");
                        b2.A();
                        b2.l = f2;
                    }
                    return true;
                }
                b2.h(this);
                return false;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.E)) {
                b2.h(this);
                return false;
            }
            b2.g = n2;
            return z2.c(n2, b2);
        }
        b2.g = n2;
        return z2.c(n2, b2);
    }
}

