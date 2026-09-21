/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j0;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class a {
    private long a;
    private long b;
    private long c;
    private long d;
    private BlockingQueue<byte[]> e = new LinkedBlockingQueue<byte[]>();

    public a(long l2, long l3) {
        this.a = l2;
        this.b = l3;
        this.c = l3 - l2 + 1L;
        this.d = 0L;
    }

    static /* bridge */ /* synthetic */ long a(a a2) {
        return a2.b;
    }

    static /* bridge */ /* synthetic */ long b(a a2) {
        return a2.a;
    }

    public final boolean c() {
        boolean bl = this.d >= this.c;
        return bl;
    }

    public final void d(byte[] byArray) {
        ((LinkedBlockingQueue)this.e).put(byArray);
    }

    public final byte[] e() {
        byte[] byArray = (byte[])((LinkedBlockingQueue)this.e).poll(10, TimeUnit.SECONDS);
        this.d += (long)byArray.length;
        return byArray;
    }
}

