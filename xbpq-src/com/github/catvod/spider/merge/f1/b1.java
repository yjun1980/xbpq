/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class b1
extends i1 {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final void l(S s2, a a2) {
        d0 d02 = i1.a;
        char c2 = a2.f();
        if (c2 == '\t') return;
        if (c2 == '\n') return;
        if (c2 == '\f') return;
        if (c2 == '\r') return;
        if (c2 == ' ') return;
        if (c2 != '>') {
            if (c2 != '\uffff') {
                s2.r(this);
                s2.v(i1.n0);
                return;
            }
            s2.q(this);
            s2.m.h = true;
        }
        s2.o();
        s2.v(d02);
    }
}

