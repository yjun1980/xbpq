/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

final class b<T>
implements Collection<T> {
    private final T[] c;
    private final boolean d;

    public b(T[] TArray, boolean bl) {
        f.e(TArray, cYh.d("11312D243229"));
        this.c = TArray;
        this.d = bl;
    }

    @Override
    public final boolean add(T t2) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean contains(Object object) {
        int n2;
        boolean bl;
        block7: {
            T[] TArray = this.c;
            f.e(TArray, cYh.d("5B2429382464"));
            bl = false;
            if (object == null) {
                int n3 = TArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    if (TArray[n2] != null) {
                        continue;
                    }
                    break block7;
                }
            } else {
                int n4 = TArray.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    if (!f.a(object, TArray[n2])) {
                        continue;
                    }
                    break block7;
                }
            }
            n2 = -1;
        }
        if (n2 >= 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public final boolean containsAll(Collection<? extends Object> object) {
        boolean bl;
        block3: {
            f.e(object, cYh.d("023C243C32341323"));
            bl = object.isEmpty();
            boolean bl2 = true;
            if (bl) {
                bl = bl2;
            } else {
                object = object.iterator();
                do {
                    bl = bl2;
                    if (!object.hasNext()) break block3;
                } while (this.contains(object.next()));
                bl = false;
            }
        }
        return bl;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.c.length == 0;
        return bl;
    }

    @Override
    public final Iterator<T> iterator() {
        return com.github.catvod.spider.merge.E.b.a(this.c);
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException(cYh.d("28202423362E0E3F2F713E29473E2E2577291220313E252E023461373828472224303377083E2D287739083C2D34342E0E3F2F"));
    }

    @Override
    public final int size() {
        return this.c.length;
    }

    @Override
    public final Object[] toArray() {
        Object[] objectArray = this.c;
        boolean bl = this.d;
        f.e(objectArray, cYh.d("5B2429382464"));
        if (!bl || !f.a(objectArray.getClass(), Object[].class)) {
            objectArray = Arrays.copyOf(objectArray, objectArray.length, Object[].class);
            f.d(objectArray, cYh.d("043F3128183C4F242938247647242938247414393B347B7A262233302E66263E386E69605D332D302429493A20273673"));
        }
        return objectArray;
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        f.e(TArray, cYh.d("062233302E"));
        return com.github.catvod.spider.merge.E.c.b(this, TArray);
    }
}

