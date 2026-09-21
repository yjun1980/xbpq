/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourKZN
extends NetPan {
    private static String n = "https://4kzn.com";
    private JsonObject m;

    private Map<String, String> o() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        return hashMap;
    }

    private String p(String object, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":\\s*(.*?)(?=\\s*(\u5bfc\u6f14|\u4e3b\u6f14|\u7c7b\u578b|\u5236\u7247|\u8bed\u8a00|\u4e0a\u6620|\u7247\u957f|\u53c8\u540d|IMDb|$))");
        object = Pattern.compile(stringBuilder.toString()).matcher((CharSequence)object);
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1).trim().replace("/", ",");
        }
        return "";
    }

    public String categoryContent(String arrayList, String string, boolean bl, HashMap<String, String> object2) {
        if (!((String)(object2 = ((HashMap)object2).containsKey("type") ? ((HashMap)object2).get("type") : arrayList)).isEmpty()) {
            arrayList = object2;
        }
        object2 = new StringBuilder();
        O0.a((StringBuilder)object2, n, "/books/", (String)((Object)arrayList), "/page/");
        ((StringBuilder)object2).append(string);
        object2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.o(), null));
        arrayList = new ArrayList<h>();
        for (Object object2 : ((m)object2).m0(".posts-row .posts-item")) {
            arrayList.add(new h(((m)object2).m0("a.item-image").a("href"), ((m)object2).m0(".item-title").j().trim(), ((m)object2).m0(".lazy").a("data-src"), ((m)object2).m0(".text-muted").j().trim()));
        }
        object2 = new f();
        ((f)object2).y(arrayList);
        ((f)object2).k(Integer.parseInt(string), 999, 20, 19980);
        return ((f)object2).toString();
    }

    public String detailContent(List<String> object) {
        Object object2 = object.get(0);
        object = ((String)object2).startsWith("http") ? object2 : r.c(new StringBuilder(), n, (String)object2);
        com.github.catvod.spider.merge.e1.h h2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l((String)object, this.o(), null));
        object = h2.m0(".panel-body p").j();
        h h3 = new h();
        h3.l((String)object2);
        h3.m(h2.m0(".site-name").j().trim());
        h3.n(h2.m0(".lazy").a("data-src"));
        h3.g(this.p((String)object, "\u7c7b\u578b"));
        object2 = this.p((String)object, "\u4e0a\u6620\u65e5\u671f");
        object2 = Pattern.compile("\\d{4}").matcher((CharSequence)object2);
        if (((Matcher)object2).find()) {
            h3.s(((Matcher)object2).group());
        }
        h3.i(this.p((String)object, "\u5236\u7247\u56fd\u5bb6/\u5730\u533a"));
        h3.h(this.p((String)object, "\u4e3b\u6f14"));
        h3.k(this.p((String)object, "\u5bfc\u6f14"));
        int n2 = ((String)object).lastIndexOf("IMDb:");
        object = n2 != -1 ? ((String)object).substring(n2 + 5).trim() : ((String)object).trim();
        h3.j((String)object);
        object2 = h2.m0(".site-go a");
        object = new ArrayList<String>();
        object2 = ((AbstractCollection)object2).iterator();
        while (object2.hasNext()) {
            ((ArrayList)object).add(((m)object2.next()).c("href"));
        }
        NetPan.initOrder(object);
        h3.o(super.detailContentVodPlayFrom((List)object));
        h3.p(super.detailContentVodPlayUrl(h3.d(), (List)object));
        return com.github.catvod.spider.merge.K.f.n(h3);
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(new a("zuixin", "\u6700\u65b0"));
        arrayList.add(new a("top250", "TOP250"));
        arrayList.add(new a("dianying", "\u7535\u5f71"));
        arrayList.add(new a("juji", "\u5267\u96c6"));
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        ((AbstractMap)linkedHashMap).put("dianying", Arrays.asList(new c("type", "\u7c7b\u578b", Arrays.asList(new b("\u5168\u90e8", ""), new b("\u7535\u5f71", "dianying"), new b("\u559c\u5267", "xiju"), new b("\u7231\u60c5", "aiqing"), new b("\u5267\u60c5", "juqing"), new b("\u60ac\u7591", "xuanyi"), new b("\u4f20\u8bb0", "zhuanji"), new b("\u52a8\u4f5c", "dongzuo"), new b("\u79d1\u5e7b", "kehuan"), new b("\u72af\u7f6a", "fanzui"), new b("\u5947\u5e7b", "qihuan"), new b("\u5192\u9669", "maoxian"), new b("\u5bb6\u5ead", "jiating"), new b("\u8fd0\u52a8", "yundong"), new b("\u6b4c\u821e", "gewu"), new b("\u6218\u4e89", "zhanzheng"), new b("\u60ca\u609a", "jingsong"), new b("\u897f\u90e8", "xibu"), new b("\u52a8\u753b", "donghua"), new b("\u707e\u96be", "zainan"), new b("\u6050\u6016", "kongbu"), new b("\u5386\u53f2", "lishi"), new b("\u97f3\u4e50", "yinyue"), new b("\u540c\u6027", "tongxing"), new b("\u7eaa\u5f55\u7247", "jilupian"), new b("\u53e4\u88c5", "guzhuang"), new b("\u513f\u7ae5", "ertong"), new b("\u6b66\u4fa0", "\u6b66\u4fa0")))));
        ((AbstractMap)linkedHashMap).put("juji", Arrays.asList(new c("type", "\u7c7b\u578b", Arrays.asList(new b("\u5168\u90e8", ""), new b("\u5267\u96c6", "juji"), new b("\u5267\u60c5", "juq"), new b("\u60ca\u609a", "jings"), new b("\u72af\u7f6a", "fanzuii"), new b("\u52a8\u4f5c", "jjdongzuo"), new b("\u5386\u53f2", "jjlishi"), new b("\u6218\u4e89", "jjzhanzheng"), new b("\u5192\u9669", "jjmaoxian"), new b("\u53e4\u88c5", "\u53e4\u88c5"), new b("\u7231\u60c5", "\u7231\u60c5"), new b("\u559c\u5267", "\u559c\u5267"), new b("\u6700\u65b0", "zuixin-juji"), new b("\u79d1\u5e7b", "\u79d1\u5e7b"), new b("\u60ac\u7591", "\u60ac\u7591"), new b("\u5947\u5e7b", "\u5947\u5e7b"), new b("\u5bb6\u5ead", "\u5bb6\u5ead"), new b("\u6050\u6016", "\u6050\u6016"), new b("\u897f\u90e8", "\u897f\u90e8"), new b("\u52a8\u753b", "\u52a8\u753b")))));
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        context = JsonParser.parseString((String)string).getAsJsonObject();
        this.m = context;
        if (context.get("siteUrl") != null) {
            n = this.m.get("siteUrl").getAsString();
        }
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    public String searchContent(String object, boolean bl, String string) {
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(n);
        ((StringBuilder)object2).append("/?post_type=book&s=");
        ((StringBuilder)object2).append(URLEncoder.encode((String)object, "UTF-8"));
        ((StringBuilder)object2).append("&page=");
        ((StringBuilder)object2).append(string);
        object2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.o(), null));
        object = new ArrayList();
        for (m m2 : ((m)object2).m0(".posts-row .posts-item")) {
            ((ArrayList)object).add(new h(m2.m0("a.item-image").a("href"), m2.m0(".item-title").j().trim(), m2.m0(".lazy").a("data-src"), m2.m0(".text-muted").j().trim()));
        }
        object2 = new f();
        ((f)object2).y((List<h>)object);
        ((f)object2).k(Integer.parseInt(string), 999, 20, 19980);
        return ((f)object2).toString();
    }
}

