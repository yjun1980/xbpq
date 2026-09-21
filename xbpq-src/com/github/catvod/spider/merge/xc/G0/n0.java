/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class n0
extends g1 {
    @Override
    public final void d(P p2, a object) {
        char c2 = object.e();
        object = g1.C;
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '<') {
                    if (c2 != '\uffff') {
                        p2.e(c2);
                        p2.o((g1)((Object)object));
                    } else {
                        p2.l(this);
                        p2.o(g1.a);
                    }
                } else {
                    p2.e(c2);
                    p2.o(g1.F);
                }
            } else {
                p2.e(c2);
                p2.o(g1.E);
            }
        } else {
            p2.m(this);
            p2.e('\ufffd');
            p2.o((g1)((Object)object));
        }
    }
}

