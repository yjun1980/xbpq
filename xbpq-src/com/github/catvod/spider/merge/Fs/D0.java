/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.E0;
import com.github.catvod.spider.merge.Fs.L0;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.c1;
import com.github.catvod.spider.merge.Fs.h1;

final class D0
extends h1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void g(Q q2, a object) {
        void var2_6;
        if (((a)object).w("--")) {
            q2.n.g();
            E0 e02 = h1.U;
        } else if (((a)object).x("DOCTYPE")) {
            L0 l02 = h1.a0;
        } else {
            if (!((a)object).w("[CDATA[")) {
                q2.q(this);
                q2.e();
                q2.a(h1.S);
                return;
            }
            q2.h();
            c1 c12 = h1.q0;
        }
        q2.u((h1)var2_6);
    }
}

