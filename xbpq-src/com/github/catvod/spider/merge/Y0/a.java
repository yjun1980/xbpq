/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.U0.c;

public final class a
implements c {
    private byte[] a;

    public a(byte[] byArray) {
        int n2 = byArray.length;
        byte[] byArray2 = new byte[n2];
        this.a = byArray2;
        System.arraycopy(byArray, 0, byArray2, 0, n2);
    }

    public final byte[] a() {
        return this.a;
    }
}

