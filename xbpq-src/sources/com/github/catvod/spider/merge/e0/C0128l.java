package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.e0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128l extends AbstractC0126j {
    public C0128l(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return lVar2.o(this.a) && this.b.equalsIgnoreCase(lVar2.c(this.a).trim());
    }

    public final String toString() {
        return String.format(cYh.d("3C75326C72293A"), this.a, this.b);
    }
}
