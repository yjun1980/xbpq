/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.e0.g;
import java.util.AbstractCollection;

public final class o
extends l {
    private final g l = new g();

    public o(F f2, c c2) {
        super(f2, null, c2);
    }

    @Override
    protected final void D(r r2) {
        super.D(r2);
        ((AbstractCollection)this.l).remove(r2);
    }

    public final o r0(l l2) {
        ((AbstractCollection)this.l).add(l2);
        return this;
    }

    public final o s0() {
        return (o)super.S();
    }
}

