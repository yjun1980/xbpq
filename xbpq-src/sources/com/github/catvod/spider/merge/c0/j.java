package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.e0.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements O {
    final /* synthetic */ StringBuilder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(StringBuilder sb) {
        this.a = sb;
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void a(r rVar, int i) {
        F f;
        if (rVar instanceof u) {
            l.N(this.a, (u) rVar);
            return;
        }
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            if (this.a.length() > 0) {
                if (!lVar.a0()) {
                    f = lVar.f;
                    if (!f.b().equals(cYh.d("0522"))) {
                        return;
                    }
                }
                if (u.M(this.a)) {
                    return;
                }
                this.a.append(' ');
            }
        }
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void b(r rVar, int i) {
        if ((rVar instanceof l) && ((l) rVar).a0() && (rVar.s() instanceof u) && !u.M(this.a)) {
            this.a.append(' ');
        }
    }
}
