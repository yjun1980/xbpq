package com.github.catvod.spider.merge.m;

/* loaded from: classes.dex */
final class l<E> extends g<E> {
    final transient E e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(E e) {
        this.e = e;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    final int a(Object[] objArr) {
        objArr[0] = this.e;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.e.equals(obj);
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final m<E> iterator() {
        return new h(this.e);
    }

    @Override // com.github.catvod.spider.merge.m.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.e.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
