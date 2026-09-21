package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable<Integer> {
    private final int c;
    private final int d;
    private final int e;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException(cYh.d("34242421773712233571353F473E2E3F7A2002222E7F"));
        }
        if (i3 != Integer.MIN_VALUE) {
            this.c = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else {
                if (i3 >= 0) {
                    throw new IllegalArgumentException(cYh.d("34242421773314703B34253549"));
                }
                if (i > i2) {
                    int i7 = -i3;
                    int i8 = i % i7;
                    int i9 = i2 % i7;
                    int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                    i2 += i10 < 0 ? i10 + i7 : i10;
                }
            }
            this.d = i2;
            this.e = i3;
            return;
        }
        throw new IllegalArgumentException(cYh.d("34242421773712233571353F47373334362E022261253F3B0970083F23742A190F0E011B2B05047123354731373E3E3E473F3734253C0B3F36713834473E2436362E0E3F2F7F"));
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.c != aVar.c || this.d != aVar.d || this.e != aVar.e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.c * 31) + this.d) * 31) + this.e;
    }

    public boolean isEmpty() {
        if (this.e > 0) {
            if (this.c > this.d) {
                return true;
            }
        } else if (this.c < this.d) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new b(this.c, this.d, this.e);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        int i2 = this.e;
        String d = cYh.d("47233534277A");
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(cYh.d("497E"));
            sb.append(this.d);
            sb.append(d);
            i = this.e;
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(cYh.d("47342E26390E0870"));
            sb.append(this.d);
            sb.append(d);
            i = -this.e;
        }
        sb.append(i);
        return sb.toString();
    }
}
