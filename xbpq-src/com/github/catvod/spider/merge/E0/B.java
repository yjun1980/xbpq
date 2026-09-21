/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.E0.H;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.g0;
import com.github.catvod.spider.merge.E0.h0;

final class B
implements h0 {
    private static final B a = new B();

    private B() {
    }

    public static B c() {
        return a;
    }

    @Override
    public final boolean a(Class<?> clazz) {
        return I.class.isAssignableFrom(clazz);
    }

    @Override
    public final g0 b(Class<?> clazz) {
        if (I.class.isAssignableFrom(clazz)) {
            try {
                g0 g02 = (g0)I.h(clazz.asSubclass(I.class)).f(H.c);
                return g02;
            }
            catch (Exception exception) {
                throw new RuntimeException(h.e(clazz, com.github.catvod.spider.merge.C.a.c("Unable to get message info for ")), exception);
            }
        }
        throw new IllegalArgumentException(h.e(clazz, com.github.catvod.spider.merge.C.a.c("Unsupported message type: ")));
    }
}

