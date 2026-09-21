/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Authenticator
 *  okhttp3.Dns
 *  okhttp3.Headers
 *  okhttp3.Interceptor
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.f0;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.d0.f;
import com.github.catvod.spider.merge.f0.a;
import com.github.catvod.spider.merge.f0.b;
import com.github.catvod.spider.merge.f0.c;
import com.github.catvod.spider.merge.f0.h;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.f0.j;
import com.github.catvod.spider.merge.f0.l;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Authenticator;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class d {
    private final OkHttpClient a;
    private final OkHttpClient b;

    public d() {
        Dns dns;
        Uri uri;
        try {
            uri = (Uri)Spider.class.getMethod("proxy", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            uri = null;
        }
        Object object = new OkHttpClient.Builder();
        try {
            dns = (Dns)Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            dns = Dns.SYSTEM;
        }
        dns = object.dns(dns);
        object = TimeUnit.SECONDS;
        dns = dns.readTimeout(5L, (TimeUnit)((Object)object)).writeTimeout(5L, (TimeUnit)((Object)object)).connectTimeout(5L, (TimeUnit)((Object)object));
        object = l.d;
        dns = dns.hostnameVerifier((HostnameVerifier)j.a).sslSocketFactory((SSLSocketFactory)new l(), l.d);
        if (uri != null && uri.getScheme() != null && uri.getHost() != null && uri.getPort() > 0) {
            object = uri.getUserInfo();
            if (uri.getScheme() != null && !uri.getScheme().startsWith("socks")) {
                if (uri.getScheme().startsWith("http")) {
                    dns.proxy(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
                    if (object != null && ((String)object).contains(":")) {
                        dns.proxyAuthenticator((Authenticator)new f(object));
                    }
                }
            } else {
                dns.proxy(new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
            }
        }
        uri = dns.addInterceptor((Interceptor)new c()).addInterceptor((Interceptor)new b()).build();
        this.b = uri;
        this.a = uri.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static OkHttpClient a() {
        return com.github.catvod.spider.merge.f0.a.a.b;
    }

    public static HashMap<String, String> b() {
        return r.e("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String c(String string, Map<String, String> map) {
        map = com.github.catvod.spider.merge.f0.a.a.a.newCall(new Request.Builder().url(string).headers(Headers.of((Map)map)).build()).execute().headers().toMultimap();
        if (map == null) return null;
        string = "location";
        if (map.containsKey("location")) return (String)((List)map.get(string)).get(0);
        string = "Location";
        if (!map.containsKey("Location")) return null;
        return (String)((List)map.get(string)).get(0);
    }

    public static Response d(String string) {
        return com.github.catvod.spider.merge.f0.a.a.b.newCall(new Request.Builder().url(string).build()).execute();
    }

    public static Response e(String string, Map<String, String> map) {
        return com.github.catvod.spider.merge.f0.a.a.b.newCall(new Request.Builder().url(string).headers(Headers.of(map)).build()).execute();
    }

    public static i f(String string, String string2, Map<String, String> map) {
        return new h(string, string2, map).a(com.github.catvod.spider.merge.f0.a.a.b);
    }

    public static String g(String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return d.m(com.github.catvod.spider.merge.f0.a.a.b, "POST", string, map, map2, map3);
    }

    public static String h(String charSequence, String charSequence2, Map<String, String> map) {
        block3: {
            OkHttpClient okHttpClient = com.github.catvod.spider.merge.f0.a.a.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("get\u7535\u5f71\u5929\u5802: postForm");
            stringBuilder.append((String)charSequence2);
            stringBuilder.append("content:");
            stringBuilder.append((String)charSequence);
            SpiderDebug.log((String)stringBuilder.toString());
            charSequence = RequestBody.create((MediaType)MediaType.parse((String)"application/x-www-form-urlencoded"), (String)charSequence);
            charSequence = new Request.Builder().url((String)charSequence2).headers(Headers.of(map)).post((RequestBody)charSequence).build();
            charSequence2 = okHttpClient.newCall((Request)charSequence).execute();
            if (!charSequence2.isSuccessful()) break block3;
            charSequence = charSequence2.body().string();
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("Response data: ");
            ((StringBuilder)charSequence2).append((String)charSequence);
            SpiderDebug.log((String)((StringBuilder)charSequence2).toString());
            return charSequence;
        }
        try {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Request failed with status code: ");
            ((StringBuilder)charSequence).append(charSequence2.code());
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return null;
    }

    public static i i(String string, String string2, Map<String, String> map) {
        return new h(string, string2, map).a(com.github.catvod.spider.merge.f0.a.a.b);
    }

    public static i j(String string, String string2, Map<String, String> map, Map<String, List<String>> map2) {
        return new h(string, string2, map, map2).a(com.github.catvod.spider.merge.f0.a.a.b);
    }

    public static String k(String string) {
        return d.l(string, d.b(), null);
    }

    public static String l(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return d.m(com.github.catvod.spider.merge.f0.a.a.b, "GET", string, null, map, map2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String m(OkHttpClient okHttpClient, String object, String string, Map map, Map map2, Map map3) {
        object = new h((String)object, string, map, map2, map3);
        ((h)object).b();
        return ((h)object).a(okHttpClient).a();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String n(String string, Map map, Map map2) {
        return d.m(com.github.catvod.spider.merge.f0.a.a.b, "GET", string, null, map, map2);
    }

    public static void o(String string, Map<String, String> map, Map<String, List<String>> map2) {
        d.m(com.github.catvod.spider.merge.f0.a.a.a, "GET", string, null, map, map2);
    }

    public static String p(String string, long l2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit = builder.connectTimeout(l2, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).build();
        string = new Request.Builder().url(string).get().build();
        try {
            string = timeUnit.newCall((Request)string).execute();
            if (string.isSuccessful()) {
                return string.body().string();
            }
            string = string.body().string();
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}

