/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.a;
import com.github.catvod.spider.merge.xc.f.d;
import com.github.catvod.spider.merge.xc.f.h;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c
implements Collection,
Set {
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;
    public int[] a;
    public Object[] b;
    public int c;
    public a d;

    public c(int n2) {
        if (n2 == 0) {
            this.a = e;
            this.b = f;
        } else {
            this.a(n2);
        }
        this.c = 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int[] nArray, Object[] objectArray, int n2) {
        block10: {
            if (nArray.length != 8) break block10;
            synchronized (c.class) {
                Throwable throwable2;
                block11: {
                    try {
                        if (j >= 10) return;
                        objectArray[0] = i;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    objectArray[1] = nArray;
                    --n2;
                    while (n2 >= 2) {
                        objectArray[n2] = null;
                        --n2;
                    }
                    {
                        i = objectArray;
                        ++j;
                        return;
                    }
                }
                throw throwable2;
            }
        }
        if (nArray.length != 4) return;
        synchronized (c.class) {
            Throwable throwable3;
            block12: {
                try {
                    if (h >= 10) return;
                    objectArray[0] = g;
                }
                catch (Throwable throwable3) {
                    break block12;
                }
                objectArray[1] = nArray;
                --n2;
                while (n2 >= 2) {
                    objectArray[n2] = null;
                    --n2;
                }
                {
                    g = objectArray;
                    ++h;
                    return;
                }
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n2) {
        block14: {
            block13: {
                if (n2 != 8) break block13;
                synchronized (c.class) {
                    Throwable throwable2;
                    block10: {
                        block9: {
                            try {
                                Object[] objectArray = i;
                                if (objectArray == null) break block9;
                                this.b = objectArray;
                                i = (Object[])objectArray[0];
                                this.a = (int[])objectArray[1];
                                objectArray[1] = null;
                                objectArray[0] = null;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                            --j;
                            return;
                        }
                        break block14;
                    }
                    throw throwable2;
                }
            }
            if (n2 == 4) {
                synchronized (c.class) {
                    Throwable throwable3;
                    block12: {
                        block11: {
                            try {
                                Object[] objectArray = g;
                                if (objectArray == null) break block11;
                                this.b = objectArray;
                                g = (Object[])objectArray[0];
                                this.a = (int[])objectArray[1];
                                objectArray[1] = null;
                                objectArray[0] = null;
                            }
                            catch (Throwable throwable3) {
                                break block12;
                            }
                            --h;
                            return;
                        }
                        break block14;
                    }
                    throw throwable3;
                }
            }
        }
        this.a = new int[n2];
        this.b = new Object[n2];
    }

    @Override
    public final boolean add(Object object) {
        int n2;
        int n3;
        if (object == null) {
            n3 = this.d();
            n2 = 0;
        } else {
            n2 = object.hashCode();
            n3 = this.c(n2, object);
        }
        if (n3 >= 0) {
            return false;
        }
        int n4 = ~n3;
        int n5 = this.c;
        Object[] objectArray = this.a;
        if (n5 >= objectArray.length) {
            n3 = 8;
            if (n5 >= 8) {
                n3 = (n5 >> 1) + n5;
            } else if (n5 < 4) {
                n3 = 4;
            }
            Object[] objectArray2 = this.b;
            this.a(n3);
            int[] nArray = this.a;
            if (nArray.length > 0) {
                System.arraycopy(objectArray, 0, nArray, 0, objectArray.length);
                System.arraycopy(objectArray2, 0, this.b, 0, objectArray2.length);
            }
            com.github.catvod.spider.merge.xc.f.c.b(objectArray, objectArray2, this.c);
        }
        if (n4 < (n3 = this.c)) {
            objectArray = this.a;
            n5 = n4 + 1;
            System.arraycopy(objectArray, n4, objectArray, n5, n3 - n4);
            objectArray = this.b;
            System.arraycopy(objectArray, n4, objectArray, n5, this.c - n4);
        }
        this.a[n4] = n2;
        this.b[n4] = object;
        ++this.c;
        return true;
    }

    @Override
    public final boolean addAll(Collection object) {
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
            com.github.catvod.spider.merge.xc.f.c.b(nArray, objectArray, this.c);
        }
        object = object.iterator();
        while (object.hasNext()) {
            bl |= this.add(object.next());
        }
        return bl;
    }

    public final int c(int n2, Object object) {
        int n3;
        int n4 = this.c;
        if (n4 == 0) {
            return -1;
        }
        int n5 = com.github.catvod.spider.merge.xc.f.d.a(this.a, n4, n2);
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

    @Override
    public final void clear() {
        int n2 = this.c;
        if (n2 != 0) {
            com.github.catvod.spider.merge.xc.f.c.b(this.a, this.b, n2);
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
    public final boolean containsAll(Collection object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    public final int d() {
        int n2;
        int n3 = this.c;
        if (n3 == 0) {
            return -1;
        }
        int n4 = com.github.catvod.spider.merge.xc.f.d.a(this.a, n3, 0);
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
        for (n3 = n4 - 1; n3 >= 0 && this.a[n3] == 0; --n3) {
            if (this.b[n3] != null) continue;
            return n3;
        }
        return ~n2;
    }

    public final void e(int n2) {
        Object[] objectArray = this.b;
        Object object = objectArray[n2];
        int n3 = this.c;
        if (n3 <= 1) {
            com.github.catvod.spider.merge.xc.f.c.b(this.a, objectArray, n3);
            this.a = e;
            this.b = f;
            this.c = 0;
        } else {
            object = this.a;
            int n4 = ((Object)object).length;
            int n5 = 8;
            if (n4 > 8 && n3 < ((Object)object).length / 3) {
                if (n3 > 8) {
                    n5 = n3 + (n3 >> 1);
                }
                this.a(n5);
                --this.c;
                if (n2 > 0) {
                    System.arraycopy(object, 0, this.a, 0, n2);
                    System.arraycopy(objectArray, 0, this.b, 0, n2);
                }
                if (n2 < (n5 = this.c)) {
                    n3 = n2 + 1;
                    System.arraycopy(object, n3, this.a, n2, n5 - n2);
                    System.arraycopy(objectArray, n3, this.b, n2, this.c - n2);
                }
            } else {
                this.c = --n3;
                if (n2 < n3) {
                    n5 = n2 + 1;
                    System.arraycopy(object, n5, object, n2, n3 - n2);
                    objectArray = this.b;
                    System.arraycopy(objectArray, n5, objectArray, n2, this.c - n2);
                }
                this.b[this.c] = null;
            }
        }
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
        int n2 = object == null ? this.d() : this.c(object.hashCode(), object);
        return n2;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.c <= 0;
        return bl;
    }

    @Override
    public final Iterator iterator() {
        if (this.d == null) {
            this.d = new a(1, this);
        }
        a a2 = this.d;
        if (a2.b == null) {
            a2.b = new h(a2, 1);
        }
        return a2.b.iterator();
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            this.e(n2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.remove(object.next());
        }
        return bl;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        boolean bl = false;
        for (int i2 = this.c - 1; i2 >= 0; --i2) {
            if (collection.contains(this.b[i2])) continue;
            this.e(i2);
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
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2 = objectArray;
        if (objectArray.length < this.c) {
            objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), this.c);
        }
        System.arraycopy(this.b, 0, objectArray2, 0, this.c);
        int n2 = objectArray2.length;
        int n3 = this.c;
        if (n2 > n3) {
            objectArray2[n3] = null;
        }
        return objectArray2;
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

