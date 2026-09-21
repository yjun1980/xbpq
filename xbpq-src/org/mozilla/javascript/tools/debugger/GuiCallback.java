/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;

public interface GuiCallback {
    public void dispatchNextGuiEvent();

    public void enterInterrupt(Dim$StackFrame var1, String var2, String var3);

    public boolean isGuiEventThread();

    public void updateSourceText(Dim$SourceInfo var1);
}

