/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.P0;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.W0;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c0;
import com.github.catvod.spider.merge.Fs.h1;

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
        if (((a)object).x("PUBLIC")) {
            q2.m.c = "PUBLIC";
            P0 p02 = h1.e0;
        } else {
            if (!((a)object).x("SYSTEM")) {
                q2.q(this);
                q2.m.f = true;
                q2.a(h1.p0);
                return;
            }
            q2.m.c = "SYSTEM";
            W0 w02 = h1.k0;
        }
        q2.u((h1)var2_5);
    }
}

