/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.C;
import com.github.catvod.spider.merge.Q.E;
import com.github.catvod.spider.merge.Q.F;
import com.github.catvod.spider.merge.Q.G;
import com.github.catvod.spider.merge.Q.I;
import com.github.catvod.spider.merge.Q.J;
import com.github.catvod.spider.merge.Q.K;
import com.github.catvod.spider.merge.Q.L;
import com.github.catvod.spider.merge.Q.M;
import com.github.catvod.spider.merge.Q.N;
import com.github.catvod.spider.merge.Q.O;
import com.github.catvod.spider.merge.Q.P;
import com.github.catvod.spider.merge.Q.T;
import com.github.catvod.spider.merge.Q.U;
import com.github.catvod.spider.merge.Q.V;
import com.github.catvod.spider.merge.Q.W;
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.c0;
import com.github.catvod.spider.merge.Q.d0;
import com.github.catvod.spider.merge.Q.e0;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.g;
import com.github.catvod.spider.merge.Q.h;
import com.github.catvod.spider.merge.Q.i;
import com.github.catvod.spider.merge.Q.j;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.m0;
import com.github.catvod.spider.merge.Q.o;
import com.github.catvod.spider.merge.Q.o0;
import com.github.catvod.spider.merge.Q.p0;
import com.github.catvod.spider.merge.Q.q;
import com.github.catvod.spider.merge.Q.q0;
import com.github.catvod.spider.merge.Q.r;
import com.github.catvod.spider.merge.Q.r0;
import com.github.catvod.spider.merge.Q.s;
import com.github.catvod.spider.merge.Q.t;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.Q.u;
import com.github.catvod.spider.merge.Q.u0;
import com.github.catvod.spider.merge.Q.v;
import com.github.catvod.spider.merge.Q.x;
import com.github.catvod.spider.merge.S.l;
import com.github.catvod.spider.merge.cYh;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class k {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final g a;

    static {
        UUID uUID;
        UUID uUID2;
        UUID uUID3;
        UUID uUID4 = UUID.fromString(cYh.d("54637667661855146C666F18257D751063694A680361157753167413121F5F1100121169"));
        b = uUID3 = UUID.fromString(cYh.d("56140061146F50146C67146A517D75626F1B4A690363607756600312156924157117616B"));
        c = uUID2 = UUID.fromString(cYh.d("261105136F1E50156C10121F217D7565666F4A11056315775F627165136C24167165651F"));
        d = uUID = UUID.fromString(cYh.d("52697763606D5F646C62151F527D7560601B4A12781415775F617260166D556877616F63"));
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        e = arrayList;
        arrayList.add(uUID4);
        arrayList.add(uUID3);
        arrayList.add(uUID2);
        arrayList.add(uUID);
        f = uUID;
    }

    public k() {
        g g2 = g.a();
        this.a = g2;
    }

    private int c(char[] cArray, int n2, List<com.github.catvod.spider.merge.S.j> list, j j2) {
        int n3 = n2 + 1;
        int n4 = cArray[n2];
        n2 = n3;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = cArray[n2];
            n3 = n2 + 1;
            com.github.catvod.spider.merge.S.j j3 = new com.github.catvod.spider.merge.S.j(new int[0]);
            list.add(j3);
            n2 = cArray[n3] != '\u0000' ? 1 : 0;
            if (n2 != 0) {
                j3.a(-1);
            }
            n2 = n3 + 1;
            for (n3 = 0; n3 < n5; ++n3) {
                int n6 = j2.a(cArray, n2);
                int n7 = j2.a(cArray, n2 += j2.size());
                n2 += j2.size();
                j3.b(n6, n7);
            }
        }
        return n2;
    }

    protected static boolean d(UUID uUID, UUID uUID2) {
        List<UUID> list = e;
        int n2 = ((ArrayList)list).indexOf(uUID);
        boolean bl = false;
        if (n2 < 0) {
            return false;
        }
        if (((ArrayList)list).indexOf(uUID2) >= n2) {
            bl = true;
        }
        return bl;
    }

    protected static long e(char[] cArray, int n2) {
        long l2 = cArray[n2] | cArray[n2 + 1] << 16;
        char c2 = cArray[n2 += 2];
        return (long)(cArray[n2 + 1] << 16 | c2) << 32 | l2 & 0xFFFFFFFFL;
    }

    protected final void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(null);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final a b(char[] var1_1) {
        block77: {
            block78: {
                var16_2 = (char[])var1_1.clone();
                for (var2_3 = 1; var2_3 < ((char[])var16_2).length; ++var2_3) {
                    var16_2[var2_3] = (char)(var16_2[var2_3] - 2);
                }
                var2_3 = var16_2[0];
                if (var2_3 != 3) break block77;
                var13_4 = k.e((char[])var16_2, 1);
                var17_5 = new UUID(k.e((char[])var16_2, 5), var13_4);
                if (!k.e.contains(var17_5)) break block78;
                var11_6 = k.d(k.b, (UUID)var17_5);
                var12_7 = k.d(k.c, (UUID)var17_5);
                var15_8 = new a(com.github.catvod.spider.merge.l.a.b(2)[var16_2[9]], var16_2[10]);
                var19_10 /* !! */  = new ArrayList<E>();
                var18_11 = new ArrayList<E>();
                var6_12 = var16_2[11];
                var2_3 = 12;
                for (var3_13 = 0; var3_13 < var6_12; ++var3_13) {
                    block79: {
                        var5_15 /* !! */  = var2_3 + 1;
                        var7_16 = var16_2[var2_3];
                        if (var7_16 == '\u0000') {
                            var15_8.a(null);
                            var2_3 = var5_15 /* !! */ ;
                            continue;
                        }
                        var4_14 /* !! */  = var5_15 /* !! */  + 1;
                        var2_3 = var5_15 /* !! */  = var16_2[var5_15 /* !! */ ];
                        if (var5_15 /* !! */  == 65535) {
                            var2_3 = -1;
                        }
                        switch (var7_16) {
                            default: {
                                throw new IllegalArgumentException(String.format(Locale.getDefault(), cYh.d("33382471242A023328373E3F03703225362E02703528273F477525713E29473E2E25772C063C283579"), new Object[]{(int)var7_16}));
                            }
                            case '\f': {
                                var1_1 = new O();
                                ** GOTO lbl66
                            }
                            case '\u000b': {
                                var1_1 = new U();
                                ** GOTO lbl66
                            }
                            case '\n': {
                                var1_1 = new p0();
                                ** GOTO lbl66
                            }
                            case '\t': {
                                var1_1 = new q0();
                                ** GOTO lbl66
                            }
                            case '\b': {
                                var1_1 = new t();
                                ** GOTO lbl66
                            }
                            case '\u0007': {
                                var1_1 = new e0();
                                ** GOTO lbl66
                            }
                            case '\u0006': {
                                var1_1 = new r0();
                                ** GOTO lbl66
                            }
                            case '\u0005': {
                                var1_1 = new o0();
                                ** GOTO lbl66
                            }
                            case '\u0004': {
                                var1_1 = new T();
                                ** GOTO lbl66
                            }
                            case '\u0003': {
                                var1_1 = new r();
                                ** GOTO lbl66
                            }
                            case '\u0002': {
                                var1_1 = new d0();
                                ** GOTO lbl66
                            }
                            case '\u0001': {
                                var1_1 = new s();
lbl66:
                                // 12 sources

                                var1_1.c = var2_3;
                                break block79;
                            }
                            case '\u0000': 
                        }
                        var1_1 = null;
                    }
                    if (var7_16 == '\f') {
                        var2_3 = var16_2[var4_14 /* !! */ ];
                        var19_10 /* !! */ .add(new l<O, Integer>((O)var1_1, var2_3));
                        var2_3 = var4_14 /* !! */  + 1;
                    } else {
                        var2_3 = var4_14 /* !! */ ;
                        if (var1_1 instanceof u) {
                            var2_3 = var16_2[var4_14 /* !! */ ];
                            var18_11.add(new l<u, Integer>((u)var1_1, var2_3));
                            var2_3 = var4_14 /* !! */  + 1;
                        }
                    }
                    var15_8.a((m)var1_1);
                }
                var19_10 /* !! */  = var19_10 /* !! */ .iterator();
                while (var19_10 /* !! */ .hasNext()) {
                    var1_1 = (l)var19_10 /* !! */ .next();
                    ((O)var1_1.c).g = (m)var15_8.a.get((Integer)var1_1.d);
                }
                var1_1 = var18_11.iterator();
                while (var1_1.hasNext()) {
                    var18_11 = (l)var1_1.next();
                    ((u)var18_11.c).i = (t)var15_8.a.get((Integer)var18_11.d);
                }
                var4_14 /* !! */  = var2_3 + 1;
                var5_15 /* !! */  = var16_2[var2_3];
                var3_13 = 0;
                var2_3 = var4_14 /* !! */ ;
                while (var3_13 < var5_15 /* !! */ ) {
                    var4_14 /* !! */  = var16_2[var2_3];
                    ((v)var15_8.a.get((int)var4_14 /* !! */ )).h = true;
                    ++var3_13;
                    ++var2_3;
                }
                var3_13 = var2_3;
                if (var11_6) {
                    var4_14 /* !! */  = var2_3 + 1;
                    var5_15 /* !! */  = var16_2[var2_3];
                    var3_13 = 0;
                    var2_3 = var4_14 /* !! */ ;
                    while (var3_13 < var5_15 /* !! */ ) {
                        var4_14 /* !! */  = var16_2[var2_3];
                        ((d0)var15_8.a.get((int)var4_14 /* !! */ )).h = true;
                        ++var3_13;
                        ++var2_3;
                    }
                    var3_13 = var2_3;
                }
                var2_3 = var3_13 + 1;
                var6_12 = var16_2[var3_13];
                if (var15_8.e == 1) {
                    var15_8.g = new int[var6_12];
                }
                var15_8.c = new d0[var6_12];
                for (var3_13 = 0; var3_13 < var6_12; ++var3_13) {
                    var5_15 /* !! */  = var2_3 + 1;
                    var2_3 = var16_2[var2_3];
                    var15_8.c[var3_13] = var1_1 = (d0)var15_8.a.get(var2_3);
                    var2_3 = var5_15 /* !! */ ;
                    if (var15_8.e != 1) continue;
                    var4_14 /* !! */  = var5_15 /* !! */  + 1;
                    var2_3 = var5_15 /* !! */  = var16_2[var5_15 /* !! */ ];
                    if (var5_15 /* !! */  == 65535) {
                        var2_3 = -1;
                    }
                    var15_8.g[var3_13] = var2_3;
                    var2_3 = var4_14 /* !! */ ;
                    if (k.d(k.c, (UUID)var17_5)) continue;
                    var2_3 = var4_14 /* !! */  + 1;
                    var4_14 /* !! */  = var16_2[var4_14 /* !! */ ];
                }
                var15_8.d = new e0[var6_12];
                for (m var20_17 : var15_8.a) {
                    if (!(var20_17 instanceof e0)) continue;
                    var19_10 /* !! */  = (e0)var20_17;
                    var1_1 = var15_8.d;
                    var3_13 = var20_17.c;
                    var1_1[var3_13] = var19_10 /* !! */ ;
                    var15_8.c[var3_13].g = var19_10 /* !! */ ;
                }
                var3_13 = var2_3 + 1;
                var4_14 /* !! */  = var16_2[var2_3];
                var2_3 = 0;
                while (var2_3 < var4_14 /* !! */ ) {
                    var5_15 /* !! */  = var16_2[var3_13];
                    var15_8.i.add((r0)var15_8.a.get(var5_15 /* !! */ ));
                    ++var2_3;
                    ++var3_13;
                }
                var18_11 = new ArrayList<com.github.catvod.spider.merge.S.j>();
                var2_3 = var3_13 = this.c((char[])var16_2, var3_13, (List<com.github.catvod.spider.merge.S.j>)var18_11, new h());
                if (k.d(k.d, (UUID)var17_5)) {
                    var2_3 = this.c((char[])var16_2, var3_13, (List<com.github.catvod.spider.merge.S.j>)var18_11, new i());
                }
                var4_14 /* !! */  = var2_3 + 1;
                var5_15 /* !! */  = var16_2[var2_3];
                var2_3 = var4_14 /* !! */ ;
                for (var3_13 = 0; var3_13 < var5_15 /* !! */ ; ++var3_13) {
                    var9_19 = var16_2[var2_3];
                    var8_18 = var16_2[var2_3 + 1];
                    var10_20 = var16_2[var2_3 + 2];
                    var4_14 /* !! */  = var16_2[var2_3 + 3];
                    var7_16 = var16_2[var2_3 + 4];
                    var6_12 = var16_2[var2_3 + 5];
                    var17_5 = (m)var15_8.a.get(var8_18);
                    switch (var10_20) {
                        default: {
                            throw new IllegalArgumentException(cYh.d("33382471242A023328373E3F03703523363414393538383447243821327A0E23613F382E4726203D3E3E49"));
                        }
                        case '\n': {
                            var1_1 = new V((m)var17_5, var4_14 /* !! */ );
                            break;
                        }
                        case '\t': {
                            var1_1 = new u0((m)var17_5);
                            break;
                        }
                        case '\b': {
                            var1_1 = new P((m)var17_5, (com.github.catvod.spider.merge.S.j)var18_11.get(var4_14 /* !! */ ));
                            break;
                        }
                        case '\u0007': {
                            var1_1 = new m0((m)var17_5, (com.github.catvod.spider.merge.S.j)var18_11.get(var4_14 /* !! */ ));
                            break;
                        }
                        case '\u0006': {
                            var1_1 = new o((m)var17_5, var4_14 /* !! */ , var7_16);
                            break;
                        }
                        case '\u0005': {
                            if (var6_12 != 0) {
                                var1_1 = new q((m)var17_5, -1);
                                break;
                            }
                            var1_1 = new q((m)var17_5, var4_14 /* !! */ );
                            break;
                        }
                        case '\u0004': {
                            var11_6 = var6_12 != 0;
                            var1_1 = new W((m)var17_5, var4_14 /* !! */ , var7_16, var11_6);
                            break;
                        }
                        case '\u0003': {
                            var1_1 = new f0((d0)var15_8.a.get(var4_14 /* !! */ ), var6_12, (m)var17_5);
                            break;
                        }
                        case '\u0002': {
                            if (var6_12 != 0) {
                                var1_1 = new c0((m)var17_5, -1, var7_16);
                                break;
                            }
                            var1_1 = new c0((m)var17_5, var4_14 /* !! */ , var7_16);
                            break;
                        }
                        case '\u0001': {
                            var1_1 = new x((m)var17_5);
                        }
                    }
                    ((m)var15_8.a.get(var9_19)).a((t0)var1_1);
                    var2_3 += 6;
                }
                for (Object var17_5 : var15_8.a) {
                    for (var3_13 = 0; var3_13 < var17_5.b(); ++var3_13) {
                        var18_11 = var17_5.d(var3_13);
                        if (!(var18_11 instanceof f0)) continue;
                        var18_11 = (f0)var18_11;
                        var19_10 /* !! */  = var15_8.c;
                        var4_14 /* !! */  = var18_11.a.c;
                        if (!var19_10 /* !! */ [var4_14 /* !! */ ].h || var18_11.b != 0) {
                            var4_14 /* !! */  = -1;
                        }
                        var19_10 /* !! */  = new x(var18_11.c, var4_14 /* !! */ );
                        var15_8.d[var18_11.a.c].a((t0)var19_10 /* !! */ );
                    }
                }
                for (Object var17_5 : var15_8.a) {
                    block80: {
                        if (!(var17_5 instanceof u)) break block80;
                        var19_10 /* !! */  = (u)var17_5;
                        var18_11 = var19_10 /* !! */ .i;
                        if (var18_11 == null) ** GOTO lbl237
                        if (var18_11.g == null) {
                            var18_11.g = var19_10 /* !! */ ;
                        } else {
                            throw new IllegalStateException();
lbl237:
                            // 1 sources

                            throw new IllegalStateException();
                        }
                    }
                    if (var17_5 instanceof U) {
                        var17_5 = (U)var17_5;
                        for (var3_13 = 0; var3_13 < var17_5.b(); ++var3_13) {
                            var18_11 = var17_5.d((int)var3_13).a;
                            if (!(var18_11 instanceof T)) continue;
                            ((T)var18_11).j = var17_5;
                        }
                        continue;
                    }
                    if (!(var17_5 instanceof q0)) continue;
                    var17_5 = (q0)var17_5;
                    for (var3_13 = 0; var3_13 < var17_5.b(); ++var3_13) {
                        var18_11 = var17_5.d((int)var3_13).a;
                        if (!(var18_11 instanceof p0)) continue;
                        ((p0)var18_11).i = var17_5;
                    }
                }
                var4_14 /* !! */  = var2_3 + 1;
                var5_15 /* !! */  = var16_2[var2_3];
                var3_13 = 1;
                var2_3 = var4_14 /* !! */ ;
                while (var3_13 <= var5_15 /* !! */ ) {
                    var4_14 /* !! */  = var16_2[var2_3];
                    var1_1 = (v)var15_8.a.get(var4_14 /* !! */ );
                    var15_8.b.add((v)var1_1);
                    var1_1.g = var3_13 - 1;
                    ++var3_13;
                    ++var2_3;
                }
                if (var15_8.e == 1) {
                    if (var12_7) {
                        var3_13 = var2_3 + 1;
                        var15_8.h = new C[var16_2[var2_3]];
                        for (var2_3 = 0; var2_3 < var15_8.h.length; ++var2_3) {
                            var1_1 = E.values();
                            var4_14 /* !! */  = var3_13 + 1;
                            var1_1 = var1_1[var16_2[var3_13]];
                            var6_12 = var4_14 /* !! */  + 1;
                            var3_13 = var4_14 /* !! */  = (int)var16_2[var4_14 /* !! */ ];
                            if (var4_14 /* !! */  == 65535) {
                                var3_13 = -1;
                            }
                            var4_14 /* !! */  = var5_15 /* !! */  = (int)var16_2[var6_12];
                            if (var5_15 /* !! */  == 65535) {
                                var4_14 /* !! */  = -1;
                            }
                            switch (var1_1.ordinal()) {
                                default: {
                                    throw new IllegalArgumentException(String.format(Locale.getDefault(), cYh.d("33382471242A023328373E3F03702D342F3F157020322333083E61252E2A02706435773314702F3E237A11312D383374"), new Object[]{var1_1}));
                                }
                                case 7: {
                                    var1_1 = new N(var3_13);
                                    break;
                                }
                                case 6: {
                                    var1_1 = M.a;
                                    break;
                                }
                                case 5: {
                                    var1_1 = new L(var3_13);
                                    break;
                                }
                                case 4: {
                                    var1_1 = K.a;
                                    break;
                                }
                                case 3: {
                                    var1_1 = J.a;
                                    break;
                                }
                                case 2: {
                                    var1_1 = new I(var3_13);
                                    break;
                                }
                                case 1: {
                                    var1_1 = new G(var3_13, var4_14 /* !! */ );
                                    break;
                                }
                                case 0: {
                                    var1_1 = new F(var3_13);
                                }
                            }
                            var15_8.h[var2_3] = var1_1;
                            var3_13 = var6_12 + 1;
                        }
                    } else {
                        var1_1 = new ArrayList<E>();
                        var17_5 = var15_8.a.iterator();
                        while (var17_5.hasNext()) {
                            var16_2 = (m)var17_5.next();
                            for (var2_3 = 0; var2_3 < var16_2.b(); ++var2_3) {
                                var18_11 = var16_2.d(var2_3);
                                if (!(var18_11 instanceof o)) continue;
                                var19_10 /* !! */  = (o)var18_11;
                                var3_13 = var19_10 /* !! */ .b;
                                var19_10 /* !! */  = new G(var3_13, var19_10 /* !! */ .c);
                                var18_11 = new o(var18_11.a, var3_13, var1_1.size());
                                var16_2.e.set(var2_3, (t0)var18_11);
                                var1_1.add(var19_10 /* !! */ );
                            }
                        }
                        var15_8.h = var1_1.toArray(new C[var1_1.size()]);
                    }
                }
                for (Object var1_1 : var15_8.a) {
                    if (!(var1_1 instanceof p0) || !var15_8.c[var1_1.c].h || !((var16_2 = var1_1.d((int)(var1_1.b() - 1)).a) instanceof O) || !var16_2.d || !(var16_2.d((int)0).a instanceof e0)) continue;
                    ((p0)var1_1).j = true;
                }
                this.a.getClass();
                this.f(var15_8);
                this.a.getClass();
                return var15_8;
            }
            var15_9 = Locale.getDefault();
            var1_1 = k.f;
            var1_1 = String.format(var15_9, cYh.d("243F343D337A093F3571333F1435333836360E2A2471160E29703638233247051418137A42236179322217352225323E4775327138284731613D323D06333871020F2E14687F"), new Object[]{var17_5, var1_1});
            throw new UnsupportedOperationException(new InvalidClassException(a.class.getName(), (String)var1_1));
        }
        var1_1 = String.format(Locale.getDefault(), cYh.d("243F343D337A093F3571333F1435333836360E2A2471160E297036382332472624232433083E6174337A4F353921323913352571723E4E7E"), new Object[]{var2_3, 3});
        var1_1 = new UnsupportedOperationException(new InvalidClassException(a.class.getName(), (String)var1_1));
        throw var1_1;
    }

    protected final void f(a object) {
        for (m m2 : ((a)object).a) {
            boolean bl;
            block18: {
                block17: {
                    boolean bl2;
                    block16: {
                        if (m2 == null) continue;
                        bl = m2.d;
                        bl2 = false;
                        bl = bl || m2.b() <= 1;
                        this.a(bl);
                        if (m2 instanceof T) {
                            bl = ((T)m2).j != null;
                            this.a(bl);
                        }
                        if (m2 instanceof p0) {
                            p0 p02 = (p0)m2;
                            bl = p02.i != null;
                            this.a(bl);
                            bl = p02.b() == 2;
                            this.a(bl);
                            if (p02.d((int)0).a instanceof o0) {
                                this.a(p02.d((int)1).a instanceof O);
                                bl = p02.h ^ true;
                            } else {
                                if (!(p02.d((int)0).a instanceof O)) {
                                    throw new IllegalStateException();
                                }
                                this.a(p02.d((int)1).a instanceof o0);
                                bl = p02.h;
                            }
                            this.a(bl);
                        }
                        if (m2 instanceof q0) {
                            bl = m2.b() == 1;
                            this.a(bl);
                            this.a(m2.d((int)0).a instanceof p0);
                        }
                        if (m2 instanceof O) {
                            bl = ((O)m2).g != null;
                            this.a(bl);
                        }
                        if (m2 instanceof d0) {
                            bl = ((d0)m2).g != null;
                            this.a(bl);
                        }
                        if (m2 instanceof u) {
                            bl = ((u)m2).i != null;
                            this.a(bl);
                        }
                        if (m2 instanceof t) {
                            bl = ((t)m2).g != null;
                            this.a(bl);
                        }
                        if (!(m2 instanceof v)) break block16;
                        if ((m2 = (v)m2).b() <= 1) break block17;
                        bl = bl2;
                        if (((v)m2).g < 0) break block18;
                        break block17;
                    }
                    if (m2.b() <= 1) break block17;
                    bl = bl2;
                    if (!(m2 instanceof e0)) break block18;
                }
                bl = true;
            }
            this.a(bl);
        }
    }
}

