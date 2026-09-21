/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.PanLian$PageResult;
import com.github.catvod.spider.PanLian$VideoMeta;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.G1.a;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.i0.d;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l0.b;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PanLian
extends NetPan {
    private static final Map<String, String> r;
    private static final Map<String, String> s;
    private static String t;
    private String m = "https://pinglian.lol";
    private String n = "";
    private String o = "";
    private final ConcurrentHashMap<String, PanLian$VideoMeta> p = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, JsonObject> q = new ConcurrentHashMap();

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        r = linkedHashMap;
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<String, String>();
        s = linkedHashMap2;
        linkedHashMap.put("hot_movie", "\u5f71\u7247\u70ed\u641c");
        linkedHashMap.put("hot_series", "\u5267\u96c6\u70ed\u641c");
        linkedHashMap.put("hot_anime", "\u52a8\u6f2b\u70ed\u641c");
        linkedHashMap.put("0", "\u5168\u90e8");
        linkedHashMap.put("1", "\u7535\u5f71");
        linkedHashMap.put("2", "\u7535\u89c6\u5267");
        linkedHashMap.put("3", "\u7efc\u827a");
        linkedHashMap.put("4", "\u52a8\u6f2b");
        linkedHashMap2.put("hot_movie", "/api/get_new_releases.php");
        linkedHashMap2.put("hot_series", "/api/get_series_recommend.php");
        linkedHashMap2.put("hot_anime", "/api/get_anime_recommend.php");
        t = "";
    }

    /*
     * Unable to fully structure code
     */
    private void A() {
        synchronized (this) {
            block15: {
                block16: {
                    block14: {
                        if (TextUtils.isEmpty((CharSequence)PanLian.t) || !(var3_1 = PanLian.t.contains("session_token"))) break block14;
                        return;
                    }
                    if (com.github.catvod.spider.merge.R0.e.b(this.n) || (var3_1 = com.github.catvod.spider.merge.R0.e.b(this.o))) break block15;
                    var4_2 = new HashMap();
                    var5_5 = new StringBuilder();
                    var5_5.append(this.m);
                    var5_5.append("/index.php");
                    com.github.catvod.spider.merge.f0.d.l(var5_5.toString(), this.x(), var4_2);
                    PanLian.t = com.github.catvod.spider.merge.i0.m.C(var4_2, PanLian.t);
                    var4_2 = new HashMap();
                    var4_2.put("username", this.n);
                    var4_2.put("password", this.o);
                    var4_2.put("remember", "on");
                    var6_7 = this.x();
                    var5_5 = new StringBuilder();
                    var5_5.append(this.m);
                    var5_5.append("/index.php");
                    var6_7.put("Referer", var5_5.toString());
                    var6_7.put("Origin", this.m);
                    var6_7.put("X-Requested-With", "XMLHttpRequest");
                    if (!TextUtils.isEmpty((CharSequence)PanLian.t)) {
                        var6_7.put("cookie", PanLian.t);
                    }
                    var5_5 = new HashMap();
                    var7_8 = new StringBuilder();
                    var7_8.append(this.m);
                    var7_8.append("/api/login.php");
                    var4_2 = com.github.catvod.spider.merge.f0.d.g(var7_8.toString(), var4_2, var6_7, (Map<String, List<String>>)var5_5);
                    PanLian.t = com.github.catvod.spider.merge.i0.m.C((Map<String, List<String>>)var5_5, PanLian.t);
                    var3_1 = com.github.catvod.spider.merge.R0.e.d((CharSequence)var4_2);
                    var1_10 = var2_9 = false;
                    if (!var3_1) break block16;
                    var5_5 = JsonParser.parseString((String)var4_2).getAsJsonObject();
                    var1_10 = var2_9;
                    try {
                        if (!var5_5.has("success")) ** GOTO lbl63
                        var3_1 = var5_5.get("success").getAsBoolean();
                        var1_10 = var2_9;
                        if (!var3_1) ** GOTO lbl63
                        var1_10 = true;
                    }
                    catch (Exception var5_6) {
                        var1_10 = var2_9;
                    }
                }
lbl64:
                // 2 sources

                if (var1_10) ** GOTO lbl78
                try {
                    block17: {
                        if (PanLian.t.contains("session_token")) break block17;
                        PanLian.t = "";
                        this.q();
                        var5_5 = new StringBuilder();
                        var5_5.append("PanLian \u767b\u5f55\u5931\u8d25: ");
                        var5_5.append((String)var4_2);
                        var4_2 = var5_5.toString();
lbl75:
                        // 2 sources

                        while (true) {
                            SpiderDebug.log((String)var4_2);
                            ** GOTO lbl94
                            break;
                        }
                    }
                    com.github.catvod.spider.merge.l0.b.m(this.y(), PanLian.t);
                    var4_2 = new StringBuilder();
                    var4_2.append("PanLian \u767b\u5f55\u6210\u529f, cookie has session_token=");
                    var4_2.append(PanLian.t.contains("session_token"));
                    var4_2 = var4_2.toString();
                    ** continue;
                }
                catch (Exception var4_3) {
                    var5_5 = new StringBuilder();
                    var5_5.append("PanLian \u767b\u5f55\u5f02\u5e38: ");
                    var5_5.append(var4_3);
                    SpiderDebug.log((String)var5_5.toString());
lbl94:
                    // 2 sources

                    return;
                }
            }
            SpiderDebug.log((String)"PanLian \u672a\u914d\u7f6e\u8d26\u53f7\u5bc6\u7801\uff0c\u65e0\u6cd5\u767b\u5f55\uff08extend \u53ef\u4f20 username/password\uff09");
            return;
            catch (Throwable var4_4) {
                throw var4_4;
            }
            ** GOTO lbl64
            finally {
            }
        }
    }

    private boolean B(String string) {
        boolean bl = com.github.catvod.spider.merge.R0.e.b(string);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        string = string.toLowerCase(Locale.ROOT);
        bl = bl2;
        if (!string.contains("\u9700\u8981\u767b\u5f55")) {
            bl = bl2;
            if (!string.contains("\u8bf7\u5148\u767b\u5f55")) {
                bl = bl2;
                if (!string.contains("\"code\":-1")) {
                    bl = bl2;
                    if (!string.contains("\u975e\u6cd5\u8bf7\u6c42")) {
                        bl = bl2;
                        if (!string.contains("\u672a\u767b\u5f55")) {
                            bl = bl2;
                            if (!string.contains("unauthorized")) {
                                bl = string.contains("<title>\u9700\u8981\u767b\u5f55") ? bl2 : false;
                            }
                        }
                    }
                }
            }
        }
        return bl;
    }

    private String C(String object) {
        object = ((String)object).split("###", 2);
        String string = object[0];
        int n2 = ((String[])object).length;
        Object object2 = "";
        Object object3 = n2 > 1 ? object[1] : "";
        Object object4 = this.p.get(string);
        object = object3;
        if (object4 != null) {
            object = object3;
            if (TextUtils.isEmpty((CharSequence)object3)) {
                object = ((PanLian$VideoMeta)object4).a;
            }
        }
        object3 = object;
        if (TextUtils.isEmpty((CharSequence)object)) {
            object3 = com.github.catvod.spider.merge.B.e.c("\u89c6\u9891_", string);
        }
        object = object2;
        if (object4 != null) {
            object = ((PanLian$VideoMeta)object4).b;
        }
        JsonObject jsonObject = this.z(string, (String)object3);
        object4 = new ArrayList();
        if (jsonObject != null) {
            Object object5;
            Object object62;
            object2 = new ArrayList();
            for (Object object62 : jsonObject.entrySet()) {
                if (!((JsonElement)object62.getValue()).isJsonObject() || !(object5 = ((JsonElement)object62.getValue()).getAsJsonObject()).has("links") || !object5.get("links").isJsonArray() || object5.getAsJsonArray("links").size() == 0) continue;
                ((ArrayList)object2).add((String)object62.getKey());
            }
            com.github.catvod.spider.merge.l0.b.n((List<String>)object2);
            object62 = ((ArrayList)object2).iterator();
            while (object62.hasNext()) {
                Object object7 = (String)object62.next();
                object5 = jsonObject.getAsJsonObject((String)object7);
                object2 = object5.has("name") ? object5.get("name").getAsString() : com.github.catvod.spider.merge.l0.b.o((String)object7);
                n2 = object5.getAsJsonArray("links").size();
                object5 = new StringBuilder();
                ((StringBuilder)object5).append("links###");
                ((StringBuilder)object5).append(string);
                ((StringBuilder)object5).append("###");
                ((StringBuilder)object5).append((String)object3);
                ((StringBuilder)object5).append("###");
                ((StringBuilder)object5).append((String)object7);
                object5 = ((StringBuilder)object5).toString();
                String string2 = com.github.catvod.spider.merge.l0.b.p((String)object7);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(n2);
                ((StringBuilder)object7).append("\u4e2a\u94fe\u63a5");
                ((ArrayList)object4).add(new h((String)object5, (String)object2, string2, ((StringBuilder)object7).toString(), true));
            }
        }
        if (((ArrayList)object4).isEmpty()) {
            ((ArrayList)object4).add(new h(com.github.catvod.spider.merge.B.e.c("empty###", string), "\u6682\u65e0\u7f51\u76d8\u8d44\u6e90", (String)object, "\u7a7a", false));
        }
        object = new f();
        ((f)object).y((List<h>)object4);
        ((f)object).k(1, 1, ((ArrayList)object4).size(), ((ArrayList)object4).size());
        return ((f)object).toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String D(String var1_1) {
        block34: {
            var4_2 /* !! */  = var1_1.split("###", 3);
            var2_3 = var4_2 /* !! */ .length;
            var13_4 = "";
            var7_5 = var2_3 > 0 ? var4_2 /* !! */ [0] : "";
            var1_1 = var4_2 /* !! */ .length > 1 ? var4_2 /* !! */ [1] : "";
            var5_6 = var4_2 /* !! */ .length > 2 ? var4_2 /* !! */ [2] : "";
            var6_7 = this.p.get(var7_5);
            var4_2 /* !! */  = var1_1;
            if (var6_7 != null) {
                var4_2 /* !! */  = var1_1;
                if (TextUtils.isEmpty((CharSequence)var1_1)) {
                    var4_2 /* !! */  = var6_7.a;
                }
            }
            var8_12 /* !! */  = var4_2 /* !! */ ;
            if (TextUtils.isEmpty((CharSequence)var4_2 /* !! */ )) {
                var8_12 /* !! */  = com.github.catvod.spider.merge.B.e.c("\u89c6\u9891_", var7_5);
            }
            var4_2 /* !! */  = var6_7 != null ? var6_7.b : com.github.catvod.spider.merge.l0.b.p(var5_6);
            var1_1 = this.z(var7_5, (String)var8_12 /* !! */ );
            var6_7 = new ArrayList<E>();
            var12_13 = var4_2 /* !! */ ;
            var11_14 = var6_7;
            if (var1_1 == null) break block34;
            var12_13 = var4_2 /* !! */ ;
            var11_14 = var6_7;
            if (!var1_1.has(var5_6)) break block34;
            var12_13 = var4_2 /* !! */ ;
            var11_14 = var6_7;
            if (!var1_1.get(var5_6).isJsonObject()) break block34;
            var10_15 /* !! */  = var1_1.getAsJsonObject(var5_6);
            var1_1 = var10_15 /* !! */ .has("name") != false ? var10_15 /* !! */ .get("name").getAsString() : com.github.catvod.spider.merge.l0.b.o(var5_6);
            var9_16 = var1_1;
            var1_1 = var10_15 /* !! */ .has("links") != false && var10_15 /* !! */ .get("links").isJsonArray() != false ? var10_15 /* !! */ .getAsJsonArray("links") : new JsonArray();
            var10_15 /* !! */  = var1_1;
            var2_3 = 0;
            var1_1 = var6_7;
            var5_6 = var13_4;
            while (true) {
                block36: {
                    block32: {
                        block29: {
                            block31: {
                                block33: {
                                    block30: {
                                        block35: {
                                            var12_13 = var4_2 /* !! */ ;
                                            var11_14 = var1_1;
                                            if (var2_3 >= var10_15 /* !! */ .size()) break;
                                            if (var10_15 /* !! */ .get(var2_3).isJsonObject()) break block35;
                                            var6_7 = var1_1;
                                            break block36;
                                        }
                                        var14_18 /* !! */  = var10_15 /* !! */ .get(var2_3).getAsJsonObject();
                                        var6_7 = var11_14 = PanLian.p(var14_18 /* !! */ , "title");
                                        if (TextUtils.isEmpty((CharSequence)var11_14)) {
                                            var6_7 = com.github.catvod.spider.merge.C.a.c("\u8d44\u6e90 ");
                                            var6_7.append(var2_3 + 1);
                                            var6_7 = var6_7.toString();
                                        }
                                        var11_14 = com.github.catvod.spider.merge.i0.m.A((String)var6_7);
                                        var6_7 = var12_13 = PanLian.w(PanLian.p(var14_18 /* !! */ , "size"));
                                        if (TextUtils.isEmpty((CharSequence)var12_13)) {
                                            var6_7 = PanLian.w(PanLian.p(var14_18 /* !! */ , "Size"));
                                        }
                                        if (!TextUtils.isEmpty((CharSequence)var6_7)) {
                                            var11_14 = com.github.catvod.spider.merge.G1.a.a("[", (String)var6_7, "] ", (String)var11_14);
                                        }
                                        var12_13 = "?";
                                        var13_4 = com.github.catvod.spider.merge.l0.b.e(new String[]{PanLian.p(var14_18 /* !! */ , "token"), PanLian.p(var14_18 /* !! */ , "url")});
                                        if (TextUtils.isEmpty((CharSequence)var13_4)) break block29;
                                        var6_7 = var13_4.trim();
                                        var3_17 = com.github.catvod.spider.merge.l0.b.f((String)var6_7);
                                        if (var3_17) break block30;
                                        var6_7 = this.getHeader();
                                        var6_7.put("Content-Type", "application/json");
                                        var6_7.put("Origin", this.m);
                                        var15_19 = new StringBuilder();
                                        try {
                                            var15_19.append(this.m);
                                            var15_19.append("/pages/video.php?id=");
                                            var15_19.append(var7_5);
                                            var6_7.put("Referer", var15_19.toString());
                                            var6_7.put("X-Requested-With", "XMLHttpRequest");
                                            if (!TextUtils.isEmpty((CharSequence)PanLian.t)) {
                                                var6_7.put("cookie", PanLian.t);
                                            }
                                            var15_19 = new JsonObject();
                                            var15_19.addProperty("token", (String)var13_4);
                                            var13_4 = new StringBuilder();
                                            var13_4.append(this.m);
                                            var13_4.append("/api/resolve_token.php");
                                            var15_19 = com.github.catvod.spider.merge.f0.d.i(var13_4.toString(), var15_19.toString(), (Map<String, String>)var6_7);
                                            var13_4 = var15_19.a();
                                            if (com.github.catvod.spider.merge.R0.e.d(var13_4)) {
                                                var6_7 = JsonParser.parseString((String)var13_4).getAsJsonObject();
                                                if (var6_7.has("success") && var6_7.get("success").getAsBoolean() && var6_7.has("url")) {
                                                    var6_7 = var6_7.get("url").getAsString().trim();
                                                    break block30;
                                                }
                                                var6_7 = new StringBuilder();
                                                var6_7.append("PanLian resolve_token fail: ");
                                                var6_7.append((String)var13_4);
lbl105:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var6_7 = new StringBuilder();
                                            var6_7.append("PanLian resolve_token empty body code=");
                                            var6_7.append(var15_19.b());
                                            ** continue;
                                            var6_7 = var6_7.toString();
                                            SpiderDebug.log((String)var6_7);
                                            break block29;
                                        }
                                        catch (Exception var6_10) {}
                                        catch (Exception var6_8) {}
                                        break block31;
                                        catch (Exception var6_9) {
                                            break block31;
                                        }
                                    }
                                    var13_4 = com.github.catvod.spider.merge.l0.b.b((String)var6_7);
                                    if (TextUtils.isEmpty((CharSequence)var13_4)) break block29;
                                    var14_18 /* !! */  = PanLian.p(var14_18 /* !! */ , "password");
                                    var6_7 = var13_4;
                                    if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)var14_18 /* !! */ )) break block32;
                                    var6_7 = var13_4;
                                    if (var13_4.contains("pwd=")) break block32;
                                    var6_7 = var13_4;
                                    if (var13_4.contains("password=")) break block32;
                                    var6_7 = var13_4;
                                    if (var13_4.contains("\u63d0\u53d6\u7801")) break block32;
                                    var15_19 = new StringBuilder();
                                    var15_19.append((String)var13_4);
                                    var6_7 = var12_13;
                                    if (!var13_4.contains("?")) break block33;
                                    var6_7 = "&";
                                }
                                var15_19.append((String)var6_7);
                                var15_19.append("pwd=");
                                var15_19.append((String)var14_18 /* !! */ );
                                var6_7 = var15_19.toString();
                                break block32;
                                break block31;
                                catch (Exception var6_11) {}
                            }
                            com.github.catvod.spider.merge.I.s.b("PanLian resolveLink error: ", (Exception)var6_7);
                        }
                        var6_7 = var5_6;
                    }
                    if (!TextUtils.isEmpty((CharSequence)var6_7) && com.github.catvod.spider.merge.l0.b.a((String)var6_7)) {
                        var11_14 = new h(com.github.catvod.spider.merge.I.s.a((String)var6_7, "###", (String)var8_12 /* !! */ ), (String)var11_14, com.github.catvod.spider.merge.l0.b.g((String)var6_7), (String)var9_16, false);
                        var6_7 = var1_1;
                        var6_7.add(var11_14);
                    } else {
                        var12_13 = var1_1;
                        var12_13 = new StringBuilder();
                        var12_13.append("PanLian skip link title=");
                        var12_13.append((String)var11_14);
                        var12_13.append(" url=");
                        var12_13.append((String)var6_7);
                        SpiderDebug.log((String)var12_13.toString());
                    }
                }
                ++var2_3;
            }
        }
        if (var11_14.isEmpty()) {
            var11_14.add(new h(com.github.catvod.spider.merge.B.e.c("empty###", var7_5), "\u6682\u65e0\u94fe\u63a5", (String)var12_13, "\u7a7a", false));
        }
        var1_1 = new f();
        var1_1.y((List<h>)var11_14);
        var1_1.k(1, 1, var11_14.size(), var11_14.size());
        return var1_1.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private JsonObject E(String string, String string2) {
        int n2;
        String string3;
        StringBuilder stringBuilder;
        block7: {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.m);
            stringBuilder.append("/api/search_pan_links.php?keyword=");
            string3 = string2;
            if (string2 != null) break block7;
            string3 = "";
        }
        try {
            stringBuilder.append(URLEncoder.encode(string3, "UTF-8"));
            stringBuilder.append("&vod_id=");
            stringBuilder.append(URLEncoder.encode(string, "UTF-8"));
            stringBuilder.append("&_t=");
            stringBuilder.append(System.currentTimeMillis());
            string = this.t(stringBuilder.toString());
            if (com.github.catvod.spider.merge.R0.e.b(string) || this.B(string) || !(string2 = JsonParser.parseString((String)string).getAsJsonObject()).has("success") || !string2.get("success").getAsBoolean() || !string2.has("data") || string2.get("data").isJsonNull()) return null;
            if (string2.get("data").isJsonObject()) {
                return string2.getAsJsonObject("data");
            }
            if (!string2.get("data").isJsonArray()) return null;
            string = new JsonObject();
            string2 = string2.getAsJsonArray("data");
            n2 = 0;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("PanLian requestPanGroups error: ", exception);
        }
        while (true) {
            if (n2 >= string2.size()) return string;
            if (string2.get(n2).isJsonObject()) {
                string3 = string2.get(n2).getAsJsonObject();
                string.add(com.github.catvod.spider.merge.l0.b.e(PanLian.p((JsonObject)string3, "type"), PanLian.p((JsonObject)string3, "key"), String.valueOf(n2)), (JsonElement)string3);
            }
            ++n2;
            continue;
            break;
        }
        return null;
    }

    private HashMap<String, String> getHeader() {
        HashMap<String, String> hashMap = this.x();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m);
        stringBuilder.append("/all-videos.php");
        hashMap.put("Referer", stringBuilder.toString());
        hashMap.put("X-Requested-With", "XMLHttpRequest");
        if (!TextUtils.isEmpty((CharSequence)t)) {
            hashMap.put("cookie", t);
        }
        return hashMap;
    }

    private void o(PanLian$PageResult panLian$PageResult, JsonObject object) {
        String string = PanLian.p((JsonObject)object, "vod_id");
        String string2 = PanLian.p((JsonObject)object, "local_id");
        string = com.github.catvod.spider.merge.R0.e.d(string) ? string.trim() : (com.github.catvod.spider.merge.R0.e.d(string2) ? string2.trim() : "");
        String string3 = PanLian.p((JsonObject)object, "vod_name");
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string3)) {
            String string4;
            string2 = string4 = PanLian.p((JsonObject)object, "vod_pic");
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                string2 = string4;
                if (!string4.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.m, string4);
                }
            }
            string4 = com.github.catvod.spider.merge.l0.b.e(PanLian.p((JsonObject)object, "vod_remarks"), PanLian.p((JsonObject)object, "vod_year"));
            this.p.put(string, new PanLian$VideoMeta(string3, string2));
            object = PanLian.p((JsonObject)object, "local_id");
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object) && !((String)object).equals(string)) {
                this.p.put((String)object, new PanLian$VideoMeta(string3, string2));
            }
            ((ArrayList)panLian$PageResult.a).add(new h(com.github.catvod.spider.merge.G1.a.a("dir###", string, "###", string3), string3, string2, string4, true));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String p(JsonObject object, String string) {
        block5: {
            if (object == null) return "";
            try {
                void var1_4;
                if (!object.has((String)var1_4)) return "";
                if (object.get((String)var1_4).isJsonNull()) break block5;
                JsonElement jsonElement = object.get((String)var1_4);
                if (!jsonElement.isJsonPrimitive()) return jsonElement.toString();
                if (jsonElement.getAsJsonPrimitive().isString()) {
                    return jsonElement.getAsString();
                }
                if (jsonElement.getAsJsonPrimitive().isNumber()) {
                    return jsonElement.getAsNumber().toString();
                }
                if (!jsonElement.getAsJsonPrimitive().isBoolean()) return jsonElement.toString();
                return String.valueOf(jsonElement.getAsBoolean());
            }
            catch (Exception exception) {
                return "";
            }
        }
        return "";
    }

    private void q() {
        t = "";
        String string = this.y();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            com.github.catvod.spider.merge.i0.d.c(string, "");
        }
    }

    private int r(JsonObject object) {
        object = object.entrySet().iterator();
        int n2 = 0;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            if (!((JsonElement)entry.getValue()).isJsonObject() || !(entry = ((JsonElement)entry.getValue()).getAsJsonObject()).has("links") || !entry.get("links").isJsonArray()) continue;
            n2 += entry.getAsJsonArray("links").size();
        }
        return n2;
    }

    private void s() {
        if (TextUtils.isEmpty((CharSequence)t) || !t.contains("session_token")) {
            this.A();
        }
    }

    private String t(String string) {
        String string2;
        this.s();
        String string3 = string2 = com.github.catvod.spider.merge.f0.d.l(string, this.getHeader(), null);
        if (this.B(string2)) {
            SpiderDebug.log((String)"PanLian \u4f1a\u8bdd\u5931\u6548\uff0c\u91cd\u65b0\u767b\u5f55");
            this.q();
            this.A();
            string3 = com.github.catvod.spider.merge.f0.d.l(string, this.getHeader(), null);
        }
        return string3;
    }

    /*
     * Unable to fully structure code
     */
    private PanLian$PageResult u(String var1_1, String var2_3) {
        block17: {
            block16: {
                var8_6 = new PanLian$PageResult();
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)(var1_1 = (String)PanLian.s.get(var1_1)))) {
                    return var8_6;
                }
                var3_7 = com.github.catvod.spider.merge.l0.b.e;
                try {
                    var4_8 = Integer.parseInt((String)var2_3);
                }
                catch (Exception var2_4) {
                    var4_8 = 1;
                }
                var6_9 = Math.max(var4_8 * 30, 30);
                var2_3 = new StringBuilder();
                var2_3.append(this.m);
                var2_3.append((String)var1_1);
                var2_3.append("?limit=");
                var2_3.append(var6_9);
                var1_1 = this.t(var2_3.toString());
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)var1_1)) {
                    return var8_6;
                }
                var2_3 = JsonParser.parseString((String)var1_1).getAsJsonObject();
                var1_1 = var2_3.has("data") != false && var2_3.get("data").isJsonArray() != false ? var2_3.getAsJsonArray("data") : (var2_3.has("list") != false && var2_3.get("list").isJsonArray() != false ? var2_3.getAsJsonArray("list") : null);
                if (var1_1 != null) break block16;
                return var8_6;
            }
            var2_3 = PanLian.p((JsonObject)var2_3, "total");
            var5_10 = var1_1.size();
            try {
                var3_7 = Integer.parseInt((String)var2_3);
            }
            catch (Exception var2_5) {
                var3_7 = var5_10;
            }
            var5_10 = var3_7;
            if (var3_7 > 0) ** GOTO lbl41
            var5_10 = var1_1.size();
lbl41:
            // 2 sources

            var8_6.c = var5_10;
            var8_6.b = Math.max(1, (var5_10 + 30 - 1) / 30);
            var5_10 = (var4_8 - 1) * 30;
            var7_11 = Math.min(var5_10 + 30, var1_1.size());
            if (var5_10 < var1_1.size()) break block17;
            return var8_6;
        }
        for (var3_7 = var5_10; var3_7 < var7_11; ++var3_7) {
            if (!var1_1.get(var3_7).isJsonObject()) continue;
            this.o(var8_6, var1_1.get(var3_7).getAsJsonObject());
            continue;
        }
        try {
            if (var8_6.b <= var4_8 && var1_1.size() >= var6_9) {
                var8_6.b = var4_8 + 1;
            }
        }
        catch (Exception var1_2) {
            com.github.catvod.spider.merge.I.s.b("PanLian fetchHotPage error: ", var1_2);
        }
        return var8_6;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private PanLian$PageResult v(String charSequence, String object, String charSequence2) {
        void var1_5;
        Object object2;
        CharSequence charSequence3;
        PanLian$PageResult panLian$PageResult = new PanLian$PageResult();
        try {
            if (com.github.catvod.spider.merge.R0.e.d(charSequence3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.m);
                stringBuilder.append("/api/get_videos.php?wd=");
                stringBuilder.append(URLEncoder.encode((String)charSequence3, "UTF-8"));
                stringBuilder.append("&pg=");
                stringBuilder.append((String)object2);
                CharSequence charSequence4 = charSequence3 = stringBuilder.toString();
            } else {
                charSequence3 = new StringBuilder();
                charSequence3.append(this.m);
                charSequence3.append("/api/get_videos.php?t=");
                charSequence3.append((String)charSequence);
                charSequence3.append("&pg=");
                charSequence3.append((String)object2);
                CharSequence charSequence5 = charSequence3 = charSequence3.toString();
            }
        }
        catch (Exception exception) {
            charSequence3 = new StringBuilder();
            O0.a(charSequence3, this.m, "/api/get_videos.php?t=", charSequence, "&pg=");
            charSequence3.append((String)object2);
            String string = charSequence3.toString();
        }
        String string = this.t((String)var1_5);
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return panLian$PageResult;
        }
        JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
        object2 = PanLian.p(jsonObject, "pagecount");
        int n2 = com.github.catvod.spider.merge.l0.b.e;
        int n3 = 0;
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n2 = 0;
        }
        panLian$PageResult.b = n2;
        object2 = PanLian.p(jsonObject, "total");
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n2 = n3;
        }
        try {
            panLian$PageResult.c = n2;
            if (!jsonObject.has("list")) return panLian$PageResult;
            if (!jsonObject.get("list").isJsonArray()) {
                return panLian$PageResult;
            }
            object2 = jsonObject.getAsJsonArray("list").iterator();
            while (object2.hasNext()) {
                JsonElement jsonElement = (JsonElement)object2.next();
                if (!jsonElement.isJsonObject()) continue;
                this.o(panLian$PageResult, jsonElement.getAsJsonObject());
            }
            return panLian$PageResult;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("PanLian parse video list error: ", exception);
        }
        return panLian$PageResult;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String w(String string) {
        String string2;
        Locale locale;
        int n2;
        long l2;
        block7: {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return "";
            }
            l2 = Long.parseLong(string.trim());
            if (l2 > 0L) break block7;
            return "";
        }
        double d2 = l2;
        for (n2 = 0; d2 >= 1024.0 && n2 < 4; d2 /= 1024.0, ++n2) {
        }
        try {
            locale = Locale.US;
            string2 = n2 == 0 ? "%.0f%s" : "%.2f%s";
        }
        catch (Exception exception) {
            return string;
        }
        return string2 = String.format(locale, string2, d2, (new String[]{"B", "KB", "MB", "GB", "TB"})[n2]);
    }

    private HashMap<String, String> x() {
        int n2 = com.github.catvod.spider.merge.l0.b.e;
        return com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Accept", "application/json, text/plain, */*");
    }

    private String y() {
        return com.github.catvod.spider.merge.l0.b.d("panlian_cookie_", this.n, this.m);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JsonObject z(String string2, String iterator) {
        ArrayList<String> arrayList;
        Object object;
        block15: {
            object = this.q.get(string2);
            if (object != null) {
                return object;
            }
            this.s();
            arrayList = new ArrayList<String>();
            if (!com.github.catvod.spider.merge.R0.e.d(string2)) break block15;
            arrayList.add(string2.trim());
        }
        try {
            long l2 = Long.parseLong(string2.trim());
            object = String.valueOf(-l2);
            if (!arrayList.contains(object)) {
                arrayList.add((String)object);
            }
            if (!arrayList.contains(object = String.valueOf(Math.abs(l2)))) {
                arrayList.add((String)object);
            }
        }
        catch (Exception exception) {}
        int n2 = -1;
        try {
            Object object2;
            block17: {
                int n3;
                JsonObject jsonObject;
                Object object3;
                int n4;
                Iterator iterator2;
                block18: {
                    block16: {
                        iterator2 = arrayList.iterator();
                        object2 = null;
                        while (true) {
                            n4 = n2;
                            object = object2;
                            if (!iterator2.hasNext()) break block16;
                            object3 = (String)iterator2.next();
                            jsonObject = this.E((String)object3, (String)((Object)iterator));
                            if (jsonObject == null) continue;
                            int n5 = this.r(jsonObject);
                            object = new StringBuilder();
                            ((StringBuilder)object).append("PanLian pan groups vod_id=");
                            ((StringBuilder)object).append((String)object3);
                            ((StringBuilder)object).append(" groups=");
                            ((StringBuilder)object).append(jsonObject.size());
                            ((StringBuilder)object).append(" links=");
                            ((StringBuilder)object).append(n5);
                            SpiderDebug.log((String)((StringBuilder)object).toString());
                            n3 = n2;
                            object3 = object2;
                            if (n5 > n2) {
                                object3 = jsonObject;
                                n3 = n5;
                            }
                            n4 = n3;
                            object = object3;
                            if (jsonObject.size() >= 3) break block16;
                            n2 = n3;
                            object2 = object3;
                            if (n5 >= 5) break;
                        }
                        object = object3;
                        n4 = n3;
                    }
                    if (object == null) break block18;
                    object2 = object;
                    if (n4 > 0) break block17;
                }
                SpiderDebug.log((String)"PanLian pan groups empty, retry after re-login");
                this.q();
                this.A();
                iterator2 = arrayList.iterator();
                n2 = n4;
                while (true) {
                    object2 = object;
                    if (!iterator2.hasNext()) break block17;
                    jsonObject = this.E((String)iterator2.next(), (String)((Object)iterator));
                    if (jsonObject == null) continue;
                    n3 = this.r(jsonObject);
                    n4 = n2;
                    object3 = object;
                    if (n3 > n2) {
                        object3 = jsonObject;
                        n4 = n3;
                    }
                    object2 = object3;
                    if (jsonObject.size() >= 3) break block17;
                    n2 = n4;
                    object = object3;
                    if (n3 >= 5) break;
                }
                object2 = object3;
            }
            if (object2 != null) {
                this.q.put(string2, (JsonObject)object2);
                for (String string2 : arrayList) {
                    this.q.put(string2, (JsonObject)object2);
                }
            }
            return object2;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("PanLian getPanGroups error: ", exception);
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        int n2;
        object3 = object;
        try {
            if (TextUtils.isEmpty((CharSequence)object)) {
                object3 = "0";
            }
            if (((String)object3).startsWith("dir###")) {
                return this.C(((String)object3).substring(6));
            }
            if (((String)object3).startsWith("links###")) {
                return this.D(((String)object3).substring(8));
            }
            object = s.containsKey(object3) ? this.u((String)object3, (String)object2) : this.v((String)object3, (String)object2, null);
            n2 = com.github.catvod.spider.merge.l0.b.e;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("PanLian categoryContent error: ", exception);
            this.q();
            this.A();
            f f2 = new f();
            f2.y(new ArrayList<h>());
            f2.k(1, 1, 0, 1);
            return f2.toString();
        }
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n2 = 1;
        }
        {
            int n3;
            int n4 = ((PanLian$PageResult)object).b;
            if (n4 <= 0) {
                n4 = ((ArrayList)((PanLian$PageResult)object).a).size() >= 20 ? n2 + 1 : n2;
            }
            if ((n3 = ((PanLian$PageResult)object).c) <= 0) {
                n3 = ((ArrayList)((PanLian$PageResult)object).a).size();
            }
            object2 = new f();
            ((f)object2).y(((PanLian$PageResult)object).a);
            ((f)object2).k(n2, n4, ((ArrayList)((PanLian$PageResult)object).a).size(), n3);
            return ((f)object2).toString();
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String detailContent(List<String> object) {
        try {
            String string = (String)object.get(0);
            if (!TextUtils.isEmpty((CharSequence)string) && !string.startsWith("empty")) {
                String[] stringArray = string.split("###", 2);
                String string2 = stringArray[0];
                int n2 = stringArray.length;
                if (n2 > 1) {
                    String string3 = stringArray[1];
                } else {
                    String string4 = "";
                }
                String string5 = com.github.catvod.spider.merge.l0.b.b(string2);
                if (!TextUtils.isEmpty((CharSequence)string5)) void var1_6;
                return super.detailContent("", (String)var1_6, Collections.singletonList(string5));
                ArrayList<h> arrayList = new ArrayList<h>();
                return com.github.catvod.spider.merge.K.f.o(arrayList);
            }
            ArrayList<h> arrayList = new ArrayList<h>();
            return com.github.catvod.spider.merge.K.f.o(arrayList);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PanLian detailContent error: ");
            stringBuilder.append(exception);
            SpiderDebug.log((String)stringBuilder.toString());
            return com.github.catvod.spider.merge.K.f.o(new ArrayList<h>());
        }
    }

    /*
     * WARNING - void declaration
     */
    public String homeContent(boolean bl) {
        List<h> list;
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList;
        block5: {
            Object object;
            arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
            for (Map.Entry object22 : ((LinkedHashMap)r).entrySet()) {
                arrayList.add(new com.github.catvod.spider.merge.K.a((String)object22.getKey(), (String)object22.getValue()));
            }
            ArrayList arrayList2 = new ArrayList();
            Object object2 = object = this.u((String)"hot_movie", (String)"1").a;
            list = object;
            if (!((ArrayList)object).isEmpty()) break block5;
            Object object3 = object;
            try {
                list = this.v((String)"0", (String)"1", null).a;
            }
            catch (Throwable throwable) {
                void var2_9;
                object = new StringBuilder();
                ((StringBuilder)object).append("PanLian homeContent error: ");
                ((StringBuilder)object).append(throwable);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                list = var2_9;
            }
        }
        return com.github.catvod.spider.merge.K.f.r(arrayList, list);
    }

    @Override
    public void init(Context object, String string) {
        super.init((Context)object, string);
        try {
            if (com.github.catvod.spider.merge.R0.e.d(string)) {
                object = com.github.catvod.spider.merge.J.j.e(string);
                if (object.has("siteUrl") && !object.get("siteUrl").isJsonNull()) {
                    this.m = com.github.catvod.spider.merge.l0.b.i(object.get("siteUrl").getAsString(), "https://pinglian.lol");
                }
                if (object.has("username") && !object.get("username").isJsonNull()) {
                    this.n = object.get("username").getAsString();
                }
                if (object.has("password") && !object.get("password").isJsonNull()) {
                    this.o = object.get("password").getAsString();
                }
                if (object.has("cookie") && !object.get("cookie").isJsonNull() && com.github.catvod.spider.merge.R0.e.d(object.get("cookie").getAsString())) {
                    t = object.get("cookie").getAsString();
                }
            }
            if (TextUtils.isEmpty((CharSequence)t)) {
                object = com.github.catvod.spider.merge.l0.b.h(this.y());
                t = object;
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    SpiderDebug.log((String)"PanLian \u8bfb\u53d6\u672c\u5730 Cookie \u6210\u529f");
                }
            }
            this.A();
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.s.b("PanLian init error: ", exception);
        }
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    public String searchContent(String charSequence, boolean bl, String string) {
        try {
            charSequence = com.github.catvod.spider.merge.K.f.o(this.v((String)"0", (String)string, (String)charSequence).a);
            return charSequence;
        }
        catch (Exception exception) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("PanLian searchContent error: ");
            ((StringBuilder)charSequence).append(exception);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            return com.github.catvod.spider.merge.K.f.o(new ArrayList<h>());
        }
    }
}

