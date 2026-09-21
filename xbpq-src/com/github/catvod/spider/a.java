/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQ$1;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.k;

public final class a
implements Runnable {
    public final XBPQ c;
    public final String d;
    public final String e;

    public /* synthetic */ a(XBPQ xBPQ, String string, String string2) {
        this.c = xBPQ;
        this.d = string;
        this.e = string2;
    }

    @Override
    public final void run() {
        Object object = this.c;
        String string = this.d;
        String string2 = this.e;
        String string3 = XBPQ.K;
        ((Object)object).getClass();
        object = new XBPQ$1((XBPQ)((Object)object));
        k.A(cYh.d("82D6C4B6EAF480EDD0B8F6EF81E5CEB9F0D282C9E9"), string, string2, (j)object);
    }
}

