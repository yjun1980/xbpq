package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121e extends AbstractC0122f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0121e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0121e(N... nArr) {
        List asList = Arrays.asList(nArr);
        if (this.b > 1) {
            this.a.add(new C0120d(asList));
        } else {
            this.a.addAll(asList);
        }
        b();
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        for (int i = 0; i < this.b; i++) {
            if (this.a.get(i).a(lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.b0.b.e(this.a, cYh.d("4B70"));
    }
}
