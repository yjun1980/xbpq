package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class l<A, B> implements Serializable {
    public final A c;
    public final B d;

    public l(A a, B b) {
        this.c = a;
        this.d = b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        A a = this.c;
        A a2 = lVar.c;
        if (a == null) {
            equals = a2 == null;
        } else {
            equals = a.equals(a2);
        }
        if (equals) {
            B b = this.d;
            B b2 = lVar.d;
            if (b == null) {
                equals2 = b2 == null;
            } else {
                equals2 = b.equals(b2);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.N.a.b(com.github.catvod.spider.merge.N.a.p(com.github.catvod.spider.merge.N.a.p(0, this.c), this.d), 2);
    }

    public final String toString() {
        return String.format(cYh.d("4F75327D777F1479"), this.c, this.d);
    }
}
