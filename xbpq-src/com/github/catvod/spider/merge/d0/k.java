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
import com.github.catvod.spider.merge.d0.w;

final class k
extends A {
    @Override
    final boolean d(O o2, b b2) {
        w w2;
        block9: {
            block6: {
                block8: {
                    block7: {
                        block5: {
                            w2 = A.i;
                            if (!A.a(o2)) break block5;
                            b2.E((H)o2);
                            break block6;
                        }
                        if (!o2.b()) break block7;
                        b2.F((I)o2);
                        break block6;
                    }
                    if (o2.c()) {
                        b2.n(this);
                        return false;
                    }
                    boolean bl = o2.f();
                    String string = cYh.d("0F242C3D");
                    if (bl && ((M)o2).c.equals(string)) {
                        return b2.X(o2, w2);
                    }
                    if (!o2.e() || !((L)o2).c.equals(string)) break block8;
                    b2.getClass();
                    b2.j0(A.w);
                    break block6;
                }
                if (!o2.d()) break block9;
            }
            return true;
        }
        b2.n(this);
        b2.j0(w2);
        return b2.c(o2);
    }
}

