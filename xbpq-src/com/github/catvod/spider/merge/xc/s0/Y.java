/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.l;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.Z;
import com.github.catvod.spider.merge.xc.s0.g0;

public final class Y
implements Z {
    public final l a;

    public Y(g0 g02) {
        this.a = g02;
    }

    @Override
    public final void d(Throwable throwable) {
        this.a.invoke(throwable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InternalCompletionHandler.UserSupplied[");
        stringBuilder.append(this.a.getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(E.c(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

