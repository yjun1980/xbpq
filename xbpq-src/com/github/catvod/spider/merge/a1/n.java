/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

final class n {
    private static final byte[] a = new byte[1024];
    private static final int[] b = new int[1024];

    static void a(byte[] byArray, int n2) {
        int n3;
        for (int i2 = 0; i2 < n2; i2 += n3) {
            n3 = Math.min(i2 + 1024, n2) - i2;
            System.arraycopy(a, 0, byArray, 0 + i2, n3);
        }
    }

    static void b(int[] nArray, int n2, int n3) {
        int n4;
        for (int i2 = 0; i2 < n3; i2 += n4) {
            n4 = Math.min(i2 + 1024, n3) - i2;
            System.arraycopy(b, 0, nArray, n2 + i2, n4);
        }
    }
}

