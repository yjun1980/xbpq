/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Scriptable;

public interface ConstProperties {
    public void defineConst(String var1, Scriptable var2);

    public boolean isConst(String var1);

    public void putConst(String var1, Scriptable var2, Object var3);
}

