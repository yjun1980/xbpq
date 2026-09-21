/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.L0;
import com.github.catvod.spider.merge.E0.M0;
import com.github.catvod.spider.merge.E0.N0;
import com.github.catvod.spider.merge.E0.O0;
import com.github.catvod.spider.merge.E0.d;

final class P0 {
    private static final M0 a;
    public static final int b = 0;

    static {
        boolean bl = L0.t() && L0.u();
        M0 m02 = bl && !d.b() ? new O0() : new N0();
        a = m02;
    }

    static int a(int n2, int n3) {
        n2 = n2 <= -12 && n3 <= -65 ? (n2 ^= n3 << 8) : -1;
        return n2;
    }

    static int b(int n2, int n3, int n4) {
        n2 = n2 <= -12 && n3 <= -65 && n4 <= -65 ? n2 ^ n3 << 8 ^ n4 << 16 : -1;
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int c(byte[] byArray, int n2, int n3) {
        int n4 = byArray[n2 - 1];
        int n5 = n3 - n2;
        n3 = -1;
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) throw new AssertionError();
                n5 = byArray[n2];
                byte by = byArray[n2 + 1];
                n2 = n3;
                if (n4 > -12) return n2;
                n2 = n3;
                if (n5 > -65) return n2;
                if (by <= -65) return n5 << 8 ^ n4 ^ by << 16;
                return n3;
            }
            n5 = byArray[n2];
            n2 = n3;
            if (n4 > -12) return n2;
            if (n5 <= -65) return n4 ^ n5 << 8;
            return n3;
        }
        n2 = n4;
        if (n4 <= -12) return n2;
        return -1;
    }

    static String d(byte[] byArray, int n2, int n3) {
        return a.a(byArray, n2, n3);
    }

    static boolean e(byte[] byArray, int n2, int n3) {
        boolean bl = a.b(byArray, n2, n3) == 0;
        return bl;
    }
}

