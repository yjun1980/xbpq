/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class R0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        char c2 = object.e();
        if (c2 != '\u0000') {
            if (c2 != '\'') {
                object = g1.a;
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        p2.m.d.append(c2);
                    } else {
                        p2.l(this);
                        p2.m.f = true;
                        p2.j();
                        p2.o((g1)((Object)object));
                    }
                } else {
                    p2.m(this);
                    p2.m.f = true;
                    p2.j();
                    p2.o((g1)((Object)object));
                }
            } else {
                p2.o(g1.g0);
            }
        } else {
            p2.m(this);
            p2.m.d.append('\ufffd');
        }
    }
}

