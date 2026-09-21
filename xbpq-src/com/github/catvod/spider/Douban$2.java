/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Douban;
import com.github.catvod.spider.Douban$MUrlBuilder;

class Douban$2
implements Douban$MUrlBuilder {
    final String a;
    final String b;

    Douban$2(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public String build(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://m.douban.com/rexxar/api/v2/subject/recent_hot/tv?start=");
        stringBuilder.append(n2);
        stringBuilder.append("&limit=");
        stringBuilder.append(n3);
        stringBuilder.append("&category=");
        stringBuilder.append(this.a);
        stringBuilder.append("&type=");
        stringBuilder.append(Douban.e(this.b));
        return stringBuilder.toString();
    }
}

