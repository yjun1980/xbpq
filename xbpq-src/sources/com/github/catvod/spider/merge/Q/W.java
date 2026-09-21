package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
public final class W extends AbstractC0023n {
    public final int b;
    public final int c;
    public final boolean d;

    public W(AbstractC0022m abstractC0022m, int i, int i2, boolean z) {
        super(abstractC0022m);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.Q.t0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("1722243508"));
        b.append(this.b);
        b.append(cYh.d("5D"));
        b.append(this.c);
        return b.toString();
    }
}
