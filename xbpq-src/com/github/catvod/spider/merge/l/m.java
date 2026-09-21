/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.s;

public final class m {
    private static String a(int n2, int n3, String charSequence) {
        if (n2 < 0) {
            return s.b(cYh.d("4223617972294E702C24242E473E2E25773802702F34303B13393734"), charSequence, n2);
        }
        if (n3 >= 0) {
            return s.b(cYh.d("4223617972294E702C24242E473E2E25773802702623323B133533712332063E61223E20027069742473"), charSequence, n2, n3);
        }
        charSequence = new StringBuilder(26);
        ((StringBuilder)charSequence).append(cYh.d("093526302333113561223E20026A61"));
        ((StringBuilder)charSequence).append(n3);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    public static void b(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int c(int n2, int n3) {
        if (n2 >= 0) {
            if (n2 < n3) return n2;
        }
        CharSequence charSequence = cYh.d("0E3E25342F");
        if (n2 < 0) {
            charSequence = s.b(cYh.d("4223617972294E702C24242E473E2E25773802702F34303B13393734"), charSequence, n2);
            throw new IndexOutOfBoundsException((String)charSequence);
        }
        if (n3 >= 0) {
            charSequence = s.b(cYh.d("4223617972294E702C24242E473224713B3F142361253F3B097032382D3F477864227E"), charSequence, n2, n3);
            throw new IndexOutOfBoundsException((String)charSequence);
        }
        charSequence = new StringBuilder(26);
        ((StringBuilder)charSequence).append(cYh.d("093526302333113561223E20026A61"));
        ((StringBuilder)charSequence).append(n3);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    public static int d(int n2, int n3) {
        if (n2 >= 0 && n2 <= n3) {
            return n2;
        }
        throw new IndexOutOfBoundsException(m.a(n2, n3, cYh.d("0E3E25342F")));
    }

    public static void e(int n2, int n3, int n4) {
        if (n2 >= 0 && n3 >= n2 && n3 <= n4) {
            return;
        }
        String string = n2 >= 0 && n2 <= n4 ? (n3 >= 0 && n3 <= n4 ? s.b(cYh.d("023E25713E34033539717F7F1479613C222913702F3E237A0535613D322914703539363447233530252E47392F353222477864227E"), n3, n2) : m.a(n3, n4, cYh.d("023E25713E34033539"))) : m.a(n2, n4, cYh.d("14242023237A0E3E25342F"));
        throw new IndexOutOfBoundsException(string);
    }

    public static void f(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void g(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }
}

