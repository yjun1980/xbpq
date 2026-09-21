/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import java.util.concurrent.Executor;

final class e {
    static final e d = new e();
    final Runnable a;
    final Executor b;
    e c;

    e() {
        this.a = null;
        this.b = null;
    }

    e(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}

