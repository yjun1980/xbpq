/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.Z;

final class T
extends Z {
    public T(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = false;
        if (l2 == l3) {
            return false;
        }
        l3 = l3.f0();
        boolean bl2 = bl;
        if (l3 != null) {
            bl2 = bl;
            if (this.a.a(l2, l3)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final String toString() {
        N n2 = this.a;
        return String.format(cYh.d("4223616F77"), n2);
    }
}

