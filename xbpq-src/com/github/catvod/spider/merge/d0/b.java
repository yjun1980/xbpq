/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.c0.o;
import com.github.catvod.spider.merge.c0.r;
import com.github.catvod.spider.merge.c0.u;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.d0.A;
import com.github.catvod.spider.merge.d0.B;
import com.github.catvod.spider.merge.d0.C;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.d0.G;
import com.github.catvod.spider.merge.d0.H;
import com.github.catvod.spider.merge.d0.I;
import com.github.catvod.spider.merge.d0.L;
import com.github.catvod.spider.merge.d0.M;
import com.github.catvod.spider.merge.d0.N;
import com.github.catvod.spider.merge.d0.O;
import com.github.catvod.spider.merge.d0.Q;
import com.github.catvod.spider.merge.d0.a;
import com.github.catvod.spider.merge.d0.e;
import com.github.catvod.spider.merge.d0.f;
import com.github.catvod.spider.merge.d0.g;
import com.github.catvod.spider.merge.d0.h;
import com.github.catvod.spider.merge.d0.h1;
import com.github.catvod.spider.merge.d0.i;
import com.github.catvod.spider.merge.d0.i1;
import com.github.catvod.spider.merge.d0.l;
import com.github.catvod.spider.merge.d0.s;
import com.github.catvod.spider.merge.d0.w;
import com.github.catvod.spider.merge.d0.y;
import java.io.Reader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class b
extends i1 {
    static final String[] A;
    static final String[] B;
    static final String[] v;
    static final String[] w;
    static final String[] x;
    static final String[] y;
    static final String[] z;
    private A k;
    private A l;
    private boolean m;
    private com.github.catvod.spider.merge.c0.l n;
    private o o;
    private ArrayList<com.github.catvod.spider.merge.c0.l> p;
    private List<String> q;
    private L r;
    private boolean s;
    private boolean t;
    private String[] u = new String[]{null};

    static {
        String string = cYh.d("0620313D322E");
        String string2 = cYh.d("043131253E3509");
        String string3 = cYh.d("0F242C3D");
        String string4 = cYh.d("0A313320223F02");
        String string5 = cYh.d("08322B34342E");
        String string6 = cYh.d("1331233D32");
        String string7 = cYh.d("1334");
        String string8 = cYh.d("1338");
        v = new String[]{string, string2, string3, string4, string5, string6, string7, string8};
        String string9 = cYh.d("083C");
        String string10 = cYh.d("123C");
        w = new String[]{string9, string10};
        String string11 = cYh.d("052535253834");
        x = new String[]{string11};
        y = new String[]{string3, string6};
        String string12 = cYh.d("0820353625351220");
        String string13 = cYh.d("082035383834");
        z = new String[]{string12, string13};
        A = new String[]{cYh.d("0334"), cYh.d("0324"), cYh.d("0B39"), string12, string13, cYh.d("17"), cYh.d("1520"), cYh.d("1524")};
        B = new String[]{cYh.d("06342523322914"), string, cYh.d("06222430"), cYh.d("06223538343602"), cYh.d("0623283532"), cYh.d("05313234"), cYh.d("0531323431350924"), cYh.d("0537323E223403"), cYh.d("053C2E323C2B123F3534"), cYh.d("053F2528"), cYh.d("0522"), string11, string2, cYh.d("04352F253228"), cYh.d("043F2D"), cYh.d("043F2D3625351220"), cYh.d("043F2C3C363403"), cYh.d("0334"), cYh.d("033535303E3614"), cYh.d("033933"), cYh.d("033937"), cYh.d("033C"), cYh.d("0324"), cYh.d("023D233433"), cYh.d("0139243D33290224"), cYh.d("01392632362A13392E3F"), cYh.d("01392624253F"), cYh.d("013F2E253228"), cYh.d("013F333C"), cYh.d("0122203C32"), cYh.d("0122203C32290224"), cYh.d("0F61"), cYh.d("0F62"), cYh.d("0F63"), cYh.d("0F64"), cYh.d("0F65"), cYh.d("0F66"), cYh.d("0F352035"), cYh.d("0F3520353228"), cYh.d("0F37333E222A"), cYh.d("0F22"), string3, cYh.d("0E3633303A3F"), cYh.d("0E3D26"), cYh.d("0E3E312423"), cYh.d("0E23283F333F1F"), cYh.d("0B39"), cYh.d("0B392F3A"), cYh.d("0B3932253E3400"), string4, cYh.d("0A352F24"), cYh.d("0A353530"), cYh.d("093137"), cYh.d("093F243C353F03"), cYh.d("093F272336370223"), cYh.d("093F323225331724"), string5, string9, cYh.d("17"), cYh.d("173133303A"), cYh.d("173C2038392E022835"), cYh.d("172224"), cYh.d("14333338272E"), cYh.d("143522253E3509"), cYh.d("14352D34342E"), cYh.d("1424383D32"), cYh.d("14252C3C36281E"), string6, cYh.d("13322E352E"), string7, cYh.d("1335392536280231"), cYh.d("13362E3E23"), string8, cYh.d("1338243033"), cYh.d("1339353D32"), cYh.d("1322"), string10, cYh.d("103233"), cYh.d("1F3D31")};
    }

    private boolean A(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.e.size() - 1;
        int n3 = n2 > 100 ? n2 - 100 : 0;
        while (n2 >= n3) {
            String string = this.e.get(n2).d0();
            if (com.github.catvod.spider.merge.b0.b.b(string, stringArray)) {
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && com.github.catvod.spider.merge.b0.b.b(string, stringArray3)) {
                return false;
            }
            --n2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void K(r var1_1) {
        block3: {
            if (!this.e.isEmpty()) break block3;
            var2_2 = this.d;
            ** GOTO lbl9
        }
        if (this.t) {
            this.I(var1_1);
        } else {
            var2_2 = this.a();
lbl9:
            // 2 sources

            var2_2.L(var1_1);
        }
        if (var1_1 instanceof com.github.catvod.spider.merge.c0.l && (var2_2 = (com.github.catvod.spider.merge.c0.l)var1_1).m0().e() && (var1_1 = this.o) != null) {
            var1_1.r0(var2_2);
        }
    }

    private boolean M(ArrayList<com.github.catvod.spider.merge.c0.l> arrayList, com.github.catvod.spider.merge.c0.l l2) {
        int n2 = arrayList.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            if (arrayList.get(n2) == l2) {
                return true;
            }
            --n2;
        }
        return false;
    }

    private void j(String ... stringArray) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            boolean bl;
            com.github.catvod.spider.merge.c0.l l2 = this.e.get(i2);
            String string = l2.d0();
            int n2 = com.github.catvod.spider.merge.b0.b.d;
            int n3 = stringArray.length;
            boolean bl2 = false;
            n2 = 0;
            while (true) {
                bl = bl2;
                if (n2 >= n3) break;
                if (stringArray[n2].equals(string)) {
                    bl = true;
                    break;
                }
                ++n2;
            }
            if (bl || l2.d0().equals(cYh.d("0F242C3D"))) break;
            this.e.remove(i2);
        }
    }

    final boolean B(String string) {
        String[] stringArray = y;
        String[] stringArray2 = this.u;
        stringArray2[0] = string;
        return this.A(stringArray2, stringArray, null);
    }

    protected final void C(Reader reader, E e2) {
        com.github.catvod.spider.merge.c0.h h2;
        this.d = h2 = new com.github.catvod.spider.merge.c0.h();
        h2.t0(e2);
        this.a = e2;
        this.h = D.c;
        this.b = new a(reader, 32768);
        this.g = null;
        this.c = new Q(this.b, e2.a());
        this.e = new ArrayList(32);
        this.f = "";
        this.k = com.github.catvod.spider.merge.d0.A.c;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = new ArrayList();
        this.q = new ArrayList<String>();
        this.r = new L();
        this.s = true;
        this.t = false;
    }

    final com.github.catvod.spider.merge.c0.l D(M object) {
        Object object2;
        if (((N)object).r() && !((N)object).j.isEmpty() && ((N)object).j.i(this.h) > 0 && ((C)(object2 = this.a.a())).a()) {
            ((AbstractCollection)object2).add(new B(this.b.E(), cYh.d("2325313D3E3906242471362E13222833222E02")));
        }
        if (((N)object).i) {
            object = this.G((M)object);
            this.e.add((com.github.catvod.spider.merge.c0.l)object);
            this.c.u(h1.c);
            object2 = this.c;
            L l2 = this.r;
            l2.v();
            l2.s(((com.github.catvod.spider.merge.c0.l)object).n0());
            ((Q)object2).j(l2);
            return object;
        }
        F f2 = F.l(((N)object).t(), this.h);
        object2 = this.h;
        object = ((N)object).j;
        ((D)object2).b((c)object);
        object = new com.github.catvod.spider.merge.c0.l(f2, null, (c)object);
        this.K((r)object);
        this.e.add((com.github.catvod.spider.merge.c0.l)object);
        return object;
    }

    final void E(H object) {
        Object object2 = this.a();
        com.github.catvod.spider.merge.c0.l l2 = object2;
        if (object2 == null) {
            l2 = this.d;
        }
        object2 = l2.d0();
        String string = ((H)object).j();
        object = object instanceof G ? new com.github.catvod.spider.merge.c0.d(string) : (this.b((String)object2) ? new com.github.catvod.spider.merge.c0.f(string) : new u(string));
        l2.L((r)object);
    }

    final void F(I i2) {
        this.K(new com.github.catvod.spider.merge.c0.e(i2.k()));
    }

    final com.github.catvod.spider.merge.c0.l G(M m2) {
        F f2 = F.l(m2.t(), this.h);
        D d2 = this.h;
        Cloneable cloneable = m2.j;
        d2.b((c)cloneable);
        cloneable = new com.github.catvod.spider.merge.c0.l(f2, null, (c)cloneable);
        this.K((r)cloneable);
        if (m2.i) {
            if (f2.g()) {
                if (!f2.d()) {
                    this.c.r(cYh.d("33312671343B093E2E257738027032343B3C47332D3E243309377A7139351370207121350E346125363D"));
                }
            } else {
                f2.k();
            }
        }
        return cloneable;
    }

    final o H(M object, boolean bl) {
        F f2 = F.l(((N)object).t(), this.h);
        D d2 = this.h;
        object = ((N)object).j;
        d2.b((c)object);
        this.o = object = new o(f2, (c)object);
        this.K((r)object);
        if (bl) {
            this.e.add((com.github.catvod.spider.merge.c0.l)object);
        }
        return object;
    }

    final void I(r r2) {
        com.github.catvod.spider.merge.c0.l l2;
        com.github.catvod.spider.merge.c0.l l3 = this.t(cYh.d("1331233D32"));
        boolean bl = false;
        if (l3 != null) {
            if (l3.f0() != null) {
                l2 = l3.f0();
                bl = true;
            } else {
                l2 = this.g(l3);
            }
        } else {
            l2 = this.e.get(0);
        }
        if (bl) {
            com.github.catvod.spider.merge.N.a.k(l3);
            l3.f(r2);
        } else {
            l2.L(r2);
        }
    }

    final void J() {
        this.p.add(null);
    }

    final com.github.catvod.spider.merge.c0.l L(String object) {
        object = new com.github.catvod.spider.merge.c0.l(F.l((String)object, this.h), null, null);
        this.K((r)object);
        this.e.add((com.github.catvod.spider.merge.c0.l)object);
        return object;
    }

    final boolean N(com.github.catvod.spider.merge.c0.l l2) {
        return this.M(this.p, l2);
    }

    final boolean O(com.github.catvod.spider.merge.c0.l l2) {
        return com.github.catvod.spider.merge.b0.b.b(l2.d0(), B);
    }

    final void P() {
        this.l = this.k;
    }

    final void Q(com.github.catvod.spider.merge.c0.l object) {
        if (this.m) {
            return;
        }
        if (((String)(object = ((r)object).a(cYh.d("0F222437")))).length() != 0) {
            this.f = object;
            this.m = true;
            this.d.G((String)object);
        }
    }

    final void R() {
        this.q = new ArrayList<String>();
    }

    final boolean S(com.github.catvod.spider.merge.c0.l l2) {
        return this.M(this.e, l2);
    }

    final A T() {
        return this.l;
    }

    final com.github.catvod.spider.merge.c0.l U() {
        int n2 = this.e.size();
        return this.e.remove(n2 - 1);
    }

    final com.github.catvod.spider.merge.c0.l V(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            com.github.catvod.spider.merge.c0.l l2 = this.e.get(i2);
            this.e.remove(i2);
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    final int W(com.github.catvod.spider.merge.c0.l l2) {
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            if (l2 != this.p.get(i2)) continue;
            return i2;
        }
        return -1;
    }

    final boolean X(O o2, A a2) {
        this.g = o2;
        return a2.d(o2, this);
    }

    final void Y(com.github.catvod.spider.merge.c0.l l2) {
        this.h(l2);
        this.p.add(l2);
    }

    final void Z(com.github.catvod.spider.merge.c0.l l2, int n2) {
        this.h(l2);
        this.p.add(n2, l2);
    }

    /*
     * Unable to fully structure code
     */
    final void a0() {
        if (this.p.size() > 0) {
            var5_1 = this.p;
            var5_1 = var5_1.get(var5_1.size() - 1);
        } else {
            var5_1 = null;
        }
        if (var5_1 != null && !this.S((com.github.catvod.spider.merge.c0.l)var5_1)) {
            var1_2 = this.p.size();
            var3_3 = true;
            var1_2 = var4_4 = var1_2 - 1;
            while (var1_2 != 0) {
                var5_1 = this.p;
                var2_5 = var1_2 - 1;
                var6_6 = (com.github.catvod.spider.merge.c0.l)var5_1.get(var2_5);
                var5_1 = var6_6;
                var1_2 = var2_5;
                if (var6_6 != null) {
                    var5_1 = var6_6;
                    var1_2 = var2_5;
                    if (!this.S(var6_6)) continue;
                    var1_2 = var2_5;
                    var5_1 = var6_6;
                }
                while (true) {
                    var3_3 = false;
                    break;
                }
                break;
            }
            var2_5 = var1_2;
            if (!var3_3) {
                var5_1 = this.p;
                var2_5 = var1_2 + 1;
                var5_1 = (com.github.catvod.spider.merge.c0.l)var5_1.get(var2_5);
            }
            com.github.catvod.spider.merge.N.a.k(var5_1);
            var6_6 = this.L(var5_1.d0());
            var6_6.d().e(var5_1.d());
            this.p.set(var2_5, var6_6);
            var1_2 = var2_5;
            if (var2_5 != var4_4) ** continue;
        }
    }

    @Override
    protected final boolean b(String string) {
        boolean bl = string.equals(cYh.d("14333338272E")) || string.equals(cYh.d("1424383D32"));
        return bl;
    }

    final void b0(com.github.catvod.spider.merge.c0.l l2) {
        int n2;
        int n3 = this.p.size();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (this.p.get(n2) != l2) continue;
            this.p.remove(n2);
            break;
        }
    }

    @Override
    protected final boolean c(O o2) {
        this.g = o2;
        return this.k.d(o2, this);
    }

    final boolean c0(com.github.catvod.spider.merge.c0.l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != l2) continue;
            this.e.remove(i2);
            return true;
        }
        return false;
    }

    final void d0(com.github.catvod.spider.merge.c0.l l2, com.github.catvod.spider.merge.c0.l l3) {
        ArrayList<com.github.catvod.spider.merge.c0.l> arrayList = this.p;
        int n2 = arrayList.lastIndexOf(l2);
        boolean bl = n2 != -1;
        com.github.catvod.spider.merge.N.a.f(bl);
        arrayList.set(n2, l3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void e0() {
        void var3_19;
        block13: {
            block14: {
                block15: {
                    int n2 = this.e.size() - 1;
                    boolean bl = false;
                    while (n2 >= 0) {
                        block17: {
                            block16: {
                                void var3_3;
                                void var3_6;
                                com.github.catvod.spider.merge.c0.l l2 = this.e.get(n2);
                                if (n2 == 0) {
                                    Object var3_5 = null;
                                    bl = true;
                                }
                                if (var3_6 != null) {
                                    String string = var3_6.d0();
                                } else {
                                    String string = "";
                                }
                                if (cYh.d("14352D34342E").equals(var3_3)) {
                                    i i2 = com.github.catvod.spider.merge.d0.A.r;
                                    break block13;
                                }
                                if (cYh.d("1334").equals(var3_3) || cYh.d("1338").equals(var3_3) && !bl) break block14;
                                if (cYh.d("1322").equals(var3_3)) {
                                    g g2 = com.github.catvod.spider.merge.d0.A.p;
                                    break block13;
                                }
                                if (cYh.d("13322E352E").equals(var3_3) || cYh.d("1338243033").equals(var3_3) || cYh.d("13362E3E23").equals(var3_3)) break block15;
                                if (cYh.d("043131253E3509").equals(var3_3)) {
                                    com.github.catvod.spider.merge.d0.d d2 = com.github.catvod.spider.merge.d0.A.m;
                                    break block13;
                                }
                                if (cYh.d("043F2D3625351220").equals(var3_3)) {
                                    e e2 = com.github.catvod.spider.merge.d0.A.n;
                                    break block13;
                                }
                                if (cYh.d("1331233D32").equals(var3_3)) {
                                    y y2 = com.github.catvod.spider.merge.d0.A.k;
                                    break block13;
                                }
                                if (cYh.d("0F352035").equals(var3_3) || cYh.d("053F2528").equals(var3_3)) break block16;
                                if (cYh.d("0122203C32290224").equals(var3_3)) {
                                    l l3 = com.github.catvod.spider.merge.d0.A.u;
                                    break block13;
                                }
                                if (cYh.d("0F242C3D").equals(var3_3)) {
                                    s s2 = com.github.catvod.spider.merge.d0.A.e;
                                    break block13;
                                }
                                if (!bl) break block17;
                            }
                            w w2 = com.github.catvod.spider.merge.d0.A.i;
                            break block13;
                        }
                        --n2;
                    }
                    return;
                }
                f f2 = com.github.catvod.spider.merge.d0.A.o;
                break block13;
            }
            h h2 = com.github.catvod.spider.merge.d0.A.q;
        }
        this.k = var3_19;
    }

    final void f0() {
        this.o = null;
    }

    final com.github.catvod.spider.merge.c0.l g(com.github.catvod.spider.merge.c0.l l2) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            if (this.e.get(i2) != l2) continue;
            return this.e.get(i2 - 1);
        }
        return null;
    }

    final void g0(boolean bl) {
        this.t = bl;
    }

    final void h(com.github.catvod.spider.merge.c0.l l2) {
        com.github.catvod.spider.merge.c0.l l3;
        int n2 = 0;
        for (int i2 = this.p.size() - 1; i2 >= 0 && (l3 = this.p.get(i2)) != null; --i2) {
            boolean bl = l2.d0().equals(l3.d0()) && l2.d().equals(l3.d());
            int n3 = n2;
            if (bl) {
                n3 = n2 + 1;
            }
            if (n3 == 3) {
                this.p.remove(i2);
                break;
            }
            n2 = n3;
        }
    }

    final void h0(com.github.catvod.spider.merge.c0.l l2) {
        this.n = l2;
    }

    final void i() {
        int n2;
        com.github.catvod.spider.merge.c0.l l2;
        while (!this.p.isEmpty() && (l2 = (n2 = this.p.size()) > 0 ? this.p.remove(n2 - 1) : null) != null) {
        }
    }

    final A i0() {
        return this.k;
    }

    final void j0(A a2) {
        this.k = a2;
    }

    final void k() {
        this.j(cYh.d("13322E352E"), cYh.d("13362E3E23"), cYh.d("1338243033"), cYh.d("13352C213B3B1335"));
    }

    final void l() {
        this.j(cYh.d("1331233D32"));
    }

    final void m() {
        this.j(cYh.d("1322"), cYh.d("13352C213B3B1335"));
    }

    final void n(A a2) {
        if (this.a.a().a()) {
            C c2 = this.a.a();
            int n2 = this.b.E();
            String string = this.g.getClass().getSimpleName();
            ((AbstractCollection)c2).add(new B(n2, cYh.d("323E2429273F04242435772E083B243F770142231C712032023E6138397A14242025327A3C75320C"), new Object[]{string, a2}));
        }
    }

    final void o(boolean bl) {
        this.s = bl;
    }

    final boolean p() {
        return this.s;
    }

    final void q(String string) {
        while (string != null && !this.a().d0().equals(string) && com.github.catvod.spider.merge.b0.b.b(this.a().d0(), A)) {
            this.U();
        }
    }

    final com.github.catvod.spider.merge.c0.l r(String string) {
        com.github.catvod.spider.merge.c0.l l2;
        for (int i2 = this.p.size() - 1; i2 >= 0 && (l2 = this.p.get(i2)) != null; --i2) {
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    final o s() {
        return this.o;
    }

    final com.github.catvod.spider.merge.c0.l t(String string) {
        int n2 = this.e.size();
        while (--n2 >= 0) {
            com.github.catvod.spider.merge.c0.l l2 = this.e.get(n2);
            if (!l2.d0().equals(string)) continue;
            return l2;
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("33222434152F0E3C2534252104253323323413042E3A32345A"));
        stringBuilder.append(this.g);
        stringBuilder.append(cYh.d("4B703225362E026D"));
        stringBuilder.append((Object)this.k);
        stringBuilder.append(cYh.d("4B7022242528023E35143B3F0A352F256A"));
        stringBuilder.append(this.a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    final com.github.catvod.spider.merge.c0.l u() {
        return this.n;
    }

    final List<String> v() {
        return this.q;
    }

    final boolean w(String string) {
        return this.x(string, x);
    }

    final boolean x(String string, String[] stringArray) {
        String[] stringArray2 = v;
        String[] stringArray3 = this.u;
        stringArray3[0] = string;
        return this.A(stringArray3, stringArray2, stringArray);
    }

    final boolean y(String[] stringArray) {
        return this.A(stringArray, v, null);
    }

    final boolean z(String string) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            String string2 = this.e.get(i2).d0();
            if (string2.equals(string)) {
                return true;
            }
            if (com.github.catvod.spider.merge.b0.b.b(string2, z)) continue;
            return false;
        }
        com.github.catvod.spider.merge.N.a.a(cYh.d("34382E243B3E473E2E2577380270333436390F31233D32"));
        throw null;
    }
}

