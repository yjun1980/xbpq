/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.j;

class XBPQ$2
implements j {
    final XBPQ a;

    XBPQ$2(XBPQ xBPQ) {
        this.a = xBPQ;
    }

    @Override
    public void vertifyCode(String stringArray) {
        if (stringArray.indexOf(cYh.d("437465")) > 1) {
            stringArray = stringArray.split(cYh.d("3B741D750B7E"));
            String string = stringArray[0];
            String string2 = cYh.d("44");
            XBPQ.K = string.split(string2)[0];
            XBPQ.d(this.a, stringArray[0].split(string2)[1]);
            string = Init.d.edit();
            string.putString(n.b(new StringBuilder(), XBPQ.b(this.a), cYh.d("382520")), stringArray[0].split(string2)[0]);
            string.putString(XBPQ.b(this.a), stringArray[0].split(string2)[1]);
            string.apply();
        }
        XBPQ.a(this.a, cYh.d("57"));
    }
}

