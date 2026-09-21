/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Bili$Loader;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.O.c;
import com.github.catvod.spider.merge.O.g;
import com.github.catvod.spider.merge.O.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.k0.e;
import com.github.catvod.utils.server.Server;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

public class Bili
extends NetPan {
    private Map<String, String> m;
    private JsonObject n;

    public static Bili get() {
        return Bili$Loader.a;
    }

    /*
     * WARNING - void declaration
     */
    private void o(com.github.catvod.spider.merge.O.a object2, StringBuilder stringBuilder, String string) {
        for (c c2 : ((com.github.catvod.spider.merge.O.a)object2).d()) {
            void var2_4;
            void var3_5;
            if (!c2.g().equals(var3_5)) continue;
            var2_4.append(this.s(c2));
        }
    }

    private String p(c c2, String string) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(c2.g());
        charSequence.append("_");
        charSequence.append(c2.c());
        charSequence = charSequence.toString();
        String string2 = c2.h().split("/")[0];
        String string3 = c2.b().replace("&", "&amp;");
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", string2, charSequence, c2.a(), c2.d(), c2.h(), string, c2.k(), string3, c2.j().a(), c2.j().b());
    }

    private String q(String charSequence2, String object, HashMap<String, String> object2) {
        block21: {
            Objects.requireNonNull(charSequence2);
            ((String)charSequence2).hashCode();
            int n2 = -1;
            switch (((String)charSequence2).hashCode()) {
                default: {
                    break;
                }
                case 553399840: {
                    if (!((String)charSequence2).equals("carRank")) break;
                    n2 = 5;
                    break;
                }
                case 79902693: {
                    if (!((String)charSequence2).equals("kejiRank")) break;
                    n2 = 4;
                    break;
                }
                case 3496413: {
                    if (!((String)charSequence2).equals("recm")) break;
                    n2 = 3;
                    break;
                }
                case 3492908: {
                    if (!((String)charSequence2).equals("rank")) break;
                    n2 = 2;
                    break;
                }
                case 103501: {
                    if (!((String)charSequence2).equals("hot")) break;
                    n2 = 1;
                    break;
                }
                case 103314: {
                    if (!((String)charSequence2).equals("his")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    String string = charSequence2;
                    if (object2 != null) {
                        string = charSequence2;
                        if (!TextUtils.isEmpty((CharSequence)((CharSequence)((HashMap)object2).get("tid")))) {
                            string = (String)((HashMap)object2).get("tid");
                        }
                    }
                    LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
                    ((AbstractMap)linkedHashMap).put("search_type", "video");
                    ((AbstractMap)linkedHashMap).put("keyword", string);
                    ((AbstractMap)linkedHashMap).put("page", object);
                    if (object2 != null) {
                        for (CharSequence charSequence2 : ((HashMap)object2).keySet()) {
                            string = (String)((HashMap)object2).get(charSequence2);
                            if (TextUtils.isEmpty((CharSequence)string) || ((String)charSequence2).equals("tid") || ((String)charSequence2).equals("search_type")) continue;
                            ((AbstractMap)linkedHashMap).put((String)charSequence2, string);
                        }
                    }
                    if (M.j().h == null) {
                        M.j().m();
                    }
                    charSequence2 = com.github.catvod.spider.merge.C.a.c("https://api.bilibili.com/x/web-interface/wbi/search/type?");
                    object = M.j().h.a(linkedHashMap);
                    break block21;
                }
                case 5: {
                    return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=223&type=all";
                }
                case 4: {
                    return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=188&type=all";
                }
                case 3: {
                    return "https://api.bilibili.com/x/web-interface/wbi/index/top/feed/rcmd?ps=20";
                }
                case 2: {
                    return "https://api.bilibili.com/x/web-interface/ranking/v2?rid=0&type=all";
                }
                case 1: {
                    charSequence2 = new StringBuilder();
                    object2 = "https://api.bilibili.com/x/web-interface/popular?ps=20&pn=";
                    break;
                }
                case 0: {
                    charSequence2 = new StringBuilder();
                    object2 = "https://api.bilibili.com/x/v2/history?ps=20&pn=";
                }
            }
            ((StringBuilder)charSequence2).append((String)object2);
        }
        ((StringBuilder)charSequence2).append((String)object);
        return ((StringBuilder)charSequence2).toString();
    }

    private Map<String, String> r(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (com.github.catvod.spider.merge.R0.e.d(string)) {
            hashMap.put("cookie", string);
        }
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        hashMap.put("Referer", "https://www.bilibili.com");
        return hashMap;
    }

    private String s(c c2) {
        block4: {
            String string;
            block3: {
                block2: {
                    if (!c2.h().startsWith("video")) break block2;
                    string = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", c2.f(), c2.l(), c2.e(), c2.i());
                    break block3;
                }
                if (!c2.h().startsWith("audio")) break block4;
                string = String.format("numChannels='2' sampleRate='%s'", ((HashMap)this.m).get(c2.g()));
            }
            return this.p(c2, string);
        }
        return "";
    }

    private Map<String, String> t() {
        return M.j().r();
    }

    private void u(String string, String object, JSONArray jSONArray) {
        Object object2 = new JSONObject((String)object).optJSONObject("data");
        if (object2 == null && !string.equals("his")) {
            return;
        }
        if (string.equals("his")) {
            object = new JSONObject((String)object).optJSONArray("data");
        } else {
            object = string.equals("recm") ? "item" : (!(string.endsWith("Rank") || string.equals("rank") || string.equals("hot")) ? "result" : "list");
            object = object2.optJSONArray((String)object);
        }
        if (object == null) {
            return;
        }
        String string2 = object;
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            JSONObject jSONObject = string2.getJSONObject(i2);
            object2 = jSONObject.optString("pic");
            if (((String)object2).isEmpty()) {
                object = null;
            } else {
                long l2;
                object = object2;
                if (((String)object2).startsWith("//")) {
                    object = com.github.catvod.spider.merge.B.e.c("https:", (String)object2);
                }
                Object object3 = jSONObject.optString("bvid");
                object2 = !(string.equals("his") || string.equals("hot") || string.contains("Rank") || string.equals("rank")) ? "id" : "aid";
                Object object4 = jSONObject.optString((String)object2);
                JSONObject jSONObject2 = new JSONObject();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append("@");
                ((StringBuilder)object2).append((String)object4);
                jSONObject2.put("vod_id", (Object)((StringBuilder)object2).toString());
                jSONObject2.put("vod_name", (Object)com.github.catvod.spider.merge.c1.d.l(jSONObject.optString("title")).s0());
                jSONObject2.put("vod_pic", object);
                object2 = jSONObject.optString("duration");
                if (((String)object2).contains(":")) {
                    object = ((String)object2).split(":");
                    int n2 = ((String[])object).length == 2 ? Integer.parseInt(object[0]) : (((String[])object).length == 3 ? Integer.parseInt(object[0]) * 60 + Integer.parseInt((String)object[1]) : 0);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(n2);
                    ((StringBuilder)object).append("\u5206\u949f");
                    object2 = ((StringBuilder)object).toString();
                } else {
                    try {
                        object4 = new BigDecimal((String)object2);
                        object = new StringBuilder();
                        object3 = new BigDecimal("60");
                        ((StringBuilder)object).append(((BigDecimal)object4).divide((BigDecimal)object3, RoundingMode.HALF_UP).toString());
                        ((StringBuilder)object).append("\u5206\u949f");
                        object2 = object = ((StringBuilder)object).toString();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                long l3 = l2 = jSONObject.optLong("pubdate");
                if (l2 <= 0L) {
                    l3 = jSONObject.optLong("pub_time");
                }
                l2 = l3;
                if (l3 <= 0L) {
                    l2 = jSONObject.optLong("ctime");
                }
                l3 = l2;
                if (l2 <= 0L) {
                    l3 = jSONObject.optLong("senddate");
                }
                l2 = l3;
                if (l3 <= 0L) {
                    l2 = jSONObject.optLong("view_at");
                }
                if (l2 > 0L) {
                    l3 = l2;
                    if (l2 < 10000000000L) {
                        l3 = l2 * 1000L;
                    }
                    object = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(l3));
                } else {
                    object = object3 = jSONObject.optString("pubdate");
                    if (((String)object3).isEmpty()) {
                        object = jSONObject.optString("pub_time");
                    }
                    object3 = object;
                    if (((String)object).isEmpty()) {
                        object3 = jSONObject.optString("ctime");
                    }
                    object = !((String)object3).isEmpty() && (((String)object3).contains("-") || ((String)object3).contains("/")) ? ((String)object3).split(" ")[0].trim() : "";
                }
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    object3 = object;
                    if (!TextUtils.isEmpty((CharSequence)object2)) {
                        object3 = s.a((String)object2, " ", (String)object);
                    }
                    jSONObject2.put("vod_remarks", object3);
                } else {
                    jSONObject2.put("vod_remarks", object2);
                }
                object = jSONObject2;
            }
            if (object == null) continue;
            jSONArray.put(object);
        }
    }

    private void v(String string, String charSequence, JSONArray jSONArray) {
        block6: {
            block3: {
                block5: {
                    block4: {
                        block2: {
                            if (!"1".equals(charSequence) || !string.equals("recm")) break block2;
                            string = new JSONObject();
                            charSequence = com.github.catvod.spider.merge.C.a.c("recmCol");
                            ((StringBuilder)charSequence).append(UUID.randomUUID());
                            ((StringBuilder)charSequence).append("@");
                            ((StringBuilder)charSequence).append("recmCol");
                            ((StringBuilder)charSequence).append(UUID.randomUUID());
                            string.put("vod_id", (Object)((StringBuilder)charSequence).toString());
                            charSequence = "\u63a8\u8350\u5408\u96c6";
                            break block3;
                        }
                        if (!"1".equals(charSequence) || !string.equals("hot")) break block4;
                        string = new JSONObject();
                        charSequence = com.github.catvod.spider.merge.C.a.c("hotCol");
                        ((StringBuilder)charSequence).append(UUID.randomUUID());
                        ((StringBuilder)charSequence).append("@");
                        ((StringBuilder)charSequence).append("hotCol");
                        ((StringBuilder)charSequence).append(UUID.randomUUID());
                        string.put("vod_id", (Object)((StringBuilder)charSequence).toString());
                        charSequence = "\u70ed\u95e8\u5408\u96c6";
                        break block3;
                    }
                    if (!"1".equals(charSequence) || !string.equals("rank")) break block5;
                    string = new JSONObject();
                    charSequence = com.github.catvod.spider.merge.C.a.c("rankCol");
                    ((StringBuilder)charSequence).append(UUID.randomUUID());
                    ((StringBuilder)charSequence).append("@");
                    ((StringBuilder)charSequence).append("rankCol");
                    ((StringBuilder)charSequence).append(UUID.randomUUID());
                    string.put("vod_id", (Object)((StringBuilder)charSequence).toString());
                    charSequence = "\u6392\u884c\u699c\u5408\u96c6";
                    break block3;
                }
                if (!"1".equals(charSequence) || !string.equals("his")) break block6;
                string = new JSONObject();
                charSequence = com.github.catvod.spider.merge.C.a.c("hisCol");
                ((StringBuilder)charSequence).append(UUID.randomUUID());
                ((StringBuilder)charSequence).append("@");
                ((StringBuilder)charSequence).append("hisCol");
                ((StringBuilder)charSequence).append(UUID.randomUUID());
                string.put("vod_id", (Object)((StringBuilder)charSequence).toString());
                charSequence = "\u5386\u53f2\u5408\u96c6";
            }
            string.put("vod_name", (Object)charSequence);
            string.put("vod_pic", (Object)"https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            jSONArray.put((Object)string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> object) {
        try {
            String string3 = this.q(string, string2, (HashMap<String, String>)object);
            bl = string.equals("hot");
            object = !(bl || string.equals("recm") || string.equals("his")) ? this.r("") : this.t();
            string3 = com.github.catvod.spider.merge.k0.e.d(string3, (Map<String, String>)object);
            if (string.equals("recm") && ((HashMap)M.j().i).get("recmCol") == null) {
                ((HashMap)M.j().i).put("recmCol", string3);
            }
            object = new JSONArray();
            this.v(string, string2, (JSONArray)object);
            this.u(string, string3, (JSONArray)object);
            int n2 = Integer.parseInt(string2);
            string = new JSONObject();
            string.put("page", n2);
            int n3 = n2;
            if (object.length() >= 19) {
                n3 = n2 + 1;
            }
            string.put("pagecount", n3);
            string.put("limit", 19);
            string.put("total", Integer.MAX_VALUE);
            string.put("list", object);
            return string.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }

    public void checkLogin() {
        M.j().g();
    }

    public String detailContent(List<String> object) {
        int n2;
        if (!M.j().e) {
            M.j().g();
        }
        Object object2 = object.get(0).split("@");
        Serializable serializable = object2[0];
        Object object3 = object2[1];
        boolean bl = ((String)((Object)serializable)).startsWith("recmCol");
        Object object4 = "https:";
        Object object5 = "//";
        object2 = "pic";
        Object object6 = "$";
        Object object7 = "title";
        if (bl) {
            SpiderDebug.log((String)"RECM_HEJI start");
            com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h();
            h2.n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            h2.m("\u63a8\u8350\u5408\u96c6");
            h2.g("\u63a8\u8350");
            serializable = new LinkedHashMap();
            object3 = new ArrayList();
            object = (String)((HashMap)M.j().i).get("recmCol");
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                object = com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/wbi/index/top/feed/rcmd?ps=20", this.t());
                ((HashMap)M.j().i).put("recmCol", (String)object);
            }
            object6 = new JSONObject((String)object).getJSONObject("data").getJSONArray("item");
            object = object5;
            object2 = object4;
            for (int i2 = 0; i2 < object6.length(); ++i2) {
                object5 = object6.getJSONObject(i2);
                Object object8 = new JSONObject();
                object7 = object5.getString("pic");
                object4 = object7;
                if (((String)object7).startsWith((String)object)) {
                    object4 = com.github.catvod.spider.merge.B.e.c((String)object2, (String)object7);
                }
                object7 = object5.getString("id");
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object4)) continue;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(object5.getString("bvid"));
                ((StringBuilder)object4).append("@");
                ((StringBuilder)object4).append((String)object7);
                object8.put("vod_id", (Object)((StringBuilder)object4).toString());
                object4 = object5.getString("title");
                object8.put("vod_name", (Object)com.github.catvod.spider.merge.c1.d.l((String)object4).s0());
                object8 = new StringBuilder();
                ((StringBuilder)object8).append((String)object4);
                ((StringBuilder)object8).append("$");
                ((StringBuilder)object8).append((String)object7);
                ((StringBuilder)object8).append("+");
                ((StringBuilder)object8).append(object5.getString("cid"));
                ((ArrayList)object3).add(((StringBuilder)object8).toString());
            }
            serializable.put("B\u7ad9", TextUtils.join((CharSequence)"#", (Iterable)object3));
            serializable.put("B\u7ad9\u666e\u753b", TextUtils.join((CharSequence)"#", (Iterable)object3));
            h2.o(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)serializable).keySet()));
            h2.p(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)serializable).values()));
            return com.github.catvod.spider.merge.K.f.n(h2);
        }
        Object object9 = "//";
        object5 = "B\u7ad9";
        bl = ((String)((Object)serializable)).startsWith("hotCol");
        object4 = "aid";
        if (bl) {
            SpiderDebug.log((String)"HOT_HEJI start");
            object7 = new com.github.catvod.spider.merge.K.h();
            ((com.github.catvod.spider.merge.K.h)object7).n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            ((com.github.catvod.spider.merge.K.h)object7).m("\u70ed\u95e8\u5408\u96c6");
            ((com.github.catvod.spider.merge.K.h)object7).g("\u70ed\u95e8");
            serializable = new LinkedHashMap();
            object5 = new ArrayList();
            object2 = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/popular?ps=20&pn=", this.t())).getJSONObject("data").getJSONArray("list");
            object6 = object9;
            object = object4;
            for (int i4 = 0; i4 < object2.length(); ++i4) {
                object9 = object2.getJSONObject(i4);
                object3 = new JSONObject();
                object4 = object9.getString("pic");
                if (((String)object4).startsWith((String)object6)) {
                    object4 = com.github.catvod.spider.merge.B.e.c("https:", (String)object4);
                }
                String string = object9.getString((String)object);
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object4)) continue;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(object9.getString("bvid"));
                ((StringBuilder)object4).append("@");
                ((StringBuilder)object4).append(string);
                object3.put("vod_id", (Object)((StringBuilder)object4).toString());
                object4 = object9.getString("title");
                object3.put("vod_name", (Object)com.github.catvod.spider.merge.c1.d.l((String)object4).s0());
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append("$");
                ((StringBuilder)object3).append(string);
                ((StringBuilder)object3).append("+");
                ((StringBuilder)object3).append(object9.getString("cid"));
                ((ArrayList)object5).add(((StringBuilder)object3).toString());
            }
            serializable.put("B\u7ad9", TextUtils.join((CharSequence)"#", (Iterable)object5));
            serializable.put("B\u7ad9\u666e\u753b", TextUtils.join((CharSequence)"#", (Iterable)object5));
            ((com.github.catvod.spider.merge.K.h)object7).o(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)serializable).keySet()));
            ((com.github.catvod.spider.merge.K.h)object7).p(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)serializable).values()));
            return com.github.catvod.spider.merge.K.f.n((com.github.catvod.spider.merge.K.h)object7);
        }
        object4 = "aid";
        if (((String)((Object)serializable)).startsWith("rankCol")) {
            SpiderDebug.log((String)"RANK_HEJI start");
            serializable = new com.github.catvod.spider.merge.K.h();
            ((com.github.catvod.spider.merge.K.h)((Object)serializable)).n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            ((com.github.catvod.spider.merge.K.h)((Object)serializable)).m("\u6392\u884c\u699c\u5408\u96c6");
            ((com.github.catvod.spider.merge.K.h)((Object)serializable)).g("\u6392\u884c\u699c");
            object5 = new LinkedHashMap();
            object9 = new ArrayList();
            object6 = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/web-interface/ranking/v2?rid=0&type=all", this.t())).getJSONObject("data").getJSONArray("list");
            object = object2;
            object2 = object6;
            for (int i5 = 0; i5 < object2.length(); ++i5) {
                object3 = object2.getJSONObject(i5);
                Object object10 = new JSONObject();
                object6 = object7 = object3.getString((String)object);
                if (((String)object7).startsWith("//")) {
                    object6 = com.github.catvod.spider.merge.B.e.c("https:", (String)object7);
                }
                object7 = object3.getString((String)object4);
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object6)) continue;
                object6 = new StringBuilder();
                ((StringBuilder)object6).append(object3.getString("bvid"));
                ((StringBuilder)object6).append("@");
                ((StringBuilder)object6).append((String)object7);
                object10.put("vod_id", (Object)((StringBuilder)object6).toString());
                object6 = object3.getString("title");
                object10.put("vod_name", (Object)com.github.catvod.spider.merge.c1.d.l((String)object6).s0());
                object10 = new StringBuilder();
                ((StringBuilder)object10).append((String)object6);
                ((StringBuilder)object10).append("$");
                ((StringBuilder)object10).append((String)object7);
                ((StringBuilder)object10).append("+");
                ((StringBuilder)object10).append(object3.getString("cid"));
                ((ArrayList)object9).add(((StringBuilder)object10).toString());
            }
            object5.put("B\u7ad9", TextUtils.join((CharSequence)"#", (Iterable)object9));
            object5.put("B\u7ad9\u666e\u753b", TextUtils.join((CharSequence)"#", (Iterable)object9));
            ((com.github.catvod.spider.merge.K.h)((Object)serializable)).o(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object5).keySet()));
            ((com.github.catvod.spider.merge.K.h)((Object)serializable)).p(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object5).values()));
            return com.github.catvod.spider.merge.K.f.n((com.github.catvod.spider.merge.K.h)((Object)serializable));
        }
        object2 = "pic";
        if (((String)((Object)serializable)).startsWith("hisCol")) {
            SpiderDebug.log((String)"HIS_HEJI start");
            object3 = new com.github.catvod.spider.merge.K.h();
            ((com.github.catvod.spider.merge.K.h)object3).n("https://ts1.cn.mm.bing.net/th/id/R-C.1aada2475d9851291fc5bef3879ea8ce?rik=9H3yELyeynR2wA&riu=http%3a%2f%2fpic.3h3.com%2fup%2f2015-12%2f2015121227270835514629.jpg&ehk=Sg1VqYsgoeYzuAnVMRjm6zYCrBGLYM8CQn5%2fwJPtbg0%3d&risl=&pid=ImgRaw&r=0");
            ((com.github.catvod.spider.merge.K.h)object3).m("\u5386\u53f2\u5408\u96c6");
            ((com.github.catvod.spider.merge.K.h)object3).g("\u5386\u53f2");
            object6 = new LinkedHashMap();
            serializable = new ArrayList();
            object7 = new JSONObject(com.github.catvod.spider.merge.k0.e.d("https://api.bilibili.com/x/v2/history?ps=20&pn=", this.t())).getJSONArray("data");
            object = object2;
            object2 = object6;
            object6 = object5;
            for (int i6 = 0; i6 < object7.length(); ++i6) {
                JSONObject jSONObject = object7.getJSONObject(i6);
                Object object11 = new JSONObject();
                object5 = object9 = jSONObject.getString((String)object);
                if (((String)object9).startsWith("//")) {
                    object5 = com.github.catvod.spider.merge.B.e.c("https:", (String)object9);
                }
                object9 = jSONObject.getString((String)object4);
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object5)) continue;
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(jSONObject.getString("bvid"));
                ((StringBuilder)object5).append("@");
                ((StringBuilder)object5).append((String)object9);
                object11.put("vod_id", (Object)((StringBuilder)object5).toString());
                object5 = jSONObject.getString("title");
                object11.put("vod_name", (Object)com.github.catvod.spider.merge.c1.d.l((String)object5).s0());
                object11 = new StringBuilder();
                ((StringBuilder)object11).append((String)object5);
                ((StringBuilder)object11).append("$");
                ((StringBuilder)object11).append((String)object9);
                ((StringBuilder)object11).append("+");
                ((StringBuilder)object11).append(jSONObject.getString("cid"));
                ((ArrayList)serializable).add(((StringBuilder)object11).toString());
            }
            object2.put(object6, TextUtils.join((CharSequence)"#", (Iterable)((Object)serializable)));
            object2.put("B\u7ad9\u666e\u753b", TextUtils.join((CharSequence)"#", (Iterable)((Object)serializable)));
            ((com.github.catvod.spider.merge.K.h)object3).o(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object2).keySet()));
            ((com.github.catvod.spider.merge.K.h)object3).p(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object2).values()));
            return com.github.catvod.spider.merge.K.f.n((com.github.catvod.spider.merge.K.h)object3);
        }
        object9 = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.B.e.c("https://api.bilibili.com/x/web-interface/view?aid=", (String)object3), this.t(), null)).a();
        object2 = new com.github.catvod.spider.merge.K.h();
        ((com.github.catvod.spider.merge.K.h)object2).l((String)object.get(0));
        ((com.github.catvod.spider.merge.K.h)object2).n(((b)object9).g());
        ((com.github.catvod.spider.merge.K.h)object2).m(((b)object9).i());
        ((com.github.catvod.spider.merge.K.h)object2).g(((b)object9).j());
        ((com.github.catvod.spider.merge.K.h)object2).j(((b)object9).b());
        object = new StringBuilder();
        ((StringBuilder)object).append(((b)object9).c() / 60L);
        ((StringBuilder)object).append("\u5206\u9418");
        ((com.github.catvod.spider.merge.K.h)object2).q(((StringBuilder)object).toString());
        object5 = new LinkedHashMap();
        ArrayList<String> arrayList = new ArrayList<String>();
        object4 = ((b)object9).f().iterator();
        object = object2;
        object2 = object4;
        while (object2.hasNext()) {
            com.github.catvod.spider.merge.O.e e2 = (com.github.catvod.spider.merge.O.e)object2.next();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(e2.b());
            ((StringBuilder)object4).append("$");
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append("+");
            ((StringBuilder)object4).append(e2.a());
            arrayList.add(((StringBuilder)object4).toString());
        }
        object5.put("B\u7ad9", TextUtils.join((CharSequence)"#", arrayList));
        object5.put("B\u7ad9\u666e\u753b", TextUtils.join((CharSequence)"#", arrayList));
        object4 = new ArrayList();
        object2 = M.j();
        object3 = ((b)object9).e().a();
        Objects.requireNonNull(object2);
        object9 = new LinkedHashMap();
        ((AbstractMap)object9).put("mid", object3);
        object3 = com.github.catvod.spider.merge.C.a.c("https://api.bilibili.com/x/space/wbi/arc/search?");
        ((StringBuilder)object3).append(((M)object2).g.a((LinkedHashMap<String, Object>)object9));
        object2 = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object3).toString(), ((M)object2).r(), null);
        SpiderDebug.log((String)object2);
        object9 = new JSONObject((String)object2).getJSONObject("data").getJSONObject("list").getJSONArray("vlist");
        object2 = object7;
        for (n2 = 0; n2 < object9.length(); ++n2) {
            object7 = object9.getJSONObject(n2);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(object7.getString((String)object2));
            ((StringBuilder)object3).append((String)object6);
            ((StringBuilder)object3).append(object7.optLong("aid"));
            ((StringBuilder)object3).append("+");
            ((StringBuilder)object3).append(object7.getString("bvid"));
            ((ArrayList)object4).add(((StringBuilder)object3).toString());
        }
        object5.put("Up\u4e3b\u89c6\u9891", TextUtils.join((CharSequence)"#", object4));
        object5.put("Up\u4e3b\u89c6\u9891\u666e\u753b", TextUtils.join((CharSequence)"#", object4));
        object4 = new StringBuilder();
        ((StringBuilder)object4).append("https://api.bilibili.com/x/web-interface/archive/related?bvid=");
        ((StringBuilder)object4).append((String)((Object)serializable));
        object7 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object4).toString(), this.t(), null)).optJSONArray("data");
        object9 = new ArrayList();
        for (n2 = 0; n2 < object7.length(); ++n2) {
            object4 = object7.getJSONObject(n2);
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(object4.getString((String)object2));
            ((StringBuilder)serializable).append((String)object6);
            ((StringBuilder)serializable).append(object4.optLong("aid"));
            ((StringBuilder)serializable).append("+");
            ((StringBuilder)serializable).append(object4.optLong("cid"));
            ((ArrayList)object9).add(((StringBuilder)serializable).toString());
        }
        object5.put("\u76f8\u5173\u63a8\u8350", TextUtils.join((CharSequence)"#", (Iterable)object9));
        object5.put("\u76f8\u5173\u63a8\u8350\u666e\u753b", TextUtils.join((CharSequence)"#", (Iterable)object9));
        ((com.github.catvod.spider.merge.K.h)object).o(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object5).keySet()));
        ((com.github.catvod.spider.merge.K.h)object).p(TextUtils.join((CharSequence)"$$$", ((LinkedHashMap)object5).values()));
        return com.github.catvod.spider.merge.K.f.n((com.github.catvod.spider.merge.K.h)object);
    }

    public String getBiliJct(String string) {
        int n2 = string.indexOf("bili_jct=");
        if (n2 != -1) {
            int n3;
            int n4 = n3 = string.indexOf(";", n2);
            if (n3 == -1) {
                n4 = string.length();
            }
            string = string.substring(n2 + 9, n4);
            com.github.catvod.spider.merge.B.e.d("bili_jct value: ", string);
            return string;
        }
        SpiderDebug.log((String)"bili_jct not found in the cookie string.");
        return "";
    }

    public String getBiliMpd(String object, String charSequence, String string) {
        object = com.github.catvod.spider.merge.O.h.b(new JSONObject(com.github.catvod.spider.merge.f0.d.l(r.b("https://api.bilibili.com/x/player/playurl?avid=", (String)object, "&cid=", (String)charSequence, "&qn=127&fnval=4048&fourk=1"), this.t(), null)).toString()).a().a();
        StringBuilder stringBuilder = new StringBuilder();
        charSequence = new StringBuilder();
        for (c c2 : ((com.github.catvod.spider.merge.O.a)object).a()) {
            for (String string2 : ((HashMap)this.m).keySet()) {
                if (!c2.g().equals(string2)) continue;
                ((StringBuilder)charSequence).append(this.s(c2));
            }
        }
        this.o((com.github.catvod.spider.merge.O.a)object, stringBuilder, string);
        boolean bl = stringBuilder.length() == 0 && ((com.github.catvod.spider.merge.O.a)object).d().size() > 0;
        if (bl) {
            this.o((com.github.catvod.spider.merge.O.a)object, stringBuilder, ((com.github.catvod.spider.merge.O.a)object).d().get(0).g());
        }
        string = stringBuilder.toString();
        charSequence = ((StringBuilder)charSequence).toString();
        object = String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", ((com.github.catvod.spider.merge.O.a)object).b(), ((com.github.catvod.spider.merge.O.a)object).c(), ((com.github.catvod.spider.merge.O.a)object).b(), string, charSequence);
        com.github.catvod.spider.merge.B.e.d("mpd", (String)object);
        return object;
    }

    public String homeContent(boolean bl) {
        if (this.n.has("json")) {
            return com.github.catvod.spider.merge.f0.d.k(this.n.get("json").getAsString());
        }
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>> linkedHashMap = new LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>>();
        for (String string : this.n.get("type").getAsString().split("#")) {
            arrayList.add(new com.github.catvod.spider.merge.K.a(string, string));
            ArrayList<com.github.catvod.spider.merge.K.c> arrayList2 = new ArrayList<com.github.catvod.spider.merge.K.c>();
            arrayList2.add(new com.github.catvod.spider.merge.K.c("order", "\u6392\u5e8f", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", "totalrank"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u9ede\u64ca", "click"), new com.github.catvod.spider.merge.K.b("\u6700\u65b0\u767c\u5e03", "pubdate"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u5f48\u5e55", "dm"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u6536\u85cf", "stow"))));
            arrayList2.add(new com.github.catvod.spider.merge.K.c("duration", "\u6642\u9577", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u5168\u90e8\u6642\u9577", "0"), new com.github.catvod.spider.merge.K.b("60\u5206\u9418\u4ee5\u4e0a", "4"), new com.github.catvod.spider.merge.K.b("30~60\u5206\u9418", "3"), new com.github.catvod.spider.merge.K.b("10~30\u5206\u9418", "2"), new com.github.catvod.spider.merge.K.b("10\u5206\u9418\u4ee5\u4e0b", "1"))));
            ((AbstractMap)linkedHashMap).put(string, arrayList2);
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        Object object = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.l("https://api.bilibili.com/x/web-interface/popular?ps=20", this.r("buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc"), null));
        ArrayList<com.github.catvod.spider.merge.K.h> arrayList = new ArrayList<com.github.catvod.spider.merge.K.h>();
        object = com.github.catvod.spider.merge.O.g.a(((h)object).a().d()).iterator();
        while (object.hasNext()) {
            arrayList.add(((g)object.next()).c());
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    @Override
    public void init(Context object, String string) {
        M m2;
        block6: {
            block4: {
                block5: {
                    super.init((Context)object, string);
                    this.n = JsonParser.parseString((String)string).getAsJsonObject();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("extend:");
                    ((StringBuilder)object).append(string);
                    SpiderDebug.log((String)((StringBuilder)object).toString());
                    m2 = M.j();
                    JsonObject jsonObject = this.n;
                    Objects.requireNonNull(m2);
                    object = com.github.catvod.spider.merge.c.b.d(com.github.catvod.spider.merge.c.b.e("bilibili_user"));
                    if (!TextUtils.isEmpty((CharSequence)object)) break block4;
                    if (jsonObject == null || !jsonObject.has("cookie")) break block5;
                    m2.d = object = jsonObject.get("cookie").getAsString();
                    if (((String)object).startsWith("http")) {
                        m2.d = com.github.catvod.spider.merge.f0.d.k(m2.d).trim();
                    }
                    if (!TextUtils.isEmpty((CharSequence)m2.d)) break block6;
                }
                object = "buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc";
            }
            m2.d = object;
        }
        object = com.github.catvod.spider.merge.C.a.c("BiliApi >>cookie");
        ((StringBuilder)object).append(m2.d);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = new StringBuilder();
        ((StringBuilder)object).append("extend: jieshu");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        this.m = object = new HashMap();
        ((HashMap)object).put("30280", "192000");
        ((HashMap)this.m).put("30232", "132000");
        ((HashMap)this.m).put("30216", "64000");
    }

    public void insertHis(String string) {
        String string2 = (String)((HashMap)M.j().r()).get("cookie");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
        String string3 = this.getBiliJct(string2);
        MediaType mediaType = MediaType.parse((String)"application/x-www-form-urlencoded");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aid=");
        stringBuilder.append(string);
        stringBuilder.append("&played_time=318&csrf=");
        stringBuilder.append(string3);
        string = RequestBody.create((MediaType)mediaType, (String)stringBuilder.toString());
        okHttpClient.newCall(new Request.Builder().url("https://api.bilibili.com/x/click-interface/web/heartbeat").method("POST", (RequestBody)string).addHeader("cookie", string2).addHeader("Content-Type", "application/x-www-form-urlencoded").build()).execute().close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String object, String object2, List<String> object3) {
        if (BaseApi.isOk("bili")) {
            return "";
        }
        object2 = ((String)object2).split("\\+");
        Object object4 = object2[0];
        Object object5 = object2[1];
        object3 = ((String)object).contains("\u666e\u753b") ? "80" : "127";
        object = object5;
        object2 = object5;
        try {
            if (((String)object5).startsWith("BV")) {
                object2 = object5;
                object2 = object5;
                object2 = object5;
                object = new StringBuilder();
                object2 = object5;
                ((StringBuilder)object).append("https://api.bilibili.com/x/web-interface/view?aid=");
                object2 = object5;
                ((StringBuilder)object).append((String)object4);
                object2 = object5;
                JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object).toString(), this.t(), null));
                object2 = object5;
                object = jSONObject.getJSONObject("data").getString("cid");
            }
            object2 = object;
            this.insertHis((String)object4);
        }
        catch (Exception exception) {
            object = object2;
        }
        object2 = "http://127.0.0.1:9975/api/danmu/?do=danmuku&vodName=https://api.bilibili.com/x/v1/dm/list.so?oid=".concat((String)object);
        object5 = new f();
        ((f)object5).w(Server.x((String)object4, (String)object, (String)object3));
        ((f)object5).b((String)object2);
        ((f)object5).c();
        ((f)object5).g(this.t());
        return ((f)object5).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.categoryContent(string, "1", true, new HashMap<String, String>());
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.categoryContent(string, string2, true, new HashMap<String, String>());
    }
}

