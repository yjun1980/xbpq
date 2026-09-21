/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q1;

import com.github.catvod.spider.merge.Q1.c;

public final class b
extends c {
    private static final long[][] d = new long[4][256];
    private long c = -1L;

    static {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i4 = 0; i4 < 256; ++i4) {
                long l2 = i2 == 0 ? (long)i4 : d[i2 - 1][i4];
                long l3 = l2;
                for (int i5 = 0; i5 < 8; ++i5) {
                    long l4;
                    l2 = l4 = l3 >>> 1;
                    if ((l3 & 1L) == 1L) {
                        l2 = l4 ^ 0xC96C5795D7870F42L;
                    }
                    l3 = l2;
                }
                com.github.catvod.spider.merge.Q1.b.d[i2][i4] = l3;
            }
        }
    }

    public b() {
        this.a = 8;
        this.b = "CRC64";
    }

    @Override
    public final byte[] a() {
        long l2 = this.c;
        this.c = -1L;
        byte[] byArray = new byte[8];
        for (int i2 = 0; i2 < 8; ++i2) {
            byArray[i2] = (byte)((l2 ^ 0xFFFFFFFFFFFFFFFFL) >> i2 * 8);
        }
        return byArray;
    }

    @Override
    public final void d(byte[] byArray, int n2, int n3) {
        Object object;
        long l2;
        int n4 = n3 + n2;
        while (true) {
            if (n2 >= n4 - 3) break;
            l2 = this.c;
            n3 = (int)l2;
            object = d;
            this.c = l2 >>> 32 ^ (object[3][n3 & 0xFF ^ byArray[n2] & 0xFF] ^ object[2][n3 >>> 8 & 0xFF ^ byArray[n2 + 1] & 0xFF]) ^ object[1][n3 >>> 16 & 0xFF ^ byArray[n2 + 2] & 0xFF] ^ object[0][n3 >>> 24 & 0xFF ^ byArray[n2 + 3] & 0xFF];
            n2 += 4;
        }
        for (n3 = n2; n3 < n4; ++n3) {
            object = d[0];
            n2 = byArray[n3];
            l2 = this.c;
            this.c = l2 >>> 8 ^ object[n2 & 0xFF ^ (int)l2 & 0xFF];
        }
    }
}

