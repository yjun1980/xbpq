/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.FR;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.g9;

public class qF
extends FR {
    public qF(String string) {
        this.b = string;
    }

    public String FG() {
        return this.Lw();
    }

    @Override
    public String Q() {
        return "#comment";
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        A0 a02;
        if (aA2.HM() && (this.Ws() == 0 && (a02 = this.S) instanceof Iw && ((Iw)a02).cE().S() || aA2.tT())) {
            this.c(appendable, n2, aA2);
        }
        appendable.append("<!--").append(this.FG()).append("-->");
    }

    @Override
    public String toString() {
        return this.C();
    }

    public qF x() {
        return (qF)super.v();
    }
}

