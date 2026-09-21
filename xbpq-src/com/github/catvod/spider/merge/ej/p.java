/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.j;

public final class p
extends j {
    public p(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.b.equalsIgnoreCase(l3.c(this.a)) ^ true;
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.a, this.b);
    }
}

