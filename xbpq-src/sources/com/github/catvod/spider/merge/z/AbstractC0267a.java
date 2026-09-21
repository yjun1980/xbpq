package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267a implements h {
    private final i<?> key;

    public AbstractC0267a(i<?> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        this.key = iVar;
    }

    @Override // com.github.catvod.spider.merge.z.k
    public <R> R fold(R r, com.github.catvod.spider.merge.D.c<? super R, ? super h, ? extends R> cVar) {
        com.github.catvod.spider.merge.E.f.e(cVar, cYh.d("08202423362E0E3F2F"));
        return cVar.b(r, this);
    }

    @Override // com.github.catvod.spider.merge.z.h, com.github.catvod.spider.merge.z.k
    public <E extends h> E get(i<E> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        if (com.github.catvod.spider.merge.E.f.a(getKey(), iVar)) {
            return this;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.z.h
    public i<?> getKey() {
        return this.key;
    }

    @Override // com.github.catvod.spider.merge.z.k
    public k minusKey(i<?> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        return com.github.catvod.spider.merge.E.f.a(getKey(), iVar) ? l.c : this;
    }

    public k plus(k kVar) {
        com.github.catvod.spider.merge.E.f.e(kVar, cYh.d("043F2F25322213"));
        return kVar == l.c ? this : (k) kVar.fold(this, j.c);
    }
}
