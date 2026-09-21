/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.a1;

final class c
extends RuntimeException {
    c(String string) {
        super(string);
    }

    c(Throwable throwable) {
        super("Failed to read input", throwable);
    }
}

