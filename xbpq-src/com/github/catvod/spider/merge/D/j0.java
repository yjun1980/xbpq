/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.d;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.lang.reflect.Type;

public final class j0
implements X,
v {
    public static j0 a = new j0();

    public static <T> T f(b object) {
        block6: {
            d d2;
            block5: {
                block4: {
                    d2 = ((b)object).f;
                    if (d2.p() != 4) break block4;
                    object = d2.K();
                    break block5;
                }
                if (d2.p() != 2) break block6;
                object = d2.J();
            }
            d2.o(16);
            return (T)object;
        }
        if ((object = ((b)object).o(null)) == null) {
            return null;
        }
        return (T)object.toString();
    }

    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        if (object2 == StringBuffer.class) {
            object2 = ((b)object).f;
            if (object2.p() == 4) {
                object = object2.K();
                object2.o(16);
                return (T)new StringBuffer((String)object);
            }
            if ((object = ((b)object).o(null)) == null) {
                return null;
            }
            return (T)new StringBuffer(object.toString());
        }
        if (object2 == StringBuilder.class) {
            object2 = ((b)object).f;
            if (object2.p() == 4) {
                object = object2.K();
                object2.o(16);
                return (T)new StringBuilder((String)object);
            }
            if ((object = ((b)object).o(null)) == null) {
                return null;
            }
            return (T)new StringBuilder(object.toString());
        }
        return j0.f((b)object);
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object2 = (String)object2;
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).u(i0.i);
        } else {
            ((h0)object).v((String)object2);
        }
    }

    @Override
    public final int e() {
        return 4;
    }
}

