/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.T.d;
import com.github.catvod.spider.merge.T.e;

public abstract class m
implements d {
    public Object A(e e2) {
        int n2 = e2.d();
        Object var4_3 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            var4_3 = e2.b(i2).e(this);
        }
        return var4_3;
    }

    public abstract boolean E(Object var1, Object var2);

    public abstract int F(Object var1);

    @Override
    public void a() {
    }

    @Override
    public void q() {
    }
}

