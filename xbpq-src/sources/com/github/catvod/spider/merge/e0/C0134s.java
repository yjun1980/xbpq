package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;

/* renamed from: com.github.catvod.spider.merge.e0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134s extends N {
    private final String a;

    public C0134s(String str) {
        this.a = C0243a.c(str);
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return C0243a.c(lVar2.p0()).contains(this.a);
    }

    public final String toString() {
        return String.format(cYh.d("5D332E3F233B0E3E327972294E"), this.a);
    }
}
