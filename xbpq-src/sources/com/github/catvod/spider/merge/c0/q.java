package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.O;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements O {
    private final Appendable a;
    private final g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        gVar.e();
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void a(r rVar, int i) {
        try {
            rVar.w(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.e0.O
    public final void b(r rVar, int i) {
        if (rVar.t().equals(cYh.d("4424242923"))) {
            return;
        }
        try {
            rVar.x(this.a, i, this.b);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.a(e);
        }
    }
}
