package com.github.catvod.spider.merge.e0;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120d extends AbstractC0122f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0120d(Collection<N> collection) {
        this.a.addAll(collection);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0120d(N... nArr) {
        this(Arrays.asList(nArr));
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (!this.a.get(i).a(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.b0.b.e(this.a, "");
    }
}
