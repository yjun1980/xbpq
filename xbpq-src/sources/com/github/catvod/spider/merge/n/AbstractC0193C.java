package com.github.catvod.spider.merge.n;

import java.util.concurrent.Future;

/* renamed from: com.github.catvod.spider.merge.n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0193C<V> extends AbstractFutureC0194D<V> {
    private final M<V> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0193C(M<V> m) {
        this.c = m;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0188a
    protected final Object b() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractFutureC0194D
    protected final M<V> c() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.n.AbstractFutureC0194D
    protected final Future d() {
        return this.c;
    }
}
