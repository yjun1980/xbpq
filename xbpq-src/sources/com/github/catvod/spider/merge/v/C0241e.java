package com.github.catvod.spider.merge.v;

/* renamed from: com.github.catvod.spider.merge.v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241e {
    private static final C0241e[] d = a();
    private final int a;
    private final C0240d[] b;
    private final int c;

    private C0241e(int i, C0240d... c0240dArr) {
        this.a = i;
        this.b = c0240dArr;
        int b = c0240dArr[0].b();
        int i2 = 0;
        for (C0239c c0239c : c0240dArr[0].a()) {
            i2 += (c0239c.b() + b) * c0239c.a();
        }
        this.c = i2;
    }

    private static C0241e[] a() {
        return new C0241e[]{new C0241e(1, new C0240d(7, new C0239c(1, 19)), new C0240d(10, new C0239c(1, 16)), new C0240d(13, new C0239c(1, 13)), new C0240d(17, new C0239c(1, 9))), new C0241e(2, new C0240d(10, new C0239c(1, 34)), new C0240d(16, new C0239c(1, 28)), new C0240d(22, new C0239c(1, 22)), new C0240d(28, new C0239c(1, 16))), new C0241e(3, new C0240d(15, new C0239c(1, 55)), new C0240d(26, new C0239c(1, 44)), new C0240d(18, new C0239c(2, 17)), new C0240d(22, new C0239c(2, 13))), new C0241e(4, new C0240d(20, new C0239c(1, 80)), new C0240d(18, new C0239c(2, 32)), new C0240d(26, new C0239c(2, 24)), new C0240d(16, new C0239c(4, 9))), new C0241e(5, new C0240d(26, new C0239c(1, 108)), new C0240d(24, new C0239c(2, 43)), new C0240d(18, new C0239c(2, 15), new C0239c(2, 16)), new C0240d(22, new C0239c(2, 11), new C0239c(2, 12))), new C0241e(6, new C0240d(18, new C0239c(2, 68)), new C0240d(16, new C0239c(4, 27)), new C0240d(24, new C0239c(4, 19)), new C0240d(28, new C0239c(4, 15))), new C0241e(7, new C0240d(20, new C0239c(2, 78)), new C0240d(18, new C0239c(4, 31)), new C0240d(18, new C0239c(2, 14), new C0239c(4, 15)), new C0240d(26, new C0239c(4, 13), new C0239c(1, 14))), new C0241e(8, new C0240d(24, new C0239c(2, 97)), new C0240d(22, new C0239c(2, 38), new C0239c(2, 39)), new C0240d(22, new C0239c(4, 18), new C0239c(2, 19)), new C0240d(26, new C0239c(4, 14), new C0239c(2, 15))), new C0241e(9, new C0240d(30, new C0239c(2, 116)), new C0240d(22, new C0239c(3, 36), new C0239c(2, 37)), new C0240d(20, new C0239c(4, 16), new C0239c(4, 17)), new C0240d(24, new C0239c(4, 12), new C0239c(4, 13))), new C0241e(10, new C0240d(18, new C0239c(2, 68), new C0239c(2, 69)), new C0240d(26, new C0239c(4, 43), new C0239c(1, 44)), new C0240d(24, new C0239c(6, 19), new C0239c(2, 20)), new C0240d(28, new C0239c(6, 15), new C0239c(2, 16))), new C0241e(11, new C0240d(20, new C0239c(4, 81)), new C0240d(30, new C0239c(1, 50), new C0239c(4, 51)), new C0240d(28, new C0239c(4, 22), new C0239c(4, 23)), new C0240d(24, new C0239c(3, 12), new C0239c(8, 13))), new C0241e(12, new C0240d(24, new C0239c(2, 92), new C0239c(2, 93)), new C0240d(22, new C0239c(6, 36), new C0239c(2, 37)), new C0240d(26, new C0239c(4, 20), new C0239c(6, 21)), new C0240d(28, new C0239c(7, 14), new C0239c(4, 15))), new C0241e(13, new C0240d(26, new C0239c(4, 107)), new C0240d(22, new C0239c(8, 37), new C0239c(1, 38)), new C0240d(24, new C0239c(8, 20), new C0239c(4, 21)), new C0240d(22, new C0239c(12, 11), new C0239c(4, 12))), new C0241e(14, new C0240d(30, new C0239c(3, 115), new C0239c(1, 116)), new C0240d(24, new C0239c(4, 40), new C0239c(5, 41)), new C0240d(20, new C0239c(11, 16), new C0239c(5, 17)), new C0240d(24, new C0239c(11, 12), new C0239c(5, 13))), new C0241e(15, new C0240d(22, new C0239c(5, 87), new C0239c(1, 88)), new C0240d(24, new C0239c(5, 41), new C0239c(5, 42)), new C0240d(30, new C0239c(5, 24), new C0239c(7, 25)), new C0240d(24, new C0239c(11, 12), new C0239c(7, 13))), new C0241e(16, new C0240d(24, new C0239c(5, 98), new C0239c(1, 99)), new C0240d(28, new C0239c(7, 45), new C0239c(3, 46)), new C0240d(24, new C0239c(15, 19), new C0239c(2, 20)), new C0240d(30, new C0239c(3, 15), new C0239c(13, 16))), new C0241e(17, new C0240d(28, new C0239c(1, 107), new C0239c(5, 108)), new C0240d(28, new C0239c(10, 46), new C0239c(1, 47)), new C0240d(28, new C0239c(1, 22), new C0239c(15, 23)), new C0240d(28, new C0239c(2, 14), new C0239c(17, 15))), new C0241e(18, new C0240d(30, new C0239c(5, 120), new C0239c(1, 121)), new C0240d(26, new C0239c(9, 43), new C0239c(4, 44)), new C0240d(28, new C0239c(17, 22), new C0239c(1, 23)), new C0240d(28, new C0239c(2, 14), new C0239c(19, 15))), new C0241e(19, new C0240d(28, new C0239c(3, 113), new C0239c(4, 114)), new C0240d(26, new C0239c(3, 44), new C0239c(11, 45)), new C0240d(26, new C0239c(17, 21), new C0239c(4, 22)), new C0240d(26, new C0239c(9, 13), new C0239c(16, 14))), new C0241e(20, new C0240d(28, new C0239c(3, 107), new C0239c(5, 108)), new C0240d(26, new C0239c(3, 41), new C0239c(13, 42)), new C0240d(30, new C0239c(15, 24), new C0239c(5, 25)), new C0240d(28, new C0239c(15, 15), new C0239c(10, 16))), new C0241e(21, new C0240d(28, new C0239c(4, 116), new C0239c(4, 117)), new C0240d(26, new C0239c(17, 42)), new C0240d(28, new C0239c(17, 22), new C0239c(6, 23)), new C0240d(30, new C0239c(19, 16), new C0239c(6, 17))), new C0241e(22, new C0240d(28, new C0239c(2, 111), new C0239c(7, 112)), new C0240d(28, new C0239c(17, 46)), new C0240d(30, new C0239c(7, 24), new C0239c(16, 25)), new C0240d(24, new C0239c(34, 13))), new C0241e(23, new C0240d(30, new C0239c(4, 121), new C0239c(5, 122)), new C0240d(28, new C0239c(4, 47), new C0239c(14, 48)), new C0240d(30, new C0239c(11, 24), new C0239c(14, 25)), new C0240d(30, new C0239c(16, 15), new C0239c(14, 16))), new C0241e(24, new C0240d(30, new C0239c(6, 117), new C0239c(4, 118)), new C0240d(28, new C0239c(6, 45), new C0239c(14, 46)), new C0240d(30, new C0239c(11, 24), new C0239c(16, 25)), new C0240d(30, new C0239c(30, 16), new C0239c(2, 17))), new C0241e(25, new C0240d(26, new C0239c(8, 106), new C0239c(4, 107)), new C0240d(28, new C0239c(8, 47), new C0239c(13, 48)), new C0240d(30, new C0239c(7, 24), new C0239c(22, 25)), new C0240d(30, new C0239c(22, 15), new C0239c(13, 16))), new C0241e(26, new C0240d(28, new C0239c(10, 114), new C0239c(2, 115)), new C0240d(28, new C0239c(19, 46), new C0239c(4, 47)), new C0240d(28, new C0239c(28, 22), new C0239c(6, 23)), new C0240d(30, new C0239c(33, 16), new C0239c(4, 17))), new C0241e(27, new C0240d(30, new C0239c(8, 122), new C0239c(4, 123)), new C0240d(28, new C0239c(22, 45), new C0239c(3, 46)), new C0240d(30, new C0239c(8, 23), new C0239c(26, 24)), new C0240d(30, new C0239c(12, 15), new C0239c(28, 16))), new C0241e(28, new C0240d(30, new C0239c(3, 117), new C0239c(10, 118)), new C0240d(28, new C0239c(3, 45), new C0239c(23, 46)), new C0240d(30, new C0239c(4, 24), new C0239c(31, 25)), new C0240d(30, new C0239c(11, 15), new C0239c(31, 16))), new C0241e(29, new C0240d(30, new C0239c(7, 116), new C0239c(7, 117)), new C0240d(28, new C0239c(21, 45), new C0239c(7, 46)), new C0240d(30, new C0239c(1, 23), new C0239c(37, 24)), new C0240d(30, new C0239c(19, 15), new C0239c(26, 16))), new C0241e(30, new C0240d(30, new C0239c(5, 115), new C0239c(10, 116)), new C0240d(28, new C0239c(19, 47), new C0239c(10, 48)), new C0240d(30, new C0239c(15, 24), new C0239c(25, 25)), new C0240d(30, new C0239c(23, 15), new C0239c(25, 16))), new C0241e(31, new C0240d(30, new C0239c(13, 115), new C0239c(3, 116)), new C0240d(28, new C0239c(2, 46), new C0239c(29, 47)), new C0240d(30, new C0239c(42, 24), new C0239c(1, 25)), new C0240d(30, new C0239c(23, 15), new C0239c(28, 16))), new C0241e(32, new C0240d(30, new C0239c(17, 115)), new C0240d(28, new C0239c(10, 46), new C0239c(23, 47)), new C0240d(30, new C0239c(10, 24), new C0239c(35, 25)), new C0240d(30, new C0239c(19, 15), new C0239c(35, 16))), new C0241e(33, new C0240d(30, new C0239c(17, 115), new C0239c(1, 116)), new C0240d(28, new C0239c(14, 46), new C0239c(21, 47)), new C0240d(30, new C0239c(29, 24), new C0239c(19, 25)), new C0240d(30, new C0239c(11, 15), new C0239c(46, 16))), new C0241e(34, new C0240d(30, new C0239c(13, 115), new C0239c(6, 116)), new C0240d(28, new C0239c(14, 46), new C0239c(23, 47)), new C0240d(30, new C0239c(44, 24), new C0239c(7, 25)), new C0240d(30, new C0239c(59, 16), new C0239c(1, 17))), new C0241e(35, new C0240d(30, new C0239c(12, 121), new C0239c(7, 122)), new C0240d(28, new C0239c(12, 47), new C0239c(26, 48)), new C0240d(30, new C0239c(39, 24), new C0239c(14, 25)), new C0240d(30, new C0239c(22, 15), new C0239c(41, 16))), new C0241e(36, new C0240d(30, new C0239c(6, 121), new C0239c(14, 122)), new C0240d(28, new C0239c(6, 47), new C0239c(34, 48)), new C0240d(30, new C0239c(46, 24), new C0239c(10, 25)), new C0240d(30, new C0239c(2, 15), new C0239c(64, 16))), new C0241e(37, new C0240d(30, new C0239c(17, 122), new C0239c(4, 123)), new C0240d(28, new C0239c(29, 46), new C0239c(14, 47)), new C0240d(30, new C0239c(49, 24), new C0239c(10, 25)), new C0240d(30, new C0239c(24, 15), new C0239c(46, 16))), new C0241e(38, new C0240d(30, new C0239c(4, 122), new C0239c(18, 123)), new C0240d(28, new C0239c(13, 46), new C0239c(32, 47)), new C0240d(30, new C0239c(48, 24), new C0239c(14, 25)), new C0240d(30, new C0239c(42, 15), new C0239c(32, 16))), new C0241e(39, new C0240d(30, new C0239c(20, 117), new C0239c(4, 118)), new C0240d(28, new C0239c(40, 47), new C0239c(7, 48)), new C0240d(30, new C0239c(43, 24), new C0239c(22, 25)), new C0240d(30, new C0239c(10, 15), new C0239c(67, 16))), new C0241e(40, new C0240d(30, new C0239c(19, 118), new C0239c(6, 119)), new C0240d(28, new C0239c(18, 47), new C0239c(31, 48)), new C0240d(30, new C0239c(34, 24), new C0239c(34, 25)), new C0240d(30, new C0239c(20, 15), new C0239c(61, 16)))};
    }

    public static C0241e e(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return d[i - 1];
    }

    public final int b() {
        return (this.a * 4) + 17;
    }

    public final C0240d c(int i) {
        C0240d[] c0240dArr = this.b;
        if (i != 0) {
            return c0240dArr[i - 1];
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
