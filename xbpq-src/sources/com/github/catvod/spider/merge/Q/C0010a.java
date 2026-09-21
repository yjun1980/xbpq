package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.Q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010a {
    public final List<AbstractC0022m> a = new ArrayList();
    public final List<AbstractC0030v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public C[] h;
    public final List<r0> i;

    public C0010a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public final void a(AbstractC0022m abstractC0022m) {
        if (abstractC0022m != null) {
            abstractC0022m.a = this;
            abstractC0022m.b = this.a.size();
        }
        this.a.add(abstractC0022m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.v>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.v>, java.util.ArrayList] */
    public final AbstractC0030v b(int i) {
        if (this.b.isEmpty()) {
            return null;
        }
        return (AbstractC0030v) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List<com.github.catvod.spider.merge.Q.m>, java.util.ArrayList] */
    public final com.github.catvod.spider.merge.S.j c(int i, com.github.catvod.spider.merge.P.C c) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException(cYh.d("2E3E37303B3303703225362E02702F243A3802226F"));
        }
        com.github.catvod.spider.merge.S.j e = e((AbstractC0022m) this.a.get(i));
        if (!e.d(-2)) {
            return e;
        }
        com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
        jVar.c(e);
        jVar.h();
        while (c != null && c.b >= 0 && e.d(-2)) {
            e = e(((f0) ((AbstractC0022m) this.a.get(c.b)).d(0)).c);
            jVar.c(e);
            jVar.h();
            c = c.a;
        }
        if (e.d(-2)) {
            jVar.a(-1);
        }
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.v>, java.util.ArrayList] */
    public final int d() {
        return this.b.size();
    }

    public final com.github.catvod.spider.merge.S.j e(AbstractC0022m abstractC0022m) {
        com.github.catvod.spider.merge.S.j jVar = abstractC0022m.f;
        if (jVar != null) {
            return jVar;
        }
        com.github.catvod.spider.merge.S.j f = f(abstractC0022m, null);
        abstractC0022m.f = f;
        f.i();
        return abstractC0022m.f;
    }

    public final com.github.catvod.spider.merge.S.j f(AbstractC0022m abstractC0022m, com.github.catvod.spider.merge.P.C c) {
        C0033y c0033y = new C0033y(this);
        com.github.catvod.spider.merge.S.j jVar = new com.github.catvod.spider.merge.S.j(new int[0]);
        c0033y.a(abstractC0022m, c != null ? X.a(abstractC0022m.a, c) : null, jVar, new HashSet(), new BitSet());
        return jVar;
    }
}
