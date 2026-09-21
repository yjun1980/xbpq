package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.l.C0179m;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends f<Object> {
    final transient int f;
    final transient int g;
    final /* synthetic */ f h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, int i, int i2) {
        this.h = fVar;
        this.f = i;
        this.g = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final Object[] b() {
        return this.h.b();
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    final int c() {
        return this.h.d() + this.f + this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final int d() {
        return this.h.d() + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0179m.c(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // com.github.catvod.spider.merge.m.f, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final f<Object> subList(int i, int i2) {
        C0179m.e(i, i2, this.g);
        f fVar = this.h;
        int i3 = this.f;
        return fVar.subList(i + i3, i2 + i3);
    }

    @Override // com.github.catvod.spider.merge.m.f, com.github.catvod.spider.merge.m.AbstractC0190c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.m.f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.m.f, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
