/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

class MemberBox$2
extends BaseFunction {
    final MemberBox this$0;
    final String val$name;

    MemberBox$2(MemberBox memberBox, Scriptable scriptable, Scriptable scriptable2, String string) {
        this.this$0 = memberBox;
        this.val$name = string;
        super(scriptable, scriptable2);
    }

    @Override
    public Object call(Context object, Scriptable object2, Scriptable scriptable, Object[] objectArray) {
        MemberBox memberBox = this.this$0;
        object = objectArray.length > 0 ? FunctionObject.convertArg((Context)object, scriptable, objectArray[0], FunctionObject.getTypeTag(memberBox.argTypes[0])) : Undefined.instance;
        object2 = memberBox.delegateTo;
        if (object2 == null) {
            objectArray = new Object[]{object};
            object2 = scriptable;
            object = objectArray;
        } else {
            object = new Object[]{scriptable, object};
        }
        return memberBox.invoke(object2, (Object[])object);
    }

    @Override
    public String getFunctionName() {
        return this.val$name;
    }
}

