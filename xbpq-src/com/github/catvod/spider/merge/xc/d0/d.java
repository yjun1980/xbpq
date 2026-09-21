/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.d0.e;
import java.util.RandomAccess;

public final class d
extends e
implements RandomAccess {
    public final e a;
    public final int b;
    public final int c;

    public d(e e2, int n2, int n3) {
        i.e(e2, "list");
        this.a = e2;
        this.b = n2;
        com.github.catvod.spider.merge.xc.a.a.d(n2, n3, e2.a());
        this.c = n3 - n2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    public final Object get(int n2) {
        int n3 = this.c;
        if (n2 >= 0 && n2 < n3) {
            n3 = this.b;
            return this.a.get(n3 + n2);
        }
        StringBuilder stringBuilder = new StringBuilder("index: ");
        stringBuilder.append(n2);
        stringBuilder.append(", size: ");
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}

