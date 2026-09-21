/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.x;

public final class h
extends B {
    @Override
    public final boolean c(N object, b b2) {
        boolean bl = object.d();
        x x2 = B.g;
        if (bl) {
            String string = ((K)object).c;
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.v)) {
                bl = b2.q(string);
                object = B.n;
                if (!bl) {
                    b2.h(this);
                    b2.l = object;
                    return false;
                }
                b2.j(false);
                if (!b2.g(string)) {
                    b2.h(this);
                }
                b2.B(string);
                b2.c();
                b2.l = object;
                return true;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.w)) {
                b2.h(this);
                return false;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.x)) {
                if (!b2.q(string)) {
                    b2.h(this);
                    return false;
                }
                if (b2.q("td")) {
                    b2.F("td");
                } else {
                    b2.F("th");
                }
                return b2.D((N)object);
            }
            b2.g = object;
            return x2.c((N)object, b2);
        }
        if (object.e() && com.github.catvod.spider.merge.xc.E0.b.c(((L)object).c, A.y)) {
            if (!b2.q("td") && !b2.q("th")) {
                b2.h(this);
                return false;
            }
            if (b2.q("td")) {
                b2.F("td");
            } else {
                b2.F("th");
            }
            return b2.D((N)object);
        }
        b2.g = object;
        return x2.c((N)object, b2);
    }
}

