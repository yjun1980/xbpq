/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.f1.G;
import com.github.catvod.spider.merge.g1.g;
import java.util.AbstractCollection;

public final class p
extends m {
    private final g j = new g();

    public p(G g2, c c2) {
        super(g2, null, c2);
    }

    @Override
    protected final void C(s s2) {
        super.C(s2);
        ((AbstractCollection)this.j).remove(s2);
    }

    public final p v0(m m2) {
        ((AbstractCollection)this.j).add(m2);
        return this;
    }

    public final p w0() {
        return (p)super.U();
    }
}

