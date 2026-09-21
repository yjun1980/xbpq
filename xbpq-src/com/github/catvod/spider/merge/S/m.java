/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import java.util.concurrent.CancellationException;

public final class m
extends CancellationException {
    public m(Throwable throwable) {
        this.initCause(throwable);
    }
}

