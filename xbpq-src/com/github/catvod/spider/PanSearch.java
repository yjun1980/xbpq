/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import java.net.URLEncoder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class PanSearch
extends NetPan {
    public String detailContent(List<String> list) {
        return super.detailContent("", list.get(0).split("#")[1], Collections.singletonList(list.get(0).split("#")[0]));
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
    }

    public String searchContent(String string, boolean bl) {
        ArrayList<h> arrayList = new HashMap<String, String>();
        ((HashMap)((Object)arrayList)).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        Object object = new JSONObject(((m)((AbstractList)com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l("https://www.pansearch.me/", arrayList, null)).m0("script[id=__NEXT_DATA__]")).get(0)).V()).getString("buildId");
        arrayList = new StringBuilder();
        ((StringBuilder)((Object)arrayList)).append("https://www.pansearch.me/_next/data/");
        ((StringBuilder)((Object)arrayList)).append((String)object);
        ((StringBuilder)((Object)arrayList)).append("/search.json?keyword=");
        ((StringBuilder)((Object)arrayList)).append(URLEncoder.encode(string));
        arrayList = ((StringBuilder)((Object)arrayList)).toString();
        object = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "x-nextjs-data", "1");
        ((HashMap)object).put("referer", "https://www.pansearch.me/");
        object = new JSONObject(com.github.catvod.spider.merge.f0.d.l((String)((Object)arrayList), (Map<String, String>)object, null)).getJSONObject("pageProps").getJSONObject("data").getJSONArray("data");
        arrayList = new ArrayList<h>();
        for (int i2 = 0; i2 < object.length(); ++i2) {
            JSONObject jSONObject = object.getJSONObject(i2);
            String string2 = jSONObject.optString("content");
            Object object2 = string2.split("\\n");
            if (((String[])object2).length == 0) continue;
            CharSequence charSequence = new StringBuilder();
            charSequence.append(com.github.catvod.spider.merge.c1.d.l(string2).m0("a").a("href"));
            charSequence.append("#");
            charSequence.append(string);
            charSequence = charSequence.toString();
            string2 = object2[0].replaceAll("</?[^>]+>", "");
            object2 = jSONObject.optString("time");
            arrayList.add(new h((String)charSequence, string2, jSONObject.optString("image"), (String)object2));
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }
}

