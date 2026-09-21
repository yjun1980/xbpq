/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.github.catvod.spider.merge.xc.f;

import android.util.SparseArray;
import com.github.catvod.spider.merge.xc.f.d;

public final class e
implements Cloneable {
    public static final Object d = new Object();
    public long[] a;
    public Object[] b;
    public int c;

    public e() {
        int n2;
        int n3 = 4;
        while (true) {
            n2 = 24;
            if (n3 >= 32 || 24 <= (n2 = (1 << n3) - 12)) break;
            ++n3;
        }
        n3 = n2 / 8;
        this.a = new long[n3];
        this.b = new Object[n3];
        this.c = 0;
    }

    public final Object a(long l2) {
        Object object;
        block3: {
            block2: {
                Object object2;
                int n2 = com.github.catvod.spider.merge.xc.f.d.b(this.a, this.c, l2);
                if (n2 < 0) break block2;
                object = object2 = this.b[n2];
                if (object2 != d) break block3;
            }
            object = null;
        }
        return object;
    }

    public final void b(long l2, SparseArray sparseArray) {
        int n2 = com.github.catvod.spider.merge.xc.f.d.b(this.a, this.c, l2);
        if (n2 >= 0) {
            this.b[n2] = sparseArray;
        } else {
            int n3;
            Object[] objectArray;
            int n4 = ~n2;
            if (n4 < (n2 = this.c) && (objectArray = this.b)[n4] == d) {
                this.a[n4] = l2;
                objectArray[n4] = sparseArray;
                return;
            }
            if (n2 >= this.a.length) {
                int n5 = (n2 + 1) * 8;
                n2 = 4;
                while (true) {
                    n3 = n5;
                    if (n2 >= 32 || n5 <= (n3 = (1 << n2) - 12)) break;
                    ++n2;
                }
                n2 = n3 / 8;
                objectArray = new long[n2];
                Object[] objectArray2 = new Object[n2];
                Object[] objectArray3 = this.a;
                System.arraycopy(objectArray3, 0, objectArray, 0, objectArray3.length);
                objectArray3 = this.b;
                System.arraycopy(objectArray3, 0, objectArray2, 0, objectArray3.length);
                this.a = (long[])objectArray;
                this.b = objectArray2;
            }
            if ((n3 = this.c - n4) != 0) {
                objectArray = this.a;
                n2 = n4 + 1;
                System.arraycopy(objectArray, n4, objectArray, n2, n3);
                objectArray = this.b;
                System.arraycopy(objectArray, n4, objectArray, n2, this.c - n4);
            }
            this.a[n4] = l2;
            this.b[n4] = sparseArray;
            ++this.c;
        }
    }

    public final Object clone() {
        try {
            e e2 = (e)super.clone();
            e2.a = (long[])this.a.clone();
            e2.b = (Object[])this.b.clone();
            return e2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(n2 * 28);
        stringBuilder.append('{');
        for (n2 = 0; n2 < this.c; ++n2) {
            if (n2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.a[n2]);
            stringBuilder.append('=');
            Object object = this.b[n2];
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

