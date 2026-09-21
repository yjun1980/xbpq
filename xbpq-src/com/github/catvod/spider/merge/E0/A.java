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

final class A
extends c<Float>
implements RandomAccess {
    private static final float[] d;
    private float[] b;
    private int c;

    static {
        float[] fArray = new float[]{};
        d = fArray;
        new A(fArray, 0, false);
    }

    A() {
        this(d, 0, true);
    }

    private A(float[] fArray, int n2, boolean bl) {
        super(bl);
        this.b = fArray;
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
        float f2 = ((Float)object).floatValue();
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            object = this.b;
            if (n3 < ((Object)object).length) {
                System.arraycopy(object, n2, object, n2 + 1, n3 - n2);
            } else {
                object = new float[A.i(((Object)object).length)];
                System.arraycopy(this.b, 0, object, 0, n2);
                System.arraycopy(this.b, n2, object, n2 + 1, this.c - n2);
                this.b = (float[])object;
            }
            this.b[n2] = f2;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.j(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.c(((Float)object).floatValue());
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Float> object) {
        this.a();
        Object object2 = N.b;
        Objects.requireNonNull(object);
        if (!(object instanceof A)) {
            return super.addAll(object);
        }
        object2 = (A)object;
        int n2 = object2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.b;
            if ((n2 = n3 + n2) > ((Object)object).length) {
                this.b = Arrays.copyOf((float[])object, n2);
            }
            System.arraycopy(object2.b, 0, this.b, this.c, object2.c);
            this.c = n2;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(float f2) {
        this.a();
        int n2 = this.c;
        float[] fArray = this.b;
        if (n2 == fArray.length) {
            fArray = new float[A.i(fArray.length)];
            System.arraycopy(this.b, 0, fArray, 0, this.c);
            this.b = fArray;
        }
        fArray = this.b;
        n2 = this.c;
        this.c = n2 + 1;
        fArray[n2] = f2;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    final void d(int n2) {
        float[] fArray = this.b;
        if (n2 <= fArray.length) {
            return;
        }
        if (fArray.length == 0) {
            this.b = new float[Math.max(n2, 10)];
            return;
        }
        int n3 = fArray.length;
        while (n3 < n2) {
            n3 = A.i(n3);
        }
        this.b = Arrays.copyOf(this.b, n3);
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            float[] fArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new A(fArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof A)) {
            return super.equals(object);
        }
        object = (A)object;
        if (this.c != ((A)object).c) {
            return false;
        }
        object = ((A)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (Float.floatToIntBits(this.b[i2]) == Float.floatToIntBits((float)object[i2])) continue;
            return false;
        }
        return true;
    }

    public final float g(int n2) {
        this.f(n2);
        return this.b[n2];
    }

    @Override
    public final Object get(int n2) {
        return Float.valueOf(this.g(n2));
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + Float.floatToIntBits(this.b[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        float f2 = ((Float)object).floatValue();
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        this.f(n2);
        float[] fArray = this.b;
        float f2 = fArray[n2];
        int n3 = this.c;
        if (n2 < n3 - 1) {
            System.arraycopy(fArray, n2 + 1, fArray, n2, n3 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return Float.valueOf(f2);
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        if (n3 >= n2) {
            float[] fArray = this.b;
            System.arraycopy(fArray, n3, fArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final Object set(int n2, Object object) {
        float f2 = ((Float)object).floatValue();
        this.a();
        this.f(n2);
        object = this.b;
        Object object2 = object[n2];
        object[n2] = f2;
        return Float.valueOf((float)object2);
    }

    @Override
    public final int size() {
        return this.c;
    }
}

