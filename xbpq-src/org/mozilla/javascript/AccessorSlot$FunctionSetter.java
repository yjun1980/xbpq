/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AccessorSlot$Setter;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

final class AccessorSlot$FunctionSetter
implements AccessorSlot$Setter {
    final Object target;

    AccessorSlot$FunctionSetter(Object object) {
        this.target = object;
    }

    @Override
    public Function asSetterFunction(String object, Scriptable scriptable) {
        object = this.target;
        object = object instanceof Function ? (Function)object : null;
        return object;
    }

    @Override
    public boolean setValue(Object object, Scriptable object2, Scriptable scriptable) {
        object2 = this.target;
        if (object2 instanceof Function) {
            object2 = (Function)object2;
            object2.call(Context.getContext(), object2.getParentScope(), scriptable, new Object[]{object});
        }
        return true;
    }
}

