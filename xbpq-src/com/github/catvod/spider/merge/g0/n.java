/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Notice;

public final class n
implements Runnable {
    public final Notice a;

    public /* synthetic */ n(Notice notice) {
        this.a = notice;
    }

    @Override
    public final void run() {
        Notice.b(this.a);
    }
}

