/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.ArrayList;

final class C
implements G {
    private final int a;
    private final int b;
    private final int c;

    public C(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    @Override
    public final Object a(N n2, Object arrayList, Object object) {
        int n3 = n2.h(object);
        int n4 = this.a;
        if (n4 < 0) {
            n4 += n3;
        }
        int n5 = this.b;
        if (n5 < 0) {
            n5 += n3;
        }
        int n6 = (n5 - n4) / this.c + 1;
        if (n6 == -1) {
            return null;
        }
        arrayList = new ArrayList<Object>(n6);
        while (n4 <= n5 && n4 < n3) {
            arrayList.add(n2.i(object, n4));
            n4 += this.c;
        }
        return arrayList;
    }
}

