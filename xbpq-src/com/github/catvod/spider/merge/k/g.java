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
package com.github.catvod.spider.merge.k;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.k.c;
import com.github.catvod.spider.merge.k.d;
import com.github.catvod.spider.merge.k.e;
import com.github.catvod.spider.merge.k.f;
import com.github.catvod.spider.merge.k.i;
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
            String string;
            Call call3 = okHttpClient.dispatcher().queuedCalls().iterator();
            while (true) {
                boolean bl = call3.hasNext();
                string = cYh.d("170F2B22383438202023243F");
                if (!bl) break;
                Call call2 = (Call)call3.next();
                if (!string.equals(call2.request().tag())) continue;
                call2.cancel();
            }
            for (Call call3 : okHttpClient.dispatcher().runningCalls()) {
                if (!string.equals(call3.request().tag())) continue;
                call3.cancel();
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
            object2 = object2.cookieJar((CookieJar)object3);
            object3 = TimeUnit.SECONDS;
            object3 = object2.readTimeout(15L, (TimeUnit)((Object)object3)).writeTimeout(15L, (TimeUnit)((Object)object3)).connectTimeout(15L, (TimeUnit)((Object)object3)).retryOnConnectionFailure(true);
            X509TrustManager x509TrustManager = i.d;
            object2 = new i(x509TrustManager);
            b = object3.sslSocketFactory((SSLSocketFactory)object2, x509TrustManager).build();
            return b;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static void c(OkHttpClient okHttpClient, String string, Map map, c c2) {
        new d(cYh.d("201515"), string, null, map, c2).a(okHttpClient);
    }

    public static String d(Map<String, List<String>> map) {
        String string = cYh.d("0B3F22302333083E");
        if (map.containsKey(string) || map.containsKey(string = cYh.d("2B3F22302333083E"))) {
            return map.get(string).get(0);
        }
        return null;
    }

    public static void e(OkHttpClient okHttpClient, String string, Map<String, String> map, Map<String, String> map2, c c2) {
        new d(cYh.d("371F1205"), string, map, map2, c2).a(okHttpClient);
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
        object = new d(cYh.d("201515"), (String)object, null, map, (c)object2);
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
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit = object2.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = i.d;
                object2 = new i(x509TrustManager);
                c = timeUnit.sslSocketFactory((SSLSocketFactory)object2, x509TrustManager).build();
            }
            object2 = c;
            return g.i((OkHttpClient)object2, string, null, map, map2);
        }
    }
}

