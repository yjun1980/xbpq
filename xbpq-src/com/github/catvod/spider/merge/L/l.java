/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.p;
import com.github.catvod.spider.merge.N.j;
import com.github.catvod.spider.merge.N.k;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;

public abstract class l
implements Runnable,
Comparable<l>,
k {
    private j c;
    public long d;

    @Override
    public final void a() {
    }

    @Override
    public final void b(j<?> j2) {
        boolean bl = this.c != p.b();
        if (bl) {
            this.c = j2;
            return;
        }
        throw new IllegalArgumentException(cYh.d("2131283D323E47222420223315352C34392E49").toString());
    }

    @Override
    public final int compareTo(Object object) {
        object = (l)object;
        long l2 = this.d - ((l)object).d;
        int n2 = l2 > 0L ? 1 : (l2 < 0L ? -1 : 0);
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("23352D302E3F030B2F303935146D"));
        stringBuilder.append(this.d);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

