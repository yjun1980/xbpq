/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.Q.X;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.util.Arrays;

public final class p
extends X {
    public final X[] c;
    public final int[] d;

    public p(X[] xArray, int[] nArray) {
        int n2;
        int n3 = xArray.length;
        int n4 = 0;
        int n5 = 1;
        for (n2 = 0; n2 < n3; ++n2) {
            n5 = com.github.catvod.spider.merge.N.a.p(n5, xArray[n2]);
        }
        n3 = nArray.length;
        n2 = n5;
        for (n5 = n4; n5 < n3; ++n5) {
            n2 = com.github.catvod.spider.merge.N.a.o(n2, nArray[n5]);
        }
        super(com.github.catvod.spider.merge.N.a.b(n2, xArray.length * 2));
        this.c = xArray;
        this.d = nArray;
    }

    @Override
    public final X c(int n2) {
        return this.c[n2];
    }

    @Override
    public final int d(int n2) {
        return this.d[n2];
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        if (this.a != object.hashCode()) {
            return false;
        }
        object = (p)object;
        if (!Arrays.equals(this.d, ((p)object).d) || !Arrays.equals(this.c, ((p)object).c)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final boolean f() {
        int[] nArray = this.d;
        boolean bl = false;
        if (nArray[0] == Integer.MAX_VALUE) {
            bl = true;
        }
        return bl;
    }

    @Override
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        if (this.f()) {
            return cYh.d("3C0D");
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("3C"));
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(cYh.d("4B70"));
            }
            if ((object = this.d)[i2] == Integer.MAX_VALUE) {
                object = cYh.d("43");
            } else {
                stringBuilder.append(object[i2]);
                if (this.c[i2] != null) {
                    stringBuilder.append(' ');
                    object = this.c[i2].toString();
                } else {
                    object = cYh.d("09252D3D");
                }
            }
            stringBuilder.append((String)object);
        }
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

