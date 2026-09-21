/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.f1.D;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.f1.j1;
import java.io.Reader;
import java.io.StringReader;

public final class F {
    private j1 a;
    private D b;
    private E c;

    public F(j1 j12) {
        this.a = j12;
        this.c = E.c;
        this.b = new D();
    }

    public static F b() {
        return new F(new b());
    }

    public static h d(String string, String string2) {
        b b2 = new b();
        return b2.d(new StringReader(string), string2, new F(b2));
    }

    public final D a() {
        return this.b;
    }

    public final boolean c() {
        boolean bl = this.b.c() > 0;
        return bl;
    }

    public final h e(Reader reader, String string) {
        return this.a.d(reader, string, this);
    }

    public final h f(String string, String string2) {
        return this.a.d(new StringReader(string), string2, this);
    }

    public final E g() {
        return this.c;
    }

    public final F h() {
        this.c = E.d;
        return this;
    }
}

