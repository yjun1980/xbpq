/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Call
 *  okhttp3.Dispatcher
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 */
package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.q0.a;
import com.github.catvod.spider.merge.x0.h;
import com.github.catvod.spider.merge.z0.c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

public final class b {
    private static final b e = new b();
    public static final int f = 0;
    private OkHttpClient a;
    private com.github.catvod.spider.merge.t0.a b = com.github.catvod.spider.merge.t0.a.b();
    private List<String> c = Collections.emptyList();
    private com.github.catvod.spider.merge.r0.a d = new com.github.catvod.spider.merge.r0.a();

    public static void a(Object object) {
        if (object == null) {
            return;
        }
        Object object22 = com.github.catvod.spider.merge.q0.b.e.a;
        if (object22 == null) {
            return;
        }
        Dispatcher dispatcher = object22.dispatcher();
        for (Call call : dispatcher.queuedCalls()) {
            if (!object.equals(call.request().tag())) continue;
            call.cancel();
        }
        for (Object object22 : dispatcher.runningCalls()) {
            if (!object.equals(object22.request().tag())) continue;
            object22.cancel();
        }
    }

    public static void b() {
        e.getClass();
    }

    public static com.github.catvod.spider.merge.r0.a c() {
        return new com.github.catvod.spider.merge.r0.a(com.github.catvod.spider.merge.q0.b.e.d);
    }

    public static com.github.catvod.spider.merge.s0.a d() {
        return com.github.catvod.spider.merge.q0.b.e.b;
    }

    public static List<String> e() {
        return com.github.catvod.spider.merge.q0.b.e.c;
    }

    public static OkHttpClient f() {
        b b2 = e;
        if (b2.a == null) {
            com.github.catvod.spider.merge.z0.a a2 = com.github.catvod.spider.merge.z0.c.a();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b2.a = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).sslSocketFactory(a2.a, a2.b).hostnameVerifier((HostnameVerifier)com.github.catvod.spider.merge.q0.a.a).build();
        }
        return b2.a;
    }

    public static h<?> g(h<?> h2) {
        if (h2 != null && h2.i()) {
            e.getClass();
        }
        return h2;
    }
}

