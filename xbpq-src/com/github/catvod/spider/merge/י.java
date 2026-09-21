/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b6;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

@Deprecated
public class \u05d9
extends \u02b6 {
    private final EnumSet<\u037f> \u0528;

    public \u05d9(\u037f ... \u03f3Array) {
        this.\u0528 = \u03f3Array.length > 0 ? EnumSet.copyOf(Arrays.asList(\u03f3Array)) : EnumSet.copyOf(Collections.singletonList(com.github.catvod.spider.merge.\u05d9$\u037f.\u037f));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int \u0528(CharSequence var1_1, int var2_3, Writer var3_4) {
        block11: {
            block13: {
                block10: {
                    var6_5 = var1_1.length();
                    if (var1_1.charAt(var2_3) != '&' || var2_3 >= var6_5 - 2 || var1_1.charAt(var2_3 + 1) != '#') break block11;
                    var4_6 = var1_1.charAt(var2_3 += 2);
                    if (var4_6 != 'x' && var4_6 != 'X') {
                        var4_6 = '\u0000';
                    } else {
                        if (++var2_3 == var6_5) {
                            return 0;
                        }
                        var4_6 = '\u0001';
                    }
                    for (var5_7 = var2_3; var5_7 < var6_5 && (var1_1.charAt(var5_7) >= '0' && var1_1.charAt(var5_7) <= '9' || var1_1.charAt(var5_7) >= 'a' && var1_1.charAt(var5_7) <= 'f' || var1_1.charAt(var5_7) >= 'A' && var1_1.charAt(var5_7) <= 'F'); ++var5_7) {
                    }
                    if ((var6_5 = var5_7 != var6_5 && var1_1.charAt(var5_7) == ';' ? 1 : 0) == 0) {
                        if (this.\u052c(com.github.catvod.spider.merge.\u05d9$\u037f.\u037f)) {
                            return 0;
                        }
                        if (this.\u052c(com.github.catvod.spider.merge.\u05d9$\u037f.\u0529)) {
                            throw new IllegalArgumentException(SOY.d("29373C1F5914153E3E1854051F23241F06121E723002541214367119125714273C13061E19723418001E0E2B"));
                        }
                    }
                    if (var4_6 == '\u0000') ** GOTO lbl21
                    try {
                        block12: {
                            var7_8 = Integer.parseInt(var1_1.subSequence(var2_3, var5_7).toString(), 16);
                            break block12;
lbl21:
                            // 1 sources

                            var7_8 = Integer.parseInt(var1_1.subSequence(var2_3, var5_7).toString(), 10);
                        }
                        if (var7_8 <= 65535) break block10;
                    }
                    catch (NumberFormatException var1_2) {
                        ** continue;
                    }
                    var1_1 = Character.toChars(var7_8);
                    var3_4.write((int)var1_1[0]);
                    var3_4.write((int)var1_1[1]);
                    break block13;
                }
                var3_4.write(var7_8);
            }
            return var5_7 + 2 - var2_3 + var4_6 + var6_5;
        }
lbl33:
        // 2 sources

        return 0;
    }

    public boolean \u052c(\u037f \u03f3) {
        EnumSet<\u037f> enumSet = this.\u0528;
        boolean bl = enumSet != null && enumSet.contains((Object)\u03f3);
        return bl;
    }

    public static final class \u037f
    extends Enum<\u037f> {
        public static final /* enum */ \u037f \u037f;
        public static final /* enum */ \u037f \u0528;
        public static final /* enum */ \u037f \u0529;
        private static final \u037f[] \u052a;

        static {
            \u037f \u03f3;
            \u037f \u03f32;
            \u037f \u03f33;
            \u037f = \u03f33 = new \u037f();
            \u0528 = \u03f32 = new \u037f();
            \u0529 = \u03f3 = new \u037f();
            \u052a = new \u037f[]{\u03f33, \u03f32, \u03f3};
        }
    }
}

