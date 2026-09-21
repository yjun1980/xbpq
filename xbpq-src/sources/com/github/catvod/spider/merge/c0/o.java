package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.e0.C0123g;

/* loaded from: classes.dex */
public final class o extends l {
    private final C0123g l;

    public o(F f, c cVar) {
        super(f, null, cVar);
        this.l = new C0123g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.c0.r
    public final void D(r rVar) {
        super.D(rVar);
        this.l.remove(rVar);
    }

    public final o r0(l lVar) {
        this.l.add(lVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.c0.l, com.github.catvod.spider.merge.c0.r
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return (o) super.j();
    }
}
