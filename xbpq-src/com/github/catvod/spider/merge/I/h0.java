/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.I.s0;

public final class h0
implements Runnable {
    public final s0 a;
    public final String b;
    public final String c;

    public /* synthetic */ h0(s0 s02, String string, String string2) {
        this.a = s02;
        this.b = string;
        this.c = string2;
    }

    @Override
    public final void run() {
        s0.d(this.a, this.b, this.c);
    }
}

