/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.t;

public final class r
implements Runnable {
    public final t c;
    public final M d;
    public final int e;

    public /* synthetic */ r(t t2, M m2, int n2) {
        this.c = t2;
        this.d = m2;
        this.e = n2;
    }

    @Override
    public final void run() {
        t.D(this.c, this.d, this.e);
    }
}

