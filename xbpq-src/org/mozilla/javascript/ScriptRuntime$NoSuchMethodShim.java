/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

class ScriptRuntime$NoSuchMethodShim
implements Callable {
    String methodName;
    Callable noSuchMethodMethod;

    ScriptRuntime$NoSuchMethodShim(Callable callable, String string) {
        this.noSuchMethodMethod = callable;
        this.methodName = string;
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] object) {
        String string = this.methodName;
        object = ScriptRuntime.newArrayLiteral(object, null, context, scriptable);
        return this.noSuchMethodMethod.call(context, scriptable, scriptable2, new Object[]{string, object});
    }
}

