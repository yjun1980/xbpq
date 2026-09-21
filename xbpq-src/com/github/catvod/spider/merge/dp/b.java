/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.dp;

import com.github.catvod.spider.merge.dp.p;
import com.github.catvod.spider.merge.ka.c;

public final class b
implements Runnable {
    public final p c;
    public final c d;

    public /* synthetic */ b(p p2, c c2) {
        this.c = p2;
        this.d = c2;
    }

    @Override
    public final void run() {
        p.b(this.c, this.d);
    }
}

