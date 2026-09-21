/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.b;
import com.github.catvod.spider.merge.g0.c;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.g0.r;
import com.github.catvod.spider.merge.g0.u;
import java.util.List;

public final class z
extends x {
    public z(x x2, int n2) {
        super(x2, n2);
    }

    @Override
    public final <T> T e(d<? extends T> d2) {
        if (d2 instanceof E) {
            return ((E)d2).e(this);
        }
        return d2.A(this);
    }

    @Override
    public final int f() {
        return 4;
    }

    @Override
    public final void i(com.github.catvod.spider.merge.T.c c2) {
        if (c2 instanceof b) {
            ((b)c2).J();
        }
    }

    @Override
    public final void j(com.github.catvod.spider.merge.T.c c2) {
        if (c2 instanceof b) {
            ((b)c2).v();
        }
    }

    public final c n() {
        return (c)this.k(c.class);
    }

    public final g o() {
        return (g)this.k(g.class);
    }

    public final r p() {
        return (r)this.k(r.class);
    }

    public final List<u> q() {
        return this.l(u.class);
    }
}

