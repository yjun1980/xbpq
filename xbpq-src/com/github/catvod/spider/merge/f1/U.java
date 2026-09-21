/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class U
extends i1 {
    @Override
    final void l(S s2, a object) {
        if (object.E('/')) {
            s2.i();
            s2.a(i1.l);
        } else {
            if (object.H() && s2.b() != null && !object.t(s2.c())) {
                object = s2.h(false);
                ((O)object).v(s2.b());
                s2.k = object;
                s2.p();
                object = i1.h;
            } else {
                s2.l("<");
                object = i1.c;
            }
            s2.v((i1)((Object)object));
        }
    }
}

