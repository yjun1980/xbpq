/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.k0;

public final class a
extends Error {
    public a() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public a(String string, Throwable throwable) {
        super(string, throwable);
    }
}

