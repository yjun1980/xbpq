/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class G0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        char c2 = object.e();
        object = g1.U;
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '\uffff') {
                    H h2 = p2.n;
                    h2.h('-');
                    h2.h(c2);
                    p2.o((g1)((Object)object));
                } else {
                    p2.l(this);
                    p2.i();
                    p2.o(g1.a);
                }
            } else {
                p2.o(g1.W);
            }
        } else {
            p2.m(this);
            H h3 = p2.n;
            h3.h('-');
            h3.h('\ufffd');
            p2.o((g1)((Object)object));
        }
    }
}

