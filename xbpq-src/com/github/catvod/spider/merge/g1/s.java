/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;

public final class s
extends N {
    private final String a;

    public s(String string) {
        this.a = d.e(string);
    }

    @Override
    public final boolean a(m m2, m m3) {
        return d.e(m3.V()).contains(this.a);
    }

    public final String toString() {
        return String.format(":containsData(%s)", this.a);
    }
}

