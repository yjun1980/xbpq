/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.U0.c;

public final class b
implements c {
    private byte[] a;
    private c b;

    public b(c c2, byte[] byArray) {
        int n2 = byArray.length;
        byte[] byArray2 = new byte[n2];
        this.a = byArray2;
        this.b = c2;
        System.arraycopy(byArray, 0, byArray2, 0, n2);
    }

    public final byte[] a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }
}

