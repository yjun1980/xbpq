/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.spider.InitOrigin
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.C;
import com.github.catvod.spider.merge.UY.G;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.N.b;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class I {
    public final HashMap a = new HashMap();
    public final String b;
    public final G c;
    public final A d;
    public volatile boolean e = false;

    public I() {
        this.b = "";
        InitOrigin.checkPermission();
        Object object = C.a;
        this.c = object;
        this.d = ((G)object).a;
        object = com.github.catvod.spider.merge.KT.C.P("tianyi_portal_session");
        if (com.github.catvod.spider.merge.xc.A0.c.d((CharSequence)object)) {
            this.b = object;
        }
    }

    public static HashMap c() {
        HashMap hashMap = m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.160 Safari/537.36", "Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("accept", "application/json;charset=UTF-8");
        return hashMap;
    }

    public static com.github.catvod.spider.merge.xc.N.c d(String object) {
        Object object2 = Pattern.compile("\u8bbf\u95ee\u7801[\uff1a:]([a-zA-Z0-9]+)").matcher((CharSequence)object);
        object2 = ((Matcher)object2).find() ? ((Matcher)object2).group(1) : "";
        Matcher matcher = Pattern.compile("https?:\\/\\/cloud\\.189\\.cn\\/web\\/share\\?code=([^&\\s]+)").matcher((CharSequence)object);
        object = matcher.find() && matcher.group(1) != null ? matcher.group(1) : (((Matcher)(object = Pattern.compile("https?:\\/\\/cloud\\.189\\.cn\\/t/([^\\s]+)").matcher((CharSequence)object))).find() ? ((Matcher)object).group(1) : null);
        object = new com.github.catvod.spider.merge.xc.N.c((String)object);
        ((com.github.catvod.spider.merge.xc.N.c)object).c = object2;
        return object;
    }

    public static JsonArray g(com.github.catvod.spider.merge.xc.N.c c2, ArrayList arrayList, String string, String object, Integer object2) {
        int n2 = object2 != null ? (Integer)object2 : 1;
        object2 = new StringBuilder("listShareDir.action?pageNum=");
        ((StringBuilder)object2).append((Object)n2);
        ((StringBuilder)object2).append("&pageSize=200&fileId=");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("&shareDirFileId=");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("&isFolder=");
        ((StringBuilder)object2).append(c2.e);
        ((StringBuilder)object2).append("&shareId=");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("&shareMode=");
        ((StringBuilder)object2).append(c2.d);
        ((StringBuilder)object2).append("&iconOption=5&orderBy=filename&descending=false&accessCode=");
        ((StringBuilder)object2).append(c2.c);
        JsonObject jsonObject = com.github.catvod.spider.merge.KT.C.R(I.i(((StringBuilder)object2).toString(), Collections.emptyMap(), Collections.emptyMap(), 0));
        if (jsonObject.get("res_code") != null && jsonObject.get("res_code").getAsInt() == 0) {
            if (jsonObject.get("fileListAO") == null) {
                return new JsonArray();
            }
            if (jsonObject.get("fileListAO").getAsJsonObject().get("count").getAsInt() == 0 && jsonObject.get("fileListAO").getAsJsonObject().get("fileListSize").getAsInt() == 0) {
                return new JsonArray();
            }
            JsonArray jsonArray = jsonObject.get("fileListAO").getAsJsonObject().get("fileList").getAsJsonArray();
            JsonArray jsonArray2 = jsonObject.get("fileListAO").getAsJsonObject().get("folderList").getAsJsonArray();
            for (Object object3 : jsonArray) {
                if (object3.getAsJsonObject().get("mediaType").getAsInt() != 3 || object3.getAsJsonObject().get("size").getAsLong() < 0x500000L) continue;
                JsonObject jsonObject2 = object3.getAsJsonObject();
                String string2 = c2.a;
                String string3 = c2.c;
                b b2 = new b();
                object3 = jsonObject2.get("id");
                String string4 = "";
                object3 = object3 != null ? jsonObject2.get("id").getAsString() : "";
                b2.a = object3;
                b2.b = string2;
                object3 = string3 != null ? string3 : "";
                b2.c = object3;
                object3 = string4;
                if (jsonObject2.get("name") != null) {
                    object3 = jsonObject2.get("name").getAsString();
                }
                b2.d = object3;
                double d2 = jsonObject2.get("size") != null ? jsonObject2.get("size").getAsDouble() : 0.0;
                b2.e = d2;
                arrayList.add(b2);
            }
            int n3 = jsonObject.get("fileListAO").getAsJsonObject().get("count").getAsInt();
            int n4 = jsonArray.size();
            if (n3 > jsonArray2.size() + n4) {
                jsonArray.addAll(I.g(c2, arrayList, string, (String)object, n2 + 1));
            }
            object = jsonArray2.iterator();
            while (object.hasNext()) {
                jsonArray.addAll(I.g(c2, arrayList, string, ((JsonElement)object.next()).getAsJsonObject().get("id").getAsString(), null));
            }
            return jsonArray;
        }
        return new JsonArray();
    }

    public static String i(String string, Map map, Map map2, Integer object) {
        int n2 = (Integer)object;
        object = A.e(m.q("https://cloud.189.cn/api/open/share/", string), map, I.c());
        if (((X)object).a != 200 && n2 > 0) {
            Thread.sleep(1000L);
            return I.i(string, map, map2, n2 - 1);
        }
        return ((X)object).b();
    }

    public final String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("https://cloud.189.cn/api/portal/getNewVlcVideoPlayUrl.action?shareId=");
        stringBuilder.append(string);
        stringBuilder.append("&dt=1&fileId=");
        stringBuilder.append(string2);
        stringBuilder.append("&type=4&noCache=");
        stringBuilder.append(System.currentTimeMillis());
        if (com.github.catvod.spider.merge.xc.A0.c.d(string3)) {
            stringBuilder.append("&accessCode=");
            stringBuilder.append(string3);
        }
        if ((string = com.github.catvod.spider.merge.KT.C.R(A.e(stringBuilder.toString(), new HashMap(), this.b()).b())).has("errorCode")) {
            return "";
        }
        if (string.has("res_code") && string.get("res_code").getAsInt() == 0) {
            if (string.has("high") && !string.get("high").isJsonNull()) {
                return string.get("high").getAsJsonObject().get("url").getAsString();
            }
            if (string.has("normal") && !string.get("normal").isJsonNull()) {
                return string.get("normal").getAsJsonObject().get("url").getAsString();
            }
        }
        return "";
    }

    public final HashMap b() {
        HashMap hashMap = I.c();
        hashMap.put("cookie", this.d.h("https://cloud.189.cn/api/portal/getNewVlcVideoPlayUrl.action"));
        if (com.github.catvod.spider.merge.xc.A0.c.d(this.b)) {
            hashMap.put("sessionKey", this.b);
        }
        return hashMap;
    }

    public final k e(com.github.catvod.spider.merge.xc.N.c object) {
        int n2;
        Serializable serializable;
        Serializable serializable2;
        Object object2;
        Object object3;
        Object object4 = this.a;
        boolean bl = ((HashMap)object4).containsKey(((com.github.catvod.spider.merge.xc.N.c)object).a);
        int n3 = 0;
        if (!bl) {
            ((HashMap)object4).remove(((com.github.catvod.spider.merge.xc.N.c)object).a);
            object3 = ((com.github.catvod.spider.merge.xc.N.c)object).a;
            object2 = ((com.github.catvod.spider.merge.xc.N.c)object).c;
            serializable2 = new StringBuilder("getShareInfoByCodeV2.action?noCache=");
            ((StringBuilder)serializable2).append(Math.random());
            ((StringBuilder)serializable2).append("&shareCode=");
            ((StringBuilder)serializable2).append((String)object3);
            serializable2 = com.github.catvod.spider.merge.KT.C.R(I.i(((StringBuilder)serializable2).toString(), new HashMap(), new HashMap(), 0));
            if (serializable2.get("res_code") != null && serializable2.get("res_code").getAsInt() == 0 && serializable2.get("fileId") != null) {
                if (serializable2.get("needAccessCode") != null && serializable2.get("needAccessCode").getAsInt() == 1 && object2 != null && !((String)object2).isEmpty()) {
                    serializable = new StringBuilder("checkAccessCode.action?noCache=");
                    ((StringBuilder)serializable).append(Math.random());
                    ((StringBuilder)serializable).append("&shareCode=");
                    ((StringBuilder)serializable).append((String)object3);
                    ((StringBuilder)serializable).append("&accessCode=");
                    ((StringBuilder)serializable).append((String)object2);
                    object2 = com.github.catvod.spider.merge.KT.C.R(I.i(((StringBuilder)serializable).toString(), new HashMap(), new HashMap(), 0));
                    if (object2.get("shareId") != null) {
                        serializable2.add("shareId", object2.get("shareId"));
                    }
                }
                if (serializable2.get("shareId") != null) {
                    ((com.github.catvod.spider.merge.xc.N.c)object).a = serializable2.get("shareId").getAsString();
                }
                n2 = serializable2.get("shareMode") != null ? serializable2.get("shareMode").getAsInt() : 0;
                ((com.github.catvod.spider.merge.xc.N.c)object).d = n2;
                bl = serializable2.get("isFolder") != null && serializable2.get("isFolder").getAsBoolean();
                ((com.github.catvod.spider.merge.xc.N.c)object).e = bl;
                serializable2.get("fileId").getAsString();
                ((com.github.catvod.spider.merge.xc.N.c)object).b = serializable2.get("fileId").getAsString();
                ((HashMap)object4).put(((com.github.catvod.spider.merge.xc.N.c)object).a, serializable2);
            }
        }
        if (!((HashMap)object4).containsKey(((com.github.catvod.spider.merge.xc.N.c)object).a)) {
            return null;
        }
        object2 = new ArrayList();
        new ArrayList();
        I.g((com.github.catvod.spider.merge.xc.N.c)object, (ArrayList)object2, ((com.github.catvod.spider.merge.xc.N.c)object).a, ((com.github.catvod.spider.merge.xc.N.c)object).b, 1);
        object3 = new ArrayList();
        ((ArrayList)object3).add("\u5929\u7ffc");
        serializable2 = new ArrayList();
        if (((ArrayList)object2).isEmpty()) {
            return null;
        }
        for (n2 = n3; n2 < ((ArrayList)object3).size(); ++n2) {
            serializable = new ArrayList();
            Iterator iterator = ((ArrayList)object2).iterator();
            while (iterator.hasNext()) {
                b b2 = (b)iterator.next();
                object4 = new StringBuilder();
                object = b2.d.isEmpty() ? "" : b2.d;
                CharSequence charSequence = new StringBuilder("[");
                ((StringBuilder)charSequence).append(H.i(b2.e));
                ((StringBuilder)charSequence).append("] ");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)object4).append(((StringBuilder)charSequence).toString());
                ((StringBuilder)object4).append("$");
                object = b2.a.isEmpty() ? "" : b2.a;
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append("++");
                ((StringBuilder)object4).append(b2.b);
                object4 = ((StringBuilder)object4).toString();
                charSequence = b2.c;
                object = object4;
                if (charSequence != null) {
                    object = object4;
                    if (!((String)charSequence).isEmpty()) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object4);
                        ((StringBuilder)object).append("++");
                        ((StringBuilder)object).append(b2.c);
                        object = ((StringBuilder)object).toString();
                    }
                }
                ((ArrayList)serializable).add(object);
            }
            ((ArrayList)serializable2).add(TextUtils.join((CharSequence)"#", serializable));
        }
        object = new k();
        ((k)object).l("");
        ((k)object).j("");
        ((k)object).n("");
        ((k)object).m("");
        ((k)object).p(TextUtils.join((CharSequence)"$$$", (Iterable)((Object)serializable2)));
        ((k)object).o(TextUtils.join((CharSequence)"$$$", (Iterable)object3));
        ((k)object).g("\u5929\u7ffc\u4e91\u76d8");
        return object;
    }

    public final boolean f() {
        Object object = this.d;
        if (((HashMap)((A)object).b).isEmpty()) {
            return false;
        }
        object = ((HashMap)((A)object).b).values().iterator();
        while (object.hasNext()) {
            if (!com.github.catvod.spider.merge.xc.A0.c.c((String)((Map)object.next()).get("SSON"))) continue;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final String h(String[] var1_1) {
        block18: {
            var7_5 = var1_1[0];
            var2_6 = ((String[])var1_1).length;
            var4_7 = "";
            var5_8 = var2_6 > 1 ? var1_1[1] : "";
            var6_9 = ((String[])var1_1).length > 2 ? var1_1[2] : "";
            var1_1 = new StringBuilder("https://cloud.189.cn/api/portal/getNewVlcVideoPlayUrl.action?shareId=");
            var1_1.append((String)var5_8);
            var1_1.append("&dt=1&fileId=");
            var1_1.append(var7_5);
            var1_1.append("&type=4&noCache=");
            var1_1.append(System.currentTimeMillis());
            if (com.github.catvod.spider.merge.xc.A0.c.d(var6_9)) {
                var1_1.append("&accessCode=");
                var1_1.append(var6_9);
            }
            if (!(var8_10 = com.github.catvod.spider.merge.KT.C.R(A.e(var1_1.toString(), new HashMap<K, V>(), this.b()).b())).has("res_code") || var8_10.get("res_code").getAsInt() != 0) ** GOTO lbl-1000
            if (var8_10.has("high") && !var8_10.get("high").isJsonNull()) {
                var1_1 = var8_10.get("high").getAsJsonObject().get("url").getAsString();
            } else if (var8_10.has("normal") && !var8_10.get("normal").isJsonNull()) {
                var1_1 = var8_10.get("normal").getAsJsonObject().get("url").getAsString();
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = var4_7;
                if (var8_10.has("errorCode")) {
                    var1_1 = var4_7;
                    if ("InvalidSessionKey".equals(var8_10.get("errorCode").getAsString())) {
                        block17: {
                            try {
                                this.c.r();
                                var1_1 = this.a((String)var5_8, var7_5, var6_9);
                                var3_11 = com.github.catvod.spider.merge.xc.A0.c.d((CharSequence)var1_1);
                                if (!var3_11) break block17;
                                break block18;
                            }
                            catch (Exception var1_2) {
                                // empty catch block
                            }
                        }
                        var1_1 = var4_7;
                        if (!this.e) {
                            block19: {
                                this.e = true;
                                var1_1 = var4_7;
                                if (!this.c.o()) break block19;
                                var1_1 = var4_7;
                                try {
                                    if (!this.f()) break block19;
                                    System.currentTimeMillis();
                                    var1_1 = this.a((String)var5_8, var7_5, var6_9);
                                }
                                catch (Throwable var1_3) {
                                    this.e = false;
                                    throw var1_3;
                                }
                            }
lbl55:
                            // 2 sources

                            while (true) {
                                this.e = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)var1_1)) {
            return g.c("\u83b7\u53d6\u64ad\u653e\u5730\u5740\u5931\u8d25");
        }
        var4_7 = m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.160 Safari/537.36", "Referer", "https://cloud.189.cn/");
        var5_8 = this.d.h("https://cloud.189.cn/");
        if (com.github.catvod.spider.merge.xc.A0.c.d((CharSequence)var5_8)) {
            var4_7.put("Cookie", var5_8);
        }
        var5_8 = new g();
        var5_8.w((String)var1_1);
        var5_8.j();
        var5_8.g((HashMap)var4_7);
        return var5_8.toString();
        catch (Exception var1_4) {
            var1_1 = var4_7;
            ** continue;
        }
    }

    public final void j(String object) {
        Object object2;
        if (com.github.catvod.spider.merge.xc.A0.c.c(new CharSequence[]{object}) && (object2 = com.github.catvod.spider.merge.KT.C.R((String)object)).has("username") && object2.has("password")) {
            object = this.c.a;
            object.getClass();
            for (Map.Entry entry : object2.entrySet()) {
                String string = (String)entry.getKey();
                entry = ((JsonElement)entry.getValue()).getAsJsonObject();
                HashMap<String, String> hashMap = new HashMap<String, String>();
                for (String string2 : entry.keySet()) {
                    hashMap.put(string2, entry.get(string2).getAsString());
                }
                ((HashMap)((A)object).b).put(string, hashMap);
            }
        }
    }
}

