package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.C0060a;
import java.io.StringReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        new g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(m mVar, String str, int i) {
        int i2;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        mVar.c = new String[i];
        mVar.d = new int[i];
        mVar.e = new int[i];
        mVar.f = new String[i];
        C0060a c0060a = new C0060a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0060a.t()) {
            String o = c0060a.o('=');
            c0060a.a();
            int parseInt = Integer.parseInt(c0060a.p(a), 36);
            char s = c0060a.s();
            c0060a.a();
            if (s == ',') {
                i2 = Integer.parseInt(c0060a.o(';'), 36);
                c0060a.a();
            } else {
                i2 = -1;
            }
            int parseInt2 = Integer.parseInt(c0060a.o('&'), 36);
            c0060a.a();
            strArr = mVar.c;
            strArr[i3] = o;
            iArr = mVar.d;
            iArr[i3] = parseInt;
            iArr2 = mVar.e;
            iArr2[parseInt2] = parseInt;
            strArr2 = mVar.f;
            strArr2[parseInt2] = o;
            if (i2 != -1) {
                b.put(o, new String(new int[]{parseInt, i2}, 0, 2));
            }
            i3++;
        }
        if (!(i3 == i)) {
            throw new IllegalArgumentException(cYh.d("323E2429273F04242435773908252F2577350170243F23331339242277360831253433"));
        }
    }

    private static void b(Appendable appendable, m mVar, int i) {
        Appendable append;
        String j = mVar.j(i);
        if ("".equals(j)) {
            append = appendable.append(cYh.d("417339"));
            j = Integer.toHexString(i);
        } else {
            append = appendable.append('&');
        }
        append.append(j).append(';');
    }

    public static int c(String str, int[] iArr) {
        String str2 = b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int i = m.i.i(str);
        if (i == -1) {
            return 0;
        }
        iArr[0] = i;
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r12 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        b(r15, r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
    
        if (r2.canEncode(r12) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.c0.g r17, boolean r18, boolean r19, boolean r20) {
        /*
            r0 = r15
            com.github.catvod.spider.merge.c0.m r1 = r17.c()
            java.nio.charset.CharsetEncoder r2 = r17.b()
            r3 = r17
            int r4 = r3.f
            int r5 = r16.length()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L15:
            if (r7 >= r5) goto Lc7
            r10 = r16
            int r11 = r10.codePointAt(r7)
            r12 = 1
            if (r19 == 0) goto L38
            boolean r13 = com.github.catvod.spider.merge.b0.b.d(r11)
            if (r13 == 0) goto L36
            if (r20 == 0) goto L2a
            if (r8 == 0) goto Lc0
        L2a:
            if (r9 == 0) goto L2e
            goto Lc0
        L2e:
            r9 = 32
            r15.append(r9)
            r9 = 1
            goto Lc0
        L36:
            r8 = 1
            r9 = 0
        L38:
            r13 = 65536(0x10000, float:9.18355E-41)
            if (r11 >= r13) goto Laa
            char r13 = (char) r11
            r14 = 34
            if (r13 == r14) goto L9d
            r14 = 38
            if (r13 == r14) goto L96
            r14 = 60
            if (r13 == r14) goto L82
            r14 = 62
            if (r13 == r14) goto L79
            r14 = 160(0xa0, float:2.24E-43)
            if (r13 == r14) goto L67
            int r14 = com.github.catvod.spider.merge.l.C0167a.a(r4)
            if (r14 == 0) goto L5e
            if (r14 == r12) goto L64
            boolean r12 = r2.canEncode(r13)
            goto L64
        L5e:
            r14 = 128(0x80, float:1.794E-43)
            if (r13 >= r14) goto L63
            goto L64
        L63:
            r12 = 0
        L64:
            if (r12 == 0) goto Lbd
            goto La6
        L67:
            com.github.catvod.spider.merge.c0.m r12 = com.github.catvod.spider.merge.c0.m.g
            if (r1 == r12) goto L72
            java.lang.String r12 = "413E23222761"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        L72:
            java.lang.String r12 = "417339306761"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        L79:
            if (r18 != 0) goto La6
            java.lang.String r12 = "4137356A"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        L82:
            if (r18 == 0) goto L8f
            com.github.catvod.spider.merge.c0.m r12 = com.github.catvod.spider.merge.c0.m.g
            if (r1 == r12) goto L8f
            int r12 = r17.g()
            r14 = 2
            if (r12 != r14) goto La6
        L8f:
            java.lang.String r12 = "413C356A"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        L96:
            java.lang.String r12 = "41312C216C"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        L9d:
            if (r18 == 0) goto La6
            java.lang.String r12 = "4121343E2361"
            java.lang.String r12 = com.github.catvod.spider.merge.cYh.d(r12)
            goto Lb9
        La6:
            r15.append(r13)
            goto Lc0
        Laa:
            java.lang.String r12 = new java.lang.String
            char[] r13 = java.lang.Character.toChars(r11)
            r12.<init>(r13)
            boolean r13 = r2.canEncode(r12)
            if (r13 == 0) goto Lbd
        Lb9:
            r15.append(r12)
            goto Lc0
        Lbd:
            b(r15, r1, r11)
        Lc0:
            int r11 = java.lang.Character.charCount(r11)
            int r7 = r7 + r11
            goto L15
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c0.n.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.c0.g, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return m.h.i(str) != -1;
    }

    public static boolean f(String str) {
        return m.i.i(str) != -1;
    }
}
