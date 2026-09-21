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

final class g
extends c<Boolean>
implements RandomAccess {
    private static final boolean[] d;
    private boolean[] b;
    private int c;

    static {
        boolean[] blArray = new boolean[]{};
        d = blArray;
        new g(blArray, 0, false);
    }

    g() {
        this(d, 0, true);
    }

    private g(boolean[] blArray, int n2, boolean bl) {
        super(bl);
        this.b = blArray;
        this.c = n2;
    }

    private void d(int n2) {
        if (n2 >= 0 && n2 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n2));
    }

    private String g(int n2) {
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
        boolean bl = (Boolean)object;
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            object = this.b;
            if (n3 < ((Object)object).length) {
                System.arraycopy(object, n2, object, n2 + 1, n3 - n2);
            } else {
                object = new boolean[Math.max(((Object)object).length * 3 / 2 + 1, 10)];
                System.arraycopy(this.b, 0, object, 0, n2);
                System.arraycopy(this.b, n2, object, n2 + 1, this.c - n2);
                this.b = (boolean[])object;
            }
            this.b[n2] = bl;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.c((Boolean)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Boolean> g2) {
        this.a();
        Object[] objectArray = N.b;
        Objects.requireNonNull(g2);
        if (!(g2 instanceof g)) {
            return super.addAll(g2);
        }
        g2 = g2;
        int n2 = g2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            objectArray = this.b;
            if ((n2 = n3 + n2) > objectArray.length) {
                this.b = Arrays.copyOf((boolean[])objectArray, n2);
            }
            System.arraycopy(g2.b, 0, this.b, this.c, g2.c);
            this.c = n2;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(boolean bl) {
        this.a();
        int n2 = this.c;
        boolean[] blArray = this.b;
        if (n2 == blArray.length) {
            blArray = new boolean[Math.max(blArray.length * 3 / 2 + 1, 10)];
            System.arraycopy(this.b, 0, blArray, 0, this.c);
            this.b = blArray;
        }
        blArray = this.b;
        n2 = this.c;
        this.c = n2 + 1;
        blArray[n2] = bl;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            boolean[] blArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new g(blArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return super.equals(object);
        }
        object = (g)object;
        if (this.c != ((g)object).c) {
            return false;
        }
        object = ((g)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public final boolean f(int n2) {
        this.d(n2);
        return this.b[n2];
    }

    @Override
    public final Object get(int n2) {
        return this.f(n2);
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + N.a(this.b[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        boolean bl = (Boolean)object;
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != bl) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Object remove(int n2) {
        this.a();
        this.d(n2);
        boolean[] blArray = this.b;
        boolean bl = blArray[n2];
        int n3 = this.c;
        if (n2 < n3 - 1) {
            System.arraycopy(blArray, n2 + 1, blArray, n2, n3 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return bl;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.a();
        if (n3 >= n2) {
            boolean[] blArray = this.b;
            System.arraycopy(blArray, n3, blArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final Object set(int n2, Object object) {
        boolean bl = (Boolean)object;
        this.a();
        this.d(n2);
        object = this.b;
        Object object2 = object[n2];
        object[n2] = bl;
        return (boolean)object2;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

