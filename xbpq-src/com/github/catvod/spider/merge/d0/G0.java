/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class G0
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        char c2 = a2.s();
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '\uffff') {
                    q2.n.j(a2.p('-', '\u0000'));
                } else {
                    q2.p(this);
                    q2.m();
                    q2.u(h1.c);
                }
            } else {
                q2.a(h1.X);
            }
        } else {
            q2.q(this);
            a2.a();
            q2.n.i('\ufffd');
        }
    }
}

