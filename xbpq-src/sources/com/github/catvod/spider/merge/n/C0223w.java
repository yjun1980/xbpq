package com.github.catvod.spider.merge.n;

import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.n.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0223w extends AbstractC0202a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0223w() {
        super((C0221u) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final void d(x xVar, Set set) {
        Set set2;
        synchronized (xVar) {
            set2 = xVar.j;
            if (set2 == null) {
                xVar.j = set;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0202a
    public final int e(x<?> xVar) {
        int y;
        synchronized (xVar) {
            y = x.y(xVar);
        }
        return y;
    }
}
