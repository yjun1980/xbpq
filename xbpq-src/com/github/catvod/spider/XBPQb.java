/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQ$2;
import com.github.catvod.spider.merge.nz.k;

public final class XBPQb
implements Runnable {
    public final XBPQ c;
    public final String d;
    public final String e;

    public /* synthetic */ XBPQb(XBPQ xBPQ, String string, String string2) {
        this.c = xBPQ;
        this.d = string;
        this.e = string2;
    }

    @Override
    public final void run() {
        XBPQ xBPQ = this.c;
        String string = this.d;
        String string2 = this.e;
        String string3 = XBPQ.K;
        ((Object)((Object)xBPQ)).getClass();
        k.A("\u5185\u7f6e\u7f51\u9875\u6d4f\u89c8\u5668", string, string2, new XBPQ$2(xBPQ));
    }
}

