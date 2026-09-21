/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u02c7;
import java.io.Serializable;

public class \u02c9<A, B>
implements Serializable {
    public final A \u037f;
    public final B \u0528;

    public \u02c9(A a2, B b2) {
        this.\u037f = a2;
        this.\u0528 = b2;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof \u02c9)) {
            return false;
        }
        \u02c9 \u02c92 = (\u02c9)object;
        object = \u02c7.\u037f;
        if (!((\u02c7)object).\u037f(this.\u037f, \u02c92.\u037f) || !((\u02c7)object).\u037f(this.\u0528, \u02c92.\u0528)) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052c(\u02c6.\u052c(\u02c6.\u0529(), this.\u037f), this.\u0528), 2);
    }

    public String toString() {
        A a2 = this.\u037f;
        B b2 = this.\u0528;
        return String.format(SOY.d("5277225A5452097B"), a2, b2);
    }
}

