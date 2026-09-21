/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.e0.i;
import com.github.catvod.spider.merge.xc.s0.B;

public final class f
implements B {
    public final i a;

    public f(i i2) {
        this.a = i2;
    }

    @Override
    public final i d() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineScope(coroutineContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

