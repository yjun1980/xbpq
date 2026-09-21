/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.MP.b;
import com.github.catvod.spider.merge.MP.c;
import com.github.catvod.spider.merge.MP.d;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

public class App99
extends Spider {
    public final SecureRandom a = new SecureRandom();
    public final HashMap b = new HashMap();
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
    public String g = "";
    public String h = "0b4328287a5d953e";

    public static void a(ArrayList arrayList, String string, String string2, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList<c> arrayList2 = new ArrayList<c>();
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                String string3 = jSONArray.optString(i2);
                if (TextUtils.isEmpty((CharSequence)string3)) continue;
                arrayList2.add(new c(string3, string3));
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new d(string, string2, arrayList2));
            }
        }
    }

    public static void b(JSONObject jSONObject, HashMap object, String string) {
        if (object == null) {
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)(object = (String)((HashMap)object).get(string)))) {
            jSONObject.put(string, object);
        }
    }

    public static ArrayList d(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        App99.a(arrayList, "class", "\u7c7b\u578b", jSONObject.optJSONArray("class"));
        App99.a(arrayList, "area", "\u5730\u533a", jSONObject.optJSONArray("areas"));
        App99.a(arrayList, "lang", "\u8bed\u8a00", jSONObject.optJSONArray("lang"));
        App99.a(arrayList, "year", "\u5e74\u4efd", jSONObject.optJSONArray("years"));
        return arrayList;
    }

    public static k l(JSONObject jSONObject) {
        k k2 = new k();
        k2.l(jSONObject.optString("id"));
        k2.m(jSONObject.optString("name"));
        k2.n(jSONObject.optString("pic"));
        k2.q(jSONObject.optString("remarks"));
        k2.s(jSONObject.optString("year"));
        k2.j(jSONObject.optString("content", jSONObject.optString("blurb")));
        k2.g(jSONObject.optString("class"));
        k2.i(jSONObject.optString("area"));
        k2.h(jSONObject.optString("actor"));
        k2.k(jSONObject.optString("director"));
        return k2;
    }

    public static ArrayList m(JSONArray jSONArray) {
        ArrayList<k> arrayList = new ArrayList<k>();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject = jSONArray.optJSONObject(i2);
            if (jSONObject == null) continue;
            arrayList.add(App99.l(jSONObject));
        }
        return arrayList;
    }

    public final HashMap c() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", this.f);
        hashMap.put("Accept", "application/json");
        hashMap.put("Content-Type", "application/json");
        hashMap.put("client_type", "android");
        return hashMap;
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> hashMap) {
        int n2;
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Throwable throwable) {
            n2 = 1;
        }
        try {
            object2 = new JSONObject();
            object2.put("kw", (Object)"");
            object2.put("page", (Object)String.valueOf(n2));
            object2.put("limit", 21);
            object2.put("pid", object);
            object2.put("orderBy", (Object)"time");
            object2.put("isCategory", 1);
            object2.put("token", (Object)this.d);
            App99.b((JSONObject)object2, hashMap, "class");
            App99.b((JSONObject)object2, hashMap, "area");
            App99.b((JSONObject)object2, hashMap, "lang");
            App99.b((JSONObject)object2, hashMap, "year");
            object2 = this.i("/vod/search", (JSONObject)object2);
            object = App99.m(object2.optJSONArray("data"));
            int n3 = object2.optInt("page_count", n2 + 1);
            object2 = new g();
            ((g)object2).y((List)object);
            ((g)object2).k(n2, n3, 21, Integer.MAX_VALUE);
            object = ((g)object2).toString();
            return object;
        }
        catch (Throwable throwable) {
            object = new StringBuilder("[App99] category failed: ");
            ((StringBuilder)object).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new g();
            ((g)object).y(new ArrayList());
            ((g)object).k(n2, n2 + 1, 21, Integer.MAX_VALUE);
            return ((g)object).toString();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String detailContent(List<String> object) {
        Throwable throwable2;
        block3: {
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("id", (Object)object.get(0));
                jSONObject.put("eps", (Object)"1");
                jSONObject.put("v", (Object)"2.0.0");
                jSONObject.put("pl", 1);
                jSONObject.put("token", (Object)this.d);
                jSONObject = this.i("/vod/detail", jSONObject).optJSONObject("data");
                if (jSONObject == null) {
                    object = new k();
                    return com.github.catvod.spider.merge.MP.g.n((k)object);
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object = App99.l(jSONObject);
            this.e((k)object, jSONObject);
            return com.github.catvod.spider.merge.MP.g.n((k)object);
        }
        StringBuilder stringBuilder = new StringBuilder("[App99] detail failed: ");
        stringBuilder.append(throwable2.getMessage());
        SpiderDebug.log((String)stringBuilder.toString());
        return com.github.catvod.spider.merge.MP.g.n(new k());
    }

    public final void e(k k2, JSONObject object) {
        int n2;
        Object object2;
        String[] stringArray;
        Object object3 = this.f();
        Object object4 = new HashMap<String, String>();
        if (object3 != null) {
            stringArray = object3.keys();
            while (stringArray.hasNext()) {
                object2 = object3.optJSONObject((String)stringArray.next());
                if (object2 == null) continue;
                ((HashMap)object4).put(object2.optString("code").trim(), object2.optString("name").trim());
            }
        }
        String string = object.optString("name");
        object2 = object.optString("play_from").split("\\$\\$\\$");
        stringArray = object.optString("play_url").split("\\$\\$\\$");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int n3 = ((JSONObject)object2).length;
        for (n2 = 0; n2 < n3; ++n2) {
            object3 = object2[n2];
            if (stringBuilder.length() > 0) {
                stringBuilder.append("$$$");
            }
            if (TextUtils.isEmpty((CharSequence)(object = (String)((HashMap)object4).get(object3)))) {
                object = object3;
            }
            stringBuilder.append((String)object);
        }
        object = object2;
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            object2 = n2 < ((JSONObject)object).length ? object[n2] : "";
            StringBuilder stringBuilder3 = new StringBuilder();
            String[] stringArray2 = stringArray[n2].split("#");
            int n4 = stringArray2.length;
            for (n3 = 0; n3 < n4; ++n3) {
                String[] stringArray3 = stringArray2[n3].split("\\$", 2);
                if (stringArray3.length < 2) continue;
                String string2 = stringArray3[0];
                object4 = string2.replaceAll("\\D+", "");
                object3 = object4;
                if (TextUtils.isEmpty((CharSequence)object4)) {
                    object3 = "1";
                }
                if (stringBuilder3.length() > 0) {
                    stringBuilder3.append("#");
                }
                stringBuilder3.append(string2);
                stringBuilder3.append("$");
                stringBuilder3.append(stringArray3[1]);
                stringBuilder3.append("@");
                stringBuilder3.append((String)object2);
                stringBuilder3.append("@");
                stringBuilder3.append(string);
                stringBuilder3.append("@");
                stringBuilder3.append((String)object3);
            }
            if (stringBuilder2.length() > 0 && stringBuilder3.length() > 0) {
                stringBuilder2.append("$$$");
            }
            stringBuilder2.append((CharSequence)stringBuilder3);
        }
        k2.o(stringBuilder.toString());
        k2.p(stringBuilder2.toString());
    }

    public final JSONObject f() {
        Object object = this.b.get("player");
        object = object instanceof JSONObject ? (JSONObject)object : null;
        return object;
    }

    public final void g(String string, String string2, String string3, String string4, String string5, String string6) {
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        String string7 = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", (Object)"android");
        jSONObject.put("name", (Object)"xiaomi");
        jSONObject.put("version", (Object)"15");
        jSONObject.put("sdkInt", 32);
        jSONObject.put("device", (Object)"xiaomi");
        jSONObject.put("brand", (Object)"xiaomi");
        jSONObject.put("manufacturer", (Object)"xiaomi");
        jSONObject.put("product", (Object)"b0q");
        jSONObject.put("hardware", (Object)"xiaomi");
        jSONObject.put("isPhysicalDevice", true);
        jSONObject.put("androidId", (Object)"V417IR");
        jSONObject.put("bootloader", (Object)"unknown");
        jSONObject.put("display", (Object)"V417IR release-keys");
        jSONObject.put("host", (Object)"a11-gz01-test");
        jSONObject.put("tags", (Object)"release-keys");
        jSONObject.put("type", (Object)"user");
        jSONObject.put("finger", (Object)"xiaomi/b0q/b0q:15/V619IR/613:user/release-keys");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("version", (Object)string5);
        jSONObject2.put("name", (Object)string2);
        jSONObject2.put("package", (Object)string6);
        jSONObject2.put("buildNumber", (Object)string4);
        jSONObject2.put("buildSignature", (Object)string3);
        jSONObject2.put("install", l2);
        jSONObject2.put("update", l2);
        jSONObject.put("app", (Object)jSONObject2);
        jSONObject.put("did", (Object)string7);
        jSONObject.put("apiVersion", (Object)"v2");
        jSONObject.put("channel", (Object)"");
        jSONObject.put("token", (Object)"");
        string = this.i(string, jSONObject).optJSONObject("userInfo");
        if (string != null) {
            this.d = string.optString("user_token", this.d);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String h(String var1_1, JSONObject var2_2) {
        var8_3 /* !! */  = this.b.get("parses");
        var8_3 /* !! */  = var8_3 /* !! */  instanceof JSONArray != false ? (JSONArray)var8_3 /* !! */  : null;
        if (var8_3 /* !! */  == null) {
            return "";
        }
        var2_2 = var2_2.optString("parseUrl", "");
        block2: for (var3_4 = 0; var3_4 < var8_3 /* !! */ .length(); ++var3_4) {
            var9_9 /* !! */  = var8_3 /* !! */ .optJSONObject(var3_4);
            if (var9_9 /* !! */  == null) continue;
            var6_7 = var9_9 /* !! */ .optInt("id");
            if (TextUtils.isEmpty((CharSequence)var2_2)) ** GOTO lbl16
            var10_11 = var2_2.split(",");
            var5_6 = ((String[])var10_11).length;
            for (var4_5 = 0; var4_5 < var5_6; ++var4_5) {
                if (!String.valueOf(var6_7).equals(var10_11[var4_5])) {
                    continue;
                }
lbl16:
                // 3 sources

                if (TextUtils.isEmpty((CharSequence)(var9_9 /* !! */  = var9_9 /* !! */ .optString("api_url")))) continue block2;
                try {
                    var10_11 = new StringBuilder();
                    var10_11.append((String)var9_9 /* !! */ );
                    var10_11.append(var1_1);
                    var10_11 = A.o(var10_11.toString(), null, this.c());
                    var9_9 /* !! */  = new JSONObject((String)var10_11);
                    var9_9 /* !! */  = var9_9 /* !! */ .optString("url", "");
                    var7_8 = TextUtils.isEmpty((CharSequence)var9_9 /* !! */ );
                    if (var7_8) continue block2;
                    return var9_9 /* !! */ ;
                }
                catch (Throwable var9_10) {
                    m.p(var9_10, new StringBuilder("[App99] parse failed: "));
                    continue block2;
                }
            }
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        CharSequence charSequence;
        try {
            ArrayList<b> arrayList = new ArrayList<b>();
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            charSequence = this.b.get("categories");
            charSequence = charSequence instanceof JSONArray ? (JSONArray)charSequence : null;
            if (charSequence == null) return com.github.catvod.spider.merge.MP.g.s(arrayList, this.j("", "1", true), linkedHashMap);
            int n2 = 0;
            while (n2 < charSequence.length()) {
                JSONObject jSONObject = charSequence.optJSONObject(n2);
                if (jSONObject != null) {
                    String string = jSONObject.optString("id");
                    Object object = new b(string, jSONObject.optString("name"));
                    arrayList.add((b)object);
                    object = App99.d(jSONObject.optJSONObject("type_extend"));
                    if (!((ArrayList)object).isEmpty()) {
                        ((AbstractMap)linkedHashMap).put(string, object);
                    }
                }
                ++n2;
            }
            return com.github.catvod.spider.merge.MP.g.s(arrayList, this.j("", "1", true), linkedHashMap);
        }
        catch (Throwable throwable) {}
        charSequence = new StringBuilder("[App99] home failed: ");
        charSequence.append(throwable.getMessage());
        SpiderDebug.log((String)charSequence.toString());
        return com.github.catvod.spider.merge.MP.g.u(new ArrayList(), new ArrayList());
    }

    public String homeVideoContent() {
        try {
            String string = com.github.catvod.spider.merge.MP.g.t(this.j("", "1", true));
            return string;
        }
        catch (Throwable throwable) {
            return com.github.catvod.spider.merge.MP.g.t(new ArrayList());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject i(String object, JSONObject object2) {
        int n2;
        Object object3 = new byte[16];
        this.a.nextBytes((byte[])object3);
        object3 = Base64.encodeToString((byte[])object3, (int)2);
        CharSequence charSequence = String.valueOf(System.currentTimeMillis());
        object2.put("timestamp", (Object)charSequence);
        object2.put("nonce", object3);
        Object object4 = object2.toString();
        Object object5 = new SecretKeySpec(this.e.replace("-", "").getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES");
        object2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        object2.init(1, (Key)object5);
        object4 = object2.doFinal(((String)object4).getBytes(com.github.catvod.spider.merge.UY.m.m()));
        object2 = object2.getIV();
        object5 = new byte[((JSONObject)object2).length + ((Object)object4).length];
        System.arraycopy(object2, 0, object5, 0, ((JSONObject)object2).length);
        System.arraycopy(object4, 0, object5, ((JSONObject)object2).length, ((Object)object4).length);
        object2 = Base64.encodeToString((byte[])object5, (int)2);
        object5 = m.h(new StringBuilder(), this.c, (String)object);
        object4 = this.c();
        ((HashMap)object4).put("uuid", this.e);
        ((HashMap)object4).put("timestamp", charSequence);
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(this.g);
        object = ((StringBuilder)object).toString();
        try {
            object = MessageDigest.getInstance("SHA-256").digest(((String)object).getBytes(com.github.catvod.spider.merge.UY.m.m()));
            charSequence = new StringBuilder();
            int n3 = ((Object)object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string = Integer.toHexString(object[n2] & 0xFF);
                if (string.length() == 1) {
                    ((StringBuilder)charSequence).append('0');
                }
                ((StringBuilder)charSequence).append(string);
            }
            object = ((StringBuilder)charSequence).toString();
        }
        catch (Throwable throwable) {
            object = "";
        }
        ((HashMap)object4).put("sign", object);
        ((HashMap)object4).put("nonce", object3);
        ((HashMap)object4).put("appkey", this.g);
        ((HashMap)object4).put("version", this.h);
        ((HashMap)object4).put("api_version", "v1");
        object = A.k((String)object5, (String)object2, (Map)object4).b();
        if (TextUtils.isEmpty((CharSequence)object)) {
            return new JSONObject();
        }
        object3 = this.e;
        object4 = Base64.decode((String)object, (int)0);
        object = new byte[16];
        n2 = ((Object)object4).length - 16;
        object2 = new byte[n2];
        System.arraycopy(object4, 0, object, 0, 16);
        System.arraycopy(object4, 16, object2, 0, n2);
        object4 = new SecretKeySpec(object3.replace("-", "").getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES");
        object3 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        object3.init(2, (Key)object4, new IvParameterSpec((byte[])object));
        object2 = object3.doFinal((byte[])object2);
        try {
            object = new Inflater();
            ((Inflater)object).setInput((byte[])object2);
            object4 = new ByteArrayOutputStream(((JSONObject)object2).length);
            object3 = new byte[1024];
            while (!((Inflater)object).finished() && (n2 = ((Inflater)object).inflate((byte[])object3)) > 0) {
                ((ByteArrayOutputStream)object4).write((byte[])object3, 0, n2);
            }
            ((Inflater)object).end();
            if (((ByteArrayOutputStream)object4).size() > 0) {
                object = ((ByteArrayOutputStream)object4).toString("UTF-8");
                return new JSONObject((String)object);
            }
        }
        catch (Throwable throwable) {}
        object = new String((byte[])object2, com.github.catvod.spider.merge.UY.m.m());
        return new JSONObject((String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init(Context object, String string) {
        Throwable throwable2;
        block7: {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                string = jSONObject.optString("host");
                object = string;
                if (string == null) {
                    string = "";
                } else {
                    while (true) {
                        string = object;
                        if (!((String)object).endsWith("/")) break;
                        object = ((String)object).substring(0, ((String)object).length() - 1);
                    }
                }
                this.c = string;
                this.g = jSONObject.optString("appkey");
                String string2 = jSONObject.optString("name");
                String string3 = jSONObject.optString("buildSignature");
                string = jSONObject.optString("buildNumber");
                String string4 = jSONObject.optString("versionName");
                object = jSONObject.optString("package");
                if (!(TextUtils.isEmpty((CharSequence)this.c) || TextUtils.isEmpty((CharSequence)this.g) || TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string3) || TextUtils.isEmpty((CharSequence)string) || TextUtils.isEmpty((CharSequence)string4) || TextUtils.isEmpty((CharSequence)object))) {
                    this.e = jSONObject.optString("uuid", UUID.randomUUID().toString());
                    this.f = jSONObject.optString("ua", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
                    this.h = jSONObject.optString("version", this.h);
                    this.k(string2, string3, string4);
                    this.g(jSONObject.optString("LoginPath", "/app/userInfo"), string2, string3, string, string4, (String)object);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            SpiderDebug.log((String)"[App99] missing required ext");
            return;
        }
        m.p(throwable2, new StringBuilder("[App99] init failed: "));
    }

    public final ArrayList j(String string, String string2, boolean bl) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kw", (Object)string);
        jSONObject.put("page", (Object)"1");
        jSONObject.put("limit", 21);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            jSONObject.put("pid", (Object)string2);
        }
        string = bl ? "time" : "vod_hits_month";
        jSONObject.put("orderBy", (Object)string);
        if (bl) {
            jSONObject.put("isCategory", 1);
        }
        if (!bl) {
            jSONObject.put("sort", (Object)"desc");
        }
        jSONObject.put("token", (Object)this.d);
        return App99.m(this.i("/vod/search", jSONObject).optJSONArray("data"));
    }

    public final void k(String string, String string2, String object) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", object);
        jSONObject.put("n", (Object)string);
        jSONObject.put("s", (Object)string2);
        jSONObject.put("pl", (Object)"1");
        jSONObject.put("apiVersion", (Object)"v2");
        jSONObject.put("token", (Object)"");
        object = this.i("/app/systemInit", jSONObject);
        string = object.optJSONObject("player");
        string2 = object.optJSONArray("parser_api");
        jSONObject = object.optJSONObject("categorys");
        object = this.b;
        if (string != null) {
            ((HashMap)object).put("player", string);
        }
        if (string2 != null) {
            ((HashMap)object).put("parses", string2);
        }
        if (jSONObject != null && jSONObject.optJSONArray("data") != null) {
            ((HashMap)object).put("categories", jSONObject.optJSONArray("data"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String string, String object, List<String> object2) {
        Throwable throwable2;
        block9: {
            Object object3;
            block8: {
                try {
                    object3 = ((String)object).split("@", 4);
                    if (((String[])object3).length <= 0) break block8;
                }
                catch (Throwable throwable2) {}
                object = object3[0];
            }
            Object object4 = ((String[])object3).length > 1 ? object3[1] : string;
            object2 = ((String[])object3).length > 2 ? object3[2] : "";
            object3 = ((String[])object3).length > 3 ? object3[3] : "1";
            JSONObject jSONObject = this.f() == null ? null : this.f().optJSONObject((String)object4);
            break block9;
            object4 = object;
            if (jSONObject != null) {
                object4 = object;
                if (jSONObject.optInt("type") != 0) {
                    object4 = this.h((String)object, jSONObject);
                }
            }
            string = C.e("danmu", (String)object2, (String)object3, string, (String)object4);
            object = new g();
            ((g)object).w((String)object4);
            ((g)object).b(string);
            return ((g)object).toString();
        }
        object = new StringBuilder("[App99] player failed: ");
        ((StringBuilder)object).append(throwable2.getMessage());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return com.github.catvod.spider.merge.MP.g.c("\u64ad\u653e\u94fe\u63a5\u89e3\u6790\u5931\u8d25,\u8bf7\u66f4\u6362\u5176\u4ed6\u6e90\u64ad\u653e");
    }

    public String searchContent(String string, boolean bl) {
        try {
            string = com.github.catvod.spider.merge.MP.g.t(this.j(string, "", false));
            return string;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder("[App99] search failed: ");
            stringBuilder.append(throwable.getMessage());
            SpiderDebug.log((String)stringBuilder.toString());
            return com.github.catvod.spider.merge.MP.g.t(new ArrayList());
        }
    }
}

