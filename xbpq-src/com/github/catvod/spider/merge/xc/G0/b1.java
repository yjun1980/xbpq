/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.F;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class b1
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        Object object;
        int n2 = a2.v("]]>");
        if (n2 != -1) {
            object = com.github.catvod.spider.merge.xc.G0.a.c(a2.a, a2.h, a2.e, n2);
            a2.e += n2;
        } else {
            int n3 = a2.c;
            n2 = a2.e;
            if (n3 - n2 < 3) {
                a2.b();
                char[] cArray = a2.a;
                object = a2.h;
                n2 = a2.e;
                object = com.github.catvod.spider.merge.xc.G0.a.c(cArray, object, n2, a2.c - n2);
                a2.e = a2.c;
            } else {
                object = com.github.catvod.spider.merge.xc.G0.a.c(a2.a, a2.h, n2, (n3 -= 2) - n2);
                a2.e = n3;
            }
        }
        p2.h.append((String)object);
        if (a2.p("]]>") || a2.n()) {
            p2.f(new F(p2.h.toString()));
            p2.o(g1.a);
        }
    }
}

