/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.g1.N;
import com.github.catvod.spider.merge.g1.O;
import com.github.catvod.spider.merge.g1.g;
import java.util.AbstractCollection;

final class a
implements O {
    private final m a;
    private final g b;
    private final N c;

    a(m m2, g g2, N n2) {
        this.a = m2;
        this.b = g2;
        this.c = n2;
    }

    @Override
    public final void a(s s2, int n2) {
        if (s2 instanceof m && this.c.a(this.a, (m)(s2 = (m)s2))) {
            ((AbstractCollection)this.b).add(s2);
        }
    }

    @Override
    public final void b(s s2, int n2) {
    }
}

