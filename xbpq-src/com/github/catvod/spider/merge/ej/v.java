/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.w;

public final class v
extends w {
    public v(int n2) {
        super(n2);
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = l3.U() == this.a;
        return bl;
    }

    public final String toString() {
        return String.format(":eq(%d)", this.a);
    }
}

