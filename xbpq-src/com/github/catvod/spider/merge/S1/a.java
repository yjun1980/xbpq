/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S1;

public final class a {
    final int a;
    final byte[] b = new byte[256];
    int c = 0;

    public a(int n2) {
        if (n2 >= 1 && n2 <= 256) {
            this.a = n2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a(byte[] byArray, int n2, int n3) {
        for (int i2 = n2; i2 < n3 + n2; ++i2) {
            byte by = byArray[i2];
            byte[] byArray2 = this.b;
            int n4 = this.a;
            int n5 = this.c;
            byArray[i2] = (byte)(by + byArray2[n4 + n5 & 0xFF]);
            this.c = n5 - 1;
            byArray2[n5 & 0xFF] = byArray[i2];
        }
    }
}

