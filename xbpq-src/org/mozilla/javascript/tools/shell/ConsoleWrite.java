/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.tools.shell.ConsoleTextArea;

class ConsoleWrite
implements Runnable {
    private String str;
    private ConsoleTextArea textArea;

    public ConsoleWrite(ConsoleTextArea consoleTextArea, String string) {
        this.textArea = consoleTextArea;
        this.str = string;
    }

    @Override
    public void run() {
        this.textArea.write(this.str);
    }
}

