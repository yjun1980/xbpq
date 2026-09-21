/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.w;
import com.github.catvod.spider.merge.Fs.z;

final class v
extends A {
    private boolean e(O o2, b b2) {
        b2.f("body");
        b2.o(true);
        return b2.c(o2);
    }

    @Override
    final boolean d(O o2, b b2) {
        block4: {
            block11: {
                block7: {
                    Object object;
                    block10: {
                        block9: {
                            M m2;
                            block8: {
                                w w2;
                                block6: {
                                    block5: {
                                        block3: {
                                            w2 = A.i;
                                            if (!A.a(o2)) break block3;
                                            b2.E((H)o2);
                                            break block4;
                                        }
                                        if (!o2.b()) break block5;
                                        b2.F((I)o2);
                                        break block4;
                                    }
                                    if (!o2.c()) break block6;
                                    b2.n(this);
                                    break block4;
                                }
                                if (!o2.f()) break block7;
                                m2 = (M)o2;
                                object = m2.c;
                                if (((String)object).equals("html")) {
                                    return b2.X(o2, w2);
                                }
                                if (!((String)object).equals("body")) break block8;
                                b2.D(m2);
                                b2.o(false);
                                b2.j0(w2);
                                break block4;
                            }
                            if (!((String)object).equals("frameset")) break block9;
                            b2.D(m2);
                            b2.j0(A.u);
                            break block4;
                        }
                        if (!com.github.catvod.spider.merge.Dw.e.b((String)object, z.g)) break block10;
                        b2.n(this);
                        object = b2.u();
                        b2.e.add((l)object);
                        b2.X(o2, A.f);
                        b2.c0((l)object);
                        break block4;
                    }
                    if (((String)object).equals("head")) {
                        b2.n(this);
                        return false;
                    }
                    break block11;
                }
                if (o2.e() && !com.github.catvod.spider.merge.Dw.e.b(((L)o2).c, z.d)) {
                    b2.n(this);
                    return false;
                }
            }
            this.e(o2, b2);
        }
        return true;
    }
}

