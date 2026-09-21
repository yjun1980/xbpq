/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class H0
extends i1 {
    @Override
    final void l(S s2, a a2) {
        char c2 = a2.u();
        if (c2 != '\u0000') {
            if (c2 != '-') {
                if (c2 != '\uffff') {
                    s2.n.l(a2.q('-', '\u0000'));
                } else {
                    s2.q(this);
                    s2.n();
                    s2.v(i1.a);
                }
            } else {
                s2.a(i1.V);
            }
        } else {
            s2.r(this);
            a2.a();
            s2.n.k('\ufffd');
        }
    }
}

