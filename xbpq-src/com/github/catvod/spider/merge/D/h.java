/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.b;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class h
implements X,
v {
    public static final h a = new h();

    @Override
    public final <T> T c(com.github.catvod.spider.merge.B.b object, Type type, Object object2) {
        int n2;
        if (((com.github.catvod.spider.merge.B.b)object).f.p() == 8) {
            ((com.github.catvod.spider.merge.B.b)object).f.o(16);
            return null;
        }
        object2 = new b();
        ((com.github.catvod.spider.merge.B.b)object).q((Collection)object2, null);
        int n3 = 0;
        if (type == AtomicIntegerArray.class) {
            object = new AtomicIntegerArray(((b)object2).size());
            for (n2 = n3; n2 < ((b)object2).size(); ++n2) {
                ((AtomicIntegerArray)object).set(n2, A.o(((b)object2).get(n2)));
            }
            return (T)object;
        }
        object = new AtomicLongArray(((b)object2).size());
        for (n2 = 0; n2 < ((b)object2).size(); ++n2) {
            ((AtomicLongArray)object).set(n2, A.q(((b)object2).get(n2)));
        }
        return (T)object;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = ((L)object).j;
        if (object2 instanceof AtomicInteger) {
            ((h0)object3).q(((AtomicInteger)object2).get());
            return;
        }
        if (object2 instanceof AtomicLong) {
            ((h0)object3).r(((AtomicLong)object2).get());
            return;
        }
        if (object2 instanceof AtomicBoolean) {
            object = ((AtomicBoolean)object2).get() ? "true" : "false";
            ((h0)object3).b((CharSequence)object);
            return;
        }
        if (object2 == null) {
            ((h0)object3).u(i0.h);
            return;
        }
        boolean bl = object2 instanceof AtomicIntegerArray;
        int n3 = 0;
        if (bl) {
            object = (AtomicIntegerArray)object2;
            int n4 = ((AtomicIntegerArray)object).length();
            ((h0)object3).write(91);
            for (n2 = n3; n2 < n4; ++n2) {
                n3 = ((AtomicIntegerArray)object).get(n2);
                if (n2 != 0) {
                    ((h0)object3).write(44);
                }
                ((h0)object3).q(n3);
            }
            ((h0)object3).write(93);
            return;
        }
        object = (AtomicLongArray)object2;
        n3 = ((AtomicLongArray)object).length();
        ((h0)object3).write(91);
        for (n2 = 0; n2 < n3; ++n2) {
            long l2 = ((AtomicLongArray)object).get(n2);
            if (n2 != 0) {
                ((h0)object3).write(44);
            }
            ((h0)object3).r(l2);
        }
        ((h0)object3).write(93);
    }

    @Override
    public final int e() {
        return 14;
    }
}

