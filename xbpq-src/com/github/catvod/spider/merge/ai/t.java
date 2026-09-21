/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.Market;

public final class t
implements Runnable {
    public final Market a;
    public final int b;

    public /* synthetic */ t(Market market, int n2) {
        this.a = market;
        this.b = n2;
    }

    @Override
    public final void run() {
        Market.c(this.a, this.b);
    }
}

