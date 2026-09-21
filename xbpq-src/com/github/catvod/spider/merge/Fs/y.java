/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.w;
import com.github.catvod.spider.merge.Fs.z;

final class y
extends A {
    @Override
    final boolean d(O object, b b2) {
        block18: {
            block27: {
                block23: {
                    String string;
                    M m2;
                    block25: {
                        block26: {
                            block24: {
                                block22: {
                                    block20: {
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
                                                if (!object.f()) break block18;
                                                m2 = (M)object;
                                                string = m2.c;
                                                if (!string.equals("caption")) break block19;
                                                b2.l();
                                                b2.J();
                                                b2.D(m2);
                                                object = A.m;
                                                break block20;
                                            }
                                            if (!string.equals("colgroup")) break block21;
                                            b2.l();
                                            b2.D(m2);
                                            object = A.n;
                                            break block20;
                                        }
                                        if (string.equals("col")) {
                                            b2.f("colgroup");
                                            return b2.c((O)object);
                                        }
                                        if (!com.github.catvod.spider.merge.Dw.e.b(string, z.u)) break block22;
                                        b2.l();
                                        b2.D(m2);
                                        object = A.o;
                                    }
                                    b2.j0((A)((Object)object));
                                    break block23;
                                }
                                if (com.github.catvod.spider.merge.Dw.e.b(string, z.v)) {
                                    b2.f("tbody");
                                    return b2.c((O)object);
                                }
                                if (!string.equals("table")) break block24;
                                b2.n(this);
                                if (b2.d("table")) {
                                    return b2.c((O)object);
                                }
                                break block23;
                            }
                            if (com.github.catvod.spider.merge.Dw.e.b(string, z.w)) {
                                return b2.X((O)object, A.f);
                            }
                            if (!string.equals("input")) break block25;
                            if (!m2.r() || !m2.j.j("type").equalsIgnoreCase("hidden")) break block26;
                            b2.G(m2);
                            break block23;
                        }
                        return this.e((O)object, b2);
                    }
                    if (!string.equals("form")) break block27;
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
            String string = ((L)object).c;
            if (string.equals("table")) {
                if (!b2.B(string)) {
                    b2.n(this);
                    return false;
                }
                b2.V("table");
                b2.e0();
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(string, z.B)) {
                b2.n(this);
                return false;
            }
            return this.e((O)object, b2);
        }
        if (object.d()) {
            if (b2.a().d0().equals("html")) {
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
        if (com.github.catvod.spider.merge.Dw.e.b(b2.a().d0(), z.C)) {
            b2.g0(true);
            bl = b2.X(o2, w2);
            b2.g0(false);
        } else {
            bl = b2.X(o2, w2);
        }
        return bl;
    }
}

