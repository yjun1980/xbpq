/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.o1;

import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.o1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class c
extends com.github.catvod.spider.merge.b.a {
    @Override
    public final a b(String string, String string2) {
        Objects.requireNonNull(string, "URL may not be null");
        return new b(super.b(string, string2));
    }

    @Override
    public final String e(String string) {
        return this.k(string, new ArrayList(0));
    }

    @Override
    public final String f(String string, String string2) {
        return this.l(string, new ArrayList(0), string2);
    }

    public final b i(String string, String string2) {
        Objects.requireNonNull(string, "ID cannot be null");
        string2 = this.f(string, string2);
        return new b(new a(string2, string2, string));
    }

    public b j(String string) {
        String string2 = p.d(string);
        string = p.e(string2);
        Objects.requireNonNull(string2, "URL may not be null");
        return new b(super.b(string2, string));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public abstract String k(String var1, List var2);

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public String l(String string, List list, String string2) {
        return this.k(string, list);
    }
}

