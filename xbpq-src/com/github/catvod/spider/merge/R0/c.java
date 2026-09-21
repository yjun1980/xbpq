/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R0;

import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.T0.b;
import java.io.Writer;
import java.lang.reflect.Array;

final class c
extends b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = new char[]{',', '\"', '\r', '\n'};

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final int a(CharSequence var1_1, int var2_2, Writer var3_3) {
        block10: {
            block9: {
                if (var2_2 != 0) break block10;
                if (var1_1.charAt(0) != '\"') ** GOTO lbl-1000
                var2_2 = var1_1.length();
                var7_4 = true;
                if (var1_1.charAt(var2_2 - 1) != '\"') ** GOTO lbl-1000
                var10_5 = var1_1.subSequence(1, var1_1.length() - 1).toString();
                var11_6 /* !! */  = com.github.catvod.spider.merge.R0.c.c;
                if (!e.c(var10_5)) {
                    var2_2 = var11_6 /* !! */  == null ? 0 : Array.getLength(var11_6 /* !! */ );
                    if ((var2_2 = var2_2 == 0 ? 1 : 0) == 0) {
                        var9_7 = var10_5.length();
                        var8_8 = var11_6 /* !! */ .length;
                        for (var2_2 = 0; var2_2 < var9_7; ++var2_2) {
                            var4_9 = var10_5.charAt(var2_2);
                            for (var5_10 = 0; var5_10 < var8_8; ++var5_10) {
                                if (var11_6 /* !! */ [var5_10] != var4_9) continue;
                                var6_11 = var7_4;
                                if (Character.isHighSurrogate(var4_9)) {
                                    if (var5_10 == var8_8 - 1) {
                                        var6_11 = var7_4;
                                    } else {
                                        if (var2_2 >= var9_7 - 1 || var11_6 /* !! */ [var5_10 + 1] != var10_5.charAt(var2_2 + 1)) continue;
                                        var6_11 = var7_4;
                                    }
                                }
                                break block9;
                            }
                        }
                    }
                }
                var6_11 = false;
            }
            if (var6_11) {
                var12_12 = new StringBuilder();
                var11_6 /* !! */  = (char[])com.github.catvod.spider.merge.R0.c.b;
                var12_12.append((String)var11_6 /* !! */ );
                var12_12.append((String)var11_6 /* !! */ );
                var10_5 = e.g(var10_5, var12_12.toString(), (String)var11_6 /* !! */ );
            } else lbl-1000:
            // 3 sources

            {
                var10_5 = var1_1.toString();
            }
            var3_3.write(var10_5);
            return Character.codePointCount(var1_1, 0, var1_1.length());
        }
        throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
    }
}

