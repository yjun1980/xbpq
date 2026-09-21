/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Fs.A;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.z;

final class u
extends A {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final boolean d(O o2, b b2) {
        Object object = A.f;
        if (o2.c()) {
            b2.n(this);
            return true;
        }
        if (o2.f() && ((M)o2).c.equals("html")) {
            return b2.X(o2, A.i);
        }
        if (o2.e() && ((L)o2).c.equals("noscript")) {
            b2.U();
            b2.j0((A)((Object)object));
            return true;
        }
        if (A.a(o2)) return b2.X(o2, (A)((Object)((Object)object)));
        if (o2.b()) return b2.X(o2, (A)((Object)((Object)object)));
        if (o2.f() && com.github.catvod.spider.merge.Dw.e.b(((M)o2).c, z.f)) {
            return b2.X(o2, (A)((Object)object));
        }
        if (o2.e() && ((L)o2).c.equals("br")) {
            b2.n(this);
            object = new H();
        } else {
            if (o2.f() && com.github.catvod.spider.merge.Dw.e.b(((M)o2).c, z.K) || o2.e()) {
                b2.n(this);
                return false;
            }
            b2.n(this);
            object = new H();
        }
        ((H)object).i(o2.toString());
        b2.E((H)object);
        return true;
    }
}

