/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.k1.m;
import com.github.catvod.spider.merge.n1.i;
import java.net.MalformedURLException;
import java.net.URL;

public final class c
extends a {
    private static final c a = new c();

    private c() {
    }

    public static c i() {
        return a;
    }

    @Override
    public final String c(String string) {
        return d.f("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", string, 4);
    }

    @Override
    public final String e(String string) {
        return this.f(string, m.b.i());
    }

    @Override
    public final String f(String string, String string2) {
        return s.a(string2, "/videos/watch/", string);
    }

    @Override
    public final boolean h(String string) {
        if (string.contains("/playlist/")) {
            return false;
        }
        try {
            new URL(string);
            d.f("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", string, 4);
            return true;
        }
        catch (i | MalformedURLException exception) {
            return false;
        }
    }
}

