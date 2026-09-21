/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ikanbot
extends NetPan {
    private static String n = "https://v.aikanbot.com";
    private static final String o = r.c(new StringBuilder(), n, "/hot");
    private static final String p = r.c(new StringBuilder(), n, "/play/");
    private static final String q = r.c(new StringBuilder(), n, "/search?q=");
    private JsonObject m;

    private HashMap<String, String> o() {
        return r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
    }

    private String p(String string) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("@Referer=https://api.douban.com/@User-Agent=");
            stringBuilder.append("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            string = stringBuilder.toString();
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public String categoryContent(String arrayList, String string, boolean bl, HashMap<String, String> object) {
        object = r.c(new StringBuilder(), o, (String)((Object)arrayList));
        arrayList = object;
        if (!"1".equals(string)) {
            arrayList = com.github.catvod.spider.merge.I.s.a((String)object, "-p-", string);
        }
        object = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(((String)((Object)arrayList)).concat(".html"), this.o(), null));
        arrayList = new ArrayList<h>();
        for (Object object2 : ((m)object).m0("a.item")) {
            object = ((m)object2).m0("img").a("data-src");
            String string2 = ((s)object2).c("href");
            object2 = ((m)object2).m0("img").a("alt");
            arrayList.add(new h(string2.split("/")[2], (String)object2, this.p((String)object)));
        }
        int n2 = Integer.parseInt(string);
        object = new f();
        ((f)object).y(arrayList);
        ((f)object).k(Integer.parseInt(string), Integer.parseInt(string) + 1, 24, (n2 + 1) * 24);
        return ((f)object).toString();
    }

    public String detailContent(List<String> list) {
        Object object = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(p.concat(list.get(0)), this.o(), null));
        String string = ((m)object).m0("h1").j();
        String string2 = ((m)object).m0("meta[property=og:image]").a("content");
        Object object2 = ((m)object).m0("div.detail > h3");
        String string3 = ((m)((AbstractList)object2).get(1)).s0();
        String string4 = ((m)((AbstractList)object2).get(2)).s0();
        String string5 = ((m)((AbstractList)object2).get(3)).s0();
        CharSequence charSequence = ((m)object).m0("input#current_id").a("value");
        object2 = ((m)object).m0("input#e_token").a("value");
        object = ((m)object).m0("input#mtype").a("value");
        charSequence = this.get_tks((String)charSequence, (String)object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n);
        ((StringBuilder)object2).append("/api/getResN?videoId=");
        O0.a((StringBuilder)object2, list.get(0), "&mtype=", (String)object, " &token=");
        ((StringBuilder)object2).append((String)charSequence);
        Iterator iterator = ((JsonObject)com.github.catvod.spider.merge.G1.d.a(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.o(), null), JsonObject.class)).getAsJsonObject("data").getAsJsonArray("list").iterator();
        charSequence = "";
        object = "";
        while (iterator.hasNext()) {
            String string6;
            object2 = (JsonElement)iterator.next();
            object2 = Pattern.compile("\\\"flag\\\":\\\"(.*?)\\\",\\\"url\\\":\\\"(.*?)\\\"").matcher(String.valueOf(object2.getAsJsonObject().get("resData")).replace("\\", ""));
            if (((Matcher)object2).find()) {
                string6 = ((Matcher)object2).group(1);
                object2 = ((Matcher)object2).group(2);
            } else {
                string6 = "";
                object2 = "";
            }
            boolean bl = "".equals(charSequence);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append((String)charSequence);
            if (!bl) {
                charSequence2.append("$$$");
            }
            charSequence2.append(string6);
            charSequence2 = charSequence2.toString();
            if (!"".equals(object)) {
                charSequence = r.d((String)object, "$$$");
                object = new StringBuilder();
            } else {
                charSequence = com.github.catvod.spider.merge.C.a.c((String)object);
                object = new StringBuilder();
            }
            ((StringBuilder)object).append("$");
            ((StringBuilder)object).append(string6);
            ((StringBuilder)charSequence).append(((String)object2).replace(((StringBuilder)object).toString(), ""));
            object = ((StringBuilder)charSequence).toString();
            charSequence = charSequence2;
        }
        object2 = new h();
        ((h)object2).l(list.get(0));
        ((h)object2).n(this.p(string2));
        ((h)object2).s(string3);
        ((h)object2).h(string5);
        ((h)object2).i(string4);
        ((h)object2).m(string);
        ((h)object2).o((String)charSequence);
        ((h)object2).p(((String)object).replace("##", "#").replace("#$$$", "$$$"));
        return com.github.catvod.spider.merge.K.f.n((h)object2);
    }

    public String get_tks(String charSequence, String string) {
        String[] stringArray = System.out;
        String string2 = com.github.catvod.spider.merge.B.e.c("current_id ", (String)charSequence);
        int n2 = 0;
        stringArray.printf(string2, new Object[0]);
        System.out.printf(com.github.catvod.spider.merge.B.e.c("e_token ", string), new Object[0]);
        if (!"".equals(charSequence) && !"".equals(string)) {
            stringArray = new String[4];
            int n3 = ((String)charSequence).length();
            charSequence = ((String)charSequence).substring(n3 - 4, n3);
            for (n3 = 0; n3 < ((String)charSequence).length(); ++n3) {
                int n4 = Character.getNumericValue(((String)charSequence).charAt(n3)) % 3 + 1;
                int n5 = n4 + 8;
                stringArray[n3] = string.substring(n4, n5);
                string = string.substring(n5);
            }
            charSequence = new StringBuilder();
            for (n3 = n2; n3 < 4; ++n3) {
                ((StringBuilder)charSequence).append(stringArray[n3]);
            }
            return ((StringBuilder)charSequence).toString();
        }
        return "";
    }

    public String homeContent(boolean bl) {
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        for (int i2 = 0; i2 < 4; ++i2) {
            arrayList.add(new com.github.catvod.spider.merge.K.a((new String[]{"/index-movie-\u70ed\u95e8", "/index-tv-\u70ed\u95e8", "/index-tv-\u56fd\u4ea7\u5267", "/index-tv-\u97e9\u5267"})[i2], (new String[]{"\u70ed\u95e8\u7535\u5f71", "\u70ed\u95e8\u5267\u96c6", "\u56fd\u4ea7\u5267", "\u97e9\u5267"})[i2]));
        }
        com.github.catvod.spider.merge.e1.h h2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(r.c(new StringBuilder(), n, "/billboard.html"), this.o(), null));
        ArrayList<h> arrayList2 = new ArrayList<h>();
        for (Object object : h2.m0("div.item-root")) {
            String string = ((m)object).m0("img").a("data-src");
            Object object2 = ((m)object).m0("a").a("href");
            object = ((m)object).m0("img").a("alt");
            try {
                String string2 = ((String)object2).split("/")[2];
                object2 = new h(string2, (String)object, this.p(string));
                arrayList2.add((h)object2);
            }
            catch (Exception exception) {}
        }
        return com.github.catvod.spider.merge.K.f.r(arrayList, arrayList2);
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        context = JsonParser.parseString((String)string).getAsJsonObject();
        this.m = context;
        if (context.has("siteUrl")) {
            n = this.m.get("siteUrl").getAsString();
        }
    }

    public String playerContent(String object, String string, List<String> list) {
        object = new f();
        ((f)object).w(string);
        ((f)object).g(this.o());
        return ((f)object).toString();
    }

    public String searchContent(String object, boolean bl) {
        com.github.catvod.spider.merge.e1.h h2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(q.concat(URLEncoder.encode((String)object)), this.o(), null));
        object = new ArrayList();
        for (Object object2 : h2.m0("a.cover-link")) {
            String string = ((m)object2).m0("img").a("data-src");
            String string2 = ((s)object2).c("href");
            object2 = ((m)object2).m0("img").a("alt");
            ((ArrayList)object).add(new h(string2.split("/")[2], (String)object2, this.p(string)));
        }
        return com.github.catvod.spider.merge.K.f.o((List<h>)object);
    }
}

