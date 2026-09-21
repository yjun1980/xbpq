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
import com.github.catvod.spider.merge.Fs.g;
import com.github.catvod.spider.merge.Fs.w;
import com.github.catvod.spider.merge.Fs.z;

final class h
extends A {
    @Override
    final boolean d(O o2, b b2) {
        g g2 = A.p;
        w w2 = A.i;
        boolean bl = o2.e();
        String string = "th";
        if (bl) {
            String string2 = ((L)o2).c;
            if (com.github.catvod.spider.merge.Dw.e.b(string2, z.x)) {
                if (!b2.B(string2)) {
                    b2.n(this);
                    b2.j0(g2);
                    return false;
                }
                if (!b2.a().d0().equals(string2)) {
                    b2.n(this);
                }
                b2.V(string2);
                b2.i();
                b2.j0(g2);
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(string2, z.y)) {
                b2.n(this);
                return false;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(string2, z.z)) {
                if (!b2.B(string2)) {
                    b2.n(this);
                    return false;
                }
                if (b2.B("td")) {
                    string = "td";
                }
                b2.d(string);
                return b2.c(o2);
            }
            return b2.X(o2, w2);
        }
        if (o2.f() && com.github.catvod.spider.merge.Dw.e.b(((M)o2).c, z.A)) {
            if (!b2.B("td") && !b2.B("th")) {
                b2.n(this);
                return false;
            }
            if (b2.B("td")) {
                string = "td";
            }
            b2.d(string);
            return b2.c(o2);
        }
        return b2.X(o2, w2);
    }
}

