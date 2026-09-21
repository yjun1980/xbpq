/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.N;
import java.util.ArrayList;

final class B
implements G {
    private final String a;
    private final long b;
    private final boolean c;

    public B(String string, boolean bl) {
        this.a = string;
        this.b = A.z(string);
        this.c = bl;
    }

    static /* synthetic */ boolean b(B b2) {
        return b2.c;
    }

    static /* synthetic */ String c(B b2) {
        return b2.a;
    }

    @Override
    public final Object a(N n2, Object arrayList, Object object) {
        if (this.c) {
            arrayList = new ArrayList<Object>();
            n2.e(object, this.a, arrayList);
            return arrayList;
        }
        return n2.k(object, this.a, this.b);
    }
}

