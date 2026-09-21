package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.e0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136u extends N {
    private final String a;

    public C0136u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return this.a.equals(lVar2.Y());
    }

    public final String toString() {
        return String.format(cYh.d("447532"), this.a);
    }
}
