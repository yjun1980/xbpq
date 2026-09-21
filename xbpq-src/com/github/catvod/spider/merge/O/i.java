/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.O.h;
import com.github.catvod.spider.merge.O.j;

public abstract class i
implements Runnable {
    public long c;
    public j d;

    public i() {
        h h2 = h.c;
        this.c = 0L;
        this.d = h2;
    }

    public i(long l2, j j2) {
        this.c = l2;
        this.d = j2;
    }
}

