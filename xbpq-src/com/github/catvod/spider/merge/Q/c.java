/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.Q.b;

public abstract class c
extends com.github.catvod.spider.merge.S.b<b> {
    public c(m m2) {
        super(m2, 2);
    }

    @Override
    protected final Object a(Object object) {
        object = !(object instanceof b) ? null : (b)object;
        return object;
    }

    @Override
    protected final Object[] c(int n2) {
        return new b[n2];
    }

    @Override
    protected final Object[][] d(int n2) {
        return new b[n2][];
    }
}

