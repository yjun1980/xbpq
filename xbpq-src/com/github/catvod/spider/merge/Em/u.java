/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Em.n;
import com.github.catvod.spider.merge.Em.p;
import com.github.catvod.spider.merge.Em.r;

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
        return "#text";
    }

    @Override
    public final String toString() {
        return this.u();
    }

    @Override
    void w(Appendable appendable, int n2, g g2) {
        r r2;
        boolean bl = g2.f();
        if (bl && this.d == 0 && (r2 = this.c) instanceof l && ((l)r2).m0().a() && !com.github.catvod.spider.merge.Dw.e.c(this.I())) {
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

