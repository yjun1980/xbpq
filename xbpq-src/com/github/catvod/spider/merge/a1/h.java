/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

final class h {
    static void a(int[] nArray, int n2, int n3, int[] nArray2, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int[] nArray3 = new int[n4];
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[16];
        int n10 = 0;
        for (n9 = 0; n9 < n4; ++n9) {
            n8 = nArray2[n9];
            nArray4[n8] = nArray4[n8] + 1;
        }
        nArray5[1] = 0;
        n9 = 1;
        while (n9 < 15) {
            n8 = n9 + 1;
            nArray5[n8] = nArray5[n9] + nArray4[n9];
            n9 = n8;
        }
        for (n9 = 0; n9 < n4; ++n9) {
            if (nArray2[n9] == 0) continue;
            n7 = nArray2[n9];
            n8 = nArray5[n7];
            nArray5[n7] = n8 + 1;
            nArray3[n8] = n9;
        }
        int n11 = 1 << n3;
        if (nArray5[15] == 1) {
            for (n3 = 0; n3 < n11; ++n3) {
                nArray[n2 + n3] = nArray3[0];
            }
            return;
        }
        int n12 = 2;
        n8 = 0;
        n7 = 1;
        n9 = 2;
        n4 = n10;
        while (n7 <= n3) {
            while (nArray4[n7] > 0) {
                n6 = nArray3[n8];
                n10 = n11;
                do {
                    n5 = n10 - n9;
                    nArray[n2 + n4 + n5] = n7 << 16 | n6;
                    n10 = n5;
                } while (n5 > 0);
                n10 = 1 << n7 - 1;
                while ((n4 & n10) != 0) {
                    n10 >>= 1;
                }
                n4 = (n4 & n10 - 1) + n10;
                nArray4[n7] = nArray4[n7] - 1;
                ++n8;
            }
            ++n7;
            n9 <<= 1;
        }
        n9 = n3 + 1;
        int n13 = -1;
        n7 = n2;
        n5 = n8;
        n6 = n4;
        n10 = n12;
        n4 = n11;
        while (n9 <= 15) {
            n8 = n7;
            n7 = n13;
            while (nArray4[n9] > 0) {
                n13 = n6 & n11 - 1;
                if (n13 != n7) {
                    n7 = n8 + n4;
                    n8 = 1 << n9 - n3;
                    n4 = n9;
                    while (n4 < 15 && (n8 -= nArray4[n4]) > 0) {
                        ++n4;
                        n8 <<= 1;
                    }
                    nArray[n2 + n13] = (n4 -= n3) + n3 << 16 | n7 - n2 - n13;
                    n8 = n13;
                    n4 = 1 << n4;
                } else {
                    n13 = n7;
                    n7 = n8;
                    n8 = n13;
                }
                int n14 = nArray3[n5];
                n13 = n4;
                do {
                    n12 = n13 - n10;
                    nArray[n7 + (n6 >> n3) + n12] = n9 - n3 << 16 | n14;
                    n13 = n12;
                } while (n12 > 0);
                n13 = 1 << n9 - 1;
                while ((n6 & n13) != 0) {
                    n13 >>= 1;
                }
                n6 = (n6 & n13 - 1) + n13;
                nArray4[n9] = nArray4[n9] - 1;
                n13 = n7;
                ++n5;
                n7 = n8;
                n8 = n13;
            }
            ++n9;
            n10 <<= 1;
            n13 = n7;
            n7 = n8;
        }
    }
}

