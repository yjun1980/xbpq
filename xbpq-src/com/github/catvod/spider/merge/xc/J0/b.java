/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.J0;

import com.github.catvod.spider.merge.xc.J0.a;
import java.io.PrintStream;

public final class b
extends Exception {
    public final Throwable a;

    public b(String string) {
        super(string);
    }

    public b(String charSequence, a a2, Exception exception) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = "";
        charSequence = charSequence == null ? "" : ((String)charSequence).concat(" ");
        stringBuffer.append((String)charSequence);
        if (a2 == null) {
            charSequence = "";
        } else {
            charSequence = new StringBuffer("(position:");
            ((StringBuffer)charSequence).append(((com.github.catvod.spider.merge.xc.I0.a)a2).a());
            ((StringBuffer)charSequence).append(") ");
            charSequence = ((StringBuffer)charSequence).toString();
        }
        stringBuffer.append((String)charSequence);
        if (exception == null) {
            charSequence = string;
        } else {
            charSequence = new StringBuffer("caused by: ");
            ((StringBuffer)charSequence).append(exception);
            charSequence = ((StringBuffer)charSequence).toString();
        }
        stringBuffer.append((String)charSequence);
        super(stringBuffer.toString());
        this.a = exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void printStackTrace() {
        if (this.a == null) {
            super.printStackTrace();
            return;
        }
        PrintStream printStream = System.err;
        synchronized (printStream) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.a.printStackTrace();
            return;
        }
    }
}

