/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.a;
import com.github.catvod.spider.merge.cYh;

public final class c
extends a {
    static {
        new c(1, 0);
    }

    public c(int n2, int n3) {
        super(n2, n3, 1);
    }

    @Override
    public final boolean equals(Object object) {
        int n2;
        boolean bl = object instanceof c && (this.isEmpty() && ((c)object).isEmpty() || (n2 = this.a()) == ((a)(object = (c)object)).a() && this.b() == ((a)object).b());
        return bl;
    }

    @Override
    public final int hashCode() {
        int n2 = this.isEmpty() ? -1 : this.a() * 31 + this.b();
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.a() > this.b();
        return bl;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append(cYh.d("497E"));
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }
}

