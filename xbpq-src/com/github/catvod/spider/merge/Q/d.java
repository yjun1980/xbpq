/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.Q.b;

public final class d
extends m {
    public static final d a = new d();

    private d() {
    }

    @Override
    public final boolean E(Object object, Object object2) {
        object = (b)object;
        object2 = (b)object2;
        boolean bl = true;
        if (!(object == object2 || object != null && object2 != null && ((b)object).a.b == ((b)object2).a.b && ((b)object).b == ((b)object2).b && ((b)object).e.equals(((b)object2).e))) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final int F(Object object) {
        object = (b)object;
        int n2 = ((b)object).a.b;
        int n3 = ((b)object).b;
        return ((b)object).e.hashCode() + ((n2 + 217) * 31 + n3) * 31;
    }
}

