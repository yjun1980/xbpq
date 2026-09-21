/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

public final class l<A, B>
implements Serializable {
    public final A c;
    public final B d;

    public l(A a2, B b2) {
        this.c = a2;
        this.d = b2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        object = (l)object;
        Object object2 = this.c;
        A a2 = ((l)object).c;
        if (object2 == null) {
            if (a2 != null) return false;
            bl = true;
        } else {
            bl = object2.equals(a2);
        }
        if (!bl) return false;
        object2 = this.d;
        object = ((l)object).d;
        if (object2 == null) {
            if (object != null) return false;
            bl = true;
        } else {
            bl = object2.equals(object);
        }
        if (!bl) return false;
        return bl2;
    }

    public final int hashCode() {
        return a.b(a.p(a.p(0, this.c), this.d), 2);
    }

    public final String toString() {
        A a2 = this.c;
        B b2 = this.d;
        return String.format(cYh.d("4F75327D777F1479"), a2, b2);
    }
}

