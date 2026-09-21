/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;

public final class W
extends n {
    public final int b;
    public final int c;
    public final boolean d;

    public W(m m2, int n2, int n3, boolean bl) {
        super(m2);
        this.b = n2;
        this.c = n3;
        this.d = bl;
    }

    @Override
    public final int a() {
        return 4;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(int n2, int n3) {
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("1722243508"));
        stringBuilder.append(this.b);
        stringBuilder.append(cYh.d("5D"));
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

