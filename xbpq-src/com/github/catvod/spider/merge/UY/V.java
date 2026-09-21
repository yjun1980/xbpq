/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.UY;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.xc.P.b;
import com.github.catvod.spider.merge.xc.P.c;
import com.github.catvod.spider.merge.xc.U.u;
import com.github.catvod.spider.merge.xc.U.v;
import com.github.catvod.spider.merge.xc.a.a;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class V {
    public static final String[] f = new String[]{"QG3/GhopO+5+T", "1Sv94+ANND3lDmmw", "q2eTxRva8b3B5d", "m2", "VIc5CZRBMU71ENfbOh0+RgWIuzLy", "66M8Wpw6nkBEekOtL6e", "N0rucK7S8W/vrRkfPto5urIJJS8dVY0S", "oLAR7pdUVUAp9xcuHWzrU057aUhdCJrt", "6lxcykBSsfI//GR9", "r50cz+1I4gbU/fk8", "tdwzrTc4SNFC4marNGTgf05flC85A", "qvNVUDFjfsOMqvdi2gB8gCvtaJAIqxXs"};
    public static final String[] g = new String[]{"DPdLBvYvRkKewl6IvQTSKSV6ws7F9", "4ZnspAqakTEcghWtF9FRnZqtpxuACpAJq3jbiH", "GZ4iB0a30T1", "EjNYWJI/CQV4ovf", "042FPU6qgf94gDnNVeepvXIUZpOj7lltfg/I3T0wfbHKJPetx", "QFhWvh91aKcN3CvJUQ40HPxo", "jRxFmAZeiqg1Y", "qXF8/KOCx4/dTuz", "CMjDD2dxuV9touYldY2URt4vA7z47v1FcZ3k7DAr", "wN0P2x+N4BYQDS1fd"};
    public static final Pattern h = Pattern.compile("pan\\.xunlei\\.com/s/([^?&#\\s]+)(?:\\?.*?pwd=([^&#\\s]+))?", 2);
    public final com.github.catvod.spider.merge.xc.P.a a;
    public String b = "";
    public volatile boolean c = false;
    public final Object d = new Object();
    public String e = "";

    public V() {
        com.github.catvod.spider.merge.xc.P.a a2;
        this.a = a2 = com.github.catvod.spider.merge.xc.P.a.c();
        if (a2.b().b().isEmpty()) {
            b b2 = a2.b();
            b2.g(UUID.randomUUID().toString().replace("-", ""));
            a2.e(b2);
        }
    }

    public static String h() {
        long l2 = System.currentTimeMillis();
        CharSequence charSequence = new StringBuilder("Xqp0kJBXWhwaTpB61.92.9pan.xunlei.com1bf91caf40093318e8040916eb7ad16a");
        charSequence.append(String.valueOf(l2));
        charSequence = charSequence.toString();
        Object object = f;
        for (int i2 = 0; i2 < 12; ++i2) {
            String string = object[i2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(string);
            charSequence = V.s(stringBuilder.toString());
            continue;
        }
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append("1.");
            ((StringBuilder)object).append((String)charSequence);
            charSequence = ((StringBuilder)object).toString();
            return charSequence;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static B n(String object) {
        if (((Matcher)(object = h.matcher((CharSequence)object))).find()) {
            String string = ((Matcher)object).group(1);
            if ((object = ((Matcher)object).group(2)) == null) {
                object = "";
            }
            return new B(4, string, (String)object);
        }
        return null;
    }

    public static String s(String object) {
        object = MessageDigest.getInstance("MD5").digest(((String)object).getBytes("UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = ((Object)object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(String.format("%02x", object[i2] & 0xFF));
            continue;
        }
        try {
            object = stringBuilder.toString();
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static HashMap w() {
        HashMap hashMap = m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "Content-Type", "application/json");
        hashMap.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        hashMap.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        hashMap.put("x-device-id", "1bf91caf40093318e8040916eb7ad16a");
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        String string;
        boolean bl;
        block4: {
            bl = false;
            try {
                string = this.a.b().a();
                if (!string.isEmpty()) break block4;
                return false;
            }
            catch (Exception exception) {
                return bl;
            }
        }
        JSONObject jSONObject = string.replace("Bearer ", "").split("\\.");
        boolean bl2 = bl;
        if (((String[])jSONObject).length <= 1) return bl2;
        string = new String(Base64.decode((String)jSONObject[1], (int)0));
        jSONObject = new JSONObject(string);
        long l2 = System.currentTimeMillis() / 1000L;
        long l3 = jSONObject.getLong("exp");
        bl2 = bl;
        if (l3 <= l2 + 300L) return bl2;
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        HashMap<String, String> hashMap;
        Object object;
        com.github.catvod.spider.merge.xc.P.a a2 = this.a;
        String string = "x-device-id";
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            return;
        }
        try {
            int n2;
            object = this.i("get:drive/v1/files");
            hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            hashMap.put("authorization", this.j());
            hashMap.put("x-captcha-token", (String)object);
            hashMap.put("x-client-id", "Xp6vsxz_7IYVw2BB");
            hashMap.put("x-device-id", a2.b().b());
            object = URLEncoder.encode("{\"phase\":{\"eq\":\"PHASE_TYPE_COMPLETE\"},\"trashed\":{\"eq\":false}}", "UTF-8");
            StringBuilder stringBuilder = new StringBuilder("https://api-pan.xunlei.com/drive/v1/files?parent_id=");
            stringBuilder.append(this.b);
            stringBuilder.append("&filters=");
            stringBuilder.append((String)object);
            stringBuilder.append("&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50");
            hashMap = A.o(stringBuilder.toString(), null, hashMap);
            if (TextUtils.isEmpty((CharSequence)((Object)hashMap))) {
                return;
            }
            object = new JSONObject((String)((Object)hashMap));
            if ((hashMap = object.optJSONArray("files")) == null) return;
            if (hashMap.length() == 0) {
                return;
            }
            object = new ArrayList();
            for (int i2 = 0; i2 < (n2 = hashMap.length()); ++i2) {
                String string2 = hashMap.getJSONObject(i2).optString("id", "");
                if (TextUtils.isEmpty((CharSequence)string2)) continue;
                ((ArrayList)object).add(string2);
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            if (((ArrayList)object).isEmpty()) {
                return;
            }
            String string3 = this.i("get:drive/v1/files");
            hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            hashMap.put("authorization", this.j());
            hashMap.put("x-captcha-token", string3);
            hashMap.put("x-client-id", "Xp6vsxz_7IYVw2BB");
            hashMap.put(string, a2.b().b());
            a2 = new JSONObject();
            string = new JSONArray();
            object = ((ArrayList)object).iterator();
            while (true) {
                if (!object.hasNext()) {
                    a2.put("ids", string);
                    a2.put("space", "");
                    A.k("https://api-pan.xunlei.com/drive/v1/files:batchDelete", a2.toString(), hashMap);
                    return;
                }
                string.put((Object)((String)object.next()));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String c(String var1_1, String var2_3, String var3_4, String var4_5, String var5_6, boolean var6_7) {
        block18: {
            block20: {
                block17: {
                    block16: {
                        block15: {
                            block21: {
                                if (!var6_7) break block21;
                                var8_8 = this.i("get:/drive/v1/share");
                                var9_9 = new HashMap<String, String>();
                                var9_9.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
                                var9_9.put("Content-Type", "application/json");
                                var9_9.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
                                var9_9.put("x-client-id", "Xp6vsxz_7IYVw2BB");
                                var9_9.put("x-device-id", this.a.b().b());
                                var9_9.put("authorization", (String)var5_6);
                                var5_6 = var9_9;
                                ** GOTO lbl25
                            }
                            var8_8 = this.q();
                            var5_6 = V.w();
                            var5_6.put("authorization", "");
lbl25:
                            // 2 sources

                            var5_6.put("x-captcha-token", (String)var8_8);
                            var8_8 = new StringBuilder("https://api-pan.xunlei.com/drive/v1/share/file_info?pass_code_token=");
                            var8_8.append(URLEncoder.encode(var3_4, "UTF-8"));
                            var8_8.append("&space=&file_id=");
                            var8_8.append(var1_1 /* !! */ );
                            var8_8.append("&share_id=");
                            var8_8.append((String)var2_3);
                            var8_8.append("&pass_code=");
                            var8_8.append(var4_5);
                            var1_1 /* !! */  = A.o(var8_8.toString(), null, var5_6);
                            if (!TextUtils.isEmpty((CharSequence)var1_1 /* !! */ )) break block15;
                            return "";
                        }
                        var2_3 = new JSONObject(var1_1 /* !! */ );
                        if (!var2_3.has("error")) break block16;
                        return "";
                    }
                    var1_1 /* !! */  = var2_3.optJSONObject("file_info");
                    if (var1_1 /* !! */  != null) break block17;
                    return "";
                }
                var4_5 = var1_1 /* !! */ .optJSONArray("medias");
                if (var4_5 == null) break block18;
                if (var4_5.length() == 0) break block18;
                var7_10 = 0;
                var1_1 /* !! */  = "";
                while (true) {
                    block19: {
                        if (var7_10 >= var4_5.length()) break;
                        var2_3 = var4_5.getJSONObject(var7_10);
                        var3_4 = var2_3.optJSONObject("link");
                        var2_3.optString("media_name", "");
                        var2_3 = var1_1 /* !! */ ;
                        if (var3_4 == null) break block19;
                        var3_4 = var3_4.optString("url", "");
                        var2_3 = var1_1 /* !! */ ;
                        if (TextUtils.isEmpty((CharSequence)var3_4)) break block19;
                        var2_3 = var1_1 /* !! */ ;
                        if (!TextUtils.isEmpty((CharSequence)var1_1 /* !! */ )) break block19;
                        var2_3 = var3_4;
                    }
                    ++var7_10;
                    var1_1 /* !! */  = var2_3;
                }
                try {
                    if (!TextUtils.isEmpty((CharSequence)var1_1 /* !! */ )) break block20;
                    return "";
                }
                catch (Exception var1_2) {
                    ** continue;
                }
            }
            var2_3 = new StringBuilder();
            var2_3.append("https://web-vod-xdrive.xunlei.com/ts_downloader?url=");
            var2_3.append(URLEncoder.encode(var1_1 /* !! */ , "UTF-8"));
            var1_1 /* !! */  = var2_3.toString();
            return var1_1 /* !! */ ;
        }
lbl100:
        // 2 sources

        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        block11: {
            int n2;
            Object object;
            JSONObject jSONObject;
            b b2;
            com.github.catvod.spider.merge.xc.P.a a2;
            block10: {
                block9: {
                    a2 = this.a;
                    try {
                        b2 = a2.b();
                        if (!b2.c().isEmpty()) break block9;
                        return false;
                    }
                    catch (Exception exception) {
                        return false;
                    }
                }
                jSONObject = new JSONObject();
                jSONObject.put("client_id", (Object)"Xp6vsxz_7IYVw2BB");
                jSONObject.put("client_secret", (Object)"Qbaferw2knfQKqxa25EYJGtZ2_6755CMwzXBN3ctW54");
                jSONObject.put("grant_type", (Object)"refresh_token");
                jSONObject.put("refresh_token", (Object)b2.c());
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "thunder/12.4.4.3740 Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.5359.215 XDASKernel/22.3.27 Safari/537.36");
                ((HashMap)object).put("Content-Type", "application/json");
                ((HashMap)object).put("x-client-id", "Xp6vsxz_7IYVw2BB");
                ((HashMap)object).put("x-device-id", b2.b());
                object = A.k("https://xluser-ssl.xunlei.com/v1/auth/token", jSONObject.toString(), object);
                n2 = ((X)object).a;
                if (n2 != 200) break block10;
                jSONObject = new JSONObject(((X)object).b());
                if (!jSONObject.has("token_type") || !jSONObject.has("access_token")) break block10;
                object = new StringBuilder();
                ((StringBuilder)object).append(jSONObject.getString("token_type"));
                ((StringBuilder)object).append(" ");
                ((StringBuilder)object).append(jSONObject.getString("access_token"));
                b2.f(((StringBuilder)object).toString());
                if (jSONObject.has("refresh_token")) {
                    b2.h(jSONObject.getString("refresh_token"));
                }
                if (jSONObject.has("user_id")) {
                    b2.i(jSONObject.getString("user_id"));
                }
                a2.e(b2);
                return true;
            }
            if (n2 == 400 || n2 == 401) {
                jSONObject = new JSONObject(((X)object).b());
                object = jSONObject.optString("error", "");
                if (!"invalid_grant".equals(object) && !"token_revoked".equals(object) && !"invalid_token".equals(object)) break block11;
                b2.f("");
                b2.h("");
                a2.e(b2);
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e() {
        Object object;
        String string;
        com.github.catvod.spider.merge.xc.P.a a2;
        block10: {
            a2 = this.a;
            if (!TextUtils.isEmpty((CharSequence)this.b)) {
                return;
            }
            string = this.i("get:drive/v1/files");
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
            ((HashMap)object).put("Content-Type", "application/json");
            ((HashMap)object).put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            ((HashMap)object).put("authorization", this.j());
            ((HashMap)object).put("x-captcha-token", string);
            ((HashMap)object).put("x-client-id", "Xp6vsxz_7IYVw2BB");
            ((HashMap)object).put("x-device-id", a2.b().b());
            string = URLEncoder.encode("{\"phase\":{\"eq\":\"PHASE_TYPE_COMPLETE\"},\"trashed\":{\"eq\":false}}", "UTF-8");
            StringBuilder stringBuilder = new StringBuilder("https://api-pan.xunlei.com/drive/v1/files?parent_id=&filters=");
            stringBuilder.append(string);
            stringBuilder.append("&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50");
            string = A.o(stringBuilder.toString(), null, object);
            boolean bl = TextUtils.isEmpty((CharSequence)string);
            if (bl) break block10;
            object = new JSONObject(string);
            object = object.optJSONArray("files");
            if (object == null) break block10;
            int n2 = 0;
            while (true) {
                if (n2 >= object.length()) break;
                string = object.getJSONObject(n2);
                if ("tudou".equals(string.optString("name", ""))) {
                    this.b = string.getString("id");
                    return;
                }
                ++n2;
                continue;
                break;
            }
        }
        try {
            string = this.i("get:drive/v1/files");
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            ((HashMap)object).put("Content-Type", "application/json");
            ((HashMap)object).put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            ((HashMap)object).put("authorization", this.j());
            ((HashMap)object).put("x-captcha-token", string);
            ((HashMap)object).put("x-client-id", "Xp6vsxz_7IYVw2BB");
            ((HashMap)object).put("x-device-id", a2.b().b());
            a2 = new JSONObject();
            a2.put("parent_id", "");
            a2.put("name", "tudou");
            a2.put("kind", "drive#folder");
            a2.put("space", "");
            object = A.k("https://api-pan.xunlei.com/drive/v1/files", a2.toString(), (Map)object);
            if (((X)object).a == 200 && (a2 = new JSONObject(((X)object).b())).has("file")) {
                this.b = a2.getJSONObject("file").getString("id");
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String string, String string2, String string3, String string4, String string5, ArrayList arrayList) {
        HashMap hashMap;
        try {
            int n2;
            JSONArray jSONArray;
            CharSequence charSequence = this.q();
            hashMap = V.w();
            hashMap.put("x-captcha-token", charSequence);
            boolean bl = TextUtils.isEmpty((CharSequence)string3);
            if (bl) {
                charSequence = new StringBuilder("https://api-pan.xunlei.com/drive/v1/share?share_id=");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("&pass_code=");
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append("&limit=100&page_token=");
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append("&thumbnail_size=SIZE_SMALL");
                string4 = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = new StringBuilder("https://api-pan.xunlei.com/drive/v1/share/detail?share_id=");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("&parent_id=");
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append("&pass_code_token=");
                ((StringBuilder)charSequence).append(URLEncoder.encode(this.e, "UTF-8"));
                ((StringBuilder)charSequence).append("&limit=100&page_token=");
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append("&thumbnail_size=SIZE_SMALL");
                string4 = ((StringBuilder)charSequence).toString();
            }
            string4 = A.o(string4, null, hashMap);
            if (TextUtils.isEmpty((CharSequence)string4)) {
                return;
            }
            hashMap = new JSONObject(string4);
            if (hashMap.has("pass_code_token")) {
                this.e = hashMap.getString("pass_code_token");
            }
            if ((jSONArray = hashMap.optJSONArray("files")) == null) {
                return;
            }
            for (int i2 = 0; i2 < (n2 = jSONArray.length()); ++i2) {
                Object object = jSONArray.getJSONObject(i2);
                charSequence = object.optString("id", "");
                string4 = object.optString("name", "");
                Object object2 = object.optString("kind", "");
                String string6 = object.optString("file_category", "");
                String string7 = object.optString("mime_type", "");
                bl = "drive#folder".equals(object2);
                if (bl) {
                    if (string5.isEmpty()) {
                        string4 = string4.replaceAll("[#'\"\\[\\]&<>]", "");
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string5);
                        ((StringBuilder)object).append("/");
                        ((StringBuilder)object).append(string4.replaceAll("[#'\"\\[\\]&<>]", ""));
                        string4 = ((StringBuilder)object).toString();
                    }
                    this.f(string, string2, (String)charSequence, "", string4, arrayList);
                    continue;
                }
                if (!"VIDEO".equals(string6) && !string7.contains("video") && !H.j(string4)) continue;
                object2 = new c();
                ((c)object2).a = charSequence;
                ((c)object2).b = string4.replaceAll("[#'\"\\[\\]&<>]", "");
                ((c)object2).c = object.optLong("size", 0L);
                ((c)object2).d = this.e;
                ((c)object2).e = string5;
                arrayList.add(object2);
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            string4 = hashMap.optString("next_page_token", "");
            if (TextUtils.isEmpty((CharSequence)string4)) return;
            this.f(string, string2, string3, string4, string5, arrayList);
            return;
        }
    }

    public final String g() {
        CharSequence charSequence = new StringBuilder("Xp6vsxz_7IYVw2BB8.03.0.9067com.xunlei.downloadprovider");
        charSequence.append(this.a.b().b());
        charSequence.append("1735660800000");
        charSequence = charSequence.toString();
        String[] stringArray = g;
        for (int i2 = 0; i2 < 10; ++i2) {
            String string = stringArray[i2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(string);
            charSequence = V.s(stringBuilder.toString());
        }
        return m.q("1.", (String)charSequence);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String i(String object) {
        com.github.catvod.spider.merge.xc.P.a a2 = this.a;
        try {
            Object object2 = new JSONObject();
            object2.put("client_id", (Object)"Xp6vsxz_7IYVw2BB");
            object2.put("action", object);
            object2.put("device_id", (Object)a2.b().b());
            object2.put("captcha_token", (Object)"");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("package_name", (Object)"com.xunlei.downloadprovider");
            jSONObject.put("client_version", (Object)"8.03.0.9067");
            jSONObject.put("captcha_sign", (Object)this.g());
            jSONObject.put("timestamp", (Object)"1735660800000");
            jSONObject.put("user_id", (Object)a2.b().d());
            object2.put("meta", (Object)jSONObject);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
            hashMap.put("Content-Type", "application/json");
            object2 = A.k("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", object2.toString(), hashMap);
            if (((X)object2).a != 200) return "";
            JSONObject jSONObject2 = new JSONObject(((X)object2).b());
            return jSONObject2.optString("captcha_token", "");
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String j() {
        if (this.a() != false) return this.a.b().a();
        if (this.d() != false) return this.a.b().a();
        if (this.r() != false) return this.a.b().a();
        if (this.r()) {
            if (!this.a()) {
                this.d();
            }
            if (this.r()) {
                return this.a.b().a();
            }
        }
        while (this.c) {
            SystemClock.sleep((long)250L);
            if (!this.r()) continue;
            return this.a.b().a();
        }
        var4_1 = this.d;
        synchronized (var4_1) {
            block19: {
                var1_3 = com.github.catvod.spider.merge.KT.B.r("xunlei");
                if (var1_3) ** GOTO lbl25
                ** GOTO lbl23
                {
                    block18: {
                        block17: {
                            block16: {
                                catch (Throwable var5_4) {
                                    break block19;
                                }
lbl23:
                                // 1 sources

                                return this.a.b().a();
lbl25:
                                // 2 sources

                                var1_3 = this.r();
                                if (!var1_3) break block16;
                                return this.a.b().a();
                            }
                            var1_3 = this.c;
                            if (!var1_3) break block17;
                            return this.a.b().a();
                        }
                        this.c = true;
                        var6_7 = new u(0);
                        var5_5 = new v("\u8fc5\u96f7\u7f51\u76d8\u8d26\u53f7\u767b\u5f55", "\u8f93\u5165\u624b\u673a\u53f7\u548c\u5bc6\u7801", "\u624b\u673a\u53f7", "\u5bc6\u7801", var6_7);
                        com.github.catvod.spider.merge.xc.a.a.x(var5_5);
                        // MONITOREXIT @DISABLED, blocks:[4, 7, 10] lbl40 : MonitorExitStatement: MONITOREXIT : var4_1
                        try {
                            var2_8 = System.currentTimeMillis();
                            while (com.github.catvod.spider.merge.KT.B.r("xunlei") && System.currentTimeMillis() - var2_8 < 120000L && !this.r()) {
                                SystemClock.sleep((long)250L);
                            }
                        }
                        catch (Throwable var4_2) {
                            break block18;
                        }
                        this.c = false;
                        return this.a.b().a();
                    }
                    this.c = false;
                    throw var4_2;
                    catch (Exception var5_6) {}
                    return this.a.b().a();
                }
            }
            throw var5_4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String k(String string) {
        block6: {
            block7: {
                Object object;
                try {
                    Thread.sleep(1000L);
                    CharSequence charSequence = this.i("get:drive/v1/files");
                    object = new HashMap();
                    ((HashMap)object).put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
                    ((HashMap)object).put("Content-Type", "application/json");
                    ((HashMap)object).put("authorization", this.j());
                    ((HashMap)object).put("x-captcha-token", charSequence);
                    ((HashMap)object).put("x-client-id", "Xp6vsxz_7IYVw2BB");
                    ((HashMap)object).put("x-device-id", this.a.b().b());
                    charSequence = new StringBuilder("https://api-pan.xunlei.com/drive/v1/files/");
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append("?space=&usage=PLAY");
                    object = A.o(((StringBuilder)charSequence).toString(), null, object);
                    if (TextUtils.isEmpty((CharSequence)object)) break block6;
                    string = new JSONObject((String)object);
                    if ((object = string.optJSONObject("links")) == null) break block7;
                }
                catch (Exception exception) {
                    return "";
                }
                object = object.optJSONObject("application/octet-stream");
                if (object == null) break block7;
                object = object.optString("url", "");
                if (TextUtils.isEmpty((CharSequence)object)) break block7;
                return object;
            }
            string = string.optString("web_content_link", "");
            boolean bl = TextUtils.isEmpty((CharSequence)string);
            if (bl) break block6;
            return string;
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String l() {
        Object object;
        CharSequence charSequence;
        String string = "";
        try {
            charSequence = this.i("get:drive/v1/files");
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            ((HashMap)object).put("Content-Type", "application/json");
            ((HashMap)object).put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            ((HashMap)object).put("authorization", this.j());
            ((HashMap)object).put("x-captcha-token", charSequence);
            ((HashMap)object).put("x-client-id", "Xp6vsxz_7IYVw2BB");
            ((HashMap)object).put("x-device-id", this.a.b().b());
            String string2 = URLEncoder.encode("{\"phase\":{\"eq\":\"PHASE_TYPE_COMPLETE\"},\"trashed\":{\"eq\":false}}", "UTF-8");
            charSequence = new StringBuilder("https://api-pan.xunlei.com/drive/v1/files?parent_id=");
            ((StringBuilder)charSequence).append(this.b);
            ((StringBuilder)charSequence).append("&filters=");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50");
            charSequence = A.o(((StringBuilder)charSequence).toString(), null, object);
            object = string;
        }
        catch (Exception exception) {
            return string;
        }
        if (TextUtils.isEmpty((CharSequence)charSequence)) return object;
        object = new JSONObject((String)charSequence);
        charSequence = object.optJSONArray("files");
        object = string;
        if (charSequence == null) return object;
        object = string;
        if (charSequence.length() <= 0) return object;
        return charSequence.getJSONObject(0).optString("id", "");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String m(String object) {
        try {
            Object object2 = new JSONObject();
            object2.put("client_id", (Object)"Xp6vsxz_7IYVw2BB");
            object2.put("action", (Object)"POST:/v1/auth/signin");
            object2.put("device_id", (Object)this.a.b().b());
            object2.put("captcha_token", (Object)"");
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder("+86 ");
            stringBuilder.append((String)object);
            jSONObject.put("phone_number", (Object)stringBuilder.toString());
            jSONObject.put("package_name", (Object)"com.xunlei.downloadprovider");
            jSONObject.put("client_version", (Object)"8.03.0.9067");
            jSONObject.put("captcha_sign", (Object)this.g());
            jSONObject.put("timestamp", (Object)"1735660800000");
            object2.put("meta", (Object)jSONObject);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
            hashMap.put("Content-Type", "application/json");
            object2 = A.k("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", object2.toString(), hashMap);
            if (((X)object2).a != 200) return "";
            JSONObject jSONObject2 = new JSONObject(((X)object2).b());
            return jSONObject2.optString("captcha_token", "");
        }
        catch (Exception exception) {
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String o(String object) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", (Object)"Xp6vsxz_7IYVw2BB");
            jSONObject.put("action", (Object)"POST:/v1/auth/verification");
            jSONObject.put("device_id", (Object)this.a.b().b());
            jSONObject.put("captcha_token", (Object)"");
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder("+86 ");
            stringBuilder.append((String)object);
            jSONObject2.put("phone_number", (Object)stringBuilder.toString());
            jSONObject.put("meta", (Object)jSONObject2);
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            ((HashMap)object).put("Content-Type", "application/json");
            object = A.k("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), object);
            if (((X)object).a != 200) return "";
            jSONObject = new JSONObject(((X)object).b());
            return jSONObject.optString("captcha_token", "");
        }
        catch (Exception exception) {
            return "";
        }
    }

    public final k p(B object) {
        CharSequence charSequence = null;
        Object object2 = charSequence;
        if (object != null) {
            object2 = ((B)object).b;
            if (object2 == null) {
                object2 = "";
            }
            if (TextUtils.isEmpty((CharSequence)object2)) {
                object2 = charSequence;
            } else {
                ArrayList arrayList = new ArrayList();
                object2 = ((B)object).b;
                if (object2 == null) {
                    object2 = "";
                }
                charSequence = ((B)object).c;
                if (charSequence == null) {
                    charSequence = "";
                }
                this.f((String)object2, (String)charSequence, "", "", "", arrayList);
                if (arrayList.isEmpty()) {
                    return null;
                }
                Collections.sort(arrayList);
                charSequence = new StringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    c c2 = (c)arrayList.get(i2);
                    if (i2 > 0) {
                        ((StringBuilder)charSequence).append("#");
                    }
                    if ((object2 = c2.b) == null) {
                        object2 = "";
                    }
                    String string = H.i(c2.c);
                    if (!string.isEmpty()) {
                        StringBuilder stringBuilder = new StringBuilder("[");
                        stringBuilder.append(string);
                        stringBuilder.append("] ");
                        stringBuilder.append((String)object2);
                        object2 = stringBuilder.toString();
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append("$");
                    object2 = ((B)object).b;
                    if (object2 == null) {
                        object2 = "";
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append("++");
                    object2 = c2.d;
                    if (object2 == null) {
                        object2 = "";
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append("++");
                    object2 = c2.a;
                    if (object2 == null) {
                        object2 = "";
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append("++");
                    object2 = c2.b;
                    if (object2 == null) {
                        object2 = "";
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                    ((StringBuilder)charSequence).append("++");
                    object2 = ((B)object).c;
                    if (object2 == null) {
                        object2 = "";
                    }
                    ((StringBuilder)charSequence).append((String)object2);
                }
                object = ((StringBuilder)charSequence).toString();
                object2 = new k();
                ((k)object2).o("\u8fc5\u96f7\u667a$$$\u8fc5\u96f7\u539f");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("$$$");
                ((StringBuilder)charSequence).append((String)object);
                ((k)object2).p(((StringBuilder)charSequence).toString());
            }
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String q() {
        try {
            long l2 = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", (Object)"Xqp0kJBXWhwaTpB6");
            jSONObject.put("action", (Object)"get:/drive/v1/share");
            jSONObject.put("device_id", (Object)"1bf91caf40093318e8040916eb7ad16a");
            jSONObject.put("captcha_token", (Object)"");
            Object object = new JSONObject();
            object.put("username", (Object)"");
            object.put("phone_number", (Object)"");
            object.put("email", (Object)"");
            object.put("package_name", (Object)"pan.xunlei.com");
            object.put("client_version", (Object)"1.92.9");
            object.put("captcha_sign", (Object)V.h());
            object.put("timestamp", (Object)String.valueOf(l2));
            object.put("user_id", (Object)this.a.b().d());
            jSONObject.put("meta", object);
            object = new HashMap();
            ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            ((HashMap)object).put("Content-Type", "application/json");
            object = A.k("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), (Map)object);
            if (((X)object).a != 200) return "";
            JSONObject jSONObject2 = new JSONObject(((X)object).b());
            return jSONObject2.optString("captcha_token", "");
        }
        catch (Exception exception) {
            return "";
        }
    }

    public final boolean r() {
        b b2 = this.a.b();
        boolean bl = !b2.a().isEmpty() && !b2.c().isEmpty();
        return bl;
    }

    public final String t(String object, String[] object2) {
        if (((String[])object2).length < 4) {
            return new g().toString();
        }
        String string = object2[0];
        String string2 = object2[1];
        String string3 = object2[2];
        String string4 = object2[3];
        object2 = ((String[])object2).length >= 5 ? object2[4] : "";
        if (object != null && ((String)object).contains("\u8fc5\u96f7\u667a")) {
            try {
                object = this.j();
                if (TextUtils.isEmpty((CharSequence)object) || TextUtils.isEmpty((CharSequence)(object = this.c(string3, string, string2, (String)object2, (String)object, true)))) {
                    object = this.c(string3, string, string2, (String)object2, "", false);
                }
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = new g();
                    object = ((g)object).toString();
                } else {
                    object2 = new HashMap();
                    ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
                    object = com.github.catvod.spider.merge.KT.B.y(object, (Map)object2, com.github.catvod.spider.merge.KT.B.p("xunlei"), "xunlei");
                    object2 = new g();
                    ((g)object2).w((String)object);
                    ((g)object2).j();
                    object = ((g)object2).toString();
                }
            }
            catch (Exception exception) {
                object = new g().toString();
            }
            return object;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)this.j())) {
                object = new g();
                object = ((g)object).toString();
            } else {
                this.e();
                if (TextUtils.isEmpty((CharSequence)this.b)) {
                    object = new g();
                    object = ((g)object).toString();
                } else {
                    this.b();
                    object = this.u(string, string2, string3);
                    if (TextUtils.isEmpty((CharSequence)object)) {
                        object = new g();
                        object = ((g)object).toString();
                    } else {
                        object2 = this.k((String)object);
                        if (TextUtils.isEmpty((CharSequence)object2)) {
                            object = new g();
                            object = ((g)object).toString();
                        } else {
                            object = new HashMap();
                            ((HashMap)object).put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
                            object = com.github.catvod.spider.merge.KT.B.y((String)object2, (Map)object, com.github.catvod.spider.merge.KT.B.p("xunlei"), "xunlei");
                            object2 = new g();
                            ((g)object2).w((String)object);
                            ((g)object2).j();
                            object = ((g)object2).toString();
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            object = new g().toString();
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String u(String object, String object2, String string) {
        try {
            String string2 = this.i("get:drive/v1/files");
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            hashMap.put("authorization", this.j());
            hashMap.put("x-captcha-token", string2);
            hashMap.put("x-client-id", "Xp6vsxz_7IYVw2BB");
            hashMap.put("x-device-id", this.a.b().b());
            string2 = new JSONObject();
            string2.put("parent_id", (Object)this.b);
            string2.put("share_id", object);
            string2.put("pass_code_token", object2);
            object = new JSONArray();
            string2.put("ancestor_ids", object);
            object = new JSONArray();
            object.put((Object)string);
            string2.put("file_ids", object);
            string2.put("specify_parent_id", true);
            object2 = A.k("https://api-pan.xunlei.com/drive/v1/share/restore", string2.toString(), hashMap);
            if (((X)object2).a != 200) return "";
            object = new JSONObject(((X)object2).b());
            if ((object = object.optJSONObject("params")) == null) return this.l();
        }
        catch (Exception exception) {
            return "";
        }
        object = object.optString("trace_file_ids", "");
        if (TextUtils.isEmpty((CharSequence)object)) return this.l();
        object = Pattern.compile("\":\"([^\"]+)\"").matcher((CharSequence)object);
        if (!((Matcher)object).find()) return this.l();
        return ((Matcher)object).group(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(String object) {
        if (object == null) return;
        if (((String)object).isEmpty()) return;
        com.github.catvod.spider.merge.xc.P.a a2 = this.a;
        try {
            JSONObject jSONObject = new JSONObject((String)object);
            object = a2.b();
            ((b)object).f(jSONObject.optString("access_token", ""));
            ((b)object).h(jSONObject.optString("refresh_token", ""));
            ((b)object).i(jSONObject.optString("user_id", ""));
            ((b)object).j(jSONObject.optString("username", ((b)object).e()));
            if (((b)object).a().isEmpty()) return;
            if (((b)object).c().isEmpty()) return;
            a2.e((b)object);
            com.github.catvod.spider.merge.KT.B.e("xunlei");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

