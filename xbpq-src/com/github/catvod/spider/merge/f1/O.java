/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.f1.E;
import com.github.catvod.spider.merge.f1.P;

abstract class O
extends P {
    protected String d;
    protected String e;
    private final StringBuilder f = new StringBuilder();
    private String g;
    private boolean h = false;
    private final StringBuilder i = new StringBuilder();
    private String j;
    private boolean k = false;
    private boolean l = false;
    boolean m = false;
    c n;

    O() {
    }

    private void r() {
        this.k = true;
        String string = this.j;
        if (string != null) {
            this.i.append(string);
            this.j = null;
        }
    }

    final String A() {
        String string = this.d;
        if (string == null) {
            string = "[unset]";
        }
        return string;
    }

    final void k(char c2) {
        this.h = true;
        String string = this.g;
        if (string != null) {
            this.f.append(string);
            this.g = null;
        }
        this.f.append(c2);
    }

    final void l(String string) {
        String string2 = string.replace('\u0000', '\ufffd');
        this.h = true;
        string = this.g;
        if (string != null) {
            this.f.append(string);
            this.g = null;
        }
        if (this.f.length() == 0) {
            this.g = string2;
        } else {
            this.f.append(string2);
        }
    }

    final void m(char c2) {
        this.r();
        this.i.append(c2);
    }

    final void n(String string) {
        this.r();
        if (this.i.length() == 0) {
            this.j = string;
        } else {
            this.i.append(string);
        }
    }

    final void o(int[] nArray) {
        this.r();
        for (int n2 : nArray) {
            this.i.appendCodePoint(n2);
        }
    }

    final void p(char c2) {
        this.q(String.valueOf(c2));
    }

    final void q(String string) {
        string = string.replace('\u0000', '\ufffd');
        String string2 = this.d;
        if (string2 != null) {
            string = string2.concat(string);
        }
        this.d = string;
        this.e = E.a(string);
    }

    final void s() {
        if (this.h) {
            this.x();
        }
    }

    final boolean t(String string) {
        c c2 = this.n;
        boolean bl = c2 != null && c2.q(string);
        return bl;
    }

    final boolean u() {
        boolean bl = this.n != null;
        return bl;
    }

    final O v(String string) {
        this.d = string;
        this.e = E.a(string);
        return this;
    }

    final String w() {
        String string = this.d;
        boolean bl = string == null || string.length() == 0;
        com.github.catvod.spider.merge.c1.d.e(bl);
        return this.d;
    }

    final void x() {
        String string;
        String string2;
        if (this.n == null) {
            this.n = new c();
        }
        if (this.h && this.n.size() < 512 && (string2 = (string = this.f.length() > 0 ? this.f.toString() : this.g).trim()).length() > 0) {
            string = this.k ? (this.i.length() > 0 ? this.i.toString() : this.j) : (this.l ? "" : null);
            this.n.f(string2, string);
        }
        P.i(this.f);
        this.g = null;
        this.h = false;
        P.i(this.i);
        this.j = null;
        this.k = false;
        this.l = false;
    }

    O y() {
        super.h();
        this.d = null;
        this.e = null;
        P.i(this.f);
        this.g = null;
        this.h = false;
        P.i(this.i);
        this.j = null;
        this.l = false;
        this.k = false;
        this.m = false;
        this.n = null;
        return this;
    }

    final void z() {
        this.l = true;
    }
}

