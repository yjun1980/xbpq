/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.M.d;
import java.util.Comparator;
import java.util.Objects;

public final class g
implements Comparator<d> {
    private final String a;
    private final String b;

    public g(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int compare(Object var1_1, Object var2_2) {
        block12: {
            block10: {
                block11: {
                    var1_1 = (d)var1_1;
                    var10_3 = (d)var2_2;
                    var9_4 = this.b.equals("asc");
                    var2_2 = this.a;
                    Objects.requireNonNull(var2_2);
                    var3_5 = var2_2.hashCode();
                    var4_6 = -1;
                    if (var3_5 == 3076014) break block10;
                    if (var3_5 == 3373707) break block11;
                    if (var3_5 != 3530753 || !var2_2.equals("size")) ** GOTO lbl-1000
                    var3_5 = 2;
                    break block12;
                }
                if (!var2_2.equals("name")) ** GOTO lbl-1000
                var3_5 = 1;
                break block12;
            }
            if (!var2_2.equals("date")) lbl-1000:
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
                    if (var9_4) {
                        var7_7 = var1_1.e();
                        var5_8 = var10_3.e();
                    } else {
                        var7_7 = var10_3.e();
                        var5_8 = var1_1.e();
                    }
                    var3_5 = Long.compare(var7_7, var5_8);
                }
            } else {
                var3_5 = var9_4 ? var1_1.c().compareTo(var10_3.c()) : var10_3.c().compareTo(var1_1.c());
            }
        } else {
            var3_5 = var9_4 ? var1_1.b().compareTo(var10_3.b()) : var10_3.b().compareTo(var1_1.b());
        }
        return var3_5;
    }
}

