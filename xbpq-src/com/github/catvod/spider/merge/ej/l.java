/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.ej.j;

public final class l
extends j {
    public l(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(com.github.catvod.spider.merge.Em.l l2, com.github.catvod.spider.merge.Em.l l3) {
        boolean bl = l3.o(this.a) && this.b.equalsIgnoreCase(l3.c(this.a).trim());
        return bl;
    }

    public final String toString() {
        return String.format("[%s=%s]", this.a, this.b);
    }
}

