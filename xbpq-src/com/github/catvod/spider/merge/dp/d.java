/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.dp;

import com.github.catvod.spider.merge.dp.p;

public final class d
implements Runnable {
    public final p c;
    public final String d;

    public /* synthetic */ d(p p2, String string) {
        this.c = p2;
        this.d = string;
    }

    @Override
    public final void run() {
        p.e(this.c, this.d);
    }
}

