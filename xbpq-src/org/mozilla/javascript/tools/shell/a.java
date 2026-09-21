/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.Timers;
import org.mozilla.javascript.tools.shell.Timers$Timeout;

public final class a
implements Runnable {
    public final Timers$Timeout a;
    public final Context b;
    public final Scriptable c;

    public /* synthetic */ a(Timers$Timeout timers$Timeout, Context context, Scriptable scriptable) {
        this.a = timers$Timeout;
        this.b = context;
        this.c = scriptable;
    }

    @Override
    public final void run() {
        Timers.b(this.a, this.b, this.c);
    }
}

