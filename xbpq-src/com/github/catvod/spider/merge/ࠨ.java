/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.util.concurrent.CancellationException;

public class \u0828
extends CancellationException {
    public \u0828(Throwable throwable) {
        this.initCause(throwable);
    }
}

