/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.Z;

final class X
extends Z {
    public X(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        l l4 = l3;
        if (l2 == l3) {
            return false;
        }
        while ((l3 = l4.i0()) != null) {
            l4 = l3;
            if (!this.a.a(l2, l3)) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        N n2 = this.a;
        return String.format(cYh.d("4223612F77"), n2);
    }
}

