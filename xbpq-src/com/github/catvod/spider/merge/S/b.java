/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.O.m;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.S.k;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class b<T>
implements Set<T> {
    protected final m c;
    protected T[][] d;
    protected int e = 0;
    protected int f = (int)Math.floor(12.0);
    protected int g = 8;

    public b() {
        this(null, 8);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public b(m m2, int n2) {
        m m3 = m2;
        if (m2 == null) {
            m3 = k.a;
        }
        this.c = m3;
        this.d = this.d(16);
        this.g = n2;
    }

    protected T a(Object object) {
        return (T)object;
    }

    @Override
    public final boolean add(T t2) {
        boolean bl = this.f(t2) == t2;
        return bl;
    }

    @Override
    public final boolean addAll(Collection<? extends T> collection) {
        Iterator<T> iterator = collection.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            collection = iterator.next();
            if (this.f(collection) == collection) continue;
            bl = true;
        }
        return bl;
    }

    public final boolean b(T t2) {
        Object var5_6;
        boolean bl = false;
        if (t2 == null) {
            return false;
        }
        int n2 = this.e(t2);
        T[] TArray = this.d[n2];
        Object var6_5 = null;
        if (TArray == null) {
            var5_6 = var6_5;
        } else {
            int n3 = TArray.length;
            n2 = 0;
            while (true) {
                var5_6 = var6_5;
                if (n2 >= n3) break;
                var5_6 = TArray[n2];
                if (var5_6 == null) {
                    var5_6 = var6_5;
                    break;
                }
                if (this.c.E(var5_6, t2)) break;
                ++n2;
            }
        }
        if (var5_6 != null) {
            bl = true;
        }
        return bl;
    }

    protected T[] c(int n2) {
        return new Object[n2];
    }

    @Override
    public final void clear() {
        this.d = this.d(16);
        this.e = 0;
        this.f = (int)Math.floor(12.0);
    }

    @Override
    public final boolean contains(Object object) {
        return this.b(this.a(object));
    }

    @Override
    public final boolean containsAll(Collection<?> TArray2) {
        if (TArray2 instanceof b) {
            for (T[] TArray2 : ((b)TArray2).d) {
                T t2;
                if (TArray2 == null) continue;
                int n2 = TArray2.length;
                for (int i2 = 0; i2 < n2 && (t2 = TArray2[i2]) != null; ++i2) {
                    if (this.b(this.a(t2))) continue;
                    return false;
                }
            }
        } else {
            TArray2 = TArray2.iterator();
            while (TArray2.hasNext()) {
                if (this.b(this.a(TArray2.next()))) continue;
                return false;
            }
        }
        return true;
    }

    protected T[][] d(int n2) {
        return new Object[n2][];
    }

    protected final int e(T t2) {
        return this.c.F(t2) & this.d.length - 1;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (((b)object).e != this.e) {
            return false;
        }
        return this.containsAll((Collection<?>)object);
    }

    public final T f(T object) {
        block11: {
            block10: {
                T[] TArray;
                Object object2;
                int n2 = this.e;
                int n3 = this.f;
                int n4 = 0;
                if (n2 > n3) {
                    T[][] TArray2 = this.d;
                    n2 = TArray2.length * 2;
                    T[][] TArray3 = this.d(n2);
                    int[] nArray = new int[TArray3.length];
                    this.d = TArray3;
                    double d2 = n2;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    this.f = (int)(d2 * 0.75);
                    int n5 = TArray2.length;
                    for (n2 = 0; n2 < n5; ++n2) {
                        T[] TArray4 = TArray2[n2];
                        if (TArray4 == null) continue;
                        for (T t2 : TArray4) {
                            if (t2 == null) break;
                            int n6 = this.e(t2);
                            int n7 = nArray[n6];
                            if (n7 == 0) {
                                object2 = this.c(this.g);
                                TArray3[n6] = object2;
                            } else {
                                TArray = TArray3[n6];
                                object2 = TArray;
                                if (n7 == TArray.length) {
                                    object2 = Arrays.copyOf(TArray, TArray.length * 2);
                                    TArray3[n6] = object2;
                                }
                            }
                            object2[n7] = t2;
                            nArray[n6] = nArray[n6] + 1;
                        }
                    }
                }
                n3 = this.e(object);
                TArray = this.d[n3];
                if (TArray == null) {
                    object2 = this.c(this.g);
                    object2[0] = object;
                    this.d[n3] = object2;
                } else {
                    for (n2 = n4; n2 < TArray.length; ++n2) {
                        object2 = TArray[n2];
                        if (object2 == null) {
                            TArray[n2] = object;
                            break block10;
                        }
                        if (!this.c.E(object2, object)) continue;
                        object = object2;
                        break block11;
                    }
                    n2 = TArray.length;
                    object2 = Arrays.copyOf(TArray, TArray.length * 2);
                    this.d[n3] = object2;
                    object2[n2] = object;
                }
            }
            ++this.e;
        }
        return object;
    }

    public final boolean g(T t2) {
        if (t2 == null) {
            return false;
        }
        int n2 = this.e(t2);
        T[] TArray = this.d[n2];
        if (TArray == null) {
            return false;
        }
        for (n2 = 0; n2 < TArray.length; ++n2) {
            T t3 = TArray[n2];
            if (t3 == null) {
                return false;
            }
            if (!this.c.E(t3, t2)) continue;
            System.arraycopy(TArray, n2 + 1, TArray, n2, TArray.length - n2 - 1);
            TArray[TArray.length - 1] = null;
            --this.e;
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        T[][] TArray = this.d;
        int n2 = TArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            T[] TArray2 = TArray[i2];
            if (TArray2 == null) {
                n4 = n3;
            } else {
                int n5 = TArray2.length;
                int n6 = 0;
                while (true) {
                    n4 = n3;
                    if (n6 >= n5) break;
                    T t2 = TArray2[n6];
                    if (t2 == null) {
                        n4 = n3;
                        break;
                    }
                    n3 = com.github.catvod.spider.merge.N.a.o(n3, this.c.F(t2));
                    ++n6;
                }
            }
            n3 = n4;
        }
        return com.github.catvod.spider.merge.N.a.b(n3, this.e);
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.e == 0;
        return bl;
    }

    @Override
    public final Iterator<T> iterator() {
        return new a(this, this.toArray());
    }

    @Override
    public final boolean remove(Object object) {
        return this.g(this.a(object));
    }

    @Override
    public final boolean removeAll(Collection<?> object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.g(this.a(object.next()));
        }
        return bl;
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        T[][] TArray = this.d;
        int n2 = TArray.length;
        boolean bl = false;
        int n3 = 0;
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            T[] TArray2 = TArray[i2];
            if (TArray2 == null) continue;
            int n5 = 0;
            for (n4 = 0; n4 < TArray2.length && TArray2[n4] != null; ++n4) {
                if (!collection.contains(TArray2[n4])) continue;
                if (n4 != n5) {
                    TArray2[n5] = TArray2[n4];
                }
                ++n5;
                ++n3;
            }
            int n6 = n3 + n5;
            while (true) {
                n3 = n6;
                if (n5 >= n4) continue block0;
                TArray2[n5] = null;
                ++n5;
            }
        }
        if (n3 != this.e) {
            bl = true;
        }
        this.e = n3;
        return bl;
    }

    @Override
    public final int size() {
        return this.e;
    }

    @Override
    public final T[] toArray() {
        T[] TArray = this.c(this.e);
        T[][] TArray2 = this.d;
        int n2 = TArray2.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            T[] TArray3 = TArray2[i2];
            if (TArray3 == null) {
                n4 = n3;
            } else {
                int n5 = TArray3.length;
                int n6 = 0;
                while (true) {
                    n4 = ++n3;
                    if (n6 >= n5) break;
                    T t2 = TArray3[n6];
                    if (t2 == null) {
                        n4 = n3;
                        break;
                    }
                    TArray[n3] = t2;
                    ++n6;
                }
            }
            n3 = n4;
        }
        return TArray;
    }

    @Override
    public final <U> U[] toArray(U[] objectArray) {
        int n2 = objectArray.length;
        int n3 = this.e;
        U[] UArray = objectArray;
        if (n2 < n3) {
            UArray = Arrays.copyOf(objectArray, n3);
        }
        T[][] TArray = this.d;
        int n4 = TArray.length;
        n2 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            int n5;
            objectArray = TArray[n3];
            if (objectArray == null) {
                n5 = n2;
            } else {
                int n6 = objectArray.length;
                int n7 = 0;
                while (true) {
                    n5 = ++n2;
                    if (n7 >= n6) break;
                    U u2 = objectArray[n7];
                    if (u2 == null) {
                        n5 = n2;
                        break;
                    }
                    UArray[n2] = u2;
                    ++n7;
                }
            }
            n2 = n5;
        }
        return UArray;
    }

    public final String toString() {
        if (this.e == 0) {
            return cYh.d("1C2D");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        T[][] TArray = this.d;
        int n2 = TArray.length;
        boolean bl = true;
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2;
            T[] TArray2 = TArray[i2];
            if (TArray2 == null) {
                bl2 = bl;
            } else {
                int n3 = TArray2.length;
                int n4 = 0;
                while (true) {
                    bl2 = bl;
                    if (n4 >= n3) break;
                    T t2 = TArray2[n4];
                    if (t2 == null) {
                        bl2 = bl;
                        break;
                    }
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append(cYh.d("4B70"));
                    }
                    stringBuilder.append(t2.toString());
                    ++n4;
                }
            }
            bl = bl2;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

