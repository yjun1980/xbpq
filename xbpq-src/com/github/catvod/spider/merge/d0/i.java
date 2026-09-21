/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;

public final class i
implements Runnable {
    public static final i a = new i();

    private /* synthetic */ i() {
    }

    @Override
    public final void run() {
        try {
            if (BaseApi.isDebuggable((Context)Init.context())) {
                System.exit(0);
            }
            BaseApi.get();
            BaseApi.getAppSignature((Context)Init.context());
            Thread.sleep(5000L);
            BaseApi.get().getDexPathList();
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }
}

