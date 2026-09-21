/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

interface AccessorSlot$Setter {
    public Function asSetterFunction(String var1, Scriptable var2);

    public boolean setValue(Object var1, Scriptable var2, Scriptable var3);
}

