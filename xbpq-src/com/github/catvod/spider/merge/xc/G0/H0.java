/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class H0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        char c2 = object.e();
        object = g1.U;
        if (c2 != '\u0000') {
            if (c2 != '!') {
                if (c2 != '-') {
                    Object object2 = g1.a;
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            object2 = p2.n;
                            ((H)object2).i("--");
                            ((H)object2).h(c2);
                            p2.o((g1)((Object)object));
                        } else {
                            p2.l(this);
                            p2.i();
                            p2.o((g1)((Object)object2));
                        }
                    } else {
                        p2.i();
                        p2.o((g1)((Object)object2));
                    }
                } else {
                    p2.n.h('-');
                }
            } else {
                p2.o(g1.X);
            }
        } else {
            p2.m(this);
            H h2 = p2.n;
            h2.i("--");
            h2.h('\ufffd');
            p2.o((g1)((Object)object));
        }
    }
}

