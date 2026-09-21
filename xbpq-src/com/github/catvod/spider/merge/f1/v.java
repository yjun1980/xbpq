/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;

final class v
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        Object object = B.d;
        if (p2.d()) {
            b2.r(this);
            return true;
        }
        if (p2.g() && ((N)p2).e.equals("html")) {
            return b2.d0(p2, B.g);
        }
        if (p2.f() && ((M)p2).e.equals("noscript")) {
            b2.Z();
            b2.s0((B)((Object)object));
            return true;
        }
        if (B.b(p2)) return b2.d0(p2, (B)((Object)((Object)object)));
        if (p2.c()) return b2.d0(p2, (B)((Object)((Object)object)));
        if (p2.g() && com.github.catvod.spider.merge.d1.c.c(((N)p2).e, A.f)) {
            return b2.d0(p2, (B)((Object)object));
        }
        if (p2.f() && ((M)p2).e.equals("br")) {
            b2.r(this);
            object = new I();
        } else {
            if (p2.g() && com.github.catvod.spider.merge.d1.c.c(((N)p2).e, A.I) || p2.f()) {
                b2.r(this);
                return false;
            }
            b2.r(this);
            object = new I();
        }
        ((I)object).k(p2.toString());
        b2.I((I)object);
        return true;
    }
}

