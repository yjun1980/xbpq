/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j;

import com.github.catvod.spider.merge.j.k;

final class h
implements Runnable {
    final k a;

    h(k k2) {
        this.a = k2;
    }

    @Override
    public final void run() {
        this.a.a(true);
        this.a.invalidateSelf();
    }
}

