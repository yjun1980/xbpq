/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ScriptRuntime$1;
import org.mozilla.javascript.Scriptable;

class ScriptRuntime$IdEnumeration
implements Serializable {
    private static final long serialVersionUID = 1L;
    Object currentId;
    boolean enumNumbers;
    int enumType;
    Object[] ids;
    int index;
    Scriptable iterator;
    Scriptable obj;
    ObjToIntMap used;

    private ScriptRuntime$IdEnumeration() {
    }

    /* synthetic */ ScriptRuntime$IdEnumeration(ScriptRuntime$1 scriptRuntime$1) {
        this();
    }
}

