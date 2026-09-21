package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.C0179m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j<E> extends f<E> {
    static final f<Object> h = new j(new Object[0], 0);
    final transient Object[] f;
    private final transient int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Object[] objArr, int i) {
        this.f = objArr;
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.m.f, com.github.catvod.spider.merge.m.AbstractC0190c
    final int a(Object[] objArr) {
        System.arraycopy(this.f, 0, objArr, 0, this.g);
        return this.g + 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final Object[] b() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    final int c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        C0179m.c(i, this.g);
        E e = (E) this.f[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
