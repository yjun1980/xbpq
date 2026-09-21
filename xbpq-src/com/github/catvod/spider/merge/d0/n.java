/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;

final class n
extends A {
    @Override
    final boolean d(O o2, b b2) {
        block14: {
            block8: {
                block13: {
                    Object object;
                    block11: {
                        block12: {
                            block10: {
                                block9: {
                                    block7: {
                                        if (!A.a(o2)) break block7;
                                        b2.E((H)o2);
                                        break block8;
                                    }
                                    if (!o2.b()) break block9;
                                    b2.F((I)o2);
                                    break block8;
                                }
                                if (o2.c()) {
                                    b2.n(this);
                                    return false;
                                }
                                boolean bl = o2.f();
                                object = cYh.d("0F242C3D");
                                if (!bl || !((M)o2).c.equals(object)) break block10;
                                object = A.i;
                                break block11;
                            }
                            if (!o2.e() || !((L)o2).c.equals(object)) break block12;
                            b2.j0(A.x);
                            break block8;
                        }
                        if (!o2.f() || !((M)o2).c.equals(cYh.d("093F272336370223"))) break block13;
                        object = A.f;
                    }
                    return b2.X(o2, (A)((Object)object));
                }
                if (!o2.d()) break block14;
            }
            return true;
        }
        b2.n(this);
        return false;
    }
}

