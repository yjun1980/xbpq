/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.cYh;

public final class i {
    static i[] c = new i[1001];
    public int a;
    public int b;

    public i(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public static i b(int n2, int n3) {
        if (n2 == n3 && n2 >= 0 && n2 <= 1000) {
            i[] iArray = c;
            if (iArray[n2] == null) {
                iArray[n2] = new i(n2, n2);
            }
            return iArray[n2];
        }
        return new i(n2, n3);
    }

    public final boolean a(i i2) {
        int n2 = this.a;
        int n3 = i2.a;
        boolean bl = false;
        if ((n3 = n2 < n3 && this.b < n3 ? 1 : 0) != 0 || (n3 = n2 > i2.b ? 1 : 0) != 0) {
            bl = true;
        }
        return bl;
    }

    public final i c(i i2) {
        return i.b(Math.min(this.a, i2.a), Math.max(this.b, i2.b));
    }

    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            if (!(object instanceof i)) {
                bl2 = bl;
            } else {
                object = (i)object;
                bl2 = bl;
                if (this.a == ((i)object).a) {
                    bl2 = bl;
                    if (this.b == ((i)object).b) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return (713 + this.a) * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("497E"));
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

