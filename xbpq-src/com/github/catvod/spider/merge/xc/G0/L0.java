/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.M0;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class L0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        boolean bl = a2.t();
        M0 m02 = g1.a0;
        if (bl) {
            p2.m.f();
            p2.o(m02);
            return;
        }
        char c2 = a2.e();
        if (c2 != '\u0000') {
            if (c2 != ' ') {
                if (c2 != '\uffff') {
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r') {
                        p2.m.f();
                        p2.m.b.append(c2);
                        p2.o(m02);
                    }
                } else {
                    p2.l(this);
                    p2.m.f();
                    p2.m.f = true;
                    p2.j();
                    p2.o(g1.a);
                }
            }
        } else {
            p2.m(this);
            p2.m.f();
            p2.m.b.append('\ufffd');
            p2.o(m02);
        }
    }
}

