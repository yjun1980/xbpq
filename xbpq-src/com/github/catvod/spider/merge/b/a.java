/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.m.p;
import com.github.catvod.spider.merge.n1.i;
import java.util.Objects;

public abstract class a {
    public static int g(byte[] byArray, int n2) {
        byte by = byArray[n2];
        int n3 = n2 + 1;
        n2 = byArray[n3];
        int n4 = n3 + 1;
        n3 = byArray[n4];
        return byArray[n4 + 1] << 24 | (by & 0xFF | (n2 & 0xFF) << 8 | (n3 & 0xFF) << 16);
    }

    public com.github.catvod.spider.merge.o1.a a(String string) {
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            string = com.github.catvod.spider.merge.K1.p.d(string);
            return this.b(string, com.github.catvod.spider.merge.K1.p.e(string));
        }
        throw new IllegalArgumentException("The url is null or empty");
    }

    public com.github.catvod.spider.merge.o1.a b(String string, String string2) {
        Objects.requireNonNull(string, "URL cannot be null");
        if (this.h(string)) {
            String string3 = this.c(string);
            return new com.github.catvod.spider.merge.o1.a(string, this.f(string3, string2), string3);
        }
        throw new i(e.c("URL not accepted: ", string));
    }

    public abstract String c(String var1);

    public abstract p d();

    public abstract String e(String var1);

    public String f(String string, String string2) {
        return this.e(string);
    }

    public abstract boolean h(String var1);
}

