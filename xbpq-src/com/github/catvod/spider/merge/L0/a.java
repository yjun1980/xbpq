/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L0;

public final class a
extends Error {
    Exception a;

    public a(String string, Exception exception) {
        super(string);
        this.a = exception;
    }

    @Override
    public final String getMessage() {
        Object object = super.getMessage();
        if (object != null) {
            return object;
        }
        Object object2 = this.a;
        if (object2 != null) {
            object = object2 = ((Throwable)object2).getMessage();
            if (object2 == null) {
                object = this.a.getClass().toString();
            }
        }
        return object;
    }
}

