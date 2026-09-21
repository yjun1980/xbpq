/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.e;

public final class f<E>
implements Cloneable {
    private static final Object e = new Object();
    private boolean a = false;
    private long[] b;
    private Object[] c;
    private int d;

    public f() {
        int n2 = com.github.catvod.spider.merge.q.e.e(10);
        this.b = new long[n2];
        this.c = new Object[n2];
    }

    private void c() {
        int n2 = this.d;
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            int n4 = n3;
            if (object != e) {
                if (i2 != n3) {
                    lArray[n3] = lArray[i2];
                    objectArray[n3] = object;
                    objectArray[i2] = null;
                }
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        this.a = false;
        this.d = n3;
    }

    public final void a(long l2, E e2) {
        int n2 = this.d;
        if (n2 != 0 && l2 <= this.b[n2 - 1]) {
            this.e(l2, e2);
            return;
        }
        if (this.a && n2 >= this.b.length) {
            this.c();
        }
        if ((n2 = this.d) >= this.b.length) {
            int n3 = com.github.catvod.spider.merge.q.e.e(n2 + 1);
            long[] lArray = new long[n3];
            Object[] objectArray = new Object[n3];
            Object[] objectArray2 = this.b;
            System.arraycopy(objectArray2, 0, lArray, 0, objectArray2.length);
            objectArray2 = this.c;
            System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
            this.b = lArray;
            this.c = objectArray;
        }
        this.b[n2] = l2;
        this.c[n2] = e2;
        this.d = n2 + 1;
    }

    public final f<E> b() {
        try {
            f f2 = (f)super.clone();
            f2.b = (long[])this.b.clone();
            f2.c = (Object[])this.c.clone();
            return f2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public final E d(long l2, E e2) {
        Object[] objectArray;
        int n2 = com.github.catvod.spider.merge.q.e.b(this.b, this.d, l2);
        if (n2 >= 0 && (objectArray = this.c)[n2] != e) {
            return (E)objectArray[n2];
        }
        return e2;
    }

    public final void e(long l2, E e2) {
        int n2 = com.github.catvod.spider.merge.q.e.b(this.b, this.d, l2);
        if (n2 >= 0) {
            this.c[n2] = e2;
        } else {
            Object[] objectArray;
            int n3 = ~n2;
            int n4 = this.d;
            if (n3 < n4 && (objectArray = this.c)[n3] == e) {
                this.b[n3] = l2;
                objectArray[n3] = e2;
                return;
            }
            n2 = n3;
            if (this.a) {
                n2 = n3;
                if (n4 >= this.b.length) {
                    this.c();
                    n2 = ~com.github.catvod.spider.merge.q.e.b(this.b, this.d, l2);
                }
            }
            if ((n3 = this.d) >= this.b.length) {
                n3 = com.github.catvod.spider.merge.q.e.e(n3 + 1);
                long[] lArray = new long[n3];
                objectArray = new Object[n3];
                Object[] objectArray2 = this.b;
                System.arraycopy(objectArray2, 0, lArray, 0, objectArray2.length);
                objectArray2 = this.c;
                System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
                this.b = lArray;
                this.c = objectArray;
            }
            if ((n3 = this.d) - n2 != 0) {
                objectArray = this.b;
                n4 = n2 + 1;
                System.arraycopy(objectArray, n2, objectArray, n4, n3 - n2);
                objectArray = this.c;
                System.arraycopy(objectArray, n2, objectArray, n4, this.d - n2);
            }
            this.b[n2] = l2;
            this.c[n2] = e2;
            ++this.d;
        }
    }

    public final void f(long l2) {
        Object object;
        Object[] objectArray;
        Object object2;
        int n2 = com.github.catvod.spider.merge.q.e.b(this.b, this.d, l2);
        if (n2 >= 0 && (object2 = (objectArray = this.c)[n2]) != (object = e)) {
            objectArray[n2] = object;
            this.a = true;
        }
    }

    public final String toString() {
        int n2;
        if (this.a) {
            this.c();
        }
        if ((n2 = this.d) <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(n2 * 28);
        stringBuilder.append('{');
        for (n2 = 0; n2 < this.d; ++n2) {
            Object object;
            if (n2 > 0) {
                stringBuilder.append(", ");
            }
            if (this.a) {
                this.c();
            }
            stringBuilder.append(this.b[n2]);
            stringBuilder.append('=');
            if (this.a) {
                this.c();
            }
            if ((object = this.c[n2]) != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

