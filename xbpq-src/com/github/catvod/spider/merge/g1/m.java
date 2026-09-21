/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.g1.j;

public final class m
extends j {
    public m(String string, String string2) {
        super(string, string2, true);
    }

    @Override
    public final boolean a(com.github.catvod.spider.merge.e1.m m2, com.github.catvod.spider.merge.e1.m m3) {
        boolean bl = m3.n(this.a) && d.e(m3.c(this.a)).contains(this.b);
        return bl;
    }

    public final String toString() {
        return String.format("[%s*=%s]", this.a, this.b);
    }
}

