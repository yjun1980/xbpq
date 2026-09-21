/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class d
implements f {
    private int a;

    public d(int n2) {
        this.a = n2;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 <= n3 + n2 - 4; n4 += 4) {
            int n5;
            if ((byArray[n4] & 0xFC) != 72 || (byArray[n5 = n4 + 3] & 3) != 1) continue;
            int n6 = byArray[n4];
            int n7 = n4 + 1;
            byte by = byArray[n7];
            int n8 = n4 + 2;
            n6 = ((n6 & 3) << 24 | (by & 0xFF) << 16 | (byArray[n8] & 0xFF) << 8 | byArray[n5] & 0xFC) - (this.a + n4 - n2);
            byArray[n4] = (byte)(0x48 | n6 >>> 24 & 3);
            byArray[n7] = (byte)(n6 >>> 16);
            byArray[n8] = (byte)(n6 >>> 8);
            byArray[n5] = (byte)(byArray[n5] & 3 | n6);
        }
        n2 = n4 - n2;
        this.a += n2;
        return n2;
    }
}

