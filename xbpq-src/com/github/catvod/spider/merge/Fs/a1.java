/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

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

