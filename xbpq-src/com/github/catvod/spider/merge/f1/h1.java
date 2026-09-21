/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.D0;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.T;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.d0;
import com.github.catvod.spider.merge.f1.i1;

final class h1
extends i1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void l(S s2, a object) {
        void var2_5;
        d0 d02 = i1.a;
        if (((a)object).w()) {
            s2.q(this);
            s2.l("</");
            s2.v(d02);
            return;
        }
        if (((a)object).H()) {
            s2.h(false);
            T t2 = i1.j;
        } else {
            boolean bl = ((a)object).E('>');
            s2.r(this);
            if (bl) {
                s2.a(d02);
                return;
            }
            s2.f();
            s2.n.k('/');
            D0 d03 = i1.Q;
        }
        s2.v((i1)var2_5);
    }
}

