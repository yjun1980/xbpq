/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.b;
import com.github.catvod.spider.merge.xc.U.K;

public final class J
implements K {
    public final String a;
    public final String b;

    public /* synthetic */ J(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public final void a(String string) {
        InitOrigin.execute((Runnable)new b(this.a, (Object)this.b, string, 3));
    }
}

