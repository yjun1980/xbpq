/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.O;

abstract class N
extends O {
    protected String b;
    protected String c;
    private String d;
    private StringBuilder e = new StringBuilder();
    private String f;
    private boolean g = false;
    private boolean h = false;
    boolean i = false;
    c j;

    N() {
    }

    private void p() {
        this.h = true;
        String string = this.f;
        if (string != null) {
            this.e.append(string);
            this.f = null;
        }
    }

    final void i(char c2) {
        String string = String.valueOf(c2);
        String string2 = this.d;
        if (string2 != null) {
            string = string2.concat(string);
        }
        this.d = string;
    }

    final void j(String string) {
        String string2 = this.d;
        if (string2 != null) {
            string = string2.concat(string);
        }
        this.d = string;
    }

    final void k(char c2) {
        this.p();
        this.e.append(c2);
    }

    final void l(String string) {
        this.p();
        if (this.e.length() == 0) {
            this.f = string;
        } else {
            this.e.append(string);
        }
    }

    final void m(int[] nArray) {
        this.p();
        for (int n2 : nArray) {
            this.e.appendCodePoint(n2);
        }
    }

    final void n(char c2) {
        this.o(String.valueOf(c2));
    }

    final void o(String string) {
        String string2 = this.b;
        if (string2 != null) {
            string = string2.concat(string);
        }
        this.b = string;
        this.c = com.github.catvod.spider.merge.x.a.c(string);
    }

    final void q() {
        if (this.d != null) {
            this.u();
        }
    }

    final boolean r() {
        boolean bl = this.j != null;
        return bl;
    }

    final N s(String string) {
        this.b = string;
        this.c = com.github.catvod.spider.merge.x.a.c(string);
        return this;
    }

    final String t() {
        String string = this.b;
        boolean bl = string == null || string.length() == 0;
        com.github.catvod.spider.merge.N.a.e(bl);
        return this.b;
    }

    final void u() {
        String string;
        if (this.j == null) {
            this.j = new c();
        }
        if ((string = this.d) != null) {
            this.d = string = string.trim();
            if (string.length() > 0) {
                string = this.h ? (this.e.length() > 0 ? this.e.toString() : this.f) : (this.g ? "" : null);
                this.j.d(this.d, string);
            }
        }
        this.d = null;
        this.g = false;
        this.h = false;
        O.h(this.e);
        this.f = null;
    }

    N v() {
        this.b = null;
        this.c = null;
        this.d = null;
        O.h(this.e);
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        return this;
    }

    final void w() {
        this.g = true;
    }

    final String x() {
        String string = this.b;
        if (string == null) {
            string = cYh.d("3C252F22322E3A");
        }
        return string;
    }
}

