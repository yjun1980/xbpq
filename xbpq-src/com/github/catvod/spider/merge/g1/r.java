/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;

public final class r
extends N {
    private final String a;

    public r(String string) {
        this.a = string;
    }

    @Override
    public final boolean a(m m2, m m3) {
        return m3.Z(this.a);
    }

    public final String toString() {
        return String.format(".%s", this.a);
    }
}

