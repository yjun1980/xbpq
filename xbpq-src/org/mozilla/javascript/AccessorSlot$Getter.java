/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

interface AccessorSlot$Getter {
    public Function asGetterFunction(String var1, Scriptable var2);

    public Object getValue(Scriptable var1);
}

