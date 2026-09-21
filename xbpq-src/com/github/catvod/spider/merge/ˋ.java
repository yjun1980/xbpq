/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;

public class \u02cb {
    public static final \u02cb \u037f = new \u02cb(-1, -2);
    static \u02cb[] \u0528 = new \u02cb[1001];
    public static int \u0529 = 0;
    public static int \u052a = 0;
    public static int \u052b = 0;
    public static int \u052c = 0;
    public int \u052d;
    public int \u052e;

    public \u02cb(int n2, int n3) {
        this.\u052d = n2;
        this.\u052e = n3;
    }

    public static \u02cb \u0529(int n2, int n3) {
        if (n2 == n3 && n2 >= 0 && n2 <= 1000) {
            \u02cb[] \u02cbArray = \u0528;
            if (\u02cbArray[n2] == null) {
                \u02cbArray[n2] = new \u02cb(n2, n2);
            }
            return \u0528[n2];
        }
        return new \u02cb(n2, n3);
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            if (!(object instanceof \u02cb)) {
                bl2 = bl;
            } else {
                object = (\u02cb)object;
                bl2 = bl;
                if (this.\u052d == ((\u02cb)object).\u052d) {
                    bl2 = bl;
                    if (this.\u052e == ((\u02cb)object).\u052e) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        return (713 + this.\u052d) * 31 + this.\u052e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052d);
        stringBuilder.append(SOY.d("547C"));
        stringBuilder.append(this.\u052e);
        return stringBuilder.toString();
    }

    public boolean \u037f(\u02cb \u02cb2) {
        boolean bl;
        int n2 = this.\u052d;
        int n3 = \u02cb2.\u052e;
        boolean bl2 = bl = true;
        if (n2 != n3 + 1) {
            bl2 = this.\u052e == \u02cb2.\u052d - 1 ? bl : false;
        }
        return bl2;
    }

    public boolean \u0528(\u02cb \u02cb2) {
        boolean bl = this.\u052b(\u02cb2) || this.\u052a(\u02cb2);
        return bl;
    }

    public boolean \u052a(\u02cb \u02cb2) {
        boolean bl = this.\u052d > \u02cb2.\u052e;
        return bl;
    }

    public boolean \u052b(\u02cb \u02cb2) {
        int n2 = this.\u052d;
        int n3 = \u02cb2.\u052d;
        boolean bl = n2 < n3 && this.\u052e < n3;
        return bl;
    }

    public \u02cb \u052c(\u02cb \u02cb2) {
        return \u02cb.\u0529(Math.min(this.\u052d, \u02cb2.\u052d), Math.max(this.\u052e, \u02cb2.\u052e));
    }
}

