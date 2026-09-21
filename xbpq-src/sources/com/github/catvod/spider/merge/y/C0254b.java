package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0254b<T> implements Collection<T> {
    private final T[] c;
    private final boolean d;

    public C0254b(T[] tArr, boolean z) {
        com.github.catvod.spider.merge.E.f.e(tArr, cYh.d("11312D243229"));
        this.c = tArr;
        this.d = z;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        T[] tArr = this.c;
        com.github.catvod.spider.merge.E.f.e(tArr, cYh.d("5B2429382464"));
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (com.github.catvod.spider.merge.E.f.a(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        com.github.catvod.spider.merge.E.f.e(collection, cYh.d("023C243C32341323"));
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return com.github.catvod.spider.merge.E.b.a(this.c);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.c;
        boolean z = this.d;
        com.github.catvod.spider.merge.E.f.e(tArr, cYh.d("5B2429382464"));
        if (z && com.github.catvod.spider.merge.E.f.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        com.github.catvod.spider.merge.E.f.d(copyOf, cYh.d("043F3128183C4F242938247647242938247414393B347B7A262233302E66263E386E69605D332D302429493A20273673"));
        return copyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.github.catvod.spider.merge.E.f.e(tArr, cYh.d("062233302E"));
        return (T[]) com.github.catvod.spider.merge.E.c.b(this, tArr);
    }
}
