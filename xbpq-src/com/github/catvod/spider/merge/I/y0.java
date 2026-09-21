/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.L0;

public final class y0
implements Runnable {
    public final L0 a;
    public final boolean b;
    public final String c;

    public /* synthetic */ y0(L0 l02, boolean bl, String string) {
        this.a = l02;
        this.b = bl;
        this.c = string;
    }

    @Override
    public final void run() {
        L0.d(this.a, this.b, this.c);
    }
}

