package com.github.catvod.spider.merge.n;

import java.util.concurrent.Callable;

/* renamed from: com.github.catvod.spider.merge.n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197G<V> {
    private final com.github.catvod.spider.merge.m.f<M<? extends V>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0197G(com.github.catvod.spider.merge.m.f fVar) {
        this.a = fVar;
    }

    public final M a(Callable callable) {
        return new z(this.a, callable);
    }
}
