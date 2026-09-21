package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0105x extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0105x() {
        super(cYh.d("33353925"), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.A
    public final boolean d(O o, C0062b c0062b) {
        if (o.a()) {
            c0062b.E((H) o);
            return true;
        }
        if (o.d()) {
            c0062b.n(this);
            c0062b.U();
            c0062b.j0(c0062b.T());
            return c0062b.c(o);
        }
        if (!o.e()) {
            return true;
        }
        c0062b.U();
        c0062b.j0(c0062b.T());
        return true;
    }
}
