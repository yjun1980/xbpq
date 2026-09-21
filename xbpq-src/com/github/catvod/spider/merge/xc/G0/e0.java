/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class e0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        if (a2.n()) {
            p2.l(this);
            p2.o(g1.a);
            return;
        }
        char c2 = a2.l();
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '<') {
                    p2.g(a2.j('-', '<', '\u0000'));
                } else {
                    p2.o(g1.y);
                    p2.a.a();
                }
            } else {
                p2.e('-');
                p2.o(g1.w);
                p2.a.a();
            }
        } else {
            p2.m(this);
            a2.a();
            p2.e('\ufffd');
        }
    }
}

