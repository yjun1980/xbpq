/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.v.c;
import com.github.catvod.spider.merge.v.d;

public final class e {
    private static final e[] d = e.a();
    private final int a;
    private final d[] b;
    private final int c;

    private e(int n2, d ... objectArray) {
        this.a = n2;
        this.b = objectArray;
        int n3 = objectArray[0].b();
        objectArray = objectArray[0].a();
        int n4 = objectArray.length;
        int n5 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            Object object = objectArray[n2];
            int n6 = ((c)object).a();
            n5 += (((c)object).b() + n3) * n6;
        }
        this.c = n5;
    }

    private static e[] a() {
        return new e[]{new e(1, new d(7, new c(1, 19)), new d(10, new c(1, 16)), new d(13, new c(1, 13)), new d(17, new c(1, 9))), new e(2, new d(10, new c(1, 34)), new d(16, new c(1, 28)), new d(22, new c(1, 22)), new d(28, new c(1, 16))), new e(3, new d(15, new c(1, 55)), new d(26, new c(1, 44)), new d(18, new c(2, 17)), new d(22, new c(2, 13))), new e(4, new d(20, new c(1, 80)), new d(18, new c(2, 32)), new d(26, new c(2, 24)), new d(16, new c(4, 9))), new e(5, new d(26, new c(1, 108)), new d(24, new c(2, 43)), new d(18, new c(2, 15), new c(2, 16)), new d(22, new c(2, 11), new c(2, 12))), new e(6, new d(18, new c(2, 68)), new d(16, new c(4, 27)), new d(24, new c(4, 19)), new d(28, new c(4, 15))), new e(7, new d(20, new c(2, 78)), new d(18, new c(4, 31)), new d(18, new c(2, 14), new c(4, 15)), new d(26, new c(4, 13), new c(1, 14))), new e(8, new d(24, new c(2, 97)), new d(22, new c(2, 38), new c(2, 39)), new d(22, new c(4, 18), new c(2, 19)), new d(26, new c(4, 14), new c(2, 15))), new e(9, new d(30, new c(2, 116)), new d(22, new c(3, 36), new c(2, 37)), new d(20, new c(4, 16), new c(4, 17)), new d(24, new c(4, 12), new c(4, 13))), new e(10, new d(18, new c(2, 68), new c(2, 69)), new d(26, new c(4, 43), new c(1, 44)), new d(24, new c(6, 19), new c(2, 20)), new d(28, new c(6, 15), new c(2, 16))), new e(11, new d(20, new c(4, 81)), new d(30, new c(1, 50), new c(4, 51)), new d(28, new c(4, 22), new c(4, 23)), new d(24, new c(3, 12), new c(8, 13))), new e(12, new d(24, new c(2, 92), new c(2, 93)), new d(22, new c(6, 36), new c(2, 37)), new d(26, new c(4, 20), new c(6, 21)), new d(28, new c(7, 14), new c(4, 15))), new e(13, new d(26, new c(4, 107)), new d(22, new c(8, 37), new c(1, 38)), new d(24, new c(8, 20), new c(4, 21)), new d(22, new c(12, 11), new c(4, 12))), new e(14, new d(30, new c(3, 115), new c(1, 116)), new d(24, new c(4, 40), new c(5, 41)), new d(20, new c(11, 16), new c(5, 17)), new d(24, new c(11, 12), new c(5, 13))), new e(15, new d(22, new c(5, 87), new c(1, 88)), new d(24, new c(5, 41), new c(5, 42)), new d(30, new c(5, 24), new c(7, 25)), new d(24, new c(11, 12), new c(7, 13))), new e(16, new d(24, new c(5, 98), new c(1, 99)), new d(28, new c(7, 45), new c(3, 46)), new d(24, new c(15, 19), new c(2, 20)), new d(30, new c(3, 15), new c(13, 16))), new e(17, new d(28, new c(1, 107), new c(5, 108)), new d(28, new c(10, 46), new c(1, 47)), new d(28, new c(1, 22), new c(15, 23)), new d(28, new c(2, 14), new c(17, 15))), new e(18, new d(30, new c(5, 120), new c(1, 121)), new d(26, new c(9, 43), new c(4, 44)), new d(28, new c(17, 22), new c(1, 23)), new d(28, new c(2, 14), new c(19, 15))), new e(19, new d(28, new c(3, 113), new c(4, 114)), new d(26, new c(3, 44), new c(11, 45)), new d(26, new c(17, 21), new c(4, 22)), new d(26, new c(9, 13), new c(16, 14))), new e(20, new d(28, new c(3, 107), new c(5, 108)), new d(26, new c(3, 41), new c(13, 42)), new d(30, new c(15, 24), new c(5, 25)), new d(28, new c(15, 15), new c(10, 16))), new e(21, new d(28, new c(4, 116), new c(4, 117)), new d(26, new c(17, 42)), new d(28, new c(17, 22), new c(6, 23)), new d(30, new c(19, 16), new c(6, 17))), new e(22, new d(28, new c(2, 111), new c(7, 112)), new d(28, new c(17, 46)), new d(30, new c(7, 24), new c(16, 25)), new d(24, new c(34, 13))), new e(23, new d(30, new c(4, 121), new c(5, 122)), new d(28, new c(4, 47), new c(14, 48)), new d(30, new c(11, 24), new c(14, 25)), new d(30, new c(16, 15), new c(14, 16))), new e(24, new d(30, new c(6, 117), new c(4, 118)), new d(28, new c(6, 45), new c(14, 46)), new d(30, new c(11, 24), new c(16, 25)), new d(30, new c(30, 16), new c(2, 17))), new e(25, new d(26, new c(8, 106), new c(4, 107)), new d(28, new c(8, 47), new c(13, 48)), new d(30, new c(7, 24), new c(22, 25)), new d(30, new c(22, 15), new c(13, 16))), new e(26, new d(28, new c(10, 114), new c(2, 115)), new d(28, new c(19, 46), new c(4, 47)), new d(28, new c(28, 22), new c(6, 23)), new d(30, new c(33, 16), new c(4, 17))), new e(27, new d(30, new c(8, 122), new c(4, 123)), new d(28, new c(22, 45), new c(3, 46)), new d(30, new c(8, 23), new c(26, 24)), new d(30, new c(12, 15), new c(28, 16))), new e(28, new d(30, new c(3, 117), new c(10, 118)), new d(28, new c(3, 45), new c(23, 46)), new d(30, new c(4, 24), new c(31, 25)), new d(30, new c(11, 15), new c(31, 16))), new e(29, new d(30, new c(7, 116), new c(7, 117)), new d(28, new c(21, 45), new c(7, 46)), new d(30, new c(1, 23), new c(37, 24)), new d(30, new c(19, 15), new c(26, 16))), new e(30, new d(30, new c(5, 115), new c(10, 116)), new d(28, new c(19, 47), new c(10, 48)), new d(30, new c(15, 24), new c(25, 25)), new d(30, new c(23, 15), new c(25, 16))), new e(31, new d(30, new c(13, 115), new c(3, 116)), new d(28, new c(2, 46), new c(29, 47)), new d(30, new c(42, 24), new c(1, 25)), new d(30, new c(23, 15), new c(28, 16))), new e(32, new d(30, new c(17, 115)), new d(28, new c(10, 46), new c(23, 47)), new d(30, new c(10, 24), new c(35, 25)), new d(30, new c(19, 15), new c(35, 16))), new e(33, new d(30, new c(17, 115), new c(1, 116)), new d(28, new c(14, 46), new c(21, 47)), new d(30, new c(29, 24), new c(19, 25)), new d(30, new c(11, 15), new c(46, 16))), new e(34, new d(30, new c(13, 115), new c(6, 116)), new d(28, new c(14, 46), new c(23, 47)), new d(30, new c(44, 24), new c(7, 25)), new d(30, new c(59, 16), new c(1, 17))), new e(35, new d(30, new c(12, 121), new c(7, 122)), new d(28, new c(12, 47), new c(26, 48)), new d(30, new c(39, 24), new c(14, 25)), new d(30, new c(22, 15), new c(41, 16))), new e(36, new d(30, new c(6, 121), new c(14, 122)), new d(28, new c(6, 47), new c(34, 48)), new d(30, new c(46, 24), new c(10, 25)), new d(30, new c(2, 15), new c(64, 16))), new e(37, new d(30, new c(17, 122), new c(4, 123)), new d(28, new c(29, 46), new c(14, 47)), new d(30, new c(49, 24), new c(10, 25)), new d(30, new c(24, 15), new c(46, 16))), new e(38, new d(30, new c(4, 122), new c(18, 123)), new d(28, new c(13, 46), new c(32, 47)), new d(30, new c(48, 24), new c(14, 25)), new d(30, new c(42, 15), new c(32, 16))), new e(39, new d(30, new c(20, 117), new c(4, 118)), new d(28, new c(40, 47), new c(7, 48)), new d(30, new c(43, 24), new c(22, 25)), new d(30, new c(10, 15), new c(67, 16))), new e(40, new d(30, new c(19, 118), new c(6, 119)), new d(28, new c(18, 47), new c(31, 48)), new d(30, new c(34, 24), new c(34, 25)), new d(30, new c(20, 15), new c(61, 16)))};
    }

    public static e e(int n2) {
        if (n2 > 0 && n2 <= 40) {
            return d[n2 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final int b() {
        return this.a * 4 + 17;
    }

    public final d c(int n2) {
        d[] dArray = this.b;
        if (n2 != 0) {
            return dArray[n2 - 1];
        }
        throw null;
    }

    public final int d() {
        return this.c;
    }

    public final int f() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

