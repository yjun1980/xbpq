/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class s
extends N {
    private final String a;

    public s(String string) {
        this.a = com.github.catvod.spider.merge.Dw.s.c(string);
    }

    @Override
    public final boolean a(l l2, l l3) {
        return com.github.catvod.spider.merge.Dw.s.c(l3.p0()).contains(this.a);
    }

    public final String toString() {
        return String.format(":contains(%s)", this.a);
    }
}

