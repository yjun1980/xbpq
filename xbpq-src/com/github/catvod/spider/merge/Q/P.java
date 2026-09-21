/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.m0;
import com.github.catvod.spider.merge.S.j;

public final class P
extends m0 {
    public P(m m2, j j2) {
        super(m2, j2);
    }

    @Override
    public final int a() {
        return 8;
    }

    @Override
    public final boolean d(int n2, int n3) {
        boolean bl = n2 >= 0 && n2 <= n3 && !super.d(n2, n3);
        return bl;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('~');
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}

