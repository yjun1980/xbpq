/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.z;

final class g
extends B {
    @Override
    final boolean i(P p2, b b2) {
        z z2;
        block13: {
            String string;
            block16: {
                block17: {
                    block12: {
                        Object object;
                        block15: {
                            boolean bl;
                            block14: {
                                block10: {
                                    boolean bl2;
                                    block11: {
                                        object = B.m;
                                        z2 = B.i;
                                        boolean bl3 = p2.g();
                                        bl = false;
                                        bl2 = false;
                                        if (!bl3) break block10;
                                        N n2 = (N)p2;
                                        object = n2.e;
                                        if (!com.github.catvod.spider.merge.d1.c.c((String)object, A.v)) break block11;
                                        b2.p();
                                        b2.H(n2);
                                        b2.s0(B.o);
                                        b2.N();
                                        break block12;
                                    }
                                    if (com.github.catvod.spider.merge.d1.c.c((String)object, A.D)) {
                                        bl = bl2;
                                        if (b2.f("tr")) {
                                            bl = b2.e(p2);
                                        }
                                        return bl;
                                    }
                                    return b2.d0(p2, z2);
                                }
                                if (!p2.f()) break block13;
                                string = ((M)p2).e;
                                if (!string.equals("tr")) break block14;
                                if (!b2.G(string)) {
                                    b2.r(this);
                                    return false;
                                }
                                break block15;
                            }
                            if (string.equals("table")) {
                                if (b2.f("tr")) {
                                    bl = b2.e(p2);
                                }
                                return bl;
                            }
                            if (!com.github.catvod.spider.merge.d1.c.c(string, A.s)) break block16;
                            if (!b2.G(string) || !b2.G("tr")) break block17;
                        }
                        b2.p();
                        b2.Z();
                        b2.s0((B)((Object)object));
                    }
                    return true;
                }
                b2.r(this);
                return false;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string, A.E)) {
                b2.r(this);
                return false;
            }
            return b2.d0(p2, z2);
        }
        return b2.d0(p2, z2);
    }
}

