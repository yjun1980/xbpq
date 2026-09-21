/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.OutputStream;
import javax.swing.SwingUtilities;
import org.mozilla.javascript.tools.shell.ConsoleTextArea;
import org.mozilla.javascript.tools.shell.ConsoleWrite;

class ConsoleWriter
extends OutputStream {
    private StringBuffer buffer;
    private ConsoleTextArea textArea;

    public ConsoleWriter(ConsoleTextArea consoleTextArea) {
        this.textArea = consoleTextArea;
        this.buffer = new StringBuffer();
    }

    private void flushBuffer() {
        String string = this.buffer.toString();
        this.buffer.setLength(0);
        SwingUtilities.invokeLater(new ConsoleWrite(this.textArea, string));
    }

    @Override
    public void close() {
        this.flush();
    }

    @Override
    public void flush() {
        synchronized (this) {
            if (this.buffer.length() > 0) {
                this.flushBuffer();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(int n2) {
        synchronized (this) {
            this.buffer.append((char)n2);
            if (n2 == 10) {
                this.flushBuffer();
            }
            return;
        }
    }

    public void write(char[] cArray, int n2, int n3) {
        synchronized (this) {
            while (n2 < n3) {
                this.buffer.append(cArray[n2]);
                if (cArray[n2] == '\n') {
                    this.flushBuffer();
                }
                ++n2;
            }
            return;
        }
    }
}

