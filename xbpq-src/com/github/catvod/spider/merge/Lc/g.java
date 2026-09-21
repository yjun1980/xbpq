/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.merge.Lc.d
 */
package com.github.catvod.spider.merge.Lc;

import com.github.catvod.spider.merge.Lc.d;
import com.github.catvod.spider.merge.Lc.f;
import com.github.catvod.spider.merge.gu.D;

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
            return "<EOF>";
        }
        return this.a.c();
    }
}

