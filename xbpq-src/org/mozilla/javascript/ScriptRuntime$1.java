/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

final class ScriptRuntime$1
extends BaseFunction {
    private static final long serialVersionUID = -5891740962154902286L;

    ScriptRuntime$1() {
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        throw ScriptRuntime.typeErrorById("msg.op.not.allowed", new Object[0]);
    }

    @Override
    public int getLength() {
        return 0;
    }
}

