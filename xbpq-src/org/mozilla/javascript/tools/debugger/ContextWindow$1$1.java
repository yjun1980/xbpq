/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.mozilla.javascript.tools.debugger.ContextWindow$1;

class ContextWindow$1$1
extends WindowAdapter {
    final ContextWindow$1 this$1;
    final WindowListener[] val$l;

    ContextWindow$1$1(ContextWindow$1 var1_1, WindowListener[] windowListenerArray) {
        this.this$1 = var1_1;
        this.val$l = windowListenerArray;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.this$1.this$0.context.hidePopup();
        this.val$l[0].windowClosing(windowEvent);
    }
}

