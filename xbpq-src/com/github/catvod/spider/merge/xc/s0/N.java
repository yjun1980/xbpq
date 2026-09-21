/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.s0.M;
import com.github.catvod.spider.merge.xc.s0.h;

public final class N
implements h {
    public final M a;

    public N(M m2) {
        this.a = m2;
    }

    @Override
    public final void a() {
        this.a.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposeOnCancel[");
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

