/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.y.c;
import java.lang.reflect.Type;

public final class H
implements X {
    public static H a = new H();

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object = ((L)object).j;
        if (object2 == null) {
            ((h0)object).s();
            return;
        }
        ((h0)object).write(((c)object2).a());
    }
}

