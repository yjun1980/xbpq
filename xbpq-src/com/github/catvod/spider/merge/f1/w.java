/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.f1.A;
import com.github.catvod.spider.merge.f1.B;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.u;
import com.github.catvod.spider.merge.f1.x;

final class w
extends B {
    private boolean j(P p2, b b2) {
        b2.h("body");
        b2.s(true);
        return b2.e(p2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean i(P p2, b b2) {
        String string;
        u u2 = B.d;
        x x2 = B.g;
        if (B.b(p2)) {
            b2.I((I)p2);
            return true;
        }
        if (p2.c()) {
            b2.J((J)p2);
            return true;
        }
        if (p2.d()) {
            b2.r(this);
            return true;
        }
        if (p2.g()) {
            Object object = (N)p2;
            String string2 = ((O)object).e;
            if (string2.equals("html")) {
                return b2.d0(p2, x2);
            }
            if (string2.equals("body")) {
                b2.H((N)object);
                b2.s(false);
                b2.s0(x2);
                return true;
            }
            if (string2.equals("frameset")) {
                b2.H((N)object);
                b2.s0(B.t);
                return true;
            }
            if (com.github.catvod.spider.merge.d1.c.c(string2, A.g)) {
                b2.r(this);
                object = b2.z();
                b2.e.add((m)object);
                b2.d0(p2, u2);
                b2.j0((m)object);
                return true;
            }
            if (string2.equals("head")) {
                b2.r(this);
                return false;
            }
        } else if (p2.f() && !com.github.catvod.spider.merge.d1.c.c(string = ((M)p2).e, A.d)) {
            if (string.equals("template")) {
                b2.d0(p2, u2);
                return true;
            }
            b2.r(this);
            return false;
        }
        this.j(p2, b2);
        return true;
    }
}

