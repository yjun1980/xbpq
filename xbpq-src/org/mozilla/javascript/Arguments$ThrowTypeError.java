/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

class Arguments$ThrowTypeError
extends BaseFunction {
    private static final long serialVersionUID = -744615873947395749L;
    private String propertyName;

    Arguments$ThrowTypeError(String string) {
        this.propertyName = string;
        super.setInstanceIdAttributes(3, 7);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        throw ScriptRuntime.typeErrorById("msg.arguments.not.access.strict", this.propertyName);
    }
}

