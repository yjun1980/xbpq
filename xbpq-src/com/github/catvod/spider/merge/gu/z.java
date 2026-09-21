/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Mm.j;
import com.github.catvod.spider.merge.gu.B;
import com.github.catvod.spider.merge.gu.D;
import com.github.catvod.spider.merge.gu.r;
import com.github.catvod.spider.merge.gu.x;

public class z
extends RuntimeException {
    private final B<?, ?> c;
    private final x d;
    private final r e;
    private D f;
    private int g = -1;

    public z(B<?, ?> b2, r r2, x x2) {
        this.c = b2;
        this.e = r2;
        this.d = x2;
        if (b2 != null) {
            this.g = b2.i();
        }
    }

    public final j a() {
        B<?, ?> b2 = this.c;
        if (b2 != null) {
            return b2.f().c(this.g, this.d);
        }
        return null;
    }

    public final r b() {
        return this.e;
    }

    public final D c() {
        return this.f;
    }

    protected final void d(int n2) {
        this.g = n2;
    }

    protected final void e(D d2) {
        this.f = d2;
    }
}

