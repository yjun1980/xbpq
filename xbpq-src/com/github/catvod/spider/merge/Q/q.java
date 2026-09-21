/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.S.j;

public final class q
extends t0 {
    public final int b;

    public q(m m2, int n2) {
        super(m2);
        this.b = n2;
    }

    @Override
    public final int a() {
        return 5;
    }

    @Override
    public final j c() {
        int n2 = this.b;
        j j2 = new j(new int[0]);
        j2.a(n2);
        return j2;
    }

    @Override
    public final boolean d(int n2, int n3) {
        boolean bl = this.b == n2;
        return bl;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}

