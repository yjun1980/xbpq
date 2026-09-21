/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class e
implements f {
    private int a;

    public e(int n2) {
        this.a = n2;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 <= n3 + n2 - 4; n4 += 4) {
            if ((byArray[n4] != 64 || (byArray[n4 + 1] & 0xC0) != 0) && (byArray[n4] != 127 || (byArray[n4 + 1] & 0xC0) != 192)) continue;
            byte by = byArray[n4];
            int n5 = n4 + 1;
            int n6 = byArray[n5];
            int n7 = n4 + 2;
            byte by2 = byArray[n7];
            int n8 = n4 + 3;
            n6 = (((by & 0xFF) << 24 | (n6 & 0xFF) << 16 | (by2 & 0xFF) << 8 | byArray[n8] & 0xFF) << 2) - (this.a + n4 - n2) >>> 2;
            n6 = n6 & 0x3FFFFF | 0 - (n6 >>> 22 & 1) << 22 & 0x3FFFFFFF | 0x40000000;
            byArray[n4] = (byte)(n6 >>> 24);
            byArray[n5] = (byte)(n6 >>> 16);
            byArray[n7] = (byte)(n6 >>> 8);
            byArray[n8] = (byte)n6;
        }
        n2 = n4 - n2;
        this.a += n2;
        return n2;
    }
}

