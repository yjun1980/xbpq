/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.z;

final class y
extends A {
    @Override
    final boolean d(O object, b b2) {
        String string;
        block18: {
            block27: {
                block23: {
                    String string2;
                    M m2;
                    block25: {
                        block26: {
                            block24: {
                                block22: {
                                    block20: {
                                        String string3;
                                        block21: {
                                            block19: {
                                                if (object.a()) {
                                                    b2.R();
                                                    b2.P();
                                                    b2.j0(A.l);
                                                    return b2.c((O)object);
                                                }
                                                if (object.b()) {
                                                    b2.F((I)object);
                                                    return true;
                                                }
                                                if (object.c()) {
                                                    b2.n(this);
                                                    return false;
                                                }
                                                boolean bl = object.f();
                                                string = cYh.d("1331233D32");
                                                if (!bl) break block18;
                                                m2 = (M)object;
                                                string2 = m2.c;
                                                if (!string2.equals(cYh.d("043131253E3509"))) break block19;
                                                b2.l();
                                                b2.J();
                                                b2.D(m2);
                                                object = A.m;
                                                break block20;
                                            }
                                            string3 = cYh.d("043F2D3625351220");
                                            if (!string2.equals(string3)) break block21;
                                            b2.l();
                                            b2.D(m2);
                                            object = A.n;
                                            break block20;
                                        }
                                        if (string2.equals(cYh.d("043F2D"))) {
                                            b2.f(string3);
                                            return b2.c((O)object);
                                        }
                                        if (!com.github.catvod.spider.merge.b0.b.b(string2, z.u)) break block22;
                                        b2.l();
                                        b2.D(m2);
                                        object = A.o;
                                    }
                                    b2.j0((A)((Object)object));
                                    break block23;
                                }
                                if (com.github.catvod.spider.merge.b0.b.b(string2, z.v)) {
                                    b2.f(cYh.d("13322E352E"));
                                    return b2.c((O)object);
                                }
                                if (!string2.equals(string)) break block24;
                                b2.n(this);
                                if (b2.d(string)) {
                                    return b2.c((O)object);
                                }
                                break block23;
                            }
                            if (com.github.catvod.spider.merge.b0.b.b(string2, z.w)) {
                                return b2.X((O)object, A.f);
                            }
                            if (!string2.equals(cYh.d("0E3E312423"))) break block25;
                            if (!m2.r() || !m2.j.j(cYh.d("13293134")).equalsIgnoreCase(cYh.d("0F3925353234"))) break block26;
                            b2.G(m2);
                            break block23;
                        }
                        return this.e((O)object, b2);
                    }
                    if (!string2.equals(cYh.d("013F333C"))) break block27;
                    b2.n(this);
                    if (b2.s() != null) {
                        return false;
                    }
                    b2.H(m2, false);
                }
                return true;
            }
            return this.e((O)object, b2);
        }
        if (object.e()) {
            String string4 = ((L)object).c;
            if (string4.equals(string)) {
                if (!b2.B(string4)) {
                    b2.n(this);
                    return false;
                }
                b2.V(string);
                b2.e0();
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string4, z.B)) {
                b2.n(this);
                return false;
            }
            return this.e((O)object, b2);
        }
        if (object.d()) {
            if (b2.a().d0().equals(cYh.d("0F242C3D"))) {
                b2.n(this);
            }
            return true;
        }
        return this.e((O)object, b2);
    }

    final boolean e(O o2, b b2) {
        boolean bl;
        w w2 = A.i;
        b2.n(this);
        if (com.github.catvod.spider.merge.b0.b.b(b2.a().d0(), z.C)) {
            b2.g0(true);
            bl = b2.X(o2, w2);
            b2.g0(false);
        } else {
            bl = b2.X(o2, w2);
        }
        return bl;
    }
}

