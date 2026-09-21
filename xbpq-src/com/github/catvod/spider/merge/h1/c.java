/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Script;

public final class c
implements ContextAction {
    public final Script a;

    public /* synthetic */ c(Script script) {
        this.a = script;
    }

    public final Object run(Context context) {
        return JavaAdapter.b(this.a, context);
    }
}

