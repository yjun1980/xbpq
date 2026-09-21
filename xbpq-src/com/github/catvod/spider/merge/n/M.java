/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface M<V>
extends Future<V> {
    public void a(Runnable var1, Executor var2);
}

