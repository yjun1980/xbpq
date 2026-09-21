/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u1061;

public class \u1078
extends \u1061 {
    public final \u1061 \u052b;
    public final int \u052c;

    \u1078(\u1061 \u10612, int n2) {
        int n3 = \u10612 != null ? \u1061.\u0528(\u10612, n2) : \u1061.\u037f();
        super(n3);
        this.\u052b = \u10612;
        this.\u052c = n2;
    }

    public static \u1078 \u0784(\u1061 \u10612, int n2) {
        if (n2 == Integer.MAX_VALUE && \u10612 == null) {
            return \u1061.\u037f;
        }
        return new \u1078(\u10612, n2);
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u1078)) {
            return false;
        }
        if (this.hashCode() != object.hashCode()) {
            return false;
        }
        \u1078 \u10782 = (\u1078)object;
        if (this.\u052c != \u10782.\u052c || (object = this.\u052b) == null || !((\u1061)object).equals(\u10782.\u052b)) {
            bl = false;
        }
        return bl;
    }

    public String toString() {
        Object object = this.\u052b;
        object = object != null ? object.toString() : "";
        if (((String)object).length() == 0) {
            int n2 = this.\u052c;
            if (n2 == Integer.MAX_VALUE) {
                return SOY.d("5E");
            }
            return String.valueOf(n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(this.\u052c));
        stringBuilder.append(SOY.d("5A"));
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    @Override
    public \u1061 \u052d(int n2) {
        return this.\u052b;
    }

    @Override
    public int \u052e(int n2) {
        return this.\u052c;
    }

    @Override
    public int \u0783() {
        return 1;
    }
}

