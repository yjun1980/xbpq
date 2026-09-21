/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class c
implements f {
    private static final int[] b = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    private int a;

    public c(int n2) {
        this.a = n2;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 <= n2 + n3 - 16; n4 += 16) {
            int n5 = byArray[n4];
            int n6 = b[n5 & 0x1F];
            int n7 = 5;
            int n8 = 0;
            while (n8 < 3) {
                if ((n6 >>> n8 & 1) == 0) {
                    n5 = n4;
                } else {
                    int n9 = n7 >>> 3;
                    int n10 = n7 & 7;
                    long l2 = 0L;
                    for (n5 = 0; n5 < 6; ++n5) {
                        l2 |= ((long)byArray[n4 + n9 + n5] & 0xFFL) << n5 * 8;
                    }
                    long l3 = l2 >>> n10;
                    n5 = n4;
                    if ((l3 >>> 37 & 0xFL) == 5L) {
                        if ((l3 >>> 9 & 7L) != 0L) {
                            n5 = n4;
                        } else {
                            n5 = (int)(l3 >>> 13 & 0xFFFFFL);
                            long l4 = ((((int)(l3 >>> 36) & 1) << 20 | n5) << 4) - (this.a + n4 - n2) >>> 4;
                            long l5 = (1 << n10) - 1;
                            int n11 = 0;
                            while (true) {
                                n5 = n4;
                                if (n11 >= 6) break;
                                byArray[n4 + n9 + n11] = (byte)(((l3 & 0xFFFFFFEE00001FFFL | (l4 & 0xFFFFFL) << 13 | (l4 & 0x100000L) << 16) << n10 | l5 & l2) >>> n11 * 8);
                                ++n11;
                            }
                        }
                    }
                }
                ++n8;
                n7 += 41;
                n4 = n5;
            }
        }
        n2 = n4 - n2;
        this.a += n2;
        return n2;
    }
}

