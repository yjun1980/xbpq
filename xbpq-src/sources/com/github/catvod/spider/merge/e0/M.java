package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class M extends N {
    private final String a;

    public M(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return lVar2.d0().equals(this.a);
    }

    public final String toString() {
        return String.format(cYh.d("4223"), this.a);
    }
}
