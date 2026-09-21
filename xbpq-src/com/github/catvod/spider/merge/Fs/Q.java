/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Em.n;
import com.github.catvod.spider.merge.Fs.B;
import com.github.catvod.spider.merge.Fs.C;
import com.github.catvod.spider.merge.Fs.H;
import com.github.catvod.spider.merge.Fs.I;
import com.github.catvod.spider.merge.Fs.J;
import com.github.catvod.spider.merge.Fs.L;
import com.github.catvod.spider.merge.Fs.M;
import com.github.catvod.spider.merge.Fs.N;
import com.github.catvod.spider.merge.Fs.O;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;
import java.util.AbstractCollection;
import java.util.Arrays;

final class Q {
    private static final char[] r;
    static final int[] s;
    private final a a;
    private final C b;
    private h1 c = h1.c;
    private O d;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    N i;
    M j = new M();
    L k = new L();
    H l = new H();
    J m = new J();
    I n = new I();
    private String o;
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[7];
        cArray[0] = 9;
        cArray2[1] = 10;
        cArray2[2] = 13;
        cArray2[3] = 12;
        cArray2[4] = 32;
        cArray2[5] = 60;
        cArray2[6] = 38;
        r = cArray;
        s = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArray);
    }

    Q(a a2, C c2) {
        this.a = a2;
        this.b = c2;
    }

    private void c(String string) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new B(this.a.E(), "Invalid character reference: %s", string));
        }
    }

    final void a(h1 h12) {
        this.a.a();
        this.c = h12;
    }

    final String b() {
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final int[] d(Character object, boolean bl) {
        int n2;
        Object object2;
        block21: {
            block20: {
                block19: {
                    if (this.a.t()) {
                        return null;
                    }
                    if (object != null && ((Character)object).charValue() == this.a.s()) {
                        return null;
                    }
                    if (this.a.A(r)) {
                        return null;
                    }
                    object2 = this.p;
                    this.a.v();
                    if (!this.a.w("#")) break block19;
                    bl = this.a.x("X");
                    object = this.a;
                    object = bl ? ((a)object).i() : ((a)object).h();
                    if (((String)object).length() == 0) {
                        this.c("numeric reference with no numerals");
                        break block20;
                    } else {
                        this.a.H();
                        if (!this.a.w(";")) {
                            this.c("missing semicolon");
                        }
                        int n3 = bl ? 16 : 10;
                        try {
                            n3 = Integer.valueOf((String)object, n3);
                        }
                        catch (NumberFormatException numberFormatException) {
                            n3 = -1;
                        }
                        if (n3 != -1 && (n3 < 55296 || n3 > 57343) && n3 <= 0x10FFFF) {
                            Object object3;
                            int n4 = n3;
                            if (n3 >= 128) {
                                object = s;
                                int n5 = n3;
                                if (n3 < 160) {
                                    this.c("character is not a valid unicode code point");
                                    object3 = object[n3 - 128];
                                }
                            }
                            object2[0] = object3;
                            return object2;
                        }
                        this.c("character outside of valid range");
                        object2[0] = 65533;
                        return object2;
                    }
                }
                object = this.a.k();
                boolean bl2 = this.a.y(';');
                n2 = !(com.github.catvod.spider.merge.Em.n.e((String)object) || com.github.catvod.spider.merge.Em.n.f((String)object) && bl2) ? 0 : 1;
                if (n2 == 0) {
                    this.a.F();
                    if (!bl2) return null;
                    this.c("invalid named reference");
                    return null;
                }
                if (!bl || !this.a.C() && !this.a.B() && !this.a.z('=', '-', '_')) break block21;
            }
            this.a.F();
            return null;
        }
        this.a.H();
        if (!this.a.w(";")) {
            this.c("missing semicolon");
        }
        if ((n2 = com.github.catvod.spider.merge.Em.n.c((String)object, this.q)) == 1) {
            object2[0] = this.q[0];
            return object2;
        }
        if (n2 == 2) {
            return this.q;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unexpected characters returned for ");
        ((StringBuilder)object2).append((String)object);
        com.github.catvod.spider.merge.Dw.i.a(((StringBuilder)object2).toString());
        throw null;
    }

    final void e() {
        this.n.g();
        this.n.getClass();
    }

    final void f() {
        this.m.g();
    }

    final N g(boolean bl) {
        N n2;
        if (bl) {
            n2 = this.j;
            ((M)n2).v();
        } else {
            n2 = this.k;
            n2.v();
        }
        this.i = n2;
        return n2;
    }

    final void h() {
        O.h(this.h);
    }

    final void i(char c2) {
        if (this.f == null) {
            this.f = String.valueOf(c2);
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(c2);
        }
    }

    final void j(O o2) {
        com.github.catvod.spider.merge.Dw.i.e(this.e);
        this.d = o2;
        this.e = true;
        int n2 = o2.a;
        if (n2 == 2) {
            this.o = ((M)o2).b;
        } else if (n2 == 3 && ((L)o2).r()) {
            this.r("Attributes incorrectly present on end tag");
        }
    }

    final void k(String string) {
        if (this.f == null) {
            this.f = string;
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(string);
        }
    }

    final void l(StringBuilder stringBuilder) {
        if (this.f == null) {
            this.f = stringBuilder.toString();
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append((CharSequence)stringBuilder);
        }
    }

    final void m() {
        this.j(this.n);
    }

    final void n() {
        this.j(this.m);
    }

    final void o() {
        this.i.q();
        this.j(this.i);
    }

    final void p(h1 h12) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new B(this.a.E(), "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{h12}));
        }
    }

    final void q(h1 h12) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new B(this.a.E(), "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(this.a.s()), h12}));
        }
    }

    final void r(String string) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new B(this.a.E(), string));
        }
    }

    final boolean s() {
        boolean bl = this.o != null && this.i.t().equalsIgnoreCase(this.o);
        return bl;
    }

    final O t() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        Object object = this.g;
        if (((StringBuilder)object).length() != 0) {
            String string = ((StringBuilder)object).toString();
            ((StringBuilder)object).delete(0, ((StringBuilder)object).length());
            this.f = null;
            object = this.l;
            ((H)object).i(string);
            return object;
        }
        String string = this.f;
        if (string != null) {
            object = this.l;
            ((H)object).i(string);
            this.f = null;
            return object;
        }
        this.e = false;
        return this.d;
    }

    final void u(h1 h12) {
        this.c = h12;
    }
}

