package com.github.catvod.spider.merge.p0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class d implements com.github.catvod.spider.merge.n0.a {
    boolean a = false;
    final Map<String, c> b = new HashMap();
    final LinkedBlockingQueue<com.github.catvod.spider.merge.o0.c> c = new LinkedBlockingQueue<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.p0.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.p0.c>, java.util.HashMap] */
    @Override // com.github.catvod.spider.merge.n0.a
    public final synchronized com.github.catvod.spider.merge.n0.b a(String str) {
        c cVar;
        cVar = (c) this.b.get(str);
        if (cVar == null) {
            cVar = new c(str, this.c, this.a);
            this.b.put(str, cVar);
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.p0.c>, java.util.HashMap] */
    public final void b() {
        this.b.clear();
        this.c.clear();
    }

    public final LinkedBlockingQueue<com.github.catvod.spider.merge.o0.c> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.p0.c>, java.util.HashMap] */
    public final List<c> d() {
        return new ArrayList(this.b.values());
    }

    public final void e() {
        this.a = true;
    }
}
