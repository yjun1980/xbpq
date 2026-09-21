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

final class J
extends c<Integer>
implements RandomAccess {
    private static final int[] d;
    private int[] b;
    private int c;

    static {
        int[] nArray = new int[]{};
        d = nArray;
        new J(nArray, 0, false);
    }

    J() {
        this(d, 0, true);
    }

    private J(int[] nArray, int n2, boolean bl) {
        super(bl);
        this.b = nArray;
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
        int n4 = (Integer)object;
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            object = this.b;
            if (n3 < ((Object)object).length) {
                System.arraycopy(object, n2, object, n2 + 1, n3 - n2);
            } else {
                object = new int[J.i(((Object)object).length)];
                System.arraycopy(this.b, 0, object, 0, n2);
                System.arraycopy(this.b, n2, object, n2 + 1, this.c - n2);
                this.b = (int[])object;
            }
            this.b[n2] = n4;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.j(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.c((Integer)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Integer> object) {
        this.a();
        Object object2 = N.b;
        Objects.requireNonNull(object);
        if (!(object instanceof J)) {
            return super.addAll(object);
        }
        object2 = (J)object;
        int n2 = object2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.b;
            if ((n3 += n2) > ((Object)object).length) {
                this.b = Arrays.copyOf((int[])object, n3);
            }
            System.arraycopy(object2.b, 0, this.b, this.c, object2.c);
            this.c = n3;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int n2) {
        this.a();
        int n3 = this.c;
        int[] nArray = this.b;
        if (n3 == nArray.length) {
            nArray = new int[J.i(nArray.length)];
            System.arraycopy(this.b, 0, nArray, 0, this.c);
            this.b = nArray;
        }
        nArray = this.b;
        n3 = this.c;
        this.c = n3 + 1;
        nArray[n3] = n2;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    final void d(int n2) {
        int[] nArray = this.b;
        if (n2 <= nArray.length) {
            return;
        }
        if (nArray.length == 0) {
            this.b = new int[Math.max(n2, 10)];
            return;
        }
        int n3 = nArray.length;
        while (n3 < n2) {
            n3 = J.i(n3);
        }
        this.b = Arrays.copyOf(this.b, n3);
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            int[] nArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new J(nArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof J)) {
            return super.equals(object);
        }
        object = (J)object;
        if (this.c != ((J)object).c) {
            return false;
        }
        object = ((J)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public final int g(int n2) {
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
            n2 = n2 * 31 + this.b[i2];
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n2 = (Integer)object;
        int n3 = this.c;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.b[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        this.f(n2);
        int[] nArray = this.b;
        int n3 = nArray[n2];
        int n4 = this.c;
        if (n2 < n4 - 1) {
            System.arraycopy(nArray, n2 + 1, nArray, n2, n4 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return n3;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        if (n3 >= n2) {
            int[] nArray = this.b;
            System.arraycopy(nArray, n3, nArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final Object set(int n2, Object object) {
        int n3 = (Integer)object;
        this.a();
        this.f(n2);
        object = this.b;
        Object object2 = object[n2];
        object[n2] = n3;
        return (int)object2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

