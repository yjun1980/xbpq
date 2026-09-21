package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.m.AbstractC0190c;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z<V> extends AbstractC0220t<Object, V> {
    private y r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(AbstractC0190c abstractC0190c, Callable callable) {
        super(abstractC0190c);
        this.r = new y(this, callable);
        J();
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0220t
    final void F() {
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0220t
    final void H() {
        y yVar = this.r;
        if (yVar != null) {
            yVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.n.AbstractC0220t
    public final void K(EnumC0219s enumC0219s) {
        super.K(enumC0219s);
        if (enumC0219s == EnumC0219s.c) {
            this.r = null;
        }
    }

    @Override // com.github.catvod.spider.merge.n.AbstractC0216o
    protected final void q() {
        y yVar = this.r;
        if (yVar != null) {
            yVar.c();
        }
    }
}
