/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.a0;

public final class a
extends Error {
    public final Exception a;

    public a(String string, Exception exception) {
        super(string);
        this.a = exception;
    }

    @Override
    public final String getMessage() {
        String string = super.getMessage();
        if (string != null) {
            return string;
        }
        Exception exception = this.a;
        if (exception != null) {
            String string2;
            string = string2 = exception.getMessage();
            if (string2 == null) {
                string = exception.getClass().toString();
            }
        }
        return string;
    }
}

