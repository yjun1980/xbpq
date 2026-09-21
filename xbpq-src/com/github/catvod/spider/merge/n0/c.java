/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.n0.a;
import com.github.catvod.spider.merge.n0.b;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class c {
    private static final ThreadFactory g = new a();
    private Map<String, String> a;
    private String b;
    private int c;
    private boolean d;
    private ExecutorService e;
    private Proxy f;

    c(b b2) {
        this.a = (HashMap)com.github.catvod.spider.merge.n0.b.c(b2);
        this.b = null;
        this.c = com.github.catvod.spider.merge.n0.b.d(b2);
        this.d = com.github.catvod.spider.merge.n0.b.a(b2);
        this.e = com.github.catvod.spider.merge.n0.b.b(b2);
        this.f = null;
    }

    static /* bridge */ /* synthetic */ ThreadFactory a() {
        return g;
    }

    public final String b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final Proxy e() {
        return this.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final void g(String string) {
        this.b = string;
    }

    public final void h(Proxy.Type type, String string, int n2) {
        this.f = new Proxy(type, new InetSocketAddress(string, n2));
    }
}

