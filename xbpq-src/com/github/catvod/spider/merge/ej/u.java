/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class u
extends N {
    private final String a;

    public u(String string) {
        this.a = string;
    }

    @Override
    public final boolean a(l l2, l l3) {
        return this.a.equals(l3.Y());
    }

    public final String toString() {
        return String.format("#%s", this.a);
    }
}

