package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127k extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C0127k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = C0243a.c(str);
        } else {
            com.github.catvod.spider.merge.N.a.i(str);
            this.b = C0243a.c(str);
        }
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.c0.a> it = lVar2.d().f().iterator();
                while (it.hasNext()) {
                    if (C0243a.c(it.next().a()).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            default:
                return C0243a.c(lVar2.T()).contains(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(cYh.d("3C0E64220A"), this.b);
            default:
                return String.format(cYh.d("5D332E3F233B0E3E3215362E067864227E"), this.b);
        }
    }
}
