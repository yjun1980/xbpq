/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import java.util.regex.Pattern;

public final class o
extends N {
    String a;
    Pattern b;

    public o(String string, Pattern pattern) {
        this.a = s.d(string);
        this.b = pattern;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = l3.o(this.a) && this.b.matcher(l3.c(this.a)).find();
        return bl;
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}

