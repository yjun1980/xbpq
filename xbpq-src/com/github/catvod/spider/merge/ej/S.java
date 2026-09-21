/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.Z;

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
        return String.format(":has(%s)", this.a);
    }
}

