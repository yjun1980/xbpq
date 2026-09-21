package com.github.catvod.spider.merge.m;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class h extends m<Object> {
    boolean a;
    final /* synthetic */ Object b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
