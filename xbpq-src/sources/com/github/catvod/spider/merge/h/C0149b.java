package com.github.catvod.spider.merge.h;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.cYh;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.github.catvod.spider.merge.h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149b {
    private final OkHttpClient a;

    public C0149b() {
        Dns dns;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod(cYh.d("14312734133414"), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder dns2 = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectTimeout = dns2.readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).connectTimeout(30L, timeUnit);
        X509TrustManager x509TrustManager = g.b;
        OkHttpClient build = connectTimeout.hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.h.e
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                X509TrustManager x509TrustManager2 = g.b;
                return true;
            }
        }).sslSocketFactory(new g(), g.b).build();
        this.a = build;
        build.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static Response a(String str) {
        return C0148a.a.a.newCall(new Request.Builder().url(str).build()).execute();
    }

    public static Response b(String str, Map<String, String> map) {
        return C0148a.a.a.newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    public static String c(String str, Map<String, String> map, Map<String, String> map2) {
        return i(C0148a.a.a, cYh.d("371F1205"), str, map, map2, null);
    }

    public static String d(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return i(C0148a.a.a, cYh.d("371F1205"), str, map, map2, map3);
    }

    public static String e(Map map) {
        return i(C0148a.a.a, cYh.d("371F1205"), cYh.d("0F2435212460487F31302429173F3325793B0B393824393E153937347939083D6E3F322D0B3F263839751622223E333F48213434252349342E6E362A171E203C3267063C2828223438343338213F4136333E3A090E24246C6268410F23297A2C5A626F637969"), map, null, null);
    }

    public static d f(String str, String str2, Map<String, String> map) {
        return new C0150c(str, str2, map).a(C0148a.a.a);
    }

    public static String g(String str, Map<String, String> map) {
        return h(str, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return i(C0148a.a.a, cYh.d("201515"), str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        C0150c c0150c = new C0150c(str, str2, map, map2, map3);
        c0150c.b();
        return c0150c.a(okHttpClient).a();
    }
}
