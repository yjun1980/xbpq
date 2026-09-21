/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.P0;
import com.github.catvod.spider.merge.I.Q0;
import com.github.catvod.spider.merge.I.R0;
import com.github.catvod.spider.merge.I.S0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.W.a;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.f0.i;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class T0 {
    private static final String[] g = new String[]{"QG3/GhopO+5+T", "1Sv94+ANND3lDmmw", "q2eTxRva8b3B5d", "m2", "VIc5CZRBMU71ENfbOh0+RgWIuzLy", "66M8Wpw6nkBEekOtL6e", "N0rucK7S8W/vrRkfPto5urIJJS8dVY0S", "oLAR7pdUVUAp9xcuHWzrU057aUhdCJrt", "6lxcykBSsfI//GR9", "r50cz+1I4gbU/fk8", "tdwzrTc4SNFC4marNGTgf05flC85A", "qvNVUDFjfsOMqvdi2gB8gCvtaJAIqxXs"};
    private static final Pattern h = Pattern.compile("https?://pan\\.xunlei\\.com/s/([^?#]+)(?:\\?[^#]*?pwd=([^&#]+))?(?:#.*)?", 2);
    public static final int i = 0;
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private int e = 0;
    public a f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T0() {
        try {
            Object object = com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("xunlei_user"));
            Gson gson = new Gson();
            a a2 = (a)gson.fromJson((String)object, a.class);
            object = a2;
            if (a2 == null) {
                object = new a();
            }
            this.f = object;
            return;
        }
        catch (Exception exception) {
            this.f = new a();
        }
    }

    private static String a() {
        Object object;
        Object object2;
        block11: {
            block10: {
                block9: {
                    try {
                        object2 = P0.a.f.c();
                        if (!TextUtils.isEmpty((CharSequence)object2)) break block9;
                        return "";
                    }
                    catch (Exception exception) {
                        r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5237\u65b0 token \u5f02\u5e38: "));
                        return "";
                    }
                }
                object = new JSONObject();
                object.put("client_id", (Object)"Xqp0kJBXWhwaTpB6");
                object.put("code_verifier", (Object)"b12YwMsrYLy2hwAOuJKBEgPHNSz1loku");
                object.put("grant_type", (Object)"authorization_code");
                object.put("code", object2);
                object2 = new HashMap();
                ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
                ((HashMap)object2).put("Content-Type", "application/json");
                ((HashMap)object2).put("accept-language", "zh-cn");
                ((HashMap)object2).put("x-client-id", "Xqp0kJBXWhwaTpB6");
                ((HashMap)object2).put("x-device-id", "925b7631473a13716b791d7f28289cad");
                object = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/auth/token", object.toString(), object2);
                if (((i)object).b() == 200) break block10;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\u5237\u65b0 token \u5931\u8d25: ");
                ((StringBuilder)object2).append(((i)object).b());
                ((StringBuilder)object2).append(" ");
                ((StringBuilder)object2).append(((i)object).a());
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                return "";
            }
            JSONObject jSONObject = new JSONObject(((i)object).a());
            if (jSONObject.has("refresh_token")) {
                P0.a.f.j(jSONObject.optString("refresh_token", ""));
            }
            object = object2 = jSONObject.optString("user_id", "");
            if (TextUtils.isEmpty((CharSequence)object2)) {
                object = jSONObject.optString("sub", "");
            }
            if (!TextUtils.isEmpty((CharSequence)object)) {
                P0.a.f.k((String)object);
            }
            if (!TextUtils.isEmpty((CharSequence)(object = jSONObject.optString("access_token", "")))) break block11;
            return "";
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Bearer ");
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        return object;
    }

    private static void b(String object) {
        try {
            Object object2 = new JSONObject();
            object2.put("client_id", (Object)"Xqp0kJBXWhwaTpB6");
            object2.put("response_type", (Object)"code");
            object2.put("redirect_uri", (Object)"https://pan.xunlei.com/login/?sso_sign_in_in_iframe=&path=%2F");
            object2.put("scope", (Object)"profile offline pan sso user");
            object2.put("state", (Object)"state-kekfg9mh2qn");
            object2.put("code_challenge", (Object)"xPsZzzstCvNRl_jItS5Zv5bh75GEaiuOsSHCeAgOZh0");
            object2.put("code_challenge_method", (Object)"S256");
            object2.put("sign_out_uri", (Object)"https://pan.xunlei.com/login/?sso_sign_out=");
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("authorization", (String)object);
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("accept-language", "zh-cn");
            hashMap.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            hashMap.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            object = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/user/authorize", object2.toString(), hashMap);
            if (((i)object).b() != 200) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\u5237\u65b0 authorize \u5931\u8d25: ");
                ((StringBuilder)object2).append(((i)object).b());
                ((StringBuilder)object2).append(" ");
                ((StringBuilder)object2).append(((i)object).a());
                SpiderDebug.log((String)((StringBuilder)object2).toString());
            }
            if ((object2 = new JSONObject(((i)object).a())).has("code")) {
                P0.a.f.i(object2.optString("code", ""));
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5237\u65b0 token \u5f02\u5e38: "));
        }
    }

    private void c() {
        String string = T0.i();
        String string2 = this.h();
        Object object = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        ((HashMap)object).put("authorization", string);
        ((HashMap)object).put("content-type", "application/json");
        ((HashMap)object).put("x-captcha-token", string2);
        ((HashMap)object).put("x-client-id", "Xqp0kJBXWhwaTpB6");
        ((HashMap)object).put("x-device-id", "925b7631473a13716b791d7f28289cad");
        object = com.github.catvod.spider.merge.f0.d.l("https://api-pan.xunlei.com/drive/v1/files?parent_id=&filters=%7B%22phase%22%3A%7B%22eq%22%3A%22PHASE_TYPE_COMPLETE%22%7D%2C%22trashed%22%3A%7B%22eq%22%3Afalse%7D%7D&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50", (Map<String, String>)object, null);
        if (object != null && !((String)object).isEmpty() && (object = new JSONObject((String)object).optJSONArray("files")) != null) {
            for (int i2 = 0; i2 < object.length(); ++i2) {
                string = object.getJSONObject(i2);
                if (!"ds".equals(string.optString("name", ""))) continue;
                this.d = string.optString("id", "");
                break;
            }
        }
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            return;
        }
        string2 = T0.i();
        string = this.h();
        object = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "Content-Type", "application/json");
        ((HashMap)object).put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        ((HashMap)object).put("authorization", string2);
        ((HashMap)object).put("x-captcha-token", string);
        ((HashMap)object).put("x-client-id", "Xqp0kJBXWhwaTpB6");
        ((HashMap)object).put("x-device-id", "925b7631473a13716b791d7f28289cad");
        string = new JSONObject();
        string.put("parent_id", (Object)"");
        string.put("name", (Object)"ds");
        string.put("kind", (Object)"drive#folder");
        string.put("space", (Object)"");
        object = com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/files", string.toString(), (Map<String, String>)object);
        if (((i)object).b() == 200 && (object = new JSONObject(((i)object).a()).optJSONObject("file")) != null) {
            this.d = object.optString("id", "");
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private List e(String object, String object2) {
        CharSequence charSequence = this.j("/drive/v1/share", "GET");
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh-CN,zh;q=0.9");
        hashMap.put("x-captcha-token", charSequence);
        hashMap.put("x-client-id", "Xqp0kJBXWhwaTpB6");
        hashMap.put("x-device-id", "925b7631473a13716b791d7f28289cad");
        charSequence = new StringBuilder();
        O0.a((StringBuilder)charSequence, "https://api-pan.xunlei.com/drive/v1/share/detail?share_id=", (String)object, "&parent_id=", (String)object2);
        ((StringBuilder)charSequence).append("&pass_code_token=");
        ((StringBuilder)charSequence).append(URLEncoder.encode(this.c, "UTF-8"));
        ((StringBuilder)charSequence).append("&limit=100&page_token=&thumbnail_size=SIZE_SMALL");
        object2 = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)charSequence).toString(), hashMap, null);
        object = new ArrayList();
        if (object2 != null && !((String)object2).isEmpty()) {
            hashMap = new JSONObject((String)object2).optJSONArray("files");
            if (hashMap == null) {
                return object;
            }
            for (int i2 = 0; i2 < hashMap.length(); ++i2) {
                charSequence = hashMap.getJSONObject(i2);
                object2 = new R0(null);
                ((R0)object2).a = charSequence.optString("id", "");
                ((R0)object2).b = charSequence.optString("name", "");
                charSequence.optString("parent_id", "");
                ((R0)object2).c = charSequence.optLong("size", 0L);
                ((R0)object2).d = TextUtils.isEmpty((CharSequence)charSequence.optString("mime_type", ""));
                ((ArrayList)object).add(object2);
            }
        }
        return object;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private List f(String object, String string) {
        String string2 = this.j("/drive/v1/share", "GET");
        Object object2 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh-CN,zh;q=0.9");
        ((HashMap)object2).put("x-captcha-token", string2);
        ((HashMap)object2).put("x-client-id", "Xqp0kJBXWhwaTpB6");
        ((HashMap)object2).put("x-device-id", "925b7631473a13716b791d7f28289cad");
        string2 = TextUtils.isEmpty((CharSequence)this.c) ? "" : URLEncoder.encode(this.c, "UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api-pan.xunlei.com/drive/v1/share?share_id=");
        stringBuilder.append((String)object);
        stringBuilder.append("&pass_code=");
        stringBuilder.append(string);
        stringBuilder.append("&limit=100&pass_code_token=");
        stringBuilder.append(string2);
        stringBuilder.append("&page_token=");
        stringBuilder.append("");
        stringBuilder.append("&thumbnail_size=SIZE_SMALL");
        string = com.github.catvod.spider.merge.f0.d.l(stringBuilder.toString(), (Map<String, String>)object2, null);
        object = new ArrayList();
        if (string != null && !string.isEmpty()) {
            if ((string = new JSONObject(string)).has("pass_code_token")) {
                this.c = string.optString("pass_code_token", "");
            }
            if ((string = string.optJSONArray("files")) == null) {
                return object;
            }
            for (int i2 = 0; i2 < string.length(); ++i2) {
                string2 = string.getJSONObject(i2);
                object2 = new R0(null);
                ((R0)object2).a = string2.optString("id", "");
                ((R0)object2).b = string2.optString("name", "");
                string2.optString("parent_id", "");
                ((R0)object2).c = string2.optLong("size", 0L);
                ((R0)object2).d = TextUtils.isEmpty((CharSequence)string2.optString("mime_type", ""));
                ((ArrayList)object).add(object2);
            }
        }
        return object;
    }

    public static T0 g() {
        return P0.a;
    }

    private String h() {
        return this.j("/drive/v1/files", "GET");
    }

    public static String i() {
        String string;
        block4: {
            string = P0.a.f.b();
            if (TextUtils.isEmpty((CharSequence)string) || !T0.q(string)) break block4;
            return string;
        }
        try {
            string = T0.r();
            T0.b(string);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                P0.a.f.h(T0.a());
                P0.a.f.g();
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u83b7\u53d6\u8fc5\u96f7\u8ba4\u8bc1\u5931\u8d25: "));
        }
        return "";
    }

    private String j(String object, String object2) {
        String string = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("client_id", (Object)"Xqp0kJBXWhwaTpB6");
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(":");
        ((StringBuilder)object3).append((String)object);
        jSONObject.put("action", (Object)((StringBuilder)object3).toString());
        jSONObject.put("device_id", (Object)"925b7631473a13716b791d7f28289cad");
        object2 = new JSONObject();
        object2.put("username", (Object)"");
        object2.put("phone_number", (Object)"");
        object2.put("email", (Object)"");
        object2.put("package_name", (Object)"pan.xunlei.com");
        object2.put("client_version", (Object)"1.92.9");
        object = new StringBuilder();
        ((StringBuilder)object).append("Xqp0kJBXWhwaTpB61.92.9pan.xunlei.com925b7631473a13716b791d7f28289cad");
        ((StringBuilder)object).append(string);
        object = ((StringBuilder)object).toString();
        object3 = g;
        for (int i2 = 0; i2 < 12; ++i2) {
            String string2 = object3[i2];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
            object = T0.t(stringBuilder.toString());
            continue;
        }
        try {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("1.");
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
        }
        catch (Exception exception) {
            object = "";
        }
        object2.put("captcha_sign", object);
        object2.put("timestamp", (Object)string);
        object2.put("user_id", (Object)P0.a.f.d());
        jSONObject.put("meta", object2);
        object = new HashMap();
        ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
        ((HashMap)object).put("Content-Type", "application/json");
        ((HashMap)object).put("X-Client-Id", "Xqp0kJBXWhwaTpB6");
        ((HashMap)object).put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
        object2 = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), (Map<String, String>)object);
        if (((i)object2).b() != 200) {
            object = com.github.catvod.spider.merge.C.a.c("captcha \u8bf7\u6c42\u5931\u8d25: ");
            ((StringBuilder)object).append(((i)object2).b());
            ((StringBuilder)object).append(" ");
            ((StringBuilder)object).append(((i)object2).a());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return "";
        }
        return new JSONObject(((i)object2).a()).optString("captcha_token", "");
    }

    private static String l(String object) {
        Object object2;
        block3: {
            try {
                object2 = new JSONObject();
                object2.put("client_id", (Object)"XW5SkOhLDjnOZP7J");
                object2.put("action", (Object)"POST:/v1/auth/signin");
                object2.put("device_id", (Object)"925b7631473a13716b791d7f28289cad");
                JSONObject jSONObject = new JSONObject();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("+86");
                stringBuilder.append((String)object);
                jSONObject.put("phone_number", (Object)stringBuilder.toString());
                object2.put("meta", (Object)jSONObject);
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
                ((HashMap)object).put("Content-Type", "application/json");
                ((HashMap)object).put("X-Client-Id", "XW5SkOhLDjnOZP7J");
                ((HashMap)object).put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
                object = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", object2.toString(), object);
                if (((i)object).b() == 200) break block3;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\u767b\u5f55\u9a8c\u8bc1\u7801\u8bf7\u6c42\u5931\u8d25: ");
                ((StringBuilder)object2).append(((i)object).b());
                ((StringBuilder)object2).append(" ");
                ((StringBuilder)object2).append(((i)object).a());
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                return "";
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u83b7\u53d6\u767b\u5f55\u9a8c\u8bc1\u7801\u5f02\u5e38: "));
                return "";
            }
        }
        object2 = new JSONObject(((i)object).a());
        object = object2.optString("captcha_token", "");
        return object;
    }

    private String p() {
        String string = T0.i();
        CharSequence charSequence = this.j("/drive/v1/files", "GET");
        Object object = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
        ((HashMap)object).put("authorization", string);
        ((HashMap)object).put("content-type", "application/json");
        ((HashMap)object).put("x-captcha-token", charSequence);
        ((HashMap)object).put("x-client-id", "Xqp0kJBXWhwaTpB6");
        ((HashMap)object).put("x-device-id", "925b7631473a13716b791d7f28289cad");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("https://api-pan.xunlei.com/drive/v1/files?parent_id=");
        ((StringBuilder)charSequence).append(this.d);
        ((StringBuilder)charSequence).append("&filters=%7B%22phase%22%3A%7B%22eq%22%3A%22PHASE_TYPE_COMPLETE%22%7D%2C%22trashed%22%3A%7B%22eq%22%3Afalse%7D%7D&with_audit=true&thumbnail_size=SIZE_SMALL&limit=50");
        object = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)charSequence).toString(), (Map<String, String>)object, null);
        if (object != null && !((String)object).isEmpty() && (object = new JSONObject((String)object).optJSONArray("files")) != null && object.length() > 0) {
            return object.getJSONObject(0).optString("id", "");
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean q(String object) {
        boolean bl;
        boolean bl2 = false;
        JSONObject jSONObject = object;
        try {
            if (((String)object).startsWith("Bearer ")) {
                jSONObject = ((String)object).substring(7);
            }
            jSONObject = jSONObject.split("\\.");
            bl = bl2;
        }
        catch (Exception exception) {
            return bl2;
        }
        if (((String[])jSONObject).length <= 1) return bl;
        String string = new String(Base64.decode((String)jSONObject[1], (int)0));
        jSONObject = new JSONObject(string);
        long l2 = System.currentTimeMillis() / 1000L;
        long l3 = jSONObject.getLong("exp");
        bl = bl2;
        if (l3 <= l2) return bl;
        return true;
    }

    private static String r() {
        String string;
        block4: {
            String string2;
            String string3;
            block5: {
                String string4 = "";
                try {
                    string3 = P0.a.f.e();
                    string2 = P0.a.f.f();
                    string = string4;
                }
                catch (Exception exception) {
                    r.f(exception, com.github.catvod.spider.merge.C.a.c("\u8fc5\u96f7\u767b\u5f55\u5931\u8d25: "));
                    return "";
                }
                if (TextUtils.isEmpty((CharSequence)string3)) break block4;
                if (!TextUtils.isEmpty((CharSequence)string2)) break block5;
                string = string4;
                break block4;
            }
            string = T0.s(string3, string2);
        }
        return string;
    }

    private static String s(String object, String charSequence) {
        JSONObject jSONObject;
        String string;
        block11: {
            block10: {
                block9: {
                    try {
                        string = T0.l((String)object);
                        if (!TextUtils.isEmpty((CharSequence)string)) break block9;
                        SpiderDebug.log((String)"\u83b7\u53d6\u767b\u5f55\u9a8c\u8bc1\u7801\u5931\u8d25");
                        return "";
                    }
                    catch (Exception exception) {
                        r.f(exception, com.github.catvod.spider.merge.C.a.c("\u8d26\u53f7\u5bc6\u7801\u767b\u5f55\u5931\u8d25: "));
                        return "";
                    }
                }
                jSONObject = new JSONObject();
                jSONObject.put("client_id", (Object)"XW5SkOhLDjnOZP7J");
                jSONObject.put("client_secret", (Object)"Og9Vr1L8Ee6bh0olFxFDRg");
                jSONObject.put("password", (Object)charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("+86 ");
                ((StringBuilder)charSequence).append((String)object);
                jSONObject.put("username", (Object)((StringBuilder)charSequence).toString());
                jSONObject.put("captcha_token", (Object)string);
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
                ((HashMap)object).put("Content-Type", "application/json");
                ((HashMap)object).put("X-Client-Id", "XW5SkOhLDjnOZP7J");
                ((HashMap)object).put("X-Device-Id", "925b7631473a13716b791d7f28289cad");
                object = com.github.catvod.spider.merge.f0.d.f("https://xluser-ssl.xunlei.com/v1/auth/signin", jSONObject.toString(), object);
                if (((i)object).b() == 200) break block10;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u767b\u5f55\u5931\u8d25: ");
                ((StringBuilder)charSequence).append(((i)object).b());
                ((StringBuilder)charSequence).append(" ");
                ((StringBuilder)charSequence).append(((i)object).a());
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                return "";
            }
            jSONObject = new JSONObject(((i)object).a());
            string = jSONObject.optString("access_token", "");
            if (!TextUtils.isEmpty((CharSequence)string)) break block11;
            object = new StringBuilder();
            ((StringBuilder)object).append("\u767b\u5f55\u54cd\u5e94\u4e2d\u6ca1\u6709 access_token: ");
            ((StringBuilder)object).append(jSONObject.toString());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return "";
        }
        charSequence = jSONObject.optString("user_id", "");
        object = charSequence;
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            object = jSONObject.optString("sub", "");
        }
        if (!TextUtils.isEmpty((CharSequence)object)) {
            P0.a.f.k((String)object);
        }
        if (jSONObject.has("refresh_token")) {
            P0.a.f.j(jSONObject.optString("refresh_token", ""));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Bearer ");
        ((StringBuilder)object).append(string);
        object = ((StringBuilder)object).toString();
        return object;
    }

    private static String t(String object) {
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

    private String u(String object, String string, String object2) {
        block18: {
            Object object3;
            block17: {
                block16: {
                    block15: {
                        String string2 = T0.i();
                        String string3 = this.j("/drive/v1/share/restore", "POST");
                        object3 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "Content-Type", "application/json");
                        ((HashMap)object3).put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
                        ((HashMap)object3).put("authorization", P0.a.f.b());
                        ((HashMap)object3).put("x-captcha-token", string3);
                        ((HashMap)object3).put("x-client-id", "Xqp0kJBXWhwaTpB6");
                        ((HashMap)object3).put("x-device-id", "925b7631473a13716b791d7f28289cad");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("parent_id", (Object)this.d);
                        jSONObject.put("share_id", (Object)string);
                        jSONObject.put("pass_code_token", object2);
                        jSONObject.put("ancestor_ids", (Object)new JSONArray());
                        Object object4 = new JSONArray();
                        object4.put(object);
                        jSONObject.put("file_ids", object4);
                        jSONObject.put("specify_parent_id", true);
                        object4 = com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/share/restore", jSONObject.toString(), (Map<String, String>)object3);
                        int n2 = ((i)object4).b();
                        object3 = "";
                        if (n2 != 200) {
                            n2 = this.e;
                            if (n2 < 3) {
                                this.e = n2 + 1;
                                Thread.sleep(5000L);
                                return this.u((String)object, string, (String)object2);
                            }
                            return "";
                        }
                        if (TextUtils.isEmpty((CharSequence)(object4 = new JSONObject(((i)object4).a()).optString("restore_task_id", "")))) {
                            return this.p();
                        }
                        this.e = 0;
                        string = string2;
                        for (n2 = 0; n2 < 20; ++n2) {
                            object2 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36", "accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
                            ((HashMap)object2).put("authorization", string);
                            ((HashMap)object2).put("x-captcha-token", string3);
                            ((HashMap)object2).put("x-client-id", "Xqp0kJBXWhwaTpB6");
                            ((HashMap)object2).put("x-device-id", "925b7631473a13716b791d7f28289cad");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("https://api-pan.xunlei.com/drive/v1/tasks/");
                            ((StringBuilder)object).append((String)object4);
                            string2 = ((StringBuilder)object).toString();
                            object = null;
                            object2 = com.github.catvod.spider.merge.f0.d.l(string2, (Map<String, String>)object2, null);
                            if (!TextUtils.isEmpty((CharSequence)object2)) {
                                object = new JSONObject((String)object2);
                            }
                            if (object != null) {
                                object2 = object;
                                if (object.optInt("progress", 0) >= 100) break block15;
                                if ("PHASE_TYPE_COMPLETE".equals(object.optString("phase"))) {
                                    object2 = object;
                                    break block15;
                                }
                            }
                            Thread.sleep(2000L);
                        }
                        object2 = null;
                    }
                    if (object2 == null) {
                        return "";
                    }
                    object = object2.optJSONObject("params");
                    if (object != null) break block16;
                    object = object3;
                }
                object = object.optString("trace_file_ids", "");
                if (!TextUtils.isEmpty((CharSequence)object)) break block17;
                object = object3;
            }
            string = new JSONObject((String)object);
            object2 = string.names();
            object = object3;
            if (object2 == null) break block18;
            object = object3;
            try {
                if (object2.length() > 0) {
                    object = string.optString(object2.getString(0), "");
                }
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u89e3\u6790\u6062\u590d\u6587\u4ef6ID\u5931\u8d25: "));
                object = object3;
            }
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            return this.p();
        }
        return object;
    }

    public final void d() {
        try {
            if (TextUtils.isEmpty((CharSequence)this.d)) {
                return;
            }
            String string = T0.i();
            String string2 = this.h();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("accept-language", "zh,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6");
            hashMap.put("authorization", string);
            hashMap.put("x-captcha-token", string2);
            hashMap.put("x-client-id", "Xqp0kJBXWhwaTpB6");
            hashMap.put("x-device-id", "925b7631473a13716b791d7f28289cad");
            string = new JSONObject();
            string2 = new JSONArray();
            string2.put((Object)this.d);
            string.put("ids", (Object)string2);
            string.put("space", (Object)"");
            if (com.github.catvod.spider.merge.f0.d.f("https://api-pan.xunlei.com/drive/v1/files:batchDelete", string.toString(), hashMap).b() == 200) {
                this.d = "";
                SpiderDebug.log((String)"\u5220\u9664\u6587\u4ef6\u5939\u6210\u529f");
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5220\u9664\u6587\u4ef6\u5939\u5931\u8d25: "));
        }
    }

    public final String k(String object, String string, String charSequence) {
        block11: {
            block12: {
                String string2;
                block10: {
                    block9: {
                        try {
                            string2 = T0.i();
                            if (!TextUtils.isEmpty((CharSequence)string2)) break block9;
                            return "";
                        }
                        catch (Exception exception) {
                            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u5931\u8d25: "));
                            return "";
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence)this.d)) {
                        this.c();
                    }
                    if (!TextUtils.isEmpty((CharSequence)(string = this.u((String)object, string, (String)charSequence)))) break block10;
                    return "";
                }
                charSequence = this.j("/drive/v1/files", "GET");
                object = new HashMap();
                object.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36");
                object.put("Accept", "*/*");
                object.put("Accept-Encoding", "gzip, deflate, br");
                object.put("x-captcha-token", charSequence);
                object.put("authorization", string2);
                object.put("content-type", "application/json");
                object.put("x-client-id", "Xqp0kJBXWhwaTpB6");
                object.put("x-device-id", "925b7631473a13716b791d7f28289cad");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("https://api-pan.xunlei.com/drive/v1/files/");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("?space=&with[0]=public_share_tag&usage=FETCH");
                string = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)charSequence).toString(), object, null);
                if (string == null) break block11;
                if (string.isEmpty()) break block11;
                object = new JSONObject(string);
                if ((string = object.optJSONObject("links")) == null) break block12;
                string = string.optJSONObject("application/octet-stream");
                if (string == null) break block12;
                string = string.optString("url", "");
                if (TextUtils.isEmpty((CharSequence)string)) break block12;
                return string;
            }
            object = object.optString("web_content_link", "");
            return object;
        }
        return "";
    }

    public final String m() {
        return this.c;
    }

    public final Q0 n(String object) {
        try {
            object = h.matcher((CharSequence)object);
            if (((Matcher)object).find()) {
                object = new Q0(((Matcher)object).group(1), ((Matcher)object).group(2));
                return object;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u89e3\u6790\u8fc5\u96f7\u5206\u4eab\u94fe\u63a5\u5f02\u5e38: "));
        }
        return null;
    }

    public final List<S0> o(String arrayList) {
        Object object = this.n((String)((Object)arrayList));
        if (object == null) {
            return new ArrayList<S0>();
        }
        arrayList = ((Q0)object).a;
        this.a = arrayList;
        object = ((Q0)object).b;
        this.b = object;
        this.c = "";
        try {
            object = (ArrayList)this.f((String)((Object)arrayList), (String)object);
            if (((ArrayList)object).isEmpty()) {
                return new ArrayList<S0>();
            }
            arrayList = new ArrayList<S0>();
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                Object object22;
                R0 r02 = (R0)object.next();
                if (r02.d) {
                    for (Object object22 : (ArrayList)this.e(this.a, r02.a)) {
                        if (((R0)object22).d) continue;
                        S0 s02 = new S0(((R0)object22).a, ((R0)object22).b);
                        arrayList.add(s02);
                    }
                    continue;
                }
                object22 = new S0(r02.a, r02.b);
                arrayList.add((S0)object22);
            }
            return arrayList;
        }
        catch (Exception exception) {
            arrayList = com.github.catvod.spider.merge.C.a.c("\u83b7\u53d6\u8fc5\u96f7\u5206\u4eab\u6587\u4ef6\u5217\u8868\u5931\u8d25: ");
            ((StringBuilder)((Object)arrayList)).append(exception.getMessage());
            SpiderDebug.log((String)((StringBuilder)((Object)arrayList)).toString());
            return new ArrayList<S0>();
        }
    }

    public final void v(String stringArray, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.f.e()) || bl) {
            com.github.catvod.spider.merge.B.e.d("\u8fc5\u96f7\u76d8 setUser: ", (String)stringArray);
            Object object = stringArray;
            if (stringArray != null) {
                object = stringArray;
                if (stringArray.startsWith("http")) {
                    object = com.github.catvod.spider.merge.f0.d.k((String)stringArray).trim();
                }
            }
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object) && (stringArray = object.split("\\|")).length >= 2) {
                this.f.l(stringArray[0]);
                this.f.m(stringArray[1]);
                this.f.g();
            }
        }
    }
}

