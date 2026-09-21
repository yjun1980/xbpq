/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PTT
extends Spider {
    private String a = "https://ptt.red/";
    private String b;

    private Map<String, String> a() {
        return c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7");
    }

    public String categoryContent(String object4, String object2, boolean bl, HashMap<String, String> cloneable) {
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append(this.a);
        ((StringBuilder)object3).append("p/");
        ((StringBuilder)object3).append((String)object4);
        object3 = Uri.parse((String)((StringBuilder)object3).toString()).buildUpon();
        if (!TextUtils.isEmpty((CharSequence)((HashMap)cloneable).get("c"))) {
            object4 = com.github.catvod.spider.merge.C.a.c("c/");
            ((StringBuilder)object4).append((String)((HashMap)cloneable).get("c"));
            object3.appendEncodedPath(((StringBuilder)object4).toString());
        }
        if (!TextUtils.isEmpty((CharSequence)((HashMap)cloneable).get("area"))) {
            object3.appendQueryParameter("area_id", ((HashMap)cloneable).get("area"));
        }
        if (!TextUtils.isEmpty((CharSequence)((HashMap)cloneable).get("year"))) {
            object3.appendQueryParameter("year", ((HashMap)cloneable).get("year"));
        }
        if (!TextUtils.isEmpty((CharSequence)((HashMap)cloneable).get("sort"))) {
            object3.appendQueryParameter("sort", ((HashMap)cloneable).get("sort"));
        }
        object3.appendQueryParameter("page", (String)object2);
        object4 = d.l(com.github.catvod.spider.merge.f0.d.l(object3.toString(), this.a(), null));
        object2 = new ArrayList();
        for (Object object4 : ((m)object4).m0("div.card > div.embed-responsive")) {
            cloneable = (m)((AbstractList)((m)object4).m0("a")).get(0);
            Object object5 = (m)((AbstractList)((m)cloneable).m0("img")).get(0);
            String string = ((m)((AbstractList)((m)object4).m0("span.badge.badge-success")).get(0)).s0();
            if (((s)object5).c("src").startsWith("http")) {
                object4 = ((s)object5).c("src");
            } else {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(this.a);
                ((StringBuilder)object4).append(((s)object5).c("src"));
                object4 = ((StringBuilder)object4).toString();
            }
            if (TextUtils.isEmpty((CharSequence)(object5 = ((s)object5).c("alt")))) continue;
            ((ArrayList)object2).add(new h(((s)cloneable).c("href").substring(3), (String)object5, (String)object4, string));
        }
        return f.o((List<h>)object2);
    }

    public String detailContent(List<String> object) {
        Cloneable cloneable2;
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append(this.a);
        com.github.catvod.spider.merge.e1.h h2 = d.l(com.github.catvod.spider.merge.f0.d.l(r.c((StringBuilder)serializable, object.get(0), "/1"), this.a(), null));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        serializable = new ArrayList();
        for (Cloneable cloneable2 : h2.m0("ul#w1 > li > a")) {
            ((AbstractMap)linkedHashMap).put(((s)cloneable2).c("href").split("/")[3], ((s)cloneable2).c("title"));
        }
        cloneable2 = h2.m0("div > a.seq.border");
        for (Object object2 : linkedHashMap.keySet()) {
            ArrayList<String> arrayList = new ArrayList<String>();
            Object object3 = ((AbstractCollection)((Object)cloneable2)).iterator();
            while (object3.hasNext()) {
                m m2 = (m)object3.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(m2.s0());
                stringBuilder.append("$");
                stringBuilder.append((String)object.get(0));
                stringBuilder.append("/");
                stringBuilder.append(m2.c("href").split("/")[2]);
                stringBuilder.append("/");
                stringBuilder.append((String)object2);
                arrayList.add(stringBuilder.toString());
            }
            if (arrayList.isEmpty()) {
                object3 = com.github.catvod.spider.merge.C.a.c("1$");
                ((StringBuilder)object3).append((String)object.get(0));
                ((StringBuilder)object3).append("/1/");
                ((StringBuilder)object3).append((String)object2);
                arrayList.add(((StringBuilder)object3).toString());
            }
            ((ArrayList)serializable).add(TextUtils.join((CharSequence)"#", arrayList));
        }
        object = new h();
        ((h)object).o(TextUtils.join((CharSequence)"$$$", linkedHashMap.values()));
        ((h)object).p(TextUtils.join((CharSequence)"$$$", (Iterable)((Object)serializable)));
        return f.n((h)object);
    }

    public String homeContent(boolean bl) {
        Object object = d.l(com.github.catvod.spider.merge.f0.d.l(this.a, this.a(), null));
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        for (m m2 : ((m)object).m0("li > a.px-2.px-sm-3.py-2.nav-link")) {
            arrayList.add(new com.github.catvod.spider.merge.K.a(m2.c("href").replace("/p/", ""), m2.s0()));
        }
        object = TextUtils.isEmpty((CharSequence)this.b) ? "{}" : com.github.catvod.spider.merge.f0.d.k(this.b);
        return f.p(arrayList, j.d((String)object));
    }

    public void init(Context context, String string) {
        this.b = string;
    }

    public String playerContent(String object, String object2, List<String> object3) {
        object = Pattern.compile("contentUrl\":\"(.*?)\"");
        object3 = new StringBuilder();
        ((StringBuilder)object3).append(this.a);
        ((StringBuilder)object3).append((String)object2);
        object = ((Pattern)object).matcher(com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object3).toString()));
        if (((Matcher)object).find()) {
            object2 = new f();
            ((f)object2).w(((Matcher)object).group(1).replace("\\", ""));
            return ((f)object2).toString();
        }
        return f.d("");
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    public String searchContent(String object4, boolean bl, String object2) {
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append(this.a);
        ((StringBuilder)object3).append(String.format("q/%s?page=%s", object4, object2));
        object4 = d.l(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object3).toString(), this.a(), null));
        object2 = new ArrayList();
        for (Object object4 : ((m)object4).m0("div.card > div.embed-responsive")) {
            object3 = (m)((AbstractList)((m)object4).m0("a")).get(0);
            Object object5 = (m)((AbstractList)((m)object3).m0("img")).get(0);
            String string = ((m)((AbstractList)((m)object4).m0("span.badge.badge-success")).get(0)).s0();
            if (((s)object5).c("src").startsWith("http")) {
                object4 = ((s)object5).c("src");
            } else {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(this.a);
                ((StringBuilder)object4).append(((s)object5).c("src"));
                object4 = ((StringBuilder)object4).toString();
            }
            if (TextUtils.isEmpty((CharSequence)(object5 = ((s)object5).c("alt")))) continue;
            ((ArrayList)object2).add(new h(((s)object3).c("href").substring(3), (String)object5, (String)object4, string));
        }
        return f.o((List<h>)object2);
    }
}

