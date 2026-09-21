/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Ph;
import com.github.catvod.spider.merge.Q;
import com.github.catvod.spider.merge.a;
import com.github.catvod.spider.merge.i;
import java.nio.charset.Charset;

public class OD {
    private static final byte[] S;
    private static final Charset l8;

    static {
        l8 = Q.S;
        S = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    }

    public static byte[] S(byte[] byArray) {
        if (a.l8(byArray)) {
            return byArray;
        }
        return OD.T4(byArray, 0, byArray.length);
    }

    public static byte[] T4(byte[] byArray, int n2, int n3) {
        if (a.l8(byArray)) {
            return byArray;
        }
        aA aA2 = new aA(n2);
        int n4 = n2 + n3 - 1;
        n2 = 0;
        int n5 = n3 * 3 / 4;
        byte[] byArray2 = new byte[n5];
        while (aA2.l8 <= n4) {
            int n6 = OD.b(byArray, aA2, n4);
            byte by = OD.b(byArray, aA2, n4);
            byte by2 = OD.b(byArray, aA2, n4);
            byte by3 = OD.b(byArray, aA2, n4);
            n3 = n2;
            if (-2 != by) {
                byArray2[n2] = (byte)(n6 << 2 | by >>> 4);
                n3 = n2 + 1;
            }
            n6 = n3;
            if (-2 != by2) {
                byArray2[n3] = (byte)((by & 0xF) << 4 | by2 >>> 2);
                n6 = n3 + 1;
            }
            n2 = n6;
            if (-2 == by3) continue;
            byArray2[n6] = (byte)((by2 & 3) << 6 | by3);
            n2 = n6 + 1;
        }
        if (n2 == n5) {
            return byArray2;
        }
        return (byte[])Ph.S(byArray2, new byte[n2], n2);
    }

    private static byte b(byte[] byArray, aA aA2, int n2) {
        int n3;
        while ((n3 = aA2.l8) <= n2) {
            byte by;
            aA2.l8 = n3 + 1;
            if ((n3 = byArray[n3]) <= -1 || (by = S[n3]) <= -1) continue;
            return by;
        }
        return -2;
    }

    public static byte[] l8(CharSequence charSequence) {
        return OD.S(i.l8(charSequence, l8));
    }

    private static class aA {
        int l8;

        aA(int n2) {
            this.l8 = n2;
        }
    }
}

