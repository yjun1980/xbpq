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
import com.github.catvod.spider.merge.d0.t;
import com.github.catvod.spider.merge.d0.w;

final class l
extends A {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean d(O object, b b2) {
        void var2_6;
        if (A.a((O)object)) {
            var2_6.E((H)object);
            return true;
        }
        if (((O)object).b()) {
            var2_6.F((I)object);
            return true;
        }
        if (((O)object).c()) {
            var2_6.n(this);
            return false;
        }
        boolean bl = ((O)object).f();
        String string = cYh.d("0122203C32290224");
        String string2 = cYh.d("0F242C3D");
        if (bl) {
            M m2 = (M)object;
            String string3 = m2.c;
            string3.getClass();
            int n2 = -1;
            switch (string3.hashCode()) {
                default: {
                    break;
                }
                case 1192721831: {
                    if (!string3.equals(cYh.d("093F272336370223"))) break;
                    n2 = 3;
                    break;
                }
                case 97692013: {
                    if (!string3.equals(cYh.d("0122203C32"))) break;
                    n2 = 2;
                    break;
                }
                case 3213227: {
                    if (!string3.equals(string2)) break;
                    n2 = 1;
                    break;
                }
                case -1644953643: {
                    if (!string3.equals(string)) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    var2_6.n(this);
                    return false;
                }
                case 3: {
                    void var1_5;
                    t t2 = A.f;
                    return var2_6.X(m2, (A)var1_5);
                }
                case 2: {
                    var2_6.G(m2);
                    return true;
                }
                case 1: {
                    void var1_5;
                    w w2 = A.i;
                    return var2_6.X(m2, (A)var1_5);
                }
                case 0: 
            }
            var2_6.D(m2);
            return true;
        }
        if (((O)object).e() && ((L)object).c.equals(string)) {
            if (var2_6.a().d0().equals(string2)) {
                var2_6.n(this);
                return false;
            }
            var2_6.U();
            if (var2_6.a().d0().equals(string)) return true;
            var2_6.j0(A.v);
            return true;
        }
        if (((O)object).d()) {
            if (var2_6.a().d0().equals(string2)) return true;
            var2_6.n(this);
            return true;
        }
        var2_6.n(this);
        return false;
    }
}

