/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.tools.ToolErrorReporter;
import org.mozilla.javascript.tools.shell.Main;
import org.mozilla.javascript.tools.shell.QuitAction;
import org.mozilla.javascript.tools.shell.Timers;

class Main$IProxy
implements ContextAction<Object>,
QuitAction {
    private static final int EVAL_INLINE_SCRIPT = 2;
    private static final int PROCESS_FILES = 1;
    private static final int SYSTEM_EXIT = 3;
    String[] args;
    String scriptText;
    private final Timers timers = new Timers();
    private int type;

    Main$IProxy(int n2) {
        this.type = n2;
    }

    @Override
    public void quit(Context context, int n2) {
        if (this.type == 3) {
            System.exit(n2);
            return;
        }
        throw Kit.codeBug();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object run(Context context) {
        int n2;
        context.setTrackUnhandledPromiseRejections(true);
        this.timers.install(Main.global);
        if (Main.useRequire) {
            Main.require = Main.global.installRequire(context, Main.modulePath, Main.sandboxed);
        }
        if ((n2 = this.type) == 1) {
            Main.processFiles(context, this.args);
            Main.access$000(context);
        } else {
            if (n2 != 2) throw Kit.codeBug();
            Main.evalInlineScript(context, this.scriptText);
        }
        try {
            this.timers.runAllTimers(context, Main.global);
            return null;
        }
        catch (JavaScriptException javaScriptException) {
            ToolErrorReporter.reportException(context.getErrorReporter(), javaScriptException);
            Main.exitCode = 3;
            return null;
        }
        catch (InterruptedException interruptedException) {
            return null;
        }
    }
}

