/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.P0;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.W0;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.c0;
import com.github.catvod.spider.merge.d0.h1;

final class O0
extends h1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void g(Q q2, a object) {
        void var2_5;
        c0 c02 = h1.c;
        if (((a)object).t()) {
            q2.p(this);
            q2.m.f = true;
            q2.n();
            q2.u(c02);
            return;
        }
        if (((a)object).z('\t', '\n', '\r', '\f', ' ')) {
            ((a)object).a();
            return;
        }
        if (((a)object).y('>')) {
            q2.n();
            q2.a(c02);
            return;
        }
        String string = cYh.d("3705031D1E19");
        if (((a)object).x(string)) {
            q2.m.c = string;
            P0 p02 = h1.e0;
        } else {
            String string2 = cYh.d("340912051217");
            if (!((a)object).x(string2)) {
                q2.q(this);
                q2.m.f = true;
                q2.a(h1.p0);
                return;
            }
            q2.m.c = string2;
            W0 w02 = h1.k0;
        }
        q2.u((h1)var2_5);
    }
}

