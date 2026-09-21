/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.IOException;
import java.nio.charset.Charset;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeConsole;
import org.mozilla.javascript.NativeConsole$ConsolePrinter;
import org.mozilla.javascript.NativeConsole$Level;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.Main;
import org.mozilla.javascript.tools.shell.ShellConsole;

class ShellConsolePrinter
implements NativeConsole$ConsolePrinter {
    private static final long serialVersionUID = 5869832740127501857L;

    ShellConsolePrinter() {
    }

    @Override
    public void print(Context object, Scriptable object2, NativeConsole$Level nativeConsole$Level, Object[] object3, ScriptStackElement[] scriptStackElementArray) {
        block6: {
            int n2;
            if (((Object[])object3).length == 0) {
                return;
            }
            object2 = NativeConsole.format((Context)object, (Scriptable)object2, (Object[])object3);
            object = Main.getGlobal().getConsole(Charset.defaultCharset());
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((Object)nativeConsole$Level);
            ((StringBuilder)object3).append(" ");
            ((StringBuilder)object3).append((String)object2);
            ((ShellConsole)object).println(((StringBuilder)object3).toString());
            if (scriptStackElementArray == null) break block6;
            try {
                n2 = scriptStackElementArray.length;
            }
            catch (IOException iOException) {
                throw Context.reportRuntimeError(iOException.getMessage());
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                ((ShellConsole)object).println(scriptStackElementArray[i2].toString());
                continue;
            }
        }
        return;
    }
}

