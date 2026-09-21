/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Interpreter$CallFrame;
import org.mozilla.javascript.Scriptable;

public final class d
implements Callable {
    public final Interpreter$CallFrame a;
    public final Object b;

    public /* synthetic */ d(Interpreter$CallFrame interpreter$CallFrame, Object object) {
        this.a = interpreter$CallFrame;
        this.b = object;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return Interpreter$CallFrame.b(this.a, this.b, context, scriptable, scriptable2, objectArray);
    }
}

