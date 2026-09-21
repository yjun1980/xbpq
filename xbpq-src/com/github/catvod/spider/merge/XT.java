/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Q;
import com.github.catvod.spider.merge.b;
import java.nio.charset.Charset;

public class XT {
    private static final byte[] S;
    private static final byte[] T4;
    private static final Charset l8;

    static {
        l8 = Q.S;
        S = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        T4 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    }

    public static byte[] S(byte[] byArray, boolean bl) {
        return XT.T4(byArray, bl, false);
    }

    public static byte[] T4(byte[] byArray, boolean bl, boolean bl2) {
        if (byArray == null) {
            return null;
        }
        int n2 = byArray.length;
        if (n2 == 0) {
            return new byte[0];
        }
        int n3 = n2 / 3 * 3;
        int n4 = n2 - 1;
        int n5 = n4 / 3 + 1 << 2;
        int n6 = bl ? (n5 - 1) / 76 << 1 : 0;
        int n7 = n5 + n6;
        byte[] byArray2 = new byte[n7];
        byte[] byArray3 = bl2 ? T4 : S;
        int n8 = 0;
        n5 = 0;
        int n9 = 0;
        while (n8 < n3) {
            n6 = n8 + 1;
            n8 = byArray[n8];
            int n10 = n6 + 1;
            n6 = (n8 & 0xFF) << 16 | (byArray[n6] & 0xFF) << 8 | byArray[n10] & 0xFF;
            n8 = n5 + 1;
            byArray2[n5] = byArray3[n6 >>> 18 & 0x3F];
            n5 = n8 + 1;
            byArray2[n8] = byArray3[n6 >>> 12 & 0x3F];
            int n11 = n5 + 1;
            byArray2[n5] = byArray3[n6 >>> 6 & 0x3F];
            n8 = n11 + 1;
            byArray2[n11] = byArray3[n6 & 0x3F];
            n5 = n8;
            n6 = n9++;
            if (bl) {
                n5 = n8;
                n6 = n9;
                if (n9 == 19) {
                    n5 = n8;
                    n6 = n9;
                    if (n8 < n7 - 2) {
                        n6 = n8 + 1;
                        byArray2[n8] = 13;
                        n5 = n6 + 1;
                        byArray2[n6] = 10;
                        n6 = 0;
                    }
                }
            }
            n8 = n10 + 1;
            n9 = n6;
        }
        n9 = n2 - n3;
        if (n9 > 0) {
            n5 = byArray[n3];
            n6 = n9 == 2 ? (byArray[n4] & 0xFF) << 2 : 0;
            n8 = n6 | (n5 & 0xFF) << 10;
            byArray2[n7 - 4] = byArray3[n8 >> 12];
            byArray2[n7 - 3] = byArray3[n8 >>> 6 & 0x3F];
            if (bl2) {
                n6 = n5 = n7 - 2;
                if (2 == n9) {
                    byArray2[n5] = byArray3[n8 & 0x3F];
                    n6 = n5 + 1;
                }
                byArray = new byte[n6];
                System.arraycopy(byArray2, 0, byArray, 0, n6);
                return byArray;
            }
            int n12 = n9 == 2 ? byArray3[n8 & 0x3F] : 61;
            byArray2[n7 - 2] = n12;
            byArray2[n7 - 1] = 61;
        }
        return byArray2;
    }

    public static String l8(byte[] byArray) {
        return b.S(XT.S(byArray, false), l8);
    }
}

