package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.x0.h;
import com.github.catvod.spider.merge.z0.c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class b {
    private static final b e = new b();
    public static final /* synthetic */ int f = 0;
    private OkHttpClient a;
    private com.github.catvod.spider.merge.t0.a b = com.github.catvod.spider.merge.t0.a.b();
    private List<String> c = Collections.emptyList();
    private com.github.catvod.spider.merge.r0.a d = new com.github.catvod.spider.merge.r0.a();

    public static void a(Object obj) {
        OkHttpClient okHttpClient;
        if (obj == null || (okHttpClient = e.a) == null) {
            return;
        }
        Dispatcher dispatcher = okHttpClient.dispatcher();
        for (Call call : dispatcher.queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : dispatcher.runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public static void b() {
        e.getClass();
    }

    public static com.github.catvod.spider.merge.r0.a c() {
        return new com.github.catvod.spider.merge.r0.a(e.d);
    }

    public static com.github.catvod.spider.merge.s0.a d() {
        return e.b;
    }

    public static List<String> e() {
        return e.c;
    }

    public static OkHttpClient f() {
        b bVar = e;
        if (bVar.a == null) {
            com.github.catvod.spider.merge.z0.a a = c.a();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bVar.a = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).sslSocketFactory(a.a, a.b).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.q0.a
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    int i = b.f;
                    return true;
                }
            }).build();
        }
        return bVar.a;
    }

    public static h<?> g(h<?> hVar) {
        if (hVar != null && hVar.i()) {
            e.getClass();
        }
        return hVar;
    }
}
