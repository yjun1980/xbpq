/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.InputStream;
import java.nio.charset.Charset;
import org.mozilla.javascript.tools.shell.ShellConsole;

class ShellConsole$ConsoleInputStream
extends InputStream {
    private static final byte[] EMPTY = new byte[0];
    private boolean atEOF = false;
    private byte[] buffer = EMPTY;
    private final ShellConsole console;
    private final Charset cs;
    private int cursor = -1;

    public ShellConsole$ConsoleInputStream(ShellConsole shellConsole, Charset charset) {
        this.console = shellConsole;
        this.cs = charset;
    }

    private boolean ensureInput() {
        if (this.atEOF) {
            return false;
        }
        int n2 = this.cursor;
        if (n2 < 0 || n2 > this.buffer.length) {
            if (this.readNextLine() == -1) {
                this.atEOF = true;
                return false;
            }
            this.cursor = 0;
        }
        return true;
    }

    private int readNextLine() {
        Object object = this.console.readLine(null);
        if (object != null) {
            object = ((String)object).getBytes(this.cs);
            this.buffer = (byte[])object;
            return ((Object)object).length;
        }
        this.buffer = EMPTY;
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int read() {
        synchronized (this) {
            byte[] byArray;
            int n2;
            block6: {
                block5: {
                    boolean bl = this.ensureInput();
                    if (bl) break block5;
                    return -1;
                }
                n2 = this.cursor;
                byArray = this.buffer;
                if (n2 != byArray.length) break block6;
                this.cursor = n2 + 1;
                return 10;
            }
            this.cursor = n2 + 1;
            return byArray[n2];
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] object, int n2, int n3) {
        synchronized (this) {
            int n4;
            void var3_5;
            void var2_4;
            if (object == null) {
                NullPointerException nullPointerException = new NullPointerException();
                throw nullPointerException;
            }
            if (var2_4 >= 0 && var3_5 >= 0 && var3_5 <= (n4 = ((byte[])object).length) - var2_4) {
                if (var3_5 == false) {
                    return 0;
                }
                boolean bl = this.ensureInput();
                if (!bl) {
                    return -1;
                }
                int n5 = Math.min((int)var3_5, this.buffer.length - this.cursor);
                for (n4 = 0; n4 < n5; ++n4) {
                    object[var2_4 + n4] = this.buffer[this.cursor + n4];
                }
                n4 = n5;
                if (n5 < var3_5) {
                    object[var2_4 + n5] = 10;
                    n4 = n5 + 1;
                }
                this.cursor += n4;
                return n4;
            }
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            throw indexOutOfBoundsException;
        }
    }
}

