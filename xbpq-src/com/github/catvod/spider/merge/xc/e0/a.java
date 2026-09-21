/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.h;
import com.github.catvod.spider.merge.xc.e0.i;

public abstract class a
implements g {
    public final h a;

    public a(h h2) {
        this.a = h2;
    }

    @Override
    public g b(h h2) {
        return b.m(this, h2);
    }

    @Override
    public final Object c(Object object, p p2) {
        return p2.invoke(object, this);
    }

    @Override
    public i e(h h2) {
        return b.w(this, h2);
    }

    @Override
    public final i f(i i2) {
        return b.F(this, i2);
    }

    @Override
    public final h getKey() {
        return this.a;
    }
}

