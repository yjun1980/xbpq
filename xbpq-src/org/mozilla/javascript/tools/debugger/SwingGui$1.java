/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import org.mozilla.javascript.tools.debugger.SwingGui;

class SwingGui$1
extends FileFilter {
    final SwingGui this$0;

    SwingGui$1(SwingGui swingGui) {
        this.this$0 = swingGui;
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

