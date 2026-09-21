/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.Z;

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
        return String.format("%s ", this.a);
    }
}

