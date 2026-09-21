/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

final class e {
    static final int[] a = new int[0];
    static final Object[] b = new Object[0];

    static int a(int[] nArray, int n2, int n3) {
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

    static int b(long[] lArray, int n2, long l2) {
        --n2;
        int n3 = 0;
        while (n3 <= n2) {
            int n4 = n3 + n2 >>> 1;
            long l3 = lArray[n4] - l2;
            long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (l4 < 0) {
                n3 = n4 + 1;
                continue;
            }
            if (l4 > 0) {
                n2 = n4 - 1;
                continue;
            }
            return n4;
        }
        return ~n3;
    }

    public static boolean c(Object object, Object object2) {
        boolean bl = object == object2 || object != null && object.equals(object2);
        return bl;
    }

    public static int d(int n2) {
        int n3;
        int n4 = n2 * 4;
        n2 = 4;
        while (true) {
            n3 = n4;
            if (n2 >= 32 || n4 <= (n3 = (1 << n2) - 12)) break;
            ++n2;
        }
        return n3 / 4;
    }

    public static int e(int n2) {
        int n3;
        int n4 = n2 * 8;
        n2 = 4;
        while (true) {
            n3 = n4;
            if (n2 >= 32 || n4 <= (n3 = (1 << n2) - 12)) break;
            ++n2;
        }
        return n3 / 8;
    }
}

