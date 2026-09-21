/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.net.UrlQuerySanitizer
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.H;
import com.github.catvod.spider.merge.I.a;
import com.github.catvod.spider.merge.I.b;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.I.e1;
import com.github.catvod.spider.merge.I.f;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.g;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.I.l;
import com.github.catvod.spider.merge.I.m;
import com.github.catvod.spider.merge.I.q;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.v;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.Serializable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u {
    public Boolean a = Boolean.FALSE;
    public int b = 4;
    public String c = "http://127.0.0.1:9966";
    private final Map<String, Map<String, String>> d;
    private Map<String, String> e;
    private final Map<String, JSONObject> f;
    private ScheduledExecutorService g;
    private final List<String> h = new ArrayList<String>();
    private AlertDialog i;
    private String j;
    private k k;
    private com.github.catvod.spider.merge.L.g l;
    private com.github.catvod.spider.merge.L.e m;
    public com.github.catvod.spider.merge.L.m n;
    private final ReentrantLock o;
    private Map<String, String> p;
    private final Map<String, String> q = new HashMap<String, String>();
    public String r = "";

    u() {
        this.o = new ReentrantLock();
        this.d = new HashMap<String, Map<String, String>>();
        this.p = new HashMap<String, String>();
        this.e = new HashMap<String, String>();
        this.f = new HashMap<String, JSONObject>();
        this.n = com.github.catvod.spider.merge.L.m.j(com.github.catvod.spider.merge.c.b.d(com.github.catvod.spider.merge.c.b.e("aliyundrive_user")));
        if (com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.c.b.d(this.I()))) {
            this.b = Integer.parseInt(com.github.catvod.spider.merge.c.b.d(this.I()));
        }
        this.l = com.github.catvod.spider.merge.L.g.d(com.github.catvod.spider.merge.c.b.d(com.github.catvod.spider.merge.c.b.e("aliyundrive_oauth")));
        this.m = com.github.catvod.spider.merge.L.e.c(com.github.catvod.spider.merge.c.b.d(com.github.catvod.spider.merge.c.b.e("aliyundrive_drive")));
    }

    private String A(String string, k object) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        boolean bl = ((k)object).e().isEmpty();
        string = "root";
        if (bl) {
            if (!((k)object).m()) {
                string = "";
            }
            return string;
        }
        if (((com.github.catvod.spider.merge.L.f)(object = ((k)object).e().get(0))).m().equals("folder")) {
            string = ((com.github.catvod.spider.merge.L.f)object).d();
        }
        return string;
    }

    private String B(JSONObject object, String string, String string2, boolean bl) {
        if (!object.has("live_transcoding_task_list")) {
            return "";
        }
        object = object.getJSONArray("live_transcoding_task_list");
        object = bl ? Server.D(string, string2) : u.E((JSONArray)object);
        return object;
    }

    private String C(String[] object) {
        CharSequence charSequence = this.s(object[0], object[1]);
        Serializable serializable = BaseApi.get().h;
        String string = com.github.catvod.spider.merge.i0.m.b((String)charSequence);
        Gson gson = new Gson();
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
        hashMap.put("Url", charSequence);
        ((ConcurrentHashMap)serializable).put((String)string, (String)gson.toJson((Object)hashMap));
        charSequence = Server.y((String)charSequence, t.a.b, 500);
        if (BaseApi.get().d.booleanValue()) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(object[2]);
            ((StringBuilder)serializable).append(object[3]);
            object = ((StringBuilder)serializable).toString();
            BaseApi.get().downloadFileWithDownloadManager((String)charSequence, (String)object, this.v());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("\u6b63\u5728\u4e0b\u8f7d ");
            ((StringBuilder)charSequence).append((String)object);
            com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence).toString());
            object = Server.B();
        } else {
            object = NetPan.getIsoDownloadUrl((String)charSequence);
        }
        return object;
    }

    private static String E(JSONArray jSONArray) {
        for (int i2 = jSONArray.length() - 1; i2 >= 0; --i2) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            if (!com.github.catvod.spider.merge.R0.e.d(jSONObject.getString("url"))) continue;
            return jSONObject.getString("url");
        }
        return "";
    }

    private static boolean M(String string) {
        string = new UrlQuerySanitizer(string).getValue("x-oss-expires");
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        if (Long.parseLong(string) - System.currentTimeMillis() / 1000L > 60L) {
            bl2 = false;
        }
        return bl2;
    }

    private static boolean N(JSONObject object) {
        boolean bl;
        block3: {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("playInfo:");
                stringBuilder.append(object);
                SpiderDebug.log((String)stringBuilder.toString());
                object = object.getJSONArray("live_transcoding_task_list");
                stringBuilder = new UrlQuerySanitizer(u.E((JSONArray)object));
                object = stringBuilder.getValue("x-oss-expires");
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                bl = false;
                if (!bl2) break block3;
                return false;
            }
            catch (JSONException jSONException) {
                throw new RuntimeException(jSONException);
            }
        }
        if (Long.parseLong((String)object) - System.currentTimeMillis() / 1000L <= 60L) {
            bl = true;
        }
        return bl;
    }

    private void O(HashMap<String, String> hashMap, String string, com.github.catvod.spider.merge.L.f object, List<com.github.catvod.spider.merge.L.f> list, List<com.github.catvod.spider.merge.L.f> list2, List<com.github.catvod.spider.merge.L.f> list3, String object2, boolean bl) {
        if (bl) {
            list = new ArrayList<com.github.catvod.spider.merge.L.f>();
        }
        JsonObject object32 = new JsonObject();
        object32.addProperty("limit", (Number)200);
        object32.addProperty("share_id", string);
        object32.addProperty("parent_file_id", ((com.github.catvod.spider.merge.L.f)((Object)object)).d());
        Object object3 = hashMap != null ? hashMap.get("type") : "name";
        object32.addProperty("order_by", (String)object3);
        object3 = hashMap != null ? hashMap.get("order") : "ASC";
        object32.addProperty("order_direction", (String)object3);
        if (!((String)object2).isEmpty()) {
            object32.addProperty("marker", (String)object2);
        }
        object2 = (com.github.catvod.spider.merge.L.f)com.github.catvod.spider.merge.G1.d.a(this.j("adrive/v2/file/list_by_share", object32.toString(), true), com.github.catvod.spider.merge.L.f.class);
        try {
            if (((com.github.catvod.spider.merge.L.f)object2).e().size() >= 1) {
                object3 = ((com.github.catvod.spider.merge.L.f)object2).e();
                com.github.catvod.spider.merge.L.l l2 = new com.github.catvod.spider.merge.L.l();
                Collections.sort(object3, l2);
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("listFiles error");
            stringBuilder.append(exception.getMessage());
            com.github.catvod.spider.merge.i0.m.y(stringBuilder.toString());
        }
        for (com.github.catvod.spider.merge.L.f f2 : ((com.github.catvod.spider.merge.L.f)object2).e()) {
            if (f2.m().equals("folder")) {
                list.add(f2);
                continue;
            }
            if (!(f2.a().equals("video") || f2.a().equals("audio") || BaseApi.get().d.booleanValue())) {
                if (!com.github.catvod.spider.merge.i0.m.t(f2.c())) continue;
                list3.add(f2);
                continue;
            }
            f2.n(((com.github.catvod.spider.merge.L.f)((Object)object)).f());
            list2.add(f2);
        }
        if (!((com.github.catvod.spider.merge.L.f)object2).g().isEmpty()) {
            this.O(hashMap, string, (com.github.catvod.spider.merge.L.f)((Object)object), list, list2, list3, ((com.github.catvod.spider.merge.L.f)object2).g(), bl);
        }
        if (bl) {
            object = list.iterator();
            while (object.hasNext()) {
                this.P(hashMap, string, object.next(), list, list2, list3, bl);
            }
        }
    }

    private void P(HashMap<String, String> hashMap, String string, com.github.catvod.spider.merge.L.f f2, List<com.github.catvod.spider.merge.L.f> list, List<com.github.catvod.spider.merge.L.f> list2, List<com.github.catvod.spider.merge.L.f> list3, boolean bl) {
        this.O(hashMap, string, f2, list, list2, list3, "", bl);
    }

    private String Q(String string, String string2, boolean bl) {
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://open.aliyundrive.com/adrive/v1.0/", string);
        }
        Object object = this.v();
        ((HashMap)object).put((String)"authorization", (String)this.l.c());
        Object object2 = com.github.catvod.spider.merge.f0.d.i(string, string2, object);
        object = new StringBuilder();
        ((StringBuilder)object).append(((com.github.catvod.spider.merge.f0.i)object2).b());
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(((com.github.catvod.spider.merge.f0.i)object2).a());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (bl && (((com.github.catvod.spider.merge.f0.i)object2).b() == 400 || ((com.github.catvod.spider.merge.f0.i)object2).b() == 401)) {
            try {
                SpiderDebug.log((String)"oauthRequestAlitv Request...");
                object2 = com.github.catvod.spider.merge.f0.d.f("http://api.extscreen.com/aliyundrive/qrcode", "{\"scopes\":\"user:base,file:all:read,file:all:write\"}", null).a();
                object = new JSONObject((String)object2);
                object = object.getJSONObject("data").getString("sid");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("https://open.aliyundrive.com/oauth/users/qrcode/authorize?sid=");
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("{\"scope\":\"user:base,file:all:read,file:all:write\",\"authorize\":1,\"drives\":[\"backup\",\"resource\"],\"sid\":\"");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("\",\"scopes\":[\"user:base\",\"file:all:read\",\"file:all:write\"]}");
                this.j((String)object2, ((StringBuilder)charSequence).toString(), true);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("https://openapi.alipan.com/oauth/qrcode/");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("/status");
                String string3 = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object2).toString());
                charSequence = v.a();
                object = UUID.randomUUID().toString().replace("-", "");
                object2 = String.valueOf(ThreadLocalRandom.current().nextLong(100000000000L, 1000000000000L));
                Object object3 = new JSONObject(string3);
                object3 = v.b(object3.getString("authCode"), (String)charSequence, (String)object, (String)object2);
                string3 = object3.getAsJsonObject("data").get("ciphertext").getAsString();
                String string4 = object3.getAsJsonObject("data").get("iv").getAsString();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(t.a.c);
                ((StringBuilder)object3).append("/api/getAliTvToken/?ciphertext=");
                ((StringBuilder)object3).append(URLEncoder.encode(string3));
                ((StringBuilder)object3).append("&iv=");
                ((StringBuilder)object3).append(URLEncoder.encode(string4));
                ((StringBuilder)object3).append("&t=");
                ((StringBuilder)object3).append((String)charSequence);
                ((StringBuilder)object3).append("&uniqueID=");
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append("&wifiMac=");
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object = new com.github.catvod.spider.merge.L.g();
                object2 = com.github.catvod.spider.merge.f0.d.k((String)object2);
                ((com.github.catvod.spider.merge.L.g)object).f((String)object2);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("oauthRequestAlitv Request accessToken...");
                ((StringBuilder)charSequence).append((String)object2);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                ((com.github.catvod.spider.merge.L.g)object).g();
                ((com.github.catvod.spider.merge.L.g)object).e();
                this.l = object;
            }
            catch (Exception exception) {
                object2 = com.github.catvod.spider.merge.C.a.c("oauthRequestAlitv error");
                ((StringBuilder)object2).append(exception.getMessage());
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object2).toString());
                SpiderDebug.log((String)"oauthRequestWebDav Request...");
                Object object4 = new JsonObject();
                object4.addProperty("authorize", (Number)1);
                object4.addProperty("scope", "user:base,file:all:read,file:all:write");
                object2 = this.j("https://open.aliyundrive.com/oauth/users/authorize?client_id=641d844e426841ea90cf6f3f933e0af7&redirect_uri=https://adrive.xdow.net/oauth/access_token?redirect_uri=http://127.0.0.1:8081&scope=file:all:write,file:all:read,user:base", object4.toString(), true);
                SpiderDebug.log((String)"OAuth Redirect...");
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("https://adrive.xdow.net/oauth/access_token?code=");
                ((StringBuilder)object4).append(((com.github.catvod.spider.merge.L.b)com.github.catvod.spider.merge.G1.d.a((String)object2, com.github.catvod.spider.merge.L.b.class)).a());
                object4 = com.github.catvod.spider.merge.L.g.d(com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object4).toString()));
                ((com.github.catvod.spider.merge.L.g)object4).e();
                this.l = object4;
            }
            return this.Q(string, string2, false);
        }
        return ((com.github.catvod.spider.merge.f0.i)object2).a();
    }

    private String T(String string, JsonObject object) {
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://api.aliyundrive.com/", string);
        }
        com.github.catvod.spider.merge.f0.i i2 = com.github.catvod.spider.merge.f0.d.i(string, object.toString(), this.v());
        object = new StringBuilder();
        ((StringBuilder)object).append(i2.b());
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(",");
        ((StringBuilder)object).append(i2.a());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return i2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean W() {
        try {
            SpiderDebug.log((String)"refreshAccessToken...");
            JsonObject jsonObject = new JsonObject();
            Object object = this.n.f();
            String string = object;
            if (((String)object).isEmpty()) {
                string = this.j;
            }
            object = string;
            if (string != null) {
                object = string;
                if (string.startsWith("http")) {
                    object = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            jsonObject.addProperty("refresh_token", (String)object);
            jsonObject.addProperty("grant_type", "refresh_token");
            string = this.T("https://auth.aliyundrive.com/v2/account/token", jsonObject);
            object = com.github.catvod.spider.merge.L.m.j(string);
            ((com.github.catvod.spider.merge.L.m)object).k();
            this.n = object;
            if (!((com.github.catvod.spider.merge.L.m)object).b().isEmpty()) {
                return true;
            }
            object = new Exception(string);
            throw object;
        }
        catch (Exception exception) {
            if (exception instanceof TimeoutException) {
                this.d0();
                return false;
            }
            exception.printStackTrace();
            com.github.catvod.spider.merge.L.m m2 = this.n;
            m2.a();
            m2.k();
            this.d0();
            com.github.catvod.spider.merge.i0.m.y("\u5230\u914d\u7f6e\u4e2d\u5fc3\u914d\u7f6e\u963f\u91cc token");
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean Y() {
        try {
            Object object = new com.github.catvod.spider.merge.H0.c();
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("04");
            Object object2 = ((com.github.catvod.spider.merge.H0.c)object).a;
            Object object3 = com.github.catvod.spider.merge.B.j.e(((com.github.catvod.spider.merge.H0.a)object2).d, ((com.github.catvod.spider.merge.H0.c)object).b, ((com.github.catvod.spider.merge.H0.a)object2).c, ((com.github.catvod.spider.merge.H0.a)object2).a, ((com.github.catvod.spider.merge.H0.a)object2).b);
            com.github.catvod.spider.merge.I0.a a2 = com.github.catvod.spider.merge.c1.d.n(((com.github.catvod.spider.merge.H0.b)object3).a, (((com.github.catvod.spider.merge.H0.a)object2).c.toString(16).length() + 1) / 2);
            a2.d(com.github.catvod.spider.merge.c1.d.n(((com.github.catvod.spider.merge.H0.b)object3).b, (((com.github.catvod.spider.merge.H0.a)object2).c.toString(16).length() + 1) / 2).a());
            ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.c1.d.d(a2.a()));
            object2 = ((StringBuilder)charSequence).toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("5dde4e1bdf9e4966b387ba58f4b3fdc3:");
            ((StringBuilder)object3).append(this.n.d());
            ((StringBuilder)object3).append(":");
            ((StringBuilder)object3).append(this.n.h());
            ((StringBuilder)object3).append(":");
            ((StringBuilder)object3).append(0);
            object3 = ((StringBuilder)object3).toString();
            try {
                object = com.github.catvod.spider.merge.K1.d.k((String)object3, (com.github.catvod.spider.merge.H0.c)object, MessageDigest.getInstance("SHA-256"));
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                IllegalStateException illegalStateException = new IllegalStateException("Could not find SHA-256 message digest in provided java environment");
                throw illegalStateException;
            }
            charSequence = com.github.catvod.spider.merge.c1.d.d(((com.github.catvod.spider.merge.H0.d)object).a().a());
            object = this.n;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(((String)charSequence).substring(((String)charSequence).length() - 128));
            ((StringBuilder)object3).append("01");
            ((com.github.catvod.spider.merge.L.m)object).m(((StringBuilder)object3).toString());
            object = new JSONObject();
            object.put("deviceName", (Object)"samsung");
            object.put("modelName", (Object)"SM-G9810");
            object.put("nonce", 0);
            object.put("pubKey", object2);
            object.put("refreshToken", (Object)this.n.f());
            object2 = new JSONObject(this.c0("users/v1/users/device/create_session", object.toString(), false));
            if (object2.getBoolean("success")) {
                return true;
            }
            object = new Exception(object2.toString());
            throw object;
        }
        catch (Exception exception) {
            this.n.m("");
            exception.printStackTrace();
            return false;
        }
    }

    public static void a(u u2) {
        Objects.requireNonNull(u2);
        for (String string : new ArrayList<String>(u2.h)) {
            com.github.catvod.spider.merge.B.e.d("Delete...", string);
            String string2 = u2.m.b();
            boolean bl = false;
            if (((com.github.catvod.spider.merge.L.i)com.github.catvod.spider.merge.G1.d.a(u2.j("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", string2, string, string), true), com.github.catvod.spider.merge.L.i.class)).b().c() == 404) {
                bl = true;
            }
            if (!bl) continue;
            ((ArrayList)u2.h).remove(string);
        }
    }

    public static void b(u u2, com.github.catvod.spider.merge.L.c object) {
        ScheduledExecutorService scheduledExecutorService;
        Objects.requireNonNull(u2);
        object = ((com.github.catvod.spider.merge.L.c)object).d();
        u2.g = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new i(u2, object, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b0(com.github.catvod.spider.merge.L.c c2) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.m.e(240), com.github.catvod.spider.merge.i0.m.e(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.K1.d.b(c2.a(), 240, 2));
            c2 = new FrameLayout((Context)Init.context());
            layoutParams.gravity = 17;
            c2.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)Init.getActivity());
            c2 = builder.setView((View)c2);
            m m2 = new m(this);
            c2 = c2.setOnCancelListener(m2);
            q q2 = new q(this);
            c2 = c2.setOnDismissListener(q2).show();
            this.i = c2;
            Window window = c2.getWindow();
            c2 = new ColorDrawable(0);
            window.setBackgroundDrawable((Drawable)c2);
            com.github.catvod.spider.merge.i0.m.y("\u8acb\u4f7f\u7528\u963f\u91cc\u96f2\u76e4 App \u6383\u63cf\u4e8c\u7dad\u78bc");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void c(u u2) {
        u2.d0();
    }

    private String c0(String string, String string2, boolean bl) {
        if (this.n.d().isEmpty()) {
            this.W();
        }
        if (this.n.g().isEmpty()) {
            this.Y();
        }
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://api.aliyundrive.com/", string);
        }
        CharSequence charSequence = com.github.catvod.spider.merge.C.a.c("getHeaderSign():");
        charSequence.append(this.x());
        charSequence.append(",");
        charSequence.append(string2);
        SpiderDebug.log((String)charSequence.toString());
        charSequence = com.github.catvod.spider.merge.f0.d.i(string, string2.toString(), this.x()).a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append((String)charSequence);
        SpiderDebug.log((String)stringBuilder.toString());
        if (bl && this.k((String)charSequence)) {
            return this.c0(string, string2, false);
        }
        return charSequence;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(u object, String string, com.github.catvod.spider.merge.L.c c2) {
        Throwable throwable2222222;
        block4: {
            Objects.requireNonNull(object);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
            intent.setData(Uri.parse((String)string));
            Init.getActivity().startActivity(intent);
            object = new h(object, c2, 0);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (Exception exception) {}
                {
                    ((u)object).b0(c2);
                    object = new g(object, c2, 0);
                }
            }
            Init.execute((Runnable)object);
            return;
        }
        Init.execute(new f(object, c2, 0));
        throw throwable2222222;
    }

    private void d0() {
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new b(this, 1));
    }

    public static /* synthetic */ void e(u u2) {
        u2.n();
    }

    public static void f(u u2) {
        u2.d0();
    }

    public static void g(u u2, EditText object) {
        Objects.requireNonNull(u2);
        object = object.getText().toString();
        u2.n();
        Init.execute(new l(u2, (String)object, 0));
    }

    public static void h(u u2) {
        u2.n();
        Init.execute(new b(u2, 2));
    }

    public static void i(u u2, EditText object) {
        Objects.requireNonNull(u2);
        object = object.getText().toString();
        u2.n();
        Init.execute(new e(u2, object, 1));
    }

    private String j(String string, String string2, boolean bl) {
        if (!string.startsWith("https")) {
            string = com.github.catvod.spider.merge.B.e.c("https://api.aliyundrive.com/", string);
        }
        com.github.catvod.spider.merge.f0.i i2 = com.github.catvod.spider.merge.f0.d.i(string, string2, this.w());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i2.b());
        stringBuilder.append(",");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(i2.a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (bl && i2.b() == 401 && this.W()) {
            return this.j(string, string2, false);
        }
        if (bl && i2.b() == 429) {
            return this.j(string, string2, false);
        }
        return i2.a();
    }

    private boolean k(String string) {
        if (string.contains("AccessTokenInvalid")) {
            return this.W();
        }
        if (!(string.contains("UserDeviceOffline") || string.contains("UserDeviceIllegality") || string.contains("DeviceSessionSignatureInvalid"))) {
            return false;
        }
        return this.Y();
    }

    private String l(String string, String string2) {
        if (this.m.b().isEmpty()) {
            this.t();
        }
        com.github.catvod.spider.merge.B.e.d("Copy...", string2);
        return ((com.github.catvod.spider.merge.L.i)com.github.catvod.spider.merge.G1.d.a(this.j("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", string2, string, this.m.b()), true), com.github.catvod.spider.merge.L.i.class)).b().a().a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog == null) return;
            alertDialog.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private String o(String charSequence, List<com.github.catvod.spider.merge.L.f> object) {
        Object object2 = new ArrayList<com.github.catvod.spider.merge.L.f>();
        charSequence = com.github.catvod.spider.merge.i0.m.z((String)charSequence).toLowerCase();
        Iterator<com.github.catvod.spider.merge.L.f> iterator = object.iterator();
        while (iterator.hasNext()) {
            com.github.catvod.spider.merge.L.f f2 = iterator.next();
            String string = com.github.catvod.spider.merge.i0.m.z(f2.f()).toLowerCase();
            if (!((String)charSequence).contains(string) && !string.contains(charSequence)) continue;
            ((ArrayList)object2).add(f2);
        }
        if (((ArrayList)object2).isEmpty()) {
            ((ArrayList)object2).addAll(object);
        }
        charSequence = new StringBuilder();
        object = ((ArrayList)object2).iterator();
        while (object.hasNext()) {
            object2 = (com.github.catvod.spider.merge.L.f)object.next();
            ((StringBuilder)charSequence).append("+");
            ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.i0.m.z(((com.github.catvod.spider.merge.L.f)object2).f()));
            ((StringBuilder)charSequence).append("@@@");
            ((StringBuilder)charSequence).append(((com.github.catvod.spider.merge.L.f)object2).c());
            ((StringBuilder)charSequence).append("@@@");
            ((StringBuilder)charSequence).append(((com.github.catvod.spider.merge.L.f)object2).d());
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static u p() {
        return t.a;
    }

    private void t() {
        SpiderDebug.log((String)"Get Drive Id...");
        com.github.catvod.spider.merge.L.e e2 = com.github.catvod.spider.merge.L.e.c(this.j("https://user.aliyundrive.com/v2/user/get", "{}", true));
        Init.execute(new H(e2, 1));
        this.m = e2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void u(String string) {
        try {
            Object object = new JsonObject();
            object.addProperty("file_id", (String)((ArrayList)this.h).get(0));
            object.addProperty("drive_id", this.m.b());
            String string2 = this.Q("openFile/get", object.toString(), true);
            object = new JSONObject(string2);
            object = object.getString("size");
            Object object2 = new JSONObject(string2);
            object2 = object2.getString("content_hash");
            Object object3 = new JSONObject(string2);
            string2 = object3.getString("name");
            Map<String, String> map = this.e;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(string);
            ((StringBuilder)object3).append("contentHash");
            ((HashMap)map).put(((StringBuilder)object3).toString(), (String)((JSONObject)object2));
            object3 = this.e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("size");
            ((HashMap)object3).put(((StringBuilder)object2).toString(), object);
            object = this.e;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("name");
            ((HashMap)object).put(((StringBuilder)object2).toString(), string2);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    private HashMap<String, String> w() {
        HashMap<String, String> hashMap = this.v();
        k k2 = this.k;
        boolean bl = k2 == null;
        if (!bl) {
            hashMap.put("x-share-token", k2.k());
        }
        hashMap.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.n.i()) {
            hashMap.put("authorization", this.n.c());
        }
        return hashMap;
    }

    private HashMap<String, String> x() {
        HashMap<String, String> hashMap = this.v();
        hashMap.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.n.i()) {
            hashMap.put("authorization", this.n.c());
        }
        hashMap.put("x-device-id", this.n.d());
        hashMap.put("x-signature", this.n.g());
        return hashMap;
    }

    private String y(String string, String string2) {
        Object object;
        Object object2 = this.J(string, string2);
        try {
            object2 = this.B((JSONObject)object2, string, string2, false);
            object = new HashMap<String, List<String>>();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        Object object3 = com.github.catvod.spider.merge.f0.d.l((String)object2, this.v(), object);
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("getM3u8  m3u8Url:");
        ((StringBuilder)serializable).append((String)object2);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("getM3u8  respHeader:");
        ((StringBuilder)serializable).append(object);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        String[] stringArray = ((String)object3).split("\n");
        object3 = new ArrayList();
        serializable = new HashMap();
        object = new StringBuilder();
        ((StringBuilder)object).append(((String)object2).substring(0, ((String)object2).lastIndexOf("/")));
        ((StringBuilder)object).append("/");
        String string3 = ((StringBuilder)object).toString();
        int n2 = stringArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = stringArray[i2];
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("mediaId:");
            ((StringBuilder)object2).append(n3);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            int n4 = n3;
            object2 = object;
            if (((String)object).contains("x-oss-expires")) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append((String)object);
                ((HashMap)serializable).put(String.valueOf(n3), ((StringBuilder)object2).toString());
                object2 = Server.E(string, string2, String.valueOf(n3));
                n4 = n3 + 1;
            }
            ((ArrayList)object3).add(object2);
            n3 = n4;
        }
        ((HashMap)this.d).put(string2, (Map<String, String>)((Object)((StringBuilder)serializable)));
        string = TextUtils.join((CharSequence)"\n", (Iterable)object3);
        com.github.catvod.spider.merge.B.e.d("join:", string);
        return string;
    }

    public final String D(String string, String charSequence) {
        boolean bl = t.a.a;
        String string2 = null;
        String string3 = null;
        if (bl) {
            string2 = string3;
            string2 = string3;
            StringBuilder stringBuilder = new StringBuilder();
            string2 = string3;
            stringBuilder.append("http://127.0.0.1:9975");
            string2 = string3;
            stringBuilder.append("/api/danmu/?do=danmuku&vodName=");
            string2 = string3;
            stringBuilder.append(URLEncoder.encode(string));
            string2 = string3;
            stringBuilder.append("&jishu=");
            string2 = string3;
            stringBuilder.append(URLEncoder.encode((String)charSequence));
            string2 = string3;
            string2 = string = stringBuilder.toString();
            string2 = string;
            charSequence = new StringBuilder();
            string2 = string;
            ((StringBuilder)charSequence).append("danmuUrl:");
            string2 = string;
            ((StringBuilder)charSequence).append(string);
            string2 = string;
            try {
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                string2 = string;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return string2;
    }

    public final String F(String string, String string2) {
        try {
            if (((HashMap)this.p).containsKey(string2) && ((HashMap)this.p).get(string2) != null && !u.M((String)((HashMap)this.p).get(string2))) {
                return (String)((HashMap)this.p).get(string2);
            }
            this.X(string, "");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getShareDownloadUrl...");
            stringBuilder.append(string2);
            SpiderDebug.log((String)stringBuilder.toString());
            stringBuilder = new JsonObject();
            stringBuilder.addProperty("file_id", string2);
            stringBuilder.addProperty("share_id", string);
            stringBuilder.addProperty("expire_sec", 600);
            string = JsonParser.parseString((String)this.j("v2/file/get_share_link_download_url", stringBuilder.toString(), false)).getAsJsonObject().get("download_url").getAsString();
            ((HashMap)this.p).put(string2, string);
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public final String G(String charSequence, String string) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", (String)charSequence);
        jsonObject.addProperty("share_pwd", string);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("get_share_token");
        ((StringBuilder)charSequence).append(jsonObject);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        return this.T("v2/share_link/get_share_token", jsonObject);
    }

    public final List<com.github.catvod.spider.merge.K.g> H(String[] stringArray) {
        ArrayList<com.github.catvod.spider.merge.K.g> arrayList = new ArrayList<com.github.catvod.spider.merge.K.g>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = stringArray[i2];
            if (!((String)object).contains("@@@")) continue;
            Object object2 = ((String)object).split("@@@");
            String string = object2[0];
            object = object2[1];
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Proxy.getUrl());
            charSequence.append("?do=ali&type=sub&shareId=");
            charSequence.append(stringArray[0]);
            charSequence.append("&fileId=");
            charSequence.append(object2[2]);
            charSequence = charSequence.toString();
            object2 = new com.github.catvod.spider.merge.K.g();
            ((com.github.catvod.spider.merge.K.g)object2).b(string);
            object = ((com.github.catvod.spider.merge.K.g)object2).a((String)object);
            ((com.github.catvod.spider.merge.K.g)object).c((String)charSequence);
            arrayList.add((com.github.catvod.spider.merge.K.g)object);
        }
        return arrayList;
    }

    public final File I() {
        return com.github.catvod.spider.merge.c.b.e("aliyundrive_threadNum");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject J(String charSequence, String object) {
        Throwable throwable222222;
        block9: {
            block8: {
                if (((HashMap)this.f).containsKey(object) && ((HashMap)this.f).get(object) != null && !u.N((JSONObject)((HashMap)this.f).get(object))) {
                    charSequence = (JSONObject)((HashMap)this.f).get(object);
                    object = new a(this, 1);
                    break block8;
                } else {
                    this.X((String)charSequence, "");
                    CharSequence charSequence2 = new StringBuilder();
                    charSequence2.append("getVideoPreviewPlayInfo1...");
                    charSequence2.append((String)object);
                    SpiderDebug.log((String)charSequence2.toString());
                    ((ArrayList)this.h).add(0, this.l((String)charSequence, (String)object));
                    charSequence2 = new JSONObject();
                    charSequence2.put("file_id", ((ArrayList)this.h).get(0));
                    charSequence2.put("drive_id", this.n.e());
                    charSequence2.put("category", "live_transcoding");
                    charSequence2.put("url_expire_sec", "14400");
                    charSequence = this.Q("openFile/getVideoPreviewPlayInfo", charSequence2.toString(), true);
                    charSequence2 = this.c0("v2/file/get_video_preview_play_info", charSequence2.toString(), true);
                    JSONObject jSONObject = new JSONObject((String)charSequence2);
                    jSONObject = jSONObject.getJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
                    boolean bl = com.github.catvod.spider.merge.R0.e.d(jSONObject.getJSONObject(jSONObject.length() - 1).getString("url"));
                    if (bl) {
                        charSequence = charSequence2;
                    }
                    jSONObject = new JSONObject(charSequence);
                    charSequence = jSONObject.getJSONObject("video_preview_play_info");
                    ((HashMap)this.f).put((String)object, (JSONObject)charSequence);
                    object = new a(this, 1);
                }
                {
                    catch (Throwable throwable222222) {
                        break block9;
                    }
                    catch (Exception exception) {}
                    {
                        exception.printStackTrace();
                        charSequence = new JSONObject();
                        object = new a(this, 1);
                    }
                }
            }
            Init.execute((Runnable)object);
            return charSequence;
        }
        Init.execute(new c(this, 0));
        throw throwable222222;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final com.github.catvod.spider.merge.K.h K(String object, String arrayList, String string, String string2, String arrayList2) {
        int n2;
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("\u4ee3\u7406\u539f\u756b");
        arrayList3.add("\u539f\u756b");
        if (NetPan.containPuHua()) {
            arrayList3.add("\u666e\u756b");
        }
        this.X(string2, (String)object);
        object = new JsonObject();
        object.addProperty("share_id", string2);
        k k2 = com.github.catvod.spider.merge.L.k.n(this.T("adrive/v3/share_link/get_share_by_anonymous", (JsonObject)object));
        object = com.github.catvod.spider.merge.R0.e.b(arrayList) ? com.github.catvod.spider.merge.i0.m.A(k2.i()) : arrayList;
        if (com.github.catvod.spider.merge.R0.e.b(k2.d())) {
            return BaseApi.fakeVod(arrayList3, "ali\u96f2\u76e4");
        }
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList = new ArrayList<com.github.catvod.spider.merge.L.f>();
        ArrayList<String> arrayList5 = new ArrayList<String>();
        Object object2 = new com.github.catvod.spider.merge.L.f(this.A((String)((Object)arrayList2), k2));
        arrayList2 = arrayList4;
        this.P(null, string2, (com.github.catvod.spider.merge.L.f)object2, arrayList5, arrayList4, arrayList, true);
        arrayList5 = new ArrayList<String>();
        arrayList4 = new ArrayList<String>();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            n2 = n3;
            if (n4 >= arrayList2.size()) break;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getVod");
            ((StringBuilder)object2).append((String)object);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            com.github.catvod.spider.merge.L.f f2 = (com.github.catvod.spider.merge.L.f)((Object)arrayList2.get(n4));
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(f2.b());
            ((StringBuilder)object2).append("$");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("+");
            ((StringBuilder)object2).append(f2.d());
            ((StringBuilder)object2).append("+");
            ((StringBuilder)object2).append(com.github.catvod.spider.merge.i0.m.A((String)object));
            ((StringBuilder)object2).append("+");
            ((StringBuilder)object2).append(f2.f());
            ((StringBuilder)object2).append(this.o(f2.f(), arrayList));
            arrayList5.add(((StringBuilder)object2).toString());
            ++n4;
            continue;
            break;
        }
        while (true) {
            if (n2 >= arrayList3.size()) break;
            arrayList4.add(TextUtils.join((CharSequence)"#", arrayList5));
            ++n2;
            continue;
            break;
        }
        try {
            object = new com.github.catvod.spider.merge.K.h();
            ((com.github.catvod.spider.merge.K.h)object).l(string);
            ((com.github.catvod.spider.merge.K.h)object).j(string);
            ((com.github.catvod.spider.merge.K.h)object).n(k2.c());
            ((com.github.catvod.spider.merge.K.h)object).m(k2.i());
            ((com.github.catvod.spider.merge.K.h)object).p(TextUtils.join((CharSequence)"$$$", arrayList4));
            ((com.github.catvod.spider.merge.K.h)object).o(TextUtils.join((CharSequence)"$$$", arrayList3));
            ((com.github.catvod.spider.merge.K.h)object).g("\u963f\u91cc\u96f2\u76e4");
            return object;
        }
        catch (Exception exception) {
            return BaseApi.fakeVod(arrayList3, "ali\u96f2\u76e4");
        }
        catch (Exception exception) {
            return BaseApi.fakeVod(arrayList3, "ali\u96f2\u76e4");
        }
    }

    public final List<com.github.catvod.spider.merge.K.h> L(com.github.catvod.spider.merge.K.i object) {
        Object object2 = ((com.github.catvod.spider.merge.K.i)object).d();
        String string = ((com.github.catvod.spider.merge.K.i)object).c();
        Object object3 = ((com.github.catvod.spider.merge.K.i)object).f();
        String string2 = ((com.github.catvod.spider.merge.K.i)object).e();
        Object object4 = ((com.github.catvod.spider.merge.K.i)object).b();
        Object object5 = ((com.github.catvod.spider.merge.K.i)object).a();
        this.X(string, (String)object2);
        object = new JsonObject();
        object.addProperty("share_id", string);
        object2 = com.github.catvod.spider.merge.L.k.n(this.T("adrive/v3/share_link/get_share_by_anonymous", (JsonObject)object));
        if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object3)) {
            ((k)object2).i();
        }
        object = new ArrayList();
        Object object6 = new ArrayList<com.github.catvod.spider.merge.L.f>();
        object3 = new ArrayList();
        this.P((HashMap<String, String>)object5, string, new com.github.catvod.spider.merge.L.f(this.A((String)object4, (k)object2)), (List<com.github.catvod.spider.merge.L.f>)object3, (List<com.github.catvod.spider.merge.L.f>)object, (List<com.github.catvod.spider.merge.L.f>)object6, false);
        object4 = new ArrayList();
        object2 = ((ArrayList)object3).iterator();
        while (object2.hasNext()) {
            object5 = (com.github.catvod.spider.merge.L.f)object2.next();
            object6 = new com.github.catvod.spider.merge.K.h();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(((com.github.catvod.spider.merge.L.f)object5).j());
            ((StringBuilder)object3).append("*#");
            ((StringBuilder)object3).append(((com.github.catvod.spider.merge.L.f)object5).d());
            ((com.github.catvod.spider.merge.K.h)object6).l(((StringBuilder)object3).toString());
            ((com.github.catvod.spider.merge.K.h)object6).m(((com.github.catvod.spider.merge.L.f)object5).b());
            ((com.github.catvod.spider.merge.K.h)object6).r(((com.github.catvod.spider.merge.L.f)object5).m());
            ((ArrayList)object4).add(object6);
        }
        object6 = ((ArrayList)object).iterator();
        while (object6.hasNext()) {
            object2 = (com.github.catvod.spider.merge.L.f)object6.next();
            object3 = new com.github.catvod.spider.merge.K.h();
            object5 = com.github.catvod.spider.merge.I.r.d(string2, "/folder/");
            ((StringBuilder)object5).append(((com.github.catvod.spider.merge.L.f)object2).i());
            ((StringBuilder)object5).append("*#");
            if (((HashMap)this.q).get(((com.github.catvod.spider.merge.L.f)object2).i()) != null) {
                object = (String)((HashMap)this.q).get(((com.github.catvod.spider.merge.L.f)object2).i());
            } else {
                object = new JsonObject();
                object.addProperty("file_id", ((com.github.catvod.spider.merge.L.f)object2).i());
                object.addProperty("fields", "");
                object.addProperty("drive_id", "");
                object.addProperty("share_id", string);
                object = (com.github.catvod.spider.merge.L.f)com.github.catvod.spider.merge.G1.d.a(this.j("adrive/v2/file/get_by_share", object.toString(), true), com.github.catvod.spider.merge.L.f.class);
                ((HashMap)this.q).put(((com.github.catvod.spider.merge.L.f)object2).i(), ((com.github.catvod.spider.merge.L.f)object).f());
                object = ((com.github.catvod.spider.merge.L.f)object).f();
            }
            ((StringBuilder)object5).append((String)object);
            ((com.github.catvod.spider.merge.K.h)object3).l(((StringBuilder)object5).toString());
            ((com.github.catvod.spider.merge.K.h)object3).m(((com.github.catvod.spider.merge.L.f)object2).b());
            ((com.github.catvod.spider.merge.K.h)object3).r(((com.github.catvod.spider.merge.L.f)object2).m());
            ((com.github.catvod.spider.merge.K.h)object3).n(((com.github.catvod.spider.merge.L.f)object2).l());
            ((ArrayList)object4).add(object3);
        }
        return object4;
    }

    public final String R(String[] object) {
        try {
            String string = this.B(this.J(object[0], object[1]), object[0], object[1], true);
            List<com.github.catvod.spider.merge.K.g> list = this.H((String[])object);
            Object object2 = (ArrayList)list;
            ((ArrayList)object2).addAll(object2);
            object2 = new com.github.catvod.spider.merge.K.f();
            ((com.github.catvod.spider.merge.K.f)object2).w(string);
            ((com.github.catvod.spider.merge.K.f)object2).b(this.r((String[])object));
            ((com.github.catvod.spider.merge.K.f)object2).v(list);
            ((com.github.catvod.spider.merge.K.f)object2).g(this.v());
            object = ((com.github.catvod.spider.merge.K.f)object2).toString();
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.K.f f2 = new com.github.catvod.spider.merge.K.f();
            f2.w("");
            return f2.toString();
        }
    }

    public final String S(String[] object, String object2) {
        try {
            if (((String)object2).split("#")[0].equals("\u539f\u756b")) {
                this.s(object[0], object[1]);
                this.q(object[1]);
                object2 = new com.github.catvod.spider.merge.K.f();
                ((com.github.catvod.spider.merge.K.f)object2).w(Server.w(object[0], object[1]));
                ((com.github.catvod.spider.merge.K.f)object2).j();
                ((com.github.catvod.spider.merge.K.f)object2).b(this.r((String[])object));
                ((com.github.catvod.spider.merge.K.f)object2).v(this.H((String[])object));
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
                ((HashMap)object).put("Referer", "https://cdnfhnfile.115.com/");
                ((com.github.catvod.spider.merge.K.f)object2).g((Map<String, String>)object);
                return ((com.github.catvod.spider.merge.K.f)object2).toString();
            }
            if (((String)object2).split("#")[0].equals("\u666e\u756b")) {
                return this.R((String[])object);
            }
            if (((String)object2).split("#")[0].equals("\u5206\u4eab\u539f\u756b")) {
                object2 = new com.github.catvod.spider.merge.K.f();
                ((com.github.catvod.spider.merge.K.f)object2).w(Server.y(this.F(object[0], object[1]), 10, 480));
                ((com.github.catvod.spider.merge.K.f)object2).j();
                ((com.github.catvod.spider.merge.K.f)object2).b(this.r((String[])object));
                ((com.github.catvod.spider.merge.K.f)object2).v(this.H((String[])object));
                ((com.github.catvod.spider.merge.K.f)object2).g(this.v());
                return ((com.github.catvod.spider.merge.K.f)object2).toString();
            }
            if (((String)object2).split("#")[0].equals("\u4ee3\u7406\u539f\u756b")) {
                object2 = this.C((String[])object);
                com.github.catvod.spider.merge.K.f f2 = new com.github.catvod.spider.merge.K.f();
                f2.w((String)object2);
                f2.j();
                f2.b(this.r((String[])object));
                f2.v(this.H((String[])object));
                f2.g(this.v());
                return f2.toString();
            }
            object = new com.github.catvod.spider.merge.K.f();
            ((com.github.catvod.spider.merge.K.f)object).w("");
            object = ((com.github.catvod.spider.merge.K.f)object).toString();
            return object;
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.K.f f4 = new com.github.catvod.spider.merge.K.f();
            f4.w("");
            return f4.toString();
        }
    }

    public final Object[] U(String string, String string2, String string3) {
        string = this.y(string, string2);
        return new Object[]{200, "audio/x-mpegurl", string, string.getBytes().length};
    }

    public final Object[] V(Map<String, String> object) {
        Object object2 = object.get("fileId");
        object2 = com.github.catvod.spider.merge.f0.d.e(this.s(object.get("shareId"), (String)object2), this.w()).body().bytes();
        object = com.github.catvod.spider.merge.i0.m.a;
        Charset charset = Charset.forName("GBK");
        object = object2;
        if (Arrays.equals((byte[])object2, new String((byte[])object2, charset).getBytes(charset))) {
            object = new String((byte[])object2, Charset.forName("GBK")).getBytes("UTF-8");
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream((byte[])object)};
    }

    public final void X(String string, String object) {
        Object object2 = this.k;
        if (object2 != null && ((k)object2).a(string)) {
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("refreshShareToken...");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("sharePwd:");
        ((StringBuilder)object2).append((String)object);
        SpiderDebug.log((String)((StringBuilder)object2).toString());
        object = com.github.catvod.spider.merge.L.k.n(this.G(string, (String)object));
        ((k)object).o(string);
        ((k)object).q();
        this.k = object;
        if (((k)object).k().isEmpty()) {
            com.github.catvod.spider.merge.i0.m.y("\u4f86\u665a\u5566\uff0c\u8a72\u5206\u4eab\u5df2\u5931\u6548\u3002");
        }
    }

    public final void Z(String string) {
        this.j = string;
    }

    public final void a0(String string) {
        Object object = this.n;
        ((com.github.catvod.spider.merge.L.m)object).a();
        ((com.github.catvod.spider.merge.L.m)object).k();
        object = this.l;
        ((com.github.catvod.spider.merge.L.g)object).a();
        ((com.github.catvod.spider.merge.L.g)object).e();
        object = this.m;
        ((com.github.catvod.spider.merge.L.e)object).a();
        Init.execute(new H(object, 1));
        object = new StringBuilder();
        ((StringBuilder)object).append("Token:");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = new StringBuilder();
        ((StringBuilder)object).append("Token:");
        ((StringBuilder)object).append(string);
        com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object).toString());
        this.p = new HashMap<String, String>();
        this.e = new HashMap<String, String>();
        this.n.l(string);
        this.W();
        this.d0();
    }

    public final String m(String charSequence, String charSequence2, Long object, String charSequence3) {
        try {
            if (this.m.b().isEmpty()) {
                this.t();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createFile...");
            stringBuilder.append((String)charSequence);
            SpiderDebug.log((String)stringBuilder.toString());
            stringBuilder = new JsonObject();
            stringBuilder.addProperty("drive_id", this.m.b());
            stringBuilder.addProperty("parent_file_id", "root");
            stringBuilder.addProperty("type", "file");
            stringBuilder.addProperty("name", (String)charSequence);
            stringBuilder.addProperty("size", (Number)object);
            stringBuilder.addProperty("content_hash", (String)charSequence3);
            stringBuilder.addProperty("content_hash_name", "sha1");
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append(t.a.c);
            ((StringBuilder)charSequence3).append("/api/getAliCalProofCode/?size=");
            ((StringBuilder)charSequence3).append(URLEncoder.encode(String.valueOf(object)));
            ((StringBuilder)charSequence3).append("&accessToken=");
            ((StringBuilder)charSequence3).append(URLEncoder.encode(this.l.b()));
            ((StringBuilder)charSequence3).append("&url=");
            ((StringBuilder)charSequence3).append(URLEncoder.encode((String)charSequence2));
            charSequence2 = ((StringBuilder)charSequence3).toString();
            object = new StringBuilder();
            ((StringBuilder)object).append("createFile param\uff1a");
            ((StringBuilder)object).append((Object)stringBuilder);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("createFile proofCodeUrl\uff1a");
            ((StringBuilder)object).append((String)charSequence2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            charSequence2 = com.github.catvod.spider.merge.f0.d.k((String)charSequence2);
            object = new StringBuilder();
            ((StringBuilder)object).append("createFile proofCode\uff1a");
            ((StringBuilder)object).append((String)charSequence2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            stringBuilder.addProperty("proof_code", (String)charSequence2);
            stringBuilder.addProperty("check_name_mode", "ignore");
            charSequence2 = this.Q("openFile/create", stringBuilder.toString(), true);
            object = new StringBuilder();
            ((StringBuilder)object).append("createFile res\uff1a");
            ((StringBuilder)object).append((String)charSequence2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new JSONObject((String)charSequence2);
            if (object.getBoolean("rapid_upload")) {
                object = new JSONObject((String)charSequence2);
                object = object.getString("file_id");
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(" \u79d2\u4f20\u963f\u91cc\u6210\u529f:");
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence2).toString());
                return this.C(new String[]{"", object, charSequence, ""});
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(" \u79d2\u4f20\u963f\u91cc\u5931\u8d25:");
            com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence2).toString());
        }
        catch (Exception exception) {
            charSequence = com.github.catvod.spider.merge.I.r.d((String)charSequence, " \u79d2\u4f20\u963f\u91cc\u5931\u8d25:");
            ((StringBuilder)charSequence).append(exception.getMessage());
            com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence).toString());
        }
        return null;
    }

    public final String q(String string) {
        Throwable throwable2;
        Map<String, String> map;
        Object object;
        block6: {
            StringBuilder stringBuilder;
            Map<String, String> map2;
            StringBuilder stringBuilder2;
            f1 f12;
            block5: {
                object = this.e;
                map = new Map<String, String>();
                ((StringBuilder)((Object)map)).append(string);
                ((StringBuilder)((Object)map)).append("115");
                if (((HashMap)object).get(((StringBuilder)((Object)map)).toString()) == null) break block5;
                map = this.e;
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("115");
                map = (String)((HashMap)map).get(((StringBuilder)object).toString());
                f12 = e1.a;
                object = this.e;
                stringBuilder2 = new StringBuilder();
            }
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append(t.a.c);
                ((StringBuilder)object).append("/api/yun115/?totalHash=");
                map2 = this.e;
                map = new Map<String, String>();
                ((StringBuilder)((Object)map)).append(string);
                ((StringBuilder)((Object)map)).append("contentHash");
                ((StringBuilder)object).append(URLEncoder.encode((String)((HashMap)map2).get(((StringBuilder)((Object)map)).toString())));
                ((StringBuilder)object).append("&size=");
                map2 = this.e;
                map = new Map<String, String>();
                ((StringBuilder)((Object)map)).append(string);
                ((StringBuilder)((Object)map)).append("size");
                ((StringBuilder)object).append(URLEncoder.encode((String)((HashMap)map2).get(((StringBuilder)((Object)map)).toString())));
                ((StringBuilder)object).append("&path=");
                ((StringBuilder)object).append(URLEncoder.encode((String)((HashMap)this.e).get(string)));
                ((StringBuilder)object).append("&name=");
                map = this.e;
                map2 = new Map<String, String>();
                ((StringBuilder)((Object)map2)).append(string);
                ((StringBuilder)((Object)map2)).append("name");
                ((StringBuilder)object).append(URLEncoder.encode((String)((HashMap)map).get(((StringBuilder)((Object)map2)).toString())));
                ((StringBuilder)object).append("&cookie=");
                ((StringBuilder)object).append(URLEncoder.encode(e1.a.c.b()));
                object = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object).toString());
                if (NetPan.isYun115((String)object)) {
                    map2 = this.e;
                    map = new Map<String, String>();
                    ((StringBuilder)((Object)map)).append(string);
                    ((StringBuilder)((Object)map)).append("115");
                    ((HashMap)map2).put(((StringBuilder)((Object)map)).toString(), (String)object);
                }
                map2 = e1.a;
                map = this.e;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (Exception exception) {
                map = "";
                f12 = e1.a;
                object = this.e;
                stringBuilder2 = new StringBuilder();
            }
            stringBuilder.append("name");
            ((f1)((Object)map2)).a((String)((HashMap)map).get(stringBuilder.toString()));
            return object;
            stringBuilder2.append(string);
            stringBuilder2.append("name");
            f12.a((String)object.get(stringBuilder2.toString()));
            return map;
        }
        object = e1.a;
        map = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("name");
        ((f1)object).a((String)((HashMap)map).get(stringBuilder.toString()));
        throw throwable2;
    }

    public final String r(String[] object) {
        block3: {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("danmumPushUrl");
                stringBuilder.append(this.r);
                SpiderDebug.log((String)stringBuilder.toString());
                if (!com.github.catvod.spider.merge.R0.e.d(this.r)) break block3;
                object = this.r;
                this.r = "";
                return object;
            }
            catch (Exception exception) {
                s.b("getDanmuUrl ", exception);
                return "";
            }
        }
        object = this.D(object[2], object[3]);
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String s(String string, String object) {
        Throwable throwable222222;
        block8: {
            if (((HashMap)this.e).containsKey(object) && ((HashMap)this.e).get(object) != null && !u.M((String)((HashMap)this.e).get(object))) {
                string = (String)((HashMap)this.e).get(object);
                object = new b(this, 0);
                break block8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getDownloadUrl...");
            stringBuilder.append((String)object);
            SpiderDebug.log((String)stringBuilder.toString());
            if (com.github.catvod.spider.merge.R0.e.d(string)) {
                this.X(string, "");
                ((ArrayList)this.h).add(0, this.l(string, (String)object));
            } else {
                ((ArrayList)this.h).add(0, (String)object);
            }
            string = new JsonObject();
            string.addProperty("file_id", (String)((ArrayList)this.h).get(0));
            string.addProperty("drive_id", this.m.b());
            string.addProperty("expire_sec", (Number)14400);
            string = this.c0("https://bj29.api.aliyunpds.com/v2/file/get_download_url", string.toString(), true);
            string = com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.L.d.c(string).a()) ? com.github.catvod.spider.merge.L.d.c(string).a() : com.github.catvod.spider.merge.L.d.c(string).b();
            ((HashMap)this.e).put((String)object, string);
            this.u((String)object);
            object = new a(this, 0);
        }
        Init.execute((Runnable)object);
        return string;
        {
            catch (Throwable throwable222222) {
            }
            catch (Exception exception) {}
            {
                object = new StringBuilder();
                ((StringBuilder)object).append("ali getDownloadUrl error");
                ((StringBuilder)object).append(exception.getMessage());
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object).toString());
            }
            Init.execute(new a(this, 0));
            return "";
        }
        Init.execute(new a(this, 0));
        throw throwable222222;
    }

    public final HashMap<String, String> v() {
        return com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }

    public final String z(String charSequence, String charSequence2, String string, String string2) {
        this.o.lock();
        String string3 = (String)((Map)((HashMap)this.d).get(string2)).get(string);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("fileId:");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(" ");
        ((StringBuilder)charSequence).append(string);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = string3;
        if (u.M(string3)) {
            this.y((String)charSequence2, string2);
            charSequence = (String)((Map)((HashMap)this.d).get(string2)).get(string);
        }
        this.o.unlock();
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("getM3u8Proxy:");
        ((StringBuilder)charSequence2).append((String)charSequence);
        SpiderDebug.log((String)((StringBuilder)charSequence2).toString());
        return charSequence;
    }
}

