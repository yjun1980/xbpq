/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.D1.d;
import com.github.catvod.spider.merge.H1.b;
import com.github.catvod.spider.merge.k1.i;
import java.util.Locale;

public final class a {
    private String a;
    private String b;
    private boolean c;
    private int d = 1;
    private i e;
    private String f;
    private int g = -1;
    private String h;
    private String i;
    private Locale j;
    private int k;
    private d l;

    static /* bridge */ /* synthetic */ Locale a(a a2) {
        return a2.j;
    }

    static /* bridge */ /* synthetic */ String b(a a2) {
        return a2.h;
    }

    static /* bridge */ /* synthetic */ String c(a a2) {
        return a2.i;
    }

    static /* bridge */ /* synthetic */ int d(a a2) {
        return a2.k;
    }

    static /* bridge */ /* synthetic */ int e(a a2) {
        return a2.g;
    }

    static /* bridge */ /* synthetic */ String f(a a2) {
        return a2.b;
    }

    static /* bridge */ /* synthetic */ int g(a a2) {
        return a2.d;
    }

    static /* bridge */ /* synthetic */ String h(a a2) {
        return a2.a;
    }

    static /* bridge */ /* synthetic */ boolean i(a a2) {
        return a2.c;
    }

    static /* bridge */ /* synthetic */ d j(a a2) {
        return a2.l;
    }

    static /* bridge */ /* synthetic */ String k(a a2) {
        return a2.f;
    }

    static /* bridge */ /* synthetic */ i l(a a2) {
        return a2.e;
    }

    public final b m() {
        if (this.a != null) {
            if (this.b != null) {
                if (this.d != 0) {
                    return new b(this);
                }
                throw new IllegalStateException("The delivery method of the audio stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
            }
            throw new IllegalStateException("The content of the audio stream has been not set or is null. Please specify a non-null one with setContent.");
        }
        throw new IllegalStateException("The identifier of the audio stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
    }

    public final a n(Locale locale) {
        this.j = locale;
        return this;
    }

    public final a o(String string) {
        this.h = string;
        return this;
    }

    public final a p(String string) {
        this.i = string;
        return this;
    }

    public final a q(int n2) {
        this.k = n2;
        return this;
    }

    public final a r(int n2) {
        this.g = n2;
        return this;
    }

    public final a s(String string, boolean bl) {
        this.b = string;
        this.c = bl;
        return this;
    }

    public final a t(int n2) {
        this.d = n2;
        return this;
    }

    public final a u(String string) {
        this.a = string;
        return this;
    }

    public final a v(d d2) {
        this.l = d2;
        return this;
    }

    public final a w(String string) {
        this.f = string;
        return this;
    }

    public final a x(i i2) {
        this.e = i2;
        return this;
    }
}

