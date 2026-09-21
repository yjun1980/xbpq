/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Scriptable;

public class IdFunctionObjectES6
extends IdFunctionObject {
    private static final int Id_length = 1;
    private static final int Id_name = 3;
    private static final long serialVersionUID = -8023088662589035261L;
    private boolean myLength = true;
    private boolean myName = true;

    public IdFunctionObjectES6(IdFunctionCall idFunctionCall, Object object, int n2, String string, int n3, Scriptable scriptable) {
        super(idFunctionCall, object, n2, string, n3, scriptable);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        if (string.equals("length")) {
            return IdScriptableObject.instanceIdInfo(3, 1);
        }
        if (string.equals("name")) {
            return IdScriptableObject.instanceIdInfo(3, 3);
        }
        return super.findInstanceIdInfo(string);
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 == 1 && !this.myLength) {
            return Scriptable.NOT_FOUND;
        }
        if (n2 == 3 && !this.myName) {
            return Scriptable.NOT_FOUND;
        }
        return super.getInstanceIdValue(n2);
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        if (n2 == 1 && object == Scriptable.NOT_FOUND) {
            this.myLength = false;
            return;
        }
        if (n2 == 3 && object == Scriptable.NOT_FOUND) {
            this.myName = false;
            return;
        }
        super.setInstanceIdValue(n2, object);
    }
}

