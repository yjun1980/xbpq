package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;

/* loaded from: classes.dex */
final class M extends N {
    /* JADX INFO: Access modifiers changed from: package-private */
    public M() {
        this.a = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.N, com.github.catvod.spider.merge.d0.O
    public final /* bridge */ /* synthetic */ O g() {
        g();
        return this;
    }

    public final String toString() {
        StringBuilder b;
        String x;
        boolean r = r();
        String d = cYh.d("59");
        String d2 = cYh.d("5B");
        if (r && this.j.size() > 0) {
            b = C0059d.b(d2);
            b.append(x());
            b.append(cYh.d("47"));
            x = this.j.toString();
        } else {
            b = C0059d.b(d2);
            x = x();
        }
        return com.github.catvod.spider.merge.b.n.b(b, x, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.N
    /* renamed from: v */
    public final N g() {
        super.g();
        this.j = null;
        return this;
    }
}
