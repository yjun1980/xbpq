/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.a1.a;
import com.github.catvod.spider.merge.a1.c;
import com.github.catvod.spider.merge.a1.d;
import com.github.catvod.spider.merge.a1.f;
import com.github.catvod.spider.merge.a1.g;
import com.github.catvod.spider.merge.a1.h;
import com.github.catvod.spider.merge.a1.i;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.merge.a1.l;
import com.github.catvod.spider.merge.a1.m;
import com.github.catvod.spider.merge.a1.n;

final class e {
    private static final int[] a = new int[]{1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] b = new int[]{3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] c = new int[]{0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] d = new int[]{131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(l object, int n2) {
        a a2 = ((l)object).c;
        int[] nArray = ((l)object).p;
        int n3 = n2 * 2;
        com.github.catvod.spider.merge.a1.a.d(a2);
        int[] nArray2 = ((l)object).e;
        int n4 = n2 * 1080;
        int n5 = e.h(nArray2, n4, a2);
        ((l)object).n[n2] = e.f(((l)object).f, n4, a2);
        n5 = n5 == 1 ? nArray[n3 + 1] + 1 : (n5 == 0 ? nArray[n3] : (n5 -= 2));
        object = ((l)object).o;
        n4 = n5;
        if (n5 >= object[n2]) {
            n4 = n5 - object[n2];
        }
        n2 = n3 + 1;
        nArray[n3] = nArray[n2];
        nArray[n2] = n4;
    }

    private static int b(int n2, byte[] byArray, a object) {
        Object object2;
        int n3;
        com.github.catvod.spider.merge.a1.a.i((a)object);
        int n4 = e.d((a)object) + 1;
        if (n4 == 1) {
            n.a(byArray, n2);
            return n4;
        }
        int n5 = com.github.catvod.spider.merge.a1.a.h((a)object, 1) == 1 ? 1 : 0;
        int n6 = n5 != 0 ? com.github.catvod.spider.merge.a1.a.h((a)object, 4) + 1 : 0;
        int[] nArray = new int[1080];
        e.g(n4 + n6, nArray, 0, (a)object);
        n5 = 0;
        block0: while (n5 < n2) {
            com.github.catvod.spider.merge.a1.a.i((a)object);
            com.github.catvod.spider.merge.a1.a.d((a)object);
            n3 = e.h(nArray, 0, (a)object);
            if (n3 == 0) {
                byArray[n5] = 0;
            } else {
                if (n3 <= n6) {
                    object2 = (1 << n3) + com.github.catvod.spider.merge.a1.a.h((a)object, n3);
                    n3 = n5;
                    while (true) {
                        n5 = ++n3;
                        if (object2 == 0) continue block0;
                        if (n3 >= n2) break;
                        byArray[n3] = 0;
                        --object2;
                    }
                    throw new c("Corrupted context map");
                }
                byArray[n5] = (byte)(n3 - n6);
            }
            ++n5;
        }
        if (com.github.catvod.spider.merge.a1.a.h((a)object, 1) == 1) {
            object = new int[256];
            for (n5 = 0; n5 < 256; ++n5) {
                object[n5] = n5;
            }
            for (n5 = 0; n5 < n2; ++n5) {
                n6 = byArray[n5] & 0xFF;
                byArray[n5] = (byte)object[n6];
                if (n6 == 0) continue;
                object2 = object[n6];
                while (n6 > 0) {
                    n3 = n6 - 1;
                    object[n6] = object[n3];
                    n6 = n3;
                }
                object[0] = object2;
            }
        }
        return n4;
    }

    private static void c(l l2) {
        int n2;
        e.a(l2, 0);
        int n3 = l2.p[1];
        l2.A = n2 = n3 << 6;
        n2 = l2.z[n2];
        l2.v = l2.k.c[n2 & 0xFF];
        n3 = l2.y[n3];
        int[] nArray = com.github.catvod.spider.merge.a1.d.b;
        l2.C = nArray[n3];
        l2.D = nArray[n3 + 1];
    }

    private static int d(a a2) {
        if (com.github.catvod.spider.merge.a1.a.h(a2, 1) != 0) {
            int n2 = com.github.catvod.spider.merge.a1.a.h(a2, 3);
            if (n2 == 0) {
                return 1;
            }
            return com.github.catvod.spider.merge.a1.a.h(a2, n2) + (1 << n2);
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void e(l var0) {
        block73: {
            block74: {
                var1_1 /* !! */  = var0.a;
                if (var1_1 /* !! */  == 0) break block73;
                if (var1_1 /* !! */  == 11) break block74;
                var12_2 = var0.c;
                var2_3 = var0.P - 1;
                var11_4 /* !! */  = var0.d;
                block11: while ((var4_6 /* !! */  = var0.a) != 10) {
                    block76: {
                        block75: {
                            block78: {
                                block80: {
                                    block81: {
                                        block84: {
                                            block82: {
                                                block83: {
                                                    block79: {
                                                        block77: {
                                                            var1_1 /* !! */  = 3;
                                                            var3_5 /* !! */  = 0;
                                                            var5_7 = 0;
                                                            if (var4_6 /* !! */  == 12) break block75;
                                                            var3_5 /* !! */  = 5;
                                                            switch (var4_6 /* !! */ ) {
                                                                default: {
                                                                    var11_4 /* !! */  = (byte[])com.github.catvod.spider.merge.C.a.c("Unexpected state ");
                                                                    var11_4 /* !! */ .append(var0.a);
                                                                    throw new c(var11_4 /* !! */ .toString());
                                                                }
                                                                case 9: {
                                                                    var3_5 /* !! */  = var0.L;
                                                                    if (var3_5 /* !! */  < 4 || var3_5 /* !! */  > 24) ** GOTO lbl41
                                                                    var4_6 /* !! */  = g.a[var3_5 /* !! */ ];
                                                                    var5_7 = var0.K - var0.s - 1;
                                                                    var6_8 /* !! */  = g.b[var3_5 /* !! */ ];
                                                                    var7_9 = var5_7 >>> var6_8 /* !! */ ;
                                                                    var13_12 /* !! */  = m.d;
                                                                    if (var7_9 >= var13_12 /* !! */ .length) ** GOTO lbl40
                                                                    var4_6 /* !! */  = m.a(var11_4 /* !! */ , var0.M, f.a, ((1 << var6_8 /* !! */ ) - 1 & var5_7) * var3_5 /* !! */  + var4_6 /* !! */ , var3_5 /* !! */ , var13_12 /* !! */ [var7_9]);
                                                                    var0.M = var3_5 /* !! */  = var0.M + var4_6 /* !! */ ;
                                                                    var0.r += var4_6 /* !! */ ;
                                                                    var0.g -= var4_6 /* !! */ ;
                                                                    var4_6 /* !! */  = var0.P;
                                                                    if (var3_5 /* !! */  >= var4_6 /* !! */ ) {
                                                                        var0.b = 8;
                                                                        var0.X = var4_6 /* !! */ ;
                                                                        var0.W = 0;
                                                                        var0.a = 12;
                                                                        continue block11;
                                                                    }
                                                                    break block76;
lbl40:
                                                                    // 1 sources

                                                                    throw new c("Invalid backward reference");
lbl41:
                                                                    // 1 sources

                                                                    throw new c("Invalid backward reference");
                                                                }
                                                                case 8: {
                                                                    var3_5 /* !! */  = var0.P;
                                                                    System.arraycopy(var11_4 /* !! */ , var3_5 /* !! */ , var11_4 /* !! */ , 0, var0.M - var3_5 /* !! */ );
                                                                    break block76;
                                                                }
                                                                case 5: {
                                                                    var14_13 = var0.c;
                                                                    var13_12 /* !! */  = (m[])var0.d;
                                                                    var1_1 /* !! */  = var0.g;
                                                                    if (var1_1 /* !! */  > 0) ** GOTO lbl53
                                                                    if (var14_13.g != 64) ** GOTO lbl69
                                                                    ** GOTO lbl65
lbl53:
                                                                    // 1 sources

                                                                    var1_1 /* !! */  = Math.min(var0.P - var0.r, var1_1 /* !! */ );
                                                                    com.github.catvod.spider.merge.a1.a.c((a)var14_13, (byte[])var13_12 /* !! */ , var0.r, var1_1 /* !! */ );
                                                                    var0.g -= var1_1 /* !! */ ;
                                                                    var0.r = var3_5 /* !! */  = var0.r + var1_1 /* !! */ ;
                                                                    var1_1 /* !! */  = var0.P;
                                                                    if (var3_5 /* !! */  == var1_1 /* !! */ ) {
                                                                        var0.b = 5;
                                                                        var0.X = var1_1 /* !! */ ;
                                                                        var0.W = 0;
                                                                        var0.a = 12;
                                                                        continue block11;
                                                                    }
                                                                    if (var14_13.g != 64) ** GOTO lbl69
lbl65:
                                                                    // 2 sources

                                                                    com.github.catvod.spider.merge.a1.a.i((a)var14_13);
                                                                    com.github.catvod.spider.merge.a1.a.a((a)var14_13, false);
                                                                    com.github.catvod.spider.merge.a1.a.d((a)var14_13);
                                                                    com.github.catvod.spider.merge.a1.a.d((a)var14_13);
lbl69:
                                                                    // 3 sources

                                                                    var0.a = 1;
                                                                    continue block11;
                                                                }
                                                                case 4: {
                                                                    while (var0.g > 0) {
                                                                        com.github.catvod.spider.merge.a1.a.i(var12_2);
                                                                        com.github.catvod.spider.merge.a1.a.h(var12_2, 8);
                                                                        --var0.g;
                                                                    }
                                                                    ** GOTO lbl143
                                                                }
                                                                case 2: {
                                                                    var13_12 /* !! */  = var0.c;
                                                                    for (var1_1 /* !! */  = 0; var1_1 /* !! */  < 3; ++var1_1 /* !! */ ) {
                                                                        var0.o[var1_1 /* !! */ ] = e.d((a)var13_12 /* !! */ ) + 1;
                                                                        var0.n[var1_1 /* !! */ ] = 0x10000000;
                                                                        var14_13 = var0.o;
                                                                        if (var14_13[var1_1 /* !! */ ] <= true) continue;
                                                                        var4_6 /* !! */  = (int)var14_13[var1_1 /* !! */ ];
                                                                        var14_13 = var0.e;
                                                                        var3_5 /* !! */  = var1_1 /* !! */  * 1080;
                                                                        e.g(var4_6 /* !! */  + 2, (int[])var14_13, var3_5 /* !! */ , (a)var13_12 /* !! */ );
                                                                        e.g(26, var0.f, var3_5 /* !! */ , (a)var13_12 /* !! */ );
                                                                        var0.n[var1_1 /* !! */ ] = e.f(var0.f, var3_5 /* !! */ , (a)var13_12 /* !! */ );
                                                                    }
                                                                    com.github.catvod.spider.merge.a1.a.i((a)var13_12 /* !! */ );
                                                                    var0.J = com.github.catvod.spider.merge.a1.a.h((a)var13_12 /* !! */ , 2);
                                                                    var1_1 /* !! */  = com.github.catvod.spider.merge.a1.a.h((a)var13_12 /* !! */ , 4);
                                                                    var3_5 /* !! */  = var0.J;
                                                                    var0.H = var4_6 /* !! */  = (var1_1 /* !! */  << var3_5 /* !! */ ) + 16;
                                                                    var0.I = (1 << var3_5 /* !! */ ) - 1;
                                                                    var0.y = new byte[var0.o[0]];
                                                                    var1_1 /* !! */  = 0;
                                                                    while (var1_1 /* !! */  < (var14_13 = (Object)var0.o)[0]) {
                                                                        var6_8 /* !! */  = Math.min(var1_1 /* !! */  + 96, (int)var14_13[0]);
                                                                        while (var1_1 /* !! */  < var6_8 /* !! */ ) {
                                                                            var0.y[var1_1 /* !! */ ] = (byte)(com.github.catvod.spider.merge.a1.a.h((a)var13_12 /* !! */ , 2) << 1);
                                                                            ++var1_1 /* !! */ ;
                                                                        }
                                                                        com.github.catvod.spider.merge.a1.a.i((a)var13_12 /* !! */ );
                                                                    }
                                                                    var15_14 = new byte[var14_13[0] << 6];
                                                                    var0.z = var15_14;
                                                                    var6_8 /* !! */  = e.b((int)(var14_13[0] << 6), var15_14, (a)var13_12 /* !! */ );
                                                                    var0.u = true;
                                                                    for (var1_1 /* !! */  = 0; var1_1 /* !! */  < (var14_13 = (Object)var0.o)[0] << 6; ++var1_1 /* !! */ ) {
                                                                        if (var0.z[var1_1 /* !! */ ] == var1_1 /* !! */  >> 6) continue;
                                                                        var0.u = false;
                                                                        break;
                                                                    }
                                                                    var0.G = var15_14 = new byte[var14_13[2] << 2];
                                                                    var1_1 /* !! */  = e.b((int)(var14_13[2] << 2), var15_14, (a)var13_12 /* !! */ );
                                                                    i.b(var0.k, 256, var6_8 /* !! */ );
                                                                    i.b(var0.l, 704, var0.o[1]);
                                                                    i.b(var0.m, var4_6 /* !! */  + (48 << var3_5 /* !! */ ), var1_1 /* !! */ );
                                                                    i.a(var0.k, (a)var13_12 /* !! */ );
                                                                    i.a(var0.l, (a)var13_12 /* !! */ );
                                                                    i.a(var0.m, (a)var13_12 /* !! */ );
                                                                    var0.A = 0;
                                                                    var0.B = 0;
                                                                    var14_13 = com.github.catvod.spider.merge.a1.d.b;
                                                                    var13_12 /* !! */  = (m[])var0.y;
                                                                    var0.C = (int)var14_13[var13_12 /* !! */ [0]];
                                                                    var0.D = (int)var14_13[var13_12 /* !! */ [0] + true];
                                                                    var0.v = var0.k.c[0];
                                                                    var0.E = var0.l.c[0];
                                                                    var13_12 /* !! */  = (m[])var0.p;
                                                                    var13_12 /* !! */ [4] = (m)true;
                                                                    var13_12 /* !! */ [2] = (m)true;
                                                                    var13_12 /* !! */ [0] = (m)true;
                                                                    var13_12 /* !! */ [5] = (m)false;
                                                                    var13_12 /* !! */ [3] = (m)false;
                                                                    var13_12 /* !! */ [1] = (m)false;
                                                                    var0.a = 3;
                                                                }
                                                                case 3: {
                                                                    if (var0.g > 0) ** GOTO lbl145
lbl143:
                                                                    // 2 sources

                                                                    var0.a = 1;
                                                                    continue block11;
lbl145:
                                                                    // 1 sources

                                                                    com.github.catvod.spider.merge.a1.a.i(var12_2);
                                                                    if (var0.n[1] == 0) {
                                                                        e.a(var0, 1);
                                                                        var0.E = var0.l.c[var0.p[3]];
                                                                    }
                                                                    var13_12 /* !! */  = (m[])var0.n;
                                                                    var13_12 /* !! */ [1] = var13_12 /* !! */ [1] - true;
                                                                    com.github.catvod.spider.merge.a1.a.d(var12_2);
                                                                    var4_6 /* !! */  = e.h(var0.l.b, var0.E, var12_2);
                                                                    var3_5 /* !! */  = var4_6 /* !! */  >>> 6;
                                                                    var0.F = 0;
                                                                    var1_1 /* !! */  = var3_5 /* !! */ ;
                                                                    if (var3_5 /* !! */  >= 2) {
                                                                        var1_1 /* !! */  = var3_5 /* !! */  - 2;
                                                                        var0.F = -1;
                                                                    }
                                                                    var3_5 /* !! */  = k.g[var1_1 /* !! */ ] + (var4_6 /* !! */  >>> 3 & 7);
                                                                    var1_1 /* !! */  = k.h[var1_1 /* !! */ ] + (var4_6 /* !! */  & 7);
                                                                    var0.x = k.c[var3_5 /* !! */ ] + com.github.catvod.spider.merge.a1.a.h(var12_2, k.d[var3_5 /* !! */ ]);
                                                                    var0.L = k.e[var1_1 /* !! */ ] + com.github.catvod.spider.merge.a1.a.h(var12_2, k.f[var1_1 /* !! */ ]);
                                                                    var0.w = 0;
                                                                    var0.a = 6;
                                                                }
                                                                case 6: {
                                                                    if (!var0.u) ** GOTO lbl185
                                                                    while (var0.w < var0.x) {
                                                                        com.github.catvod.spider.merge.a1.a.i(var12_2);
                                                                        if (var0.n[0] == 0) {
                                                                            e.c(var0);
                                                                        }
                                                                        var13_12 /* !! */  = (m[])var0.n;
                                                                        var13_12 /* !! */ [0] = var13_12 /* !! */ [0] - true;
                                                                        com.github.catvod.spider.merge.a1.a.d(var12_2);
                                                                        var11_4 /* !! */ [var0.r] = (byte)e.h(var0.k.b, var0.v, var12_2);
                                                                        ++var0.w;
                                                                        var1_1 /* !! */  = var0.r;
                                                                        var0.r = var1_1 /* !! */  + 1;
                                                                        if (var1_1 /* !! */  != var2_3) continue;
                                                                        var0.b = 6;
                                                                        var0.X = var0.P;
                                                                        var0.W = 0;
                                                                        var0.a = 12;
                                                                        ** GOTO lbl215
                                                                    }
                                                                    ** GOTO lbl215
lbl185:
                                                                    // 1 sources

                                                                    var3_5 /* !! */  = var0.r;
                                                                    var1_1 /* !! */  = var11_4 /* !! */ [var3_5 /* !! */  - 1 & var2_3] & 255;
                                                                    var3_5 /* !! */  = var11_4 /* !! */ [var3_5 /* !! */  - 2 & var2_3] & 255;
                                                                    while (var0.w < var0.x) {
                                                                        com.github.catvod.spider.merge.a1.a.i(var12_2);
                                                                        if (var0.n[0] == 0) {
                                                                            e.c(var0);
                                                                        }
                                                                        var14_13 = var0.z;
                                                                        var4_6 /* !! */  = var0.A;
                                                                        var13_12 /* !! */  = (m[])com.github.catvod.spider.merge.a1.d.a;
                                                                        var6_8 /* !! */  = (int)var13_12 /* !! */ [var0.C + var1_1 /* !! */ ];
                                                                        var3_5 /* !! */  = (int)var14_13[var4_6 /* !! */  + (var13_12 /* !! */ [var0.D + var3_5 /* !! */ ] | var6_8 /* !! */ )];
                                                                        var13_12 /* !! */  = (m[])var0.n;
                                                                        var13_12 /* !! */ [0] = var13_12 /* !! */ [0] - true;
                                                                        com.github.catvod.spider.merge.a1.a.d(var12_2);
                                                                        var13_12 /* !! */  = var0.k;
                                                                        var4_6 /* !! */  = e.h(var13_12 /* !! */ .b, var13_12 /* !! */ .c[var3_5 /* !! */  & 255], var12_2);
                                                                        var3_5 /* !! */  = var0.r;
                                                                        var11_4 /* !! */ [var3_5 /* !! */ ] = (byte)var4_6 /* !! */ ;
                                                                        ++var0.w;
                                                                        var0.r = var3_5 /* !! */  + 1;
                                                                        if (var3_5 /* !! */  != var2_3) ** GOTO lbl212
                                                                        var0.b = 6;
                                                                        var0.X = var0.P;
                                                                        var0.W = 0;
                                                                        var0.a = 12;
                                                                        break;
lbl212:
                                                                        // 1 sources

                                                                        var3_5 /* !! */  = var1_1 /* !! */ ;
                                                                        var1_1 /* !! */  = var4_6 /* !! */ ;
                                                                    }
lbl215:
                                                                    // 4 sources

                                                                    if (var0.a != 6) continue block11;
                                                                    var0.g = var1_1 /* !! */  = var0.g - var0.x;
                                                                    if (var1_1 /* !! */  <= 0) ** GOTO lbl289
                                                                    if (var0.F < 0) {
                                                                        com.github.catvod.spider.merge.a1.a.i(var12_2);
                                                                        if (var0.n[2] == 0) {
                                                                            e.a(var0, 2);
                                                                            var0.B = var0.p[5] << 2;
                                                                        }
                                                                        var13_12 /* !! */  = (m[])var0.n;
                                                                        var13_12 /* !! */ [2] = var13_12 /* !! */ [2] - true;
                                                                        com.github.catvod.spider.merge.a1.a.d(var12_2);
                                                                        var14_13 = var0.m;
                                                                        var13_12 /* !! */  = (m[])var14_13.b;
                                                                        var14_13 = var14_13.c;
                                                                        var15_14 = var0.G;
                                                                        var3_5 /* !! */  = var0.B;
                                                                        var1_1 /* !! */  = var0.L;
                                                                        var1_1 /* !! */  = var1_1 /* !! */  > 4 ? 3 : (var1_1 /* !! */  -= 2);
                                                                        var0.F = var3_5 /* !! */  = e.h((int[])var13_12 /* !! */ , (int)var14_13[var15_14[var3_5 /* !! */  + var1_1 /* !! */ ] & 255], var12_2);
                                                                        var1_1 /* !! */  = var0.H;
                                                                        if (var3_5 /* !! */  >= var1_1 /* !! */ ) {
                                                                            var6_8 /* !! */  = var3_5 /* !! */  - var1_1 /* !! */ ;
                                                                            var3_5 /* !! */  = var0.I;
                                                                            var0.F = var4_6 /* !! */  = var6_8 /* !! */  >>> var0.J;
                                                                            var7_9 = (var4_6 /* !! */  >>> 1) + 1;
                                                                            var0.F = var1_1 /* !! */  + (var3_5 /* !! */  & var6_8 /* !! */ ) + (((var4_6 /* !! */  & 1) + 2 << var7_9) - 4 + com.github.catvod.spider.merge.a1.a.h(var12_2, var7_9) << var0.J);
                                                                        }
                                                                    }
                                                                    var3_5 /* !! */  = var0.F;
                                                                    var13_12 /* !! */  = (m[])var0.q;
                                                                    var4_6 /* !! */  = var0.t;
                                                                    var1_1 /* !! */  = var3_5 /* !! */  < 16 ? (int)(var13_12 /* !! */ [e.b[var3_5 /* !! */ ] + var4_6 /* !! */  & 3] + e.c[var3_5 /* !! */ ]) : var3_5 /* !! */  - 16 + 1;
                                                                    var0.K = var1_1 /* !! */ ;
                                                                    if (var1_1 /* !! */  < 0) break block77;
                                                                    var7_9 = var0.s;
                                                                    var6_8 /* !! */  = var0.N;
                                                                    var0.s = var7_9 != var6_8 /* !! */  && (var7_9 = var0.r) < var6_8 /* !! */  ? var7_9 : var6_8 /* !! */ ;
                                                                    var0.M = var0.r;
                                                                    if (var1_1 /* !! */  <= var0.s) ** GOTO lbl254
                                                                    var1_1 /* !! */  = 9;
                                                                    break block76;
lbl254:
                                                                    // 1 sources

                                                                    if (var3_5 /* !! */  > 0) {
                                                                        var13_12 /* !! */ [var4_6 /* !! */  & 3] = (m)var1_1 /* !! */ ;
                                                                        var0.t = var4_6 /* !! */  + 1;
                                                                    }
                                                                    if (var0.L > var0.g) break;
                                                                    var0.w = 0;
                                                                    var0.a = 7;
                                                                }
                                                                case 7: {
                                                                    var4_6 /* !! */  = var0.r;
                                                                    var1_1 /* !! */  = var4_6 /* !! */  - var0.K & var2_3;
                                                                    var6_8 /* !! */  = var0.L - var0.w;
                                                                    if (var1_1 /* !! */  + var6_8 /* !! */  < var2_3 && var4_6 /* !! */  + var6_8 /* !! */  < var2_3) {
                                                                        var3_5 /* !! */  = var5_7;
                                                                        while (var3_5 /* !! */  < var6_8 /* !! */ ) {
                                                                            var11_4 /* !! */ [var4_6 /* !! */ ] = var11_4 /* !! */ [var1_1 /* !! */ ];
                                                                            ++var3_5 /* !! */ ;
                                                                            ++var4_6 /* !! */ ;
                                                                            ++var1_1 /* !! */ ;
                                                                        }
                                                                        var0.w += var6_8 /* !! */ ;
                                                                        var0.g -= var6_8 /* !! */ ;
                                                                        var0.r += var6_8 /* !! */ ;
                                                                    } else {
                                                                        while ((var1_1 /* !! */  = var0.w) < var0.L) {
                                                                            var3_5 /* !! */  = var0.r;
                                                                            var11_4 /* !! */ [var3_5 /* !! */ ] = var11_4 /* !! */ [var3_5 /* !! */  - var0.K & var2_3];
                                                                            --var0.g;
                                                                            var0.w = var1_1 /* !! */  + 1;
                                                                            var0.r = var3_5 /* !! */  + 1;
                                                                            if (var3_5 /* !! */  != var2_3) continue;
                                                                            var0.b = 7;
                                                                            var0.X = var0.P;
                                                                            var0.W = 0;
                                                                            var0.a = 12;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var0.a != 7) continue block11;
lbl289:
                                                                    // 2 sources

                                                                    var1_1 /* !! */  = 3;
                                                                    break block76;
                                                                }
                                                            }
                                                            throw new c("Invalid backward reference");
                                                        }
                                                        throw new c("Negative distance");
                                                        {
                                                            ** case 1:
                                                        }
lbl295:
                                                        // 1 sources

                                                        if (var0.g < 0) break block78;
                                                        var11_4 /* !! */  = (byte[])var0.c;
                                                        if (!var0.h) break block79;
                                                        var0.b = 10;
                                                        var0.X = var0.r;
                                                        var0.W = 0;
                                                        var0.a = 12;
                                                        break block80;
                                                    }
                                                    var13_12 /* !! */  = var0.k;
                                                    var13_12 /* !! */ .b = null;
                                                    var13_12 /* !! */ .c = null;
                                                    var13_12 /* !! */  = var0.l;
                                                    var13_12 /* !! */ .b = null;
                                                    var13_12 /* !! */ .c = null;
                                                    var13_12 /* !! */  = var0.m;
                                                    var13_12 /* !! */ .b = null;
                                                    var13_12 /* !! */ .c = null;
                                                    com.github.catvod.spider.merge.a1.a.i((a)var11_4 /* !! */ );
                                                    var8_10 = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 1) == 1;
                                                    var0.h = var8_10;
                                                    var0.g = 0;
                                                    var0.i = false;
                                                    var0.j = false;
                                                    if (var8_10 && com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 1) != 0) break block81;
                                                    var2_3 = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 2) + 4;
                                                    if (var2_3 != 7) break block82;
                                                    var0.j = true;
                                                    if (com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 1) != 0) break block83;
                                                    var2_3 = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 2);
                                                    if (var2_3 == 0) break block81;
                                                    for (var1_1 /* !! */  = 0; var1_1 /* !! */  < var2_3; ++var1_1 /* !! */ ) {
                                                        var4_6 /* !! */  = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 8);
                                                        if (var4_6 /* !! */  == 0 && var1_1 /* !! */  + 1 == var2_3 && var2_3 > 1) {
                                                            throw new c("Exuberant nibble");
                                                        }
                                                        var0.g = var4_6 /* !! */  << var1_1 /* !! */  * 8 | var0.g;
                                                    }
                                                    break block84;
                                                }
                                                throw new c("Corrupted reserved bit");
                                            }
                                            for (var1_1 /* !! */  = 0; var1_1 /* !! */  < var2_3; ++var1_1 /* !! */ ) {
                                                var4_6 /* !! */  = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 4);
                                                if (var4_6 /* !! */  == 0 && var1_1 /* !! */  + 1 == var2_3 && var2_3 > 4) {
                                                    throw new c("Exuberant nibble");
                                                }
                                                var0.g = var4_6 /* !! */  << var1_1 /* !! */  * 4 | var0.g;
                                            }
                                        }
                                        ++var0.g;
                                        if (!var0.h) {
                                            var8_10 = com.github.catvod.spider.merge.a1.a.h((a)var11_4 /* !! */ , 1) == 1;
                                            var0.i = var8_10;
                                        }
                                    }
                                    if (var0.g != 0 || var0.j) {
                                        if (!var0.i && !var0.j) {
                                            var0.a = 2;
                                        } else {
                                            com.github.catvod.spider.merge.a1.a.g((a)var11_4 /* !! */ );
                                            var1_1 /* !! */  = var3_5 /* !! */ ;
                                            if (var0.j) {
                                                var1_1 /* !! */  = 4;
                                            }
                                            var0.a = var1_1 /* !! */ ;
                                        }
                                        if (!var0.j) {
                                            var0.Q = var9_11 = var0.Q + (long)var0.g;
                                            var1_1 /* !! */  = var0.P;
                                            var2_3 = var0.O;
                                            if (var1_1 /* !! */  < var2_3) {
                                                var1_1 /* !! */  = var2_3;
                                                if ((long)var2_3 > var9_11) {
                                                    var4_6 /* !! */  = (int)var9_11;
                                                    var3_5 /* !! */  = var0.R.length;
                                                    while ((var1_1 /* !! */  = var2_3 >> 1) > var4_6 /* !! */  + var3_5 /* !! */ ) {
                                                        var2_3 = var1_1 /* !! */ ;
                                                    }
                                                    var1_1 /* !! */  = var2_3;
                                                    if (!var0.h) {
                                                        var1_1 /* !! */  = var2_3;
                                                        if (var2_3 < 16384) {
                                                            var1_1 /* !! */  = var2_3;
                                                            if (var0.O >= 16384) {
                                                                var1_1 /* !! */  = 16384;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var1_1 /* !! */  > (var2_3 = var0.P)) {
                                                    var11_4 /* !! */  = new byte[var1_1 /* !! */  + 37];
                                                    var13_12 /* !! */  = (m[])var0.d;
                                                    if (var13_12 /* !! */  != null) {
                                                        System.arraycopy(var13_12 /* !! */ , 0, var11_4 /* !! */ , 0, var2_3);
                                                    } else {
                                                        var13_12 /* !! */  = (m[])var0.R;
                                                        if (var13_12 /* !! */ .length != 0) {
                                                            var2_3 = var13_12 /* !! */ .length;
                                                            var3_5 /* !! */  = var0.N;
                                                            if (var2_3 > var3_5 /* !! */ ) {
                                                                var2_3 -= var3_5 /* !! */ ;
                                                            } else {
                                                                var3_5 /* !! */  = var2_3;
                                                                var2_3 = 0;
                                                            }
                                                            System.arraycopy(var13_12 /* !! */ , var2_3, var11_4 /* !! */ , 0, var3_5 /* !! */ );
                                                            var0.r = var3_5 /* !! */ ;
                                                            var0.S = var3_5 /* !! */ ;
                                                        }
                                                    }
                                                    var0.d = var11_4 /* !! */ ;
                                                    var0.P = var1_1 /* !! */ ;
                                                }
                                            }
                                        }
                                    }
                                }
                                var2_3 = var0.P - 1;
                                var11_4 /* !! */  = var0.d;
                                continue;
                            }
                            throw new c("Invalid metablock length");
                        }
                        var1_1 /* !! */  = var0.S;
                        if (var1_1 /* !! */  != 0) {
                            var0.W += var1_1 /* !! */ ;
                            var0.S = 0;
                        }
                        if ((var1_1 /* !! */  = Math.min(var0.U - var0.V, var0.X - var0.W)) != 0) {
                            System.arraycopy(var0.d, var0.W, var0.Y, var0.T + var0.V, var1_1 /* !! */ );
                            var0.V += var1_1 /* !! */ ;
                            var0.W += var1_1 /* !! */ ;
                        }
                        var1_1 /* !! */  = var3_5 /* !! */ ;
                        if (var0.V < var0.U) {
                            var1_1 /* !! */  = 1;
                        }
                        if (var1_1 /* !! */  == 0) {
                            return;
                        }
                        var1_1 /* !! */  = var0.r;
                        var3_5 /* !! */  = var0.N;
                        if (var1_1 /* !! */  >= var3_5 /* !! */ ) {
                            var0.s = var3_5 /* !! */ ;
                        }
                        var0.r = var1_1 /* !! */  & var2_3;
                        var1_1 /* !! */  = var0.b;
                    }
                    var0.a = var1_1 /* !! */ ;
                }
                if (var4_6 /* !! */  == 10) {
                    if (var0.g >= 0) {
                        com.github.catvod.spider.merge.a1.a.g(var12_2);
                        com.github.catvod.spider.merge.a1.a.a(var0.c, true);
                    } else {
                        throw new c("Invalid metablock length");
                    }
                }
                return;
            }
            throw new IllegalStateException("Can't decompress after close");
        }
        throw new IllegalStateException("Can't decompress until initialized");
    }

    private static int f(int[] nArray, int n2, a a2) {
        com.github.catvod.spider.merge.a1.a.d(a2);
        n2 = e.h(nArray, n2, a2);
        int n3 = k.b[n2];
        return k.a[n2] + com.github.catvod.spider.merge.a1.a.h(a2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void g(int n2, int[] nArray, int n3, a a2) {
        int n4;
        com.github.catvod.spider.merge.a1.a.i(a2);
        int[] nArray2 = new int[n2];
        int n5 = 1;
        int n6 = 1;
        int n7 = 0;
        if (n4 == 1) {
            int n8 = n2 - 1;
            int[] nArray3 = new int[4];
            int n9 = com.github.catvod.spider.merge.a1.a.h(a2, 2) + 1;
            n4 = 0;
            while (n8 != 0) {
                n8 >>= 1;
                ++n4;
            }
            for (n8 = 0; n8 < n9; ++n8) {
                nArray3[n8] = com.github.catvod.spider.merge.a1.a.h(a2, n4) % n2;
                nArray2[nArray3[n8]] = 2;
            }
            nArray2[nArray3[0]] = 1;
            n4 = n5;
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        n4 = nArray3[0] != nArray3[1] && nArray3[0] != nArray3[2] && nArray3[0] != nArray3[3] && nArray3[1] != nArray3[2] && nArray3[1] != nArray3[3] && nArray3[2] != nArray3[3] ? 1 : 0;
                        if (com.github.catvod.spider.merge.a1.a.h(a2, 1) == 1) {
                            nArray2[nArray3[2]] = 3;
                            nArray2[nArray3[3]] = 3;
                        } else {
                            nArray2[nArray3[0]] = 2;
                        }
                    } else {
                        n4 = nArray3[0] != nArray3[1] && nArray3[0] != nArray3[2] && nArray3[1] != nArray3[2] ? n5 : 0;
                    }
                } else {
                    n4 = n7;
                    if (nArray3[0] != nArray3[1]) {
                        n4 = 1;
                    }
                    nArray2[nArray3[1]] = 1;
                }
            }
        } else {
            int[] nArray4;
            int n10;
            int n11;
            long l2;
            int[] nArray5 = new int[18];
            n5 = 32;
            int n12 = 0;
            for (n4 = com.github.catvod.spider.merge.a1.a.h(a2, 2); n4 < 18 && n5 > 0; ++n4) {
                n7 = a[n4];
                com.github.catvod.spider.merge.a1.a.d(a2);
                l2 = a2.f;
                n11 = a2.g;
                n10 = (int)(l2 >>> n11) & 0xF;
                nArray4 = d;
                a2.g = n11 + (nArray4[n10] >> 16);
                nArray5[n7] = n11 = nArray4[n10] & 0xFFFF;
                n10 = n5;
                n7 = n12;
                if (n11 != 0) {
                    n10 = n5 - (32 >> n11);
                    n7 = n12 + 1;
                }
                n5 = n10;
                n12 = n7;
            }
            n4 = n6;
            if (n12 != 1) {
                n4 = n5 == 0 ? n6 : 0;
            }
            nArray4 = new int[32];
            h.a(nArray4, 0, 5, nArray5, 18);
            n12 = 8;
            n5 = 0;
            n10 = 32768;
            n11 = 0;
            block3: while (true) {
                n7 = 0;
                n6 = n5;
                while (n6 < n2 && n10 > 0) {
                    com.github.catvod.spider.merge.a1.a.i(a2);
                    com.github.catvod.spider.merge.a1.a.d(a2);
                    n5 = n10;
                    l2 = a2.f;
                    n10 = a2.g;
                    int n13 = (int)(l2 >>> n10) & 0x1F;
                    a2.g = n10 + (nArray4[n13] >> 16);
                    n10 = nArray4[n13] & 0xFFFF;
                    if (n10 < 16) {
                        nArray2[n6] = n10;
                        n7 = n12;
                        n12 = n5;
                        if (n10 != 0) {
                            n12 = n5 - (32768 >> n10);
                            n7 = n10;
                        }
                        n5 = n6 + 1;
                        n10 = n12;
                        n12 = n7;
                        continue block3;
                    }
                    int n14 = n10 - 14;
                    n10 = n10 == 16 ? n12 : 0;
                    n13 = n11;
                    if (n11 != n10) {
                        n7 = 0;
                        n13 = n10;
                    }
                    n10 = n7 > 0 ? n7 - 2 << n14 : n7;
                    n11 = n10 + (com.github.catvod.spider.merge.a1.a.h(a2, n14) + 3);
                    if (n6 + (n10 = n11 - n7) > n2) throw new c("symbol + repeatDelta > numSymbols");
                    n7 = 0;
                    while (n7 < n10) {
                        nArray2[n6] = n13;
                        ++n7;
                        ++n6;
                    }
                    n10 = n13 != 0 ? n5 - (n10 << 15 - n13) : n5;
                    n7 = n11;
                    n11 = n13;
                }
                break;
            }
            if (n10 != 0) throw new c("Unused space");
            n.b(nArray2, n6, n2 - n6);
        }
        if (n4 == 0) throw new c("Can't readHuffmanCode");
        h.a(nArray, n3, 8, nArray2, n2);
    }

    private static int h(int[] nArray, int n2, a a2) {
        long l2 = a2.f;
        int n3 = a2.g;
        int n4 = (int)(l2 >>> n3);
        int n5 = n2 + (n4 & 0xFF);
        int n6 = nArray[n5] >> 16;
        n2 = nArray[n5] & 0xFFFF;
        if (n6 <= 8) {
            a2.g = n3 + n6;
            return n2;
        }
        n2 = n5 + n2 + (((1 << n6) - 1 & n4) >>> 8);
        a2.g = (nArray[n2] >> 16) + 8 + n3;
        return nArray[n2] & 0xFFFF;
    }
}

