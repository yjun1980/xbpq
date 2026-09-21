/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.l0.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HongGuo
extends Spider {
    private String a = "https://hongguoduanju.com";
    private String b = "";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a(String object) {
        int n3;
        int n2;
        String[] stringArray;
        if (TextUtils.isEmpty((CharSequence)object)) return "";
        if (!((String)object).contains("?")) {
            return "";
        }
        try {
            stringArray = ((String)object).substring(((String)object).indexOf("?") + 1).split("&");
            n2 = stringArray.length;
            n3 = 0;
        }
        catch (Exception exception) {
            return "";
        }
        while (n3 < n2) {
            String[] stringArray2 = stringArray[n3].split("=");
            if (stringArray2.length == 2 && stringArray2[0].equals("series_id")) {
                return stringArray2[1];
            }
            ++n3;
        }
        return "";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JsonObject b(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        try {
            int n2;
            int n3;
            int n4;
            block17: {
                int n5;
                n4 = n5 = string.indexOf("_ROUTER_DATA = ");
                if (n5 == -1) {
                    n4 = string.indexOf("_ROUTER_DATA=");
                }
                if (n4 == -1) return null;
                n3 = string.indexOf("{", n4);
                if (n3 == -1) return null;
                int n6 = 0;
                boolean bl = false;
                int n7 = 0;
                n2 = n3;
                while (n2 < string.length()) {
                    boolean bl2;
                    char c2 = string.charAt(n2);
                    if (n6 != 0) {
                        n4 = 0;
                        bl2 = bl;
                        n5 = n7;
                    } else if (c2 == '\\') {
                        n4 = 1;
                        bl2 = bl;
                        n5 = n7;
                    } else if (c2 == '\"') {
                        bl2 = bl ^ true;
                        n4 = n6;
                        n5 = n7;
                    } else {
                        n4 = n6;
                        bl2 = bl;
                        n5 = n7;
                        if (!bl) {
                            if (c2 == '{') {
                                n5 = n7 + 1;
                                n4 = n6;
                                bl2 = bl;
                            } else {
                                n4 = n6;
                                bl2 = bl;
                                n5 = n7--;
                                if (c2 == '}') {
                                    n4 = n6;
                                    bl2 = bl;
                                    n5 = n7;
                                    if (n7 == 0) break block17;
                                }
                            }
                        }
                    }
                    ++n2;
                    n6 = n4;
                    bl = bl2;
                    n7 = n5;
                }
                return null;
            }
            n4 = n2 + 1;
            if (n4 == -1) return null;
            return JsonParser.parseString((String)string.substring(n3, n4).trim()).getAsJsonObject();
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("HongGuo extractRouterData error: "));
            return null;
        }
    }

    private Map<String, String> c() {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        hashMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int d(JsonObject jsonObject, String string, int n2) {
        if (jsonObject == null) return n2;
        if (!jsonObject.has(string)) return n2;
        if (jsonObject.get(string).isJsonNull()) return n2;
        try {
            return jsonObject.get(string).getAsInt();
        }
        catch (Exception exception) {
            return n2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String e(JsonObject object, String string, String string2) {
        void var2_4;
        void var3_5;
        if (object == null) return var3_5;
        if (!object.has((String)var2_4)) return var3_5;
        if (object.get((String)var2_4).isJsonNull()) return var3_5;
        try {
            return object.get((String)var2_4).getAsString();
        }
        catch (Exception exception) {
            return var3_5;
        }
    }

    /*
     * Unable to fully structure code
     */
    public String categoryContent(String var1_1, String var2_4, boolean var3_6, HashMap<String, String> var4_7) {
        block89: {
            block99: {
                block80: {
                    block87: {
                        block81: {
                            block84: {
                                block85: {
                                    block83: {
                                        block86: {
                                            block82: {
                                                block79: {
                                                    block78: {
                                                        block76: {
                                                            block77: {
                                                                block97: {
                                                                    block98: {
                                                                        var12_8 = var1_1;
                                                                        try {
                                                                            var5_9 = Integer.parseInt((String)var2_4);
                                                                        }
                                                                        catch (Exception var2_5) {
                                                                            var5_9 = 1;
                                                                        }
                                                                        var11_10 = var5_9;
                                                                        if (var5_9 < 1) {
                                                                            var11_10 = 1;
                                                                        }
                                                                        var13_11 = new ArrayList<h>();
                                                                        var5_9 = 0;
                                                                        var6_12 = 0;
                                                                        var8_13 = 0;
                                                                        var7_14 = 0;
                                                                        var9_15 = 0;
                                                                        var2_4 = new StringBuilder(this.a);
                                                                        var3_6 = "hot".equals(var12_8);
                                                                        if (var3_6) break block76;
                                                                        if (TextUtils.isEmpty((CharSequence)var1_1)) break block76;
                                                                        var3_6 = "cate_1".equals(var12_8);
                                                                        if (var3_6) ** GOTO lbl42
                                                                        if ("cate_757".equals(var12_8) || "cate_758".equals(var12_8) || "cate_11".equals(var12_8) || "cate_127".equals(var12_8) || "cate_4".equals(var12_8)) ** GOTO lbl42
                                                                        if ("cate_1021".equals(var12_8) || "cate_1048".equals(var12_8) || "cate_262".equals(var12_8) || "cate_1038".equals(var12_8) || "cate_165".equals(var12_8) || "cate_303".equals(var12_8) || "cate_1019".equals(var12_8)) break block97;
                                                                        if ("cate_1051".equals(var12_8) || "cate_36".equals(var12_8) || "cate_37".equals(var12_8) || "cate_762".equals(var12_8)) break block98;
                                                                        if (var12_8.contains("=")) {
                                                                            var1_1 = "/category?";
                                                                            break block77;
                                                                        }
                                                                        ** GOTO lbl42
                                                                    }
                                                                    var1_1 = "/category?setting=";
                                                                    break block77;
                                                                }
                                                                var1_1 = "/category?topic=";
                                                            }
                                                            var2_4.append((String)var1_1);
                                                            break block78;
lbl42:
                                                            // 3 sources

                                                            var2_4.append("/category?background=");
                                                            break block78;
                                                        }
                                                        var12_8 = "/category?sort_type=1";
                                                    }
                                                    var2_4.append((String)var12_8);
                                                    if (var11_10 <= 1) break block79;
                                                    var2_4.append("&page=");
                                                    var2_4.append(var11_10);
                                                }
                                                if (var4_7 == null) ** GOTO lbl73
                                                var4_7 = var4_7.entrySet().iterator();
                                                while (var4_7.hasNext()) {
                                                    var1_1 = (Map.Entry)var4_7.next();
                                                    if (TextUtils.isEmpty((CharSequence)((CharSequence)var1_1.getValue()))) continue;
                                                    var2_4.append("&");
                                                    var2_4.append((String)var1_1.getKey());
                                                    var2_4.append("=");
                                                    var2_4.append((String)var1_1.getValue());
                                                }
lbl73:
                                                // 2 sources

                                                if (TextUtils.isEmpty((CharSequence)(var4_7 = com.github.catvod.spider.merge.f0.d.l(var2_4.toString(), this.c(), null)))) break block80;
                                                var1_1 = this.b((String)var4_7);
                                                if (var1_1 == null) break block81;
                                                if (!var1_1.has("loaderData")) break block81;
                                                var3_6 = (var1_1 = var1_1.getAsJsonObject("loaderData")).has("category_page");
                                                if (!var3_6) break block82;
                                                if (!var1_1.get("category_page").isJsonObject()) break block82;
                                                var12_8 = var1_1.getAsJsonObject("category_page");
                                                var1_1 = var12_8.has("recommendList") != false && var12_8.get("recommendList").isJsonArray() != false ? var12_8.getAsJsonArray("recommendList") : null;
                                                var2_4 = var1_1;
                                                if (!var12_8.has("pagination")) break block83;
                                                var2_4 = var1_1;
                                                if (!var12_8.get("pagination").isJsonObject()) break block83;
                                                var2_4 = var12_8.getAsJsonObject("pagination");
                                                var7_14 = var5_9 = this.d((JsonObject)var2_4, "totalPages", 1);
                                                var9_15 = this.d((JsonObject)var2_4, "total", 0);
                                                break block84;
                                            }
                                            if (!var1_1.has("home_page") || !var1_1.get("home_page").isJsonObject()) break block85;
                                            if (!(var1_1 = var1_1.getAsJsonObject("home_page")).has("recommendList") || !var1_1.get("recommendList").isJsonArray()) break block86;
                                            var1_1 = var1_1.getAsJsonArray("recommendList");
lbl100:
                                            // 2 sources

                                            while (true) {
                                                var2_4 = var1_1;
                                                break block83;
                                                break;
                                            }
                                        }
                                        if (var1_1.has("hotShortDramaList") && var1_1.get("hotShortDramaList").isJsonArray()) {
                                            var1_1 = var1_1.getAsJsonArray("hotShortDramaList");
                                            ** continue;
                                        }
                                        break block85;
                                    }
                                    var5_9 = 1;
                                    var1_1 = var2_4;
                                    break block84;
                                }
                                var5_9 = 1;
                                var1_1 = null;
                            }
                            var10_16 = var5_9;
                            var8_13 = var9_15;
                            if (var1_1 == null) break block87;
                            var10_16 = var5_9;
                            var8_13 = var9_15;
                            var7_14 = var5_9;
                            var6_12 = var9_15;
                            if (var1_1.size() <= 0) break block87;
                            var7_14 = var5_9;
                            var6_12 = var9_15;
                            var12_8 = var1_1.iterator();
                            while (true) {
                                block88: {
                                    var10_16 = var5_9;
                                    var8_13 = var9_15;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    if (!var12_8.hasNext()) break block87;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1 = (JsonElement)var12_8.next();
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    if (!var1_1.isJsonObject()) continue;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var17_20 = var1_1.getAsJsonObject();
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var14_17 = this.e(var17_20, "series_id", "");
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    if (TextUtils.isEmpty((CharSequence)var14_17)) continue;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var16_19 = this.e(var17_20, "series_name", this.e(var17_20, "title", "\u672a\u77e5\u77ed\u5267"));
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var15_18 = this.e(var17_20, "series_cover", this.e(var17_20, "cover", ""));
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1 = var2_4 = this.e(var17_20, "episode_right_text", "");
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    if (!TextUtils.isEmpty((CharSequence)var2_4)) break block88;
                                    var1_1 = var2_4;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    if (!var17_20.has("episode_cnt")) break block88;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1 = new StringBuilder();
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1.append("\u5168");
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1.append(var17_20.get("episode_cnt").getAsInt());
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1.append("\u96c6");
                                    var7_14 = var5_9;
                                    var6_12 = var9_15;
                                    var1_1 = var1_1.toString();
                                }
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var2_4 = new h();
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var2_4.l(var14_17);
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var2_4.m((String)var16_19);
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var2_4.n((String)var15_18);
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var2_4.q((String)var1_1);
                                var7_14 = var5_9;
                                var6_12 = var9_15;
                                var13_11.add((h)var2_4);
                                continue;
                                break;
                            }
                        }
                        var10_16 = 1;
                        var8_13 = var5_9;
                    }
                    var7_14 = var10_16;
                    var6_12 = var8_13;
                    var5_9 = var10_16;
                    var9_15 = var8_13;
                    if (!var13_11.isEmpty()) break block89;
                    var7_14 = var10_16;
                    var6_12 = var8_13;
                    try {
                        var12_8 = d.l((String)var4_7).m0("a[href*=/detail?series_id=]").iterator();
                    }
                    catch (Exception var1_2) {
                        var5_9 = var7_14;
                    }
                    while (true) {
                        block96: {
                            block95: {
                                block94: {
                                    block93: {
                                        block92: {
                                            block91: {
                                                block90: {
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    var5_9 = var10_16;
                                                    var9_15 = var8_13;
                                                    if (!var12_8.hasNext()) break block89;
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    var15_18 = (m)var12_8.next();
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    var14_17 = this.a(var15_18.c("href"));
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    if (TextUtils.isEmpty((CharSequence)var14_17)) continue;
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    var1_1 = var15_18.n0(".pc-title-EGZl7Q, .m-title-VquO96, .pc-title-l_s3n8, .m-title-F3bkRB, p[class*=-title-], div[class*=-title-]");
                                                    if (var1_1 == null) break block90;
                                                    var7_14 = var10_16;
                                                    var6_12 = var8_13;
                                                    var2_4 = var1_1.s0().trim();
                                                    break block91;
                                                }
                                                var2_4 = "";
                                            }
                                            var7_14 = var10_16;
                                            var6_12 = var8_13;
                                            var16_19 = var15_18.n0("img");
                                            if (var16_19 == null) break block92;
                                            var7_14 = var10_16;
                                            var6_12 = var8_13;
                                            var1_1 = var16_19.c("src");
                                            break block93;
                                        }
                                        var1_1 = "";
                                    }
                                    var4_7 = var1_1;
                                    var7_14 = var10_16;
                                    var6_12 = var8_13;
                                    if (!TextUtils.isEmpty((CharSequence)var1_1)) break block94;
                                    var4_7 = var1_1;
                                    if (var16_19 == null) break block94;
                                    var7_14 = var10_16;
                                    var6_12 = var8_13;
                                    var4_7 = var16_19.c("data-src");
                                }
                                var7_14 = var10_16;
                                var6_12 = var8_13;
                                var1_1 = var15_18.n0(".pc-episode-b9Waai, .m-episode-XHBuVb, .pc-episode-TGdnks, .m-episode-Y4cUAR, p[class*=-episode-], div[class*=-episode-]");
                                if (var1_1 == null) break block95;
                                var7_14 = var10_16;
                                var6_12 = var8_13;
                                var1_1 = var1_1.s0().trim();
                                break block96;
                            }
                            var1_1 = "";
                        }
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        if (TextUtils.isEmpty((CharSequence)var14_17)) continue;
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        if (TextUtils.isEmpty((CharSequence)var2_4)) continue;
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var15_18 = new h();
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var15_18.l(var14_17);
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var15_18.m((String)var2_4);
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var15_18.n((String)var4_7);
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var15_18.q((String)var1_1);
                        var7_14 = var10_16;
                        var6_12 = var8_13;
                        var13_11.add((h)var15_18);
                        continue;
                        break;
                    }
                    break block99;
                }
                var5_9 = 1;
                var9_15 = var7_14;
                break block89;
                catch (Exception var1_3) {
                    var5_9 = 1;
                    var6_12 = var8_13;
                }
            }
            r.f((Exception)var1_1, com.github.catvod.spider.merge.C.a.c("HongGuo categoryContent error: "));
            var9_15 = var6_12;
        }
        var6_12 = var9_15;
        if (var9_15 == 0) {
            var6_12 = var13_11.size();
        }
        var7_14 = var5_9;
        if (var5_9 == 0) {
            var7_14 = Math.max(1, (var6_12 + 23) / 24);
        }
        var1_1 = new f();
        var1_1.y(var13_11);
        var1_1.k(var11_10, var7_14, 24, var6_12);
        return var1_1.toString();
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[UNCONDITIONALDOLOOP]], but top level block is 19[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String homeContent(boolean bl) {
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        arrayList.add(new com.github.catvod.spider.merge.K.a("hot", "\ud83d\udd25 \u70ed\u95e8\u63a8\u8350"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1", "\ud83c\udfd9\ufe0f \u90fd\u5e02"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_757", "\ud83c\udfe2 \u73b0\u4ee3"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_758", "\ud83c\udfee \u53e4\u4ee3"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1038", "\u2694\ufe0f \u6218\u795e"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1051", "\u26a1 \u9006\u88ad\u6253\u8138"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_36", "\ud83c\udf00 \u91cd\u751f"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_37", "\ud83d\udeaa \u7a7f\u8d8a"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_762", "\ud83d\udcbc \u603b\u88c1"));
        String string = "cate_1048";
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1048", "\ud83c\udf38 \u5973\u6027\u6210\u957f"));
        String string2 = "cate_1021";
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1021", "\ud83d\udc96 \u73b0\u8a00\u751c\u5ba0"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_165", "\ud83d\udd0d \u60ac\u7591\u8111\u6d1e"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_1019", "\u2728 \u7384\u5e7b\u4ed9\u4fa0"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("cate_11", "\ud83c\udf3e \u4e61\u6751\u5e74\u4ee3"));
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        for (com.github.catvod.spider.merge.K.a a2 : arrayList) {
            ArrayList<c> arrayList2 = new ArrayList<c>();
            ArrayList<com.github.catvod.spider.merge.K.b> arrayList3 = new ArrayList<com.github.catvod.spider.merge.K.b>();
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5168\u90e8\u4e3b\u9898", ""));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u73b0\u8a00", string2));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5973\u6027\u6210\u957f", string));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u6218\u795e", "cate_1038"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u8111\u6d1e", "cate_262"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u7384\u5e7b", "cate_1019"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u53e4\u8a00", "cate_439"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5bab\u6597", "cate_246"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u4ed9\u4fa0", "cate_1013"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u6743\u8c0b", "cate_1047"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u60ac\u7591", "cate_165"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u559c\u5267", "cate_303"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u52a8\u4f5c", "cate_302"));
            arrayList2.add(new c("topic", "\u4e3b\u9898", arrayList3));
            arrayList3 = new ArrayList();
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5168\u90e8\u8bbe\u5b9a", ""));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u6253\u8138\u8650\u6e23", "cate_1051"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5927\u7537\u4e3b", "cate_1207"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5927\u5973\u4e3b", "cate_760"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u9a6c\u7532", "cate_266"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u91cd\u751f", "cate_36"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u7a7f\u8d8a", "cate_37"));
            arrayList2.add(new c("setting", "\u8bbe\u5b9a", arrayList3));
            arrayList3 = new ArrayList();
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5168\u90e8\u89d2\u8272", ""));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u603b\u88c1", "cate_762"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u592b\u4eba", "cate_1029"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u6218\u795e", "cate_1038"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5343\u91d1", "cate_1030"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u5a07\u59bb", "cate_1031"));
            arrayList3.add(new com.github.catvod.spider.merge.K.b("\u840c\u5b9d", "cate_765"));
            arrayList2.add(new c("character", "\u89d2\u8272", arrayList3));
            ((AbstractMap)linkedHashMap).put(a2.a(), arrayList2);
        }
        return f.q(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        List<h> list;
        try {
            list = f.i(this.categoryContent("hot", "1", false, null)).f();
        }
        catch (Exception exception) {
            list = new ArrayList<h>();
        }
        return f.o(list);
    }

    public void init(Context object, String string) {
        super.init((Context)object, string);
        object = j.e(string);
        if (object.has("bridgeUrl") && !object.get("bridgeUrl").isJsonNull()) {
            this.b = com.github.catvod.spider.merge.l0.b.i(object.get("bridgeUrl").getAsString(), this.b);
        }
        object = com.github.catvod.spider.merge.C.a.c("HongGuo init: webHost=");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(", bridgeUrl=");
        ((StringBuilder)object).append(this.b);
        SpiderDebug.log((String)((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String object, String object2, List<String> object3) {
        block16: {
            object = object3 = "";
            try {
                if (!((String)object2).startsWith("http://")) {
                    object = object3;
                    if (!((String)object2).startsWith("https://")) {
                        block15: {
                            object = object3;
                            if (!TextUtils.isEmpty((CharSequence)this.b)) {
                                Object object4 = object2;
                                object = object3;
                                if (((String)object2).contains("/")) {
                                    object = object3;
                                    object2 = ((String)object2).split("/");
                                    object = object3;
                                    object4 = object2[((Object)object2).length - 1];
                                }
                                object = object3;
                                object = object3;
                                object2 = new StringBuilder();
                                object = object3;
                                ((StringBuilder)object2).append(this.b);
                                object = object3;
                                ((StringBuilder)object2).append("/play?vid=");
                                object = object3;
                                ((StringBuilder)object2).append((String)object4);
                                object = object3;
                                object4 = ((StringBuilder)object2).toString();
                                object = object3;
                                object = object3;
                                object2 = new HashMap();
                                object = object3;
                                ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                                object = object3;
                                object = object3;
                                Object object5 = new StringBuilder();
                                object = object3;
                                ((StringBuilder)object5).append(this.a);
                                object = object3;
                                ((StringBuilder)object5).append("/");
                                object = object3;
                                ((HashMap)object2).put("Referer", ((StringBuilder)object5).toString());
                                object = object3;
                                object = object3;
                                object5 = new f();
                                object = object3;
                                ((f)object5).m(0);
                                object = object3;
                                ((f)object5).w((String)object4);
                                object = object3;
                                ((f)object5).g((Map<String, String>)object2);
                                object = object3;
                                return ((f)object5).toString();
                            }
                            object = object3;
                            object = object3;
                            Object object6 = new StringBuilder();
                            object = object3;
                            ((StringBuilder)object6).append(this.a);
                            object = object3;
                            ((StringBuilder)object6).append("/player/");
                            object = object3;
                            ((StringBuilder)object6).append((String)object2);
                            object = object3;
                            object6 = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object6).toString(), this.c(), null);
                            object2 = object3;
                            object = object3;
                            if (!TextUtils.isEmpty((CharSequence)object6)) {
                                object = object3;
                                Matcher matcher = Pattern.compile("\"video_player_info\"\\s*:\\s*\\{[^}]*\"main_url\"\\s*:\\s*\"([^\"]+)\"").matcher((CharSequence)object6);
                                object2 = object3;
                                object = object3;
                                if (matcher.find()) {
                                    object = object3;
                                    object2 = matcher.group(1);
                                }
                                object3 = object2;
                                object = object2;
                                if (TextUtils.isEmpty((CharSequence)object2)) {
                                    object = object2;
                                    matcher = Pattern.compile("\"main_url\"\\s*:\\s*\"(https?:[^\"]+)\"").matcher((CharSequence)object6);
                                    object3 = object2;
                                    object = object2;
                                    if (matcher.find()) {
                                        object = object2;
                                        object3 = matcher.group(1);
                                    }
                                }
                                object2 = object3;
                                object = object3;
                                if (TextUtils.isEmpty((CharSequence)object3)) {
                                    object = object3;
                                    object6 = this.b((String)object6);
                                    object2 = object3;
                                    if (object6 != null) {
                                        object2 = object3;
                                        object = object3;
                                        if (object6.has("loaderData")) {
                                            object = object3;
                                            object6 = object6.getAsJsonObject("loaderData").entrySet().iterator();
                                            while (true) {
                                                object2 = object3;
                                                object = object3;
                                                if (!object6.hasNext()) break block15;
                                                object = object3;
                                                object2 = (Map.Entry)object6.next();
                                                object = object3;
                                                if (!((JsonElement)object2.getValue()).isJsonObject()) continue;
                                                object = object3;
                                                object2 = ((JsonElement)object2.getValue()).getAsJsonObject();
                                                object = object3;
                                                if (!object2.has("video_player_info")) continue;
                                                object = object3;
                                                if (!object2.get("video_player_info").isJsonObject()) continue;
                                                object = object3;
                                                object2 = object2.getAsJsonObject("video_player_info");
                                                object = object3;
                                                if (object2.has("main_url")) break;
                                            }
                                            object = object3;
                                            object2 = object2.get("main_url").getAsString();
                                        }
                                    }
                                }
                            }
                        }
                        object = object2;
                        object3 = object2;
                        if (!TextUtils.isEmpty((CharSequence)object2)) {
                            object = object2;
                            object3 = ((String)object2).replace("\\/", "/").replace("\\u002F", "/");
                        }
                        break block16;
                    }
                }
                object = object3;
                object = object3;
                f f2 = new f();
                object = object3;
                f2.m(0);
                object = object3;
                f2.w((String)object2);
                object = object3;
                return f2.toString();
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("HongGuo playerContent error: "));
                object3 = object;
            }
        }
        object = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.a);
        ((StringBuilder)object2).append("/");
        ((HashMap)object).put("Referer", ((StringBuilder)object2).toString());
        object2 = new f();
        ((f)object2).m(0);
        ((f)object2).w((String)object3);
        ((f)object2).g((Map<String, String>)object);
        return ((f)object2).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String object2, boolean bl, String arrayList) {
        arrayList = new ArrayList();
        try {
            String string = URLEncoder.encode((String)object2, "UTF-8");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.a);
            ((StringBuilder)object2).append("/search/");
            ((StringBuilder)object2).append(string);
            object2 = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object2).toString(), this.c(), null);
            if (TextUtils.isEmpty((CharSequence)object2) || (object2 = this.b((String)object2)) == null || !object2.has("loaderData") || (object2 = (object2 = object2.getAsJsonObject("loaderData")).has("search_(keyword)/page") && object2.get("search_(keyword)/page").isJsonObject() ? object2.getAsJsonObject("search_(keyword)/page") : (object2.has("search_page") && object2.get("search_page").isJsonObject() ? object2.getAsJsonObject("search_page") : null)) == null || !object2.has("searchList") || !object2.get("searchList").isJsonArray()) return f.o(arrayList);
            for (Object object2 : object2.getAsJsonArray("searchList")) {
                String string2;
                if (!object2.isJsonObject() || (object2 = (object2 = object2.getAsJsonObject()).has("video_data") && object2.get("video_data").isJsonObject() ? object2.getAsJsonObject("video_data") : null) == null || TextUtils.isEmpty((CharSequence)(string2 = this.e((JsonObject)object2, "series_id", "")))) continue;
                String string3 = this.e((JsonObject)object2, "series_title", this.e((JsonObject)object2, "title", "\u672a\u77e5\u77ed\u5267"));
                String string4 = this.e((JsonObject)object2, "series_cover", this.e((JsonObject)object2, "cover", ""));
                object2 = this.e((JsonObject)object2, "episode_right_text", "");
                h h2 = new h();
                h2.l(string2);
                h2.m(string3);
                h2.n(string4);
                h2.q((String)object2);
                arrayList.add(h2);
            }
            return f.o(arrayList);
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("HongGuo searchContent error: "));
        }
        return f.o(arrayList);
    }
}

