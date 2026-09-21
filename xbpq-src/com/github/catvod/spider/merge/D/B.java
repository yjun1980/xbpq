/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

public final class B
implements X {
    public static B a = new B();

    /*
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
        Enumeration enumeration = null;
        boolean bl = h02.g(i0.o);
        n2 = 0;
        Object object4 = enumeration;
        if (bl) {
            object4 = enumeration;
            if (object3 instanceof ParameterizedType) {
                object4 = ((ParameterizedType)object3).getActualTypeArguments()[0];
            }
        }
        enumeration = (Enumeration)object;
        object3 = l2.p;
        l2.s((c0)object3, object, object2);
        try {
            h02.write(91);
            while (enumeration.hasMoreElements()) {
                object = enumeration.nextElement();
                int n3 = n2 + 1;
                if (n2 != 0) {
                    h02.write(44);
                }
                if (object == null) {
                    h02.s();
                } else {
                    l2.n(object.getClass()).d(l2, object, n3 - 1, (Type)object4, 0);
                }
                n2 = n3;
            }
            h02.write(93);
            return;
        }
        finally {
            l2.p = object3;
        }
    }
}

