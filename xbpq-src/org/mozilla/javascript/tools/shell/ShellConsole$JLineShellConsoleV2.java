/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.InputStream;
import java.nio.charset.Charset;
import org.mozilla.javascript.tools.shell.ShellConsole;
import org.mozilla.javascript.tools.shell.ShellConsole$ConsoleInputStream;

class ShellConsole$JLineShellConsoleV2
extends ShellConsole {
    private final InputStream in;
    private final Object reader;

    ShellConsole$JLineShellConsoleV2(Object object, Charset charset) {
        this.reader = object;
        this.in = new ShellConsole$ConsoleInputStream(this, charset);
    }

    @Override
    public void flush() {
        ShellConsole.access$100(this.reader, "flush", ShellConsole.access$000(), new Object[0]);
    }

    @Override
    public InputStream getIn() {
        return this.in;
    }

    @Override
    public void print(String string) {
        ShellConsole.access$100(this.reader, "print", ShellConsole.access$300(), new Object[]{string});
    }

    @Override
    public void println() {
        ShellConsole.access$100(this.reader, "println", ShellConsole.access$000(), new Object[0]);
    }

    @Override
    public void println(String string) {
        ShellConsole.access$100(this.reader, "println", ShellConsole.access$300(), new Object[]{string});
    }

    @Override
    public String readLine() {
        return (String)ShellConsole.access$100(this.reader, "readLine", ShellConsole.access$000(), new Object[0]);
    }

    @Override
    public String readLine(String string) {
        return (String)ShellConsole.access$100(this.reader, "readLine", ShellConsole.access$200(), new Object[]{string});
    }
}

