/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Em.t;
import com.github.catvod.spider.merge.Em.u;
import com.github.catvod.spider.merge.Fs.D;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.ej.N;

public final class J
extends N {
    @Override
    public final boolean a(l l2, l l3) {
        if (l3 instanceof t) {
            return true;
        }
        for (u u2 : l3.q0()) {
            l2 = new t(F.l(l3.n0(), D.d), l3.e(), l3.d());
            u2.E(l2);
            l2.L(u2);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}

