/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.f1.S;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;

final class a0
extends i1 {
    @Override
    final void l(S s2, a object) {
        char c2 = object.f();
        if (c2 != '!') {
            if (c2 != '/') {
                s2.l("<");
                if (c2 != '\uffff') {
                    object.P();
                    object = i1.f;
                } else {
                    s2.q(this);
                    object = i1.a;
                }
            } else {
                s2.i();
                object = i1.r;
            }
        } else {
            s2.l("<!");
            object = i1.t;
        }
        s2.v((i1)((Object)object));
    }
}

