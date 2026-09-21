/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.Z;
import com.github.catvod.spider.merge.g1.b;

final class S
extends Z {
    final b b;

    public S(N n2) {
        this.a = n2;
        this.b = new b(n2);
    }

    @Override
    public final boolean a(m s2, m m2) {
        for (int i2 = 0; i2 < m2.g(); ++i2) {
            s2 = m2.f(i2);
            if (!(s2 instanceof m) || this.b.a(m2, (m)s2) == null) continue;
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}

