/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.c;
import com.github.catvod.spider.merge.q.e;
import com.github.catvod.spider.merge.q.j;
import com.github.catvod.spider.merge.q.m;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class d<E>
implements Collection<E>,
Set<E> {
    private static final int[] e = new int[0];
    private static final Object[] f = new Object[0];
    private static Object[] g;
    private static int h;
    private static Object[] i;
    private static int j;
    private int[] a;
    Object[] b;
    int c;
    private m<E, E> d;

    public d() {
        this(0);
    }

    public d(int n2) {
        if (n2 == 0) {
            this.a = e;
            this.b = f;
        } else {
            this.a(n2);
        }
        this.c = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2) {
        if (n2 == 8) {
            synchronized (d.class) {
                Object[] objectArray = i;
                if (objectArray != null) {
                    this.b = objectArray;
                    i = (Object[])objectArray[0];
                    this.a = (int[])objectArray[1];
                    objectArray[1] = null;
                    objectArray[0] = null;
                    --j;
                    return;
                }
            }
        } else if (n2 == 4) {
            synchronized (d.class) {
                Object[] objectArray = g;
                if (objectArray != null) {
                    this.b = objectArray;
                    g = (Object[])objectArray[0];
                    this.a = (int[])objectArray[1];
                    objectArray[1] = null;
                    objectArray[0] = null;
                    --h;
                    return;
                }
            }
        }
        this.a = new int[n2];
        this.b = new Object[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(int[] nArray, Object[] objectArray, int n2) {
        if (nArray.length == 8) {
            synchronized (d.class) {
                if (j >= 10) return;
                objectArray[0] = i;
                objectArray[1] = nArray;
                --n2;
                while (true) {
                    if (n2 < 2) {
                        i = objectArray;
                        ++j;
                        return;
                    }
                    objectArray[n2] = null;
                    --n2;
                }
            }
        }
        if (nArray.length != 4) return;
        synchronized (d.class) {
            if (h >= 10) return;
            objectArray[0] = g;
            objectArray[1] = nArray;
            --n2;
            while (true) {
                if (n2 < 2) {
                    g = objectArray;
                    ++h;
                    return;
                }
                objectArray[n2] = null;
                --n2;
            }
        }
    }

    private int d(Object object, int n2) {
        int n3;
        int n4 = this.c;
        if (n4 == 0) {
            return -1;
        }
        int n5 = com.github.catvod.spider.merge.q.e.a(this.a, n4, n2);
        if (n5 < 0) {
            return n5;
        }
        if (object.equals(this.b[n5])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && this.a[n3] == n2; ++n3) {
            if (!object.equals(this.b[n3])) continue;
            return n3;
        }
        for (n4 = n5 - 1; n4 >= 0 && this.a[n4] == n2; --n4) {
            if (!object.equals(this.b[n4])) continue;
            return n4;
        }
        return ~n3;
    }

    private int f() {
        int n2;
        int n3 = this.c;
        if (n3 == 0) {
            return -1;
        }
        int n4 = com.github.catvod.spider.merge.q.e.a(this.a, n3, 0);
        if (n4 < 0) {
            return n4;
        }
        if (this.b[n4] == null) {
            return n4;
        }
        for (n2 = n4 + 1; n2 < n3 && this.a[n2] == 0; ++n2) {
            if (this.b[n2] != null) continue;
            return n2;
        }
        --n4;
        while (n4 >= 0 && this.a[n4] == 0) {
            if (this.b[n4] == null) {
                return n4;
            }
            --n4;
        }
        return ~n2;
    }

    @Override
    public final boolean add(E e2) {
        Object[] objectArray;
        int n2;
        int n3;
        if (e2 == null) {
            n3 = this.f();
            n2 = 0;
        } else {
            n2 = e2.hashCode();
            n3 = this.d(e2, n2);
        }
        if (n3 >= 0) {
            return false;
        }
        int n4 = ~n3;
        int n5 = this.c;
        int[] nArray = this.a;
        if (n5 >= nArray.length) {
            n3 = 4;
            if (n5 >= 8) {
                n3 = (n5 >> 1) + n5;
            } else if (n5 >= 4) {
                n3 = 8;
            }
            objectArray = this.b;
            this.a(n3);
            int[] nArray2 = this.a;
            if (nArray2.length > 0) {
                System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
                System.arraycopy(objectArray, 0, this.b, 0, objectArray.length);
            }
            com.github.catvod.spider.merge.q.d.c(nArray, objectArray, this.c);
        }
        if (n4 < (n5 = this.c)) {
            objectArray = this.a;
            n3 = n4 + 1;
            System.arraycopy(objectArray, n4, objectArray, n3, n5 - n4);
            objectArray = this.b;
            System.arraycopy(objectArray, n4, objectArray, n3, this.c - n4);
        }
        this.a[n4] = n2;
        this.b[n4] = e2;
        ++this.c;
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends E> object) {
        int n2 = this.c;
        int n3 = object.size() + n2;
        int[] nArray = this.a;
        n2 = nArray.length;
        boolean bl = false;
        if (n2 < n3) {
            Object[] objectArray = this.b;
            this.a(n3);
            n2 = this.c;
            if (n2 > 0) {
                System.arraycopy(nArray, 0, this.a, 0, n2);
                System.arraycopy(objectArray, 0, this.b, 0, this.c);
            }
            com.github.catvod.spider.merge.q.d.c(nArray, objectArray, this.c);
        }
        object = object.iterator();
        while (object.hasNext()) {
            bl |= this.add(object.next());
        }
        return bl;
    }

    @Override
    public final void clear() {
        int n2 = this.c;
        if (n2 != 0) {
            com.github.catvod.spider.merge.q.d.c(this.a, this.b, n2);
            this.a = e;
            this.b = f;
            this.c = 0;
        }
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) >= 0;
        return bl;
    }

    @Override
    public final boolean containsAll(Collection<?> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        if (this.c != (object = (Set)object).size()) {
            return false;
        }
        int n2 = 0;
        try {
            while (n2 < this.c) {
                boolean bl = object.contains(this.b[n2]);
                if (!bl) {
                    return false;
                }
                ++n2;
            }
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public final E g(int n2) {
        Object[] objectArray = this.b;
        Object object = objectArray[n2];
        int n3 = this.c;
        if (n3 <= 1) {
            com.github.catvod.spider.merge.q.d.c(this.a, objectArray, n3);
            this.a = e;
            this.b = f;
            this.c = 0;
        } else {
            int[] nArray = this.a;
            int n4 = nArray.length;
            int n5 = 8;
            if (n4 > 8 && n3 < nArray.length / 3) {
                if (n3 > 8) {
                    n5 = n3 + (n3 >> 1);
                }
                this.a(n5);
                --this.c;
                if (n2 > 0) {
                    System.arraycopy(nArray, 0, this.a, 0, n2);
                    System.arraycopy(objectArray, 0, this.b, 0, n2);
                }
                if (n2 < (n5 = this.c)) {
                    n3 = n2 + 1;
                    System.arraycopy(nArray, n3, this.a, n2, n5 - n2);
                    System.arraycopy(objectArray, n3, this.b, n2, this.c - n2);
                }
            } else {
                this.c = --n3;
                if (n2 < n3) {
                    n5 = n2 + 1;
                    System.arraycopy(nArray, n5, nArray, n2, n3 - n2);
                    objectArray = this.b;
                    System.arraycopy(objectArray, n5, objectArray, n2, this.c - n2);
                }
                this.b[this.c] = null;
            }
        }
        return (E)object;
    }

    @Override
    public final int hashCode() {
        int[] nArray = this.a;
        int n2 = this.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += nArray[i2];
        }
        return n3;
    }

    public final int indexOf(Object object) {
        int n2 = object == null ? this.f() : this.d(object, object.hashCode());
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.c <= 0;
        return bl;
    }

    @Override
    public final Iterator<E> iterator() {
        if (this.d == null) {
            this.d = new c(this);
        }
        m<E, E> m2 = this.d;
        if (m2.b == null) {
            m2.b = new j(m2);
        }
        return m2.b.iterator();
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            this.g(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection<?> object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.remove(object.next());
        }
        return bl;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        boolean bl = false;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (collection.contains(this.b[i2])) continue;
            this.g(i2);
            bl = true;
        }
        return bl;
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray() {
        int n2 = this.c;
        Object[] objectArray = new Object[n2];
        System.arraycopy(this.b, 0, objectArray, 0, n2);
        return objectArray;
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        Object[] objectArray = TArray;
        if (TArray.length < this.c) {
            objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), this.c);
        }
        System.arraycopy(this.b, 0, objectArray, 0, this.c);
        int n2 = objectArray.length;
        int n3 = this.c;
        if (n2 > n3) {
            objectArray[n3] = null;
        }
        return objectArray;
    }

    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.c * 14);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.c; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.b[i2]) != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Set)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

