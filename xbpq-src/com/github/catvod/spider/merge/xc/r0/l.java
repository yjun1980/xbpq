/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.r0.k;

public abstract class l
extends k {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer H(String object) {
        Object object2;
        int n2 = ((String)object).length();
        Object object3 = null;
        if (n2 == 0) {
            return object3;
        }
        int n3 = 0;
        int n4 = ((String)object).charAt(0);
        int n5 = 1;
        int n6 = n4 < 48 ? -1 : (n4 == 48 ? 0 : 1);
        int n7 = -2147483647;
        if (n6 < 0) {
            if (n2 == 1) {
                return object3;
            }
            if (n4 == 45) {
                n7 = Integer.MIN_VALUE;
                n6 = 1;
            } else {
                object2 = object3;
                if (n4 != 43) return object2;
                n6 = 0;
            }
        } else {
            n6 = 0;
            n5 = 0;
        }
        int n8 = -59652323;
        for (n4 = n5; n4 < n2; ++n4) {
            int n9 = Character.digit((int)((String)object).charAt(n4), 10);
            if (n9 < 0) {
                return object3;
            }
            n5 = n8;
            if (n3 < n8) {
                object2 = object3;
                if (n8 != -59652323) return object2;
                n5 = n8 = n7 / 10;
                if (n3 < n8) {
                    return object3;
                }
            }
            if ((n3 *= 10) < n7 + n9) {
                return object3;
            }
            n3 -= n9;
            n8 = n5;
        }
        if (n6 == 0) return -n3;
        object = n3;
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static Long I(String var0) {
        block10: {
            block15: {
                block12: {
                    block14: {
                        block13: {
                            block11: {
                                i.e(var0, "<this>");
                                var4_1 = var0.length();
                                var15_2 = null;
                                if (var4_1 != 0) break block11;
                                var14_3 = var15_2;
                                break block10;
                            }
                            var1_4 = 0;
                            var5_5 = var0.charAt(0);
                            var3_6 = 1;
                            var2_7 = var5_5 < '0' ? -1 : (var5_5 == '0' ? 0 : 1);
                            var6_8 = -9223372036854775807L;
                            if (var2_7 >= 0) break block12;
                            if (var4_1 != 1) break block13;
                            var14_3 = var15_2;
                            break block10;
                        }
                        if (var5_5 != '-') break block14;
                        var6_8 = -9223372036854775808L;
                        var1_4 = 1;
                        var2_7 = var3_6;
                        break block15;
                    }
                    var14_3 = var15_2;
                    if (var5_5 != '+') break block10;
                    var1_4 = 1;
                }
                var2_7 = 0;
            }
            var12_9 = 0L;
            var10_10 = -256204778801521550L;
            while (var1_4 < var4_1) {
                var3_6 = Character.digit((int)var0.charAt(var1_4), 10);
                if (var3_6 < 0) {
                    var14_3 = var15_2;
                    break block10;
                }
                var8_11 = var10_10;
                if (var12_9 < var10_10) {
                    var14_3 = var15_2;
                    if (var10_10 != -256204778801521550L) break block10;
                    var8_11 = var10_10 = var6_8 / (long)10;
                    if (var12_9 < var10_10) {
                        var14_3 = var15_2;
                        break block10;
                    }
                }
                if ((var12_9 *= (long)10) < var6_8 + (var10_10 = (long)var3_6)) {
                    var14_3 = var15_2;
                    break block10;
                }
                var12_9 -= var10_10;
                ++var1_4;
                var10_10 = var8_11;
            }
            if (var2_7 != 0) {
                var0 = var12_9;
lbl54:
                // 2 sources

                while (true) {
                    var14_3 = var0;
                    break;
                }
            } else {
                var0 = -var12_9;
                ** continue;
            }
        }
        return var14_3;
    }
}

