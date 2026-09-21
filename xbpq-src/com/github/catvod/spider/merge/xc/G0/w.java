/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.u;
import com.github.catvod.spider.merge.xc.G0.x;

public final class w
extends B {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean c(N n2, b b2) {
        if (B.a(n2)) {
            b2.s((G)n2);
            return true;
        }
        if (n2.a()) {
            b2.t((H)n2);
            return true;
        }
        if (n2.b()) {
            b2.h(this);
            return true;
        }
        boolean bl = n2.e();
        u u2 = B.d;
        if (bl) {
            Object object = (L)n2;
            String string = ((M)object).c;
            bl = string.equals("html");
            x x2 = B.g;
            if (bl) {
                b2.g = n2;
                return x2.c(n2, b2);
            }
            if (string.equals("body")) {
                b2.r((L)object);
                b2.u = false;
                b2.l = x2;
                return true;
            }
            if (string.equals("frameset")) {
                b2.r((L)object);
                b2.l = B.t;
                return true;
            }
            if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.g)) {
                b2.h(this);
                object = b2.o;
                b2.e.add(object);
                b2.E(n2, u2);
                b2.K((l)object);
                return true;
            }
            if (string.equals("head")) {
                b2.h(this);
                return false;
            }
            b2.G("body");
            b2.u = true;
            b2.D(n2);
            return true;
        }
        if (!n2.d()) {
            b2.G("body");
            b2.u = true;
            b2.D(n2);
            return true;
        }
        String string = ((K)n2).c;
        if (com.github.catvod.spider.merge.xc.E0.b.c(string, A.d)) {
            b2.G("body");
            b2.u = true;
            b2.D(n2);
            return true;
        }
        if (string.equals("template")) {
            b2.E(n2, u2);
            return true;
        }
        b2.h(this);
        return false;
    }
}

