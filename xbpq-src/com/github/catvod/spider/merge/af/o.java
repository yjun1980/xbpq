/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.nIe;
import java.io.PrintStream;

public final class o
extends Exception {
    protected Throwable a;

    public o(String string) {
        super(string);
    }

    public o(Throwable throwable) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(nIe.d("210726302C2B62042A7969"));
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
            stringBuffer.append(nIe.d("79463D263A3B27027326312C2716272A2621620F2079"));
            printStream2.println(stringBuffer.toString());
            this.a.printStackTrace();
            return;
        }
    }
}

