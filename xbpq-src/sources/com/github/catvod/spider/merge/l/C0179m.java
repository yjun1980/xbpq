package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179m {
    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return C0185s.b(cYh.d("4223617972294E702C24242E473E2E25773802702F34303B13393734"), str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C0185s.b(cYh.d("4223617972294E702C24242E473E2E25773802702623323B133533712332063E61223E20027069742473"), str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append(cYh.d("093526302333113561223E20026A61"));
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i, int i2) {
        String b;
        if (i >= 0 && i < i2) {
            return i;
        }
        String d = cYh.d("0E3E25342F");
        if (i < 0) {
            b = C0185s.b(cYh.d("4223617972294E702C24242E473E2E25773802702F34303B13393734"), d, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append(cYh.d("093526302333113561223E20026A61"));
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            b = C0185s.b(cYh.d("4223617972294E702C24242E473224713B3F142361253F3B097032382D3F477864227E"), d, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(b);
    }

    public static int d(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, cYh.d("0E3E25342F")));
        }
        return i;
    }

    public static void e(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? a(i, i3, cYh.d("14242023237A0E3E25342F")) : (i2 < 0 || i2 > i3) ? a(i2, i3, cYh.d("023E25713E34033539")) : C0185s.b(cYh.d("023E25713E34033539717F7F1479613C222913702F3E237A0535613D322914703539363447233530252E47392F353222477864227E"), Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
