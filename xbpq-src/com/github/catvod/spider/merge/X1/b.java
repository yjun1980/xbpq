/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class b
implements f {
    private int a;

    public b(int n2) {
        this.a = n2 + 4;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4 = n2;
        while (n4 <= n3 + n2 - 4) {
            int n5 = n4 + 1;
            int n6 = n4;
            if ((byArray[n5] & 0xF8) == 240) {
                int n7 = n4 + 3;
                n6 = n4;
                if ((byArray[n7] & 0xF8) == 248) {
                    byte by = byArray[n5];
                    byte by2 = byArray[n4];
                    int n8 = byArray[n7];
                    n6 = n4 + 2;
                    n8 = (((by & 7) << 19 | (by2 & 0xFF) << 11 | (n8 & 7) << 8 | byArray[n6] & 0xFF) << 1) - (this.a + n4 - n2) >>> 1;
                    byArray[n5] = (byte)(0xF0 | n8 >>> 19 & 7);
                    byArray[n4] = (byte)(n8 >>> 11);
                    byArray[n7] = (byte)(n8 >>> 8 & 7 | 0xF8);
                    byArray[n6] = (byte)n8;
                }
            }
            n4 = n6 + 2;
        }
        n2 = n4 - n2;
        this.a += n2;
        return n2;
    }
}

