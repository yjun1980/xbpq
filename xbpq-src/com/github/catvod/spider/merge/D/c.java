/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

public final class c
implements X {
    public static final c a = new c();

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        block4: {
            block3: {
                block2: {
                    object = ((L)object).j;
                    if (!(object2 instanceof LongAdder)) break block2;
                    ((h0)object).l('{', "value", ((LongAdder)object2).longValue());
                    break block3;
                }
                if (!(object2 instanceof DoubleAdder)) break block4;
                double d2 = ((DoubleAdder)object2).doubleValue();
                ((h0)object).write(123);
                ((h0)object).j("value");
                ((h0)object).i(d2, false);
            }
            ((h0)object).write(125);
        }
    }
}

