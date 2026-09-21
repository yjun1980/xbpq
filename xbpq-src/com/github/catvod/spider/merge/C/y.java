/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.C.x;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;

public final class y
implements v {
    public final Class<x> a;

    public y(Class<x> clazz) {
        this.a = clazz;
    }

    @Override
    public final <T> T c(b b2, Type object, Object object2) {
        try {
            object = this.a.newInstance();
        }
        catch (Exception exception) {
            throw new d("craete instance error");
        }
        return (T)b2.n((x)object, object2);
    }

    @Override
    public final int e() {
        return 12;
    }
}

