/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import org.mozilla.javascript.tools.shell.JSConsole;

class JSConsole$1
extends FileFilter {
    final JSConsole this$0;

    JSConsole$1(JSConsole jSConsole) {
        this.this$0 = jSConsole;
    }

    @Override
    public boolean accept(File object) {
        if (((File)object).isDirectory()) {
            return true;
        }
        int n2 = ((String)(object = ((File)object).getName())).lastIndexOf(46);
        return n2 > 0 && n2 < ((String)object).length() - 1 && ((String)object).substring(n2 + 1).toLowerCase().equals("js");
    }

    @Override
    public String getDescription() {
        return "JavaScript Files (*.js)";
    }
}

