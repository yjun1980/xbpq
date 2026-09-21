/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class g1
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        c0 c02 = h1.c;
        if (a2.t()) {
            q2.p(this);
            q2.k(cYh.d("5B7F"));
            q2.u(c02);
        } else if (a2.C()) {
            q2.g(false);
            q2.u(h1.l);
        } else {
            boolean bl = a2.y('>');
            q2.q(this);
            if (bl) {
                q2.a(c02);
            } else {
                q2.e();
                q2.a(h1.S);
            }
        }
    }
}

