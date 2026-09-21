/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.S.j;
import com.github.catvod.spider.merge.cYh;

public final class c0
extends t0 {
    public final int b;
    public final int c;

    public c0(m m2, int n2, int n3) {
        super(m2);
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final int a() {
        return 2;
    }

    @Override
    public final j c() {
        return j.g(this.b, this.c);
    }

    @Override
    public final boolean d(int n2, int n3) {
        boolean bl = n2 >= this.b && n2 <= this.c;
        return bl;
    }

    public final String toString() {
        String string = cYh.d("40");
        StringBuilder stringBuilder = new StringBuilder(string).appendCodePoint(this.b);
        stringBuilder.append(cYh.d("407E6F76"));
        stringBuilder = stringBuilder.appendCodePoint(this.c);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

