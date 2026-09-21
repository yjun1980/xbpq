/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.j;
import com.github.catvod.spider.merge.mI.l;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.e0.i;

public final class t
extends j
implements p {
    public static final t b = new t(0);
    public static final t c = new t(1);
    public final int a;

    public /* synthetic */ t(int n2) {
        this.a = n2;
        super(2);
    }

    public t(l l2) {
        this.a = 2;
        super(2);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        switch (this.a) {
            default: {
                return ((i)object).f((g)object2);
            }
            case 1: {
                object = (Boolean)object;
                ((Boolean)object).booleanValue();
                object2 = (g)object2;
                return object;
            }
            case 0: 
        }
        return ((i)object).f((g)object2);
    }
}

