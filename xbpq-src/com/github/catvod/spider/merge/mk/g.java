/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Cookie
 *  okhttp3.CookieJar
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package com.github.catvod.spider.merge.mk;

import com.github.catvod.spider.merge.mk.c;
import com.github.catvod.spider.merge.mk.d;
import com.github.catvod.spider.merge.mk.e;
import com.github.catvod.spider.merge.mk.f;
import com.github.catvod.spider.merge.mk.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

public final class g {
    private static final Object a = new Object();
    private static OkHttpClient b;
    private static OkHttpClient c;
    public static HashMap<String, List<Cookie>> d;

    static {
        d = new HashMap();
    }

    public static void a() {
        OkHttpClient okHttpClient = g.b();
        if (okHttpClient != null) {
            for (Call call : okHttpClient.dispatcher().queuedCalls()) {
                if (!"p_json_parse".equals(call.request().tag())) continue;
                call.cancel();
            }
            for (Call call : okHttpClient.dispatcher().runningCalls()) {
                if (!"p_json_parse".equals(call.request().tag())) continue;
                call.cancel();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OkHttpClient b() {
        Object object = a;
        synchronized (object) {
            if (b != null) return b;
            Object object2 = new OkHttpClient.Builder();
            Object object3 = new e();
            object3 = object2.cookieJar((CookieJar)object3);
            object2 = TimeUnit.SECONDS;
            object3 = object3.readTimeout(15L, (TimeUnit)((Object)object2)).writeTimeout(15L, (TimeUnit)((Object)object2)).connectTimeout(15L, (TimeUnit)((Object)object2)).retryOnConnectionFailure(true);
            object2 = i.d;
            i i2 = new i((X509TrustManager)object2);
            b = object3.sslSocketFactory((SSLSocketFactory)i2, (X509TrustManager)object2).build();
            return b;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static void c(OkHttpClient okHttpClient, String string, Map map, c c2) {
        new d("GET", string, null, map, c2).a(okHttpClient);
    }

    public static String d(Map<String, List<String>> map) {
        block3: {
            String string;
            block2: {
                string = "location";
                if (map.containsKey("location")) break block2;
                string = "Location";
                if (!map.containsKey("Location")) break block3;
            }
            return map.get(string).get(0);
        }
        return null;
    }

    public static void e(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, c c2) {
        new d("POST", string, map, map2, c2).a(okHttpClient);
    }

    public static void f(OkHttpClient okHttpClient, String string, String string2, Map<String, String> map, c c2) {
        new d(string, string2, map, c2).a(okHttpClient);
    }

    public static String g(String string, Map<String, String> map) {
        return g.i(g.b(), string, null, map, null);
    }

    public static String h(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return g.i(g.b(), string, null, map, map2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String i(OkHttpClient okHttpClient, String object, String string, Map map, Map object2) {
        object2 = new f((Map)object2);
        object = new d("GET", (String)object, null, map, (c)object2);
        ((d)object).b(string);
        ((d)object).a(okHttpClient);
        return (String)((c)object2).getResult();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String j(String string, Map<String, String> map, Map<String, List<String>> map2) {
        Object object = a;
        synchronized (object) {
            Object object2;
            if (c == null) {
                object2 = new OkHttpClient.Builder();
                Object object3 = TimeUnit.SECONDS;
                OkHttpClient.Builder builder = object2.readTimeout(15L, object3).writeTimeout(15L, object3).connectTimeout(15L, object3).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                object3 = i.d;
                object2 = new i((X509TrustManager)object3);
                c = builder.sslSocketFactory((SSLSocketFactory)object2, (X509TrustManager)object3).build();
            }
            object2 = c;
            return g.i((OkHttpClient)object2, string, null, map, map2);
        }
    }
}

