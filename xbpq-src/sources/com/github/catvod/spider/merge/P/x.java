package com.github.catvod.spider.merge.P;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class x extends C {
    public List<com.github.catvod.spider.merge.T.b> d;
    public D e;
    public D f;

    public x() {
    }

    public x(x xVar, int i) {
        super(xVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.C, com.github.catvod.spider.merge.T.b
    public final com.github.catvod.spider.merge.T.b b(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.T.b) this.d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.C, com.github.catvod.spider.merge.T.b
    public final int d() {
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    public final <T extends com.github.catvod.spider.merge.T.b> T h(T t) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(t);
        return t;
    }

    public void i(com.github.catvod.spider.merge.T.c cVar) {
    }

    public void j(com.github.catvod.spider.merge.T.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    public final x k(Class cls) {
        com.github.catvod.spider.merge.T.b bVar;
        ?? r0 = this.d;
        if (r0 != 0 && r0.size() > 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.T.b bVar2 = (com.github.catvod.spider.merge.T.b) it.next();
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.T.b) cls.cast(bVar2);
                    break;
                }
            }
        }
        bVar = null;
        return (x) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    public final <T extends x> List<T> l(Class<? extends T> cls) {
        ?? r0 = this.d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.T.b bVar = (com.github.catvod.spider.merge.T.b) it.next();
            if (cls.isInstance(bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(bVar));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.T.b>, java.util.ArrayList] */
    public final com.github.catvod.spider.merge.T.f m(int i) {
        ?? r0 = this.d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.T.b bVar = (com.github.catvod.spider.merge.T.b) it.next();
            if (bVar instanceof com.github.catvod.spider.merge.T.f) {
                com.github.catvod.spider.merge.T.f fVar = (com.github.catvod.spider.merge.T.f) bVar;
                if (fVar.a().e() == i) {
                    return fVar;
                }
            }
        }
        return null;
    }
}
