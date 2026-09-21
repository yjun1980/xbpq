/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Z0;

public final class d
extends IllegalStateException {
    private Throwable a;

    d(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    @Override
    public final Throwable getCause() {
        return this.a;
    }
}

