/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u1061;
import com.github.catvod.spider.merge.\u1078;
import java.util.Arrays;

public class \u08b4
extends \u1061 {
    public final \u1061[] \u052b;
    public final int[] \u052c;

    public \u08b4(\u1078 \u10782) {
        \u1061 \u10612 = \u10782.\u052b;
        int n2 = \u10782.\u052c;
        this(new \u1061[]{\u10612}, new int[]{n2});
    }

    public \u08b4(\u1061[] \u1061Array, int[] nArray) {
        super(\u1061.\u0529(\u1061Array, nArray));
        this.\u052b = \u1061Array;
        this.\u052c = nArray;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u08b4)) {
            return false;
        }
        if (this.hashCode() != object.hashCode()) {
            return false;
        }
        object = (\u08b4)object;
        if (!Arrays.equals(this.\u052c, ((\u08b4)object).\u052c) || !Arrays.equals(this.\u052b, ((\u08b4)object).\u052b)) {
            bl = false;
        }
        return bl;
    }

    public String toString() {
        if (this.\u058f()) {
            return SOY.d("210F");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("21"));
        for (int i2 = 0; i2 < this.\u052c.length; ++i2) {
            int[] nArray;
            if (i2 > 0) {
                stringBuilder.append(SOY.d("5672"));
            }
            if ((nArray = this.\u052c)[i2] == Integer.MAX_VALUE) {
                stringBuilder.append(SOY.d("5E"));
                continue;
            }
            stringBuilder.append(nArray[i2]);
            if (this.\u052b[i2] != null) {
                stringBuilder.append(' ');
                stringBuilder.append(this.\u052b[i2].toString());
                continue;
            }
            stringBuilder.append(SOY.d("14273D1A"));
        }
        stringBuilder.append(SOY.d("27"));
        return stringBuilder.toString();
    }

    @Override
    public \u1061 \u052d(int n2) {
        return this.\u052b[n2];
    }

    @Override
    public int \u052e(int n2) {
        return this.\u052c[n2];
    }

    @Override
    public boolean \u058f() {
        int[] nArray = this.\u052c;
        boolean bl = false;
        if (nArray[0] == Integer.MAX_VALUE) {
            bl = true;
        }
        return bl;
    }

    @Override
    public int \u0783() {
        return this.\u052c.length;
    }
}

