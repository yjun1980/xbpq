/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.l;
import com.github.catvod.spider.merge.E0.n;
import com.github.catvod.spider.merge.I.r;

final class j
extends l {
    private final int e;
    private final int f;

    j(byte[] byArray, int n2, int n3) {
        super(byArray);
        n.c(n2, n2 + n3, byArray.length);
        this.e = n2;
        this.f = n3;
    }

    @Override
    public final byte a(int n2) {
        int n3 = this.f;
        if ((n3 - (n2 + 1) | n2) < 0) {
            if (n2 < 0) {
                throw new ArrayIndexOutOfBoundsException(r.a("Index < 0: ", n2));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        return this.d[this.e + n2];
    }

    @Override
    final byte f(int n2) {
        return this.d[this.e + n2];
    }

    @Override
    protected final int k() {
        return this.e;
    }

    @Override
    public final int size() {
        return this.f;
    }
}

