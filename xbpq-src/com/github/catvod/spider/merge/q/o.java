/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.e;

public final class o<E>
implements Cloneable {
    private static final Object d = new Object();
    private int[] a;
    private Object[] b;
    private int c;

    public o() {
        int n2 = e.d(10);
        this.a = new int[n2];
        this.b = new Object[n2];
    }

    public final void a(int n2, E e2) {
        int n3 = this.c;
        if (n3 != 0 && n2 <= this.a[n3 - 1]) {
            this.d(n2, e2);
            return;
        }
        if (n3 >= this.a.length) {
            int n4 = e.d(n3 + 1);
            int[] nArray = new int[n4];
            Object[] objectArray = new Object[n4];
            Object[] objectArray2 = this.a;
            System.arraycopy(objectArray2, 0, nArray, 0, objectArray2.length);
            objectArray2 = this.b;
            System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
            this.a = nArray;
            this.b = objectArray;
        }
        this.a[n3] = n2;
        this.b[n3] = e2;
        this.c = n3 + 1;
    }

    public final o<E> b() {
        try {
            o o2 = (o)super.clone();
            o2.a = (int[])this.a.clone();
            o2.b = (Object[])this.b.clone();
            return o2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public final E c(int n2, E e2) {
        Object[] objectArray;
        if ((n2 = e.a(this.a, this.c, n2)) >= 0 && (objectArray = this.b)[n2] != d) {
            return (E)objectArray[n2];
        }
        return e2;
    }

    public final void d(int n2, E e2) {
        int n3 = e.a(this.a, this.c, n2);
        if (n3 >= 0) {
            this.b[n3] = e2;
        } else {
            Object[] objectArray;
            int n4 = this.c;
            if ((n3 ^= 0xFFFFFFFF) < n4 && (objectArray = this.b)[n3] == d) {
                this.a[n3] = n2;
                objectArray[n3] = e2;
                return;
            }
            if (n4 >= this.a.length) {
                n4 = e.d(n4 + 1);
                int[] nArray = new int[n4];
                objectArray = new Object[n4];
                Object[] objectArray2 = this.a;
                System.arraycopy(objectArray2, 0, nArray, 0, objectArray2.length);
                objectArray2 = this.b;
                System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
                this.a = nArray;
                this.b = objectArray;
            }
            if ((n4 = this.c - n3) != 0) {
                objectArray = this.a;
                int n5 = n3 + 1;
                System.arraycopy(objectArray, n3, objectArray, n5, n4);
                objectArray = this.b;
                System.arraycopy(objectArray, n3, objectArray, n5, this.c - n3);
            }
            this.a[n3] = n2;
            this.b[n3] = e2;
            ++this.c;
        }
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(n2 * 28);
        stringBuilder.append('{');
        for (n2 = 0; n2 < this.c; ++n2) {
            if (n2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.a[n2]);
            stringBuilder.append('=');
            Object object = this.b[n2];
            if (object != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

