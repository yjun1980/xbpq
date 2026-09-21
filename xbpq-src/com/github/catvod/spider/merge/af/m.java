/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.whl.quickjs.wrapper.JSCallFunction
 *  com.whl.quickjs.wrapper.JSObject
 */
package com.github.catvod.spider.merge.af;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.JSObject;
import java.lang.reflect.Method;

public final class m
implements JSCallFunction {
    public final Method a;
    public final Object b;

    public /* synthetic */ m(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    public final Object call(Object[] objectArray) {
        return JSObject.a((Method)this.a, (Object)this.b, (Object[])objectArray);
    }
}

