/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.L0;
import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.U;

final class V
implements U {
    V() {
    }

    static <E> M<E> c(Object object, long l2) {
        return (M)L0.r(object, l2);
    }

    @Override
    public final <E> void a(Object object, Object m2, long l2) {
        M<E> m3 = V.c(object, l2);
        M<E> m4 = V.c(m2, l2);
        int n2 = m3.size();
        int n3 = m4.size();
        m2 = m3;
        if (n2 > 0) {
            m2 = m3;
            if (n3 > 0) {
                m2 = m3;
                if (!m3.h()) {
                    m2 = m3.e(n3 + n2);
                }
                m2.addAll(m4);
            }
        }
        m3 = m4;
        if (n2 > 0) {
            m3 = m2;
        }
        L0.C(object, l2, m3);
    }

    @Override
    public final void b(Object object, long l2) {
        V.c(object, l2).b();
    }
}

