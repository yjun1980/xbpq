/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.d0.C;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d0.i1;
import java.io.StringReader;

public final class E {
    private i1 a;
    private C b;

    public E(i1 i12) {
        this.a = i12;
        this.b = new C();
    }

    public static h c(String object) {
        O o2;
        b b2 = new b();
        b2.C(new StringReader((String)object), new E(b2));
        object = b2.c;
        do {
            o2 = ((Q)object).t();
            b2.c(o2);
            o2.g();
        } while (o2.a != 6);
        b2.b.d();
        b2.b = null;
        b2.c = null;
        b2.e = null;
        return b2.d;
    }

    public final C a() {
        return this.b;
    }

    public final boolean b(String string) {
        return this.a.b(string);
    }
}

