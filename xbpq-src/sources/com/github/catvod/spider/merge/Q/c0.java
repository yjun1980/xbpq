package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class c0 extends t0 {
    public final int b;
    public final int c;

    public c0(AbstractC0022m abstractC0022m, int i, int i2) {
        super(abstractC0022m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final com.github.catvod.spider.merge.S.j c() {
        return com.github.catvod.spider.merge.S.j.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        String d = cYh.d("40");
        StringBuilder appendCodePoint = new StringBuilder(d).appendCodePoint(this.b);
        appendCodePoint.append(cYh.d("407E6F76"));
        StringBuilder appendCodePoint2 = appendCodePoint.appendCodePoint(this.c);
        appendCodePoint2.append(d);
        return appendCodePoint2.toString();
    }
}
