package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0179m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<E> extends AbstractC0190c<E> implements Set<E> {
    private transient f<E> d;

    static int g(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            C0179m.b(max < 1073741824, cYh.d("043F2D3D323913392E3F772E083F613D36280035"));
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (true) {
            double d = highestOneBit;
            Double.isNaN(d);
            if (d * 0.7d >= max) {
                return highestOneBit;
            }
            highestOneBit <<= 1;
        }
    }

    private static <E> g<E> h(int i, Object... objArr) {
        if (i == 0) {
            return k.k;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new l(obj);
        }
        int g = g(i);
        Object[] objArr2 = new Object[g];
        int i2 = g - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            i.a(obj2, i5);
            int hashCode = obj2.hashCode();
            int a = C0189b.a(hashCode);
            while (true) {
                int i6 = a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new l(obj4);
        }
        if (g(i4) < g / 2) {
            return h(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new k(objArr, i3, objArr2, i2, i4);
    }

    public static g j() {
        return h(4, cYh.d("0522"), cYh.d("0335273D362E02"), cYh.d("002A2821"), cYh.d("1F7D262B3E2A"));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof k)) {
            g gVar = (g) obj;
            gVar.getClass();
            if ((gVar instanceof k) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final f<E> f() {
        f<E> fVar = this.d;
        if (fVar != null) {
            return fVar;
        }
        f<E> i = i();
        this.d = i;
        return i;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    f<E> i() {
        Object[] array = toArray();
        int i = f.e;
        int length = array.length;
        if (length == 0) {
            return (f<E>) j.h;
        }
        return new j(array, length);
    }
}
