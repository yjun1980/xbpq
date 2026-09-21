/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.P.x;
import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.b;

public final class c
extends x {
    public c(x x2, int n2) {
        super(x2, n2);
    }

    @Override
    public final <T> T e(d<? extends T> d2) {
        if (d2 instanceof E) {
            return ((E)d2).c(this);
        }
        return d2.A(this);
    }

    @Override
    public final int f() {
        return 8;
    }

    @Override
    public final void i(com.github.catvod.spider.merge.T.c c2) {
        if (c2 instanceof b) {
            ((b)c2).o();
        }
    }

    @Override
    public final void j(com.github.catvod.spider.merge.T.c c2) {
        if (c2 instanceof b) {
            ((b)c2).f();
        }
    }
}

