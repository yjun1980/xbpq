/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.z;

final class v
extends A {
    private boolean e(O o2, b b2) {
        b2.f(cYh.d("053F2528"));
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
                                if (((String)object).equals(cYh.d("0F242C3D"))) {
                                    return b2.X(o2, w2);
                                }
                                if (!((String)object).equals(cYh.d("053F2528"))) break block8;
                                b2.D(m2);
                                b2.o(false);
                                b2.j0(w2);
                                break block4;
                            }
                            if (!((String)object).equals(cYh.d("0122203C32290224"))) break block9;
                            b2.D(m2);
                            b2.j0(A.u);
                            break block4;
                        }
                        if (!com.github.catvod.spider.merge.b0.b.b((String)object, z.g)) break block10;
                        b2.n(this);
                        object = b2.u();
                        b2.e.add((l)object);
                        b2.X(o2, A.f);
                        b2.c0((l)object);
                        break block4;
                    }
                    if (((String)object).equals(cYh.d("0F352035"))) {
                        b2.n(this);
                        return false;
                    }
                    break block11;
                }
                if (o2.e() && !com.github.catvod.spider.merge.b0.b.b(((L)o2).c, z.d)) {
                    b2.n(this);
                    return false;
                }
            }
            this.e(o2, b2);
        }
        return true;
    }
}

