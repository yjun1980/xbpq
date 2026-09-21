/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.FR;
import com.github.catvod.spider.merge.g9;

public class Lh
extends FR {
    public Lh(String string) {
        this.b = string;
    }

    public String FG() {
        return this.Lw();
    }

    @Override
    public String Q() {
        return "#data";
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        appendable.append(this.FG());
    }

    @Override
    public String toString() {
        return this.C();
    }

    public Lh x() {
        return (Lh)super.v();
    }
}

