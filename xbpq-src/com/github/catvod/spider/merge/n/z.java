/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.c;
import com.github.catvod.spider.merge.n.s;
import com.github.catvod.spider.merge.n.t;
import com.github.catvod.spider.merge.n.y;
import java.util.concurrent.Callable;

final class z<V>
extends t<Object, V> {
    private y r;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    z(c c2, Callable callable) {
        super(c2);
        this.r = new y(this, callable);
        this.J();
    }

    static /* synthetic */ void L(z z2) {
        z2.r = null;
    }

    @Override
    final void F() {
    }

    @Override
    final void H() {
        y y2 = this.r;
        if (y2 != null) {
            y2.h();
        }
    }

    @Override
    final void K(s s2) {
        super.K(s2);
        if (s2 == s.c) {
            this.r = null;
        }
    }

    @Override
    protected final void q() {
        y y2 = this.r;
        if (y2 != null) {
            y2.c();
        }
    }
}

