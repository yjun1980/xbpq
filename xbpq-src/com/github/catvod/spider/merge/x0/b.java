/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Headers
 *  okhttp3.Headers$Builder
 *  okhttp3.HttpUrl
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.a;
import com.github.catvod.spider.merge.x0.f;
import com.github.catvod.spider.merge.x0.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public abstract class b<P extends h<P>>
implements h<P> {
    private String a;
    private Headers.Builder b;
    private final int c;
    private final com.github.catvod.spider.merge.r0.a d;
    private List<com.github.catvod.spider.merge.u0.a> e;
    private final Request.Builder f = new Request.Builder();
    private boolean g = true;

    public b(String string, int n2) {
        this.a = string;
        this.c = n2;
        this.d = com.github.catvod.spider.merge.q0.b.c();
    }

    @Override
    public final Request a() {
        Headers headers = com.github.catvod.spider.merge.q0.b.g(this);
        Request.Builder builder = this.f;
        builder.url(headers.f()).method(com.github.catvod.spider.merge.x0.f.a(headers.b()), headers.c());
        headers = headers.m();
        if (headers != null) {
            builder.headers(headers);
        }
        return builder.build();
    }

    @Override
    public final int b() {
        return this.c;
    }

    @Override
    public RequestBody c() {
        return this.h();
    }

    public final h d(Map object) {
        for (Map.Entry entry : object.entrySet()) {
            this.o((String)entry.getKey(), (String)entry.getValue());
        }
        return this;
    }

    @Override
    public final int e() {
        return this.d.b();
    }

    @Override
    public final HttpUrl f() {
        return com.github.catvod.spider.merge.x.a.b(this.a, this.e);
    }

    @Override
    public final h g(Object object) {
        this.l(Object.class, object);
        return this;
    }

    @Override
    public final boolean i() {
        return this.g;
    }

    @Override
    public final com.github.catvod.spider.merge.r0.a j() {
        if (this.d.a() == null) {
            String string = this.q();
            this.d.d(string);
        }
        return this.d;
    }

    @Override
    public final <T> P l(Class<? super T> clazz, T t2) {
        this.f.tag(clazz, t2);
        return (P)this;
    }

    @Override
    public final Headers m() {
        Object object = this.b;
        object = object == null ? null : object.build();
        return object;
    }

    public final h n(Map object2) {
        for (Map.Entry entry : object2.entrySet()) {
            this.k((String)entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final h o(String string, String string2) {
        this.s().add(string, string2);
        return this;
    }

    public final P p(String object, Object object2) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = "";
        }
        object = new com.github.catvod.spider.merge.u0.a((String)object, object3);
        if (this.e == null) {
            this.e = new ArrayList<com.github.catvod.spider.merge.u0.a>();
        }
        ((ArrayList)this.e).add((com.github.catvod.spider.merge.u0.a)object);
        return (P)this;
    }

    public String q() {
        List list = com.github.catvod.spider.merge.A0.a.b(this.e);
        return com.github.catvod.spider.merge.x.a.b(this.a, list).toString();
    }

    protected final RequestBody r(Object object) {
        Object object2 = (com.github.catvod.spider.merge.s0.a)this.f.build().tag(com.github.catvod.spider.merge.s0.a.class);
        if (object2 != null) {
            try {
                object2 = object2.a(object);
                return object2;
            }
            catch (IOException iOException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(cYh.d("323E20333B3F47242E71343509262423237A"));
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(cYh.d("47242E71053F162524222318083438"));
                throw new IllegalArgumentException(((StringBuilder)object2).toString(), iOException);
            }
        }
        throw new NullPointerException(cYh.d("043F2F27322813353371343B09702F3E237A0535613F22360B"));
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
        return com.github.catvod.spider.merge.x.a.b(this.a, this.e).toString();
    }
}

