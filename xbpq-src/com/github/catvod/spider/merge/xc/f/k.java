/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.f;

import com.github.catvod.spider.merge.xc.f.b;
import com.github.catvod.spider.merge.xc.f.d;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public int[] a = com.github.catvod.spider.merge.xc.f.d.a;
    public Object[] b = com.github.catvod.spider.merge.xc.f.d.b;
    public int c = 0;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int[] nArray, Object[] objectArray, int n2) {
        block10: {
            if (nArray.length != 8) break block10;
            synchronized (b.class) {
                Throwable throwable2;
                block11: {
                    try {
                        if (g >= 10) return;
                        objectArray[0] = f;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    objectArray[1] = nArray;
                    for (n2 = (n2 << 1) - 1; n2 >= 2; --n2) {
                        objectArray[n2] = null;
                    }
                    {
                        f = objectArray;
                        ++g;
                        return;
                    }
                }
                throw throwable2;
            }
        }
        if (nArray.length != 4) return;
        synchronized (b.class) {
            Throwable throwable3;
            block12: {
                try {
                    if (e >= 10) return;
                    objectArray[0] = d;
                }
                catch (Throwable throwable3) {
                    break block12;
                }
                objectArray[1] = nArray;
                for (n2 = (n2 << 1) - 1; n2 >= 2; --n2) {
                    objectArray[n2] = null;
                }
                {
                    d = objectArray;
                    ++e;
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
                synchronized (b.class) {
                    Throwable throwable2;
                    block10: {
                        block9: {
                            try {
                                Object[] objectArray = f;
                                if (objectArray == null) break block9;
                                this.b = objectArray;
                                f = (Object[])objectArray[0];
                                this.a = (int[])objectArray[1];
                                objectArray[1] = null;
                                objectArray[0] = null;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                            --g;
                            return;
                        }
                        break block14;
                    }
                    throw throwable2;
                }
            }
            if (n2 == 4) {
                synchronized (b.class) {
                    Throwable throwable3;
                    block12: {
                        block11: {
                            try {
                                Object[] objectArray = d;
                                if (objectArray == null) break block11;
                                this.b = objectArray;
                                d = (Object[])objectArray[0];
                                this.a = (int[])objectArray[1];
                                objectArray[1] = null;
                                objectArray[0] = null;
                            }
                            catch (Throwable throwable3) {
                                break block12;
                            }
                            --e;
                            return;
                        }
                        break block14;
                    }
                    throw throwable3;
                }
            }
        }
        this.a = new int[n2];
        this.b = new Object[n2 << 1];
    }

    public final int c(int n2, Object object) {
        int n3;
        int n4;
        int n5;
        block7: {
            n5 = this.c;
            if (n5 == 0) {
                return -1;
            }
            int[] nArray = this.a;
            try {
                n4 = com.github.catvod.spider.merge.xc.f.d.a(nArray, n5, n2);
                if (n4 >= 0) break block7;
                return n4;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                ConcurrentModificationException concurrentModificationException = new ConcurrentModificationException();
                throw concurrentModificationException;
            }
        }
        if (object.equals(this.b[n4 << 1])) {
            return n4;
        }
        for (n3 = n4 + 1; n3 < n5 && this.a[n3] == n2; ++n3) {
            if (!object.equals(this.b[n3 << 1])) continue;
            return n3;
        }
        --n4;
        while (n4 >= 0 && this.a[n4] == n2) {
            if (object.equals(this.b[n4 << 1])) {
                return n4;
            }
            --n4;
        }
        return ~n3;
    }

    public final void clear() {
        int n2 = this.c;
        if (n2 > 0) {
            int[] nArray = this.a;
            Object[] objectArray = this.b;
            this.a = com.github.catvod.spider.merge.xc.f.d.a;
            this.b = com.github.catvod.spider.merge.xc.f.d.b;
            this.c = 0;
            k.b(nArray, objectArray, n2);
        }
        if (this.c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object object) {
        boolean bl = this.d(object) >= 0;
        return bl;
    }

    public final boolean containsValue(Object object) {
        boolean bl = this.f(object) >= 0;
        return bl;
    }

    public final int d(Object object) {
        int n2 = object == null ? this.e() : this.c(object.hashCode(), object);
        return n2;
    }

    public final int e() {
        int n2;
        int n3;
        int n4;
        block7: {
            n4 = this.c;
            if (n4 == 0) {
                return -1;
            }
            int[] nArray = this.a;
            try {
                n3 = com.github.catvod.spider.merge.xc.f.d.a(nArray, n4, 0);
                if (n3 >= 0) break block7;
                return n3;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                ConcurrentModificationException concurrentModificationException = new ConcurrentModificationException();
                throw concurrentModificationException;
            }
        }
        if (this.b[n3 << 1] == null) {
            return n3;
        }
        for (n2 = n3 + 1; n2 < n4 && this.a[n2] == 0; ++n2) {
            if (this.b[n2 << 1] != null) continue;
            return n2;
        }
        --n3;
        while (n3 >= 0 && this.a[n3] == 0) {
            if (this.b[n3 << 1] == null) {
                return n3;
            }
            --n3;
        }
        return ~n2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof k) {
            object = (k)object;
            if (this.c != ((k)object).c) {
                return false;
            }
            int n2 = 0;
            while (true) {
                int n3;
                Object[] objectArray;
                try {
                    if (n2 >= this.c) return true;
                    objectArray = this.b;
                    n3 = n2 << 1;
                }
                catch (ClassCastException | NullPointerException runtimeException) {
                    return false;
                }
                Object object2 = objectArray[n3];
                Object object3 = objectArray[n3 + 1];
                {
                    Object object4 = ((k)object).get(object2);
                    if (object3 == null) {
                        if (object4 != null) return false;
                        if (!((k)object).containsKey(object2)) {
                            return false;
                        }
                    } else {
                        boolean bl = object3.equals(object4);
                        if (!bl) {
                            return false;
                        }
                    }
                    ++n2;
                    continue;
                }
                break;
            }
        }
        if (!(object instanceof Map)) return false;
        if (this.c != (object = (Map)object).size()) {
            return false;
        }
        int n4 = 0;
        while (true) {
            int n5;
            Object[] objectArray;
            try {
                if (n4 >= this.c) return true;
                objectArray = this.b;
                n5 = n4 << 1;
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                return false;
            }
            Object object5 = objectArray[n5];
            Object object6 = objectArray[n5 + 1];
            {
                Object v2 = object.get(object5);
                if (object6 == null) {
                    if (v2 != null) return false;
                    if (!object.containsKey(object5)) {
                        return false;
                    }
                } else {
                    boolean bl = object6.equals(v2);
                    if (!bl) {
                        return false;
                    }
                }
                ++n4;
                continue;
            }
            break;
        }
    }

    public final int f(Object object) {
        int n2 = this.c * 2;
        Object[] objectArray = this.b;
        if (object == null) {
            for (int i2 = 1; i2 < n2; i2 += 2) {
                if (objectArray[i2] != null) continue;
                return i2 >> 1;
            }
        } else {
            for (int i4 = 1; i4 < n2; i4 += 2) {
                if (!object.equals(objectArray[i4])) continue;
                return i4 >> 1;
            }
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object g(int n2) {
        Object[] objectArray = this.b;
        int n3 = n2 << 1;
        Object object = objectArray[n3 + 1];
        int n4 = this.c;
        int n5 = 0;
        if (n4 <= 1) {
            k.b(this.a, objectArray, n4);
            this.a = com.github.catvod.spider.merge.xc.f.d.a;
            this.b = com.github.catvod.spider.merge.xc.f.d.b;
            n2 = n5;
        } else {
            int n6 = n4 - 1;
            int[] nArray = this.a;
            int n7 = nArray.length;
            n5 = 8;
            if (n7 > 8 && n4 < nArray.length / 3) {
                if (n4 > 8) {
                    n5 = n4 + (n4 >> 1);
                }
                this.a(n5);
                if (n4 != this.c) throw new ConcurrentModificationException();
                if (n2 > 0) {
                    System.arraycopy(nArray, 0, this.a, 0, n2);
                    System.arraycopy(objectArray, 0, this.b, 0, n3);
                }
                if (n2 < n6) {
                    n5 = n2 + 1;
                    int[] nArray2 = this.a;
                    n7 = n6 - n2;
                    System.arraycopy(nArray, n5, nArray2, n2, n7);
                    System.arraycopy(objectArray, n5 << 1, this.b, n3, n7 << 1);
                }
            } else {
                if (n2 < n6) {
                    n7 = n2 + 1;
                    n5 = n6 - n2;
                    System.arraycopy(nArray, n7, nArray, n2, n5);
                    objectArray = this.b;
                    System.arraycopy(objectArray, n7 << 1, objectArray, n3, n5 << 1);
                }
                objectArray = this.b;
                n2 = n6 << 1;
                objectArray[n2] = null;
                objectArray[n2 + 1] = null;
            }
            n2 = n6;
        }
        if (n4 != this.c) throw new ConcurrentModificationException();
        this.c = n2;
        return object;
    }

    public final Object get(Object object) {
        int n2 = this.d(object);
        object = n2 >= 0 ? this.b[(n2 << 1) + 1] : null;
        return object;
    }

    public final int hashCode() {
        int[] nArray = this.a;
        Object[] objectArray = this.b;
        int n2 = this.c;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            Object object = objectArray[n3];
            int n6 = nArray[n4];
            int n7 = object == null ? 0 : object.hashCode();
            n5 += n7 ^ n6;
            ++n4;
            n3 += 2;
        }
        return n5;
    }

    public final boolean isEmpty() {
        boolean bl = this.c <= 0;
        return bl;
    }

    public final Object put(Object object, Object object2) {
        Object[] objectArray;
        int n2;
        int n3;
        int n4 = this.c;
        if (object == null) {
            n3 = this.e();
            n2 = 0;
        } else {
            n2 = object.hashCode();
            n3 = this.c(n2, object);
        }
        if (n3 >= 0) {
            n3 = (n3 << 1) + 1;
            Object[] objectArray2 = this.b;
            object = objectArray2[n3];
            objectArray2[n3] = object2;
            return object;
        }
        int n5 = ~n3;
        int[] nArray = this.a;
        if (n4 >= nArray.length) {
            n3 = 8;
            if (n4 >= 8) {
                n3 = (n4 >> 1) + n4;
            } else if (n4 < 4) {
                n3 = 4;
            }
            Object[] objectArray3 = this.b;
            this.a(n3);
            if (n4 == this.c) {
                objectArray = this.a;
                if (objectArray.length > 0) {
                    System.arraycopy(nArray, 0, objectArray, 0, nArray.length);
                    System.arraycopy(objectArray3, 0, this.b, 0, objectArray3.length);
                }
                k.b(nArray, objectArray3, n4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n5 < n4) {
            objectArray = this.a;
            n3 = n5 + 1;
            System.arraycopy(objectArray, n5, objectArray, n3, n4 - n5);
            objectArray = this.b;
            System.arraycopy(objectArray, n5 << 1, objectArray, n3 << 1, this.c - n5 << 1);
        }
        if (n4 == (n3 = this.c) && n5 < (objectArray = this.a).length) {
            objectArray[n5] = n2;
            objectArray = this.b;
            n2 = n5 << 1;
            objectArray[n2] = (int)object;
            objectArray[n2 + 1] = (int)object2;
            this.c = n3 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object object) {
        int n2 = this.d(object);
        if (n2 >= 0) {
            return this.g(n2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.c * 28);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            Object object = this.b;
            int n2 = i2 << 1;
            if ((object = object[n2]) != this) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            object = this.b[n2 + 1];
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

