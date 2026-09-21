/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.P.D;
import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.T.f;
import com.github.catvod.spider.merge.cYh;

public class g
implements f {
    public D a;

    public g(D d2) {
        this.a = d2;
    }

    @Override
    public final D a() {
        return this.a;
    }

    @Override
    public final String c() {
        return this.a.c();
    }

    @Override
    public <T> T e(d<? extends T> d2) {
        d2.q();
        return null;
    }

    public final String toString() {
        if (this.a.e() == -1) {
            return cYh.d("5B150E1769");
        }
        return this.a.c();
    }
}

