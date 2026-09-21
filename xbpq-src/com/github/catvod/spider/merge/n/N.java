/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.n.M;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface N
extends ExecutorService {
    public <T> M<T> submit(Callable<T> var1);
}

