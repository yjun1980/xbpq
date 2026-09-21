package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x0.h;
import com.github.catvod.spider.merge.x0.i;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes.dex */
public class i<P extends h, R extends i> {
    private OkHttpClient a;
    private OkHttpClient b = com.github.catvod.spider.merge.q0.b.f();
    protected com.github.catvod.spider.merge.t0.a c = (com.github.catvod.spider.merge.t0.a) com.github.catvod.spider.merge.q0.b.d();
    protected P d;
    public Request e;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(P p) {
        this.d = p;
    }

    private static String c(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static n d(String str, Object... objArr) {
        return new n(new g(c(str, objArr), 1));
    }

    public static n f(String str, Object... objArr) {
        return new n(new g(c(str, objArr), 2));
    }

    public static k g(String str, Object... objArr) {
        return new k(new c(c(str, objArr)));
    }

    public static l h(String str, Object... objArr) {
        return new l(new d(c(str, objArr)));
    }

    public static m i(String str, Object... objArr) {
        return new m(new e(c(str, objArr)));
    }

    public final R a(Map<String, String> map) {
        this.d.d(map);
        return this;
    }

    public final <T> T b(com.github.catvod.spider.merge.y0.a<T> aVar) {
        if (this.e == null) {
            this.d.l(com.github.catvod.spider.merge.s0.a.class, this.c);
            this.e = this.d.a();
        }
        return aVar.onParse(e().newCall(this.e).execute());
    }

    public final OkHttpClient e() {
        OkHttpClient okHttpClient = this.a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient okHttpClient2 = this.b;
        OkHttpClient.Builder builder = null;
        if (this.d.e() != 1) {
            builder = okHttpClient2.newBuilder();
            builder.addInterceptor(new com.github.catvod.spider.merge.w0.b(this.d.j()));
        }
        if (builder != null) {
            okHttpClient2 = builder.build();
        }
        this.a = okHttpClient2;
        return okHttpClient2;
    }

    public final R j(OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            throw new IllegalArgumentException(cYh.d("083B023D3E3F092461323634473E2E25773802702F243B36"));
        }
        this.b = okHttpClient;
        return this;
    }

    public final R k(Object obj) {
        this.d.g(obj);
        return this;
    }
}
