package com.github.catvod.spider.merge.n;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface M<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
