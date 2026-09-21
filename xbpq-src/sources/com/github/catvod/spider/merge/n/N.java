package com.github.catvod.spider.merge.n;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface N extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> M<T> submit(Callable<T> callable);
}
