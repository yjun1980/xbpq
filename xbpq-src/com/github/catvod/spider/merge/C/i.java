/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class i
implements v {
    private final Method a;
    private final Class b;

    public i(Method method) {
        this.a = method;
        this.b = method.getParameterTypes()[0];
    }

    @Override
    public final <T> T c(b object, Type type, Object object2) {
        object = ((b)object).t(this.b, null);
        try {
            object = this.a.invoke(null, object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new d("parse enum error", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new d("parse enum error", illegalAccessException);
        }
        return (T)object;
    }

    @Override
    public final int e() {
        return 0;
    }
}

