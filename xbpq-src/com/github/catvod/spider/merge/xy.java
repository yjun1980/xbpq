/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.S;
import java.nio.charset.Charset;

public class xy {
    private static final char[] S;
    private static final char[] T4;
    public static final Charset l8;

    static {
        l8 = com.github.catvod.spider.merge.S.l;
        S = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        T4 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static char[] S(byte[] byArray, boolean bl) {
        char[] cArray = bl ? S : T4;
        return xy.T4(byArray, cArray);
    }

    protected static char[] T4(byte[] byArray, char[] cArray) {
        int n2 = byArray.length;
        char[] cArray2 = new char[n2 << 1];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3 + 1;
            cArray2[n3] = cArray[(byArray[i2] & 0xF0) >>> 4];
            n3 = n4 + 1;
            cArray2[n4] = cArray[byArray[i2] & 0xF];
        }
        return cArray2;
    }

    public static String b(byte[] byArray) {
        return new String(xy.l8(byArray));
    }

    public static char[] l8(byte[] byArray) {
        return xy.S(byArray, true);
    }
}

