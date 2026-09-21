/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i1;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.optimizer.OptRuntime;

public final class a
implements ContextAction {
    public final String[] a;
    public final Script b;

    public /* synthetic */ a(String[] stringArray, Script script) {
        this.a = stringArray;
        this.b = script;
    }

    public final Object run(Context context) {
        return OptRuntime.a(this.a, this.b, context);
    }
}

