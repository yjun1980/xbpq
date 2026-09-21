/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.g;
import com.github.catvod.spider.merge.f1.x;

final class h
extends B {
    @Override
    final boolean i(P p2, b b2) {
        g g2 = B.n;
        x x2 = B.g;
        boolean bl = p2.f();
        String string = "th";
        if (bl) {
            String string2 = ((M)p2).e;
            if (com.github.catvod.spider.merge.d1.c.c(string2, A.v)) {
                if (!b2.G(string2)) {
                    b2.r(this);
                    b2.s0(g2);
                    return false;
                }
                b2.v(false);
                if (!b2.b(string2)) {
                    b2.r(this);
                }
                b2.a0(string2);
                b2.l();
                b2.s0(g2);
                return true;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string2, A.w)) {
                b2.r(this);
                return false;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string2, A.x)) {
                if (!b2.G(string2)) {
                    b2.r(this);
                    return false;
                }
                if (b2.G("td")) {
                    string = "td";
                }
                b2.f(string);
                return b2.e(p2);
            }
            return b2.d0(p2, x2);
        }
        if (p2.g() && com.github.catvod.spider.merge.d1.c.c(((N)p2).e, A.y)) {
            if (!b2.G("td") && !b2.G("th")) {
                b2.r(this);
                return false;
            }
            if (b2.G("td")) {
                string = "td";
            }
            b2.f(string);
            return b2.e(p2);
        }
        return b2.d0(p2, x2);
    }
}

