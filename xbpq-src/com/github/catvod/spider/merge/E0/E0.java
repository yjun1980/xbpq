/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.l0;
import java.util.Arrays;

public final class E0 {
    private static final E0 f = new E0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d = -1;
    private boolean e;

    private E0() {
        this(0, new int[8], new Object[8], true);
    }

    private E0(int n2, int[] nArray, Object[] objectArray, boolean bl) {
        this.a = n2;
        this.b = nArray;
        this.c = objectArray;
        this.e = bl;
    }

    private void a(int n2) {
        int[] nArray = this.b;
        if (n2 > nArray.length) {
            int n3 = this.a;
            if ((n3 = n3 / 2 + n3) >= n2) {
                n2 = n3;
            }
            n3 = n2;
            if (n2 < 8) {
                n3 = 8;
            }
            this.b = Arrays.copyOf(nArray, n3);
            this.c = Arrays.copyOf(this.c, n3);
        }
    }

    public static E0 b() {
        return f;
    }

    static E0 e(E0 e02, E0 e03) {
        int n2 = e02.a + e03.a;
        int[] nArray = Arrays.copyOf(e02.b, n2);
        System.arraycopy(e03.b, 0, nArray, e02.a, e03.a);
        Object[] objectArray = Arrays.copyOf(e02.c, n2);
        System.arraycopy(e03.c, 0, objectArray, e02.a, e03.a);
        return new E0(n2, nArray, objectArray, true);
    }

    static E0 f() {
        return new E0();
    }

    public final void c() {
        if (this.e) {
            this.e = false;
        }
    }

    final E0 d(E0 e02) {
        if (e02.equals(f)) {
            return this;
        }
        if (this.e) {
            int n2 = this.a + e02.a;
            this.a(n2);
            System.arraycopy(e02.b, 0, this.b, this.a, e02.a);
            System.arraycopy(e02.c, 0, this.c, this.a, e02.a);
            this.a = n2;
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object objectArray) {
        if (this == objectArray) {
            return true;
        }
        if (objectArray == null) {
            return false;
        }
        if (!(objectArray instanceof E0)) {
            return false;
        }
        objectArray = (E0)objectArray;
        int n2 = this.a;
        if (n2 == objectArray.a) {
            int n3;
            Object[] objectArray2;
            block8: {
                int[] nArray = this.b;
                objectArray2 = objectArray.b;
                for (n3 = 0; n3 < n2; ++n3) {
                    if (nArray[n3] == objectArray2[n3]) continue;
                    n3 = 0;
                    break block8;
                }
                n3 = 1;
            }
            if (n3 != 0) {
                block9: {
                    objectArray2 = this.c;
                    objectArray = objectArray.c;
                    n2 = this.a;
                    for (n3 = 0; n3 < n2; ++n3) {
                        if (objectArray2[n3].equals(objectArray[n3])) continue;
                        n3 = 0;
                        break block9;
                    }
                    n3 = 1;
                }
                if (n3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    final void g(StringBuilder stringBuilder, int n2) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            l0.b(stringBuilder, n2, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    final void h(int n2, Object object) {
        if (this.e) {
            this.a(this.a + 1);
            int[] nArray = this.b;
            int n3 = this.a;
            nArray[n3] = n2;
            this.c[n3] = object;
            this.a = n3 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a;
        Object[] objectArray = this.b;
        int n4 = 0;
        int n5 = 17;
        int n6 = 17;
        for (n2 = 0; n2 < n3; ++n2) {
            n6 = n6 * 31 + objectArray[n2];
        }
        objectArray = this.c;
        int n7 = this.a;
        for (n2 = n4; n2 < n7; ++n2) {
            n5 = n5 * 31 + objectArray[n2].hashCode();
        }
        return ((527 + n3) * 31 + n6) * 31 + n5;
    }
}

