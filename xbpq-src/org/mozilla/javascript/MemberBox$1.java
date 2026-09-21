/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

class MemberBox$1
extends BaseFunction {
    final MemberBox this$0;
    final String val$name;

    MemberBox$1(MemberBox memberBox, Scriptable scriptable, Scriptable scriptable2, String string) {
        this.this$0 = memberBox;
        this.val$name = string;
        super(scriptable, scriptable2);
    }

    @Override
    public Object call(Context object, Scriptable objectArray, Scriptable objectArray2, Object[] object2) {
        object2 = this.this$0;
        object = ((MemberBox)object2).delegateTo;
        if (object == null) {
            object = ScriptRuntime.emptyArgs;
        } else {
            objectArray = new Object[]{objectArray2};
            objectArray2 = object;
            object = objectArray;
        }
        return ((MemberBox)object2).invoke(objectArray2, (Object[])object);
    }

    @Override
    public String getFunctionName() {
        return this.val$name;
    }
}

