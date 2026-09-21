/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.J.i;
import java.util.concurrent.ThreadFactory;

public final class a
implements ThreadFactory {
    public static final a a = new a();

    private /* synthetic */ a() {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        int n2 = i.i;
        runnable = new Thread(runnable);
        ((Thread)runnable).setName("BaiduDelete-Worker");
        ((Thread)runnable).setDaemon(true);
        return runnable;
    }
}

