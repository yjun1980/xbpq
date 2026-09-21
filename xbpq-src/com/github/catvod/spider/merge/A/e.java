/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.a;
import com.github.catvod.spider.merge.A.d;

public final class e {
    e a;
    private final int b;
    private final int c;

    public e(d d2, String string, String string2) {
        if (d2.n == null) {
            d2.n = this;
        } else {
            d2.o.a = this;
        }
        d2.o = this;
        this.b = d2.g(string);
        this.c = d2.g(string2);
    }

    final void a(a a2) {
        a2.g(1);
        a2.g(this.b);
        a2.g(this.c);
        a2.g(0);
    }
}

