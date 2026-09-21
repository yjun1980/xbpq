/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.o;
import com.github.catvod.spider.merge.f1.C;
import com.github.catvod.spider.merge.f1.D;
import com.github.catvod.spider.merge.f1.I;
import com.github.catvod.spider.merge.f1.J;
import com.github.catvod.spider.merge.f1.K;
import com.github.catvod.spider.merge.f1.M;
import com.github.catvod.spider.merge.f1.N;
import com.github.catvod.spider.merge.f1.O;
import com.github.catvod.spider.merge.f1.P;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.f1.i1;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Objects;

final class S {
    private static final char[] u;
    static final int[] v;
    private final a a;
    private final D b;
    private i1 c = i1.a;
    private P d = null;
    private boolean e = false;
    private String f = null;
    private final StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    N i = new N();
    M j = new M();
    O k = this.i;
    I l = new I();
    K m = new K();
    J n = new J();
    private String o;
    private String p;
    private int q;
    private int r = -1;
    private final int[] s = new int[1];
    private final int[] t = new int[2];

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
        u = cArray;
        v = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArray);
    }

    S(a a2, D d2) {
        this.a = a2;
        this.b = d2;
    }

    private void d(String string, Object ... objectArray) {
        if (this.b.a()) {
            D d2 = this.b;
            a a2 = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid character reference: ");
            stringBuilder.append(string);
            ((AbstractCollection)d2).add(new C(a2, String.format(stringBuilder.toString(), objectArray)));
        }
    }

    final void a(i1 i12) {
        this.v(i12);
        this.a.a();
    }

    final String b() {
        return this.o;
    }

    final String c() {
        if (this.p == null) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("</");
            stringBuilder.append(this.o);
            this.p = stringBuilder.toString();
        }
        return this.p;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final int[] e(Character object, boolean bl) {
        int n2;
        Object object2;
        block21: {
            block20: {
                block19: {
                    if (this.a.w()) {
                        return null;
                    }
                    if (object != null && ((Character)object).charValue() == this.a.u()) {
                        return null;
                    }
                    if (this.a.G(u)) {
                        return null;
                    }
                    object2 = this.s;
                    this.a.B();
                    if (!this.a.C("#")) break block19;
                    bl = this.a.D("X");
                    object = this.a;
                    object = bl ? ((a)object).j() : ((a)object).i();
                    if (((String)object).length() == 0) {
                        this.d("numeric reference with no numerals", new Object[0]);
                        break block20;
                    } else {
                        this.a.Q();
                        if (!this.a.C(";")) {
                            this.d("missing semicolon on [&#%s]", object);
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
                                object = v;
                                int n5 = n3;
                                if (n3 < 160) {
                                    this.d("character [%s] is not a valid unicode code point", n3);
                                    object3 = object[n3 - 128];
                                }
                            }
                            object2[0] = object3;
                            return object2;
                        }
                        this.d("character [%s] outside of valid range", n3);
                        object2[0] = 65533;
                        return object2;
                    }
                }
                object = this.a.l();
                boolean bl2 = this.a.E(';');
                n2 = !(com.github.catvod.spider.merge.e1.o.f((String)object) || com.github.catvod.spider.merge.e1.o.g((String)object) && bl2) ? 0 : 1;
                if (n2 == 0) {
                    this.a.M();
                    if (!bl2) return null;
                    this.d("invalid named reference [%s]", object);
                    return null;
                }
                if (!bl || !this.a.J() && !this.a.I() && !this.a.F('=', '-', '_')) break block21;
            }
            this.a.M();
            return null;
        }
        this.a.Q();
        if (!this.a.C(";")) {
            this.d("missing semicolon on [&%s]", object);
        }
        if ((n2 = com.github.catvod.spider.merge.e1.o.c((String)object, this.t)) == 1) {
            object2[0] = this.t[0];
            return object2;
        }
        if (n2 == 2) {
            return this.t;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unexpected characters returned for ");
        ((StringBuilder)object2).append((String)object);
        com.github.catvod.spider.merge.c1.d.c(((StringBuilder)object2).toString());
        throw null;
    }

    final void f() {
        this.n.h();
        Objects.requireNonNull(this.n);
    }

    final void g() {
        this.m.h();
    }

    final O h(boolean bl) {
        O o2;
        if (bl) {
            o2 = this.i;
            ((N)o2).y();
        } else {
            o2 = this.j;
            o2.y();
        }
        this.k = o2;
        return o2;
    }

    final void i() {
        P.i(this.h);
    }

    final void j(char c2) {
        if (this.f == null) {
            this.f = String.valueOf(c2);
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(c2);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void k(P p2) {
        com.github.catvod.spider.merge.c1.d.e(this.e);
        this.d = p2;
        this.e = true;
        p2.j(this.q);
        p2.a(this.a.L());
        this.r = -1;
        int n2 = p2.a;
        if (n2 == 2) {
            this.o = ((N)p2).d;
            this.p = null;
        } else if (n2 == 3 && ((O)(p2 = (M)p2)).u()) {
            this.s("Attributes incorrectly present on end tag [/%s]", ((O)p2).e);
        }
    }

    final void l(String string) {
        if (this.f == null) {
            this.f = string;
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(string);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void m(StringBuilder stringBuilder) {
        if (this.f == null) {
            this.f = stringBuilder.toString();
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append((CharSequence)stringBuilder);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void n() {
        this.k(this.n);
    }

    final void o() {
        this.k(this.m);
    }

    final void p() {
        this.k.s();
        this.k(this.k);
    }

    final void q(i1 i12) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new C(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{i12}));
        }
    }

    final void r(i1 i12) {
        if (this.b.a()) {
            D d2 = this.b;
            a a2 = this.a;
            ((AbstractCollection)d2).add(new C(a2, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(a2.u()), i12}));
        }
    }

    final void s(String string, Object ... objectArray) {
        if (this.b.a()) {
            ((AbstractCollection)this.b).add(new C(this.a, string, objectArray));
        }
    }

    final boolean t() {
        boolean bl = this.o != null && this.k.w().equalsIgnoreCase(this.o);
        return bl;
    }

    final P u() {
        while (!this.e) {
            this.c.l(this, this.a);
        }
        Object object = this.g;
        if (((StringBuilder)object).length() != 0) {
            String string = ((StringBuilder)object).toString();
            ((StringBuilder)object).delete(0, ((StringBuilder)object).length());
            object = this.l;
            ((I)object).k(string);
            this.f = null;
            return object;
        }
        String string = this.f;
        if (string != null) {
            object = this.l;
            ((I)object).k(string);
            this.f = null;
            return object;
        }
        this.e = false;
        return this.d;
    }

    final void v(i1 i12) {
        int n2 = i12.ordinal();
        if (n2 != 0) {
            if (n2 == 7) {
                this.q = this.a.L();
            }
        } else if (this.r == -1) {
            this.r = this.a.L();
        }
        this.c = i12;
    }
}

