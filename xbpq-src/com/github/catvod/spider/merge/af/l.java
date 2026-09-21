/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.whl.quickjs.android.QuickJSLoader
 *  com.whl.quickjs.android.QuickJSLoader$Console
 *  com.whl.quickjs.wrapper.JSCallFunction
 */
package com.github.catvod.spider.merge.af;

import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.JSCallFunction;

public final class l
implements JSCallFunction {
    public final QuickJSLoader.Console a;

    public /* synthetic */ l(QuickJSLoader.Console console) {
        this.a = console;
    }

    public final Object call(Object[] objectArray) {
        return QuickJSLoader.a((QuickJSLoader.Console)this.a, (Object[])objectArray);
    }
}

