/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.e0.N;

final class b {
    private final l a;
    private l b = null;
    private final N c;

    b(l l2, N n2) {
        this.a = l2;
        this.c = n2;
    }

    static /* synthetic */ l a(b b2) {
        return b2.b;
    }

    public final int b(r r2) {
        if (r2 instanceof l && this.c.a(this.a, (l)(r2 = (l)r2))) {
            this.b = r2;
            return 5;
        }
        return 1;
    }
}

