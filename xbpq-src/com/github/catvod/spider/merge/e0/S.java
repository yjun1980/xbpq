/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.Z;

final class S
extends Z {
    public S(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l object, l l2) {
        for (l l3 : l2.V()) {
            if (l3 == l2 || !this.a.a(l2, l3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        N n2 = this.a;
        return String.format(cYh.d("5D3820227F7F1479"), n2);
    }
}

