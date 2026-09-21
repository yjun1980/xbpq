/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.H;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class d1
extends i1 {
    @Override
    final void l(S s2, a a2) {
        String string = a2.o();
        s2.h.append(string);
        if (a2.C("]]>") || a2.w()) {
            s2.k(new H(s2.h.toString()));
            s2.v(i1.a);
        }
    }
}

