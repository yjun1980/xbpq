/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.u;
import com.github.catvod.spider.merge.e1.v;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.g1.N;

public final class K
extends N {
    /*
     * WARNING - void declaration
     */
    @Override
    public final boolean a(m s22, m m2) {
        void var2_4;
        if (var2_4 instanceof u) {
            return true;
        }
        for (v v2 : var2_4.t0()) {
            u u2 = new u(G.m(var2_4.r0(), E.d), var2_4.e(), var2_4.d());
            v2.D(u2);
            u2.K(v2);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}

