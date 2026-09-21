/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.w;

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
                    if (o2.f() && ((M)o2).c.equals("html")) {
                        return b2.X(o2, w2);
                    }
                    if (!o2.e() || !((L)o2).c.equals("html")) break block8;
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

