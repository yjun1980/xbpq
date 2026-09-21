package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z.AbstractC0267a;
import com.github.catvod.spider.merge.z.AbstractC0268b;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0267a implements com.github.catvod.spider.merge.z.g {
    public static final d c = new d();

    public e() {
        super(com.github.catvod.spider.merge.z.g.a);
    }

    @Override // com.github.catvod.spider.merge.z.AbstractC0267a, com.github.catvod.spider.merge.z.h, com.github.catvod.spider.merge.z.k
    public final <E extends com.github.catvod.spider.merge.z.h> E get(com.github.catvod.spider.merge.z.i<E> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        if (!(iVar instanceof AbstractC0268b)) {
            if (com.github.catvod.spider.merge.z.g.a == iVar) {
                return this;
            }
            return null;
        }
        AbstractC0268b abstractC0268b = (AbstractC0268b) iVar;
        if (!abstractC0268b.a(getKey())) {
            return null;
        }
        E e = (E) abstractC0268b.b(this);
        if (e instanceof com.github.catvod.spider.merge.z.h) {
            return e;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (com.github.catvod.spider.merge.z.g.a == r2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2.b(r1) != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        return com.github.catvod.spider.merge.z.l.c;
     */
    @Override // com.github.catvod.spider.merge.z.AbstractC0267a, com.github.catvod.spider.merge.z.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.z.k minusKey(com.github.catvod.spider.merge.z.i<?> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "0C3538"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            com.github.catvod.spider.merge.E.f.e(r2, r0)
            boolean r0 = r2 instanceof com.github.catvod.spider.merge.z.AbstractC0268b
            if (r0 == 0) goto L24
            com.github.catvod.spider.merge.z.b r2 = (com.github.catvod.spider.merge.z.AbstractC0268b) r2
            com.github.catvod.spider.merge.z.i r0 = r1.getKey()
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L22
            com.github.catvod.spider.merge.z.h r2 = r2.b(r1)
            if (r2 == 0) goto L22
        L1f:
            com.github.catvod.spider.merge.z.l r2 = com.github.catvod.spider.merge.z.l.c
            goto L29
        L22:
            r2 = r1
            goto L29
        L24:
            com.github.catvod.spider.merge.z.f r0 = com.github.catvod.spider.merge.z.g.a
            if (r0 != r2) goto L22
            goto L1f
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.e.minusKey(com.github.catvod.spider.merge.z.i):com.github.catvod.spider.merge.z.k");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + h.d(this);
    }
}
