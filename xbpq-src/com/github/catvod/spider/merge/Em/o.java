/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Em.c;
import com.github.catvod.spider.merge.Em.l;
import com.github.catvod.spider.merge.Em.r;
import com.github.catvod.spider.merge.Fs.F;
import com.github.catvod.spider.merge.ej.g;
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

