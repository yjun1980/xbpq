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
import com.github.catvod.spider.merge.d0.s;
import com.github.catvod.spider.merge.d0.z;

final class r
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O o2, b b2) {
        s s2 = A.e;
        if (o2.c()) {
            b2.n(this);
            return false;
        }
        if (o2.b()) {
            b2.F((I)o2);
            return true;
        }
        if (A.a(o2)) {
            b2.E((H)o2);
            return true;
        }
        boolean bl = o2.f();
        String string = cYh.d("0F242C3D");
        if (bl) {
            M m2 = (M)o2;
            if (m2.c.equals(string)) {
                b2.D(m2);
                b2.j0(s2);
                return true;
            }
        }
        if (o2.e() && com.github.catvod.spider.merge.b0.b.b(((L)o2).c, z.e) || !o2.e()) {
            b2.L(string);
            b2.j0(s2);
            return b2.c(o2);
        }
        b2.n(this);
        return false;
    }
}

