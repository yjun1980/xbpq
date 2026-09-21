/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.j;

public final class l
extends j {
    public l(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl = m3.n(this.a) && this.b.equalsIgnoreCase(m3.c(this.a).trim());
        return bl;
    }

    public final String toString() {
        return String.format("[%s=%s]", this.a, this.b);
    }
}

