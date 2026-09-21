package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.d0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0065c0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0065c0() {
        super(cYh.d("23313530"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.d0.h1
    final void g(Q q, C0060a c0060a) {
        h1 h1Var;
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            q.i(c0060a.e());
            return;
        }
        if (s == '&') {
            h1Var = h1.d;
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
            h1Var = h1.j;
        }
        q.a(h1Var);
    }
}
