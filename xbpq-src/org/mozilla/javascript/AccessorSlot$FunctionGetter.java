/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AccessorSlot$Getter;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

final class AccessorSlot$FunctionGetter
implements AccessorSlot$Getter {
    final Object target;

    AccessorSlot$FunctionGetter(Object object) {
        this.target = object;
    }

    @Override
    public Function asGetterFunction(String object, Scriptable scriptable) {
        object = this.target;
        object = object instanceof Function ? (Function)object : null;
        return object;
    }

    @Override
    public Object getValue(Scriptable scriptable) {
        Object object = this.target;
        if (object instanceof Function) {
            object = (Function)object;
            return object.call(Context.getContext(), object.getParentScope(), scriptable, ScriptRuntime.emptyArgs);
        }
        return Undefined.instance;
    }
}

