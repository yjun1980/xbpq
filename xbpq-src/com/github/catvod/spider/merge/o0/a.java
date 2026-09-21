/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o0;

import com.github.catvod.spider.merge.n0.b;
import com.github.catvod.spider.merge.o0.c;
import java.util.Queue;

public final class a
implements b {
    String c;
    com.github.catvod.spider.merge.p0.c d;
    Queue<c> e;

    public a(com.github.catvod.spider.merge.p0.c c2, Queue<c> queue) {
        this.d = c2;
        this.c = c2.b();
        this.e = queue;
    }

    @Override
    public final void a(String object, Throwable throwable) {
        object = new c();
        System.currentTimeMillis();
        ((c)object).a = this.d;
        Thread.currentThread().getName();
        this.e.add((c)object);
    }

    @Override
    public final String b() {
        return this.c;
    }
}

