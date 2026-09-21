/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.y;
import com.github.catvod.spider.merge.d0.z;

final class g
extends A {
    @Override
    final boolean d(O o2, b b2) {
        y y2;
        block14: {
            String string;
            block17: {
                block18: {
                    block12: {
                        Object object;
                        block16: {
                            boolean bl;
                            String string2;
                            block15: {
                                block10: {
                                    boolean bl2;
                                    block13: {
                                        M m2;
                                        block11: {
                                            object = A.o;
                                            y2 = A.k;
                                            boolean bl3 = o2.f();
                                            string2 = cYh.d("1322");
                                            bl = false;
                                            bl2 = false;
                                            if (!bl3) break block10;
                                            m2 = (M)o2;
                                            object = m2.c;
                                            if (!((String)object).equals(cYh.d("13352C213B3B1335"))) break block11;
                                            b2.D(m2);
                                            break block12;
                                        }
                                        if (!com.github.catvod.spider.merge.b0.b.b((String)object, z.x)) break block13;
                                        b2.m();
                                        b2.D(m2);
                                        b2.j0(A.q);
                                        b2.J();
                                        break block12;
                                    }
                                    if (com.github.catvod.spider.merge.b0.b.b((String)object, z.F)) {
                                        bl = bl2;
                                        if (b2.d(string2)) {
                                            bl = b2.c(o2);
                                        }
                                        return bl;
                                    }
                                    return b2.X(o2, y2);
                                }
                                if (!o2.e()) break block14;
                                string = ((L)o2).c;
                                if (!string.equals(string2)) break block15;
                                if (!b2.B(string)) {
                                    b2.n(this);
                                    return false;
                                }
                                break block16;
                            }
                            if (string.equals(cYh.d("1331233D32"))) {
                                if (b2.d(string2)) {
                                    bl = b2.c(o2);
                                }
                                return bl;
                            }
                            if (!com.github.catvod.spider.merge.b0.b.b(string, z.u)) break block17;
                            if (!b2.B(string) || !b2.B(string2)) break block18;
                        }
                        b2.m();
                        b2.U();
                        b2.j0((A)((Object)object));
                    }
                    return true;
                }
                b2.n(this);
                return false;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string, z.G)) {
                b2.n(this);
                return false;
            }
            return b2.X(o2, y2);
        }
        return b2.X(o2, y2);
    }
}

