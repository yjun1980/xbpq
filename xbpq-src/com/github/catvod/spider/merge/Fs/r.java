/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.s;
import com.github.catvod.spider.merge.Fs.z;

final class r
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O o2, b b2) {
        s s2 = A.e;
        if (o2.c()) {
            b2.n(this);
            return false;
        }
        if (o2.b()) {
            b2.F((I)o2);
            return true;
        }
        if (A.a(o2)) {
            b2.E((H)o2);
            return true;
        }
        if (o2.f()) {
            M m2 = (M)o2;
            if (m2.c.equals("html")) {
                b2.D(m2);
                b2.j0(s2);
                return true;
            }
        }
        if (o2.e() && com.github.catvod.spider.merge.Dw.e.b(((L)o2).c, z.e) || !o2.e()) {
            b2.L("html");
            b2.j0(s2);
            return b2.c(o2);
        }
        b2.n(this);
        return false;
    }
}

