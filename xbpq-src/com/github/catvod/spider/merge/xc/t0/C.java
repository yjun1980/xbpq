/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.mI.j;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.s0.z;
import com.github.catvod.spider.merge.xc.t0.E;

public final class C
extends j
implements p {
    public static final C b = new C(0);
    public static final C c = new C(1);
    public static final C d = new C(2);
    public final int a;

    public /* synthetic */ C(int n2) {
        this.a = n2;
        super(2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        switch (this.a) {
            default: {
                object = (E)object;
                object2 = (g)object2;
                if (object2 instanceof z) {
                    z z2 = (z)object2;
                    object2 = z2.d(((E)object).a);
                    int n2 = ((E)object).d;
                    ((E)object).b[n2] = object2;
                    ((E)object).d = n2 + 1;
                    i.c(z2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                    ((E)object).c[n2] = z2;
                }
                return object;
            }
            case 1: {
                object = (z)object;
                object2 = (g)object2;
                if (object == null) {
                    object = object2 instanceof z ? (z)object2 : null;
                }
                return object;
            }
            case 0: 
        }
        g g2 = (g)object2;
        object2 = object;
        if (g2 instanceof z) {
            object = object instanceof Integer ? (Integer)object : null;
            int n3 = object != null ? (Integer)object : 1;
            object2 = n3 == 0 ? g2 : Integer.valueOf(n3 + 1);
        }
        return object2;
    }
}

