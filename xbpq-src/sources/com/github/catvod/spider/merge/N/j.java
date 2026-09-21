package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.N.k;
import java.lang.Comparable;

/* loaded from: classes.dex */
public class j<T extends k & Comparable<? super T>> {
    private volatile int _size;
    private T[] a;

    private final void d(int i, int i2) {
        T[] tArr = this.a;
        com.github.catvod.spider.merge.E.f.b(tArr);
        T t = tArr[i2];
        com.github.catvod.spider.merge.E.f.b(t);
        T t2 = tArr[i];
        com.github.catvod.spider.merge.E.f.b(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.a();
        t2.a();
    }

    public final T a() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final k c() {
        T[] tArr = this.a;
        com.github.catvod.spider.merge.E.f.b(tArr);
        this._size--;
        if (this._size > 0) {
            int i = 0;
            d(0, this._size);
            while (true) {
                int i2 = (i * 2) + 1;
                if (i2 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                com.github.catvod.spider.merge.E.f.b(tArr2);
                int i3 = i2 + 1;
                if (i3 < this._size) {
                    T t = tArr2[i3];
                    com.github.catvod.spider.merge.E.f.b(t);
                    T t2 = tArr2[i2];
                    com.github.catvod.spider.merge.E.f.b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr2[i];
                com.github.catvod.spider.merge.E.f.b(t3);
                T t4 = tArr2[i2];
                com.github.catvod.spider.merge.E.f.b(t4);
                if (((Comparable) t3).compareTo(t4) <= 0) {
                    break;
                }
                d(i, i2);
                i = i2;
            }
        }
        T t5 = tArr[this._size];
        com.github.catvod.spider.merge.E.f.b(t5);
        t5.b(null);
        t5.a();
        tArr[this._size] = null;
        return t5;
    }
}
