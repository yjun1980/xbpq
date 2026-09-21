/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.InvocationTargetException;

public final class t {
    private static final Object a;
    public static final int b = 0;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        block15: {
            var2 = cYh.d("14252F7F3A3314336F1B362C061C203F301B0433242224");
            var1_1 = null;
            try {
                var0_2 = Class.forName(cYh.d("14252F7F3A3314336F023F3B15352502323915353522"), false, null).getMethod(cYh.d("0035351B362C061C203F301B0433242224"), new Class[0]).invoke(null, new Object[0]);
            }
            catch (Throwable var0_3) {
                var0_2 = null;
            }
lbl8:
            // 2 sources

            t.a = var0_2;
            if (var0_2 != null) {
                var0_2 = cYh.d("00353502233B043B1523363902152D343A3F0924");
                var3_10 = Integer.TYPE;
                try {
                    Class.forName(var2, false, null).getMethod((String)var0_2, new Class[]{Throwable.class, var3_10});
                }
                catch (Throwable var0_4) {
                    // empty catch block
                }
            }
lbl18:
            // 4 sources

            var3_10 = t.a;
            if (var3_10 == null) {
                return;
            }
            ** try [egrp 2[TRYBLOCK] [4, 5, 6 : 105->111)] { 
lbl22:
            // 1 sources

            break block15;
lbl23:
            // 3 sources

            catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException var0_9) {
                return;
            }
            catch (ThreadDeath var0_8) {
                throw var0_8;
            }
            ** GOTO lbl8
            catch (ThreadDeath var0_7) {
                throw var0_7;
            }
            ** GOTO lbl18
        }
        var0_2 = cYh.d("00353502233B043B15233639021424212332");
        try {
            var0_2 = Class.forName(var2, false, null).getMethod((String)var0_2, new Class[]{Throwable.class});
        }
        catch (Throwable var0_5) {
            var0_2 = var1_1;
        }
        {
            catch (ThreadDeath var0_6) {
                throw var0_6;
            }
            if (var0_2 == null) {
                return;
            }
            var1_1 = new Throwable();
            var0_2.invoke(var3_10, new Object[]{var1_1});
            return;
        }
    }
}

