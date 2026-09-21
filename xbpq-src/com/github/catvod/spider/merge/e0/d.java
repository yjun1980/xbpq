/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.f;
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
        return com.github.catvod.spider.merge.b0.b.e(this.a, "");
    }
}

