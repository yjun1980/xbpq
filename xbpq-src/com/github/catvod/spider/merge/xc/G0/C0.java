/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class C0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        if (a2.p("--")) {
            p2.n.f();
            p2.o(g1.S);
        } else if (a2.q("DOCTYPE")) {
            p2.o(g1.Y);
        } else if (a2.p("[CDATA[")) {
            p2.d();
            p2.o(g1.o0);
        } else {
            p2.m(this);
            p2.n.f();
            p2.o(g1.Q);
        }
    }
}

