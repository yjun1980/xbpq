/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.y;

public final class A
extends y {
    public A(int n2) {
        super(n2);
    }

    @Override
    public final boolean a(m m2, m m3) {
        boolean bl = m2 != m3 && m3.W() < this.a;
        return bl;
    }

    public final String toString() {
        return String.format(":lt(%d)", this.a);
    }
}

