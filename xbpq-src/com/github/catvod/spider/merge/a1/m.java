/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

final class m {
    static final m[] d = new m[]{new m("", 0, ""), new m("", 0, " "), new m(" ", 0, " "), new m("", 12, ""), new m("", 10, " "), new m("", 0, " the "), new m(" ", 0, ""), new m("s ", 0, " "), new m("", 0, " of "), new m("", 10, ""), new m("", 0, " and "), new m("", 13, ""), new m("", 1, ""), new m(", ", 0, " "), new m("", 0, ", "), new m(" ", 10, " "), new m("", 0, " in "), new m("", 0, " to "), new m("e ", 0, " "), new m("", 0, "\""), new m("", 0, "."), new m("", 0, "\">"), new m("", 0, "\n"), new m("", 3, ""), new m("", 0, "]"), new m("", 0, " for "), new m("", 14, ""), new m("", 2, ""), new m("", 0, " a "), new m("", 0, " that "), new m(" ", 10, ""), new m("", 0, ". "), new m(".", 0, ""), new m(" ", 0, ", "), new m("", 15, ""), new m("", 0, " with "), new m("", 0, "'"), new m("", 0, " from "), new m("", 0, " by "), new m("", 16, ""), new m("", 17, ""), new m(" the ", 0, ""), new m("", 4, ""), new m("", 0, ". The "), new m("", 11, ""), new m("", 0, " on "), new m("", 0, " as "), new m("", 0, " is "), new m("", 7, ""), new m("", 1, "ing "), new m("", 0, "\n\t"), new m("", 0, ":"), new m(" ", 0, ". "), new m("", 0, "ed "), new m("", 20, ""), new m("", 18, ""), new m("", 6, ""), new m("", 0, "("), new m("", 10, ", "), new m("", 8, ""), new m("", 0, " at "), new m("", 0, "ly "), new m(" the ", 0, " of "), new m("", 5, ""), new m("", 9, ""), new m(" ", 10, ", "), new m("", 10, "\""), new m(".", 0, "("), new m("", 11, " "), new m("", 10, "\">"), new m("", 0, "=\""), new m(" ", 0, "."), new m(".com/", 0, ""), new m(" the ", 0, " of the "), new m("", 10, "'"), new m("", 0, ". This "), new m("", 0, ","), new m(".", 0, " "), new m("", 10, "("), new m("", 10, "."), new m("", 0, " not "), new m(" ", 0, "=\""), new m("", 0, "er "), new m(" ", 11, " "), new m("", 0, "al "), new m(" ", 11, ""), new m("", 0, "='"), new m("", 11, "\""), new m("", 10, ". "), new m(" ", 0, "("), new m("", 0, "ful "), new m(" ", 10, ". "), new m("", 0, "ive "), new m("", 0, "less "), new m("", 11, "'"), new m("", 0, "est "), new m(" ", 10, "."), new m("", 11, "\">"), new m(" ", 0, "='"), new m("", 10, ","), new m("", 0, "ize "), new m("", 11, "."), new m("\u00c2\u00a0", 0, ""), new m(" ", 0, ","), new m("", 10, "=\""), new m("", 11, "=\""), new m("", 0, "ous "), new m("", 11, ", "), new m("", 10, "='"), new m(" ", 10, ","), new m(" ", 11, "=\""), new m(" ", 11, ", "), new m("", 11, ","), new m("", 11, "("), new m("", 11, ". "), new m(" ", 11, "."), new m("", 11, "='"), new m(" ", 11, ". "), new m(" ", 10, "=\""), new m(" ", 11, "='"), new m(" ", 10, "='")};
    private final byte[] a;
    private final int b;
    private final byte[] c;

    m(String object, int n2, String string) {
        int n3;
        int n4 = ((String)object).length();
        byte[] byArray = new byte[n4];
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            byArray[n3] = (byte)((String)object).charAt(n3);
        }
        this.a = byArray;
        this.b = n2;
        n3 = string.length();
        object = new byte[n3];
        for (n2 = n5; n2 < n3; ++n2) {
            object[n2] = (byte)string.charAt(n2);
        }
        this.c = (byte[])object;
    }

    static int a(byte[] byArray, int n2, byte[] byArray2, int n3, int n4, m m2) {
        int n5;
        byte[] byArray3 = m2.a;
        int n6 = byArray3.length;
        int n7 = 0;
        int n8 = n2;
        for (n5 = 0; n5 < n6; ++n5) {
            byArray[n8] = byArray3[n5];
            ++n8;
        }
        int n9 = m2.b;
        int n10 = 1;
        n5 = n9 >= 12 ? n9 - 12 + 1 : 0;
        n6 = n5;
        if (n5 > n4) {
            n6 = n4;
        }
        int n11 = n3 + n6;
        n3 = n9 <= 9 ? n9 - 1 + 1 : 0;
        n5 = n3 = n4 - n6 - n3;
        n4 = n11;
        while (n5 > 0) {
            byArray[n8] = byArray2[n4];
            --n5;
            ++n8;
            ++n4;
        }
        if (n9 == 11 || n9 == 10) {
            n4 = n8 - n3;
            if (n9 == 10) {
                n3 = n10;
            }
            while (n3 > 0) {
                n5 = byArray[n4] & 0xFF;
                if (n5 < 192) {
                    if (n5 >= 97 && n5 <= 122) {
                        byArray[n4] = (byte)(byArray[n4] ^ 0x20);
                    }
                    ++n4;
                    --n3;
                    continue;
                }
                if (n5 < 224) {
                    n5 = n4 + 1;
                    byArray[n5] = (byte)(byArray[n5] ^ 0x20);
                    n4 += 2;
                    n3 -= 2;
                    continue;
                }
                n5 = n4 + 2;
                byArray[n5] = (byte)(byArray[n5] ^ 5);
                n4 += 3;
                n3 -= 3;
            }
        }
        byArray2 = m2.c;
        n4 = byArray2.length;
        for (n3 = n7; n3 < n4; ++n3) {
            byArray[n8] = byArray2[n3];
            ++n8;
        }
        return n8 - n2;
    }
}

