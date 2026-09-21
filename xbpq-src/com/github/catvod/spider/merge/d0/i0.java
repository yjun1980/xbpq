/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;
import com.github.catvod.spider.merge.d0.j0;
import com.github.catvod.spider.merge.d0.l0;

final class i0
extends h1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void g(Q q2, a object) {
        void var2_5;
        if (((a)object).C()) {
            q2.h();
            q2.h.append(((a)object).s());
            q2.k(cYh.d("5B"));
            q2.i(((a)object).s());
            l0 l02 = h1.D;
        } else {
            if (!((a)object).y('/')) {
                q2.i('<');
                q2.u(h1.x);
                return;
            }
            q2.h();
            j0 j02 = h1.B;
        }
        q2.a((h1)var2_5);
    }
}

