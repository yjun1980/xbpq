/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.L0;

public final class z0
implements Runnable {
    public final L0 a;
    public final boolean b;
    public final String c;

    public /* synthetic */ z0(L0 l02, boolean bl, String string) {
        this.a = l02;
        this.b = bl;
        this.c = string;
    }

    @Override
    public final void run() {
        L0.e(this.a, this.b, this.c);
    }
}

