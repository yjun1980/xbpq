/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.i0.a;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.l0.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class WoNiu
extends NetPan {
    private static String r = "";
    private String m = "https://www.wn4k.com";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";

    private HashMap<String, String> getHeader() {
        HashMap hashMap = com.github.catvod.spider.merge.I.r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.m);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        if (!TextUtils.isEmpty((CharSequence)r)) {
            hashMap.put("Cookie", r);
        }
        return hashMap;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void o() {
        block17: {
            block16: {
                HashMap<String, List<String>> hashMap;
                Object object;
                Object object2;
                boolean bl;
                block19: {
                    HashMap<String, String> hashMap2;
                    HashMap<String, String> hashMap3;
                    block18: {
                        // MONITORENTER : this
                        if (!TextUtils.isEmpty((CharSequence)r) && (r.contains("session") || r.contains("user_name") || (bl = r.contains("user_id")))) {
                            // MONITOREXIT : this
                            return;
                        }
                        if (com.github.catvod.spider.merge.R0.e.b(this.n) || (bl = com.github.catvod.spider.merge.R0.e.b(this.o))) break block17;
                        object2 = new HashMap();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.m);
                        ((StringBuilder)object).append("/user/login.html");
                        com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object).toString(), this.getHeader(), object2);
                        r = com.github.catvod.spider.merge.i0.m.C(object2, r);
                        hashMap3 = new HashMap<String, String>();
                        hashMap3.put("user_name", this.n);
                        hashMap3.put("user_pwd", this.o);
                        hashMap3.put("username", this.n);
                        hashMap3.put("password", this.o);
                        hashMap3.put("remember", "on");
                        hashMap2 = this.getHeader();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.m);
                        ((StringBuilder)object).append("/user/login.html");
                        hashMap2.put("Referer", ((StringBuilder)object).toString());
                        hashMap2.put("Origin", this.m);
                        hashMap2.put("X-Requested-With", "XMLHttpRequest");
                        if (!TextUtils.isEmpty((CharSequence)r)) {
                            hashMap2.put("Cookie", r);
                        }
                        hashMap = new HashMap<String, List<String>>();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.m);
                        ((StringBuilder)object).append("/user/login.html");
                        object2 = com.github.catvod.spider.merge.f0.d.g(((StringBuilder)object).toString(), hashMap3, hashMap2, hashMap);
                        if (TextUtils.isEmpty((CharSequence)object2)) break block18;
                        object = object2;
                        if (!((String)object2).contains("404")) break block19;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.m);
                    ((StringBuilder)object).append("/api/login.php");
                    object = com.github.catvod.spider.merge.f0.d.g(((StringBuilder)object).toString(), hashMap3, hashMap2, hashMap);
                }
                r = com.github.catvod.spider.merge.i0.m.C(hashMap, r);
                bl = com.github.catvod.spider.merge.R0.e.d((CharSequence)object);
                if (!bl) break block16;
                try {
                    boolean bl2;
                    block21: {
                        boolean bl3;
                        block20: {
                            object = JsonParser.parseString((String)object).getAsJsonObject();
                            bl = object.has("code");
                            bl3 = true;
                            if (!bl) break block20;
                            bl2 = bl3;
                            if (object.get("code").getAsInt() == 1) break block21;
                        }
                        bl2 = object.has("success") && object.get("success").getAsBoolean() ? bl3 : false;
                    }
                    if (bl2) {
                        SpiderDebug.log((String)"[WoNiu] \u767b\u5f55\u6210\u529f");
                        this.p();
                        return;
                    }
                    object = object.has("msg") ? object.get("msg").getAsString() : "";
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("[WoNiu] \u767b\u5f55\u5931\u8d25: ");
                    ((StringBuilder)object2).append((String)object);
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                    return;
                }
                catch (Exception exception) {
                    return;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("[WoNiu] \u767b\u5f55\u5f02\u5e38: ");
                    stringBuilder.append(exception.getMessage());
                    SpiderDebug.log((String)stringBuilder.toString());
                }
            }
            // MONITOREXIT : this
            return;
        }
        SpiderDebug.log((String)"[WoNiu] \u672a\u914d\u7f6e\u8d26\u53f7\u5bc6\u7801\uff0c\u65e0\u6cd5\u767b\u5f55\uff08extend \u53ef\u4f20 username/password\uff09");
        // MONITOREXIT : this
    }

    private void p() {
        if (com.github.catvod.spider.merge.R0.e.b(this.n)) {
            return;
        }
        com.github.catvod.spider.merge.l0.b.m(com.github.catvod.spider.merge.l0.b.d("woniu_cookie_", this.n, this.m), r);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String searchContent(String charSequence, String object) {
        ArrayList<h> arrayList;
        Object object2;
        Object object3;
        CharSequence charSequence2 = "data-src";
        Object object4 = "a";
        try {
            boolean bl;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(this.m);
            ((StringBuilder)object3).append("/vodsearch/-------------/?wd=");
            ((StringBuilder)object3).append(URLEncoder.encode((String)charSequence, "UTF-8"));
            object3 = object2 = ((StringBuilder)object3).toString();
            if (!((String)object).equals("1")) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append("&page=");
                ((StringBuilder)object3).append((String)object);
                object3 = ((StringBuilder)object3).toString();
            }
            if (bl = ((AbstractCollection)(object = ((com.github.catvod.spider.merge.e1.m)(object3 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l((String)object3, this.getHeader(), null)))).m0(".video-card, .module-search-item, .module-item"))).isEmpty()) {
                object = ((com.github.catvod.spider.merge.e1.m)object3).m0("a[href*=/voddetail/]");
            }
            arrayList = new ArrayList<h>();
            object3 = ((AbstractCollection)object).iterator();
            while (true) {
                Object object5;
                String string;
                bl = object3.hasNext();
                Object object6 = "";
                if (!bl) break;
                com.github.catvod.spider.merge.e1.m m2 = (com.github.catvod.spider.merge.e1.m)object3.next();
                object = m2.d0() ? m2 : m2.n0("a[href*=/voddetail/]");
                object2 = object;
                if (object == null) {
                    object2 = m2.n0((String)object4);
                }
                if (object2 == null || TextUtils.isEmpty((CharSequence)(string = ((s)object2).c("href")))) continue;
                object = object2 = ((s)object2).c("title");
                if (TextUtils.isEmpty((CharSequence)object2)) {
                    object5 = m2.n0(".video-title, .module-item-title");
                    object = object2;
                    if (object5 != null) {
                        object = ((com.github.catvod.spider.merge.e1.m)object5).s0().trim();
                    }
                }
                object5 = m2.n0("img");
                object2 = object;
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object2 = object;
                    if (object5 != null) {
                        object2 = ((s)object5).c("alt");
                    }
                }
                if (TextUtils.isEmpty((CharSequence)object2)) continue;
                object = object5 != null ? (((s)object5).n((String)charSequence2) ? ((s)object5).c((String)charSequence2) : ((s)object5).c("src")) : "";
                object5 = object;
                if (!((String)object).startsWith("http")) {
                    object5 = object;
                    if (!((String)object).isEmpty()) {
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append(this.m);
                        ((StringBuilder)object5).append((String)object);
                        object5 = ((StringBuilder)object5).toString();
                    }
                }
                m2 = m2.n0(".video-episode, .video-serial, .module-item-text");
                object = object6;
                if (m2 != null) {
                    object = m2.s0().trim();
                }
                object6 = new h(string, (String)object2, (String)object5, (String)object);
                arrayList.add((h)object6);
            }
            bl = arrayList.isEmpty();
            if (!bl) return com.github.catvod.spider.merge.K.f.o(arrayList);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return com.github.catvod.spider.merge.K.f.o(new ArrayList<h>());
        }
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.m);
            ((StringBuilder)object).append("/index.php/ajax/suggest?mid=1&wd=");
            ((StringBuilder)object).append(URLEncoder.encode((String)charSequence, "UTF-8"));
            charSequence = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)object).toString(), this.getHeader(), null);
            if (!com.github.catvod.spider.merge.R0.e.d(charSequence)) return com.github.catvod.spider.merge.K.f.o(arrayList);
            if (!(charSequence = JsonParser.parseString((String)charSequence).getAsJsonObject()).has("list")) return com.github.catvod.spider.merge.K.f.o(arrayList);
            if (!charSequence.get("list").isJsonArray()) return com.github.catvod.spider.merge.K.f.o(arrayList);
            object4 = charSequence.getAsJsonArray("list").iterator();
            while (object4.hasNext()) {
                charSequence = (JsonElement)object4.next();
                if (!charSequence.isJsonObject()) continue;
                object = (charSequence = charSequence.getAsJsonObject()).has("id") ? charSequence.get("id").getAsString() : "";
                object3 = charSequence.has("name") ? charSequence.get("name").getAsString() : "";
                charSequence = charSequence.has("pic") ? charSequence.get("pic").getAsString() : "";
                charSequence2 = charSequence;
                if (!((String)charSequence).startsWith("http")) {
                    charSequence2 = charSequence;
                    if (!((String)charSequence).isEmpty()) {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append(this.m);
                        ((StringBuilder)charSequence2).append((String)charSequence);
                        charSequence2 = ((StringBuilder)charSequence2).toString();
                    }
                }
                if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object) || !com.github.catvod.spider.merge.R0.e.d((CharSequence)object3)) continue;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("/voddetail/");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("/");
                object2 = new h(((StringBuilder)charSequence).toString(), (String)object3, (String)charSequence2, "");
                arrayList.add((h)object2);
            }
            return com.github.catvod.spider.merge.K.f.o(arrayList);
        }
        catch (Exception exception) {
            return com.github.catvod.spider.merge.K.f.o(arrayList);
        }
    }

    /*
     * Unable to fully structure code
     */
    public String categoryContent(String var1_1, String var2_4, boolean var3_6, HashMap<String, String> var4_7) {
        block72: {
            block74: {
                block75: {
                    block73: {
                        block71: {
                            block70: {
                                block61: {
                                    block60: {
                                        var10_9 = var4_7.containsKey("area") != false ? var4_7.get("area") : "";
                                        var11_10 = var4_7.containsKey("by") != false ? var4_7.get("by") : "time";
                                        var12_11 = var4_7.containsKey("class") != false ? var4_7.get("class") : "";
                                        var13_12 = var4_7.containsKey("lang") != false ? var4_7.get("lang") : "";
                                        var14_13 = var4_7.containsKey("letter") != false ? var4_7.get("letter") : "";
                                        var15_14 = var4_7.containsKey("year") != false ? var4_7.get("year") : "";
                                        var9_15 = new ArrayList<Object>();
                                        var8_16 = Integer.parseInt((String)var2_4);
                                        var16_17 = new StringBuilder();
                                        var16_17.append(this.m);
                                        var16_17.append("/vodtype/");
                                        var16_17.append((String)var1_1);
                                        var4_7 = var9_15;
                                        if (var8_16 != 1) break block60;
                                        var2_4 = "/";
                                        ** GOTO lbl31
                                    }
                                    var2_4 = new StringBuilder();
                                    var2_4.append("-");
                                    var2_4.append(var8_16);
                                    var2_4.append("/");
                                    var2_4 = var2_4.toString();
lbl31:
                                    // 2 sources

                                    var16_17.append((String)var2_4);
                                    var16_17 = var16_17.toString();
                                    var2_4 = this.getHeader();
                                    var17_18 = "data-src";
                                    var2_4 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l((String)var16_17, var2_4, null));
                                    var18_19 = var2_4.m0(".video-card");
                                    var3_6 = var18_19.isEmpty();
                                    var5_20 = var3_6 != false ? 20 : 36;
                                    var9_15 = var2_4;
                                    var16_17 = var18_19;
                                    var2_4 = var4_7;
                                    if (!var18_19.isEmpty()) break block61;
                                    var2_4 = var4_7;
                                    var2_4 = var4_7;
                                    var9_15 = new StringBuilder();
                                    var2_4 = var4_7;
                                    var9_15.append(this.m);
                                    var2_4 = var4_7;
                                    var9_15.append("/vodshow/");
                                    var2_4 = var4_7;
                                    var9_15.append((String)var1_1);
                                    var2_4 = var4_7;
                                    var9_15.append("-");
                                    var2_4 = var4_7;
                                    var9_15.append(var10_9);
                                    var2_4 = var4_7;
                                    var9_15.append("-");
                                    var2_4 = var4_7;
                                    var9_15.append((String)var11_10);
                                    var2_4 = var4_7;
                                    var9_15.append("-");
                                    var2_4 = var4_7;
                                    var9_15.append((String)var12_11);
                                    var2_4 = var4_7;
                                    var9_15.append("-");
                                    var2_4 = var4_7;
                                    var9_15.append((String)var13_12);
                                    var2_4 = var4_7;
                                    var9_15.append("-");
                                    var2_4 = var4_7;
                                    var9_15.append((String)var14_13);
                                    var2_4 = var4_7;
                                    var9_15.append("---");
                                    var2_4 = var4_7;
                                    var9_15.append(var8_16);
                                    var2_4 = var4_7;
                                    var9_15.append("---");
                                    var2_4 = var4_7;
                                    var9_15.append(var15_14);
                                    var2_4 = var4_7;
                                    var9_15.append("/");
                                    var2_4 = var4_7;
                                    var9_15 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l(var9_15.toString(), this.getHeader(), null));
                                    var2_4 = var4_7;
                                    var16_17 = var9_15.m0(".module-item");
                                }
                                var2_4 = var4_7;
                                var14_13 = var16_17.iterator();
                                var1_1 = var4_7;
                                var10_9 = var17_18;
                                while (true) {
                                    block69: {
                                        block68: {
                                            block66: {
                                                block67: {
                                                    block65: {
                                                        block64: {
                                                            block63: {
                                                                block62: {
                                                                    var2_4 = var1_1;
                                                                    var3_6 = var14_13.hasNext();
                                                                    if (!var3_6) break;
                                                                    var2_4 = var1_1;
                                                                    var13_12 = (com.github.catvod.spider.merge.e1.m)var14_13.next();
                                                                    var2_4 = var1_1;
                                                                    if (var13_12.d0()) {
                                                                        var12_11 = var13_12;
                                                                        break block62;
                                                                    }
                                                                    var2_4 = var1_1;
                                                                    var12_11 = var13_12.n0("a");
                                                                }
                                                                if (var12_11 == null) continue;
                                                                var2_4 = var1_1;
                                                                var15_14 = var12_11.c("href");
                                                                var2_4 = var1_1;
                                                                var16_17 = var13_12.n0("img");
                                                                if (var16_17 == null) continue;
                                                                var2_4 = var1_1;
                                                                if (!var16_17.n(var10_9)) break block63;
                                                                var2_4 = var1_1;
                                                                var4_7 = var16_17.c(var10_9);
                                                                break block64;
                                                            }
                                                            var2_4 = var1_1;
                                                            var4_7 = var16_17.c("src");
                                                        }
                                                        var11_10 = var4_7;
                                                        var2_4 = var1_1;
                                                        if (var4_7.startsWith("http")) break block65;
                                                        var2_4 = var1_1;
                                                        var2_4 = var1_1;
                                                        var11_10 = new StringBuilder();
                                                        var2_4 = var1_1;
                                                        var11_10.append(this.m);
                                                        var2_4 = var1_1;
                                                        var11_10.append((String)var4_7);
                                                        var2_4 = var1_1;
                                                        var11_10 = var11_10.toString();
                                                    }
                                                    var2_4 = var1_1;
                                                    var4_7 = var12_11 = var12_11.c("title");
                                                    var2_4 = var1_1;
                                                    if (!var12_11.isEmpty()) break block66;
                                                    var2_4 = var1_1;
                                                    var4_7 = var13_12.n0(".video-title, .module-item-title");
                                                    if (var4_7 == null) break block67;
                                                    var2_4 = var1_1;
                                                    var4_7 = var4_7.s0();
                                                    break block66;
                                                }
                                                var2_4 = var1_1;
                                                var4_7 = var16_17.c("alt");
                                            }
                                            var2_4 = var1_1;
                                            var12_11 = var13_12.n0(".video-episode, .module-item-text");
                                            if (var12_11 == null) break block68;
                                            var2_4 = var1_1;
                                            var12_11 = var12_11.s0();
                                            break block69;
                                        }
                                        var12_11 = "";
                                    }
                                    var2_4 = var1_1;
                                    var2_4 = var1_1;
                                    var13_12 = new h(var15_14, (String)var4_7, (String)var11_10, (String)var12_11);
                                    var1_1.add(var13_12);
                                    continue;
                                    break;
                                }
                                var2_4 = var1_1;
                                try {
                                    var4_7 = var9_15.n0(".pagination a[title=\u5c3e\u9875]");
                                    if (var4_7 == null) break block70;
                                }
                                catch (Exception var2_5) {}
                                var4_7 = Pattern.compile("-(\\d+)/?$").matcher(var4_7.c("href"));
                                if (!var4_7.find()) break block70;
                                var6_21 = Integer.parseInt(var4_7.group(1));
                                break block71;
                            }
                            var6_21 = 0;
                        }
                        var7_22 = var5_20;
                        var5_20 = var6_21;
                        break block72;
                        break block73;
                        catch (Exception var4_8) {
                            var1_1 = var2_4;
                            var2_4 = var4_8;
                        }
                    }
                    var4_7 = var2_4;
                    var2_4 = var1_1;
                    break block74;
                    catch (Exception var1_2) {}
                    break block75;
                    catch (Exception var1_3) {
                        // empty catch block
                    }
                }
                var2_4 = var9_15;
                var5_20 = 36;
                var4_7 = var1_1;
            }
            SpiderDebug.log((Throwable)var4_7);
            var6_21 = 0;
            var7_22 = var5_20;
            var5_20 = var6_21;
        }
        var6_21 = var5_20 > 0 ? var5_20 : (var2_4.size() >= var7_22 ? var8_16 + 1 : var8_16);
        var5_20 = var5_20 > 0 ? (var5_20 *= var7_22) : (var2_4.size() >= var7_22 ? (var8_16 + 1) * var7_22 : var8_16 * var7_22);
        var1_1 = new f();
        var1_1.y((List<h>)var2_4);
        var1_1.k(var8_16, var6_21, var7_22, var5_20);
        return var1_1.toString();
    }

    /*
     * Unable to fully structure code
     */
    public String detailContent(List<String> var1_1) {
        block26: {
            block25: {
                var4_2 = var1_1.get(0);
                var5_3 = com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.m, (String)var4_2);
                if ((var1_1 = com.github.catvod.spider.merge.f0.d.l((String)var5_3, this.getHeader(), null)).contains("\u7f51\u76d8\u8d44\u6e90\u5df2\u9501\u5b9a") || var1_1.contains("\u767b\u5f55\u540e\u53ef\u89c1")) break block25;
                var3_4 = var1_1;
                if (!var1_1.contains("\u8bf7\u5148\u767b\u5f55")) break block26;
            }
            var3_4 = var1_1;
            if (!TextUtils.isEmpty((CharSequence)this.n)) {
                var3_4 = var1_1;
                if (!TextUtils.isEmpty((CharSequence)this.o)) {
                    WoNiu.r = "";
                    this.o();
                    var3_4 = com.github.catvod.spider.merge.f0.d.l((String)var5_3, this.getHeader(), null);
                }
            }
        }
        var6_5 = com.github.catvod.spider.merge.c1.d.l((String)var3_4);
        var5_3 = new h();
        var5_3.l((String)var4_2);
        var1_1 = var6_5.n0(".page-title, .premium-title, .mobile-detail-title");
        var1_1 = var1_1 == null ? "" : var1_1.s0().trim();
        var5_3.m((String)var1_1);
        var4_2 = var6_5.n0(".video-cover img");
        var1_1 = var4_2;
        if (var4_2 == null) {
            var1_1 = var6_5.n0(".module-item-pic img");
        }
        if (var1_1 == null) {
            var1_1 = "";
        } else {
            var4_2 = "data-src";
            if (!var1_1.n("data-src")) {
                var4_2 = "src";
            }
            var1_1 = var1_1.c((String)var4_2);
        }
        var4_2 = var1_1;
        if (!var1_1.startsWith("http")) {
            var4_2 = var1_1;
            if (!var1_1.isEmpty()) {
                var4_2 = com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.m, var1_1);
            }
        }
        var5_3.n((String)var4_2);
        var1_1 = var6_5.m0(".video-info-item").iterator();
        while (var1_1.hasNext()) {
            var4_2 = ((com.github.catvod.spider.merge.e1.m)var1_1.next()).s0();
            if (var4_2.startsWith("\u5bfc\u6f14\uff1a")) {
                var5_3.k(var4_2.replace("\u5bfc\u6f14\uff1a", "").trim());
                continue;
            }
            if (!var4_2.startsWith("\u4e3b\u6f14\uff1a")) continue;
            var5_3.h(var4_2.replace("\u4e3b\u6f14\uff1a", "").trim());
        }
        var1_1 = var6_5.n0(".vod_content span, .detail-desc-text");
        if (var1_1 != null) {
            var5_3.j(var1_1.s0().trim());
        }
        var4_2 = new ArrayList<Object>();
        for (com.github.catvod.spider.merge.e1.m var8_7 : var6_5.m0(".pan-link-meta, .pan-link-actions a[href], [data-copy]")) {
            var1_1 = "data-copy";
            if (var8_7.n("data-copy")) ** GOTO lbl-1000
            var1_1 = "href";
            if (var8_7.n("href")) lbl-1000:
            // 2 sources

            {
                var1_1 = var8_7.c((String)var1_1);
            } else {
                var1_1 = var8_7.s0().trim();
            }
            if (!var1_1.startsWith("http") || var1_1.contains("******") || var4_2.contains(var1_1)) continue;
            var4_2.add(var1_1);
        }
        var1_1 = var6_5.m0("[class*=download-module], [class*=rb4k-download-module], .rb4k-download-module");
        if (var4_2.isEmpty() && var1_1.isEmpty()) {
            var1_1 = var3_4.split("rb4k-download-module");
            for (var2_8 = 1; var2_8 < ((Object)var1_1).length; ++var2_8) {
                var3_4 = var1_1[var2_8];
                var6_5 = Pattern.compile("<h4>(.*?)</h4>\\s*<i>(.*?)</i>", 32).matcher((CharSequence)var3_4);
                while (var6_5.find()) {
                    var3_4 = var6_5.group(2).trim();
                    if (var3_4.contains("******") || var4_2.contains(var3_4)) continue;
                    var4_2.add(var3_4);
                }
            }
        } else if (var4_2.isEmpty()) {
            var6_5 = var1_1.iterator();
            while (var6_5.hasNext()) {
                var1_1 = ((com.github.catvod.spider.merge.e1.m)var6_5.next()).m0("i").iterator();
                while (var1_1.hasNext()) {
                    var3_4 = ((com.github.catvod.spider.merge.e1.m)var1_1.next()).s0().trim();
                    if (!var3_4.startsWith("http") || var3_4.contains("******") || var4_2.contains(var3_4)) continue;
                    var4_2.add(var3_4);
                }
            }
        }
        NetPan.initOrder(var4_2);
        var5_3.o(super.detailContentVodPlayFrom((List)var4_2));
        var5_3.p(super.detailContentVodPlayUrl(var5_3.d(), (List)var4_2));
        return com.github.catvod.spider.merge.K.f.n((h)var5_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        String string;
        CharSequence charSequence;
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList;
        block10: {
            arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
            arrayList.add(new com.github.catvod.spider.merge.K.a("1", "\u7535\u5f71"));
            arrayList.add(new com.github.catvod.spider.merge.K.a("2", "\u8fde\u7eed\u5267"));
            arrayList.add(new com.github.catvod.spider.merge.K.a("3", "\u7efc\u827a"));
            arrayList.add(new com.github.catvod.spider.merge.K.a("4", "\u52a8\u6f2b"));
            charSequence = null;
            String string2 = null;
            if (!bl) return com.github.catvod.spider.merge.K.f.t(arrayList, new ArrayList<h>(), charSequence);
            string = string2;
            if (com.github.catvod.spider.merge.R0.e.d(this.q)) {
                try {
                    string = this.q;
                    bl = string.startsWith("./");
                    charSequence = string;
                    if (bl) {
                        charSequence = string;
                        if (com.github.catvod.spider.merge.R0.e.d(this.p)) {
                            charSequence = string;
                            if (this.p.startsWith("http")) {
                                int n2 = this.p.lastIndexOf(47);
                                n2 = this.p.lastIndexOf(47, n2 - 1);
                                charSequence = string;
                                if (n2 != -1) {
                                    String string3 = this.p.substring(0, n2 + 1);
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append(string3);
                                    ((StringBuilder)charSequence).append(string.replace("./", ""));
                                    charSequence = ((StringBuilder)charSequence).toString();
                                }
                            }
                        }
                    }
                    string = string2;
                    if (!((String)charSequence).startsWith("http")) break block10;
                    charSequence = com.github.catvod.spider.merge.f0.d.k((String)charSequence);
                    string = string2;
                    if (com.github.catvod.spider.merge.R0.e.d(charSequence)) {
                        string = new JSONObject((String)charSequence);
                        com.github.catvod.spider.merge.i0.a.c((JSONObject)string);
                    }
                }
                catch (Exception exception) {
                    com.github.catvod.spider.merge.I.r.f(exception, com.github.catvod.spider.merge.C.a.c("[WoNiu] load filter failed: "));
                    string = string2;
                }
            }
        }
        charSequence = string;
        if (string != null) return com.github.catvod.spider.merge.K.f.t(arrayList, new ArrayList<h>(), charSequence);
        try {
            charSequence = new JSONObject("{\"1\":[{\"key\":\"by\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u65f6\u95f4\u6392\u5e8f\",\"v\":\"time\"},{\"n\":\"\u4eba\u6c14\u6392\u5e8f\",\"v\":\"hits\"},{\"n\":\"\u8bc4\u5206\u6392\u5e8f\",\"v\":\"score\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4efd\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"}]}],\"2\":[{\"key\":\"by\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u65f6\u95f4\u6392\u5e8f\",\"v\":\"time\"},{\"n\":\"\u4eba\u6c14\u6392\u5e8f\",\"v\":\"hits\"},{\"n\":\"\u8bc4\u5206\u6392\u5e8f\",\"v\":\"score\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4efd\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"}]}],\"4\":[{\"key\":\"by\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u65f6\u95f4\u6392\u5e8f\",\"v\":\"time\"},{\"n\":\"\u4eba\u6c14\u6392\u5e8f\",\"v\":\"hits\"},{\"n\":\"\u8bc4\u5206\u6392\u5e8f\",\"v\":\"score\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4efd\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"}]}]}");
            return com.github.catvod.spider.merge.K.f.t(arrayList, new ArrayList<h>(), charSequence);
        }
        catch (Exception exception) {
            charSequence = string;
            return com.github.catvod.spider.merge.K.f.t(arrayList, new ArrayList<h>(), charSequence);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context object, String object2) {
        super.init((Context)object, (String)object2);
        try {
            block27: {
                block41: {
                    int n2;
                    int n3;
                    block39: {
                        block40: {
                            block38: {
                                boolean bl;
                                block28: {
                                    block37: {
                                        block36: {
                                            block35: {
                                                block34: {
                                                    block33: {
                                                        block32: {
                                                            block31: {
                                                                block30: {
                                                                    block29: {
                                                                        bl = com.github.catvod.spider.merge.R0.e.d((CharSequence)object2);
                                                                        if (!bl) break block27;
                                                                        object = ((String)object2).trim();
                                                                        if (!((String)object).startsWith("{")) break block28;
                                                                        object2 = com.github.catvod.spider.merge.J.j.e((String)object);
                                                                        if (!object2.has("siteUrl") || object2.get("siteUrl").isJsonNull()) break block29;
                                                                        object = object2.get("siteUrl");
                                                                        break block30;
                                                                    }
                                                                    if (!object2.has("host") || object2.get("host").isJsonNull()) break block31;
                                                                    object = object2.get("host");
                                                                }
                                                                object = object.getAsString();
                                                                this.m = object;
                                                            }
                                                            if (!object2.has("username") || object2.get("username").isJsonNull()) break block32;
                                                            object = object2.get("username");
                                                            break block33;
                                                        }
                                                        if (!object2.has("user_name") || object2.get("user_name").isJsonNull()) break block34;
                                                        object = object2.get("user_name");
                                                    }
                                                    object = object.getAsString();
                                                    this.n = object;
                                                }
                                                if (!object2.has("password") || object2.get("password").isJsonNull()) break block35;
                                                object = object2.get("password");
                                                break block36;
                                            }
                                            if (!object2.has("user_pwd") || object2.get("user_pwd").isJsonNull()) break block37;
                                            object = object2.get("user_pwd");
                                        }
                                        object = object.getAsString();
                                        this.o = object;
                                    }
                                    if (object2.has("cookie") && !object2.get("cookie").isJsonNull()) {
                                        r = object2.get("cookie").getAsString();
                                    }
                                    if (object2.has("commonConfig") && !object2.get("commonConfig").isJsonNull()) {
                                        this.p = object2.get("commonConfig").getAsString();
                                    }
                                    if (object2.has("filter") && !object2.get("filter").isJsonNull()) {
                                        this.q = object2.get("filter").getAsString();
                                    }
                                    break block27;
                                }
                                bl = ((String)object).contains("$$$");
                                if (!bl) break block38;
                                object = ((String)object).split("\\$\\$\\$");
                                n3 = ((Object)object).length;
                                for (n2 = 0; n2 < n3; ++n2) {
                                    object2 = ((String)object[n2]).trim();
                                    if (!((String)object2).startsWith("http://") && !((String)object2).startsWith("https://")) continue;
                                    this.m = object2;
                                }
                                break block39;
                            }
                            if (!((String)object).contains(":") || ((String)object).startsWith("http")) break block40;
                            object = ((String)object).split(":", 2);
                            this.n = ((String)object[0]).trim();
                            object = ((String)object[1]).trim();
                            break block41;
                        }
                        if (((String)object).startsWith("http")) {
                            this.m = object;
                        }
                        break block27;
                    }
                    for (n2 = 0; n2 < ((Object)object).length; ++n2) {
                        if (!((String)object[n2]).trim().equalsIgnoreCase("WONIU") || (n3 = n2 + 2) >= ((Object)object).length) continue;
                        this.n = ((String)object[n2 + 1]).trim();
                        this.o = ((String)object[n3]).trim();
                        break;
                    }
                    if (!TextUtils.isEmpty((CharSequence)this.n)) break block27;
                    object2 = new ArrayList();
                    n3 = ((Object)object).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        String string = ((String)object[n2]).trim();
                        if (string.isEmpty() || string.startsWith("http") || string.startsWith("./") || string.startsWith("/") || string.endsWith(".json") || string.endsWith(".txt")) continue;
                        ((ArrayList)object2).add(string);
                    }
                    if (((ArrayList)object2).size() < 2) break block27;
                    this.n = (String)((ArrayList)object2).get(0);
                    object = (String)((ArrayList)object2).get(1);
                }
                this.o = object;
            }
            if ((object = this.m) != null && ((String)object).endsWith("/")) {
                object = this.m;
                this.m = ((String)object).substring(0, ((String)object).length() - 1);
            }
            if (TextUtils.isEmpty((CharSequence)r) && !com.github.catvod.spider.merge.R0.e.b(this.n)) {
                r = object = com.github.catvod.spider.merge.l0.b.h(com.github.catvod.spider.merge.l0.b.d("woniu_cookie_", this.n, this.m));
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    SpiderDebug.log((String)"[WoNiu] \u8bfb\u53d6\u672c\u5730 Cookie \u6210\u529f");
                }
            }
            this.o();
            return;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.I.r.f(exception, com.github.catvod.spider.merge.C.a.c("[WoNiu] init error: "));
        }
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

