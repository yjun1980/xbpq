/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.s0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.e0.a;
import com.github.catvod.spider.merge.xc.e0.g;
import com.github.catvod.spider.merge.xc.r0.e;
import com.github.catvod.spider.merge.xc.s0.A;
import com.github.catvod.spider.merge.xc.s0.x;

public final class z
extends a
implements g {
    public static final x c = new x();
    public final long b;

    public z(long l2) {
        super(c);
        this.b = l2;
    }

    public final String d(com.github.catvod.spider.merge.xc.e0.i object) {
        int n2;
        m.l(object.b(A.b));
        object = Thread.currentThread();
        String string = ((Thread)object).getName();
        int n3 = n2 = e.U(" @", string, 6);
        if (n2 < 0) {
            n3 = string.length();
        }
        CharSequence charSequence = new StringBuilder(n3 + 19);
        String string2 = string.substring(0, n3);
        i.d(string2, "substring(...)");
        charSequence.append(string2);
        charSequence.append(" @coroutine#");
        charSequence.append(this.b);
        charSequence = charSequence.toString();
        i.d(charSequence, "toString(...)");
        ((Thread)object).setName((String)charSequence);
        return string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof z)) {
            return false;
        }
        object = (z)object;
        return this.b == ((z)object).b;
    }

    public final int hashCode() {
        long l2 = this.b;
        return (int)(l2 ^ l2 >>> 32);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineId(");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

