/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import java.lang.reflect.Type;

public abstract class g
implements v {
    @Override
    public <T> T c(b b2, Type type, Object object) {
        return this.f(b2, type, object, null, 0);
    }

    public abstract <T> T f(b var1, Type var2, Object var3, String var4, int var5);
}

