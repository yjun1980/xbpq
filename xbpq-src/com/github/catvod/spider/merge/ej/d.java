/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ej;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.ej.N;
import com.github.catvod.spider.merge.ej.f;
import java.util.Arrays;
import java.util.Collection;

final class d
extends f {
    d(Collection<N> collection) {
        this.a.addAll(collection);
        this.b();
    }

    d(N ... nArray) {
        this(Arrays.asList(nArray));
    }

    @Override
    public final boolean a(l l2, l l3) {
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (this.a.get(i2).a(l2, l3)) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        return e.e(this.a, "");
    }
}

