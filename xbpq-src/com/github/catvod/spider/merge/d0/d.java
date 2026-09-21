/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.z;

final class d
extends A {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean d(O o2, b b2) {
        boolean bl = o2.e();
        String string = cYh.d("043131253E3509");
        if (bl) {
            L l2 = (L)o2;
            if (l2.c.equals(string)) {
                if (!b2.B(l2.c)) {
                    b2.n(this);
                    return false;
                }
                if (!b2.a().d0().equals(string)) {
                    b2.n(this);
                }
                b2.V(string);
                b2.i();
                b2.j0(A.k);
                return true;
            }
        }
        if (o2.f() && com.github.catvod.spider.merge.b0.b.b(((M)o2).c, z.A) || o2.e() && ((L)o2).c.equals(cYh.d("1331233D32"))) {
            b2.n(this);
            if (!b2.d(string)) return true;
            return b2.c(o2);
        }
        if (!o2.e() || !com.github.catvod.spider.merge.b0.b.b(((L)o2).c, z.L)) return b2.X(o2, A.i);
        b2.n(this);
        return false;
    }
}

