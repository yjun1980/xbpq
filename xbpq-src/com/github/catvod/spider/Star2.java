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
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.i0.g;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Star2
extends NetPan {
    private static String n = "";
    public String m = "https://1.star2.cn/";

    private String o(String string) {
        if (n.isEmpty()) {
            try {
                Serializable serializable = new HashMap();
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
                com.github.catvod.spider.merge.f0.d.n(this.m, hashMap, serializable);
                n = com.github.catvod.spider.merge.i0.m.C(serializable, "");
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Star2 fetchCookie: ");
                ((StringBuilder)serializable).append(n);
                SpiderDebug.log((String)((StringBuilder)serializable).toString());
            }
            catch (Exception exception) {
                com.github.catvod.spider.merge.I.s.b("Star2 fetchCookie error: ", exception);
            }
        }
        return com.github.catvod.spider.merge.f0.d.l(string, this.getHeader(), null);
    }

    private List<h> p(String string, com.github.catvod.spider.merge.g1.g object) {
        ArrayList<h> arrayList = new ArrayList<h>();
        Iterator iterator = ((AbstractCollection)object).iterator();
        while (iterator.hasNext()) {
            Object object2 = ((com.github.catvod.spider.merge.e1.m)iterator.next()).n0("a[href]");
            if (((s)object2).c("href").startsWith("https")) continue;
            object = com.github.catvod.spider.merge.R0.e.b(string) ? ((s)object2).c("title").replaceAll("\u3016\u7f6e\u9876\u3017", "") : string;
            h h2 = new h();
            h2.r("file");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((s)object2).c("href"));
            stringBuilder.append("#");
            stringBuilder.append((String)object);
            h2.l(stringBuilder.toString());
            h2.m((String)object);
            try {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(Proxy.getUrl());
                ((StringBuilder)object2).append("?do=tmdb&title=");
                ((StringBuilder)object2).append(URLEncoder.encode((String)object, "UTF-8"));
                ((StringBuilder)object2).append("&default=");
                ((StringBuilder)object2).append(URLEncoder.encode("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "UTF-8"));
                object = ((StringBuilder)object2).toString();
            }
            catch (Exception exception) {
                object = "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png";
            }
            h2.n((String)object);
            arrayList.add(h2);
        }
        return arrayList;
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> hashMap) {
        object2 = ((com.github.catvod.spider.merge.e1.m)((AbstractList)com.github.catvod.spider.merge.c1.d.l(this.o(this.m)).m0(".ranking-box")).get(Integer.parseInt((String)object))).m0("li");
        object = new f();
        ((f)object).y(this.p("", (com.github.catvod.spider.merge.g1.g)object2));
        ((f)object).k(1, 1, 0, 1);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        int n2 = 0;
        object = object.get(0).split("#");
        Object object2 = object[0];
        object = ((String[])object).length > 1 ? object[1] : "";
        Object object3 = com.github.catvod.spider.merge.c1.d.l(this.o(r.c(new StringBuilder(), this.m, (String)object2))).m0("a.dlipp-dl-btn.j-wbdlbtn-dlipp");
        if (((AbstractCollection)object3).isEmpty()) {
            return null;
        }
        if ((com.github.catvod.spider.merge.e1.m)((AbstractList)object3).get(0) == null) {
            return null;
        }
        h h2 = new h();
        h2.l((String)object2);
        h2.m((String)object);
        if (!((String)object).isEmpty()) {
            object2 = com.github.catvod.spider.merge.i0.g.b().d((String)object, "", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
            h2.n(object2.optString("poster", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png"));
            h2.j(object2.optString("overview", ""));
        } else {
            h2.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
        }
        object2 = new ArrayList();
        object3 = ((AbstractCollection)object3).iterator();
        while (true) {
            if (!object3.hasNext()) break;
            ((ArrayList)object2).add(((com.github.catvod.spider.merge.e1.m)object3.next()).c("href"));
        }
        for (int i2 = n2; i2 < ((ArrayList)object2).size(); ++i2) {
            ((ArrayList)object2).set(i2, ((String)((ArrayList)object2).get(i2)).trim());
        }
        NetPan.initOrder((List)object2);
        h2.o(super.detailContentVodPlayFrom((List)object2));
        h2.p(super.detailContentVodPlayUrl((String)object, (List)object2));
        return com.github.catvod.spider.merge.K.f.n(h2);
    }

    public HashMap<String, String> getHeader() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        hashMap.put("Referer", this.m);
        if (!n.isEmpty()) {
            hashMap.put("Cookie", n);
        }
        return hashMap;
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        com.github.catvod.spider.merge.g1.g g2 = com.github.catvod.spider.merge.c1.d.l(this.o(this.m)).m0(".tab-item");
        for (int i2 = 0; i2 < ((AbstractCollection)g2).size(); ++i2) {
            arrayList.add(new a(String.valueOf(i2), ((com.github.catvod.spider.merge.e1.m)((AbstractList)g2).get(i2)).s0(), "0"));
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        this.m = JsonParser.parseString((String)string).getAsJsonObject().get("siteUrl").getAsString();
    }

    public String searchContent(String string, boolean bl) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.m);
            stringBuilder.append("/search/?keyword=");
            stringBuilder.append(URLEncoder.encode(string));
            string = com.github.catvod.spider.merge.K.f.o(this.p(string, com.github.catvod.spider.merge.c1.d.l(this.o(stringBuilder.toString())).m0("li.item")));
            return string;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("star2 searchContent error", exception);
            return "";
        }
    }
}

