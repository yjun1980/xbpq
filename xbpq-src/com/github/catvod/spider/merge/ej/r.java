/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class r
extends N {
    private final String a;

    public r(String string) {
        this.a = s.c(string);
    }

    @Override
    public final boolean a(l l2, l l3) {
        return s.c(l3.e0()).contains(this.a);
    }

    public final String toString() {
        return String.format(":containsOwn(%s)", this.a);
    }
}

