/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AccessorSlot$Getter;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

final class AccessorSlot$MemberBoxGetter
implements AccessorSlot$Getter {
    final MemberBox member;

    AccessorSlot$MemberBoxGetter(MemberBox memberBox) {
        this.member = memberBox;
    }

    @Override
    public Function asGetterFunction(String string, Scriptable scriptable) {
        return this.member.asGetterFunction(string, scriptable);
    }

    @Override
    public Object getValue(Scriptable scriptable) {
        MemberBox memberBox = this.member;
        Object object = memberBox.delegateTo;
        if (object == null) {
            return memberBox.invoke(scriptable, ScriptRuntime.emptyArgs);
        }
        return memberBox.invoke(object, new Object[]{scriptable});
    }
}

