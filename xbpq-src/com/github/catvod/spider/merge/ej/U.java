/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.Z;

final class U
extends Z {
    public U(N n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl = false;
        if (l2 == l3) {
            return false;
        }
        l3 = l3.i0();
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
        return String.format("%s + ", this.a);
    }
}

