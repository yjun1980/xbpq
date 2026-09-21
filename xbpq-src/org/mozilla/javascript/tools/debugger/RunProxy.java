/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;
import org.mozilla.javascript.tools.debugger.MessageDialogWrapper;
import org.mozilla.javascript.tools.debugger.SwingGui;

class RunProxy
implements Runnable {
    static final int ENTER_INTERRUPT = 4;
    static final int LOAD_FILE = 2;
    static final int OPEN_FILE = 1;
    static final int UPDATE_SOURCE_TEXT = 3;
    String alertMessage;
    private SwingGui debugGui;
    String fileName;
    Dim$StackFrame lastFrame;
    Dim$SourceInfo sourceInfo;
    String text;
    String threadTitle;
    private int type;

    public RunProxy(SwingGui swingGui, int n2) {
        this.debugGui = swingGui;
        this.type = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        String string;
        StringBuilder stringBuilder;
        String string2;
        SwingGui swingGui;
        block8: {
            int n2 = this.type;
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) throw new IllegalArgumentException(String.valueOf(this.type));
                        this.debugGui.enterInterruptImpl(this.lastFrame, this.threadTitle, this.alertMessage);
                        return;
                    } else {
                        String string3 = this.sourceInfo.url();
                        if (this.debugGui.updateFileWindow(this.sourceInfo) || string3.equals("<stdin>")) return;
                        this.debugGui.createFileWindow(this.sourceInfo, -1);
                    }
                    return;
                }
                try {
                    this.debugGui.dim.evalScript(this.fileName, this.text);
                    return;
                }
                catch (RuntimeException runtimeException) {
                    swingGui = this.debugGui;
                    string2 = runtimeException.getMessage();
                    stringBuilder = new StringBuilder();
                    string = "Run error for ";
                    break block8;
                }
            }
            try {
                this.debugGui.dim.compileScript(this.fileName, this.text);
                return;
            }
            catch (RuntimeException runtimeException) {
                swingGui = this.debugGui;
                string2 = runtimeException.getMessage();
                stringBuilder = new StringBuilder();
                string = "Error Compiling ";
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(this.fileName);
        MessageDialogWrapper.showMessageDialog(swingGui, string2, stringBuilder.toString(), 0);
    }
}

