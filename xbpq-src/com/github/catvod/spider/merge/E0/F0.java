/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.D0;
import com.github.catvod.spider.merge.E0.E0;
import com.github.catvod.spider.merge.E0.I;

final class F0
extends D0<E0, E0> {
    F0() {
    }

    @Override
    final void a(Object object, int n2, long l2) {
        ((E0)object).h(n2 << 3 | 0, l2);
    }

    @Override
    final Object b(Object object) {
        I i2 = (I)object;
        E0 e02 = i2.c;
        object = e02;
        if (e02 == E0.b()) {
            i2.c = object = E0.f();
        }
        return object;
    }

    @Override
    final Object c(Object object) {
        return ((I)object).c;
    }

    @Override
    final void d(Object object) {
        ((I)object).c.c();
    }

    @Override
    final Object e(Object object, Object object2) {
        object = (E0)object;
        object2 = (E0)object2;
        if (!E0.b().equals(object2)) {
            if (E0.b().equals(object)) {
                object = E0.e((E0)object, (E0)object2);
            } else {
                ((E0)object).d((E0)object2);
            }
        }
        return object;
    }

    @Override
    final void f(Object object, Object object2) {
        ((I)object).c = object2 = (E0)object2;
    }
}

