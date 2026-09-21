package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
class i extends h {
    public static boolean a(CharSequence charSequence) {
        return e(charSequence, cYh.d("0035352238390C3E203C327A0131283D323E"), false, 2) >= 0;
    }

    public static final int b(CharSequence charSequence) {
        com.github.catvod.spider.merge.E.f.e(charSequence, cYh.d("5B2429382464"));
        return charSequence.length() - 1;
    }

    public static final int c(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? d(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int d(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            r0 = 0
            r1 = -1
            if (r11 != 0) goto L14
            com.github.catvod.spider.merge.H.c r11 = new com.github.catvod.spider.merge.H.c
            if (r8 >= 0) goto L9
            r8 = 0
        L9:
            int r2 = r6.length()
            if (r9 <= r2) goto L10
            r9 = r2
        L10:
            r11.<init>(r8, r9)
            goto L23
        L14:
            int r11 = b(r6)
            if (r8 <= r11) goto L1b
            r8 = r11
        L1b:
            if (r9 >= 0) goto L1e
            r9 = 0
        L1e:
            com.github.catvod.spider.merge.H.a r11 = new com.github.catvod.spider.merge.H.a
            r11.<init>(r8, r9, r1)
        L23:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L54
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L54
            int r8 = r11.a()
            int r9 = r11.b()
            int r11 = r11.c()
            if (r11 <= 0) goto L3b
            if (r8 <= r9) goto L3f
        L3b:
            if (r11 >= 0) goto La9
            if (r9 > r8) goto La9
        L3f:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r7.length()
            boolean r0 = f(r0, r2, r8, r3, r10)
            if (r0 == 0) goto L50
            return r8
        L50:
            if (r8 == r9) goto La9
            int r8 = r8 + r11
            goto L3f
        L54:
            int r8 = r11.a()
            int r9 = r11.b()
            int r11 = r11.c()
            if (r11 <= 0) goto L64
            if (r8 <= r9) goto L68
        L64:
            if (r11 >= 0) goto La9
            if (r9 > r8) goto La9
        L68:
            int r2 = r7.length()
            java.lang.String r3 = "0824293425"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            com.github.catvod.spider.merge.E.f.e(r6, r3)
            if (r8 < 0) goto La1
            int r3 = r7.length()
            int r3 = r3 - r2
            if (r3 < 0) goto La1
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r8 <= r3) goto L86
            goto La1
        L86:
            r3 = 0
        L87:
            if (r3 >= r2) goto L9f
            int r4 = r0 + r3
            char r4 = r7.charAt(r4)
            int r5 = r8 + r3
            char r5 = r6.charAt(r5)
            boolean r4 = com.github.catvod.spider.merge.K.b.a(r4, r5, r10)
            if (r4 != 0) goto L9c
            goto La1
        L9c:
            int r3 = r3 + 1
            goto L87
        L9f:
            r2 = 1
            goto La2
        La1:
            r2 = 0
        La2:
            if (r2 == 0) goto La5
            return r8
        La5:
            if (r8 == r9) goto La9
            int r8 = r8 + r11
            goto L68
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.K.i.d(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    public static /* synthetic */ int e(CharSequence charSequence, String str, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c(charSequence, str, 0, z);
    }

    public static final boolean f(String str, String str2, int i, int i2, boolean z) {
        com.github.catvod.spider.merge.E.f.e(str, cYh.d("5B2429382464"));
        com.github.catvod.spider.merge.E.f.e(str2, cYh.d("0824293425"));
        return !z ? str.regionMatches(0, str2, i, i2) : str.regionMatches(z, 0, str2, i, i2);
    }
}
