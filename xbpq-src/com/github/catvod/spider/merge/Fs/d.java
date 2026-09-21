/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.z;

final class d
extends A {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean d(O o2, b b2) {
        if (o2.e()) {
            L l2 = (L)o2;
            if (l2.c.equals("caption")) {
                if (!b2.B(l2.c)) {
                    b2.n(this);
                    return false;
                }
                if (!b2.a().d0().equals("caption")) {
                    b2.n(this);
                }
                b2.V("caption");
                b2.i();
                b2.j0(A.k);
                return true;
            }
        }
        if (o2.f() && com.github.catvod.spider.merge.Dw.e.b(((M)o2).c, z.A) || o2.e() && ((L)o2).c.equals("table")) {
            b2.n(this);
            if (!b2.d("caption")) return true;
            return b2.c(o2);
        }
        if (!o2.e() || !com.github.catvod.spider.merge.Dw.e.b(((L)o2).c, z.L)) return b2.X(o2, A.i);
        b2.n(this);
        return false;
    }
}

