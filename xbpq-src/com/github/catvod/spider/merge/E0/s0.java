/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.M;
import com.github.catvod.spider.merge.E0.c;
import java.util.Arrays;
import java.util.RandomAccess;

final class s0<E>
extends c<E>
implements RandomAccess {
    private static final Object[] d;
    private static final s0<Object> e;
    private E[] b;
    private int c;

    static {
        Object[] objectArray = new Object[]{};
        d = objectArray;
        e = new s0<Object>(objectArray, 0, false);
    }

    private s0(E[] EArray, int n2, boolean bl) {
        super(bl);
        this.b = EArray;
        this.c = n2;
    }

    public static <E> s0<E> c() {
        return e;
    }

    private void d(int n2) {
        if (n2 >= 0 && n2 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n2));
    }

    private String f(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    @Override
    public final void add(int n2, E e2) {
        int n3;
        this.a();
        if (n2 >= 0 && n2 <= (n3 = this.c)) {
            Object[] objectArray = this.b;
            if (n3 < objectArray.length) {
                System.arraycopy(objectArray, n2, objectArray, n2 + 1, n3 - n2);
            } else {
                objectArray = new Object[Math.max(objectArray.length * 3 / 2 + 1, 10)];
                System.arraycopy(this.b, 0, objectArray, 0, n2);
                System.arraycopy(this.b, n2, objectArray, n2 + 1, this.c - n2);
                this.b = objectArray;
            }
            this.b[n2] = e2;
            ++this.c;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n2));
    }

    @Override
    public final boolean add(E e2) {
        this.a();
        int n2 = this.c;
        E[] EArray = this.b;
        if (n2 == EArray.length) {
            n2 = Math.max(EArray.length * 3 / 2 + 1, 10);
            this.b = Arrays.copyOf(this.b, n2);
        }
        EArray = this.b;
        n2 = this.c;
        this.c = n2 + 1;
        EArray[n2] = e2;
        ++this.modCount;
        return true;
    }

    @Override
    public final M e(int n2) {
        if (n2 >= this.c) {
            Object[] objectArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new s0<Object>(objectArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final E get(int n2) {
        this.d(n2);
        return this.b[n2];
    }

    @Override
    public final E remove(int n2) {
        this.a();
        this.d(n2);
        E[] EArray = this.b;
        E e2 = EArray[n2];
        int n3 = this.c;
        if (n2 < n3 - 1) {
            System.arraycopy(EArray, n2 + 1, EArray, n2, n3 - n2 - 1);
        }
        --this.c;
        ++this.modCount;
        return e2;
    }

    @Override
    public final E set(int n2, E e2) {
        this.a();
        this.d(n2);
        E[] EArray = this.b;
        E e3 = EArray[n2];
        EArray[n2] = e2;
        ++this.modCount;
        return e3;
    }

    @Override
    public final int size() {
        return this.c;
    }
}

