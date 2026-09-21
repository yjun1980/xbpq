/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;

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
        String string = this.a;
        return String.format(cYh.d("4223"), string);
    }
}

