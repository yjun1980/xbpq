/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.B4;
import com.github.catvod.spider.merge.PV;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.ok;
import com.github.catvod.spider.merge.rv;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class j
extends k {
    public j() {
        this(true);
    }

    public j(boolean bl) {
        super("Slf4j");
        OutputStream outputStream;
        this.l8(PV.class);
        if (!bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        PrintStream printStream = System.err;
        try {
            outputStream = new OutputStream(this, stringBuilder){
                final j S;
                final StringBuilder l8;
                {
                    this.S = j2;
                    this.l8 = stringBuilder;
                }

                @Override
                public void write(int n2) {
                    this.l8.append((char)n2);
                }
            };
            PrintStream printStream2 = new PrintStream(outputStream, true, "US-ASCII");
            System.setErr(printStream2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new Error(unsupportedEncodingException);
        }
        try {
            if (!(PV.N() instanceof B4)) {
                printStream.print(stringBuilder);
                printStream.flush();
                return;
            }
            outputStream = new NoClassDefFoundError(stringBuilder.toString());
            throw outputStream;
        }
        finally {
            System.setErr(printStream);
        }
    }

    @Override
    public rv S(Class<?> clazz) {
        return new ok(clazz);
    }
}

