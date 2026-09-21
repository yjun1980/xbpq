/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.F0.m;
import com.github.catvod.spider.merge.xc.F0.n;
import com.github.catvod.spider.merge.xc.G0.C;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.I;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.M;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.a;
import com.github.catvod.spider.merge.xc.G0.g1;
import java.util.AbstractCollection;
import java.util.Arrays;

public final class P {
    public static final char[] t;
    public static final int[] u;
    public final a a;
    public final C b;
    public g1 c = g1.a;
    public N d = null;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);
    public final L i;
    public final K j;
    public M k;
    public final G l;
    public final I m;
    public final H n;
    public String o;
    public String p;
    public int q;
    public final int[] r;
    public final int[] s;

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
        t = cArray;
        u = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArray);
    }

    public P(a a2, C c2) {
        L l2;
        this.i = l2 = new L();
        this.j = new K();
        this.k = l2;
        this.l = new G();
        this.m = new I();
        this.n = new H();
        this.q = -1;
        this.r = new int[1];
        this.s = new int[2];
        this.a = a2;
        this.b = c2;
    }

    public final void a(String string, Object ... objectArray) {
        C c2 = this.b;
        if (c2.a()) {
            string = String.format("Invalid character reference: ".concat(string), objectArray);
            ((AbstractCollection)c2).add(new B(this.a, string));
        }
    }

    public final int[] b(Character object, boolean bl) {
        boolean bl2;
        Object object2;
        block33: {
            Object object3;
            int n2;
            int[] nArray;
            block32: {
                char c2;
                char c3;
                int n3;
                object2 = this.a;
                if (((a)object2).n()) {
                    return null;
                }
                if (object != null && ((Character)object).charValue() == ((a)object2).l()) {
                    return null;
                }
                object = t;
                ((a)object2).b();
                if (!((a)object2).n() && Arrays.binarySearch((char[])object, ((a)object2).a[((a)object2).e]) >= 0) {
                    return null;
                }
                if (((a)object2).c - ((a)object2).e < 1024) {
                    ((a)object2).d = 0;
                }
                ((a)object2).b();
                ((a)object2).g = ((a)object2).e;
                bl2 = ((a)object2).p("#");
                nArray = this.r;
                if (bl2) {
                    int n4;
                    int n5;
                    bl = ((a)object2).q("X");
                    if (bl) {
                        char c4;
                        ((a)object2).b();
                        n5 = ((a)object2).e;
                        while ((n4 = ((a)object2).e) < ((a)object2).c && ((c4 = ((a)object2).a[n4]) >= '0' && c4 <= '9' || c4 >= 'A' && c4 <= 'F' || c4 >= 'a' && c4 <= 'f')) {
                            ((a)object2).e = n4 + 1;
                        }
                        object = com.github.catvod.spider.merge.xc.G0.a.c(((a)object2).a, ((a)object2).h, n5, n4 - n5);
                    } else {
                        char c5;
                        ((a)object2).b();
                        n5 = ((a)object2).e;
                        while ((n4 = ((a)object2).e) < ((a)object2).c && (c5 = ((a)object2).a[n4]) >= '0' && c5 <= '9') {
                            ((a)object2).e = n4 + 1;
                        }
                        object = com.github.catvod.spider.merge.xc.G0.a.c(((a)object2).a, ((a)object2).h, n5, n4 - n5);
                    }
                    if (((String)object).length() == 0) {
                        this.a("numeric reference with no numerals", new Object[0]);
                        ((a)object2).x();
                        return null;
                    }
                    ((a)object2).g = -1;
                    if (!((a)object2).p(";")) {
                        this.a("missing semicolon on [&#%s]", object);
                    }
                    n4 = bl ? 16 : 10;
                    try {
                        n4 = Integer.valueOf((String)object, n4);
                    }
                    catch (NumberFormatException numberFormatException) {
                        n4 = -1;
                    }
                    if (n4 != -1 && (n4 < 55296 || n4 > 57343) && n4 <= 0x10FFFF) {
                        n5 = n4;
                        if (n4 >= 128) {
                            n5 = n4;
                            if (n4 < 160) {
                                this.a("character [%s] is not a valid unicode code point", n4);
                                n5 = u[n4 - 128];
                            }
                        }
                        nArray[0] = n5;
                    } else {
                        this.a("character [%s] outside of valid range", n4);
                        nArray[0] = 65533;
                    }
                    return nArray;
                }
                ((a)object2).b();
                n2 = ((a)object2).e;
                while ((n3 = ++((a)object2).e) < ((a)object2).c && ((c3 = ((a)object2).a[n3]) >= 'A' && c3 <= 'Z' || c3 >= 'a' && c3 <= 'z' || Character.isLetter(c3))) {
                }
                while ((n3 = ((a)object2).e) < ((a)object2).c && (c2 = ((a)object2).a[n3]) >= '0' && c2 <= '9') {
                    ((a)object2).e = n3 + 1;
                }
                object = com.github.catvod.spider.merge.xc.G0.a.c(((a)object2).a, ((a)object2).h, n2, n3 - n2);
                bl2 = ((a)object2).r(';');
                object3 = com.github.catvod.spider.merge.xc.F0.n.a;
                object3 = (Object)com.github.catvod.spider.merge.xc.F0.m.f;
                n2 = Arrays.binarySearch(((m)((Object)object3)).a, object);
                n2 = n2 >= 0 ? ((m)((Object)object3)).b[n2] : -1;
                if (n2 != -1) break block32;
                object3 = (Object)com.github.catvod.spider.merge.xc.F0.m.g;
                n2 = Arrays.binarySearch(((m)((Object)object3)).a, object);
                n2 = n2 >= 0 ? ((m)((Object)object3)).b[n2] : -1;
                if (n2 == -1 || !bl2) break block33;
            }
            if (bl && (((a)object2).u() || !((a)object2).n() && (n2 = ((a)object2).a[((a)object2).e]) >= 48 && n2 <= 57 || ((a)object2).s('=', '-', '_'))) {
                ((a)object2).x();
                return null;
            }
            ((a)object2).g = -1;
            if (!((a)object2).p(";")) {
                this.a("missing semicolon on [&%s]", object);
            }
            object3 = (String)com.github.catvod.spider.merge.xc.F0.n.b.get(object);
            object2 = this.s;
            if (object3 != null) {
                object2[0] = ((String)object3).codePointAt(0);
                object2[1] = ((String)object3).codePointAt(1);
                n2 = 2;
            } else {
                object3 = (Object)com.github.catvod.spider.merge.xc.F0.m.g;
                n2 = Arrays.binarySearch(((m)((Object)object3)).a, object);
                n2 = n2 >= 0 ? ((m)((Object)object3)).b[n2] : -1;
                if (n2 != -1) {
                    object2[0] = n2;
                    n2 = 1;
                } else {
                    n2 = 0;
                }
            }
            if (n2 == 1) {
                nArray[0] = (int)object2[0];
                return nArray;
            }
            if (n2 == 2) {
                return object2;
            }
            throw new c("Unexpected characters returned for ".concat((String)object));
        }
        ((a)object2).x();
        if (bl2) {
            this.a("invalid named reference [%s]", object);
        }
        return null;
    }

    public final M c(boolean bl) {
        M m2;
        if (bl) {
            m2 = this.i;
            ((L)m2).p();
        } else {
            m2 = this.j;
            m2.p();
        }
        this.k = m2;
        return m2;
    }

    public final void d() {
        N.g(this.h);
    }

    public final void e(char c2) {
        if (this.f == null) {
            this.f = String.valueOf(c2);
        } else {
            StringBuilder stringBuilder = this.g;
            if (stringBuilder.length() == 0) {
                stringBuilder.append(this.f);
            }
            stringBuilder.append(c2);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void f(N object) {
        if (!this.e) {
            this.d = object;
            this.e = true;
            object.getClass();
            a a2 = this.a;
            a2.getClass();
            this.q = -1;
            int n2 = ((N)object).a;
            if (n2 == 2) {
                this.o = ((L)object).b;
                this.p = null;
            } else if (n2 == 3 && ((M)(object = (K)object)).l()) {
                object = ((M)object).c;
                C c2 = this.b;
                if (c2.a()) {
                    ((AbstractCollection)c2).add(new B(a2, "Attributes incorrectly present on end tag [/%s]", new Object[]{object}));
                }
            }
            return;
        }
        throw new c("Must be false");
    }

    public final void g(String string) {
        if (this.f == null) {
            this.f = string;
        } else {
            StringBuilder stringBuilder = this.g;
            if (stringBuilder.length() == 0) {
                stringBuilder.append(this.f);
            }
            stringBuilder.append(string);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void h(StringBuilder stringBuilder) {
        if (this.f == null) {
            this.f = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder2 = this.g;
            if (stringBuilder2.length() == 0) {
                stringBuilder2.append(this.f);
            }
            stringBuilder2.append((CharSequence)stringBuilder);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void i() {
        this.f(this.n);
    }

    public final void j() {
        this.f(this.m);
    }

    public final void k() {
        M m2 = this.k;
        if (m2.f) {
            m2.o();
        }
        this.f(this.k);
    }

    public final void l(g1 g12) {
        C c2 = this.b;
        if (c2.a()) {
            ((AbstractCollection)c2).add(new B(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{g12}));
        }
    }

    public final void m(g1 g12) {
        C c2 = this.b;
        if (c2.a()) {
            a a2 = this.a;
            ((AbstractCollection)c2).add(new B(a2, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(a2.l()), g12}));
        }
    }

    public final boolean n() {
        boolean bl = this.o != null && this.k.m().equalsIgnoreCase(this.o);
        return bl;
    }

    public final void o(g1 g12) {
        int n2 = g12.ordinal();
        a a2 = this.a;
        if (n2 != 0) {
            if (n2 == 7) {
                a2.w();
            }
        } else if (this.q == -1) {
            this.q = a2.w();
        }
        this.c = g12;
    }
}

