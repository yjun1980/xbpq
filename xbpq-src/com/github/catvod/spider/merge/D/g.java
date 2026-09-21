/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.lang.reflect.Type;

public final class g
implements X {
    private final Class<?> a;
    private final X b;

    public g(Class<?> clazz, X x2) {
        this.a = clazz;
        this.b = x2;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(L l2, Object object, Object object2, Type object3, int n2) {
        h0 h02 = l2.j;
        if (object == null) {
            h02.u(i0.h);
            return;
        }
        Object[] objectArray = (Object[])object;
        int n3 = objectArray.length;
        object3 = l2.p;
        l2.s((c0)object3, object, object2);
        h02.write(91);
        for (n2 = 0; n2 < n3; ++n2) {
            Object object4;
            if (n2 != 0) {
                h02.write(44);
            }
            if ((object4 = objectArray[n2]) == null) {
                if (h02.g(i0.i) && object instanceof String[]) {
                    h02.v("");
                    continue;
                }
                h02.b("null");
                continue;
            }
            object2 = object4.getClass() == this.a ? this.b : l2.n(object4.getClass());
            object2.d(l2, object4, n2, null, 0);
        }
        h02.write(93);
        return;
    }
}

