/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.b0;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class f1
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        boolean bl = a2.n();
        b0 b02 = g1.a;
        if (bl) {
            p2.l(this);
            p2.g("</");
            p2.o(b02);
        } else if (a2.t()) {
            p2.c(false);
            p2.o(g1.j);
        } else if (a2.r('>')) {
            p2.m(this);
            p2.o(b02);
            p2.a.a();
        } else {
            p2.m(this);
            p2.n.f();
            p2.n.h('/');
            p2.o(g1.Q);
        }
    }
}

