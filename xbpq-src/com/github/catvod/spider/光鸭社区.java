/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.g0.J;
import com.github.catvod.spider.merge.i0.g;
import com.github.catvod.spider.merge.y.z;
import com.github.catvod.spider.\u5149\u9e2d\u793e\u533a$PlayLink;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class \u5149\u9e2d\u793e\u533a
extends NetPan {
    public static final int x = 0;
    private String m = "https://gy.lubao2.de5.net";
    private String n = "https://houhvngggkkcqcjmzafx.supabase.co";
    private String o = "https://api.tmdb.org";
    private String p = "https://images.tmdb.org/t/p";
    private String q = "2894d9a1baf7812b451de03c801b0281";
    private String r = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImhvdWh2bmdnZ2trY3Fjam16YWZ4Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3Nzc2Mjg2MjgsImV4cCI6MjA5MzIwNDYyOH0.FUUT9ETU-lP5iNqwK3i7nflwGLSBHM1b-qIs9CoVles";
    private String s = "";
    private int t = 40;
    private String u = "https://miaoda-edit-image.cdn.bcebos.com/b74i02x880e9/IMG-b7c60ycpg3r4.png";
    private g v;
    private String w = "id,title,cover_url,year,region,genres,category_id";

    private String o(String string) {
        if (string == null) {
            return "";
        }
        return string.replaceAll("\\s+", " ").replace("#", "\uff03").replace("$", "\uff04").trim();
    }

    private Map<String, String> p() {
        HashMap hashMap = com.github.catvod.spider.merge.I.r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/122 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        hashMap.put("apikey", this.r);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(this.r);
        hashMap.put("Authorization", stringBuilder.toString());
        hashMap.put("Accept", "application/json");
        if (!this.s.isEmpty()) {
            hashMap.put("Cookie", this.s);
        }
        return hashMap;
    }

    private String q(String string, List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            stringBuilder.append(list.get(i2));
            if (i2 >= list.size() - 1) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    private h r(JSONObject object) {
        String string = this.o(object.optString("title", "\u5149\u9e2d\u8d44\u6e90"));
        Object object2 = new ArrayList<String>();
        Object object3 = object.optString("year", "");
        if (!((String)object3).isEmpty() && !((String)object3).equals("null")) {
            ((ArrayList)object2).add(object3);
        }
        if (!((String)(object3 = object.optString("region", ""))).isEmpty() && !((String)object3).equals("null")) {
            ((ArrayList)object2).add((String)object3);
        }
        object2 = object3 = this.q(" ", (List<String>)object2);
        if (((String)object3).isEmpty()) {
            JSONArray jSONArray = object.optJSONArray("genres");
            object2 = object3;
            if (jSONArray != null) {
                object2 = object3;
                if (jSONArray.length() > 0) {
                    object2 = new ArrayList<String>();
                    for (int i2 = 0; i2 < Math.min(2, jSONArray.length()); ++i2) {
                        ((ArrayList)object2).add((String)jSONArray.optString(i2));
                    }
                    object2 = this.q("/", (List<String>)object2);
                }
            }
        }
        object3 = new h();
        ((h)object3).l(object.optString("id", ""));
        ((h)object3).m(string);
        object = object.optString("cover_url", "");
        if (((String)object).isEmpty() || ((String)object).equals("null")) {
            object = this.u;
        }
        ((h)object3).n((String)object);
        ((h)object3).q((String)object2);
        return object3;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private List s(String string) {
        int n2;
        JSONArray jSONArray;
        ArrayList<h> arrayList = new ArrayList<h>();
        try {
            jSONArray = new JSONArray(string);
            n2 = 0;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        while (true) {
            if (n2 < jSONArray.length()) {
                string = jSONArray.getJSONObject(n2);
                if (string.has("id")) {
                    arrayList.add(this.r((JSONObject)string));
                }
                ++n2;
                continue;
            }
            break;
        }
        return arrayList;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String object, String arrayList, boolean bl, HashMap<String, String> arrayList2) {
        int n2;
        int n3;
        int n4;
        int n5;
        block10: {
            int n6;
            block9: {
                n6 = 1;
                n5 = 1;
                try {
                    n4 = Integer.parseInt(arrayList);
                }
                catch (Exception exception) {
                    n4 = 1;
                }
                n3 = (n4 - 1) * this.t;
                bl = ((String)object).startsWith("folder:");
                n2 = 0;
                if (bl) {
                    object = ((String)object).substring(7);
                    arrayList2 = (ArrayList<StringBuilder>)Base64.decode((String)object, (int)8);
                    arrayList = new ArrayList<h>((byte[])arrayList2, "UTF-8");
                    object = arrayList;
                    break block9;
                }
                arrayList = new StringBuilder();
                ((StringBuilder)((Object)arrayList)).append(this.n);
                ((StringBuilder)((Object)arrayList)).append("/rest/v1/resources?select=");
                ((StringBuilder)((Object)arrayList)).append(this.w);
                ((StringBuilder)((Object)arrayList)).append("&status=eq.approved&order=created_at.desc&category_id=eq.");
                ((StringBuilder)((Object)arrayList)).append(URLEncoder.encode((String)object, "UTF-8"));
                ((StringBuilder)((Object)arrayList)).append("&limit=");
                ((StringBuilder)((Object)arrayList)).append(this.t);
                ((StringBuilder)((Object)arrayList)).append("&offset=");
                ((StringBuilder)((Object)arrayList)).append(n3);
                arrayList = this.s(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)((Object)arrayList)).toString(), this.p(), null));
                int n7 = ((ArrayList)arrayList).size();
                n5 = this.t;
                n2 = n7 >= n5 ? 1 : 0;
                n3 = n3 + n7 + n2;
                n2 = n7 >= n5 ? n6 : 0;
                n6 = n2 + n4;
                object = new f();
                n2 = n5;
                n5 = n6;
                break block10;
                catch (Exception exception) {}
            }
            object = new JSONObject((String)object);
            arrayList = object.optString("kw", "");
            object = object.optString("cid", "");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.n);
            stringBuilder.append("/rest/v1/resources?select=");
            stringBuilder.append(this.w);
            stringBuilder.append("&status=eq.approved&title=ilike.");
            arrayList2 = new StringBuilder();
            ((StringBuilder)((Object)arrayList2)).append("*");
            ((StringBuilder)((Object)arrayList2)).append((String)((Object)arrayList));
            ((StringBuilder)((Object)arrayList2)).append("*");
            stringBuilder.append(URLEncoder.encode(((StringBuilder)((Object)arrayList2)).toString(), "UTF-8"));
            stringBuilder.append("&order=created_at.desc&limit=500&offset=0");
            arrayList = new JSONArray(com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), this.p(), null));
            arrayList2 = new ArrayList<StringBuilder>();
            while (n2 < arrayList.length()) {
                stringBuilder = arrayList.getJSONObject(n2);
                if (stringBuilder.optString("category_id").equals(object)) {
                    arrayList2.add(stringBuilder);
                }
                ++n2;
            }
            arrayList = new ArrayList<h>();
            n6 = Math.min(this.t + n3, arrayList2.size());
            for (n2 = n3; n2 < n6; ++n2) {
                arrayList.add(this.r((JSONObject)arrayList2.get(n2)));
            }
            n3 = arrayList2.size();
            n2 = (int)Math.ceil((double)n3 / (double)this.t);
            if (n2 < 1) {
                n2 = n5;
            }
            object = new f();
            n6 = this.t;
            n5 = n2;
            n2 = n6;
        }
        ((f)object).k(n4, n5, n2, n3);
        ((f)object).y(arrayList);
        return ((f)object).toString();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public String detailContent(List<String> var1_1) {
        block30: {
            block28: {
                block32: {
                    block35: {
                        block34: {
                            block33: {
                                block31: {
                                    block29: {
                                        var2_3 = 0;
                                        var14_4 = var1_1.get(0);
                                        if (var14_4.isEmpty() || var14_4.startsWith("folder:")) break block28;
                                        var1_1 = new StringBuilder();
                                        var1_1.append(this.n);
                                        var1_1.append("/rest/v1/resources?select=*&id=eq.");
                                        var4_5 = "UTF-8";
                                        var1_1.append(URLEncoder.encode(var14_4, "UTF-8"));
                                        var1_1.append("&limit=1");
                                        var1_1 = new JSONArray(com.github.catvod.spider.merge.f0.d.l(var1_1.toString(), this.p(), null));
                                        if (var1_1.length() != 0) break block29;
                                        var1_1 = new ArrayList<E>();
                                        break block30;
                                    }
                                    var16_6 = var1_1.getJSONObject(0);
                                    var15_7 = this.o(var16_6.optString("title", "\u5149\u9e2d\u8d44\u6e90"));
                                    var5_8 = var16_6.optString("cover_url", "");
                                    var6_9 = this.o(var16_6.optString("description", ""));
                                    if (var5_8.isEmpty() || var5_8.equals("null") || var6_9.isEmpty()) break block31;
                                    var7_10 = var5_8;
                                    var8_11 = var6_9;
                                    if (!var6_9.equals("null")) break block32;
                                }
                                var9_12 = this.v.d(var16_6.optString("title", ""), var16_6.optString("year", ""), this.u);
                                if (var5_8.isEmpty()) break block33;
                                var1_1 = var5_8;
                                if (!var5_8.equals("null")) break block34;
                            }
                            var1_1 = var9_12.optString("poster", this.u);
                        }
                        if (var6_9.isEmpty()) break block35;
                        var7_10 = var1_1;
                        var8_11 = var6_9;
                        if (!var6_9.equals("null")) break block32;
                    }
                    var8_11 = this.o(var9_12.optString("overview", ""));
                    var7_10 = var1_1;
                }
                var17_13 = new ArrayList<\u5149\u9e2d\u793e\u533a$PlayLink>();
                var1_1 = var16_6.optString("pan_link", "");
                if (!var1_1.isEmpty()) {
                    var17_13.add(new \u5149\u9e2d\u793e\u533a$PlayLink("\u4e3b\u94fe\u63a5", (String)var1_1, var16_6.optString("pan_password", "")));
                }
                var9_12 = var16_6.optJSONArray("backup_links");
                var1_1 = "pwd";
                var6_9 = var4_5;
                var5_8 = var1_1;
                if (var9_12 != null) {
                    while (true) {
                        var6_9 = var4_5;
                        var5_8 = var1_1;
                        if (var2_3 >= var9_12.length()) break;
                        var6_9 = var9_12.get(var2_3);
                        if (var6_9 instanceof JSONObject) {
                            var6_9 = (JSONObject)var6_9;
                            var5_8 = com.github.catvod.spider.merge.C.a.c("\u5907\u7528");
                            var5_8.append(var2_3 + 1);
                            var17_13.add(new \u5149\u9e2d\u793e\u533a$PlayLink(var6_9.optString("name", var5_8.toString()), var6_9.optString("url", var6_9.optString("link", "")), var6_9.optString("password", var6_9.optString((String)var1_1, ""))));
                        } else if (var6_9 instanceof String) {
                            var5_8 = com.github.catvod.spider.merge.C.a.c("\u5907\u7528");
                            var5_8.append(var2_3 + 1);
                            var17_13.add(new \u5149\u9e2d\u793e\u533a$PlayLink(var5_8.toString(), (String)var6_9, ""));
                        }
                        ++var2_3;
                    }
                }
                if (var17_13.isEmpty()) {
                    var17_13.add(new \u5149\u9e2d\u793e\u533a$PlayLink("\u8be6\u60c5\u9875", z.b(new StringBuilder(), this.m, "/resource/", var14_4), ""));
                }
                var18_14 = new ArrayList<Object>();
                for (\u5149\u9e2d\u793e\u533a$PlayLink var19_20 : var17_13) {
                    block38: {
                        block36: {
                            block37: {
                                var13_19 = var19_20.b;
                                if (var13_19.isEmpty()) continue;
                                if (var19_20.c.isEmpty()) break block36;
                                var3_15 = var13_19.contains("guangyapan.com");
                                var12_18 = "&";
                                if (!var3_15) break block37;
                                var10_16 = "code=";
                                var1_1 = var13_19;
                                if (var13_19.contains("code=")) break block38;
                                var11_17 = com.github.catvod.spider.merge.C.a.c(var13_19);
                                var1_1 = var10_16;
                                var4_5 = var11_17;
                                if (!var13_19.contains("?")) ** GOTO lbl-1000
                                var4_5 = var10_16;
                                var1_1 = var11_17;
                                ** GOTO lbl105
                            }
                            var10_16 = "pwd=";
                            var1_1 = var13_19;
                            if (var13_19.contains("pwd=")) break block38;
                            var11_17 = com.github.catvod.spider.merge.C.a.c(var13_19);
                            var1_1 = var10_16;
                            var4_5 = var11_17;
                            ** if (!var13_19.contains((CharSequence)"?")) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var1_1 = var11_17;
                                var4_5 = var10_16;
lbl105:
                                // 2 sources

                                var10_16 = var4_5;
                                var11_17 = var12_18;
                                var4_5 = var1_1;
                                ** GOTO lbl112
                            }
lbl-1000:
                            // 2 sources

                            {
                                var11_17 = "?";
                                var10_16 = var1_1;
                            }
lbl112:
                            // 2 sources

                            var4_5.append((String)var11_17);
                            var4_5.append((String)var10_16);
                            var4_5.append(var19_20.c);
                            var1_1 = var4_5.toString();
                            break block38;
                        }
                        var1_1 = var13_19;
                    }
                    var18_14.add(var1_1);
                }
                NetPan.initOrder(var18_14);
                var1_1 = new ArrayList<E>();
                for (Object var4_5 : var18_14) {
                    if (!NetPan.isNetPan((String)var4_5)) continue;
                    var1_1.add(var4_5);
                }
                var4_5 = new h();
                var4_5.l(var14_4);
                var4_5.m(var15_7);
                var4_5.n((String)var7_10);
                var4_5.s(var16_6.optString("year", ""));
                var4_5.i(var16_6.optString("region", ""));
                var4_5.j((String)var8_11);
                if (!var1_1.isEmpty()) {
                    var4_5.o(super.detailContentVodPlayFrom((List)var1_1));
                    var1_1 = super.detailContentVodPlayUrl(var15_7, (List)var1_1);
                } else {
                    var7_10 = new ArrayList<String>();
                    for (Object var1_1 : var17_13) {
                        if (var1_1.b.isEmpty()) continue;
                        var9_12 = new JSONObject();
                        var9_12.put("url", (Object)var1_1.b);
                        var9_12.put((String)var5_8, (Object)var1_1.c);
                        var10_16 = new StringBuilder();
                        var10_16.append(this.o(var1_1.a));
                        if (var1_1.c.isEmpty()) {
                            var1_1 = "";
                        } else {
                            var11_17 = com.github.catvod.spider.merge.C.a.c(" \u63d0\u53d6\u7801:");
                            var11_17.append(var1_1.c);
                            var1_1 = var11_17.toString();
                        }
                        var10_16.append((String)var1_1);
                        var10_16 = com.github.catvod.spider.merge.I.r.d(var10_16.toString(), "$");
                        var1_1 = var9_12.toString();
                        try {
                            var1_1 = Base64.encodeToString((byte[])var1_1.getBytes((String)var6_9), (int)11).trim();
                        }
                        catch (Exception var1_2) {
                            var1_1 = "";
                        }
                        var10_16.append((String)var1_1);
                        var7_10.add(var10_16.toString());
                    }
                    var4_5.o("\u63a8\u9001");
                    var1_1 = this.q("#", var7_10);
                }
                var4_5.p((String)var1_1);
                return com.github.catvod.spider.merge.K.f.n((h)var4_5);
            }
            var1_1 = new ArrayList<String>();
        }
        return com.github.catvod.spider.merge.K.f.o(var1_1);
    }

    public String homeContent(boolean bl) {
        Object object = new JSONArray(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.n, "/rest/v1/categories?select=id,name&parent_id=is.null&order=sort_order.asc"), this.p(), null));
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        for (int i2 = 0; i2 < object.length(); ++i2) {
            JSONObject jSONObject = object.getJSONObject(i2);
            arrayList.add(new com.github.catvod.spider.merge.K.a(jSONObject.getString("id"), jSONObject.getString("name")));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.n);
        ((StringBuilder)object).append("/rest/v1/resources?select=");
        return com.github.catvod.spider.merge.K.f.r(arrayList, this.s(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.I.r.c((StringBuilder)object, this.w, "&status=eq.approved&order=created_at.desc&limit=30"), this.p(), null)));
    }

    public String homeVideoContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.n);
        stringBuilder.append("/rest/v1/resources?select=");
        return com.github.catvod.spider.merge.K.f.o(this.s(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.I.r.c(stringBuilder, this.w, "&status=eq.approved&order=created_at.desc&limit=30"), this.p(), null)));
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        if (!string.isEmpty()) {
            try {
                context = new JSONObject(string);
                this.s = context.optString("cookie", this.s);
                this.t = context.optInt("page_size", 40);
                this.q = context.optString("tmdb_key", this.q);
                this.o = context.optString("tmdb_api", this.o);
                this.p = context.optString("tmdb_img", this.p);
                this.u = context.optString("default_pic", this.u);
                this.m = context.optString("siteUrl", this.m);
            }
            catch (Exception exception) {
                this.s = string;
            }
        }
        this.v = new g(this.o, this.p, this.q);
    }

    public boolean isVideoFormat(String string) {
        return Pattern.compile("\\.(m3u8|mp4|mkv|flv|avi|mov)(\\?|$)", 2).matcher(string).find();
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String object, String object2, List<String> object3) {
        if (!(((String)object).contains("\u539f\u756b") || ((String)object).contains("\u666e\u756b") || ((String)object).contains("\u4ee3\u7406") || ((String)object).contains("\u79d2\u4f20") || ((String)object).contains("\u8fc5\u96f7\u76d8"))) {
            try {
                object3 = Base64.decode((String)object2, (int)8);
                object = new String((byte[])object3, "UTF-8");
            }
            catch (Exception exception) {
                object = object2;
            }
            try {
                object3 = new JSONObject((String)object);
                object2 = object = object3.optString("url", (String)object2);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (((String)object2).isEmpty()) {
                object = new f();
                ((f)object).m(1);
                ((f)object).w("");
                return ((f)object).toString();
            }
            if (this.isVideoFormat((String)object2)) {
                object = com.github.catvod.spider.merge.I.r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/122 Safari/537.36");
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(this.m);
                ((StringBuilder)object3).append("/");
                ((HashMap)object).put("Referer", ((StringBuilder)object3).toString());
                object3 = new f();
                ((f)object3).m(0);
                ((f)object3).w((String)object2);
                ((f)object3).g((Map<String, String>)object);
                return ((f)object3).toString();
            }
            object = object2;
            if (((String)object2).startsWith("http")) {
                object = com.github.catvod.spider.merge.B.e.c("push://", (String)object2);
            }
            object2 = new f();
            ((f)object2).m(0);
            ((f)object2).w((String)object);
            return ((f)object2).toString();
        }
        return super.playerContent((String)object, (String)object2, (List)object3);
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String object, boolean bl, String object2) {
        Object object3;
        Object object4;
        Object object5;
        int n2;
        int n3;
        int n4 = 1;
        try {
            n3 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n3 = 1;
        }
        object2 = new JSONArray(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.n, "/rest/v1/categories?select=id,name&parent_id=is.null&order=sort_order.asc"), this.p(), null));
        HashMap<String, String> hashMap = new HashMap<String, String>();
        int n5 = 0;
        for (n2 = 0; n2 < object2.length(); ++n2) {
            object5 = object2.getJSONObject(n2);
            hashMap.put(object5.getString("id"), object5.getString("name"));
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.n);
        ((StringBuilder)object2).append("/rest/v1/resources?select=");
        ((StringBuilder)object2).append(this.w);
        ((StringBuilder)object2).append("&status=eq.approved&title=ilike.");
        object5 = new StringBuilder();
        ((StringBuilder)object5).append("*");
        ((StringBuilder)object5).append((String)object);
        ((StringBuilder)object5).append("*");
        ((StringBuilder)object2).append(URLEncoder.encode(((StringBuilder)object5).toString(), "UTF-8"));
        ((StringBuilder)object2).append("&order=created_at.desc&limit=500&offset=0");
        JSONArray jSONArray = new JSONArray(com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.p(), null));
        Object object6 = new LinkedHashMap();
        for (n2 = n5; n2 < jSONArray.length(); ++n2) {
            object4 = jSONArray.getJSONObject(n2);
            object3 = "other";
            object5 = object4.optString("category_id", "other");
            object2 = object3;
            if (!((String)object5).isEmpty()) {
                object2 = ((String)object5).equals("null") ? object3 : object5;
            }
            if (!object6.containsKey(object2)) {
                object6.put(object2, new ArrayList());
            }
            ((List)((LinkedHashMap)object6).get(object2)).add(object4);
        }
        if (n3 != 1 || object6.size() <= 1) {
            n5 = this.t;
            n2 = (n3 - 1) * n5;
            n5 = Math.min(n5 + n2, jSONArray.length());
            object = new ArrayList<h>();
            while (n2 < n5) {
                ((ArrayList)object).add(this.r(jSONArray.getJSONObject(n2)));
                ++n2;
            }
            n5 = jSONArray.length();
            n2 = (int)Math.ceil((double)n5 / (double)this.t);
            if (n2 < 1) {
                n2 = n4;
            }
            object2 = new f();
            ((f)object2).k(n3, n2, this.t, n5);
            ((f)object2).y((List<h>)object);
            return ((f)object2).toString();
        }
        object2 = new ArrayList(((LinkedHashMap)object6).entrySet());
        Collections.sort(object2, J.a);
        object4 = new ArrayList();
        Iterator iterator = ((ArrayList)object2).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                object = new f();
                ((f)object).k(1, 1, this.t, jSONArray.length());
                ((f)object).y((List<h>)object4);
                return ((f)object).toString();
            }
            object2 = iterator.next();
            CharSequence charSequence = (String)object2.getKey();
            List list = (List)object2.getValue();
            object5 = hashMap.containsKey(charSequence) ? (String)hashMap.get(charSequence) : "\u5176\u4ed6";
            Iterator iterator2 = list.iterator();
            object6 = "";
            object2 = "";
            while (iterator2.hasNext()) {
                object2 = object3 = ((JSONObject)iterator2.next()).optString("cover_url", "");
                if (((String)object3).isEmpty()) continue;
                object2 = object3;
                break;
            }
            n3 = list.size();
            object3 = new JSONObject();
            try {
                object3.put("kw", object);
                object3.put("cid", (Object)charSequence);
                object3.put("name", object5);
            }
            catch (Exception exception) {}
            charSequence = com.github.catvod.spider.merge.C.a.c("folder:");
            object3 = object3.toString();
            try {
                object3 = Base64.encodeToString((byte[])((String)object3).getBytes("UTF-8"), (int)11).trim();
            }
            catch (Exception exception) {
                object3 = object6;
            }
            ((StringBuilder)charSequence).append((String)object3);
            object6 = ((StringBuilder)charSequence).toString();
            object3 = new h();
            ((h)object3).l((String)object6);
            object6 = new StringBuilder();
            ((StringBuilder)object6).append("\ud83d\udcc1 ");
            ((StringBuilder)object6).append((String)object5);
            ((StringBuilder)object6).append("  ");
            ((StringBuilder)object6).append(n3);
            ((StringBuilder)object6).append("\u6761");
            ((h)object3).m(((StringBuilder)object6).toString());
            object5 = object2;
            if (((String)object2).isEmpty()) {
                object5 = this.u;
            }
            ((h)object3).n((String)object5);
            ((h)object3).q("\u70b9\u51fb\u67e5\u770b");
            ((h)object3).r("folder");
            ((ArrayList)object4).add(object3);
        }
    }
}

