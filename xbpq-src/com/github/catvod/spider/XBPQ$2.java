/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences$Editor
 */
package com.github.catvod.spider;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.nz.j;

class XBPQ$2
implements j {
    final XBPQ a;

    XBPQ$2(XBPQ xBPQ) {
        this.a = xBPQ;
    }

    @Override
    public void vertifyCode(String stringArray) {
        if (stringArray.indexOf("$$$") > 1) {
            stringArray = stringArray.split("\\$\\$\\$");
            XBPQ.K = stringArray[0].split("#")[0];
            XBPQ.d(this.a, stringArray[0].split("#")[1]);
            SharedPreferences.Editor editor = Init.d.edit();
            editor.putString(n.b(new StringBuilder(), XBPQ.b(this.a), "_ua"), stringArray[0].split("#")[0]);
            editor.putString(XBPQ.b(this.a), stringArray[0].split("#")[1]);
            editor.apply();
        }
        XBPQ.a(this.a, "0");
    }
}

