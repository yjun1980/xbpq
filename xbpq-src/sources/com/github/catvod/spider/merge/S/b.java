package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class b<T> implements Set<T> {
    protected final com.github.catvod.spider.merge.O.m c;
    protected T[][] d;
    protected int e;
    protected int f;
    protected int g;

    public b() {
        this(null, 8);
    }

    public b(com.github.catvod.spider.merge.O.m mVar, int i) {
        this.e = 0;
        this.f = (int) Math.floor(12.0d);
        this.g = 8;
        this.c = mVar == null ? k.a : mVar;
        this.d = d(16);
        this.g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected T a(Object obj) {
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return f(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (f(t) != t) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.d[e(t)];
        T t2 = null;
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t3 = tArr[i];
                    if (t3 == null) {
                        break;
                    }
                    if (this.c.E(t3, t)) {
                        t2 = t3;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return t2 != null;
    }

    protected T[] c(int i) {
        return (T[]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d = d(16);
        this.e = 0;
        this.f = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return b(a(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.S.b
            r1 = 0
            if (r0 == 0) goto L2c
            com.github.catvod.spider.merge.S.b r8 = (com.github.catvod.spider.merge.S.b) r8
            T[][] r8 = r8.d
            int r0 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L45
            r3 = r8[r2]
            if (r3 != 0) goto L12
            goto L29
        L12:
            int r4 = r3.length
            r5 = 0
        L14:
            if (r5 >= r4) goto L29
            r6 = r3[r5]
            if (r6 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r6 = r7.a(r6)
            boolean r6 = r7.b(r6)
            if (r6 != 0) goto L26
            return r1
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r2 = r2 + 1
            goto Lb
        L2c:
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.a(r0)
            boolean r0 = r7.b(r0)
            if (r0 != 0) goto L30
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.S.b.containsAll(java.util.Collection):boolean");
    }

    protected T[][] d(int i) {
        return (T[][]) new Object[i];
    }

    protected final int e(T t) {
        return this.c.F(t) & (this.d.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (bVar.e != this.e) {
            return false;
        }
        return containsAll(bVar);
    }

    public final T f(T t) {
        T[] tArr;
        int i = 0;
        if (this.e > this.f) {
            T[][] tArr2 = this.d;
            int length = tArr2.length * 2;
            T[][] d = d(length);
            int[] iArr = new int[d.length];
            this.d = d;
            double d2 = length;
            Double.isNaN(d2);
            Double.isNaN(d2);
            Double.isNaN(d2);
            this.f = (int) (d2 * 0.75d);
            for (T[] tArr3 : tArr2) {
                if (tArr3 != null) {
                    for (T t2 : tArr3) {
                        if (t2 == null) {
                            break;
                        }
                        int e = e(t2);
                        int i2 = iArr[e];
                        if (i2 == 0) {
                            tArr = c(this.g);
                            d[e] = tArr;
                        } else {
                            tArr = d[e];
                            if (i2 == tArr.length) {
                                tArr = (T[]) Arrays.copyOf(tArr, tArr.length * 2);
                                d[e] = tArr;
                            }
                        }
                        tArr[i2] = t2;
                        iArr[e] = iArr[e] + 1;
                    }
                }
            }
        }
        int e2 = e(t);
        T[] tArr4 = this.d[e2];
        if (tArr4 != null) {
            while (true) {
                if (i >= tArr4.length) {
                    int length2 = tArr4.length;
                    Object[] copyOf = Arrays.copyOf(tArr4, tArr4.length * 2);
                    ((T[][]) this.d)[e2] = copyOf;
                    copyOf[length2] = t;
                    break;
                }
                T t3 = tArr4[i];
                if (t3 == null) {
                    tArr4[i] = t;
                    break;
                }
                if (this.c.E(t3, t)) {
                    return t3;
                }
                i++;
            }
        } else {
            T[] c = c(this.g);
            c[0] = t;
            this.d[e2] = c;
        }
        this.e++;
        return t;
    }

    public final boolean g(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.d[e(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.c.E(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.e--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (T[] tArr : this.d) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    i = com.github.catvod.spider.merge.N.a.o(i, this.c.F(t));
                }
            }
        }
        return com.github.catvod.spider.merge.N.a.b(i, this.e);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return g(a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= g(a(it.next()));
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i = 0;
        for (T[] tArr : this.d) {
            if (tArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < tArr.length && tArr[i2] != null) {
                    if (collection.contains(tArr[i2])) {
                        if (i2 != i3) {
                            tArr[i3] = tArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    tArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.e;
        this.e = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[] c = c(this.e);
        int i = 0;
        for (T[] tArr : this.d) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    c[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return c;
    }

    public final String toString() {
        if (this.e == 0) {
            return cYh.d("1C2D");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr : this.d) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(cYh.d("4B70"));
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        int length = uArr.length;
        int i = this.e;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr : this.d) {
            if (tArr != null) {
                int length2 = tArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    T t = tArr[i3];
                    if (t == null) {
                        break;
                    }
                    uArr[i2] = t;
                    i3++;
                    i2++;
                }
            }
        }
        return uArr;
    }
}
