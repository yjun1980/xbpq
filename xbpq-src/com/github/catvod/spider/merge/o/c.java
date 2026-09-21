/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.github.catvod.spider.merge.o;

import android.os.Looper;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.o.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c
extends a {
    private final Object a = new Object();
    private final ExecutorService b = Executors.newFixedThreadPool(4, new b());

    public final boolean i() {
        boolean bl = Looper.getMainLooper().getThread() == Thread.currentThread();
        return bl;
    }
}

