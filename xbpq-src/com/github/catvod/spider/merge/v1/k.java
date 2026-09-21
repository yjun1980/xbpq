/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.v1.a;
import com.github.catvod.spider.merge.v1.b;
import com.github.catvod.spider.merge.v1.c;
import com.github.catvod.spider.merge.v1.d;
import com.github.catvod.spider.merge.v1.e;
import com.github.catvod.spider.merge.v1.f;
import com.github.catvod.spider.merge.v1.g;
import com.github.catvod.spider.merge.v1.h;
import com.github.catvod.spider.merge.v1.i;
import com.github.catvod.spider.merge.v1.j;
import com.github.catvod.spider.merge.v1.l;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class k
extends com.github.catvod.spider.merge.H1.g {
    private com.github.catvod.spider.merge.F0.e e = null;
    private String f = "";
    private com.github.catvod.spider.merge.F0.e g = null;

    public k(p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    public static /* synthetic */ Stream b0(com.github.catvod.spider.merge.F0.e e2) {
        return ((AbstractMap)e2.g("urls")).entrySet().stream().filter(h.a).map(new b(e2));
    }

    private String c0(String string) {
        return this.g.b("streams").c().map(d.a).filter(new g(string, 0)).map(new a(string, 0)).findFirst().orElse("");
    }

    private <T extends com.github.catvod.spider.merge.H1.f> List<T> d0(String string, Function<j, T> function) {
        return this.g.b("streams").c().filter(new com.github.catvod.spider.merge.k1.h(string, 1)).flatMap(c.a).filter(i.a).map(function).collect(Collectors.toList());
    }

    @Override
    public final m H() {
        return m.d;
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        return l.b(this.g);
    }

    @Override
    public final String U() {
        return this.e.i("conference", null);
    }

    @Override
    public final String W() {
        return com.github.catvod.spider.merge.B.e.c("https://streaming.media.ccc.de/", this.e.i("slug", null));
    }

    @Override
    public final List<r> X() {
        return Collections.emptyList();
    }

    @Override
    public final List<r> Y() {
        return this.d0("video", com.github.catvod.spider.merge.v1.f.a);
    }

    @Override
    public final long Z() {
        return -1L;
    }

    @Override
    public final String i() {
        return this.g.i("display", null);
    }

    @Override
    public final void o(com.github.catvod.spider.merge.m1.a object) {
        object = l.a((com.github.catvod.spider.merge.m1.a)object, this.f());
        for (int i2 = 0; i2 < ((AbstractCollection)object).size(); ++i2) {
            com.github.catvod.spider.merge.F0.e e2 = ((com.github.catvod.spider.merge.F0.c)object).a(i2);
            com.github.catvod.spider.merge.F0.c c2 = e2.b("groups");
            for (int i4 = 0; i4 < ((AbstractCollection)c2).size(); ++i4) {
                String string = c2.a(i4).i("group", null);
                com.github.catvod.spider.merge.F0.c c3 = c2.a(i4).b("rooms");
                for (int i5 = 0; i5 < ((AbstractCollection)c3).size(); ++i5) {
                    com.github.catvod.spider.merge.F0.e e3 = c3.a(i5);
                    String string2 = this.g();
                    String string3 = e2.i("mandator", null);
                    String string4 = e3.i("slug", null);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string3);
                    stringBuilder.append("/");
                    stringBuilder.append(string4);
                    if (!string2.equals(stringBuilder.toString())) continue;
                    this.e = e2;
                    this.f = string;
                    this.g = e3;
                    return;
                }
            }
        }
        throw new com.github.catvod.spider.merge.n1.e(s.a("Could not find room matching id: '", this.g(), "'"));
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        return this.d0("audio", com.github.catvod.spider.merge.v1.e.a);
    }

    @Override
    public final String r() {
        return this.f;
    }

    @Override
    public final String s() {
        return this.c0("dash");
    }

    @Override
    public final com.github.catvod.spider.merge.H1.d t() {
        return new com.github.catvod.spider.merge.H1.d(s.a(this.e.i("description", null), " - ", this.f), com.github.catvod.spider.merge.H1.c.c);
    }

    @Override
    public final String x() {
        return this.c0("hls");
    }
}

