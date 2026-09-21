/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.Z;

final class V
extends Z {
    public V(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.a.a(l2, l3) ^ true;
    }

    public final String toString() {
        return String.format(":not(%s)", this.a);
    }
}

