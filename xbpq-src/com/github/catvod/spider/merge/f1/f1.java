/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.L;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class f1
extends i1 {
    @Override
    final void l(S s2, a a2) {
        char c2 = a2.u();
        if (c2 != '\u0000') {
            if (c2 != '\uffff') {
                s2.l(a2.p('\u0000'));
            } else {
                s2.k(new L());
            }
        } else {
            s2.r(this);
            a2.a();
            s2.j('\ufffd');
        }
    }
}

