/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.nz.j;

class XBPQ$1
implements j {
    final XBPQ a;

    XBPQ$1(XBPQ xBPQ) {
        this.a = xBPQ;
    }

    @Override
    public void vertifyCode(String string) {
        if (string.indexOf("$$$") > 1) {
            String[] stringArray = string.split("\\$\\$\\$");
            XBPQ.K = stringArray[0].split("#")[0];
            XBPQ.d(this.a, stringArray[0].split("#")[1]);
            string = Init.d.edit();
            string.putString(n.b(new StringBuilder(), XBPQ.b(this.a), "_ua"), stringArray[0].split("#")[0]);
            string.putString(XBPQ.b(this.a), stringArray[0].split("#")[1]);
            string.apply();
        }
        XBPQ.a(this.a, "0");
    }
}

