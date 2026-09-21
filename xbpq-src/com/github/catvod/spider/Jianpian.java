/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.Q.d;
import com.github.catvod.spider.merge.Q.e;
import com.github.catvod.spider.merge.Q.f;
import com.github.catvod.spider.merge.Q.g;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Jianpian
extends Spider {
    private String a = "https://ev5356.970xw.com";
    private String b;
    private String c;

    private Map<String, String> a() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Linux; Android 9; V2196A Build/PQ3A.190705.08211809; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Mobile Safari/537.36;webank/h5face;webank/1.0;netType:NETWORK_WIFI;appVersion:416;packageName:com.jp3.xg3");
        hashMap.put("Referer", this.a);
        return hashMap;
    }

    public String categoryContent(String iterator, String object, boolean bl, HashMap<String, String> object2) {
        if (((String)((Object)iterator)).endsWith("/{pg}")) {
            return this.searchContent(((String)((Object)iterator)).split("/")[0], (String)object);
        }
        if (!(((String)((Object)iterator)).equals("50") || ((String)((Object)iterator)).equals("99") || ((String)((Object)iterator)).equals("111"))) {
            ArrayList<h> arrayList = new ArrayList<h>();
            Object object3 = new HashMap<String, String>();
            if (object2 != null && !((HashMap)object2).isEmpty()) {
                ((HashMap)object3).putAll(object2);
            }
            object2 = ((HashMap)object3).get("area");
            String string = "0";
            object2 = object2 == null ? "0" : (String)((HashMap)object3).get("area");
            if (((HashMap)object3).get("year") != null) {
                string = (String)((HashMap)object3).get("year");
            }
            object3 = ((HashMap)object3).get("by") == null ? "updata" : (String)((HashMap)object3).get("by");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(String.format("/api/crumb/list?fcate_pid=%s&area=%s&year=%s&type=0&sort=%s&page=%s&category_id=", iterator, object2, string, object3, object));
            iterator = f.b(com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), this.a(), null)).a().iterator();
            while (iterator.hasNext()) {
                arrayList.add(iterator.next().m(this.b));
            }
            return com.github.catvod.spider.merge.K.f.o(arrayList);
        }
        object2 = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(String.format("/api/dyTag/list?category_id=%s&page=%s", iterator, object));
        object = f.b(com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), this.a(), null)).a().iterator();
        while (object.hasNext()) {
            iterator = ((d)object.next()).c().iterator();
            while (iterator.hasNext()) {
                ((ArrayList)object2).add(iterator.next().m(this.b));
            }
        }
        iterator = new com.github.catvod.spider.merge.K.f();
        ((com.github.catvod.spider.merge.K.f)((Object)iterator)).k(1, 1, 0, 1);
        ((com.github.catvod.spider.merge.K.f)((Object)iterator)).y((List<h>)object2);
        return ((com.github.catvod.spider.merge.K.f)((Object)iterator)).toString();
    }

    public String detailContent(List<String> object) {
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.a);
        ((StringBuilder)object2).append("/api/video/detailv2?id=");
        ((StringBuilder)object2).append(object.get(0));
        object = ((e)com.github.catvod.spider.merge.G1.d.a(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.a(), null), e.class)).a();
        object2 = ((d)object).m(this.b);
        ((h)object2).o(((d)object).i());
        ((h)object2).s(((d)object).k());
        ((h)object2).i(((d)object).b());
        ((h)object2).g(((d)object).g());
        ((h)object2).h(((d)object).a());
        ((h)object2).p(((d)object).j());
        ((h)object2).k(((d)object).e());
        ((h)object2).j(((d)object).d());
        return com.github.catvod.spider.merge.K.f.n((h)object2);
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        List<String> list = Arrays.asList("1", "2", "3", "4", "50", "99");
        List<String> list2 = Arrays.asList("\u7535\u5f71", "\u7535\u89c6\u5267", "\u52a8\u6f2b", "\u7efc\u827a", "\u7eaa\u5f55\u7247", "Netflix");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            arrayList.add(new a(list.get(i2), list2.get(i2)));
        }
        return com.github.catvod.spider.merge.K.f.p(arrayList, JsonParser.parseString((String)com.github.catvod.spider.merge.f0.d.k(this.c)));
    }

    public String homeVideoContent() {
        ArrayList<h> arrayList = new ArrayList<h>();
        Iterator<d> iterator = f.b(com.github.catvod.spider.merge.f0.d.l(r.c(new StringBuilder(), this.a, "/api/slide/list?pos_id=88"), this.a(), null)).a().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().l(this.b));
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    public void init(Context stringArray, String charSequence) {
        this.c = charSequence;
        stringArray = ((JsonObject)new Gson().fromJson(com.github.catvod.spider.merge.f0.d.k("https://dns.alidns.com/resolve?name=swrdsfeiujo25sw.cc&type=TXT"), JsonObject.class)).getAsJsonArray("Answer");
        stringArray = stringArray.get(0).getAsJsonObject().get("data").getAsString().replace("\"", "").split(",");
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a = com.github.catvod.spider.merge.B.e.c("https://wangerniu.", stringArray[i2]);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append("/api/v2/settings/resourceDomainConfig");
            charSequence = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)charSequence).toString());
            if (((String)charSequence).isEmpty()) continue;
            this.b = ((JsonObject)com.github.catvod.spider.merge.G1.d.a((String)charSequence, JsonObject.class)).getAsJsonObject("data").get("imgDomain").getAsString();
            break;
        }
    }

    public String playerContent(String object, String string, List<String> list) {
        object = new com.github.catvod.spider.merge.K.f();
        ((com.github.catvod.spider.merge.K.f)object).w(string);
        ((com.github.catvod.spider.merge.K.f)object).g(this.a());
        return ((com.github.catvod.spider.merge.K.f)object).toString();
    }

    public String searchContent(String object, String string) {
        ArrayList<h> arrayList = new ArrayList<h>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(String.format("/api/v2/search/videoV2?key=%s&category_id=88&page=%s&pageSize=20", URLEncoder.encode((String)object), string));
        object = ((g)com.github.catvod.spider.merge.G1.d.a(com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), this.a(), null), g.class)).a().iterator();
        while (object.hasNext()) {
            arrayList.add(((g)object.next()).b(this.b));
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

