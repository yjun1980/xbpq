package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;

/* loaded from: classes.dex */
public final class r extends N {
    private final String a;

    public r(String str) {
        this.a = C0243a.c(str);
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return C0243a.c(lVar2.e0()).contains(this.a);
    }

    public final String toString() {
        return String.format(cYh.d("5D332E3F233B0E3E321E20344F753278"), this.a);
    }
}
