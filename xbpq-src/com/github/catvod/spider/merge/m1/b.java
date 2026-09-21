/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.m1.c;
import com.github.catvod.spider.merge.p1.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {
    private String a;
    private String b;
    private final Map<String, List<String>> c = new LinkedHashMap<String, List<String>>();
    private byte[] d;
    private e e;
    private boolean f = true;

    static /* bridge */ /* synthetic */ boolean a(b b2) {
        return b2.f;
    }

    static /* bridge */ /* synthetic */ byte[] b(b b2) {
        return b2.d;
    }

    static /* bridge */ /* synthetic */ Map c(b b2) {
        return b2.c;
    }

    static /* bridge */ /* synthetic */ String d(b b2) {
        return b2.a;
    }

    static /* bridge */ /* synthetic */ e e(b b2) {
        return b2.e;
    }

    static /* bridge */ /* synthetic */ String f(b b2) {
        return b2.b;
    }

    public final c g() {
        return new c(this);
    }

    public final b h(String string) {
        this.a = "GET";
        this.b = string;
        return this;
    }

    public final b i(String string) {
        this.a = "HEAD";
        this.b = string;
        return this;
    }

    public final b j(Map<String, List<String>> map) {
        ((LinkedHashMap)this.c).clear();
        if (map != null) {
            this.c.putAll(map);
        }
        return this;
    }

    public final b k(e e2) {
        this.e = e2;
        return this;
    }

    public final b l(String string, byte[] byArray) {
        this.a = "POST";
        this.b = string;
        this.d = byArray;
        return this;
    }
}

