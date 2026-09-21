/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class a1
extends h1 {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    final void g(Q q2, a a2) {
        c0 c02 = h1.c;
        char c2 = a2.e();
        if (c2 == '\t') return;
        if (c2 == '\n') return;
        if (c2 == '\f') return;
        if (c2 == '\r') return;
        if (c2 == ' ') return;
        if (c2 != '>') {
            if (c2 != '\uffff') {
                q2.q(this);
                q2.u(h1.p0);
                return;
            }
            q2.p(this);
            q2.m.f = true;
        }
        q2.n();
        q2.u(c02);
    }
}

