/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.d0.K;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class e1
extends h1 {
    @Override
    final void g(Q q2, a a2) {
        char c2 = a2.s();
        if (c2 != '\u0000') {
            if (c2 != '\uffff') {
                q2.k(a2.o('\u0000'));
            } else {
                q2.j(new K());
            }
        } else {
            q2.q(this);
            a2.a();
            q2.i('\ufffd');
        }
    }
}

