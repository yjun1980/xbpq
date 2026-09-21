/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.whl.quickjs.wrapper.JSCallFunction
 *  com.whl.quickjs.wrapper.QuickJSContext
 *  com.whl.quickjs.wrapper.QuickJSContext$Console
 */
package com.github.catvod.spider.merge.xc.Y;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSContext;

public final class a
implements JSCallFunction {
    public final QuickJSContext.Console a;

    public /* synthetic */ a(QuickJSContext.Console console) {
        this.a = console;
    }

    public final Object call(Object[] objectArray) {
        return QuickJSContext.a((QuickJSContext.Console)this.a, (Object[])objectArray);
    }
}

