/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class E0
extends i1 {
    @Override
    final void l(S s2, a object) {
        if (object.C("--")) {
            s2.n.h();
            object = i1.S;
        } else if (object.D("DOCTYPE")) {
            object = i1.Y;
        } else if (object.C("[CDATA[")) {
            s2.i();
            object = i1.o0;
        } else {
            s2.r(this);
            s2.f();
            object = i1.Q;
        }
        s2.v((i1)((Object)object));
    }
}

