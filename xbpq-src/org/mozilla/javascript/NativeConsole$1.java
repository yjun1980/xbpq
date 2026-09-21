/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

final class NativeConsole$1
implements Callable {
    final Object val$arg;

    NativeConsole$1(Object object) {
        this.val$arg = object;
    }

    @Override
    public Object call(Context object, Scriptable object2, Scriptable scriptable, Object[] objectArray) {
        object = objectArray[1];
        while (object instanceof Delegator) {
            object = ((Delegator)object).getDelegee();
        }
        if (object instanceof BaseFunction) {
            object2 = a.c("function ");
            ((StringBuilder)object2).append(((BaseFunction)object).getFunctionName());
            ((StringBuilder)object2).append("() {...}");
            return ((StringBuilder)object2).toString();
        }
        if (object instanceof Callable) {
            return ScriptRuntime.toString(object);
        }
        object2 = this.val$arg;
        if (object2 instanceof NativeError) {
            object = ((NativeError)object2).toString();
        }
        return object;
    }
}

