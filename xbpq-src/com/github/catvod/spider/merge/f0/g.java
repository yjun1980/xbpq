/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.github.catvod.crawler.Spider
 *  okhttp3.Dns
 *  okhttp3.Headers
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.f0;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.f0.b;
import com.github.catvod.spider.merge.f0.c;
import com.github.catvod.spider.merge.f0.e;
import com.github.catvod.spider.merge.f0.f;
import com.github.catvod.spider.merge.f0.h;
import com.github.catvod.spider.merge.f0.j;
import com.github.catvod.spider.merge.f0.l;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class g {
    public OkHttpClient a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g() {
        Uri uri = null;
        try {
            Uri uri2;
            uri = uri2 = (Uri)Spider.class.getMethod("proxy", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {}
        uri = g.c(uri).addInterceptor((Interceptor)new c()).addInterceptor((Interceptor)new b()).build();
        this.a = uri;
        uri.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static OkHttpClient a() {
        return f.a.a;
    }

    public static g b() {
        return f.a;
    }

    public static OkHttpClient.Builder c(Uri object) {
        Dns dns;
        block3: {
            block5: {
                block4: {
                    Object object2 = new OkHttpClient.Builder();
                    try {
                        dns = (Dns)Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
                    }
                    catch (Exception exception) {
                        dns = Dns.SYSTEM;
                    }
                    dns = object2.dns(dns);
                    object2 = TimeUnit.SECONDS;
                    dns = dns.readTimeout(30L, (TimeUnit)((Object)object2)).writeTimeout(30L, (TimeUnit)((Object)object2)).connectTimeout(30L, (TimeUnit)((Object)object2));
                    object2 = l.d;
                    dns = dns.hostnameVerifier((HostnameVerifier)j.a).sslSocketFactory((SSLSocketFactory)new l(), l.d);
                    if (object == null || object.getScheme() == null || object.getHost() == null || object.getPort() <= 0) break block3;
                    object2 = object.getUserInfo();
                    if (object2 != null && ((String)object2).contains(":")) {
                        Authenticator.setDefault(new e((String)object2));
                    }
                    if (object.getScheme() == null || object.getScheme().startsWith("socks")) break block4;
                    if (!object.getScheme().startsWith("http")) break block3;
                    object = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(object.getHost(), object.getPort()));
                    break block5;
                }
                object = new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(object.getHost(), object.getPort()));
            }
            dns.proxy((Proxy)object);
        }
        return dns;
    }

    public static Response d(String string) {
        return f.a.a.newCall(new Request.Builder().url(string).build()).execute();
    }

    public static Response e(String string, Map<String, String> map) {
        return f.a.a.newCall(new Request.Builder().url(string).headers(Headers.of(map)).build()).execute();
    }

    public static void f(String string) {
        Authenticator.setDefault(new e(string));
    }

    public static String g(String object, Map<String, String> map) {
        OkHttpClient okHttpClient = f.a.a;
        object = new h("GET", (String)object, null, map, null);
        ((h)object).b();
        return ((h)object).a(okHttpClient).a();
    }
}

