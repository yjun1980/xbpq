package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public enum e1 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e1() {
        super(cYh.d("371C0018190E220815"), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d0.h1
    public final void g(Q q, C0060a c0060a) {
        char s = c0060a.s();
        if (s == 0) {
            q.q(this);
            c0060a.a();
            q.i((char) 65533);
        } else if (s != 65535) {
            q.k(c0060a.o((char) 0));
        } else {
            q.j(new K());
        }
    }
}
