package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0108y0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0108y0() {
        super(cYh.d("35332530233B"), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            c0060a.a();
            q.i((char) 65533);
            return;
        }
        if (s == '&') {
            h1Var = h1.f;
        } else {
            if (s != '<') {
                if (s != 65535) {
                    q.k(c0060a.g());
                    return;
                } else {
                    q.j(new K());
                    return;
                }
            }
            h1Var = h1.m;
        }
        q.a(h1Var);
    }
}
