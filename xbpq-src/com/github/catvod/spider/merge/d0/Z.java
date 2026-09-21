/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.h1;

final class Z
extends h1 {
    @Override
    final void g(Q q2, a object) {
        char c2 = object.e();
        if (c2 != '!') {
            if (c2 != '/') {
                q2.k(cYh.d("5B"));
                if (c2 != '\uffff') {
                    object.G();
                    object = h1.h;
                } else {
                    q2.p(this);
                    object = h1.c;
                }
            } else {
                q2.h();
                object = h1.t;
            }
        } else {
            q2.k(cYh.d("5B71"));
            object = h1.v;
        }
        q2.u((h1)((Object)object));
    }
}

