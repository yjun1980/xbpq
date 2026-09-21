/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  okhttp3.FormBody$Builder
 *  okhttp3.Headers
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.GuaZi$1;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.f0.l;
import com.github.catvod.spider.merge.g0.k;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GuaZi
extends Spider {
    private static final String[] k = new String[]{"https://api.rqqakqyn.com"};
    private static final String[] l = new String[]{"https://api.anctjd.com", "https://apinew.uozvr.com", "https://api.w32z7vtd.com", "https://api.6a7nnf7.com", "https://api.umygrx3.com", "https://api.rmedphk.com"};
    private static final SecureRandom m = new SecureRandom();
    private static final Gson n = new Gson();
    public static final int o = 0;
    private String[] a;
    private int b;
    private String c;
    private SharedPreferences d;
    private String e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;

    public GuaZi() {
        String[] stringArray = l;
        this.a = stringArray;
        this.b = 0;
        this.c = stringArray[0];
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int a(GuaZi object, String string) {
        Objects.requireNonNull(object);
        int n2 = 0;
        if (string == null) {
            return n2;
        }
        object = string.toUpperCase();
        if (((String)object).contains("4K")) return 2160;
        if (((String)object).contains("2160")) return 2160;
        if (((String)object).contains("1080")) {
            return 1080;
        }
        if (((String)object).contains("720")) {
            return 720;
        }
        if (((String)object).contains("480")) {
            return 480;
        }
        if (((String)object).contains("360")) {
            return 360;
        }
        try {
            return Integer.parseInt(((String)object).replaceAll("[^0-9]", ""));
        }
        catch (Exception exception) {
            return n2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JsonObject b(String string, Map<String, ?> object, int n2) {
        synchronized (this) {
            boolean bl = string.startsWith("/App/Authentication/");
            if (!bl) {
                this.e();
            }
            int n3 = 0;
            while (true) {
                Exception exception;
                JsonObject jsonObject;
                if (n3 >= 2) {
                    jsonObject = new StringBuilder();
                    jsonObject.append("All hosts failed for path: ");
                    jsonObject.append(string);
                    exception = new Exception(jsonObject.toString());
                    throw exception;
                }
                for (int i2 = 0; i2 < ((String[])(jsonObject = this.a)).length; ++i2) {
                    String string2 = jsonObject[(this.b + i2) % ((String[])jsonObject).length];
                    try {
                        jsonObject = this.j(string2, string, (Map<String, ?>)((Object)exception));
                        if (jsonObject == null) continue;
                        this.b = (this.b + i2) % this.a.length;
                        this.c = string2;
                        return jsonObject;
                    }
                    catch (Exception exception2) {
                        void var3_3;
                        if (exception2.getMessage() == null || !exception2.getMessage().contains("TOKEN_EXPIRED") || bl || var3_3 >= true) continue;
                        this.j = false;
                        this.e();
                        return this.b(string, (Map<String, ?>)((Object)exception), (int)(var3_3 + true));
                    }
                }
                if (n3 == 0 && !bl) {
                    this.j = false;
                    try {
                        this.e();
                    }
                    catch (Exception exception3) {}
                }
                ++n3;
            }
        }
    }

    private void c(JsonObject object) {
        CharSequence charSequence = this.f((JsonObject)object, "token");
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.e = charSequence;
            if (!TextUtils.isEmpty((CharSequence)(object = this.f((JsonObject)object, "app_user_id")))) {
                this.f = object;
            }
            this.i();
            return;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Token \u83b7\u53d6\u5931\u8d25: ");
        ((StringBuilder)charSequence).append(object);
        throw new Exception(((StringBuilder)charSequence).toString());
    }

    private String d(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = Integer.toHexString(byArray[i2] & 0xFF);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        synchronized (this) {
            Exception exception2;
            block9: {
                boolean bl;
                if (this.j && !(bl = TextUtils.isEmpty((CharSequence)this.e))) {
                    return;
                }
                if (TextUtils.isEmpty((CharSequence)this.e)) {
                    if (this.i) {
                        this.k();
                    } else {
                        this.l();
                    }
                }
                try {
                    HashMap hashMap = new HashMap();
                    this.c(this.b("/App/Authentication/Authenticator/refresh", hashMap, 0));
                }
                catch (Exception exception2) {
                    if (!this.i) break block9;
                    this.k();
                }
                this.j = true;
                return;
            }
            throw exception2;
        }
    }

    private String f(JsonObject jsonObject, String string) {
        if (jsonObject != null && jsonObject.has(string) && !jsonObject.get(string).isJsonNull()) {
            try {
                String string2 = jsonObject.get(string).getAsString();
                return string2;
            }
            catch (Exception exception) {
                return String.valueOf(jsonObject.get(string));
            }
        }
        return "";
    }

    private List<h> g(JsonObject object2) {
        ArrayList<h> arrayList = new ArrayList<h>();
        if (object2 != null && object2.has("list") && !object2.get("list").isJsonNull()) {
            for (Object object2 : object2.getAsJsonArray("list")) {
                int n2;
                if (object2 == null || !object2.isJsonObject()) continue;
                JsonObject jsonObject = object2.getAsJsonObject();
                String string = this.f(jsonObject, "vod_id");
                int n3 = n2 = 0;
                if (jsonObject.has("vod_continu")) {
                    n3 = n2;
                    if (!jsonObject.get("vod_continu").isJsonNull()) {
                        try {
                            n3 = jsonObject.get("vod_continu").getAsInt();
                        }
                        catch (Exception exception) {
                            n3 = n2;
                        }
                    }
                }
                if (n3 == 0) {
                    object2 = "\u7535\u5f71";
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("\u66f4\u65b0\u81f3");
                    ((StringBuilder)object2).append(n3);
                    ((StringBuilder)object2).append("\u96c6");
                    object2 = ((StringBuilder)object2).toString();
                }
                h h2 = new h();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("/");
                stringBuilder.append(n3);
                h2.l(stringBuilder.toString());
                h2.m(this.f(jsonObject, "vod_name"));
                h2.n(this.f(jsonObject, "vod_pic"));
                h2.q((String)object2);
                arrayList.add(h2);
            }
        }
        return arrayList;
    }

    private String h(String string) {
        Object object = new PKCS8EncodedKeySpec(Base64.decode((String)"-----BEGIN RSA PRIVATE KEY-----\nMIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==\n-----END RSA PRIVATE KEY-----".replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "").replaceAll("\\s", ""), (int)2));
        object = KeyFactory.getInstance("RSA").generatePrivate((KeySpec)object);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, (Key)object);
        return new String(cipher.doFinal(Base64.decode((String)string, (int)2)), StandardCharsets.UTF_8);
    }

    private void i() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString("token", this.e).putString("token_id", this.f).putString("device_id", this.g).putString("device_key", this.h).putBoolean("registered", this.i).apply();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JsonObject j(String object, String object2, Map<String, ?> object3) {
        String string;
        Object object4;
        block27: {
            void var2_6;
            void var8_39;
            void var8_36;
            Object object5 = new HashMap<String, Object>();
            for (Map.Entry entry : object4.entrySet()) {
                ((HashMap)object5).put((String)entry.getKey(), entry.getValue());
            }
            if (((HashMap)object5).containsKey("token")) {
                String string2 = this.e;
                object4 = string2;
                if (string2 == null) {
                    object4 = "";
                }
                ((HashMap)object5).put("token", object4);
            }
            if (((HashMap)object5).containsKey("token_id")) {
                String string3 = this.f;
                object4 = string3;
                if (string3 == null) {
                    object4 = "";
                }
                ((HashMap)object5).put("token_id", object4);
            }
            object4 = n.toJson(object5).getBytes(StandardCharsets.UTF_8);
            Object object6 = "OITxa5OqAYjhswxx".getBytes(StandardCharsets.UTF_8);
            Charset charset = StandardCharsets.UTF_8;
            object5 = "rCMNwZASNBKZ8mXV";
            byte[] byArray = "rCMNwZASNBKZ8mXV".getBytes(charset);
            object6 = new SecretKeySpec((byte[])object6, "AES");
            Object object7 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            ((Cipher)object7).init(1, (Key)object6, new IvParameterSpec(byArray));
            object7 = this.d(((Cipher)object7).doFinal((byte[])object4)).toUpperCase();
            String string4 = String.valueOf(System.currentTimeMillis() / 1000L);
            object4 = Base64.decode((String)"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDUM5+/y8sPsWkd1/RQS64X259EUwxFXFE5HlA65MqrxnPs0JqoSRojSDy5QhwvROlaD6TwRQHKMY2OAZ6SnQeUJsChTEFIR9qUkwrs3/MVUMxjsv6JS6Oe/juclyJGTgVmDhB55EafXsD0SQYVj/QXXsxR6ewR5E2kL52yAAD4yQIDAQAB", (int)2);
            object4 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec((byte[])object4));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, (Key)object4);
            String string5 = Base64.encodeToString((byte[])cipher.doFinal("{\"iv\":\"rCMNwZASNBKZ8mXV\",\"key\":\"OITxa5OqAYjhswxx\"}".getBytes(StandardCharsets.UTF_8)), (int)2);
            object6 = com.github.catvod.spider.merge.C.a.c("token_id=");
            String string6 = this.f;
            object4 = string6;
            if (string6 == null) {
                object4 = "";
            }
            ((StringBuilder)object6).append((String)object4);
            ((StringBuilder)object6).append(",token=");
            String string7 = this.e;
            object4 = string7;
            if (string7 == null) {
                object4 = "";
            }
            O0.a((StringBuilder)object6, (String)object4, ",phone_type=1,request_key=", (String)object7, ",app_id=1,time=");
            ((StringBuilder)object6).append(string4);
            ((StringBuilder)object6).append(",keys=");
            ((StringBuilder)object6).append(string5);
            ((StringBuilder)object6).append("*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br");
            object4 = ((StringBuilder)object6).toString();
            try {
                object4 = MessageDigest.getInstance("MD5").digest(((String)object4).getBytes(StandardCharsets.UTF_8));
                BigInteger bigInteger = new BigInteger(1, (byte[])object4);
                object6 = new StringBuilder(bigInteger.toString(16));
                while (((StringBuilder)object6).length() < 32) {
                    ((StringBuilder)object6).insert(0, "0");
                }
                object4 = ((StringBuilder)object6).toString().toUpperCase();
            }
            catch (Exception exception) {
                object4 = "";
            }
            FormBody.Builder builder = new FormBody.Builder();
            Object object8 = object6 = this.e;
            if (object6 == null) {
                String string8 = "";
            }
            builder.add("token", (String)var8_36);
            Object object9 = object6 = this.f;
            if (object6 == null) {
                String string9 = "";
            }
            builder.add("token_id", (String)var8_39);
            builder.add("phone_type", "1");
            builder.add("time", string4);
            builder.add("phone_model", "xiaomi-25031");
            builder.add("keys", string5);
            builder.add("request_key", (String)object7);
            builder.add("signature", (String)object4);
            builder.add("app_id", "1");
            builder.add("ad_version", "1");
            Request.Builder builder2 = new Request.Builder();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append((String)object2);
            Request.Builder builder3 = builder2.url(((StringBuilder)object4).toString()).post((RequestBody)builder.build());
            object6 = com.github.catvod.spider.merge.A.c.b("User-Agent", "okhttp/3.12.0", "code", "GZ0055");
            Object object10 = object4 = this.g;
            if (object4 == null) {
                String string10 = "";
            }
            ((HashMap)object6).put("deviceId", var2_6);
            ((HashMap)object6).put("lang", "zh_cn");
            ((HashMap)object6).put("Cache-Control", "no-cache");
            ((HashMap)object6).put("Content-Type", "application/x-www-form-urlencoded");
            ((HashMap)object6).put("Version", "2608011");
            ((HashMap)object6).put("PackageName", "com.xf4a1daee2.g3520dce0d.f8a8ed889d20260813");
            ((HashMap)object6).put("Ver", "3.0.5.2");
            ((HashMap)object6).put("api-ver", "3.0.5.2");
            if (object == null) {
                object = this.c;
            }
            ((HashMap)object6).put("Referer", object);
            for (Map.Entry entry : ((HashMap)object6).entrySet()) {
                builder3.addHeader((String)entry.getKey(), (String)entry.getValue());
            }
            Response response = com.github.catvod.spider.merge.f0.d.a().newCall(builder3.build()).execute();
            object = response.body() != null ? response.body().string() : "";
            response.close();
            if (((String)object).isEmpty()) {
                return null;
            }
            if ((object = JsonParser.parseString((String)object).getAsJsonObject()).has("code") && object.get("code").getAsInt() != 200) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("TOKEN_EXPIRED: ");
                stringBuilder.append(object);
                throw new Exception(stringBuilder.toString());
            }
            if (!object.has("data")) return null;
            if (object.get("data").isJsonNull()) {
                return null;
            }
            if (!(object = object.get("data")).isJsonObject()) return null;
            string = this.f((JsonObject)(object = object.getAsJsonObject()), "response_key");
            if (TextUtils.isEmpty((CharSequence)string)) {
                return object;
            }
            if (!TextUtils.isEmpty((CharSequence)(object = this.f((JsonObject)object, "keys")))) {
                try {
                    object6 = JsonParser.parseString((String)this.h((String)object)).getAsJsonObject();
                    object = object6.has("key") && !object6.get("key").isJsonNull() ? object6.get("key").getAsString() : "OITxa5OqAYjhswxx";
                    object4 = object;
                    Object object11 = object5;
                }
                catch (Exception exception) {}
                if (!object6.has("iv")) break block27;
                object4 = object;
                Object object12 = object5;
                if (!object6.get("iv").isJsonNull()) {
                    String string11 = object6.get("iv").getAsString();
                    object4 = object;
                }
            }
            object4 = "OITxa5OqAYjhswxx";
            Object object13 = object5;
            break block27;
            catch (Exception exception) {
                object4 = object;
                Object object14 = object5;
            }
        }
        int n2 = string.length();
        object = new byte[n2 / 2];
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                void var2_15;
                object4 = ((String)object4).getBytes(StandardCharsets.UTF_8);
                byte[] byArray = var2_15.getBytes(StandardCharsets.UTF_8);
                object4 = new SecretKeySpec((byte[])object4, "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, (Key)object4, new IvParameterSpec(byArray));
                return JsonParser.parseString((String)new String(cipher.doFinal((byte[])object), StandardCharsets.UTF_8)).getAsJsonObject();
            }
            int n4 = n3 / 2;
            int n5 = Character.digit(string.charAt(n3), 16);
            object[n4] = (byte)(Character.digit(string.charAt(n3 + 1), 16) + (n5 << 4));
            n3 += 2;
        }
    }

    private void k() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("new_key", this.h);
        hashMap.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        this.c(this.b("/App/Authentication/Device/signIn", hashMap, 0));
    }

    private void l() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("new_key", this.h);
        hashMap.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        hashMap.put("phone_type", 1);
        hashMap.put("code", "");
        this.c(this.b("/App/Authentication/Device/signUp", hashMap, 0));
        this.i = true;
        this.i();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> hashMap) {
        int n2;
        bl = "hot".equals(object);
        String string = "0";
        Object object3 = bl ? "0" : object;
        object = "hot".equals(object) ? "d_hits" : (hashMap != null && hashMap.containsKey("sort") ? hashMap.get("sort") : "d_id");
        object3 = com.github.catvod.spider.merge.A.c.b("tid", (String)object3, "page", (String)object2);
        ((HashMap)object3).put("pageSize", "30");
        ((HashMap)object3).put("sort", object);
        object = hashMap != null && hashMap.containsKey("area") ? hashMap.get("area") : "0";
        ((HashMap)object3).put("area", object);
        object = string;
        if (hashMap != null) {
            object = string;
            if (hashMap.containsKey("year")) {
                object = hashMap.get("year");
            }
        }
        ((HashMap)object3).put("year", object);
        object = this.g(this.b("/App/IndexList/indexList", (Map<String, ?>)object3, 0));
        int n3 = 1;
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n2 = n3;
        }
        object2 = new f();
        ((f)object2).y((List<h>)object);
        ((f)object2).k(n2, 9999, 30, 999999);
        return ((f)object2).toString();
    }

    public String detailContent(List<String> object) {
        Object object2;
        Object object3;
        this.e();
        int n2 = 0;
        object = object3 = object.get(0);
        if (((String)object3).contains("/")) {
            object = ((String)object3).split("/")[0];
        }
        long l2 = System.currentTimeMillis() / 1000L;
        Object object4 = new HashMap<String, Object>();
        object3 = object2 = this.f;
        if (object2 == null) {
            object3 = "";
        }
        ((HashMap)object4).put("token_id", object3);
        ((HashMap)object4).put("vod_id", object);
        ((HashMap)object4).put("mobile_time", String.valueOf(l2));
        object3 = object2 = this.e;
        if (object2 == null) {
            object3 = "";
        }
        ((HashMap)object4).put("token", object3);
        object3 = new HashMap();
        ((HashMap)object3).put("vurl_cloud_id", "2");
        ((HashMap)object3).put("vod_d_id", object);
        object2 = this.b("/App/IndexPlay/playInfo", (Map<String, ?>)object4, 0);
        object3 = this.b("/App/Resource/Vurl/show", (Map<String, ?>)object3, 0);
        if (object2 != null && object2.has("vodInfo") && !object2.get("vodInfo").isJsonNull()) {
            JsonObject jsonObject = object2.getAsJsonObject("vodInfo");
            object4 = new h();
            ((h)object4).l((String)object);
            ((h)object4).m(this.f(jsonObject, "vod_name"));
            ((h)object4).n(this.f(jsonObject, "vod_pic"));
            ((h)object4).s(this.f(jsonObject, "vod_year"));
            ((h)object4).i(this.f(jsonObject, "vod_area"));
            ((h)object4).h(this.f(jsonObject, "vod_actor"));
            ((h)object4).k(this.f(jsonObject, "vod_director"));
            ((h)object4).j(this.f(jsonObject, "vod_use_content").replace("\u3000", "\n").trim());
            HashMap hashMap = new HashMap();
            Object object5 = new ArrayList();
            if (object3 != null && object3.has("list") && object3.get("list").isJsonArray()) {
                JsonArray jsonArray = object3.getAsJsonArray("list");
                while (n2 < jsonArray.size()) {
                    object2 = jsonArray.get(n2).getAsJsonObject();
                    if (object2.has("play") && !object2.get("play").isJsonNull()) {
                        Object object62 = object2.getAsJsonObject("play");
                        object = jsonArray.size() == 1 ? this.f(jsonObject, "vod_name") : String.valueOf(n2 + 1);
                        object3 = object;
                        if (object2.has("name")) {
                            object3 = object;
                            if (!object2.get("name").isJsonNull()) {
                                object2 = this.f((JsonObject)object2, "name");
                                object3 = object;
                                if (!TextUtils.isEmpty((CharSequence)object2)) {
                                    object3 = object2;
                                }
                            }
                        }
                        for (Object object62 : object62.entrySet()) {
                            object = (String)object62.getKey();
                            if (object62.getValue() == null || ((JsonElement)object62.getValue()).isJsonNull() || !((JsonElement)object62.getValue()).isJsonObject() || !(object62 = ((JsonElement)object62.getValue()).getAsJsonObject()).has("param") || object62.get("param").isJsonNull() || ((String)(object62 = this.f((JsonObject)object62, "param"))).isEmpty()) continue;
                            if (!hashMap.containsKey(object)) {
                                hashMap.put(object, new ArrayList());
                                ((ArrayList)object5).add(object);
                            }
                            ((List)hashMap.get(object)).add(r.b((String)object3, "$", (String)object62, "||", (String)object));
                        }
                    }
                    ++n2;
                }
            }
            if (((ArrayList)object5).isEmpty()) {
                ((h)object4).o("\u5929\u9f99\u74dc\u5b50");
                ((h)object4).p("");
            } else {
                Collections.sort(object5, new GuaZi$1(this));
                object3 = new ArrayList<String>();
                object = new ArrayList<String>();
                object5 = ((ArrayList)object5).iterator();
                while (object5.hasNext()) {
                    object2 = (String)object5.next();
                    ((ArrayList)object3).add(object2);
                    ((ArrayList)object).add(TextUtils.join((CharSequence)"#", (Iterable)((Iterable)hashMap.get(object2))));
                }
                ((h)object4).o(TextUtils.join((CharSequence)"$$$", object3));
                ((h)object4).p(TextUtils.join((CharSequence)"$$$", object));
            }
            return com.github.catvod.spider.merge.K.f.n((h)object4);
        }
        object = new f();
        ((f)object).y(Collections.<h>emptyList());
        return ((f)object).toString();
    }

    public String homeContent(boolean bl) {
        int n2;
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        arrayList.add(new com.github.catvod.spider.merge.K.a("hot", "\u70ed\u95e8"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("1", "\u7535\u5f71"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("2", "\u7535\u89c6\u5267"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("4", "\u52a8\u6f2b"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("3", "\u7efc\u827a"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("64", "\u77ed\u5267"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("74", "\u6f2b\u5267"));
        arrayList.add(new com.github.catvod.spider.merge.K.a("33", "\u513f\u7ae5"));
        if (!bl) {
            f f2 = new f();
            f2.a(arrayList);
            return f2.toString();
        }
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>> linkedHashMap = new LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>>();
        ArrayList<b> arrayList2 = new ArrayList<b>();
        arrayList2.add(new b("\u5168\u90e8", "0"));
        for (n2 = 0; n2 < 11; ++n2) {
            String object = (new String[]{"\u5927\u9646", "\u9999\u6e2f", "\u53f0\u6e7e", "\u7f8e\u56fd", "\u97e9\u56fd", "\u65e5\u672c", "\u82f1\u56fd", "\u6cd5\u56fd", "\u6cf0\u56fd", "\u5370\u5ea6", "\u5176\u4ed6"})[n2];
            arrayList2.add(new b(object, object));
        }
        ArrayList<b> arrayList3 = new ArrayList<b>();
        arrayList3.add(new b("\u5168\u90e8", "0"));
        for (n2 = 2025; n2 >= 2005; --n2) {
            arrayList3.add(new b(String.valueOf(n2), String.valueOf(n2)));
        }
        arrayList3.add(new b("\u66f4\u65e9", "2004"));
        ArrayList<b> arrayList4 = new ArrayList<b>();
        arrayList4.add(new b("\u6700\u65b0", "d_id"));
        arrayList4.add(new b("\u6700\u70ed", "d_hits"));
        arrayList4.add(new b("\u63a8\u8350", "d_score"));
        for (com.github.catvod.spider.merge.K.a a2 : arrayList) {
            ArrayList<com.github.catvod.spider.merge.K.c> arrayList5 = new ArrayList<com.github.catvod.spider.merge.K.c>();
            arrayList5.add(new com.github.catvod.spider.merge.K.c("area", "\u5730\u533a", arrayList2));
            arrayList5.add(new com.github.catvod.spider.merge.K.c("year", "\u5e74\u4efd", arrayList3));
            arrayList5.add(new com.github.catvod.spider.merge.K.c("sort", "\u6392\u5e8f", arrayList4));
            ((AbstractMap)linkedHashMap).put(a2.a(), arrayList5);
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("area", "0", "year", "0");
        hashMap.put("pageSize", "30");
        hashMap.put("sort", "d_hits");
        hashMap.put("page", "1");
        hashMap.put("tid", "0");
        return com.github.catvod.spider.merge.K.f.o(this.g(this.b("/App/IndexList/indexList", hashMap, 0)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init(Context var1_1, String var2_5) {
        block36: {
            try {
                Init.init((Context)var1_1);
            }
            catch (Exception var2_41) {
                // empty catch block
            }
            if (var1_1 != null) {
                var1_2 = var1_1.getApplicationContext();
            } else {
                var1_3 = null;
            }
            var2_40 = var1_4;
            if (var1_4 == null) {
                try {
                    var2_40 = Init.context();
                }
                catch (Exception var2_42) {
                    var2_40 = var1_4;
                }
            }
            if (var2_40 != null) {
                this.d = var1_5 = var2_40.getSharedPreferences("guazi_auth", 0);
                if (var1_5 != null) {
                    this.e = var1_5.getString("token", "");
                    this.f = this.d.getString("token_id", "");
                    this.g = this.d.getString("device_id", "");
                    this.h = this.d.getString("device_key", "");
                    this.i = this.d.getBoolean("registered", TextUtils.isEmpty((CharSequence)this.e) ^ true);
                }
                this.j = false;
                if (TextUtils.isEmpty((CharSequence)this.g) || TextUtils.isEmpty((CharSequence)this.h)) {
                    var1_6 = new StringBuilder(15);
                    for (var3_44 = 0; var3_44 < 15; ++var3_44) {
                        var1_6.append(GuaZi.m.nextInt(10));
                    }
                    this.g = var1_6.toString();
                    var1_7 = new byte[20];
                    GuaZi.m.nextBytes(var1_7);
                    this.h = this.d(var1_7).toUpperCase();
                    this.e = "";
                    this.f = "";
                    this.i = false;
                    this.i();
                }
            }
            var7_45 = new ArrayList();
            var8_46 = GuaZi.k;
            block15: for (var3_44 = 0; var3_44 < 1; ++var3_44) {
                block32: {
                    block34: {
                        block33: {
                            var1_10 = var8_46[var3_44];
                            var2_40 = new StringBuilder();
                            var2_40.append(var1_10);
                            var2_40.append("/gz/initialize/getApiUrlList?parameter=key");
                            var2_40 = var2_40.toString();
                            var1_11 = new Request.Builder();
                            var1_12 = var1_11.url((String)var2_40).post(RequestBody.create(null, (byte[])new byte[0])).build();
                            var1_13 = com.github.catvod.spider.merge.f0.d.a().newCall(var1_12).execute();
                            if (var1_13.code() != 200 || var1_13.body() == null) break block32;
                            var2_40 = var1_13.body().string();
                            var1_13.close();
                            var1_14 = JsonParser.parseString((String)var2_40).getAsJsonObject();
                            if (!var1_14.has("code") || var1_14.get("code").getAsInt() != 200 || !var1_14.has("data")) continue;
                            var1_15 = var1_14.get("data").getAsString();
                            var6_48 = TextUtils.isEmpty((CharSequence)var1_15);
                            if (!var6_48) break block33;
                            var1_16 = "";
                            break block34;
                        }
                        try {
                            var9_49 /* !! */  = (Request.Builder)Base64.decode((String)var1_15, (int)2);
                            var1_17 = var2_40 = new String((byte[])var9_49 /* !! */ , StandardCharsets.UTF_8);
                        }
                        catch (Exception var2_43) {
                            ** continue;
                        }
                    }
lbl69:
                    // 2 sources

                    while (true) {
                        block35: {
                            try {
                                if (TextUtils.isEmpty((CharSequence)var1_18)) continue block15;
                                var1_19 = JsonParser.parseString((String)var1_18);
                                if (var1_19.isJsonArray()) {
                                    var2_40 = var1_19.getAsJsonArray().iterator();
                                    while (var2_40.hasNext()) {
                                        var1_21 = ((JsonElement)var2_40.next()).getAsString().trim();
                                        if (var1_21.isEmpty()) continue;
                                        var7_45.add(var1_21);
                                    }
                                    break block35;
                                }
                                if (!var1_19.isJsonObject()) break block35;
                                var2_40 = var1_19.getAsJsonObject();
                                for (var4_47 = 0; var4_47 < 4; ++var4_47) {
                                    var1_23 = (new String[]{"list", "urls", "data", "hosts"})[var4_47];
                                    if (!var2_40.has(var1_23) || !var2_40.get(var1_23).isJsonArray()) continue;
                                    var2_40 = var2_40.getAsJsonArray(var1_23).iterator();
                                    while (var2_40.hasNext()) {
                                        var1_25 = ((JsonElement)var2_40.next()).getAsString().trim();
                                        if (var1_25.isEmpty()) continue;
                                        var7_45.add(var1_25);
                                    }
                                    break;
                                }
                            }
                            catch (Exception var1_36) {
                                continue block15;
                            }
                        }
                        if (var7_45.isEmpty()) continue block15;
                        break block15;
                        break;
                    }
                }
                var1_13.close();
            }
            this.a = var7_45.isEmpty() == false ? var7_45.toArray(new String[0]) : GuaZi.l;
            this.b = 0;
            var1_28 = this.a;
            if (var1_28 == null || var1_28.length == 0) {
                var1_34 = GuaZi.l[0];
            } else {
                var2_40 = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                var7_45 = new OkHttpClient.Builder();
                var1_29 = TimeUnit.SECONDS;
                var7_45 = var7_45.connectTimeout(3L, var1_29).readTimeout(3L, var1_29).writeTimeout(3L, var1_29).hostnameVerifier((HostnameVerifier)com.github.catvod.spider.merge.g0.k.a).sslSocketFactory((SSLSocketFactory)new l(), com.github.catvod.spider.merge.f0.l.d).build();
                block20: for (String var1_31 : this.a) {
                    var9_49 /* !! */  = new Request.Builder();
                    var9_49 /* !! */  = var7_45.newCall(var9_49 /* !! */ .url(var1_31).head().headers(Headers.of((Map)var2_40)).build()).execute();
                    var5_50 = var9_49 /* !! */ .code();
                    var9_49 /* !! */ .close();
                    if (var5_50 < 200 || var5_50 >= 400) lbl-1000:
                    // 2 sources

                    {
                        continue block20;
                    }
                    break block36;
                }
                var1_33 = this.a[0];
            }
        }
        this.c = var1_35;
        try {
            this.e();
            return;
        }
        catch (Exception var1_38) {
            return;
        }
        catch (Exception var1_37) {
            ** continue;
        }
    }

    public String playerContent(String object, String object2, List<String> object3) {
        object2 = ((String)object2).split("\\|\\|");
        int n2 = ((String[])object2).length;
        object3 = "";
        if (n2 >= 1 && !TextUtils.isEmpty((CharSequence)object2[0])) {
            String[] stringArray = object2[0].split("&");
            if (((String[])object2).length > 1) {
                object = object2[1];
            }
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            int n3 = stringArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                String[] stringArray2 = stringArray[n2].split("=", 2);
                if (stringArray2.length != 2) continue;
                object2 = "vod_d_id".equals(stringArray2[0]) ? "vod_id" : stringArray2[0];
                hashMap.put(object2, stringArray2[1]);
            }
            if (!TextUtils.isEmpty((CharSequence)object)) {
                hashMap.put("resolution", object);
            }
            object2 = this.b("/App/Resource/VurlDetail/showOne", hashMap, 0);
            object = object3;
            if (object2 != null) {
                object = object3;
                if (object2.has("url")) {
                    object = object3;
                    if (!object2.get("url").isJsonNull()) {
                        object = object2.get("url").getAsString();
                    }
                }
            }
            object3 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Lavf/57.83.100", "Referer", "http://WJiZxLXA2.com/");
            object2 = new f();
            ((f)object2).w((String)object);
            ((f)object2).g((Map<String, String>)object3);
            ((f)object2).b("http://127.0.0.1:9978/proxy?do=diydanmu");
            return ((f)object2).toString();
        }
        object = new f();
        ((f)object).w("");
        return ((f)object).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String list, boolean bl, String object) {
        int n2;
        list = com.github.catvod.spider.merge.A.c.b("keywords", list, "order_val", "1");
        if (!TextUtils.isEmpty((CharSequence)object)) {
            ((HashMap)((Object)list)).put("page", object);
        }
        list = this.g(this.b("/App/Index/findMoreVod", (Map<String, ?>)((Object)list), 0));
        int n3 = n2 = 1;
        try {
            if (!TextUtils.isEmpty((CharSequence)object)) {
                n3 = Integer.parseInt((String)object);
            }
        }
        catch (Exception exception) {
            n3 = n2;
        }
        object = new f();
        ((f)object).y(list);
        ((f)object).k(n3, 9999, 30, 999999);
        return ((f)object).toString();
    }
}

