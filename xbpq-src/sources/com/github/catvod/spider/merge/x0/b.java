package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import com.github.catvod.spider.merge.x0.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public abstract class b<P extends h<P>> implements h<P> {
    private String a;
    private Headers.Builder b;
    private final int c;
    private List<com.github.catvod.spider.merge.u0.a> e;
    private final Request.Builder f = new Request.Builder();
    private boolean g = true;
    private final com.github.catvod.spider.merge.r0.a d = com.github.catvod.spider.merge.q0.b.c();

    public b(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final Request a() {
        h<?> g = com.github.catvod.spider.merge.q0.b.g(this);
        Request.Builder builder = this.f;
        builder.url(g.f()).method(f.a(g.b()), g.c());
        Headers m = g.m();
        if (m != null) {
            builder.headers(m);
        }
        return builder.build();
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final int b() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public RequestBody c() {
        return h();
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final h d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            o((String) entry.getKey(), (String) entry.getValue());
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final int e() {
        return this.d.b();
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final HttpUrl f() {
        return C0243a.b(this.a, this.e);
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final h g(Object obj) {
        l(Object.class, obj);
        return this;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final boolean i() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final com.github.catvod.spider.merge.r0.a j() {
        if (this.d.a() == null) {
            this.d.d(q());
        }
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final <T> P l(Class<? super T> cls, T t) {
        this.f.tag(cls, t);
        return this;
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final Headers m() {
        Headers.Builder builder = this.b;
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public final h n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            k((String) entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final h o(String str, String str2) {
        s().add(str, str2);
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.u0.a>, java.util.ArrayList] */
    public final P p(String str, Object obj) {
        if (obj == null) {
            obj = "";
        }
        com.github.catvod.spider.merge.u0.a aVar = new com.github.catvod.spider.merge.u0.a(str, obj);
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(aVar);
        return this;
    }

    public String q() {
        return C0243a.b(this.a, com.github.catvod.spider.merge.A0.a.b(this.e)).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RequestBody r(Object obj) {
        com.github.catvod.spider.merge.s0.a aVar = (com.github.catvod.spider.merge.s0.a) this.f.build().tag(com.github.catvod.spider.merge.s0.a.class);
        if (aVar == null) {
            throw new NullPointerException(cYh.d("043F2F27322813353371343B09702F3E237A0535613F22360B"));
        }
        try {
            return aVar.a(obj);
        } catch (IOException e) {
            throw new IllegalArgumentException(cYh.d("323E20333B3F47242E71343509262423237A") + obj + cYh.d("47242E71053F162524222318083438"), e);
        }
    }

    public final Headers.Builder s() {
        if (this.b == null) {
            this.b = new Headers.Builder();
        }
        return this.b;
    }

    public final List<com.github.catvod.spider.merge.u0.a> t() {
        return this.e;
    }

    public final String u() {
        return this.a;
    }

    public final String v() {
        return C0243a.b(this.a, this.e).toString();
    }
}
