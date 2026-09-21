/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.Random;

public class ZF {
    public static String S(int n2) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        if (n2 > 0) {
            int n3;
            int n4 = 0;
            do {
                n3 = n4 + 1;
                stringBuffer.append("0123456789abcdef".charAt(random.nextInt(16)));
                n4 = n3;
            } while (n3 < n2);
            return stringBuffer.toString();
        }
        return stringBuffer.toString();
    }

    public static String T4() {
        int[][] nArrayArray = new int[][]{{1783627776, 1784676351}, {2035023872, 2035154943}, {2078801920, 2079064063}, {-1950089216, -1948778497}, {-1425539072, -1425014785}, {-1236271104, -1235419137}, {-770113536, -768606209}, {-569376768, -564133889}};
        int n2 = new Random().nextInt(8);
        return ZF.l8(nArrayArray[n2][0] + new Random().nextInt(nArrayArray[n2][1] - nArrayArray[n2][0]));
    }

    public static String b(int n2) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        if (n2 > 0) {
            int n3;
            int n4 = 0;
            do {
                n3 = n4 + 1;
                stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
                n4 = n3;
            } while (n3 < n2);
            return stringBuffer.toString();
        }
        return stringBuffer.toString();
    }

    public static String l8(int n2) {
        int[] nArray = new int[]{n2 >> 24 & 0xFF, n2 >> 16 & 0xFF, n2 >> 8 & 0xFF, n2 & 0xFF};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(nArray[0]));
        stringBuilder.append(".");
        stringBuilder.append(Integer.toString(nArray[1]));
        stringBuilder.append(".");
        stringBuilder.append(Integer.toString(nArray[2]));
        stringBuilder.append(".");
        stringBuilder.append(Integer.toString(nArray[3]));
        return stringBuilder.toString();
    }
}

