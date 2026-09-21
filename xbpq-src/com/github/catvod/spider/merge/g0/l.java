/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.github.catvod.spider.merge.g0;

import android.content.Context;
import com.github.catvod.spider.Init;

public final class l
implements Runnable {
    public final Init a;
    public final Context b;
    public final boolean c;

    public /* synthetic */ l(Init init, Context context, boolean bl) {
        this.a = init;
        this.b = context;
        this.c = bl;
    }

    @Override
    public final void run() {
        Init.b(this.a, this.b, this.c);
    }
}

