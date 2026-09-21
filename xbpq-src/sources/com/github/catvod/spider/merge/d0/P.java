package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class P {
    private String a;
    private int b = 0;

    public P(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                a.append(c2);
            }
            i++;
            c = c2;
        }
        return com.github.catvod.spider.merge.b0.b.g(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[EDGE_INSN: B:21:0x0046->B:22:0x0046 BREAK  A[LOOP:0: B:2:0x0007->B:30:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:2:0x0007->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(char r10, char r11) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L7:
            boolean r7 = r9.i()
            if (r7 == 0) goto Le
            goto L46
        Le:
            char r7 = r9.c()
            r8 = 92
            if (r1 == r8) goto L3d
            r8 = 39
            if (r7 != r8) goto L21
            if (r7 == r10) goto L21
            if (r2 != 0) goto L21
            r4 = r4 ^ 1
            goto L2b
        L21:
            r8 = 34
            if (r7 != r8) goto L2b
            if (r7 == r10) goto L2b
            if (r4 != 0) goto L2b
            r2 = r2 ^ 1
        L2b:
            if (r4 != 0) goto L44
            if (r2 == 0) goto L30
            goto L44
        L30:
            if (r7 != r10) goto L39
            int r3 = r3 + 1
            if (r5 != r0) goto L3d
            int r5 = r9.b
            goto L3d
        L39:
            if (r7 != r11) goto L3d
            int r3 = r3 + (-1)
        L3d:
            if (r3 <= 0) goto L43
            if (r1 == 0) goto L43
            int r6 = r9.b
        L43:
            r1 = r7
        L44:
            if (r3 > 0) goto L7
        L46:
            if (r6 < 0) goto L4f
            java.lang.String r10 = r9.a
            java.lang.String r10 = r10.substring(r5, r6)
            goto L51
        L4f:
            java.lang.String r10 = ""
        L51:
            if (r3 > 0) goto L54
            return r10
        L54:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "23392571393513702738393E4732203D3634043525713A3B153B2423773B137066"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = "40"
            java.lang.String r10 = com.github.catvod.spider.merge.cYh.d(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.github.catvod.spider.merge.N.a.a(r10)
            r10 = 0
            goto L78
        L77:
            throw r10
        L78:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.P.a(char, char):java.lang.String");
    }

    public final String b() {
        String n;
        String str = this.a;
        int i = this.b;
        String d = cYh.d("4E");
        int indexOf = str.indexOf(d, i);
        if (indexOf != -1) {
            n = this.a.substring(this.b, indexOf);
            this.b = n.length() + this.b;
        } else {
            n = n();
        }
        j(d);
        return n;
    }

    public final char c() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public final void d(String str) {
        if (!k(str)) {
            throw new IllegalStateException(cYh.d("36252424327A03392571393513702C3023390F702429273F04242435772902213434393902"));
        }
        int length = str.length();
        int length2 = this.a.length();
        int i = this.b;
        if (length > length2 - i) {
            throw new IllegalStateException(cYh.d("36252424327A093F35713B3509376134393512372971233547332E3F242F0A356122322B12352F3232"));
        }
        this.b = i + length;
    }

    public final String e() {
        int i = this.b;
        while (!i()) {
            if (!m()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!i()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break;
                        }
                        if (this.a.charAt(this.b) == cArr[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final String f() {
        int i = this.b;
        while (!i() && (m() || l(cYh.d("4D2C"), cYh.d("1B"), cYh.d("38"), cYh.d("4A")))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final String g(String... strArr) {
        int i = this.b;
        while (!i() && !l(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final boolean h() {
        boolean z = false;
        while (true) {
            if (!(!i() && com.github.catvod.spider.merge.b0.b.d(this.a.charAt(this.b)))) {
                return z;
            }
            this.b++;
            z = true;
        }
    }

    public final boolean i() {
        return this.a.length() - this.b == 0;
    }

    public final boolean j(String str) {
        if (!k(str)) {
            return false;
        }
        this.b = str.length() + this.b;
        return true;
    }

    public final boolean k(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public final boolean l(String... strArr) {
        for (String str : strArr) {
            if (k(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return !i() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public final String n() {
        String substring = this.a.substring(this.b);
        this.b = this.a.length();
        return substring;
    }

    public final String toString() {
        return this.a.substring(this.b);
    }
}
