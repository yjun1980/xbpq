/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Nx.l0;
import com.github.catvod.spider.merge.ka.d;

public final class l {
    public l0 a;
    public int b;

    public l(l0 l02, int n2) {
        this.b = n2;
        this.a = l02;
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b("(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

