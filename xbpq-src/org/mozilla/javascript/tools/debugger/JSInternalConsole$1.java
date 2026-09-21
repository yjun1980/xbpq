/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import org.mozilla.javascript.tools.debugger.JSInternalConsole;

class JSInternalConsole$1
extends InternalFrameAdapter {
    final JSInternalConsole this$0;

    JSInternalConsole$1(JSInternalConsole jSInternalConsole) {
        this.this$0 = jSInternalConsole;
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
        if (this.this$0.consoleTextArea.hasFocus()) {
            this.this$0.consoleTextArea.getCaret().setVisible(false);
            this.this$0.consoleTextArea.getCaret().setVisible(true);
        }
    }
}

