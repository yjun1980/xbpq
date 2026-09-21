/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.T.c;
import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.b;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.g0.k;

public final class v
extends x {
    public v(x x2, int n2) {
        super(x2, n2);
    }

    @Override
    public final <T> T e(d<? extends T> d2) {
        if (d2 instanceof E) {
            return ((E)d2).i(this);
        }
        return d2.A(this);
    }

    @Override
    public final int f() {
        return 10;
    }

    @Override
    public final void i(c c2) {
        if (c2 instanceof b) {
            ((b)c2).e0();
        }
    }

    @Override
    public final void j(c c2) {
        if (c2 instanceof b) {
            ((b)c2).Y();
        }
    }

    public final i n() {
        return (i)this.k(i.class);
    }

    public final k o() {
        return (k)this.k(k.class);
    }
}

