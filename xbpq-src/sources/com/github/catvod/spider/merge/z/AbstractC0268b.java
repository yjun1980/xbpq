package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.h;

/* renamed from: com.github.catvod.spider.merge.z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268b<B extends h, E extends B> implements i<E> {
    private final com.github.catvod.spider.merge.D.b<h, E> a;
    private final i<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.catvod.spider.merge.z.i<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.github.catvod.spider.merge.D.b<com.github.catvod.spider.merge.z.h, E extends B>, com.github.catvod.spider.merge.D.b<? super com.github.catvod.spider.merge.z.h, ? extends E extends B>] */
    public AbstractC0268b(i<B> iVar, com.github.catvod.spider.merge.D.b<? super h, ? extends E> bVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("053132341C3F1E"));
        this.a = bVar;
        this.b = iVar instanceof AbstractC0268b ? (i<B>) ((AbstractC0268b) iVar).b : iVar;
    }

    public final boolean a(i<?> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        return iVar == this || this.b == iVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/z/h;)TE; */
    public final h b(h hVar) {
        com.github.catvod.spider.merge.E.f.e(hVar, cYh.d("023C243C323413"));
        return (h) this.a.c(hVar);
    }
}
