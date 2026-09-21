/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.a;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.A.e;
import com.github.catvod.spider.merge.A.f;
import com.github.catvod.spider.merge.A.i;
import com.github.catvod.spider.merge.A.j;

public final class d {
    int a;
    int b = 1;
    final a c = new a();
    f[] d = new f[256];
    int e = (int)((double)256 * 0.75);
    final f f = new f();
    final f g = new f();
    final f h = new f();
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    e n;
    e o;
    i p;
    i q;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private f a(f var1_1) {
        var5_2 /* !! */  = this.d;
        var5_2 /* !! */  = var5_2 /* !! */ [var1_1.h % var5_2 /* !! */ .length];
        while (var5_2 /* !! */  != null) {
            block10: {
                block9: {
                    block11: {
                        block12: {
                            var2_3 = var5_2 /* !! */ .b;
                            var3_4 = var1_1.b;
                            if (var2_3 != var3_4) break block10;
                            var4_5 = true;
                            if (var3_4 == 1) break block11;
                            if (var3_4 == 15) ** GOTO lbl-1000
                            if (var3_4 == 12) break block12;
                            if (var3_4 == 13) break block11;
                            switch (var3_4) {
                                default: {
                                    if (!var5_2 /* !! */ .e.equals(var1_1.e) || !var5_2 /* !! */ .f.equals(var1_1.f) || !var5_2 /* !! */ .g.equals(var1_1.g)) ** GOTO lbl18
                                    break block9;
                                }
                                case 3: 
                                case 4: {
                                    if (var5_2 /* !! */ .c == var1_1.c) break block9;
lbl18:
                                    // 4 sources

                                    while (true) {
                                        var4_5 = false;
                                        break block9;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var5_2 /* !! */ .e.equals(var1_1.e) || !var5_2 /* !! */ .f.equals(var1_1.f)) ** GOTO lbl18
                        break block9;
                        {
                            case 5: 
                            case 6: lbl-1000:
                            // 2 sources

                            {
                                if (var5_2 /* !! */ .d == var1_1.d) ** break;
                                ** continue;
                                break block9;
                            }
                            ** case 7:
                            ** case 8:
                        }
                    }
                    var4_5 = var5_2 /* !! */ .e.equals(var1_1.e);
                }
                if (var4_5) break;
            }
            var5_2 /* !! */  = var5_2 /* !! */ .i;
        }
        return var5_2 /* !! */ ;
    }

    private void h(f f2) {
        Object object;
        int n2;
        if (this.b > this.e) {
            int n3;
            n2 = this.d.length;
            int n4 = n2 * 2 + 1;
            f[] fArray = new f[n4];
            block0: while ((n3 = n2 - 1) >= 0) {
                object = this.d[n3];
                while (true) {
                    n2 = n3;
                    if (object == null) continue block0;
                    n2 = object.h % n4;
                    f f4 = object.i;
                    object.i = fArray[n2];
                    fArray[n2] = object;
                    object = f4;
                }
            }
            this.d = fArray;
            this.e = (int)((double)n4 * 0.75);
        }
        n2 = f2.h;
        object = this.d;
        f2.i = object[n2 %= ((f[])object).length];
        object[n2] = f2;
    }

    public final f b(String string) {
        f f2;
        this.g.a(7, string, null, null);
        f f4 = f2 = this.a(this.g);
        if (f2 == null) {
            this.c.c(7, this.g(string));
            int n2 = this.b;
            this.b = n2 + 1;
            f4 = new f(n2, this.g);
            this.h(f4);
        }
        return f4;
    }

    final f c(Object object) {
        if (object instanceof Integer) {
            int n2 = (Integer)object;
            object = this.f;
            ((f)object).b = 3;
            ((f)object).c = n2;
            ((f)object).h = n2 + 3 & Integer.MAX_VALUE;
            f f2 = this.a((f)object);
            object = f2;
            if (f2 == null) {
                object = this.c;
                ((a)object).d(3);
                ((a)object).f(n2);
                n2 = this.b;
                this.b = n2 + 1;
                object = new f(n2, this.f);
                this.h((f)object);
            }
            return object;
        }
        if (object instanceof String) {
            String string = (String)object;
            this.g.a(8, string, null, null);
            f f4 = this.a(this.g);
            object = f4;
            if (f4 == null) {
                this.c.c(8, this.g(string));
                int n3 = this.b;
                this.b = n3 + 1;
                object = new f(n3, this.g);
                this.h((f)object);
            }
            return object;
        }
        if (object instanceof j) {
            object = (j)object;
            object = ((j)object).a == 10 ? ((j)object).d() : ((j)object).c();
            return this.b((String)object);
        }
        throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("value ", object));
    }

    final f d(String object, String string, String string2) {
        f f2;
        this.h.a(9, (String)object, string, string2);
        f f4 = f2 = this.a(this.h);
        if (f2 == null) {
            int n2 = this.b((String)object).a;
            int n3 = this.f((String)string, (String)string2).a;
            object = this.c;
            ((a)object).c(9, n2);
            ((a)object).g(n3);
            n3 = this.b;
            this.b = n3 + 1;
            f4 = new f(n3, this.h);
            this.h(f4);
        }
        return f4;
    }

    final f e(String object, String string, String string2, boolean bl) {
        f f2;
        int n2 = bl ? 11 : 10;
        this.h.a(n2, (String)object, string, string2);
        f f4 = f2 = this.a(this.h);
        if (f2 == null) {
            int n3 = this.b((String)object).a;
            int n4 = this.f((String)string, (String)string2).a;
            object = this.c;
            ((a)object).c(n2, n3);
            ((a)object).g(n4);
            n2 = this.b;
            this.b = n2 + 1;
            f4 = new f(n2, this.h);
            this.h(f4);
        }
        return f4;
    }

    public final f f(String object, String string) {
        f f2;
        this.g.a(12, (String)object, string, null);
        f f4 = f2 = this.a(this.g);
        if (f2 == null) {
            int n2 = this.g((String)object);
            int n3 = this.g(string);
            object = this.c;
            ((a)object).c(12, n2);
            ((a)object).g(n3);
            n3 = this.b;
            this.b = n3 + 1;
            f4 = new f(n3, this.g);
            this.h(f4);
        }
        return f4;
    }

    public final int g(String string) {
        this.f.a(1, string, null, null);
        f f2 = this.a(this.f);
        Object object = f2;
        if (f2 == null) {
            object = this.c;
            ((a)object).d(1);
            ((a)object).h(string);
            int n2 = this.b;
            this.b = n2 + 1;
            object = new f(n2, this.f);
            this.h((f)object);
        }
        return ((f)object).a;
    }

    public final byte[] i() {
        int n2 = this.l * 2 + 24;
        Object object = this.n;
        int n3 = 0;
        while (object != null) {
            ++n3;
            n2 += 8;
            object = ((e)object).a;
        }
        object = this.p;
        int n4 = 0;
        while (object != null) {
            ++n4;
            n2 += ((i)object).a();
            object = ((i)object).a;
        }
        a a2 = new a(n2 + this.c.b);
        a2.f(-889275714);
        a2.f(this.a);
        a2.g(this.b);
        object = this.c;
        a2.e(((a)object).a, ((a)object).b);
        a2.g(this.i & 0xFFF9FFFF);
        a2.g(this.j);
        a2.g(this.k);
        a2.g(this.l);
        for (n2 = 0; n2 < this.l; ++n2) {
            a2.g(this.m[n2]);
        }
        a2.g(n3);
        object = this.n;
        while (object != null) {
            ((e)object).a(a2);
            object = ((e)object).a;
        }
        a2.g(n4);
        object = this.p;
        while (object != null) {
            ((i)object).b(a2);
            object = ((i)object).a;
        }
        a2.g(0);
        return a2.a;
    }

    public final void j(String string, String string2, String[] stringArray) {
        this.a = 49;
        this.i = 33;
        this.j = this.b((String)string).a;
        int n2 = 0;
        int n3 = string2 == null ? 0 : this.b((String)string2).a;
        this.k = n3;
        if (stringArray != null && stringArray.length > 0) {
            this.l = n3 = stringArray.length;
            this.m = new int[n3];
            for (n3 = n2; n3 < this.l; ++n3) {
                this.m[n3] = this.b((String)stringArray[n3]).a;
            }
        }
    }
}

