/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.N;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.y;
import com.github.catvod.spider.merge.Fs.z;

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
                            block15: {
                                block10: {
                                    String string2;
                                    boolean bl2;
                                    block13: {
                                        block11: {
                                            object = A.o;
                                            y2 = A.k;
                                            boolean bl3 = o2.f();
                                            bl = false;
                                            bl2 = false;
                                            if (!bl3) break block10;
                                            object = (M)o2;
                                            string2 = ((N)object).c;
                                            if (!string2.equals("template")) break block11;
                                            b2.D((M)object);
                                            break block12;
                                        }
                                        if (!com.github.catvod.spider.merge.Dw.e.b(string2, z.x)) break block13;
                                        b2.m();
                                        b2.D((M)object);
                                        b2.j0(A.q);
                                        b2.J();
                                        break block12;
                                    }
                                    if (com.github.catvod.spider.merge.Dw.e.b(string2, z.F)) {
                                        bl = bl2;
                                        if (b2.d("tr")) {
                                            bl = b2.c(o2);
                                        }
                                        return bl;
                                    }
                                    return b2.X(o2, y2);
                                }
                                if (!o2.e()) break block14;
                                string = ((L)o2).c;
                                if (!string.equals("tr")) break block15;
                                if (!b2.B(string)) {
                                    b2.n(this);
                                    return false;
                                }
                                break block16;
                            }
                            if (string.equals("table")) {
                                if (b2.d("tr")) {
                                    bl = b2.c(o2);
                                }
                                return bl;
                            }
                            if (!com.github.catvod.spider.merge.Dw.e.b(string, z.u)) break block17;
                            if (!b2.B(string) || !b2.B("tr")) break block18;
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
            if (com.github.catvod.spider.merge.Dw.e.b(string, z.G)) {
                b2.n(this);
                return false;
            }
            return b2.X(o2, y2);
        }
        return b2.X(o2, y2);
    }
}

