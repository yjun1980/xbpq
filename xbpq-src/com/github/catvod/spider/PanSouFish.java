/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.f0.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class PanSouFish
extends NetPan {
    private static Gson q = new Gson();
    private static final Map<String, String> r;
    private String m = "https://so.252035.xyz";
    private String n = "";
    public String o = "";
    private ConcurrentHashMap<String, JSONArray> p = new ConcurrentHashMap();

    static {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        r = hashMap;
        hashMap.put("aliyun", "\u963f\u91cc\u4e91\u76d8");
        hashMap.put("baidu", "\u767e\u5ea6\u7f51\u76d8");
        hashMap.put("quark", "\u5938\u514b\u7f51\u76d8");
        hashMap.put("tianyi", "\u5929\u7ffc\u4e91\u76d8");
        hashMap.put("uc", "UC\u7f51\u76d8");
        hashMap.put("115", "115\u7f51\u76d8");
        hashMap.put("pikpak", "PikPak");
        hashMap.put("xunlei", "\u8fc5\u96f7\u7f51\u76d8");
        hashMap.put("123", "123\u76d8");
        hashMap.put("magnet", "\u78c1\u529b\u94fe\u63a5");
        hashMap.put("ed2k", "\u7535\u9a74\u94fe\u63a5");
    }

    private void o(String string, String string2, List<h> list) {
        try {
            Object object = new JSONObject(string);
            string = object.getJSONObject("data");
            if (string.has("merged_by_type")) {
                string = string.getJSONObject("merged_by_type");
                object = string.keys();
                while (object.hasNext()) {
                    String string3 = (String)object.next();
                    if ("pikpak".contains(string3) || "xunlei".contains(string3) || "thunder".contains(string3) || "magnet".contains(string3) || "ed2k".contains(string3) || "others".contains(string3)) continue;
                    JSONArray jSONArray = string.getJSONArray(string3);
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append(string3);
                    charSequence.append("###");
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    this.p.put((String)charSequence, jSONArray);
                    string3 = jSONArray.getJSONObject(0).getString("url");
                    if (!NetPan.isNetPan(string3)) continue;
                    h h2 = new h((String)charSequence, string2, NetPan.getYunPanPic(string3), String.valueOf(jSONArray.length()), true);
                    list.add(h2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private String p(String string) {
        ArrayList<h> arrayList = new ArrayList<h>();
        try {
            Object object = new JsonObject();
            object.addProperty("kw", string);
            object.addProperty("res", "merge");
            object.addProperty("src", "all");
            if (com.github.catvod.spider.merge.R0.e.d(this.n)) {
                object.add("filter", (JsonElement)((JsonObject)q.fromJson(this.n, JsonObject.class)));
            }
            CharSequence charSequence = new StringBuilder();
            charSequence.append(this.m);
            charSequence.append("/api/search");
            charSequence = charSequence.toString();
            object = q.toJson((JsonElement)object);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("cookie", this.o);
            hashMap.put("referer", (String)charSequence);
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            this.o(com.github.catvod.spider.merge.f0.d.f((String)charSequence, (String)object, hashMap).a(), string, arrayList);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    /*
     * Unable to fully structure code
     */
    public String categoryContent(String var1_1, String var2_2, boolean var3_5, HashMap<String, String> var4_6) {
        var9_7 = this.p.get(var1_1);
        var8_8 = new ArrayList<h>();
        block9: for (var5_9 = 0; var5_9 < var9_7.length(); ++var5_9) {
            block14: {
                block13: {
                    var12_14 = var9_7.getJSONObject(var5_9);
                    var7_11 = var1_1.split("###")[0];
                    var11_13 = var1_1.split("###")[1];
                    var4_6 = null;
                    var2_2 = var12_14.optString("url", var12_14.optString("link", var12_14.optString("share_url", "")));
                    if (!TextUtils.isEmpty((CharSequence)var2_2) || NetPan.isNetPan((String)var2_2)) break block13;
                    var2_2 = var4_6;
                }
                var10_12 = var12_14.optString("title", var12_14.optString("note", var12_14.optString("file_name", "\u672a\u77e5\u8d44\u6e90")));
                var12_14.optString("description", var12_14.optString("desc", ""));
                var6_10 = var12_14.optString("time", var12_14.optString("created_at", var12_14.optString("update_time", "")));
                var14_16 = var12_14.optString("size", var12_14.optString("file_size", ""));
                var12_14 = new StringBuilder();
                var12_14.append((String)var2_2);
                var12_14.append("#");
                var12_14.append(var11_13);
                var11_13 = var12_14.toString();
                var13_15 = NetPan.getYunPanPic(var2_2);
                var12_14 = new StringBuilder();
                var15_17 = PanSouFish.r;
                var2_2 = var7_11;
                if (var15_17.containsKey(var7_11)) {
                    var2_2 = (String)var15_17.get(var7_11);
                }
                var12_14.append("[");
                var12_14.append((String)var2_2);
                var12_14.append("]");
                var3_5 = TextUtils.isEmpty((CharSequence)var14_16);
                if (var3_5) ** GOTO lbl48
                var12_14.append(" ");
                var12_14.append(var14_16);
lbl48:
                // 2 sources

                if (TextUtils.isEmpty((CharSequence)var6_10)) ** GOTO lbl64
                var12_14.append(" ");
                if (var6_10.contains("T")) {
                    var2_2 = var6_10.split("T")[0];
                    break block14;
                }
                var2_2 = var6_10;
                if (!var6_10.contains(" ")) break block14;
                var2_2 = var6_10.split(" ")[0];
            }
lbl60:
            // 2 sources

            while (true) {
                try {
                    var12_14.append((String)var2_2);
lbl64:
                    // 2 sources

                    var2_2 = new h(var11_13, var10_12, var13_15, var12_14.toString());
                }
                catch (Exception var2_3) {
                    var2_3.printStackTrace();
                    var2_2 = var4_6;
                }
                if (var2_2 == null) continue block9;
                var8_8.add((h)var2_2);
                continue block9;
                break;
            }
        }
        var1_1 = new f();
        var1_1.y(var8_8);
        var1_1.k(1, 1, 0, 1);
        return var1_1.toString();
        catch (Exception var2_4) {
            var2_2 = var6_10;
            ** continue;
        }
    }

    public String detailContent(List<String> object) {
        object = object.get(0).split("#", 2);
        String string = object[0];
        object = ((String[])object).length > 1 ? object[1] : "";
        return super.detailContent("", (String)object, Arrays.asList(string));
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                context = new JSONObject(string);
                if (context.has("siteUrl")) {
                    this.m = context.getString("siteUrl");
                }
                if (context.has("filter")) {
                    this.n = context.getString("filter");
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String searchContent(String string, boolean bl) {
        return this.p(string);
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.p(string);
    }
}

