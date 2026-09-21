/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQ$4;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.k;

public final class c
implements Runnable {
    public final XBPQ c;
    public final String d;
    public final String e;

    public /* synthetic */ c(XBPQ xBPQ, String string, String string2) {
        this.c = xBPQ;
        this.d = string;
        this.e = string2;
    }

    @Override
    public final void run() {
        XBPQ xBPQ = this.c;
        String string = this.d;
        String string2 = this.e;
        Object object = XBPQ.K;
        ((Object)((Object)xBPQ)).getClass();
        object = new XBPQ$4(xBPQ, string2);
        k.A(cYh.d("81CCEDB6FCC38ECCC1B9F1DB8EFACDB9F8DB"), string, string2, (j)object);
    }
}

