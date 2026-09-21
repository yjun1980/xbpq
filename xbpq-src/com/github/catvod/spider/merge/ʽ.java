/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b3;
import com.github.catvod.spider.merge.\u02c0;
import com.github.catvod.spider.merge.\u02c1;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u081a;

public abstract class \u02bd<T>
implements \u02c1<T> {
    @Override
    public T \u037f(\u081a \u081a2) {
        return this.\u0794();
    }

    @Override
    public T \u0528(\u02b3 \u02b32) {
        return this.\u0794();
    }

    @Override
    public T \u052b(\u02c0 \u02c02) {
        T t2 = this.\u0794();
        int n2 = \u02c02.\u052c();
        for (int i2 = 0; i2 < n2 && this.\u0795(\u02c02, t2); ++i2) {
            t2 = this.\u0793(t2, \u02c02.\u052b(i2).\u052a(this));
        }
        return t2;
    }

    protected T \u0793(T t2, T t3) {
        return t3;
    }

    protected T \u0794() {
        return null;
    }

    protected boolean \u0795(\u02c0 \u02c02, T t2) {
        return true;
    }

    public T \u0796(\u02c8 \u02c82) {
        return \u02c82.\u052a(this);
    }
}

