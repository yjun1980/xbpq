/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.G0.J;
import com.github.catvod.spider.merge.xc.G0.P;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;

public final class d1
extends g1 {
    @Override
    public final void d(P p2, a a2) {
        char c2 = a2.l();
        if (c2 != '\u0000') {
            if (c2 != '\uffff') {
                p2.g(a2.i('\u0000'));
            } else {
                p2.f(new J());
            }
        } else {
            p2.m(this);
            a2.a();
            p2.e('\ufffd');
        }
    }
}

