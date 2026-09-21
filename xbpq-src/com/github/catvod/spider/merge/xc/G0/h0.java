/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class h0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        if (a2.t()) {
            p2.d();
            p2.h.append(a2.l());
            p2.g("<");
            p2.e(a2.l());
            p2.o(g1.B);
            p2.a.a();
        } else if (a2.r('/')) {
            p2.d();
            p2.o(g1.z);
            p2.a.a();
        } else {
            p2.e('<');
            p2.o(g1.v);
        }
    }
}

