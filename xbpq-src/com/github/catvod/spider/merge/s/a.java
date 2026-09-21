/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

public final class a
implements Cloneable {
    private int[] c;
    private int d;

    public a() {
        this.d = 0;
        this.c = new int[1];
    }

    a(int[] nArray, int n2) {
        this.c = nArray;
        this.d = n2;
    }

    private void d(int n2) {
        int[] nArray = this.c;
        if (n2 > nArray.length << 5) {
            int[] nArray2 = new int[(n2 + 31) / 32];
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            this.c = nArray2;
        }
    }

    public final void a(boolean bl) {
        this.d(this.d + 1);
        if (bl) {
            int[] nArray = this.c;
            int n2 = this.d;
            int n3 = n2 / 32;
            nArray[n3] = 1 << (n2 & 0x1F) | nArray[n3];
        }
        ++this.d;
    }

    public final void b(a a2) {
        int n2 = a2.d;
        this.d(this.d + n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(a2.e(i2));
        }
    }

    public final void c(int n2, int n3) {
        if (n3 >= 0 && n3 <= 32) {
            this.d(this.d + n3);
            while (n3 > 0) {
                boolean bl = true;
                if ((n2 >> n3 - 1 & 1) != 1) {
                    bl = false;
                }
                this.a(bl);
                --n3;
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(cYh.d("29252C7135331323613C222913702334773802243634323447606130393E476373"));
        throw illegalArgumentException;
    }

    public final Object clone() {
        return new a((int[])this.c.clone(), this.d);
    }

    public final boolean e(int n2) {
        return (1 << (n2 & 0x1F) & this.c[n2 / 32]) != 0;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.d == ((a)object).d && Arrays.equals(this.c, ((a)object).c);
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return (this.d + 7) / 8;
    }

    public final void h(a object) {
        if (this.d == ((a)object).d) {
            int[] nArray;
            for (int i2 = 0; i2 < (nArray = this.c).length; ++i2) {
                nArray[i2] = nArray[i2] ^ ((a)object).c[i2];
            }
            return;
        }
        object = new IllegalArgumentException(cYh.d("34393B34247A033F2F76237A0A3135323F"));
        throw object;
    }

    public final int hashCode() {
        int n2 = this.d;
        return Arrays.hashCode(this.c) + n2 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            if ((i2 & 7) == 0) {
                stringBuilder.append(' ');
            }
            char c2 = this.e(i2) ? (char)'X' : '.';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

