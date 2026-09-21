/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.Z;

final class W
extends Z {
    public W(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        l l4 = l3;
        if (l2 == l3) {
            return false;
        }
        while ((l3 = l4.f0()) != null) {
            if (this.a.a(l2, l3)) {
                return true;
            }
            l4 = l3;
            if (l3 != l2) continue;
        }
        return false;
    }

    public final String toString() {
        N n2 = this.a;
        return String.format(cYh.d("422361"), n2);
    }
}

