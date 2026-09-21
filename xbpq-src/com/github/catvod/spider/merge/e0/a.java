/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.e0.N;
import com.github.catvod.spider.merge.e0.O;
import com.github.catvod.spider.merge.e0.g;
import java.util.AbstractCollection;

final class a
implements O {
    private final l a;
    private final g b;
    private final N c;

    a(l l2, g g2, N n2) {
        this.a = l2;
        this.b = g2;
        this.c = n2;
    }

    @Override
    public final void a(r r2, int n2) {
        if (r2 instanceof l && this.c.a(this.a, (l)(r2 = (l)r2))) {
            ((AbstractCollection)this.b).add(r2);
        }
    }

    @Override
    public final void b(r r2, int n2) {
    }
}

