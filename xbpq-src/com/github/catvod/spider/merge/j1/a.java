/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.j1;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.Timers;

public final class a
implements Callable {
    public final Timers a;

    public /* synthetic */ a(Timers timers) {
        this.a = timers;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return Timers.a(this.a, context, scriptable, scriptable2, objectArray);
    }
}

