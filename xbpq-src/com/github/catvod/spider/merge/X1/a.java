/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class a
implements f {
    private int a;

    public a(int n2) {
        this.a = n2 + 8;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        for (n4 = n2; n4 <= n3 + n2 - 4; n4 += 4) {
            if ((byArray[n4 + 3] & 0xFF) != 235) continue;
            int n5 = n4 + 2;
            int n6 = byArray[n5];
            int n7 = n4 + 1;
            n6 = (((n6 & 0xFF) << 16 | (byArray[n7] & 0xFF) << 8 | byArray[n4] & 0xFF) << 2) - (this.a + n4 - n2) >>> 2;
            byArray[n5] = (byte)(n6 >>> 16);
            byArray[n7] = (byte)(n6 >>> 8);
            byArray[n4] = (byte)n6;
        }
        n2 = n4 - n2;
        this.a += n2;
        return n2;
    }
}

