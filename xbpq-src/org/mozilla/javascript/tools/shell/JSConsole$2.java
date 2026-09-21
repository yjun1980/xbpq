/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.mozilla.javascript.tools.shell.JSConsole;

class JSConsole$2
extends WindowAdapter {
    final JSConsole this$0;

    JSConsole$2(JSConsole jSConsole) {
        this.this$0 = jSConsole;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}

