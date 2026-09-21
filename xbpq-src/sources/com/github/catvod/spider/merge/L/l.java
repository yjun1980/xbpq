package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public abstract class l implements Runnable, Comparable<l>, com.github.catvod.spider.merge.N.k {
    private com.github.catvod.spider.merge.N.j c;
    public long d;

    @Override // com.github.catvod.spider.merge.N.k
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.N.k
    public final void b(com.github.catvod.spider.merge.N.j<?> jVar) {
        com.github.catvod.spider.merge.N.g gVar;
        com.github.catvod.spider.merge.N.j jVar2 = this.c;
        gVar = p.a;
        if (!(jVar2 != gVar)) {
            throw new IllegalArgumentException(cYh.d("2131283D323E47222420223315352C34392E49").toString());
        }
        this.c = jVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        long j = this.d - lVar.d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("23352D302E3F030B2F303935146D"));
        b.append(this.d);
        b.append(']');
        return b.toString();
    }
}
