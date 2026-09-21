/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import java.io.IOException;

public final class h {
    private final String a = cYh.d("4B70");

    private h() {
    }

    public static h b() {
        return new h();
    }

    /*
     * Unable to fully structure code
     */
    public final StringBuilder a(StringBuilder var1_1, Iterable<? extends Object> var2_4) {
        block8: {
            var2_4 = var2_4.iterator();
            var3_5 = var1_1;
            try {
                block9: {
                    if (!var2_4.hasNext()) break block8;
                    var3_5 = var2_4.next();
                    var3_5.getClass();
                    if (!(var3_5 instanceof CharSequence)) break block9;
                    var4_6 = var1_1;
                    ** GOTO lbl39
                }
                var7_7 = var3_5;
                var5_8 = var2_4;
                var4_6 = var1_1;
            }
            catch (IOException var1_2) {
                var1_3 = new AssertionError((Object)var1_2);
                throw var1_3;
            }
            block6: while (true) {
                var6_9 = var7_7.toString();
                var2_4 = var4_6;
                var3_5 = var5_8;
                while (true) {
                    var1_1.append((CharSequence)var6_9);
                    if (!var3_5.hasNext()) break block6;
                    var1_1.append((CharSequence)this.a);
                    var6_9 = var3_5.next();
                    var6_9.getClass();
                    var5_8 = var3_5;
                    var7_7 = var6_9;
                    var4_6 = var2_4;
                    if (!(var6_9 instanceof CharSequence)) continue block6;
                    var4_6 = var2_4;
                    var2_4 = var3_5;
                    var3_5 = var6_9;
lbl39:
                    // 3 sources

                    var5_8 = (CharSequence)var3_5;
                    var3_5 = var2_4;
                    var6_9 = var5_8;
                    var2_4 = var4_6;
                    continue;
                    break;
                }
                break;
            }
            var3_5 = var2_4;
        }
        return var3_5;
    }
}

