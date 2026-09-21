/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.H.A;
import java.lang.reflect.Type;

public final class t
implements X,
v {
    public static final t a = new t();

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        type = null;
        object = (object = ((b)object).o(null)) == null ? type : A.k(object);
        return (T)object;
    }

    @Override
    public final void d(L object, Object object2, Object object3, Type type, int n2) {
        object3 = ((L)object).j;
        object = (Character)object2;
        if (object == null) {
            ((h0)object3).v("");
            return;
        }
        object = ((Character)object).charValue() == '\u0000' ? "\u0000" : ((Character)object).toString();
        ((h0)object3).v((String)object);
    }

    @Override
    public final int e() {
        return 4;
    }
}

