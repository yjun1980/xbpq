/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.Spider
 *  okhttp3.Dns
 *  okhttp3.Headers
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.h;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h.a;
import com.github.catvod.spider.merge.h.c;
import com.github.catvod.spider.merge.h.d;
import com.github.catvod.spider.merge.h.e;
import com.github.catvod.spider.merge.h.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class b {
    private final OkHttpClient a;

    public b() {
        Object object;
        Object object2 = new OkHttpClient.Builder();
        try {
            object = (Dns)Spider.class.getMethod(cYh.d("14312734133414"), new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            object = Dns.SYSTEM;
        }
        object = object2.dns(object);
        object2 = TimeUnit.SECONDS;
        object2 = object.readTimeout(30L, (TimeUnit)((Object)object2)).writeTimeout(30L, (TimeUnit)((Object)object2)).connectTimeout(30L, (TimeUnit)((Object)object2));
        object = g.b;
        object = object2.hostnameVerifier((HostnameVerifier)e.a).sslSocketFactory((SSLSocketFactory)new g(), g.b).build();
        this.a = object;
        object.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static Response a(String string) {
        return com.github.catvod.spider.merge.h.a.a.a.newCall(new Request.Builder().url(string).build()).execute();
    }

    public static Response b(String string, Map<String, String> map) {
        return com.github.catvod.spider.merge.h.a.a.a.newCall(new Request.Builder().url(string).headers(Headers.of(map)).build()).execute();
    }

    public static String c(String string, Map<String, String> map, Map<String, String> map2) {
        return b.i(com.github.catvod.spider.merge.h.a.a.a, cYh.d("371F1205"), string, map, map2, null);
    }

    public static String d(String string, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return b.i(com.github.catvod.spider.merge.h.a.a.a, cYh.d("371F1205"), string, map, map2, map3);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String e(Map map) {
        return b.i(com.github.catvod.spider.merge.h.a.a.a, cYh.d("371F1205"), cYh.d("0F2435212460487F31302429173F3325793B0B393824393E153937347939083D6E3F322D0B3F263839751622223E333F48213434252349342E6E362A171E203C3267063C2828223438343338213F4136333E3A090E24246C6268410F23297A2C5A626F637969"), map, null, null);
    }

    public static d f(String string, String string2, Map<String, String> map) {
        return new c(string, string2, map).a(com.github.catvod.spider.merge.h.a.a.a);
    }

    public static String g(String string, Map<String, String> map) {
        return b.h(string, map, null);
    }

    public static String h(String string, Map<String, String> map, Map<String, List<String>> map2) {
        return b.i(com.github.catvod.spider.merge.h.a.a.a, cYh.d("201515"), string, null, map, map2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String i(OkHttpClient okHttpClient, String object, String string, Map map, Map map2, Map map3) {
        object = new c((String)object, string, map, map2, map3);
        ((c)object).b();
        return ((c)object).a(okHttpClient).a();
    }
}

