/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import org.mozilla.javascript.tools.shell.ShellConsole;

class ShellConsole$SimpleShellConsole
extends ShellConsole {
    private final InputStream in;
    private final PrintWriter out;
    private final BufferedReader reader;

    ShellConsole$SimpleShellConsole(InputStream inputStream, PrintStream printStream, Charset charset) {
        this.in = inputStream;
        this.out = new PrintWriter(printStream);
        this.reader = new BufferedReader(new InputStreamReader(inputStream, charset));
    }

    @Override
    public void flush() {
        this.out.flush();
    }

    @Override
    public InputStream getIn() {
        return this.in;
    }

    @Override
    public void print(String string) {
        this.out.print(string);
    }

    @Override
    public void println() {
        this.out.println();
    }

    @Override
    public void println(String string) {
        this.out.println(string);
    }

    @Override
    public String readLine() {
        return this.reader.readLine();
    }

    @Override
    public String readLine(String string) {
        if (string != null) {
            this.out.write(string);
            this.out.flush();
        }
        return this.reader.readLine();
    }
}

