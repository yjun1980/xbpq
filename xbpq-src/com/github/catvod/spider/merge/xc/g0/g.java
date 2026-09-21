/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g0;

import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.g0.a;

public abstract class g
extends a {
    public g(d d2) {
        super(d2);
        if (d2 != null && d2.getContext() != j.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override
    public i getContext() {
        return j.a;
    }
}

