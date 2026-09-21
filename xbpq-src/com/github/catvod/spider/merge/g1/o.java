/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import java.util.regex.Pattern;

public final class o
extends N {
    String a;
    Pattern b;

    public o(String string, Pattern pattern) {
        this.a = d.i(string);
        this.b = pattern;
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl = m3.n(this.a) && this.b.matcher(m3.c(this.a)).find();
        return bl;
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}

