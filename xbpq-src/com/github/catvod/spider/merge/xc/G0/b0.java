/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.J;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class b0
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.l();
        if (c2 != '\u0000') {
            if (c2 != '&') {
                if (c2 != '<') {
                    if (c2 != '\uffff') {
                        p2.g(a2.g());
                    } else {
                        p2.f(new J());
                    }
                } else {
                    p2.o(g1.h);
                    p2.a.a();
                }
            } else {
                p2.o(g1.b);
                p2.a.a();
            }
        } else {
            p2.m(this);
            p2.e(a2.e());
        }
    }
}

