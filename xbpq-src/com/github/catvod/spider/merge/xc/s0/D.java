/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.xc.t0.B;
import java.util.concurrent.atomic.AtomicLong;

public abstract class D {
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block12: {
                block9: {
                    block10: {
                        block8: {
                            var0 = B.a;
                            var4_1 = null;
                            try {
                                var3_2 = System.getProperty("kotlinx.coroutines.debug");
                            }
                            catch (SecurityException var3_3) {
                                var3_2 = null;
                            }
                            var2_5 = true;
                            if (var3_2 == null) break block8;
                            var0 = var3_2.hashCode();
                            if (var0 == 0) break block9;
                            if (var0 == 3551) break block10;
                            if (!(var0 != 109935 ? var0 == 3005871 && var3_2.equals("auto") != false : var3_2.equals("off") != false)) ** GOTO lbl-1000
                        }
                        var1_6 = false;
                        break block11;
                    }
                    if (!var3_2.equals("on")) ** GOTO lbl-1000
                    break block12;
                }
                if (!var3_2.equals("")) lbl-1000:
                // 3 sources

                {
                    var4_1 = new StringBuilder("System property 'kotlinx.coroutines.debug' has unrecognized value '");
                    var4_1.append((String)var3_2);
                    var4_1.append('\'');
                    throw new IllegalStateException(var4_1.toString().toString());
                }
            }
            var1_6 = true;
        }
        D.a = var1_6;
        if (!var1_6) ** GOTO lbl-1000
        var0 = B.a;
        try {
            var3_2 = System.getProperty("kotlinx.coroutines.stacktrace.recovery");
        }
        catch (SecurityException var3_4) {
            var3_2 = var4_1;
        }
        var1_6 = var3_2 != null ? Boolean.parseBoolean((String)var3_2) : true;
        if (var1_6) {
            var1_6 = var2_5;
        } else lbl-1000:
        // 2 sources

        {
            var1_6 = false;
        }
        D.b = var1_6;
        D.c = new AtomicLong(0L);
    }
}

