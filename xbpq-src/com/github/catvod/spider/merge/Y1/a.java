/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y1;

import java.io.PrintStream;

public final class a
extends Exception {
    protected Throwable a;

    public a(String string) {
        super(string);
    }

    public a(Throwable throwable) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("caused by: ");
        stringBuffer2.append(throwable);
        stringBuffer.append(stringBuffer2.toString());
        super(stringBuffer.toString());
        this.a = throwable;
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
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.getMessage());
            stringBuffer.append("; nested exception is:");
            printStream2.println(stringBuffer.toString());
            this.a.printStackTrace();
            return;
        }
    }
}

