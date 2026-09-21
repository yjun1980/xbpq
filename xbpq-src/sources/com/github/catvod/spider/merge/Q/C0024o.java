package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* renamed from: com.github.catvod.spider.merge.Q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024o extends t0 {
    public final int b;
    public final int c;

    public C0024o(AbstractC0022m abstractC0022m, int i, int i2) {
        super(abstractC0022m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final int a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("06333538383438"));
        b.append(this.b);
        b.append(cYh.d("5D"));
        b.append(this.c);
        return b.toString();
    }
}
