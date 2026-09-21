/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;
import com.github.catvod.spider.merge.f1.k0;
import com.github.catvod.spider.merge.f1.m0;

final class j0
extends i1 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    final void l(S s2, a object) {
        void var2_5;
        if (((a)object).H()) {
            s2.i();
            s2.h.append(((a)object).u());
            s2.l("<");
            s2.j(((a)object).u());
            m0 m02 = i1.B;
        } else {
            if (!((a)object).E('/')) {
                s2.j('<');
                s2.v(i1.v);
                return;
            }
            s2.i();
            k0 k02 = i1.z;
        }
        s2.a((i1)var2_5);
    }
}

