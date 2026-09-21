/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class D {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(D.class, "_size$volatile");
    private volatile int _size$volatile;
}

