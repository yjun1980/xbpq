/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public final class o
implements X,
v {
    public static final o a = new o();

    /*
     * Unable to fully structure code
     */
    @Override
    public final <T> T c(b var1_1, Type var2_3, Object var3_4) {
        block7: {
            block8: {
                block6: {
                    var5_5 = var1_1.f;
                    try {
                        block9: {
                            if (var5_5.p() == 6) {
                                var5_5.o(16);
                                break block6;
                            }
                            if (var5_5.p() != 7) break block9;
                            var5_5.o(16);
                            ** GOTO lbl20
                        }
                        if (var5_5.p() != 2) ** GOTO lbl22
                        var4_6 = var5_5.c();
                        var5_5.o(16);
                        if (var4_6 != 1) ** GOTO lbl20
                    }
                    catch (Exception var1_2) {
                        throw new d(c.a("parseBoolean error, field : ", var3_4), var1_2);
                    }
                }
                var1_1 = Boolean.TRUE;
                break block7;
lbl20:
                // 2 sources

                var1_1 = Boolean.FALSE;
                break block7;
lbl22:
                // 1 sources

                if ((var1_1 = var1_1.o(null)) != null) break block8;
                return null;
            }
            var1_1 = A.i(var1_1);
        }
        if (var2_3 == AtomicBoolean.class) {
            return (T)new AtomicBoolean(var1_1.booleanValue());
        }
        return (T)var1_1;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = ((L)object).j;
        object = (Boolean)object2;
        if (object == null) {
            ((h0)object3).u(i0.k);
            return;
        }
        object = ((Boolean)object).booleanValue() ? "true" : "false";
        ((h0)object3).write((String)object);
    }

    @Override
    public final int e() {
        return 6;
    }
}

