/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.c1.d;
import java.util.ArrayList;

public final class e
extends IllegalArgumentException {
    public static final String a = d.class.getName();

    public e(String string) {
        super(string);
    }

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
            this.setStackTrace(arrayList.toArray(new StackTraceElement[0]));
            return this;
        }
    }
}

