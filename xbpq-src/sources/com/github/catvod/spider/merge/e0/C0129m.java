package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;

/* renamed from: com.github.catvod.spider.merge.e0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129m extends AbstractC0126j {
    public C0129m(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return lVar2.o(this.a) && C0243a.c(lVar2.c(this.a)).contains(this.b);
    }

    public final String toString() {
        return String.format(cYh.d("3C75327B6A7F140D"), this.a, this.b);
    }
}
