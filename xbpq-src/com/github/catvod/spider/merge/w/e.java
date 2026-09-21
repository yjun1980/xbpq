/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.r.d;
import com.github.catvod.spider.merge.s.a;
import com.github.catvod.spider.merge.w.b;

final class e {
    private static final int[][] a;
    private static final int[][] b;
    private static final int[][] c;
    private static final int[][] d;

    static {
        int[] nArray = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] nArray2 = new int[]{1, 0, 0, 0, 0, 0, 1};
        int[] nArray3 = new int[]{1, 0, 1, 1, 1, 0, 1};
        int[] nArray4 = new int[]{1, 0, 0, 0, 0, 0, 1};
        a = new int[][]{nArray, nArray2, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, nArray3, nArray4, {1, 1, 1, 1, 1, 1, 1}};
        nArray = new int[]{1, 1, 1, 1, 1};
        nArray3 = new int[]{1, 0, 1, 0, 1};
        nArray2 = new int[]{1, 0, 0, 0, 1};
        nArray4 = new int[]{1, 1, 1, 1, 1};
        b = new int[][]{nArray, {1, 0, 0, 0, 1}, nArray3, nArray2, nArray4};
        nArray4 = new int[]{-1, -1, -1, -1, -1, -1, -1};
        nArray2 = new int[]{6, 30, -1, -1, -1, -1, -1};
        nArray3 = new int[]{6, 22, 38, -1, -1, -1, -1};
        int[] nArray5 = new int[]{6, 30, 54, 78, 102, -1, -1};
        int[] nArray6 = new int[]{6, 34, 62, 90, 118, 146, -1};
        nArray = new int[]{6, 24, 50, 76, 102, 128, 154};
        int[] nArray7 = new int[]{6, 28, 54, 80, 106, 132, 158};
        int[] nArray8 = new int[]{6, 32, 58, 84, 110, 136, 162};
        c = new int[][]{nArray4, {6, 18, -1, -1, -1, -1, -1}, {6, 22, -1, -1, -1, -1, -1}, {6, 26, -1, -1, -1, -1, -1}, nArray2, {6, 34, -1, -1, -1, -1, -1}, nArray3, {6, 24, 42, -1, -1, -1, -1}, {6, 26, 46, -1, -1, -1, -1}, {6, 28, 50, -1, -1, -1, -1}, {6, 30, 54, -1, -1, -1, -1}, {6, 32, 58, -1, -1, -1, -1}, {6, 34, 62, -1, -1, -1, -1}, {6, 26, 46, 66, -1, -1, -1}, {6, 26, 48, 70, -1, -1, -1}, {6, 26, 50, 74, -1, -1, -1}, {6, 30, 54, 78, -1, -1, -1}, {6, 30, 56, 82, -1, -1, -1}, {6, 30, 58, 86, -1, -1, -1}, {6, 34, 62, 90, -1, -1, -1}, {6, 28, 50, 72, 94, -1, -1}, {6, 26, 50, 74, 98, -1, -1}, nArray5, {6, 28, 54, 80, 106, -1, -1}, {6, 32, 58, 84, 110, -1, -1}, {6, 30, 58, 86, 114, -1, -1}, {6, 34, 62, 90, 118, -1, -1}, {6, 26, 50, 74, 98, 122, -1}, {6, 30, 54, 78, 102, 126, -1}, {6, 26, 52, 78, 104, 130, -1}, {6, 30, 56, 82, 108, 134, -1}, {6, 34, 60, 86, 112, 138, -1}, {6, 30, 58, 86, 114, 142, -1}, nArray6, {6, 30, 54, 78, 102, 126, 150}, nArray, nArray7, nArray8, {6, 26, 54, 82, 110, 138, 166}, {6, 30, 58, 86, 114, 142, 170}};
        nArray2 = new int[]{8, 0};
        nArray6 = new int[]{8, 2};
        nArray8 = new int[]{8, 3};
        nArray7 = new int[]{8, 4};
        int[] nArray9 = new int[]{8, 5};
        int[] nArray10 = new int[]{8, 7};
        nArray = new int[]{8, 8};
        int[] nArray11 = new int[]{5, 8};
        nArray5 = new int[]{4, 8};
        int[] nArray12 = new int[]{3, 8};
        nArray4 = new int[]{1, 8};
        nArray3 = new int[]{0, 8};
        d = new int[][]{nArray2, {8, 1}, nArray6, nArray8, nArray7, nArray9, nArray10, nArray, {7, 8}, nArray11, nArray5, nArray12, {2, 8}, nArray4, nArray3};
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void a(a var0, int var1_1, com.github.catvod.spider.merge.v.e var2_2, int var3_3, b var4_4) {
        block31: {
            block32: {
                block33: {
                    block35: {
                        block34: {
                            var4_4.a();
                            var5_5 = e.a[0].length;
                            e.d(0, 0, var4_4);
                            e.d(var4_4.e() - var5_5, 0, var4_4);
                            e.d(0, var4_4.e() - var5_5, var4_4);
                            e.c(0, 7, var4_4);
                            e.c(var4_4.e() - 8, 7, var4_4);
                            e.c(0, var4_4.e() - 8, var4_4);
                            e.e(7, 0, var4_4);
                            e.e(var4_4.d() - 7 - 1, 0, var4_4);
                            e.e(7, var4_4.d() - 7, var4_4);
                            if (var4_4.b(8, var4_4.d() - 8) == 0) break block31;
                            var4_4.f(8, var4_4.d() - 8, 1);
                            if (var2_2.f() >= 2) {
                                var5_5 = var2_2.f() - 1;
                                var15_6 = e.c;
                                var14_7 = var15_6[var5_5];
                                var9_8 /* !! */  = var15_6[var5_5].length;
                                for (var5_5 = 0; var5_5 < var9_8 /* !! */ ; ++var5_5) {
                                    for (var6_9 /* !! */  = 0; var6_9 /* !! */  < var9_8 /* !! */ ; ++var6_9 /* !! */ ) {
                                        var11_13 = var14_7[var5_5];
                                        var10_12 /* !! */  = var14_7[var6_9 /* !! */ ];
                                        if (var10_12 /* !! */  == -1 || var11_13 == -1 || !e.g(var4_4.b((int)var10_12 /* !! */ , var11_13))) continue;
                                        for (var7_10 = 0; var7_10 < 5; ++var7_10) {
                                            for (var8_11 = 0; var8_11 < 5; ++var8_11) {
                                                var4_4.f((int)(var10_12 /* !! */  - 2 + var8_11), var11_13 - 2 + var7_10, e.b[var7_10][var8_11]);
                                            }
                                        }
                                    }
                                }
                            }
                            var5_5 = 8;
                            while (var5_5 < var4_4.e() - 8) {
                                var6_9 /* !! */  = var5_5 + 1;
                                var7_10 = var6_9 /* !! */  % 2;
                                if (e.g(var4_4.b(var5_5, 6))) {
                                    var4_4.f(var5_5, 6, var7_10);
                                }
                                if (e.g(var4_4.b(6, var5_5))) {
                                    var4_4.f(6, var5_5, var7_10);
                                }
                                var5_5 = var6_9 /* !! */ ;
                            }
                            var14_7 = new a();
                            var5_5 = var3_3 >= 0 && var3_3 < 8 ? 1 : 0;
                            if (var5_5 == 0) break block32;
                            var1_1 = com.github.catvod.spider.merge.v.a.a(var1_1) << 3 | var3_3;
                            var14_7.c(var1_1, 5);
                            var14_7.c(e.b(var1_1, 1335), 10);
                            var15_6 = new a();
                            var15_6.c(21522, 15);
                            var14_7.h((a)var15_6);
                            var1_1 = var14_7.f();
                            var15_6 = cYh.d("14382E243B3E473E2E25773206203134397A05253571203F47372E256D7A");
                            if (var1_1 != 15) break block33;
                            for (var1_1 = 0; var1_1 < var14_7.f(); ++var1_1) {
                                var12_14 = var14_7.e(var14_7.f() - 1 - var1_1);
                                var16_15 = e.d;
                                var4_4.g(var16_15[var1_1][0], var16_15[var1_1][1], var12_14);
                                if (var1_1 < 8) {
                                    var4_4.g(var4_4.e() - var1_1 - 1, 8, var12_14);
                                    continue;
                                }
                                var4_4.g(8, var1_1 - 8 + (var4_4.d() - 7), var12_14);
                            }
                            if (var2_2.f() < 7) break block34;
                            var14_7 = new a();
                            var14_7.c(var2_2.f(), 6);
                            var14_7.c(e.b(var2_2.f(), 7973), 12);
                            if (var14_7.f() == 18) {
                                var5_5 = 17;
                                for (var1_1 = 0; var1_1 < 6; ++var1_1) {
                                    for (var6_9 /* !! */  = 0; var6_9 /* !! */  < 3; ++var6_9 /* !! */ ) {
                                        var12_14 = var14_7.e(var5_5);
                                        --var5_5;
                                        var4_4.g(var1_1, var4_4.d() - 11 + var6_9 /* !! */ , var12_14);
                                        var4_4.g(var4_4.d() - 11 + var6_9 /* !! */ , var1_1, var12_14);
                                    }
                                }
                            }
                            break block35;
                        }
                        var6_9 /* !! */  = var4_4.e() - 1;
                        var1_1 = var4_4.d() - 1;
                        var9_8 /* !! */  = 0;
                        var7_10 = -1;
                        while (var6_9 /* !! */  > 0) {
                            var8_11 = var6_9 /* !! */ ;
                            var5_5 = var1_1;
                            var10_12 /* !! */  = var9_8 /* !! */ ;
                            if (var6_9 /* !! */  == 6) {
                                var8_11 = var6_9 /* !! */  - 1;
                                var10_12 /* !! */  = var9_8 /* !! */ ;
                                var5_5 = var1_1;
                            }
                            while (var5_5 >= 0 && var5_5 < var4_4.d()) {
                                var6_9 /* !! */  = (int)var10_12 /* !! */ ;
                                for (var9_8 /* !! */  = 0; var9_8 /* !! */  < 2; ++var9_8 /* !! */ ) {
                                    block36: {
                                        block38: {
                                            block37: {
                                                var11_13 = var8_11 - var9_8 /* !! */ ;
                                                if (!e.g(var4_4.b(var11_13, var5_5))) continue;
                                                if (var6_9 /* !! */  < var0.f()) {
                                                    var12_14 = var0.e(var6_9 /* !! */ );
                                                    ++var6_9 /* !! */ ;
                                                } else {
                                                    var12_14 = false;
                                                }
                                                var13_16 = var12_14;
                                                if (var3_3 == -1) break block36;
                                                switch (var3_3) {
                                                    default: {
                                                        var0 = new StringBuilder(cYh.d("2E3E37303B3303702C30243147202025233F153E7B71"));
                                                        var0.append(var3_3);
                                                        throw new IllegalArgumentException(var0.toString());
                                                    }
                                                    case 7: {
                                                        var1_1 = var5_5 * var11_13 % 3;
                                                        var10_12 /* !! */  = var5_5 + var11_13 & 1;
                                                        ** GOTO lbl116
                                                    }
                                                    case 6: {
                                                        var1_1 = var5_5 * var11_13;
                                                        var10_12 /* !! */  = var1_1 & 1;
                                                        var1_1 %= 3;
lbl116:
                                                        // 2 sources

                                                        var1_1 += var10_12 /* !! */ ;
                                                        break block37;
                                                    }
                                                    case 5: {
                                                        var1_1 = var5_5 * var11_13;
                                                        var1_1 = var1_1 % 3 + (var1_1 & 1);
                                                        break block38;
                                                    }
                                                    case 4: {
                                                        var1_1 = var5_5 / 2;
                                                        var1_1 = var11_13 / 3 + var1_1 & 1;
                                                        break block38;
                                                    }
                                                    case 3: {
                                                        var1_1 = (var5_5 + var11_13) % 3;
                                                        break block38;
                                                    }
                                                    case 2: {
                                                        var1_1 = var11_13 % 3;
                                                        break block38;
                                                    }
                                                    case 1: {
                                                        var1_1 = var5_5;
                                                        break block37;
                                                    }
                                                    case 0: 
                                                }
                                                var1_1 = var5_5 + var11_13;
                                            }
                                            var1_1 &= 1;
                                        }
                                        var1_1 = var1_1 == 0 ? 1 : 0;
                                        var13_16 = var12_14;
                                        if (var1_1 != 0) {
                                            var13_16 = var12_14 ^ true;
                                        }
                                    }
                                    var4_4.g(var11_13, var5_5, var13_16);
                                }
                                var5_5 += var7_10;
                                var10_12 /* !! */  = var6_9 /* !! */ ;
                            }
                            var7_10 = -var7_10;
                            var1_1 = var5_5 + var7_10;
                            var6_9 /* !! */  = var8_11 - 2;
                            var9_8 /* !! */  = (int)var10_12 /* !! */ ;
                        }
                        if (var9_8 /* !! */  == var0.f()) {
                            return;
                        }
                        var2_2 = new StringBuilder(cYh.d("293F357136360B702338232947332E3F242F0A35256B77"));
                        var2_2.append(var9_8 /* !! */ );
                        var2_2.append('/');
                        var2_2.append(var0.f());
                        throw new d(var2_2.toString());
                    }
                    var0 = new StringBuilder((String)var15_6);
                    var0.append(var14_7.f());
                    throw new d(var0.toString());
                }
                var0 = new StringBuilder((String)var15_6);
                var0.append(var14_7.f());
                throw new d(var0.toString());
            }
            throw new d(cYh.d("2E3E37303B3303702C30243147202025233F153E"));
        }
        var0 = new d();
        throw var0;
    }

    static int b(int n2, int n3) {
        if (n3 != 0) {
            int n4 = e.f(n3);
            n2 <<= n4 - 1;
            while (e.f(n2) >= n4) {
                n2 ^= n3 << e.f(n2) - n4;
            }
            return n2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(cYh.d("5770313E3B23093F2C383636"));
        throw illegalArgumentException;
    }

    private static void c(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 8; ++i2) {
            int n4 = n2 + i2;
            if (e.g(b2.b(n4, n3))) {
                b2.f(n4, n3, 0);
                continue;
            }
            throw new d();
        }
    }

    private static void d(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 7; ++i2) {
            for (int i3 = 0; i3 < 7; ++i3) {
                b2.f(n2 + i3, n3 + i2, a[i2][i3]);
            }
        }
    }

    private static void e(int n2, int n3, b b2) {
        for (int i2 = 0; i2 < 7; ++i2) {
            int n4 = n3 + i2;
            if (e.g(b2.b(n2, n4))) {
                b2.f(n2, n4, 0);
                continue;
            }
            throw new d();
        }
    }

    static int f(int n2) {
        return 32 - Integer.numberOfLeadingZeros(n2);
    }

    private static boolean g(int n2) {
        return n2 == -1;
    }
}

