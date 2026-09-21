/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o0;

import com.github.catvod.spider.merge.o0.c;

public final class d
implements c {
    private static final char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

    public final String a(byte[] objectArray) {
        int n2;
        int n3 = objectArray.length * 8 / 6;
        int n4 = n3 % 4;
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = 0;
        for (n2 = 0; n2 < n3 - n4; n2 += 4) {
            int n6 = n5 + 1;
            byte by = objectArray[n5];
            int n7 = n6 + 1;
            byte by2 = objectArray[n6];
            n6 = objectArray[n7];
            for (n5 = 3; n5 >= 0; --n5) {
                stringBuilder.append(a[((by & 0xFF) << 16 | (by2 & 0xFF) << 8 | n6 & 0xFF) >>> n5 * 6 & 0x3F]);
            }
            n5 = n7 + 1;
        }
        if (n4 > 0) {
            if (n4 == 1) {
                n2 = objectArray[n5] & 0xFF;
                objectArray = a;
                stringBuilder.append((char)objectArray[n2 >> 2]);
                stringBuilder.append((char)objectArray[n2 << 4 & 0x3F]);
                stringBuilder.append("==");
            } else {
                n2 = objectArray[n5];
                n2 = objectArray[n5 + 1] & 0xFF | (n2 & 0xFF) << 8;
                objectArray = a;
                stringBuilder.append((char)objectArray[n2 >>> 10 & 0x3F]);
                stringBuilder.append((char)objectArray[n2 >>> 4 & 0x3F]);
                stringBuilder.append((char)objectArray[n2 << 2 & 0x3F]);
                stringBuilder.append('=');
            }
        }
        return stringBuilder.toString();
    }
}

