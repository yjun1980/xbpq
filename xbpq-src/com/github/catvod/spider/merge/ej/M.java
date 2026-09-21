/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;

public final class M
extends N {
    private final String a;

    public M(String string) {
        this.a = string;
    }

    @Override
    public final boolean a(l l2, l l3) {
        return l3.d0().equals(this.a);
    }

    public final String toString() {
        return String.format("%s", this.a);
    }
}

