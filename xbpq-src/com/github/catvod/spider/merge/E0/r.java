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

final class r
extends c<Double>
implements RandomAccess {
    private static final double[] d;
    private double[] b;
    private int c;

    static {
        double[] dArray = new double[]{};
        d = dArray;
        new r(dArray, 0, false);
    }

    r() {
        this(d, 0, true);
    }

    private r(double[] dArray, int n2, boolean bl) {
        super(bl);
        this.b = dArray;
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
        double d2 = (Double)object;
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            object = this.b;
            if (n3 < ((Object)object).length) {
                System.arraycopy(object, n2, object, n2 + 1, n3 - n2);
            } else {
                object = new double[r.i(((Object)object).length)];
                System.arraycopy(this.b, 0, object, 0, n2);
                System.arraycopy(this.b, n2, object, n2 + 1, this.c - n2);
                this.b = (double[])object;
            }
            this.b[n2] = d2;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.j(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.c((Double)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Double> object) {
        this.a();
        Object object2 = N.b;
        Objects.requireNonNull(object);
        if (!(object instanceof r)) {
            return super.addAll(object);
        }
        object2 = (r)object;
        int n2 = object2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.b;
            if ((n3 += n2) > ((Object)object).length) {
                this.b = Arrays.copyOf((double[])object, n3);
            }
            System.arraycopy(object2.b, 0, this.b, this.c, object2.c);
            this.c = n3;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(double d2) {
        this.a();
        int n2 = this.c;
        double[] dArray = this.b;
        if (n2 == dArray.length) {
            dArray = new double[r.i(dArray.length)];
            System.arraycopy(this.b, 0, dArray, 0, this.c);
            this.b = dArray;
        }
        dArray = this.b;
        n2 = this.c;
        this.c = n2 + 1;
        dArray[n2] = d2;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    final void d(int n2) {
        double[] dArray = this.b;
        if (n2 <= dArray.length) {
            return;
        }
        if (dArray.length == 0) {
            this.b = new double[Math.max(n2, 10)];
            return;
        }
        int n3 = dArray.length;
        while (n3 < n2) {
            n3 = r.i(n3);
        }
        this.b = Arrays.copyOf(this.b, n3);
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            double[] dArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new r(dArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return super.equals(object);
        }
        object = (r)object;
        if (this.c != ((r)object).c) {
            return false;
        }
        object = ((r)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (Double.doubleToLongBits(this.b[i2]) == Double.doubleToLongBits((double)object[i2])) continue;
            return false;
        }
        return true;
    }

    public final double g(int n2) {
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
            n2 = n2 * 31 + N.b(Double.doubleToLongBits(this.b[i2]));
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Double)) {
            return -1;
        }
        double d2 = (Double)object;
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != d2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        this.f(n2);
        double[] dArray = this.b;
        double d2 = dArray[n2];
        int n3 = this.c;
        if (n2 < n3 - 1) {
            System.arraycopy(dArray, n2 + 1, dArray, n2, n3 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return d2;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        if (n3 >= n2) {
            double[] dArray = this.b;
            System.arraycopy(dArray, n3, dArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final Object set(int n2, Object object) {
        double d2 = (Double)object;
        this.a();
        this.f(n2);
        object = this.b;
        Object object2 = object[n2];
        object[n2] = d2;
        return (double)object2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

