/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PanSou
extends NetPan {
    private String m = "https://www.tianyiso.com";
    public String n = "";

    private String searchContent(String string, String arrayList) {
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(this.m);
        ((StringBuilder)serializable).append("/search?k=");
        ((StringBuilder)serializable).append(URLEncoder.encode(string));
        ((StringBuilder)serializable).append("&page=");
        ((StringBuilder)serializable).append((String)((Object)arrayList));
        ((StringBuilder)serializable).append("&s=1&t=-1");
        arrayList = ((StringBuilder)serializable).toString();
        SpiderDebug.log((String)((Object)arrayList));
        arrayList = com.github.catvod.spider.merge.i0.m.q((String)((Object)arrayList), new HashMap<String, String>());
        this.n = (String)((HashMap)((Object)arrayList)).get("cookies");
        serializable = com.github.catvod.spider.merge.c1.d.l((String)((HashMap)((Object)arrayList)).get("html")).m0(".van-card__header");
        arrayList = new ArrayList<h>();
        Iterator iterator = ((AbstractCollection)((Object)serializable)).iterator();
        while (iterator.hasNext()) {
            com.github.catvod.spider.merge.e1.m m2 = (com.github.catvod.spider.merge.e1.m)iterator.next();
            String string2 = m2.n0(".van-card__content").s0().trim();
            if (!string2.contains(string)) continue;
            h h2 = new h();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(m2.m0("a").a("href"));
            ((StringBuilder)serializable).append("#");
            ((StringBuilder)serializable).append(string);
            h2.l(((StringBuilder)serializable).toString());
            h2.n(NetPan.getYunPanPic(h2.c()));
            h2.m(string2);
            arrayList.add(h2);
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    public String detailContent(List<String> list) {
        SpiderDebug.log((String)list.get(0));
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.m);
        charSequence.append(list.get(0).split("#")[0].replace("/s/", "/cv/"));
        charSequence = charSequence.toString();
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(this.m);
        charSequence2.append(list.get(0).split("#")[0].replace("/s/", "/cv/"));
        charSequence2 = charSequence2.toString();
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("cookie", this.n);
        hashMap2.put("referer", (String)charSequence2);
        hashMap2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36 Edg/138.0.0.0");
        com.github.catvod.spider.merge.f0.d.o((String)charSequence, hashMap2, hashMap);
        SpiderDebug.log((String)this.n);
        SpiderDebug.log((String)((Object)hashMap).toString());
        return super.detailContent("", list.get(0).split("#")[1], hashMap.get("location"));
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        this.m = JsonParser.parseString((String)string).getAsJsonObject().get("siteUrl").getAsString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

