/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.whl.quickjs.wrapper.JSCallFunction
 *  com.whl.quickjs.wrapper.QuickJSObject
 */
package com.github.catvod.spider.merge.xc.Y;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

public final class b
implements JSCallFunction {
    public final Method a;
    public final Object b;

    public /* synthetic */ b(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    public final Object call(Object[] objectArray) {
        return QuickJSObject.a((Method)this.a, (Object)this.b, (Object[])objectArray);
    }
}

