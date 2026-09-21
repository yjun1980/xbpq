package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232b implements Cloneable {
    private final int c;
    private final int d;
    private final int e;
    private final int[] f;

    public C0232b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(cYh.d("253F3539773E0E3D243F2433083E32713A2F14246133327A00222430233F1570353936344760"));
        }
        this.c = i;
        this.d = i2;
        int i3 = (i + 31) / 32;
        this.e = i3;
        this.f = new int[i3 * i2];
    }

    private C0232b(int i, int i2, int i3, int[] iArr) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
    }

    public final boolean a(int i, int i2) {
        return ((this.f[(i / 32) + (i2 * this.e)] >>> (i & 31)) & 1) != 0;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final Object clone() {
        return new C0232b(this.c, this.d, this.e, (int[]) this.f.clone());
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException(cYh.d("2B352725773B09346125382A473D3422237A0535613F38340935263023331135"));
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException(cYh.d("2F3528363F2E47312F35772D0E343539773712233571353F473135713B3F0623357166"));
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.d || i5 > this.c) {
            throw new IllegalArgumentException(cYh.d("33382471253F00392E3F77371223357131331370283F2433033561253F3F473D202525331F"));
        }
        while (i2 < i6) {
            int i7 = this.e * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0232b)) {
            return false;
        }
        C0232b c0232b = (C0232b) obj;
        return this.c == c0232b.c && this.d == c0232b.d && this.e == c0232b.e && Arrays.equals(this.f, c0232b.f);
    }

    public final int hashCode() {
        int i = this.c;
        return Arrays.hashCode(this.f) + (((((((i * 31) + i) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.c + 1) * this.d);
        for (int i = 0; i < this.d; i++) {
            for (int i2 = 0; i2 < this.c; i2++) {
                sb.append(a(i2, i) ? cYh.d("3F70") : cYh.d("4770"));
            }
            sb.append(cYh.d("6D"));
        }
        return sb.toString();
    }
}
