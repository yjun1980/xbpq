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
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class E
implements X,
v {
    public static E b = new E();
    private DecimalFormat a;

    public E() {
    }

    public E(String object) {
        object = new DecimalFormat((String)object);
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T> T c(b object, Type type, Object object2) {
        try {
            block8: {
                float f2;
                block7: {
                    com.github.catvod.spider.merge.B.d d2;
                    block6: {
                        d2 = ((b)object).f;
                        int n2 = d2.p();
                        type = null;
                        if (n2 != 2) break block6;
                        object = d2.J();
                        d2.o(16);
                        f2 = Float.parseFloat((String)object);
                        break block7;
                    }
                    if (d2.p() != 3) break block8;
                    f2 = d2.k();
                    d2.o(16);
                }
                object = Float.valueOf(f2);
                return (T)object;
            }
            if ((object = ((b)object).o(null)) == null) {
                object = type;
                return (T)object;
            }
            object = A.n(object);
            return (T)object;
        }
        catch (Exception exception) {
            throw new d(c.a("parseLong error, field : ", object2), exception);
        }
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).u(i0.j);
            return;
        }
        float f2 = ((Float)object2).floatValue();
        object2 = this.a;
        if (object2 != null) {
            ((h0)object).write(((NumberFormat)object2).format(f2));
        } else {
            ((h0)object).o(f2);
        }
    }

    @Override
    public final int e() {
        return 2;
    }
}

