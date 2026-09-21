/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

public abstract class d {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];

    public static int a(int[] nArray, int n2, int n3) {
        --n2;
        int n4 = 0;
        while (n4 <= n2) {
            int n5 = n4 + n2 >>> 1;
            int n6 = nArray[n5];
            if (n6 < n3) {
                n4 = n5 + 1;
                continue;
            }
            if (n6 > n3) {
                n2 = n5 - 1;
                continue;
            }
            return n5;
        }
        return ~n4;
    }

    public static int b(long[] lArray, int n2, long l2) {
        --n2;
        int n3 = 0;
        while (n3 <= n2) {
            int n4 = n3 + n2 >>> 1;
            long l3 = lArray[n4];
            if (l3 < l2) {
                n3 = n4 + 1;
                continue;
            }
            if (l3 > l2) {
                n2 = n4 - 1;
                continue;
            }
            return n4;
        }
        return ~n3;
    }
}

