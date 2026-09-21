/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.mozilla.javascript.tools.debugger.SwingGui;

class SwingGui$2
extends WindowAdapter {
    final SwingGui this$0;

    SwingGui$2(SwingGui swingGui) {
        this.this$0 = swingGui;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        SwingGui.access$000(this.this$0);
    }
}

