/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

final class j {
    private byte[] a;
    private int[] b;

    j() {
    }

    static void a(j j2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] nArray = j2.b;
            byte[] byArray = j2.a;
            int n3 = i2 * 4;
            byte by = byArray[n3];
            byte by2 = byArray[n3 + 1];
            byte by3 = byArray[n3 + 2];
            nArray[i2] = (byArray[n3 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
        }
    }

    static void b(j j2, byte[] byArray, int[] nArray) {
        j2.a = byArray;
        j2.b = nArray;
    }
}

