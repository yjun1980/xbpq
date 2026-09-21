/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.j;

public final class p
extends j {
    public p(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(m m2, m m3) {
        return this.b.equalsIgnoreCase(m3.c(this.a)) ^ true;
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.a, this.b);
    }
}

