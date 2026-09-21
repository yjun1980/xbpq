/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.G0.N;

public abstract class M
extends N {
    public String b;
    public String c;
    public final StringBuilder d = new StringBuilder();
    public String e;
    public boolean f = false;
    public final StringBuilder g = new StringBuilder();
    public String h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public com.github.catvod.spider.merge.xc.F0.c l;

    public final void h(char c2) {
        this.i = true;
        String string = this.h;
        StringBuilder stringBuilder = this.g;
        if (string != null) {
            stringBuilder.append(string);
            this.h = null;
        }
        stringBuilder.append(c2);
    }

    public final void i(String string) {
        this.i = true;
        String string2 = this.h;
        StringBuilder stringBuilder = this.g;
        if (string2 != null) {
            stringBuilder.append(string2);
            this.h = null;
        }
        if (stringBuilder.length() == 0) {
            this.h = string;
        } else {
            stringBuilder.append(string);
        }
    }

    public final void j(int[] nArray) {
        this.i = true;
        String string = this.h;
        StringBuilder stringBuilder = this.g;
        if (string != null) {
            stringBuilder.append(string);
            this.h = null;
        }
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.appendCodePoint(nArray[i2]);
        }
    }

    public final void k(String string) {
        string = string.replace('\u0000', '\ufffd');
        String string2 = this.b;
        if (string2 != null) {
            string = string2.concat(string);
        }
        this.b = string;
        this.c = com.github.catvod.spider.merge.xc.D0.b.u(string.trim());
    }

    public final boolean l() {
        boolean bl = this.l != null;
        return bl;
    }

    public final String m() {
        String string = this.b;
        if (string != null && string.length() != 0) {
            return this.b;
        }
        throw new c("Must be false");
    }

    public final void n(String string) {
        this.b = string;
        this.c = com.github.catvod.spider.merge.xc.D0.b.u(string.trim());
    }

    public final void o() {
        String string;
        String string2;
        if (this.l == null) {
            this.l = new com.github.catvod.spider.merge.xc.F0.c();
        }
        boolean bl = this.f;
        StringBuilder stringBuilder = this.g;
        StringBuilder stringBuilder2 = this.d;
        if (bl && this.l.a < 512 && (string2 = (string = stringBuilder2.length() > 0 ? stringBuilder2.toString() : this.e).trim()).length() > 0) {
            string = this.i ? (stringBuilder.length() > 0 ? stringBuilder.toString() : this.h) : (this.j ? "" : null);
            this.l.a(string, string2);
        }
        N.g(stringBuilder2);
        this.e = null;
        this.f = false;
        N.g(stringBuilder);
        this.h = null;
        this.i = false;
        this.j = false;
    }

    public M p() {
        this.b = null;
        this.c = null;
        N.g(this.d);
        this.e = null;
        this.f = false;
        N.g(this.g);
        this.h = null;
        this.j = false;
        this.i = false;
        this.k = false;
        this.l = null;
        return this;
    }
}

