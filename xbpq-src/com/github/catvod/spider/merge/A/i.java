/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.a;
import com.github.catvod.spider.merge.A.d;
import com.github.catvod.spider.merge.A.f;
import com.github.catvod.spider.merge.A.g;

public final class i {
    i a;
    final d b;
    private final int c;
    private final int d;
    int e;
    int[] f;
    private a g = new a();
    private int h;
    private int i;

    public i(d d2, String string, String string2, String[] stringArray) {
        if (d2.p == null) {
            d2.p = this;
        } else {
            d2.q.a = this;
        }
        d2.q = this;
        this.b = d2;
        this.c = d2.g(string);
        this.d = d2.g(string2);
        if (stringArray != null && stringArray.length > 0) {
            int n2;
            this.e = n2 = stringArray.length;
            this.f = new int[n2];
            for (n2 = 0; n2 < this.e; ++n2) {
                this.f[n2] = d2.b((String)stringArray[n2]).a;
            }
        }
    }

    final int a() {
        int n2;
        if (this.g.b > 0) {
            this.b.g("Code");
            n2 = this.g.b + 18 + 0 + 8;
        } else {
            n2 = 8;
        }
        int n3 = n2;
        if (this.e > 0) {
            this.b.g("Exceptions");
            n3 = n2 + (this.e * 2 + 8);
        }
        return n3;
    }

    final void b(a a2) {
        int n2 = 1;
        a2.g(1);
        a2.g(this.c);
        a2.g(this.d);
        int n3 = this.g.b;
        int n4 = 0;
        if (n3 <= 0) {
            n2 = 0;
        }
        n3 = n2;
        if (this.e > 0) {
            n3 = n2 + 1;
        }
        a2.g(n3);
        n2 = this.g.b;
        if (n2 > 0) {
            a2.g(this.b.g("Code"));
            a2.f(n2 + 12 + 0);
            a2.g(this.h);
            a2.g(this.i);
            a2.f(this.g.b);
            a a3 = this.g;
            a2.e(a3.a, a3.b);
            a2.g(0);
            a2.g(0);
        }
        if (this.e > 0) {
            a2.g(this.b.g("Exceptions"));
            a2.f(this.e * 2 + 2);
            a2.g(this.e);
            for (n2 = n4; n2 < this.e; ++n2) {
                a2.g(this.f[n2]);
            }
        }
    }

    public final void c(int n2, String object, String string, String string2) {
        object = this.b.d((String)object, string, string2);
        this.g.c(n2, ((f)object).a);
    }

    public final void d(int n2) {
        a a2 = this.g;
        a2.d(132);
        a2.b(n2, 1);
    }

    public final void e(int n2) {
        this.g.d(n2);
    }

    public final void f(int n2, int n3) {
        this.g.b(n2, n3);
    }

    public final void g(int n2, g g2) {
        if ((g2.a & 2) != 0 && g2.b - this.g.b < Short.MIN_VALUE) {
            throw new UnsupportedOperationException();
        }
        this.g.d(n2);
        a a2 = this.g;
        int n3 = a2.b;
        boolean bl = true;
        if (n2 != 200) {
            bl = false;
        }
        g2.b(a2, n3 - 1, bl);
    }

    public final void h(g g2) {
        a a2 = this.g;
        g2.c(a2.b, a2.a);
    }

    public final void i(Object object) {
        block3: {
            int n2;
            int n3;
            block2: {
                block0: {
                    block1: {
                        object = this.b.c(object);
                        n3 = ((f)object).a;
                        n2 = ((f)object).b;
                        if (n2 == 5 || n2 == 6) break block0;
                        if (n3 < 256) break block1;
                        object = this.g;
                        n2 = 19;
                        break block2;
                    }
                    this.g.b(18, n3);
                    break block3;
                }
                object = this.g;
                n2 = 20;
            }
            ((a)object).c(n2, n3);
        }
    }

    public final void j(int n2, int n3) {
        this.h = n2;
        this.i = n3;
    }

    public final void k(int n2, String object, String object2, String string) {
        block12: {
            block6: {
                block7: {
                    int n3 = 1;
                    boolean bl = n2 == 185;
                    object = this.b.e((String)object, (String)object2, string, bl);
                    int n4 = ((f)object).c;
                    if (!bl) break block6;
                    n2 = n4;
                    if (n4 != 0) break block7;
                    n4 = 1;
                    n2 = 1;
                    while (true) {
                        int n5;
                        block8: {
                            block10: {
                                block11: {
                                    block9: {
                                        n5 = n4 + 1;
                                        if ((n4 = (int)string.charAt(n4)) != 41) break block8;
                                        if ((n5 = (int)string.charAt(n5)) != 86) break block9;
                                        n4 = 0;
                                        break block10;
                                    }
                                    if (n5 == 68) break block11;
                                    n4 = n3;
                                    if (n5 != 74) break block10;
                                }
                                n4 = 2;
                            }
                            ((f)object).c = n2 = n2 << 2 | n4;
                            break;
                        }
                        if (n4 == 76) {
                            while (true) {
                                n4 = n5 + 1;
                                if (string.charAt(n5) == ';') break;
                                n5 = n4;
                            }
                            ++n2;
                            continue;
                        }
                        n2 = n4 != 68 && n4 != 74 ? ++n2 : (n2 += 2);
                        n4 = n5;
                    }
                }
                object2 = this.g;
                ((a)object2).c(185, ((f)object).a);
                ((a)object2).b(n2 >> 2, 0);
                break block12;
            }
            this.g.c(n2, ((f)object).a);
        }
    }

    public final void l(int n2, String object) {
        object = this.b.b((String)object);
        this.g.c(n2, ((f)object).a);
    }

    public final void m(int n2, int n3) {
        if (n3 < 4 && n2 != 169) {
            n2 = n2 < 54 ? (n2 - 21 << 2) + 26 : (n2 - 54 << 2) + 59;
            this.g.d(n2 + n3);
        } else if (n3 >= 256) {
            a a2 = this.g;
            a2.d(196);
            a2.c(n2, n3);
        } else {
            this.g.b(n2, n3);
        }
    }
}

