package com.github.catvod.spider.merge.k;

import com.github.catvod.spider.merge.cYh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.OkHttpClient;

/* renamed from: com.github.catvod.spider.merge.k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164g {
    private static OkHttpClient b;
    private static OkHttpClient c;
    private static final Object a = new Object();
    public static HashMap<String, List<Cookie>> d = new HashMap<>();

    public static void a() {
        String d2;
        OkHttpClient b2 = b();
        if (b2 != null) {
            Iterator it = b2.dispatcher().queuedCalls().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                d2 = cYh.d("170F2B22383438202023243F");
                if (!hasNext) {
                    break;
                }
                Call call = (Call) it.next();
                if (d2.equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : b2.dispatcher().runningCalls()) {
                if (d2.equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient;
        synchronized (a) {
            if (b == null) {
                OkHttpClient.Builder cookieJar = new OkHttpClient.Builder().cookieJar(new C0162e());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder retryOnConnectionFailure = cookieJar.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0166i.d;
                b = retryOnConnectionFailure.sslSocketFactory(new C0166i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = b;
        }
        return okHttpClient;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, AbstractC0160c abstractC0160c) {
        new C0161d(cYh.d("201515"), str, null, map, abstractC0160c).a(okHttpClient);
    }

    public static String d(Map<String, List<String>> map) {
        String d2 = cYh.d("0B3F22302333083E");
        if (!map.containsKey(d2)) {
            d2 = cYh.d("2B3F22302333083E");
            if (!map.containsKey(d2)) {
                return null;
            }
        }
        return map.get(d2).get(0);
    }

    public static void e(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0160c abstractC0160c) {
        new C0161d(cYh.d("371F1205"), str, map, map2, abstractC0160c).a(okHttpClient);
    }

    public static void f(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC0160c abstractC0160c) {
        new C0161d(str, str2, map, abstractC0160c).a(okHttpClient);
    }

    public static String g(String str, Map<String, String> map) {
        return i(b(), str, null, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return i(b(), str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        C0163f c0163f = new C0163f(map2);
        C0161d c0161d = new C0161d(cYh.d("201515"), str, null, map, c0163f);
        c0161d.b(str2);
        c0161d.a(okHttpClient);
        return c0163f.getResult();
    }

    public static String j(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClient;
        synchronized (a) {
            if (c == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder retryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C0166i.d;
                c = retryOnConnectionFailure.sslSocketFactory(new C0166i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = c;
        }
        return i(okHttpClient, str, null, map, map2);
    }
}
