/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;

final class Z
extends h1 {
    @Override
    final void g(Q q2, a object) {
        char c2 = object.e();
        if (c2 != '!') {
            if (c2 != '/') {
                q2.k("<");
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
            q2.k("<!");
            object = h1.v;
        }
        q2.u((h1)((Object)object));
    }
}

