/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.tools.shell.Global;

class PipeThread
extends Thread {
    private InputStream from;
    private boolean fromProcess;
    private OutputStream to;

    PipeThread(boolean bl, InputStream inputStream, OutputStream outputStream) {
        this.setDaemon(true);
        this.fromProcess = bl;
        this.from = inputStream;
        this.to = outputStream;
    }

    @Override
    public void run() {
        try {
            Global.pipe(this.fromProcess, this.from, this.to);
            return;
        }
        catch (IOException iOException) {
            throw Context.throwAsScriptRuntimeEx(iOException);
        }
    }
}

