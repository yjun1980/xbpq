/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.z;

final class u
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O o2, b b2) {
        Object object = A.f;
        if (o2.c()) {
            b2.n(this);
            return true;
        }
        if (o2.f() && ((M)o2).c.equals(cYh.d("0F242C3D"))) {
            return b2.X(o2, A.i);
        }
        if (o2.e() && ((L)o2).c.equals(cYh.d("093F323225331724"))) {
            b2.U();
            b2.j0((A)((Object)object));
            return true;
        }
        if (A.a(o2)) return b2.X(o2, (A)((Object)((Object)object)));
        if (o2.b()) return b2.X(o2, (A)((Object)((Object)object)));
        if (o2.f() && com.github.catvod.spider.merge.b0.b.b(((M)o2).c, z.f)) {
            return b2.X(o2, (A)((Object)object));
        }
        if (o2.e() && ((L)o2).c.equals(cYh.d("0522"))) {
            b2.n(this);
            object = new H();
        } else {
            if (o2.f() && com.github.catvod.spider.merge.b0.b.b(((M)o2).c, z.K) || o2.e()) {
                b2.n(this);
                return false;
            }
            b2.n(this);
            object = new H();
        }
        ((H)object).i(o2.toString());
        b2.E((H)object);
        return true;
    }
}

