/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Fs.C;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.b;
import com.github.catvod.spider.merge.Fs.i1;
import java.io.StringReader;

public final class E {
    private i1 a;
    private C b;

    public E(i1 i12) {
        this.a = i12;
        this.b = new C();
    }

    public static h c(String object) {
        b b2 = new b();
        b2.C(new StringReader((String)object), new E(b2));
        Q q2 = b2.c;
        do {
            object = q2.t();
            b2.c((O)object);
            ((O)object).g();
        } while (((O)object).a != 6);
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

