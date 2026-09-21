/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class f
implements Comparator<c> {
    private final String a;
    private final String b;

    public f(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static void a(String string, String string2, List<c> list) {
        Collections.sort(list, new f(string, string2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int compare(Object var1_1, Object var2_2) {
        block12: {
            block10: {
                block11: {
                    var1_1 = (c)var1_1;
                    var2_2 = (c)var2_2;
                    var5_3 = this.b.equals(cYh.d("062322"));
                    var10_4 = this.a;
                    var10_4.getClass();
                    var3_5 = var10_4.hashCode();
                    var4_6 = -1;
                    if (var3_5 == 3076014) break block10;
                    if (var3_5 == 3373707) break block11;
                    if (var3_5 != 3530753 || !var10_4.equals(cYh.d("14393B34"))) ** GOTO lbl-1000
                    var3_5 = 2;
                    break block12;
                }
                if (!var10_4.equals(cYh.d("09312C34"))) ** GOTO lbl-1000
                var3_5 = 1;
                break block12;
            }
            if (!var10_4.equals(cYh.d("03313534"))) lbl-1000:
            // 3 sources

            {
                var3_5 = -1;
            } else {
                var3_5 = 0;
            }
        }
        if (var3_5 != 0) {
            if (var3_5 != 1) {
                if (var3_5 != 2) {
                    var3_5 = var4_6;
                } else {
                    if (var5_3) {
                        var6_7 = var1_1.e();
                        var8_8 = var2_2.e();
                    } else {
                        var6_7 = var2_2.e();
                        var8_8 = var1_1.e();
                    }
                    var3_5 = var6_7 == var8_8 ? 0 : (var6_7 < var8_8 ? -1 : 1);
                }
            } else {
                var3_5 = var5_3 ? var1_1.c().compareTo(var2_2.c()) : var2_2.c().compareTo(var1_1.c());
            }
        } else {
            var3_5 = var5_3 ? var1_1.b().compareTo(var2_2.b()) : var2_2.b().compareTo(var1_1.b());
        }
        return var3_5;
    }
}

