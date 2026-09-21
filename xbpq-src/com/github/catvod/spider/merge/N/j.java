/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.N.k;

public class j<T extends k & Comparable<? super T>> {
    private volatile int _size;
    private T[] a;

    private final void d(int n2, int n3) {
        T[] TArray = this.a;
        f.b(TArray);
        T t2 = TArray[n3];
        f.b(t2);
        T t3 = TArray[n2];
        f.b(t3);
        TArray[n2] = t2;
        TArray[n3] = t3;
        t2.a();
        t3.a();
    }

    public final T a() {
        Object object = this.a;
        object = object != null ? object[0] : null;
        return (T)object;
    }

    public final boolean b() {
        boolean bl = this._size == 0;
        return bl;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final k c() {
        Object object;
        T[] TArray = this.a;
        f.b(TArray);
        --this._size;
        if (this._size > 0) {
            int n2;
            int n3 = this._size;
            int n4 = 0;
            this.d(0, n3);
            while ((n2 = n4 * 2 + 1) < this._size) {
                Object object2;
                object = this.a;
                f.b(object);
                int n5 = n2 + 1;
                n3 = n2;
                if (n5 < this._size) {
                    object2 = object[n5];
                    f.b(object2);
                    object2 = (Comparable)object2;
                    T t2 = object[n2];
                    f.b(t2);
                    n3 = n2;
                    if (object2.compareTo(t2) < 0) {
                        n3 = n5;
                    }
                }
                object2 = object[n4];
                f.b(object2);
                object2 = (Comparable)object2;
                object = object[n3];
                f.b(object);
                if (object2.compareTo(object) <= 0) break;
                this.d(n4, n3);
                n4 = n3;
            }
        }
        object = TArray[this._size];
        f.b(object);
        object.b(null);
        object.a();
        TArray[this._size] = null;
        return object;
    }
}

