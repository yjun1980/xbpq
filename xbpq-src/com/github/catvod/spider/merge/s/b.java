/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s;

import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;

public final class b
implements Cloneable {
    private final int c;
    private final int d;
    private final int e;
    private final int[] f;

    public b(int n2, int n3) {
        if (n2 > 0 && n3 > 0) {
            this.c = n2;
            this.d = n3;
            this.e = n2 = (n2 + 31) / 32;
            this.f = new int[n2 * n3];
            return;
        }
        throw new IllegalArgumentException(cYh.d("253F3539773E0E3D243F2433083E32713A2F14246133327A00222430233F1570353936344760"));
    }

    private b(int n2, int n3, int n4, int[] nArray) {
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = nArray;
    }

    public final boolean a(int n2, int n3) {
        int n4 = n2 / 32;
        int n5 = this.e;
        return (this.f[n4 + n3 * n5] >>> (n2 & 0x1F) & 1) != 0;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final Object clone() {
        return new b(this.c, this.d, this.e, (int[])this.f.clone());
    }

    public final void d(int n2, int n3, int n4, int n5) {
        if (n3 >= 0 && n2 >= 0) {
            if (n5 > 0 && n4 > 0) {
                int n6 = n4 + n2;
                if ((n5 += n3) <= this.d && n6 <= this.c) {
                    while (n3 < n5) {
                        int n7 = this.e;
                        for (n4 = n2; n4 < n6; ++n4) {
                            int[] nArray = this.f;
                            int n8 = n4 / 32 + n7 * n3;
                            nArray[n8] = nArray[n8] | 1 << (n4 & 0x1F);
                        }
                        ++n3;
                    }
                    return;
                }
                throw new IllegalArgumentException(cYh.d("33382471253F00392E3F77371223357131331370283F2433033561253F3F473D202525331F"));
            }
            throw new IllegalArgumentException(cYh.d("2F3528363F2E47312F35772D0E343539773712233571353F473135713B3F0623357166"));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(cYh.d("2B352725773B09346125382A473D3422237A0535613F38340935263023331135"));
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.c == ((b)object).c && this.d == ((b)object).d && this.e == ((b)object).e && Arrays.equals(this.f, ((b)object).f);
    }

    public final int hashCode() {
        int n2 = this.c;
        int n3 = this.d;
        int n4 = this.e;
        return Arrays.hashCode(this.f) + (((n2 * 31 + n2) * 31 + n3) * 31 + n4) * 31;
    }

    public final String toString() {
        int n2 = this.d;
        StringBuilder stringBuilder = new StringBuilder((this.c + 1) * n2);
        for (n2 = 0; n2 < this.d; ++n2) {
            for (int i2 = 0; i2 < this.c; ++i2) {
                String string = this.a(i2, n2) ? cYh.d("3F70") : cYh.d("4770");
                stringBuilder.append(string);
            }
            stringBuilder.append(cYh.d("6D"));
        }
        return stringBuilder.toString();
    }
}

