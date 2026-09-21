/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.ContextWrapper;
import com.github.catvod.spider.merge.n.K;
import com.github.catvod.spider.merge.n.O;

public final class I
extends ContextWrapper {
    private static final Object a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof I) && !(context.getResources() instanceof K)) {
            context.getResources();
            int n2 = O.a;
        }
        return context;
    }
}

