/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class z
implements X {
    public static final z b = new z();
    private DecimalFormat a;

    public z() {
        this.a = null;
    }

    public z(String object) {
        object = new DecimalFormat((String)object);
        this.a = object;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).u(i0.j);
            return;
        }
        double d2 = (Double)object2;
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            object2 = this.a;
            if (object2 == null) {
                ((h0)object).i(d2, true);
            } else {
                ((h0)object).write(((NumberFormat)object2).format(d2));
            }
        } else {
            ((h0)object).s();
        }
    }
}

