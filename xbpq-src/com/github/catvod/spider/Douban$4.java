/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Douban;
import com.github.catvod.spider.Douban$MUrlBuilder;
import org.json.JSONObject;

class Douban$4
implements Douban$MUrlBuilder {
    final JSONObject a;
    final String b;
    final String c;

    Douban$4(JSONObject jSONObject, String string, String string2) {
        this.a = jSONObject;
        this.b = string;
        this.c = string2;
    }

    @Override
    public String build(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://m.douban.com/rexxar/api/v2/tv/recommend?refresh=0&start=");
        stringBuilder.append(n2);
        stringBuilder.append("&count=");
        stringBuilder.append(n3);
        stringBuilder.append("&selected_categories=");
        stringBuilder.append(Douban.e(this.a.toString()));
        stringBuilder.append("&uncollect=false&score_range=0,10&tags=");
        stringBuilder.append(Douban.e(this.b));
        stringBuilder.append("&sort=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

