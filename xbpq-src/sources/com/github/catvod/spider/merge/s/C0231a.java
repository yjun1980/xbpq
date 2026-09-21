package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a implements Cloneable {
    private int[] c;
    private int d;

    public C0231a() {
        this.d = 0;
        this.c = new int[1];
    }

    C0231a(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    private void d(int i) {
        int[] iArr = this.c;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.c = iArr2;
        }
    }

    public final void a(boolean z) {
        d(this.d + 1);
        if (z) {
            int[] iArr = this.c;
            int i = this.d;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.d++;
    }

    public final void b(C0231a c0231a) {
        int i = c0231a.d;
        d(this.d + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(c0231a.e(i2));
        }
    }

    public final void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException(cYh.d("29252C7135331323613C222913702334773802243634323447606130393E476373"));
        }
        d(this.d + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final Object clone() {
        return new C0231a((int[]) this.c.clone(), this.d);
    }

    public final boolean e(int i) {
        return ((1 << (i & 31)) & this.c[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0231a)) {
            return false;
        }
        C0231a c0231a = (C0231a) obj;
        return this.d == c0231a.d && Arrays.equals(this.c, c0231a.c);
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return (this.d + 7) / 8;
    }

    public final void h(C0231a c0231a) {
        if (this.d != c0231a.d) {
            throw new IllegalArgumentException(cYh.d("34393B34247A033F2F76237A0A3135323F"));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c0231a.c[i];
            i++;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (this.d * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.d);
        for (int i = 0; i < this.d; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(e(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
