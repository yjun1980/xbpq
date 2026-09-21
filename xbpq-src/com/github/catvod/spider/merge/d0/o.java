/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;

final class o
extends A {
    @Override
    final boolean d(O o2, b b2) {
        Object object;
        block4: {
            block6: {
                block3: {
                    block5: {
                        block2: {
                            object = A.i;
                            if (!o2.b()) break block2;
                            b2.F((I)o2);
                            break block3;
                        }
                        if (o2.c()) break block4;
                        boolean bl = o2.f();
                        String string = cYh.d("0F242C3D");
                        if (bl && ((M)o2).c.equals(string)) break block4;
                        if (!A.a(o2)) break block5;
                        object = b2.V(string);
                        b2.E((H)o2);
                        b2.e.add((l)object);
                        b2.e.add(((l)object).k0(cYh.d("053F2528")));
                        break block3;
                    }
                    if (!o2.d()) break block6;
                }
                return true;
            }
            b2.n(this);
            b2.j0((A)((Object)object));
            return b2.c(o2);
        }
        return b2.X(o2, (A)((Object)object));
    }
}

