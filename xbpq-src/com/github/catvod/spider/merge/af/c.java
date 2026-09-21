/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.Spider
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package com.github.catvod.spider.merge.af;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.af.a;
import com.github.catvod.spider.merge.af.b;
import com.github.catvod.spider.merge.af.d;
import com.github.catvod.spider.merge.af.g;
import com.github.catvod.spider.merge.af.i;
import com.github.catvod.spider.merge.nIe;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class c {
    private OkHttpClient a;

    public static OkHttpClient a() {
        if (b.a.a != null) {
            return b.a.a;
        }
        c c2 = b.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor((Interceptor)new g()).dns(Spider.safeDns());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier((HostnameVerifier)com.github.catvod.spider.merge.af.a.a).sslSocketFactory((SSLSocketFactory)new i(), i.d).build();
        c2.a = timeUnit;
        return timeUnit;
    }

    public static String b(String string) {
        OkHttpClient okHttpClient = c.a();
        string = string.startsWith(nIe.d("2A122733")) ? new d(string).a(okHttpClient).a() : "";
        return string;
    }
}

