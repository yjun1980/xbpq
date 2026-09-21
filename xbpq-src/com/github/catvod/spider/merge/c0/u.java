/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.n;
import com.github.catvod.spider.merge.c0.p;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.cYh;

public class u
extends p {
    public u(String string) {
        this.f = string;
    }

    static boolean M(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        boolean bl = true;
        if (n2 == 0 || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
            bl = false;
        }
        return bl;
    }

    public u K() {
        return (u)super.j();
    }

    public final String L() {
        return this.I();
    }

    @Override
    public final r m() {
        return this;
    }

    @Override
    public String t() {
        return cYh.d("4424242923");
    }

    @Override
    public final String toString() {
        return this.u();
    }

    @Override
    void w(Appendable appendable, int n2, g g2) {
        r r2;
        boolean bl = g2.f();
        if (bl && this.d == 0 && (r2 = this.c) instanceof l && ((l)r2).m0().a() && !b.c(this.I())) {
            this.r(appendable, n2, g2);
        }
        boolean bl2 = bl && !l.h0(this.c);
        bl = bl && this.c instanceof h;
        n.d(appendable, this.I(), g2, false, bl2, bl);
    }

    @Override
    void x(Appendable appendable, int n2, g g2) {
    }
}

