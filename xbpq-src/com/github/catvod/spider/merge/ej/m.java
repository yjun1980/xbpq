/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.j;

public final class m
extends j {
    public m(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = l3.o(this.a) && s.c(l3.c(this.a)).contains(this.b);
        return bl;
    }

    public final String toString() {
        return String.format("[%s*=%s]", this.a, this.b);
    }
}

