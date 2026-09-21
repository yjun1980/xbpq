/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.Q.b;

final class Z
extends m {
    public static final Z a = new Z();

    private Z() {
    }

    @Override
    public final boolean E(Object object, Object object2) {
        object = (b)object;
        object2 = (b)object2;
        boolean bl = true;
        if (!(object == object2 || object != null && object2 != null && ((b)object).a.b == ((b)object2).a.b && ((b)object).c.equals(((b)object2).c))) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final int F(Object object) {
        object = (b)object;
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.o(7, ((b)object).a.b), ((b)object).c), 2);
    }
}

