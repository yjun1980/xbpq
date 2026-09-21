/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.L0;

public final class A0
implements Runnable {
    public final L0 a;
    public final boolean b;
    public final String c;
    public final String d;

    public /* synthetic */ A0(L0 l02, boolean bl, String string, String string2) {
        this.a = l02;
        this.b = bl;
        this.c = string;
        this.d = string2;
    }

    @Override
    public final void run() {
        L0.k(this.a, this.b, this.c, this.d);
    }
}

