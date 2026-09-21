/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.b.p;

public final class c
implements Runnable {
    public final p c;
    public final com.github.catvod.spider.merge.d.c d;

    public /* synthetic */ c(p p2, com.github.catvod.spider.merge.d.c c2) {
        this.c = p2;
        this.d = c2;
    }

    @Override
    public final void run() {
        p.g(this.c, this.d);
    }
}

