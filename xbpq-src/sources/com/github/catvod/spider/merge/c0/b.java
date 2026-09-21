package com.github.catvod.spider.merge.c0;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Iterator<a> {
    int a = 0;
    final /* synthetic */ c b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.b = cVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0009 */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r4 = this;
        L0:
            int r0 = r4.a
            com.github.catvod.spider.merge.c0.c r1 = r4.b
            int r1 = com.github.catvod.spider.merge.c0.c.a(r1)
            r2 = 1
            if (r0 >= r1) goto L1f
            com.github.catvod.spider.merge.c0.c r0 = r4.b
            java.lang.String[] r1 = r0.d
            int r3 = r4.a
            r1 = r1[r3]
            boolean r0 = com.github.catvod.spider.merge.c0.c.b(r0, r1)
            if (r0 == 0) goto L1f
            int r0 = r4.a
            int r0 = r0 + r2
            r4.a = r0
            goto L0
        L1f:
            int r0 = r4.a
            com.github.catvod.spider.merge.c0.c r1 = r4.b
            int r1 = com.github.catvod.spider.merge.c0.c.a(r1)
            if (r0 >= r1) goto L2a
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c0.b.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final a next() {
        c cVar = this.b;
        String[] strArr = cVar.d;
        int i = this.a;
        a aVar = new a(strArr[i], cVar.e[i], cVar);
        this.a++;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c cVar = this.b;
        int i = this.a - 1;
        this.a = i;
        cVar.v(i);
    }
}
