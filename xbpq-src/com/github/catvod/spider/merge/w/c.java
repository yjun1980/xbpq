/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.w.a;
import com.github.catvod.spider.merge.w.b;
import com.github.catvod.spider.merge.w.d;
import com.github.catvod.spider.merge.w.e;
import com.github.catvod.spider.merge.w.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public final class c {
    private static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(com.github.catvod.spider.merge.v.b b2, com.github.catvod.spider.merge.s.a a2, com.github.catvod.spider.merge.s.a a3, com.github.catvod.spider.merge.v.e e2) {
        int n2 = a2.f();
        int n3 = b2.b(e2);
        return a3.f() + (n3 + n2);
    }

    private static com.github.catvod.spider.merge.v.e b(int n2, int n3) {
        Object object;
        for (int i2 = 1; i2 <= 40; ++i2) {
            object = com.github.catvod.spider.merge.v.e.e(i2);
            if (!c.e(n2, (com.github.catvod.spider.merge.v.e)object, n3)) continue;
            return object;
        }
        object = new com.github.catvod.spider.merge.r.d(cYh.d("23313530772E083F61333E3D"));
        throw object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static f c(String var0, int var1_3, Map var2_4) {
        block68: {
            var19_5 = com.github.catvod.spider.merge.v.b.g;
            var17_6 = com.github.catvod.spider.merge.r.b.d;
            var16_8 = var2_4.containsKey(var17_6);
            var20_9 /* !! */  = cYh.d("2E030E7C6F6252696C60");
            var18_10 = var16_8 != false ? var2_4.get(var17_6).toString() : var20_9 /* !! */ ;
            var22_11 = cYh.d("3438283723052D1912");
            if (!var22_11.equals(var18_10)) ** GOTO lbl25
            try {
                var17_6 = var0.getBytes((String)var22_11);
            }
            catch (UnsupportedEncodingException var17_7) {
                ** continue;
            }
            var4_12 = ((com.github.catvod.spider.merge.r.b)var17_6).length;
            if (var4_12 % 2 != 0) break block68;
            for (var3_13 = 0; var3_13 < var4_12; var3_13 += 2) {
                var5_14 = var17_6[var3_13] & 255;
                if (var5_14 >= 129 && var5_14 <= 159 || var5_14 >= 224 && var5_14 <= 235) {
                    continue;
                }
                break block68;
            }
            var3_13 = 1;
            ** GOTO lbl22
        }
lbl20:
        // 2 sources

        while (true) {
            block76: {
                block71: {
                    block72: {
                        block73: {
                            block74: {
                                block70: {
                                    block69: {
                                        var3_13 = 0;
lbl22:
                                        // 2 sources

                                        if (var3_13 == 0) break block69;
                                        var17_6 = com.github.catvod.spider.merge.v.b.i;
                                        break block70;
                                    }
                                    var4_12 = 0;
                                    var5_14 = 0;
                                    for (var3_13 = 0; var3_13 < var0.length(); ++var3_13) {
                                        var6_15 = var0.charAt(var3_13);
                                        if (var6_15 >= 48 && var6_15 <= 57) {
                                            var5_14 = 1;
                                            continue;
                                        }
                                        if (c.d(var6_15) != -1) {
                                            var4_12 = 1;
                                            continue;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    if (var4_12 != 0) {
                                        var17_6 = com.github.catvod.spider.merge.v.b.f;
                                    } else if (var5_14 != 0) {
                                        var17_6 = com.github.catvod.spider.merge.v.b.e;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var17_6 = var19_5;
                                    }
                                }
                                var21_16 = new com.github.catvod.spider.merge.s.a();
                                if (var17_6 == var19_5 && !var20_9 /* !! */ .equals(var18_10) && (var20_9 /* !! */  = com.github.catvod.spider.merge.s.c.a((String)var18_10)) != null) {
                                    var21_16.c(com.github.catvod.spider.merge.v.b.h.a(), 4);
                                    var21_16.c(var20_9 /* !! */ .b(), 8);
                                }
                                var21_16.c(var17_6.a(), 4);
                                var20_9 /* !! */  = new com.github.catvod.spider.merge.s.a();
                                var3_13 = var17_6.ordinal();
                                if (var3_13 == 1) break block71;
                                if (var3_13 == 2) break block72;
                                if (var3_13 == 4) break block73;
                                if (var3_13 != 6) break block74;
                                try {
                                    var18_10 = var0.getBytes((String)var22_11);
                                }
                                catch (UnsupportedEncodingException var0_1) {
                                    throw new com.github.catvod.spider.merge.r.d(var0_1);
                                }
                                var5_14 = ((String)var18_10).length;
                                for (var3_13 = 0; var3_13 < var5_14; var3_13 += 2) {
                                    block75: {
                                        var6_15 = (var18_10[var3_13] & 255) << 8 | var18_10[var3_13 + 1] & 255;
                                        if (var6_15 < 33088 || var6_15 > 40956) break block75;
                                        var4_12 = 33088;
                                        ** GOTO lbl67
                                    }
                                    if (var6_15 >= 57408 && var6_15 <= 60351) {
                                        var4_12 = 49472;
lbl67:
                                        // 2 sources

                                        var4_12 = var6_15 - var4_12;
                                    } else {
                                        var4_12 = -1;
                                    }
                                    if (var4_12 != -1) {
                                        var20_9 /* !! */ .c((var4_12 >> 8) * 192 + (var4_12 & 255), 13);
                                        continue;
                                    }
                                    throw new com.github.catvod.spider.merge.r.d(cYh.d("2E3E37303B3303702328233F47232420223F093324"));
                                }
                                break block76;
                            }
                            var0 = new StringBuilder(cYh.d("2E3E37303B3303702C3E333F5D70"));
                            var0.append(var17_6);
                            throw new com.github.catvod.spider.merge.r.d(var0.toString());
                        }
                        try {
                            var18_10 = var0.getBytes((String)var18_10);
                        }
                        catch (UnsupportedEncodingException var0_2) {
                            throw new com.github.catvod.spider.merge.r.d(var0_2);
                        }
                        var4_12 = ((String)var18_10).length;
                        for (var3_13 = 0; var3_13 < var4_12; ++var3_13) {
                            var20_9 /* !! */ .c((int)var18_10[var3_13], 8);
                        }
                        break block76;
                    }
                    var5_14 = var0.length();
                    var3_13 = 0;
                    while (var3_13 < var5_14) {
                        var6_15 = c.d(var0.charAt(var3_13));
                        if (var6_15 != -1) {
                            var4_12 = var3_13 + 1;
                            if (var4_12 < var5_14) {
                                if ((var4_12 = c.d(var0.charAt(var4_12))) != -1) {
                                    var20_9 /* !! */ .c(var6_15 * 45 + var4_12, 11);
                                    var3_13 += 2;
                                    continue;
                                }
                                throw new com.github.catvod.spider.merge.r.d();
                            }
                            var20_9 /* !! */ .c(var6_15, 6);
                            var3_13 = var4_12;
                            continue;
                        }
                        throw new com.github.catvod.spider.merge.r.d();
                    }
                    break block76;
                }
                var5_14 = var0.length();
                var3_13 = 0;
                while (var3_13 < var5_14) {
                    var6_15 = var0.charAt(var3_13) - 48;
                    var4_12 = var3_13 + 2;
                    if (var4_12 < var5_14) {
                        var20_9 /* !! */ .c((var0.charAt(var3_13 + 1) - 48) * 10 + var6_15 * 100 + (var0.charAt(var4_12) - 48), 10);
                        var3_13 += 3;
                        continue;
                    }
                    if (++var3_13 < var5_14) {
                        var20_9 /* !! */ .c(var6_15 * 10 + (var0.charAt(var3_13) - 48), 7);
                        var3_13 = var4_12;
                        continue;
                    }
                    var20_9 /* !! */ .c(var6_15, 4);
                }
            }
            if (var2_4.containsKey(var18_10 = com.github.catvod.spider.merge.r.b.m)) {
                if (!c.e(c.a((com.github.catvod.spider.merge.v.b)var17_6, (com.github.catvod.spider.merge.s.a)var21_16, (com.github.catvod.spider.merge.s.a)var20_9 /* !! */ , (com.github.catvod.spider.merge.v.e)(var2_4 = com.github.catvod.spider.merge.v.e.e(Integer.parseInt(var2_4.get(var18_10).toString())))), (com.github.catvod.spider.merge.v.e)var2_4, var1_3)) {
                    throw new com.github.catvod.spider.merge.r.d(cYh.d("23313530772E083F61333E3D47362E23772802213434242E02346127322814392E3F"));
                }
            } else {
                var2_4 = c.b(c.a((com.github.catvod.spider.merge.v.b)var17_6, (com.github.catvod.spider.merge.s.a)var21_16, (com.github.catvod.spider.merge.s.a)var20_9 /* !! */ , c.b(c.a((com.github.catvod.spider.merge.v.b)var17_6, (com.github.catvod.spider.merge.s.a)var21_16, (com.github.catvod.spider.merge.s.a)var20_9 /* !! */ , com.github.catvod.spider.merge.v.e.e(1)), var1_3)), var1_3);
            }
            var18_10 = new com.github.catvod.spider.merge.s.a();
            var18_10.b((com.github.catvod.spider.merge.s.a)var21_16);
            var3_13 = var17_6 == var19_5 ? var20_9 /* !! */ .g() : var0.length();
            var5_14 = var17_6.b((com.github.catvod.spider.merge.v.e)var2_4);
            var4_12 = 1 << var5_14;
            if (var3_13 < var4_12) {
                var18_10.c(var3_13, var5_14);
                var18_10.b((com.github.catvod.spider.merge.s.a)var20_9 /* !! */ );
                var0 = var2_4.c(var1_3);
                var14_17 = var2_4.d() - var0.d();
                var5_14 = var14_17 << 3;
                if (var18_10.f() <= var5_14) {
                    for (var3_13 = 0; var3_13 < 4 && var18_10.f() < var5_14; ++var3_13) {
                        var18_10.a(false);
                    }
                    var3_13 = var18_10.f() & 7;
                    if (var3_13 > 0) {
                        while (var3_13 < 8) {
                            var18_10.a(false);
                            ++var3_13;
                        }
                    }
                    var6_15 = var18_10.g();
                    for (var3_13 = 0; var3_13 < var14_17 - var6_15; ++var3_13) {
                        var4_12 = (var3_13 & 1) == 0 ? 236 : 17;
                        var18_10.c(var4_12, 8);
                    }
                    if (var18_10.f() == var5_14) {
                        var3_13 = var2_4.d();
                        var4_12 = var0.c();
                        if (var18_10.g() == var14_17) {
                            var0 = new ArrayList<E>(var4_12);
                            var8_19 = 0;
                            var6_15 = 0;
                            var5_14 = 0;
                            for (var7_18 = 0; var7_18 < var4_12; ++var7_18) {
                                var19_5 = new int[1];
                                var21_16 = new int[1];
                                if (var7_18 < var4_12) {
                                    var13_24 = var3_13 % var4_12;
                                    var11_22 = var4_12 - var13_24;
                                    var15_25 /* !! */  = var3_13 / var4_12;
                                    var12_23 = var14_17 / var4_12;
                                    var10_21 /* !! */  = var15_25 /* !! */  - var12_23;
                                    var9_20 = var12_23 + 1;
                                    if (var10_21 /* !! */  == (var15_25 /* !! */  = var15_25 /* !! */  + 1 - var9_20)) {
                                        if (var4_12 == var11_22 + var13_24) {
                                            if (var3_13 == (var9_20 + var15_25 /* !! */ ) * var13_24 + (var12_23 + var10_21 /* !! */ ) * var11_22) {
                                                if (var7_18 < var11_22) {
                                                    var19_5[0] = var12_23;
                                                    var21_16[0] = var10_21 /* !! */ ;
                                                } else {
                                                    var19_5[0] = var9_20;
                                                    var21_16[0] = var15_25 /* !! */ ;
                                                }
                                                var15_25 /* !! */  = (int)var19_5[0];
                                                var20_9 /* !! */  = (String)new byte[var15_25 /* !! */ ];
                                                var10_21 /* !! */  = var8_19 << 3;
                                                for (var9_20 = 0; var9_20 < var15_25 /* !! */ ; ++var9_20) {
                                                    var13_24 = 0;
                                                    for (var11_22 = 0; var11_22 < 8; ++var11_22) {
                                                        var12_23 = var13_24;
                                                        if (var18_10.e(var10_21 /* !! */ )) {
                                                            var12_23 = var13_24 | 1 << 7 - var11_22;
                                                        }
                                                        ++var10_21 /* !! */ ;
                                                        var13_24 = var12_23;
                                                    }
                                                    var20_9 /* !! */ [var9_20 + 0] = (String)((byte)var13_24);
                                                }
                                                var10_21 /* !! */  = (int)var21_16[0];
                                                var22_11 = new int[var15_25 /* !! */  + var10_21 /* !! */ ];
                                                for (var9_20 = 0; var9_20 < var15_25 /* !! */ ; ++var9_20) {
                                                    var22_11[var9_20] = var20_9 /* !! */ [var9_20] & 255;
                                                }
                                                new com.github.catvod.spider.merge.t.c(com.github.catvod.spider.merge.t.a.k).a((int[])var22_11, var10_21 /* !! */ );
                                                var21_16 = new byte[var10_21 /* !! */ ];
                                                for (var9_20 = 0; var9_20 < var10_21 /* !! */ ; ++var9_20) {
                                                    var21_16[var9_20] = (byte)var22_11[var15_25 /* !! */  + var9_20];
                                                }
                                                var0.add(new a((byte[])var20_9 /* !! */ , (byte[])var21_16));
                                                var6_15 = Math.max(var6_15, var15_25 /* !! */ );
                                                var5_14 = Math.max(var5_14, var10_21 /* !! */ );
                                                var8_19 += var19_5[0];
                                                continue;
                                            }
                                            throw new com.github.catvod.spider.merge.r.d(cYh.d("333F35303B7A05293534247A0A39323C362E0438"));
                                        }
                                        throw new com.github.catvod.spider.merge.r.d(cYh.d("350361333B35043B32713A33143D20253432"));
                                    }
                                    throw new com.github.catvod.spider.merge.r.d(cYh.d("221361332E2E0223613C3E290A3135323F"));
                                }
                                throw new com.github.catvod.spider.merge.r.d(cYh.d("253C2E323C7A2E1461253835473C2023303F"));
                            }
                            if (var14_17 == var8_19) {
                                var18_10 = new com.github.catvod.spider.merge.s.a();
                                for (var4_12 = 0; var4_12 < var6_15; ++var4_12) {
                                    var19_5 = var0.iterator();
                                    while (var19_5.hasNext()) {
                                        var20_9 /* !! */  = (String)((a)var19_5.next()).a();
                                        if (var4_12 >= ((Object)var20_9 /* !! */ ).length) continue;
                                        var18_10.c((int)var20_9 /* !! */ [var4_12], 8);
                                    }
                                }
                                for (var4_12 = 0; var4_12 < var5_14; ++var4_12) {
                                    var20_9 /* !! */  = var0.iterator();
                                    while (var20_9 /* !! */ .hasNext()) {
                                        var19_5 = ((a)var20_9 /* !! */ .next()).b();
                                        if (var4_12 >= ((com.github.catvod.spider.merge.v.b)var19_5).length) continue;
                                        var18_10.c((int)var19_5[var4_12], 8);
                                    }
                                }
                                if (var3_13 == var18_10.g()) {
                                    var19_5 = new f();
                                    var19_5.b(var1_3);
                                    var19_5.e((com.github.catvod.spider.merge.v.b)var17_6);
                                    var19_5.f((com.github.catvod.spider.merge.v.e)var2_4);
                                    var3_13 = var2_4.b();
                                    var17_6 = new b(var3_13, var3_13);
                                    var5_14 = 0x7FFFFFFF;
                                    var6_15 = -1;
                                    for (var3_13 = 0; var3_13 < 8; ++var3_13) {
                                        e.a((com.github.catvod.spider.merge.s.a)var18_10, var1_3, (com.github.catvod.spider.merge.v.e)var2_4, var3_13, (b)var17_6);
                                        var12_23 = d.a((b)var17_6);
                                        var20_9 /* !! */  = (String)var17_6.c();
                                        var8_19 = var17_6.e();
                                        var13_24 = var17_6.d();
                                        var7_18 = 0;
                                        for (var4_12 = 0; var4_12 < var13_24 - 1; ++var4_12) {
                                            var10_21 /* !! */  = 0;
                                            while (var10_21 /* !! */  < var8_19 - 1) {
                                                var15_25 /* !! */  = (int)var20_9 /* !! */ [var4_12][var10_21 /* !! */ ];
                                                var0 = var20_9 /* !! */ [var4_12];
                                                var11_22 = var10_21 /* !! */  + 1;
                                                var9_20 = var7_18;
                                                if (var15_25 /* !! */  == var0[var11_22]) {
                                                    var14_17 = var4_12 + 1;
                                                    var9_20 = var7_18;
                                                    if (var15_25 /* !! */  == var20_9 /* !! */ [var14_17][var10_21 /* !! */ ]) {
                                                        var9_20 = var7_18;
                                                        if (var15_25 /* !! */  == var20_9 /* !! */ [var14_17][var11_22]) {
                                                            var9_20 = var7_18 + 1;
                                                        }
                                                    }
                                                }
                                                var10_21 /* !! */  = var11_22;
                                                var7_18 = var9_20;
                                            }
                                        }
                                        var13_24 = d.c((b)var17_6);
                                        var0 = var17_6.c();
                                        var9_20 = var17_6.e();
                                        var14_17 = var17_6.d();
                                        var4_12 = 0;
                                        for (var8_19 = 0; var8_19 < var14_17; ++var8_19) {
                                            var20_9 /* !! */  = var0[var8_19];
                                            for (var11_22 = 0; var11_22 < var9_20; ++var11_22) {
                                                var10_21 /* !! */  = var4_12;
                                                if (var20_9 /* !! */ [var11_22] == true) {
                                                    var10_21 /* !! */  = var4_12 + 1;
                                                }
                                                var4_12 = var10_21 /* !! */ ;
                                            }
                                        }
                                        var8_19 = var17_6.d();
                                        var8_19 = var17_6.e() * var8_19;
                                        var7_18 = Math.abs((var4_12 << 1) - var8_19) * 10 / var8_19 * 10 + (var7_18 * 3 + var12_23 + var13_24);
                                        var4_12 = var5_14;
                                        if (var7_18 < var5_14) {
                                            var4_12 = var7_18;
                                            var6_15 = var3_13;
                                        }
                                        var5_14 = var4_12;
                                    }
                                    var19_5.c(var6_15);
                                    e.a((com.github.catvod.spider.merge.s.a)var18_10, var1_3, (com.github.catvod.spider.merge.v.e)var2_4, var6_15, (b)var17_6);
                                    var19_5.d((b)var17_6);
                                    return var19_5;
                                }
                                var0 = new StringBuilder(cYh.d("2E3E3534253602313738393D4735332338285D70"));
                                var0.append(var3_13);
                                var0.append(cYh.d("47312F3577"));
                                var0.append(var18_10.g());
                                var0.append(cYh.d("47342837313F157E"));
                                throw new com.github.catvod.spider.merge.r.d(var0.toString());
                            }
                            throw new com.github.catvod.spider.merge.r.d(cYh.d("2331353077381E242422773E08353271393513702C3023390F702E3731290224"));
                        }
                        throw new com.github.catvod.spider.merge.r.d(cYh.d("29252C333228473F2771353313236130393E47342025367A05293534247A033F242277340824613C362E0438"));
                    }
                    throw new com.github.catvod.spider.merge.r.d(cYh.d("2539352277290E2A247133350223613F382E4735302436364733202136390E2438"));
                }
                var0 = new StringBuilder(cYh.d("0331353077380E243271343B093E2E25773C0E246138397A13382471060847132E3532"));
                var0.append(var18_10.f());
                var0.append(cYh.d("476E61"));
                var0.append(var5_14);
                throw new com.github.catvod.spider.merge.r.d(var0.toString());
            }
            var0 = new StringBuilder();
            var0.append(var3_13);
            var0.append(cYh.d("47393271353300372423772E0F312F71"));
            var0.append(var4_12 - 1);
            var0 = new com.github.catvod.spider.merge.r.d(var0.toString());
            throw var0;
        }
    }

    static int d(int n2) {
        int[] nArray = a;
        if (n2 < 96) {
            return nArray[n2];
        }
        return -1;
    }

    private static boolean e(int n2, com.github.catvod.spider.merge.v.e e2, int n3) {
        return e2.d() - e2.c(n3).d() >= (n2 + 7) / 8;
    }
}

