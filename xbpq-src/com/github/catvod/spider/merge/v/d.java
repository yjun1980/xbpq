/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.v.c;

public final class d {
    private final int a;
    private final c[] b;

    d(int n2, c ... cArray) {
        this.a = n2;
        this.b = cArray;
    }

    public final c[] a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        c[] cArray = this.b;
        int n2 = cArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += cArray[i2].a();
        }
        return n3;
    }

    public final int d() {
        int n2 = this.a;
        c[] cArray = this.b;
        int n3 = cArray.length;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            n4 += cArray[i2].a();
        }
        return n2 * n4;
    }
}

