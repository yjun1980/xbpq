/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.k;

public final class l {
    public final k a;
    public final int b;

    public l(k k2, int n2) {
        this.a = k2;
        this.b = n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StrategyAndWidth [strategy=");
        stringBuilder.append(this.a);
        stringBuilder.append(", width=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

