package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class a extends s {
    private static final int d;
    public static final a e = new a();

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r0.intValue() < 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[SYNTHETIC] */
    static {
        /*
            com.github.catvod.spider.merge.L.a r0 = new com.github.catvod.spider.merge.L.a
            r0.<init>()
            com.github.catvod.spider.merge.L.a.e = r0
            r0 = 0
            java.lang.String r1 = "0C3F353D3E341F7E223E25351224283F322949342437362F0B246F213628063C2D343B33143D"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 == 0) goto L9b
            r2 = 10
            com.github.catvod.spider.merge.K.a.b(r2)
            int r3 = r1.length()
            r4 = 1
            if (r3 != 0) goto L23
            goto L7a
        L23:
            r5 = 0
            char r6 = r1.charAt(r5)
            r7 = 48
            int r7 = com.github.catvod.spider.merge.E.f.f(r6, r7)
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 >= 0) goto L45
            if (r3 != r4) goto L36
            goto L7a
        L36:
            r7 = 45
            if (r6 != r7) goto L3f
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r7 = 1
            goto L47
        L3f:
            r7 = 43
            if (r6 != r7) goto L7a
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            r7 = 0
        L47:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L4d:
            if (r6 >= r3) goto L6e
            char r11 = r1.charAt(r6)
            int r11 = java.lang.Character.digit(r11, r2)
            if (r11 >= 0) goto L5a
            goto L7a
        L5a:
            if (r5 >= r10) goto L63
            if (r10 != r9) goto L7a
            int r10 = r8 / 10
            if (r5 >= r10) goto L63
            goto L7a
        L63:
            int r5 = r5 * 10
            int r12 = r8 + r11
            if (r5 >= r12) goto L6a
            goto L7a
        L6a:
            int r5 = r5 - r11
            int r6 = r6 + 1
            goto L4d
        L6e:
            if (r7 == 0) goto L75
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L7a
        L75:
            int r0 = -r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7a:
            if (r0 == 0) goto L87
            int r2 = r0.intValue()
            if (r2 < r4) goto L87
            int r0 = r0.intValue()
            goto L9c
        L87:
            java.lang.String r0 = "22283134342E0234612138290E242827327A09252C33322847392F713C35133C283F2F74043F333E222E0E3E2422793E023620243B2E4920202336360B352D3824374B702324237A0F313271"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            java.lang.String r0 = com.github.catvod.spider.merge.b.n.a(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L9b:
            r0 = -1
        L9c:
            com.github.catvod.spider.merge.L.a.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.a.<clinit>():void");
    }

    private a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException(cYh.d("243C2E22327A04312F3F382E473224713E34113F2A34337A083E611238370A3F2F0138350B").toString());
    }

    @Override // com.github.catvod.spider.merge.L.e
    public final String toString() {
        return cYh.d("243F2C3C3834373F2E3D");
    }
}
