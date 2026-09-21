/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AccessorSlot$Setter;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.Scriptable;

final class AccessorSlot$MemberBoxSetter
implements AccessorSlot$Setter {
    final MemberBox member;

    AccessorSlot$MemberBoxSetter(MemberBox memberBox) {
        this.member = memberBox;
    }

    @Override
    public Function asSetterFunction(String string, Scriptable scriptable) {
        return this.member.asSetterFunction(string, scriptable);
    }

    @Override
    public boolean setValue(Object object, Scriptable object2, Scriptable scriptable) {
        object2 = Context.getContext();
        Object object3 = this.member.argTypes;
        object2 = FunctionObject.convertArg((Context)object2, scriptable, object, FunctionObject.getTypeTag(object3[((Class<?>[])object3).length - 1]));
        object3 = this.member;
        object = ((MemberBox)object3).delegateTo;
        if (object == null) {
            ((MemberBox)object3).invoke(scriptable, new Object[]{object2});
        } else {
            ((MemberBox)object3).invoke(object, new Object[]{scriptable, object2});
        }
        return true;
    }
}

