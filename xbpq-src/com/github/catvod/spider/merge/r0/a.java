/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.r0;

public final class a {
    private String a;
    private long b = -1L;
    private int c;

    public a() {
        this.c = 1;
    }

    public a(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.c = a2.c;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final void d(String string) {
        this.a = string;
    }
}

