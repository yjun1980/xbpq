/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X1;

import com.github.catvod.spider.merge.X1.f;

public final class g
implements f {
    private static final boolean[] c = new boolean[]{true, true, true, false, true, false, false, false};
    private static final int[] d = new int[]{0, 1, 2, 2, 3, 3, 3, 3};
    private int a;
    private int b = 0;

    public g(int n2) {
        this.a = n2 + 5;
    }

    private static boolean b(byte by) {
        boolean bl = (by = (byte)(by & 0xFF)) == 0 || by == 255;
        return bl;
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        int n5 = n2 - 1;
        int n6 = n2;
        while (true) {
            block6: {
                block9: {
                    block8: {
                        block7: {
                            n4 = 0;
                            if (n6 > n3 + n2 - 5) break;
                            if ((byArray[n6] & 0xFE) != 232) break block6;
                            if (((n5 = n6 - n5) & 0xFFFFFFFC) == 0) break block7;
                            this.b = 0;
                            break block8;
                        }
                        this.b = n5 = this.b << n5 - 1 & 7;
                        if (n5 != 0 && (!c[n5] || g.b(byArray[n6 + 4 - d[n5]]))) break block9;
                    }
                    n4 = n6 + 4;
                    if (g.b(byArray[n4])) {
                        int n7 = n6 + 1;
                        int n8 = byArray[n7];
                        int n9 = n6 + 2;
                        n5 = byArray[n9];
                        int n10 = n6 + 3;
                        n5 = n8 & 0xFF | (n5 & 0xFF) << 8 | (byArray[n10] & 0xFF) << 16 | (byArray[n4] & 0xFF) << 24;
                        while (true) {
                            if ((n8 = this.b) == 0 || !g.b((byte)((n5 -= this.a + n6 - n2) >>> 24 - (n8 = d[n8] * 8)))) {
                                byArray[n7] = (byte)n5;
                                byArray[n9] = (byte)(n5 >>> 8);
                                byArray[n10] = (byte)(n5 >>> 16);
                                byArray[n4] = (byte)(~((n5 >>> 24 & 1) - 1));
                                n5 = n6;
                                n6 = n4;
                                break block6;
                            }
                            n5 ^= (1 << 32 - n8) - 1;
                        }
                    }
                }
                this.b = this.b << 1 | 1;
                n5 = n6;
            }
            ++n6;
        }
        n3 = n6 - n5;
        n3 = (n3 & 0xFFFFFFFC) != 0 ? n4 : this.b << n3 - 1;
        this.b = n3;
        n2 = n6 - n2;
        this.a += n2;
        return n2;
    }
}

