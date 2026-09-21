/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.Z;

final class V
extends Z {
    public V(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(m m2, m m3) {
        return this.a.a(m2, m3) ^ true;
    }

    public final String toString() {
        return String.format(":not(%s)", this.a);
    }
}

