/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class X
extends c<Long>
implements RandomAccess {
    private static final long[] d;
    private long[] b;
    private int c;

    static {
        long[] lArray = new long[]{};
        d = lArray;
        new X(lArray, 0, false);
    }

    X() {
        this(d, 0, true);
    }

    private X(long[] lArray, int n2, boolean bl) {
        super(bl);
        this.b = lArray;
        this.c = n2;
    }

    private void f(int n2) {
        if (n2 >= 0 && n2 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.j(n2));
    }

    private static int i(int n2) {
        return Math.max(n2 * 3 / 2 + 1, 10);
    }

    private String j(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    @Override
    public final void add(int n2, Object object) {
        int n3;
        long l2 = (Long)object;
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            object = this.b;
            if (n3 < ((Object)object).length) {
                System.arraycopy(object, n2, object, n2 + 1, n3 - n2);
            } else {
                object = new long[X.i(((Object)object).length)];
                System.arraycopy(this.b, 0, object, 0, n2);
                System.arraycopy(this.b, n2, object, n2 + 1, this.c - n2);
                this.b = (long[])object;
            }
            this.b[n2] = l2;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.j(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.c((Long)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Long> object) {
        this.a();
        Object object2 = N.b;
        Objects.requireNonNull(object);
        if (!(object instanceof X)) {
            return super.addAll(object);
        }
        object2 = (X)object;
        int n2 = object2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.b;
            if ((n3 += n2) > ((Object)object).length) {
                this.b = Arrays.copyOf((long[])object, n3);
            }
            System.arraycopy(object2.b, 0, this.b, this.c, object2.c);
            this.c = n3;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(long l2) {
        this.a();
        int n2 = this.c;
        long[] lArray = this.b;
        if (n2 == lArray.length) {
            lArray = new long[X.i(lArray.length)];
            System.arraycopy(this.b, 0, lArray, 0, this.c);
            this.b = lArray;
        }
        lArray = this.b;
        n2 = this.c;
        this.c = n2 + 1;
        lArray[n2] = l2;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    final void d(int n2) {
        long[] lArray = this.b;
        if (n2 <= lArray.length) {
            return;
        }
        if (lArray.length == 0) {
            this.b = new long[Math.max(n2, 10)];
            return;
        }
        int n3 = lArray.length;
        while (n3 < n2) {
            n3 = X.i(n3);
        }
        this.b = Arrays.copyOf(this.b, n3);
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            long[] lArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new X(lArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof X)) {
            return super.equals(object);
        }
        object = (X)object;
        if (this.c != ((X)object).c) {
            return false;
        }
        object = ((X)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public final long g(int n2) {
        this.f(n2);
        return this.b[n2];
    }

    @Override
    public final Object get(int n2) {
        return this.g(n2);
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + N.b(this.b[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l2 = (Long)object;
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        this.f(n2);
        long[] lArray = this.b;
        long l2 = lArray[n2];
        int n3 = this.c;
        if (n2 < n3 - 1) {
            System.arraycopy(lArray, n2 + 1, lArray, n2, n3 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return l2;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        if (n3 >= n2) {
            long[] lArray = this.b;
            System.arraycopy(lArray, n3, lArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final Object set(int n2, Object object) {
        long l2 = (Long)object;
        this.a();
        this.f(n2);
        object = this.b;
        Object object2 = object[n2];
        object[n2] = l2;
        return (long)object2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

