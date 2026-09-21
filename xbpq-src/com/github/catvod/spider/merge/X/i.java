/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.X.b;
import com.github.catvod.spider.merge.X.h;
import com.github.catvod.spider.merge.cYh;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

@Deprecated
public final class i
extends b {
    private final EnumSet<h> b;

    public i(h ... object) {
        object = ((h[])object).length > 0 ? Arrays.asList(object) : Collections.singletonList(h.c);
        this.b = EnumSet.copyOf(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final int a(CharSequence var1_1, int var2_3, Writer var3_4) {
        block11: {
            block10: {
                var4_5 = var1_1.length();
                if (var1_1.charAt(var2_3) != '&' || var2_3 >= var4_5 - 2 || var1_1.charAt(var2_3 + 1) != '#') break block11;
                var5_6 = var1_1.charAt(var2_3 += 2);
                if (var5_6 != 'x' && var5_6 != 'X') {
                    var5_6 = '\u0000';
                } else {
                    if (++var2_3 == var4_5) {
                        return 0;
                    }
                    var5_6 = '\u0001';
                }
                for (var6_7 = var2_3; var6_7 < var4_5 && (var1_1.charAt(var6_7) >= '0' && var1_1.charAt(var6_7) <= '9' || var1_1.charAt(var6_7) >= 'a' && var1_1.charAt(var6_7) <= 'f' || var1_1.charAt(var6_7) >= 'A' && var1_1.charAt(var6_7) <= 'F'); ++var6_7) {
                }
                var7_8 = var6_7 != var4_5 && var1_1.charAt(var6_7) == ';' ? 1 : 0;
                if (var7_8 == 0) {
                    var9_9 = h.c;
                    var10_10 = this.b;
                    var4_5 = var10_10 != null && var10_10.contains((Object)var9_9) != false ? 1 : 0;
                    if (var4_5 != 0) {
                        return 0;
                    }
                    var9_9 = h.d;
                    var10_10 = this.b;
                    var4_5 = var10_10 != null && var10_10.contains((Object)var9_9) != false ? 1 : 0;
                    if (var4_5 != 0) {
                        throw new IllegalArgumentException(cYh.d("34352C387A39083C2E3F772802213438253F03702025773F0934613E317A09252C3425330470243F23331329"));
                    }
                }
                if (var5_6 == '\u0000') ** GOTO lbl28
                try {
                    block12: {
                        var4_5 = Integer.parseInt(var1_1.subSequence(var2_3, var6_7).toString(), 16);
                        break block12;
lbl28:
                        // 1 sources

                        var4_5 = Integer.parseInt(var1_1.subSequence(var2_3, var6_7).toString(), 10);
                    }
                    var8_11 /* !! */  = var4_5;
                    if (var4_5 <= 65535) break block10;
                }
                catch (NumberFormatException var1_2) {
                    ** continue;
                }
                var1_1 = Character.toChars(var4_5);
                var3_4.write((int)var1_1[0]);
                var8_11 /* !! */  = (int)var1_1[1];
            }
            var3_4.write(var8_11 /* !! */ );
            return var6_7 + 2 - var2_3 + var5_6 + var7_8;
        }
lbl39:
        // 2 sources

        return 0;
    }
}

