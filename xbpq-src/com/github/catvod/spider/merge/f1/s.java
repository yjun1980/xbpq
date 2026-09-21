/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.t;

final class s
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        t t2 = B.c;
        if (p2.d()) {
            b2.r(this);
            return false;
        }
        if (p2.c()) {
            b2.J((J)p2);
            return true;
        }
        if (B.b(p2)) {
            b2.I((I)p2);
            return true;
        }
        if (p2.g()) {
            N n2 = (N)p2;
            if (n2.e.equals("html")) {
                b2.H(n2);
                b2.s0(t2);
                return true;
            }
        }
        if (p2.f() && com.github.catvod.spider.merge.d1.c.c(((M)p2).e, A.e) || !p2.f()) {
            b2.P();
            b2.s0(t2);
            return b2.e(p2);
        }
        b2.r(this);
        return false;
    }
}

