package com.github.catvod.spider.merge.m;

/* loaded from: classes.dex */
final class k<E> extends g<E> {
    private static final Object[] j;
    static final k<Object> k;
    final transient Object[] e;
    private final transient int f;
    final transient Object[] g;
    private final transient int h;
    private final transient int i;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        k = new k<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.e = objArr;
        this.f = i;
        this.g = objArr2;
        this.h = i2;
        this.i = i3;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    final int a(Object[] objArr) {
        System.arraycopy(this.e, 0, objArr, 0, this.i);
        return this.i + 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final Object[] b() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    final int c() {
        return this.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C0189b.a(obj.hashCode());
        while (true) {
            int i = a & this.h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.m.AbstractC0190c
    public final int d() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.m.AbstractC0190c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final m<E> iterator() {
        return f().listIterator(0);
    }

    @Override // com.github.catvod.spider.merge.m.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.m.g
    final f<E> i() {
        Object[] objArr = this.e;
        int i = this.i;
        int i2 = f.e;
        if (i == 0) {
            return (f<E>) j.h;
        }
        return new j(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }
}
