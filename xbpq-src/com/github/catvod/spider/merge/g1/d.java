/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.d1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.f;
import java.util.Arrays;
import java.util.Collection;

public final class d
extends f {
    d(Collection<N> collection) {
        this.a.addAll(collection);
        this.b();
    }

    d(N ... nArray) {
        this(Arrays.asList(nArray));
    }

    @Override
    public final boolean a(m m2, m m3) {
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (this.a.get(i2).a(m2, m3)) continue;
            return false;
        }
        return true;
    }

    public final String toString() {
        return c.f(this.a, "");
    }
}

