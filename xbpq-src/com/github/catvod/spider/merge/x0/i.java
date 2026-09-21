/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.q0.b;
import com.github.catvod.spider.merge.t0.a;
import com.github.catvod.spider.merge.x0.c;
import com.github.catvod.spider.merge.x0.d;
import com.github.catvod.spider.merge.x0.e;
import com.github.catvod.spider.merge.x0.g;
import com.github.catvod.spider.merge.x0.h;
import com.github.catvod.spider.merge.x0.k;
import com.github.catvod.spider.merge.x0.l;
import com.github.catvod.spider.merge.x0.m;
import com.github.catvod.spider.merge.x0.n;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class i<P extends h, R extends i> {
    private OkHttpClient a;
    private OkHttpClient b = com.github.catvod.spider.merge.q0.b.f();
    protected a c = (a)com.github.catvod.spider.merge.q0.b.d();
    protected P d;
    public Request e;

    protected i(P p2) {
        this.d = p2;
    }

    private static String c(String string, Object ... objectArray) {
        if (objectArray.length != 0) {
            string = String.format(string, objectArray);
        }
        return string;
    }

    public static n d(String string, Object ... objectArray) {
        return new n(new g(i.c(string, objectArray), 1));
    }

    public static n f(String string, Object ... objectArray) {
        return new n(new g(i.c(string, objectArray), 2));
    }

    public static k g(String string, Object ... objectArray) {
        return new k(new c(i.c(string, objectArray)));
    }

    public static l h(String string, Object ... objectArray) {
        return new l(new d(i.c(string, objectArray)));
    }

    public static m i(String string, Object ... objectArray) {
        return new m(new e(i.c(string, objectArray)));
    }

    public final R a(Map<String, String> map) {
        this.d.d(map);
        return (R)this;
    }

    public final <T> T b(com.github.catvod.spider.merge.y0.a<T> a2) {
        if (this.e == null) {
            this.d.l(com.github.catvod.spider.merge.s0.a.class, (Object)this.c);
            this.e = this.d.a();
        }
        Request request = this.e;
        return a2.onParse(this.e().newCall(request).execute());
    }

    public final OkHttpClient e() {
        OkHttpClient okHttpClient = this.a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient okHttpClient2 = this.b;
        okHttpClient = null;
        if (this.d.e() != 1) {
            okHttpClient = okHttpClient2.newBuilder();
            okHttpClient.addInterceptor((Interceptor)new com.github.catvod.spider.merge.w0.b(this.d.j()));
        }
        if (okHttpClient != null) {
            okHttpClient2 = okHttpClient.build();
        }
        this.a = okHttpClient2;
        return okHttpClient2;
    }

    public final R j(OkHttpClient okHttpClient) {
        if (okHttpClient != null) {
            this.b = okHttpClient;
            return (R)this;
        }
        throw new IllegalArgumentException(cYh.d("083B023D3E3F092461323634473E2E25773802702F243B36"));
    }

    public final R k(Object object) {
        this.d.g(object);
        return (R)this;
    }
}

