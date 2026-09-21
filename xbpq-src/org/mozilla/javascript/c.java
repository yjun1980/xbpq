/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Function;
import org.mozilla.javascript.EqualObjectGraphs;
import org.mozilla.javascript.Interpreter$CallFrame;

public final class c
implements Function {
    public final Interpreter$CallFrame a;
    public final Object b;

    public /* synthetic */ c(Interpreter$CallFrame interpreter$CallFrame, Object object) {
        this.a = interpreter$CallFrame;
        this.b = object;
    }

    public final Object apply(Object object) {
        return Interpreter$CallFrame.a(this.a, this.b, (EqualObjectGraphs)object);
    }
}

