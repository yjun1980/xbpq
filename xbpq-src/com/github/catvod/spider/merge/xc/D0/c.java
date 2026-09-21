/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.D0;

import com.github.catvod.spider.merge.xc.D0.b;
import java.util.ArrayList;

public final class c
extends IllegalArgumentException {
    public static final String a = b.class.getName();

    public c(String string) {
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Throwable fillInStackTrace() {
        synchronized (this) {
            super.fillInStackTrace();
            StackTraceElement[] stackTraceElementArray = this.getStackTrace();
            ArrayList<StackTraceElement> arrayList = new ArrayList<StackTraceElement>();
            for (StackTraceElement stackTraceElement : stackTraceElementArray) {
                if (stackTraceElement.getClassName().equals(a)) continue;
                arrayList.add(stackTraceElement);
            }
            try {
                this.setStackTrace(arrayList.toArray(new StackTraceElement[0]));
                return this;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

