/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.b0;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class N0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        boolean bl = a2.n();
        b0 b02 = g1.a;
        if (bl) {
            p2.l(this);
            p2.m.f = true;
            p2.j();
            p2.o(b02);
            return;
        }
        if (a2.s('\t', '\n', '\r', '\f', ' ')) {
            a2.a();
        } else if (a2.r('>')) {
            p2.j();
            p2.o(b02);
            p2.a.a();
        } else if (a2.q("PUBLIC")) {
            p2.m.c = "PUBLIC";
            p2.o(g1.c0);
        } else if (a2.q("SYSTEM")) {
            p2.m.c = "SYSTEM";
            p2.o(g1.i0);
        } else {
            p2.m(this);
            p2.m.f = true;
            p2.o(g1.n0);
            p2.a.a();
        }
    }
}

