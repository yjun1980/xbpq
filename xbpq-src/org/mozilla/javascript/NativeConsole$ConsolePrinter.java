/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeConsole$Level;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.Scriptable;

public interface NativeConsole$ConsolePrinter
extends Serializable {
    public void print(Context var1, Scriptable var2, NativeConsole.Level var3, Object[] var4, ScriptStackElement[] var5);
}

