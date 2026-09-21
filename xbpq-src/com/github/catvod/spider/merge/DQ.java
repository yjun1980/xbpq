/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.FR;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.tv;

public class DQ
extends FR {
    public DQ(String string) {
        this.b = string;
    }

    static boolean Y(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        boolean bl = true;
        if (n2 == 0 || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
            bl = false;
        }
        return bl;
    }

    public boolean B() {
        return tv.l(this.Lw());
    }

    public String FG() {
        return this.Lw();
    }

    @Override
    public String Q() {
        return "#text";
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        A0 a02;
        boolean bl = aA2.HM();
        if (bl && (this.Ws() == 0 && (a02 = this.S) instanceof Iw && ((Iw)a02).cE().S() && !this.B() || aA2.tT() && this.M().size() > 0 && !this.B())) {
            this.c(appendable, n2, aA2);
        }
        boolean bl2 = bl && !Iw.Kw(this.S);
        bl = bl && this.S instanceof g9;
        Y9.OL(appendable, this.Lw(), aA2, false, bl2, bl);
    }

    @Override
    public String toString() {
        return this.C();
    }

    public DQ x() {
        return (DQ)super.v();
    }
}

