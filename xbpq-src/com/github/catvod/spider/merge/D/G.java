/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class G
implements X,
v {
    public static G a = new G();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T> T c(b var1_1, Type var2_2, Object var3_4) {
        var5_5 = var1_1.f;
        var4_6 = var5_5.p();
        if (var4_6 == 8) {
            var5_5.o(16);
            return null;
        }
        if (var4_6 != 2) ** GOTO lbl12
        try {
            block8: {
                var4_6 = var5_5.c();
                var5_5.o(16);
                var1_1 = var4_6;
                break block8;
lbl12:
                // 1 sources

                if (var4_6 == 3) {
                    var1_1 = A.Y(var5_5.s());
                    var5_5.o(16);
                } else if (var4_6 == 12) {
                    var5_5 = new e(true);
                    var1_1.u((Map)var5_5);
                    var1_1 = A.o(var5_5);
                } else {
                    var1_1 = A.o(var1_1.o(null));
                }
            }
            if (var2_2 != AtomicInteger.class) return (T)var1_1;
            return (T)new AtomicInteger(var1_1.intValue());
        }
        catch (Exception var2_3) {
            var1_1 = "parseInt error";
            if (var3_4 == null) throw new d((String)var1_1, var2_3);
            var1_1 = new StringBuilder();
            var1_1.append("parseInt error");
            var1_1.append(", field : ");
            var1_1.append(var3_4);
            var1_1 = var1_1.toString();
            throw new d((String)var1_1, var2_3);
        }
    }

    @Override
    public final void d(L object, Object clazz, Object object2, Type type, int n2) {
        block6: {
            block8: {
                block7: {
                    object = ((L)object).j;
                    object2 = (Number)((Object)clazz);
                    if (object2 == null) {
                        ((h0)object).u(i0.j);
                        return;
                    }
                    if (clazz instanceof Long) {
                        ((h0)object).r(((Number)object2).longValue());
                    } else {
                        ((h0)object).q(((Number)object2).intValue());
                    }
                    if (!((h0)object).g(i0.o)) break block6;
                    clazz = object2.getClass();
                    if (clazz != Byte.class) break block7;
                    n2 = 66;
                    break block8;
                }
                if (clazz != Short.class) break block6;
                n2 = 83;
            }
            ((h0)object).write(n2);
        }
    }

    @Override
    public final int e() {
        return 2;
    }
}

