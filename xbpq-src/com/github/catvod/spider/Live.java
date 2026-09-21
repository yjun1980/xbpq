/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.n0;

public class Live
extends Spider {
    private int a;

    public String homeVideoContent() {
        Init.run(new n0((Object)this, 5), this.a);
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init(Context context, String string) {
        super.init(context, string);
        int n2 = 0;
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                int n3;
                n2 = n3 = Integer.parseInt(string);
            }
        }
        catch (Throwable throwable) {}
        this.a = n2;
    }
}

