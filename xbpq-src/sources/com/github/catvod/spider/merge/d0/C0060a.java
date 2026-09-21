package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private boolean i;

    public C0060a(Reader reader, int i) {
        com.github.catvod.spider.merge.N.a.f(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    private void b() {
        int i;
        int i2;
        boolean z;
        if (this.i || (i = this.e) < this.d) {
            return;
        }
        int i3 = this.g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long skip = this.b.skip(j);
            this.b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.b;
                char[] cArr = this.a;
                int read = reader.read(cArr, i4, cArr.length - i4);
                if (read == -1) {
                    this.i = true;
                }
                if (read <= 0) {
                    break;
                } else {
                    i4 += read;
                }
            }
            this.b.reset();
            if (i4 > 0) {
                if (skip != j) {
                    z = false;
                }
                com.github.catvod.spider.merge.N.a.f(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.b(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String c(char[] r9, java.lang.String[] r10, int r11, int r12) {
        /*
            r0 = 12
            if (r12 <= r0) goto La
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r11, r12)
            return r10
        La:
            r0 = 1
            if (r12 >= r0) goto L10
            java.lang.String r9 = ""
            return r9
        L10:
            int r1 = r12 * 31
            r2 = 0
            r4 = r11
            r3 = 0
        L15:
            if (r3 >= r12) goto L22
            int r1 = r1 * 31
            int r5 = r4 + 1
            char r4 = r9[r4]
            int r1 = r1 + r4
            int r3 = r3 + 1
            r4 = r5
            goto L15
        L22:
            r1 = r1 & 511(0x1ff, float:7.16E-43)
            r3 = r10[r1]
            if (r3 != 0) goto L30
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r1] = r0
            goto L59
        L30:
            int r4 = r3.length()
            if (r12 != r4) goto L4e
            r5 = r11
            r4 = r12
            r6 = 0
        L39:
            int r7 = r4 + (-1)
            if (r4 == 0) goto L4f
            int r4 = r5 + 1
            char r5 = r9[r5]
            int r8 = r6 + 1
            char r6 = r3.charAt(r6)
            if (r5 == r6) goto L4a
            goto L4e
        L4a:
            r5 = r4
            r4 = r7
            r6 = r8
            goto L39
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L52
            return r3
        L52:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r1] = r0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0060a.c(char[], java.lang.String[], int, int):java.lang.String");
    }

    private boolean u() {
        return this.e >= this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A(char[] cArr) {
        b();
        return !t() && Arrays.binarySearch(cArr, this.a[this.e]) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        char c;
        return !t() && (c = this.a[this.e]) >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C() {
        if (t()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2 = r1 + 1;
        r4 = (r9.length() + r2) - 1;
        r5 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 >= r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9.charAt(r3) != r8.a[r5]) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r5 = r5 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return r1 - r8.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != r8.a[r1]) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 >= r8.c) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == r8.a[r1]) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int D(java.lang.CharSequence r9) {
        /*
            r8 = this;
            r8.b()
            r0 = 0
            char r0 = r9.charAt(r0)
            int r1 = r8.e
        La:
            int r2 = r8.c
            if (r1 >= r2) goto L49
            char[] r2 = r8.a
            char r2 = r2[r1]
            r3 = 1
            if (r0 == r2) goto L21
        L15:
            int r1 = r1 + r3
            int r2 = r8.c
            if (r1 >= r2) goto L21
            char[] r2 = r8.a
            char r2 = r2[r1]
            if (r0 == r2) goto L21
            goto L15
        L21:
            int r2 = r1 + 1
            int r4 = r9.length()
            int r4 = r4 + r2
            int r4 = r4 - r3
            int r5 = r8.c
            if (r1 >= r5) goto L47
            if (r4 > r5) goto L47
            r5 = r2
        L30:
            if (r5 >= r4) goto L41
            char r6 = r9.charAt(r3)
            char[] r7 = r8.a
            char r7 = r7[r5]
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L30
        L41:
            if (r5 != r4) goto L47
            int r9 = r8.e
            int r1 = r1 - r9
            return r1
        L47:
            r1 = r2
            goto La
        L49:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0060a.D(java.lang.CharSequence):int");
    }

    public final int E() {
        return this.f + this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        int i = this.g;
        if (i != -1) {
            this.e = i;
            this.g = -1;
            return;
        }
        throw new com.github.catvod.spider.merge.Z.b(new IOException(cYh.d("2A31333A77330926203D3E3E")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        int i = this.e;
        if (i < 1) {
            throw new com.github.catvod.spider.merge.Z.b(new IOException(cYh.d("3004076B771408702324313C0222613D323C1370353E772F09332E3F242F0A356F")));
        }
        this.e = i - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H() {
        this.g = -1;
    }

    public final void a() {
        this.e++;
    }

    public final void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char e() {
        b();
        char c = u() ? (char) 65535 : this.a[this.e];
        this.e++;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f(boolean z) {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c != '\'') {
                    continue;
                    i3++;
                } else if (z) {
                    break;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String h() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (c = this.a[i]) < '0' || c > '9') {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String i() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (((c = this.a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String j() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String k() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        while (!u()) {
            char[] cArr = this.a;
            int i3 = this.e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = i3 + 1;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String m() {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String n() {
        int D = D(cYh.d("3A0D7F"));
        if (D != -1) {
            String c = c(this.a, this.h, this.e, D);
            this.e += D;
            return c;
        }
        int i = this.c;
        int i2 = this.e;
        if (i - i2 < 3) {
            return r();
        }
        int i3 = (i - 3) + 1;
        String c2 = c(this.a, this.h, i2, i3 - i2);
        this.e = i3;
        return c2;
    }

    public final String o(char c) {
        int i;
        b();
        int i2 = this.e;
        while (true) {
            if (i2 >= this.c) {
                i = -1;
                break;
            }
            if (c == this.a[i2]) {
                i = i2 - this.e;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return r();
        }
        String c2 = c(this.a, this.h, this.e, i);
        this.e += i;
        return c2;
    }

    public final String p(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String q(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String r() {
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String c = c(cArr, strArr, i, this.c - i);
        this.e = this.c;
        return c;
    }

    public final char s() {
        b();
        if (u()) {
            return (char) 65535;
        }
        return this.a[this.e];
    }

    public final boolean t() {
        b();
        return this.e >= this.c;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        b();
        this.g = this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.lang.String r8) {
        /*
            r7 = this;
            r7.b()
            r7.b()
            int r0 = r8.length()
            int r1 = r7.c
            int r2 = r7.e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.a
            int r6 = r7.e
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.e = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0060a.w(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.lang.String r8) {
        /*
            r7 = this;
            r7.b()
            int r0 = r8.length()
            int r1 = r7.c
            int r2 = r7.e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.a
            int r6 = r7.e
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.e = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.C0060a.x(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(char c) {
        return !t() && this.a[this.e] == c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(char... cArr) {
        if (t()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
