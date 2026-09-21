/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.k0.b;
import com.github.catvod.spider.merge.k0.c;
import com.github.catvod.spider.merge.k0.d;
import com.github.catvod.spider.merge.k0.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

public final class e {
    private static final Object a = new Object();
    private static OkHttpClient b;
    private static OkHttpClient c;

    public static void a() {
        OkHttpClient okHttpClient2 = e.b();
        if (okHttpClient2 != null) {
            for (Object object : okHttpClient2.dispatcher().queuedCalls()) {
                if (!"p_json_parse".equals(object.request().tag())) continue;
                object.cancel();
            }
            for (OkHttpClient okHttpClient2 : okHttpClient2.dispatcher().runningCalls()) {
                if (!"p_json_parse".equals(okHttpClient2.request().tag())) continue;
                okHttpClient2.cancel();
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
            Object object3 = TimeUnit.SECONDS;
            OkHttpClient.Builder builder = object2.readTimeout(15L, object3).writeTimeout(15L, object3).connectTimeout(15L, object3).retryOnConnectionFailure(true);
            object3 = g.c;
            object2 = new g((X509TrustManager)object3);
            b = builder.sslSocketFactory((SSLSocketFactory)object2, (X509TrustManager)object3).build();
            return b;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static void c(OkHttpClient okHttpClient, String string, Map map, b b2) {
        new c(string, map, b2).a(okHttpClient);
    }

    public static String d(String string, Map<String, String> map) {
        return e.e(e.b(), string, null, map, null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String e(OkHttpClient okHttpClient, String object, String string, Map map, Map object2) {
        object2 = new d((Map)object2);
        object = new c((String)object, map, (b)object2);
        ((c)object).b(string);
        ((c)object).a(okHttpClient);
        return (String)((b)object2).getResult();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String f(String string, Map<String, String> map, Map<String, List<String>> map2) {
        Object object = a;
        synchronized (object) {
            Object object2;
            if (c == null) {
                object2 = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit = object2.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                object2 = g.c;
                g g2 = new g((X509TrustManager)object2);
                c = timeUnit.sslSocketFactory(g2, (X509TrustManager)object2).build();
            }
            object2 = c;
            return e.e((OkHttpClient)object2, string, null, map, map2);
        }
    }
}

