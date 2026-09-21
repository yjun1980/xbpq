/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q;

import com.github.catvod.spider.merge.q.e;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class n<K, V> {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    int[] a = com.github.catvod.spider.merge.q.e.a;
    Object[] b = com.github.catvod.spider.merge.q.e.b;
    int c = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2) {
        if (n2 == 8) {
            synchronized (n.class) {
                Object[] objectArray = f;
                if (objectArray != null) {
                    this.b = objectArray;
                    f = (Object[])objectArray[0];
                    this.a = (int[])objectArray[1];
                    objectArray[1] = null;
                    objectArray[0] = null;
                    --g;
                    return;
                }
            }
        } else if (n2 == 4) {
            synchronized (n.class) {
                Object[] objectArray = d;
                if (objectArray != null) {
                    this.b = objectArray;
                    d = (Object[])objectArray[0];
                    this.a = (int[])objectArray[1];
                    objectArray[1] = null;
                    objectArray[0] = null;
                    --e;
                    return;
                }
            }
        }
        this.a = new int[n2];
        this.b = new Object[n2 << 1];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(int[] nArray, Object[] objectArray, int n2) {
        if (nArray.length == 8) {
            synchronized (n.class) {
                if (g >= 10) return;
                objectArray[0] = f;
                objectArray[1] = nArray;
                n2 = (n2 << 1) - 1;
                while (true) {
                    if (n2 < 2) {
                        f = objectArray;
                        ++g;
                        return;
                    }
                    objectArray[n2] = null;
                    --n2;
                }
            }
        }
        if (nArray.length != 4) return;
        synchronized (n.class) {
            if (e >= 10) return;
            objectArray[0] = d;
            objectArray[1] = nArray;
            n2 = (n2 << 1) - 1;
            while (true) {
                if (n2 < 2) {
                    d = objectArray;
                    ++e;
                    return;
                }
                objectArray[n2] = null;
                --n2;
            }
        }
    }

    public final void b(int n2) {
        int n3 = this.c;
        int[] nArray = this.a;
        if (nArray.length < n2) {
            Object[] objectArray = this.b;
            this.a(n2);
            if (this.c > 0) {
                System.arraycopy(nArray, 0, this.a, 0, n3);
                System.arraycopy(objectArray, 0, this.b, 0, n3 << 1);
            }
            n.c(nArray, objectArray, n3);
        }
        if (this.c == n3) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int n2 = this.c;
        if (n2 > 0) {
            int[] nArray = this.a;
            Object[] objectArray = this.b;
            this.a = com.github.catvod.spider.merge.q.e.a;
            this.b = com.github.catvod.spider.merge.q.e.b;
            this.c = 0;
            n.c(nArray, objectArray, n2);
        }
        if (this.c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object object) {
        boolean bl = this.e(object) >= 0;
        return bl;
    }

    public final boolean containsValue(Object object) {
        boolean bl = this.g(object) >= 0;
        return bl;
    }

    final int d(Object object, int n2) {
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
                n4 = com.github.catvod.spider.merge.q.e.a(nArray, n5, n2);
                if (n4 >= 0) break block7;
                return n4;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new ConcurrentModificationException();
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

    public final int e(Object object) {
        int n2 = object == null ? this.f() : this.d(object, object.hashCode());
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        Map map;
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            if (!(object instanceof Map)) return false;
            map = (Map)object;
            if (this.c != map.size()) {
                return false;
            }
        } else {
            n n2 = (n)object;
            if (this.c != n2.c) {
                return false;
            }
            int n3 = 0;
            try {
                while (n3 < this.c) {
                    object = this.h(n3);
                    V v2 = this.k(n3);
                    Object var6_12 = n2.getOrDefault(object, null);
                    if (v2 == null) {
                        if (var6_12 != null) return false;
                        if (!n2.containsKey(object)) {
                            return false;
                        }
                    } else {
                        boolean bl = v2.equals(var6_12);
                        if (!bl) {
                            return false;
                        }
                    }
                    ++n3;
                }
                return true;
            }
            catch (ClassCastException | NullPointerException runtimeException) {
                return false;
            }
        }
        int n4 = 0;
        try {
            while (n4 < this.c) {
                object = this.h(n4);
                V v3 = this.k(n4);
                Object v4 = map.get(object);
                if (v3 == null) {
                    if (v4 != null) return false;
                    if (!map.containsKey(object)) {
                        return false;
                    }
                } else {
                    boolean bl = v3.equals(v4);
                    if (!bl) {
                        return false;
                    }
                }
                ++n4;
            }
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    final int f() {
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
                n3 = com.github.catvod.spider.merge.q.e.a(nArray, n4, 0);
                if (n3 >= 0) break block7;
                return n3;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw new ConcurrentModificationException();
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

    final int g(Object object) {
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

    public final V get(Object object) {
        return this.getOrDefault(object, null);
    }

    public final V getOrDefault(Object object, V object2) {
        int n2 = this.e(object);
        if (n2 >= 0) {
            object2 = this.b[(n2 << 1) + 1];
        }
        return object2;
    }

    public final K h(int n2) {
        return (K)this.b[n2 << 1];
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final V i(int n2) {
        Object[] objectArray = this.b;
        int n3 = n2 << 1;
        Object object = objectArray[n3 + 1];
        int n4 = this.c;
        int n5 = 0;
        if (n4 <= 1) {
            n.c(this.a, objectArray, n4);
            this.a = com.github.catvod.spider.merge.q.e.a;
            this.b = com.github.catvod.spider.merge.q.e.b;
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
                    n7 = n2 + 1;
                    int[] nArray2 = this.a;
                    n5 = n6 - n2;
                    System.arraycopy(nArray, n7, nArray2, n2, n5);
                    System.arraycopy(objectArray, n7 << 1, this.b, n3, n5 << 1);
                }
            } else {
                Object[] objectArray2;
                if (n2 < n6) {
                    n5 = n2 + 1;
                    n7 = n6 - n2;
                    System.arraycopy(nArray, n5, nArray, n2, n7);
                    objectArray2 = this.b;
                    System.arraycopy(objectArray2, n5 << 1, objectArray2, n3, n7 << 1);
                }
                objectArray2 = this.b;
                n2 = n6 << 1;
                objectArray2[n2] = null;
                objectArray2[n2 + 1] = null;
            }
            n2 = n6;
        }
        if (n4 != this.c) throw new ConcurrentModificationException();
        this.c = n2;
        return (V)object;
    }

    public final boolean isEmpty() {
        boolean bl = this.c <= 0;
        return bl;
    }

    public final V j(int n2, V v2) {
        n2 = (n2 << 1) + 1;
        Object[] objectArray = this.b;
        Object object = objectArray[n2];
        objectArray[n2] = v2;
        return (V)object;
    }

    public final V k(int n2) {
        return (V)this.b[(n2 << 1) + 1];
    }

    public final V put(K object, V v2) {
        int n2;
        int n3;
        int n4 = this.c;
        if (object == null) {
            n3 = this.f();
            n2 = 0;
        } else {
            n2 = object.hashCode();
            n3 = this.d(object, n2);
        }
        if (n3 >= 0) {
            n3 = (n3 << 1) + 1;
            Object[] objectArray = this.b;
            object = objectArray[n3];
            objectArray[n3] = v2;
            return (V)object;
        }
        int n5 = ~n3;
        Object[] objectArray = this.a;
        if (n4 >= objectArray.length) {
            n3 = 4;
            if (n4 >= 8) {
                n3 = (n4 >> 1) + n4;
            } else if (n4 >= 4) {
                n3 = 8;
            }
            Object[] objectArray2 = this.b;
            this.a(n3);
            if (n4 == this.c) {
                int[] nArray = this.a;
                if (nArray.length > 0) {
                    System.arraycopy(objectArray, 0, nArray, 0, objectArray.length);
                    System.arraycopy(objectArray2, 0, this.b, 0, objectArray2.length);
                }
                n.c(objectArray, objectArray2, n4);
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
            objectArray[n2 + 1] = (int)v2;
            this.c = n3 + 1;
            return null;
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k2, V v2) {
        V v3;
        V v4 = v3 = this.getOrDefault(k2, null);
        if (v3 == null) {
            v4 = this.put(k2, v2);
        }
        return v4;
    }

    public final V remove(Object object) {
        int n2 = this.e(object);
        if (n2 >= 0) {
            return this.i(n2);
        }
        return null;
    }

    public final boolean remove(Object object, Object object2) {
        int n2 = this.e(object);
        if (n2 >= 0 && (object2 == (object = this.k(n2)) || object2 != null && object2.equals(object))) {
            this.i(n2);
            return true;
        }
        return false;
    }

    public final V replace(K k2, V v2) {
        int n2 = this.e(k2);
        if (n2 >= 0) {
            return this.j(n2, v2);
        }
        return null;
    }

    public final boolean replace(K object, V v2, V v3) {
        int n2 = this.e(object);
        if (n2 >= 0 && ((object = this.k(n2)) == v2 || v2 != null && v2.equals(object))) {
            this.j(n2, v3);
            return true;
        }
        return false;
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
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = this.h(i2)) != this) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            object = this.k(i2);
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

