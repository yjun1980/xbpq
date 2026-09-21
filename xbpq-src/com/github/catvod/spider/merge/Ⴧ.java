/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u02c7;
import com.github.catvod.spider.merge.\u108e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class \u10c7<T>
implements Set<T> {
    protected final \u108e<? super T> \u037f;
    protected T[][] \u0528;
    protected int \u0529 = 0;
    protected int \u052a = (int)Math.floor(12.0);
    protected int \u052b = 1;
    protected int \u052c = 8;

    public \u10c7() {
        this(null, 16, 8);
    }

    public \u10c7(\u108e<? super T> \u02c72, int n2, int n3) {
        \u02c7 \u02c73 = \u02c72;
        if (\u02c72 == null) {
            \u02c73 = \u02c7.\u037f;
        }
        this.\u037f = \u02c73;
        this.\u0528 = this.\u052a(n2);
        this.\u052c = n3;
    }

    @Override
    public final boolean add(T t2) {
        boolean bl = this.\u052e(t2) == t2;
        return bl;
    }

    @Override
    public boolean addAll(Collection<? extends T> object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (this.\u052e(e2) == e2) continue;
            bl = true;
        }
        return bl;
    }

    @Override
    public void clear() {
        this.\u0528 = this.\u052a(16);
        this.\u0529 = 0;
        this.\u052a = (int)Math.floor(12.0);
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u0528(this.\u037f(object));
    }

    @Override
    public boolean containsAll(Collection<?> TArray2) {
        if (TArray2 instanceof \u10c7) {
            for (T[] TArray2 : ((\u10c7)TArray2).\u0528) {
                T t2;
                if (TArray2 == null) continue;
                int n2 = TArray2.length;
                for (int i2 = 0; i2 < n2 && (t2 = TArray2[i2]) != null; ++i2) {
                    if (this.\u0528(this.\u037f(t2))) continue;
                    return false;
                }
            }
        } else {
            TArray2 = TArray2.iterator();
            while (TArray2.hasNext()) {
                if (this.\u0528(this.\u037f(TArray2.next()))) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u10c7)) {
            return false;
        }
        if (((\u10c7)(object = (\u10c7)object)).size() != this.size()) {
            return false;
        }
        return this.containsAll((Collection<?>)object);
    }

    @Override
    public int hashCode() {
        int n2 = \u02c6.\u0529();
        for (T[] TArray : this.\u0528) {
            int n3;
            if (TArray == null) {
                n3 = n2;
            } else {
                int n4 = TArray.length;
                int n5 = 0;
                while (true) {
                    n3 = n2;
                    if (n5 >= n4) break;
                    T t2 = TArray[n5];
                    if (t2 == null) {
                        n3 = n2;
                        break;
                    }
                    n2 = \u02c6.\u052b(n2, this.\u037f.\u0528(t2));
                    ++n5;
                }
            }
            n2 = n3;
        }
        return \u02c6.\u037f(n2, this.size());
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.\u0529 == 0;
        return bl;
    }

    @Override
    public Iterator<T> iterator() {
        return new \u037f(this, this.toArray());
    }

    @Override
    public final boolean remove(Object object) {
        return this.\u058f(this.\u037f(object));
    }

    @Override
    public boolean removeAll(Collection<?> object) {
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.\u058f(this.\u037f(object.next()));
        }
        return bl;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        T[][] TArray = this.\u0528;
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
        if (n3 != this.\u0529) {
            bl = true;
        }
        this.\u0529 = n3;
        return bl;
    }

    @Override
    public final int size() {
        return this.\u0529;
    }

    @Override
    public T[] toArray() {
        T[] TArray = this.\u0529(this.size());
        T[][] TArray2 = this.\u0528;
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
    public <U> U[] toArray(U[] UArray) {
        U[] UArray2 = UArray;
        if (UArray.length < this.size()) {
            UArray2 = Arrays.copyOf(UArray, this.size());
        }
        UArray = this.\u0528;
        int n2 = UArray.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            U u2 = UArray[i2];
            if (u2 == null) {
                n4 = n3;
            } else {
                int n5 = ((U)u2).length;
                int n6 = 0;
                while (true) {
                    n4 = ++n3;
                    if (n6 >= n5) break;
                    U u3 = u2[n6];
                    if (u3 == null) {
                        n4 = n3;
                        break;
                    }
                    UArray2[n3] = u3;
                    ++n6;
                }
            }
            n3 = n4;
        }
        return UArray2;
    }

    public String toString() {
        if (this.size() == 0) {
            return SOY.d("012F");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        T[][] TArray = this.\u0528;
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
                        stringBuilder.append(SOY.d("5672"));
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

    protected T \u037f(Object object) {
        return (T)object;
    }

    public boolean \u0528(T t2) {
        boolean bl = false;
        if (t2 == null) {
            return false;
        }
        if (this.\u052c(t2) != null) {
            bl = true;
        }
        return bl;
    }

    protected T[] \u0529(int n2) {
        return new Object[n2];
    }

    protected T[][] \u052a(int n2) {
        return new Object[n2][];
    }

    protected void \u052b() {
        T[][] TArray = this.\u0528;
        this.\u052b += 4;
        int n2 = TArray.length * 2;
        T[][] TArray2 = this.\u052a(n2);
        int[] nArray = new int[TArray2.length];
        this.\u0528 = TArray2;
        double d2 = n2;
        Double.isNaN(d2);
        this.\u052a = (int)(d2 * 0.75);
        this.size();
        for (T[] TArray3 : TArray) {
            T t2;
            if (TArray3 == null) continue;
            int n3 = TArray3.length;
            for (int i2 = 0; i2 < n3 && (t2 = TArray3[i2]) != null; ++i2) {
                T[] TArray4;
                int n4 = this.\u052d(t2);
                int n5 = nArray[n4];
                if (n5 == 0) {
                    TArray4 = this.\u0529(this.\u052c);
                    TArray2[n4] = TArray4;
                } else {
                    T[] TArray5 = TArray2[n4];
                    TArray4 = TArray5;
                    if (n5 == TArray5.length) {
                        TArray4 = Arrays.copyOf(TArray5, TArray5.length * 2);
                        TArray2[n4] = TArray4;
                    }
                }
                TArray4[n5] = t2;
                nArray[n4] = nArray[n4] + 1;
            }
        }
    }

    public T \u052c(T t2) {
        if (t2 == null) {
            return t2;
        }
        int n2 = this.\u052d(t2);
        T[] TArray = this.\u0528[n2];
        if (TArray == null) {
            return null;
        }
        for (T t3 : TArray) {
            if (t3 == null) {
                return null;
            }
            if (!this.\u037f.\u037f(t3, t2)) continue;
            return t3;
        }
        return null;
    }

    protected final int \u052d(T t2) {
        return this.\u037f.\u0528(t2) & this.\u0528.length - 1;
    }

    public final T \u052e(T t2) {
        if (this.\u0529 > this.\u052a) {
            this.\u052b();
        }
        return this.\u052f(t2);
    }

    protected T \u052f(T t2) {
        int n2;
        int n3 = this.\u052d(t2);
        T[] TArray = this.\u0528[n3];
        if (TArray == null) {
            TArray = this.\u0529(this.\u052c);
            TArray[0] = t2;
            this.\u0528[n3] = TArray;
            ++this.\u0529;
            return t2;
        }
        for (n2 = 0; n2 < TArray.length; ++n2) {
            T t3 = TArray[n2];
            if (t3 == null) {
                TArray[n2] = t2;
                ++this.\u0529;
                return t2;
            }
            if (!this.\u037f.\u037f(t3, t2)) continue;
            return t3;
        }
        n2 = TArray.length;
        TArray = Arrays.copyOf(TArray, TArray.length * 2);
        this.\u0528[n3] = TArray;
        TArray[n2] = t2;
        ++this.\u0529;
        return t2;
    }

    public boolean \u058f(T t2) {
        if (t2 == null) {
            return false;
        }
        int n2 = this.\u052d(t2);
        T[] TArray = this.\u0528[n2];
        if (TArray == null) {
            return false;
        }
        for (n2 = 0; n2 < TArray.length; ++n2) {
            T t3 = TArray[n2];
            if (t3 == null) {
                return false;
            }
            if (!this.\u037f.\u037f(t3, t2)) continue;
            System.arraycopy(TArray, n2 + 1, TArray, n2, TArray.length - n2 - 1);
            TArray[TArray.length - 1] = null;
            --this.\u0529;
            return true;
        }
        return false;
    }

    protected class \u037f
    implements Iterator<T> {
        final T[] \u037f;
        int \u0528;
        boolean \u0529;
        final \u10c7 \u052a;

        public \u037f(\u10c7 \u2d27, T[] TArray) {
            this.\u052a = \u2d27;
            this.\u0528 = 0;
            this.\u0529 = true;
            this.\u037f = TArray;
        }

        @Override
        public boolean hasNext() {
            boolean bl = this.\u0528 < this.\u037f.length;
            return bl;
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                this.\u0529 = false;
                T[] TArray = this.\u037f;
                int n2 = this.\u0528;
                this.\u0528 = n2 + 1;
                return TArray[n2];
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            if (!this.\u0529) {
                this.\u052a.remove(this.\u037f[this.\u0528 - 1]);
                this.\u0529 = true;
                return;
            }
            throw new IllegalStateException();
        }
    }
}

