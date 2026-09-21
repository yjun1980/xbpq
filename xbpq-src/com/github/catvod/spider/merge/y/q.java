/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.B;
import com.github.catvod.spider.merge.y.C;
import com.github.catvod.spider.merge.y.D;
import com.github.catvod.spider.merge.y.E;
import com.github.catvod.spider.merge.y.F;
import com.github.catvod.spider.merge.y.G;
import com.github.catvod.spider.merge.y.H;
import com.github.catvod.spider.merge.y.I;
import com.github.catvod.spider.merge.y.J;
import com.github.catvod.spider.merge.y.K;
import com.github.catvod.spider.merge.y.L;
import com.github.catvod.spider.merge.y.M;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.O;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.g;
import com.github.catvod.spider.merge.y.h;
import com.github.catvod.spider.merge.y.i;
import com.github.catvod.spider.merge.y.j;
import com.github.catvod.spider.merge.y.k;
import com.github.catvod.spider.merge.y.l;
import com.github.catvod.spider.merge.y.m;
import com.github.catvod.spider.merge.y.n;
import com.github.catvod.spider.merge.y.o;
import com.github.catvod.spider.merge.y.p;
import com.github.catvod.spider.merge.y.r;
import com.github.catvod.spider.merge.y.s;
import com.github.catvod.spider.merge.y.t;
import com.github.catvod.spider.merge.y.u;
import com.github.catvod.spider.merge.y.v;
import com.github.catvod.spider.merge.y.w;
import com.github.catvod.spider.merge.y.x;
import com.github.catvod.spider.merge.y.y;
import java.util.regex.Pattern;

final class q {
    private static final Pattern f = Pattern.compile("'\\s*,\\s*'");
    private final String a;
    private int b;
    private char c;
    private int d;
    private boolean e;

    public q(String string) {
        this.a = string;
        this.g();
    }

    static /* synthetic */ boolean b(q q2) {
        return q2.e;
    }

    static boolean e(char c2) {
        boolean bl = c2 == '-' || c2 == '+' || c2 >= '0' && c2 <= '9';
        return bl;
    }

    final void a(char c2) {
        if (this.c == ' ') {
            this.g();
        }
        if (this.c == c2) {
            if (!this.f()) {
                this.g();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expect '");
        stringBuilder.append(c2);
        stringBuilder.append(", but '");
        stringBuilder.append(this.c);
        stringBuilder.append("'");
        throw new O(stringBuilder.toString());
    }

    public final G[] c() {
        G[] gArray = this.a;
        if (gArray != null && gArray.length() != 0) {
            gArray = new G[8];
            while (true) {
                G[] gArray2;
                int n2;
                G g2;
                if ((g2 = this.k()) == null) {
                    n2 = this.d;
                    if (n2 == gArray.length) {
                        return gArray;
                    }
                    gArray2 = new G[n2];
                    System.arraycopy(gArray, 0, gArray2, 0, n2);
                    return gArray2;
                }
                if (g2 instanceof B && !B.b((B)(gArray2 = (G[])g2)) && B.c((B)gArray2).equals("*")) continue;
                n2 = this.d;
                gArray2 = gArray;
                if (n2 == gArray.length) {
                    gArray2 = new G[n2 * 3 / 2];
                    System.arraycopy(gArray, 0, gArray2, 0, n2);
                }
                n2 = this.d;
                this.d = n2 + 1;
                gArray2[n2] = g2;
                gArray = gArray2;
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * Unable to fully structure code
     */
    final i d(i var1_1) {
        block3: {
            block4: {
                block2: {
                    var3_2 = this.c;
                    var2_3 = true;
                    var4_4 = var3_2 == '&';
                    if (var3_2 == '&' && this.a.charAt(this.b) == '&') break block2;
                    var5_5 = var1_1;
                    if (this.c != '|') break block3;
                    var5_5 = var1_1;
                    if (this.a.charAt(this.b) != '|') break block3;
                }
                this.g();
                this.g();
                if (this.c != '(') break block4;
                var5_5 = this;
                ** GOTO lbl-1000
            }
            var2_3 = false;
            var5_5 = this;
            while (var5_5.c == ' ') lbl-1000:
            // 2 sources

            {
                var5_5.g();
            }
            var1_1 = new j(var1_1, (i)var5_5.h(false), var4_4);
            if (var2_3 && var5_5.c == ')') {
                var5_5.g();
            }
            var5_5 = var1_1;
        }
        return var5_5;
    }

    final boolean f() {
        boolean bl = this.b >= this.a.length();
        return bl;
    }

    final void g() {
        String string = this.a;
        int n2 = this.b;
        this.b = n2 + 1;
        this.c = string.charAt(n2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final Object h(boolean var1_1) {
        block219: {
            block220: {
                block250: {
                    block249: {
                        block235: {
                            block201: {
                                block248: {
                                    block247: {
                                        block246: {
                                            block245: {
                                                block244: {
                                                    block242: {
                                                        block240: {
                                                            block243: {
                                                                block241: {
                                                                    block239: {
                                                                        block237: {
                                                                            block238: {
                                                                                block236: {
                                                                                    block234: {
                                                                                        block221: {
                                                                                            block226: {
                                                                                                block232: {
                                                                                                    block233: {
                                                                                                        block229: {
                                                                                                            block230: {
                                                                                                                block231: {
                                                                                                                    block225: {
                                                                                                                        block227: {
                                                                                                                            block228: {
                                                                                                                                block222: {
                                                                                                                                    block224: {
                                                                                                                                        block223: {
                                                                                                                                            block216: {
                                                                                                                                                block218: {
                                                                                                                                                    block217: {
                                                                                                                                                        block213: {
                                                                                                                                                            block215: {
                                                                                                                                                                block214: {
                                                                                                                                                                    block210: {
                                                                                                                                                                        block212: {
                                                                                                                                                                            block211: {
                                                                                                                                                                                block202: {
                                                                                                                                                                                    block208: {
                                                                                                                                                                                        block209: {
                                                                                                                                                                                            block204: {
                                                                                                                                                                                                block207: {
                                                                                                                                                                                                    block205: {
                                                                                                                                                                                                        block206: {
                                                                                                                                                                                                            block203: {
                                                                                                                                                                                                                if (var1_1) {
                                                                                                                                                                                                                    this.a('[');
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var6_2 /* !! */  = this.c;
                                                                                                                                                                                                                var7_3 /* !! */  = 1;
                                                                                                                                                                                                                if (var6_2 /* !! */  == 63) {
                                                                                                                                                                                                                    this.g();
                                                                                                                                                                                                                    this.a('(');
                                                                                                                                                                                                                    var6_2 /* !! */  = 1;
                                                                                                                                                                                                                    while (this.c == '(') {
                                                                                                                                                                                                                        this.g();
                                                                                                                                                                                                                        ++var6_2 /* !! */ ;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var8_4 = 1;
                                                                                                                                                                                                                    var9_5 /* !! */  = var6_2 /* !! */ ;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    var9_5 /* !! */  = 0;
                                                                                                                                                                                                                    var8_4 = 0;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                this.n();
                                                                                                                                                                                                                var10_6 = -1;
                                                                                                                                                                                                                if (var8_4 != 0 || (var6_2 /* !! */  = (var2_7 = this.c) < ((boolean[])(var17_8 = com.github.catvod.spider.merge.H.i.c)).length && var17_8[var2_7] != false ? 1 : 0) != 0 || Character.isJavaIdentifierStart(var2_7) || (var11_9 = this.c) == 92 || var11_9 == 64) break block202;
                                                                                                                                                                                                                var9_5 /* !! */  = this.b;
                                                                                                                                                                                                                while (!((var6_2 /* !! */  = (int)this.c) == 93 || var6_2 /* !! */  == 47 || this.f() || (var6_2 /* !! */  = (int)this.c) == 46 && var8_4 == 0 && var8_4 == 0 && var11_9 != 39)) {
                                                                                                                                                                                                                    if (var6_2 /* !! */  == 92) {
                                                                                                                                                                                                                        this.g();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    this.g();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var6_2 /* !! */  = !var1_1 && (var6_2 /* !! */  = (int)this.c) != 47 && var6_2 /* !! */  != 46 ? this.b : this.b - 1;
                                                                                                                                                                                                                var18_10 /* !! */  = this.a.substring(var9_5 /* !! */  - 1, var6_2 /* !! */ );
                                                                                                                                                                                                                var17_8 = var18_10 /* !! */ ;
                                                                                                                                                                                                                if (var18_10 /* !! */ .indexOf(92) != 0) {
                                                                                                                                                                                                                    var17_8 = new StringBuilder(var18_10 /* !! */ .length());
                                                                                                                                                                                                                    for (var6_2 /* !! */  = 0; var6_2 /* !! */  < var18_10 /* !! */ .length(); ++var6_2 /* !! */ ) {
                                                                                                                                                                                                                        var2_7 = var18_10 /* !! */ .charAt(var6_2 /* !! */ );
                                                                                                                                                                                                                        if (var2_7 == '\\' && var6_2 /* !! */  < var18_10 /* !! */ .length() - 1 && ((var3_21 = var18_10 /* !! */ .charAt(var9_5 /* !! */  = var6_2 /* !! */  + 1)) == '@' || var2_7 == '\\' || var2_7 == '\"')) {
                                                                                                                                                                                                                            var17_8.append(var3_21);
                                                                                                                                                                                                                            var6_2 /* !! */  = var9_5 /* !! */ ;
                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var17_8.append(var2_7);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var17_8 = var17_8.toString();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (var17_8.indexOf("\\.") != -1) {
                                                                                                                                                                                                                    if (var11_9 == 39 && var17_8.length() > 2 && var17_8.charAt(var17_8.length() - 1) == var11_9) {
                                                                                                                                                                                                                        var17_8 = var17_8.substring(1, var17_8.length() - 1);
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        var18_10 /* !! */  = var17_8.replaceAll("\\\\\\.", "\\.");
                                                                                                                                                                                                                        var17_8 = var18_10 /* !! */ ;
                                                                                                                                                                                                                        if (var18_10 /* !! */ .indexOf("\\-") != -1) {
                                                                                                                                                                                                                            var17_8 = var18_10 /* !! */ .replaceAll("\\\\-", "-");
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (var8_4 != 0) {
                                                                                                                                                                                                                        this.a(')');
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return new B((String)var17_8, false);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var6_2 /* !! */  = var17_8.length();
                                                                                                                                                                                                                var8_4 = var17_8.charAt(0);
                                                                                                                                                                                                                var11_9 = var6_2 /* !! */  - 1;
                                                                                                                                                                                                                var9_5 /* !! */  = var17_8.charAt(var11_9);
                                                                                                                                                                                                                var6_2 /* !! */  = var17_8.indexOf(44);
                                                                                                                                                                                                                if (var17_8.length() <= 2 || var8_4 != 39 || var9_5 /* !! */  != 39) break block203;
                                                                                                                                                                                                                var18_10 /* !! */  = var17_8.substring(1, var11_9);
                                                                                                                                                                                                                var17_8 = var6_2 /* !! */  != -1 && q.f.matcher((CharSequence)var17_8).find() ? new w(var18_10 /* !! */ .split("'\\s*,\\s*'")) : (Object)new B((String)var18_10 /* !! */ , false);
                                                                                                                                                                                                                break block204;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var8_4 = var17_8.indexOf(58);
                                                                                                                                                                                                            if (var6_2 /* !! */  != -1 || var8_4 != -1) break block205;
                                                                                                                                                                                                            if (!A.g0((String)var17_8)) break block206;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                var6_2 /* !! */  = Integer.parseInt((String)var17_8);
                                                                                                                                                                                                                var18_10 /* !! */  = new g(var6_2 /* !! */ );
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (NumberFormatException var18_11) {
                                                                                                                                                                                                                var17_8 = new B((String)var17_8, false);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var17_8 = var18_10 /* !! */ ;
                                                                                                                                                                                                            break block204;
                                                                                                                                                                                                            break block204;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var18_10 /* !! */  = var17_8;
                                                                                                                                                                                                        if (var17_8.charAt(0) == '\"') {
                                                                                                                                                                                                            var18_10 /* !! */  = (String[])var17_8;
                                                                                                                                                                                                            if (var17_8.charAt(var17_8.length() - 1) == '\"') {
                                                                                                                                                                                                                var18_10 /* !! */  = var17_8.substring(1, var17_8.length() - 1);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var17_8 = new B((String)var18_10 /* !! */ , false);
                                                                                                                                                                                                        break block204;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (var6_2 /* !! */  == -1) break block207;
                                                                                                                                                                                                    var18_10 /* !! */  = var17_8.split(",");
                                                                                                                                                                                                    var17_8 = new int[var18_10 /* !! */ .length];
                                                                                                                                                                                                    for (var6_2 /* !! */  = 0; var6_2 /* !! */  < var18_10 /* !! */ .length; ++var6_2 /* !! */ ) {
                                                                                                                                                                                                        var17_8[var6_2 /* !! */ ] = Integer.parseInt(var18_10 /* !! */ [var6_2 /* !! */ ]);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var17_8 = new v((int[])var17_8);
                                                                                                                                                                                                    break block204;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var8_4 == -1) break block208;
                                                                                                                                                                                                var19_23 = var17_8.split(":");
                                                                                                                                                                                                var8_4 = var19_23.length;
                                                                                                                                                                                                var18_10 /* !! */  = (String[])new int[var8_4];
                                                                                                                                                                                                for (var6_2 /* !! */  = 0; var6_2 /* !! */  < var19_23.length; ++var6_2 /* !! */ ) {
                                                                                                                                                                                                    var17_8 = var19_23[var6_2 /* !! */ ];
                                                                                                                                                                                                    if (var17_8.length() == 0) {
                                                                                                                                                                                                        if (var6_2 /* !! */  == 0) {
                                                                                                                                                                                                            var18_10 /* !! */ [var6_2 /* !! */ ] = (String)false;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var18_10 /* !! */ [var6_2 /* !! */ ] = (String)Integer.parseInt((String)var17_8);
                                                                                                                                                                                                }
                                                                                                                                                                                                var9_5 /* !! */  = (int)var18_10 /* !! */ [0];
                                                                                                                                                                                                var6_2 /* !! */  = var10_6;
                                                                                                                                                                                                if (var8_4 > 1) {
                                                                                                                                                                                                    var6_2 /* !! */  = (int)var18_10 /* !! */ [1];
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var8_4 == 3) {
                                                                                                                                                                                                    var7_3 /* !! */  = (int)var18_10 /* !! */ [2];
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var6_2 /* !! */  >= 0 && var6_2 /* !! */  < var9_5 /* !! */ ) {
                                                                                                                                                                                                    var17_8 = new StringBuilder();
                                                                                                                                                                                                    var17_8.append("end must greater than or equals start. start ");
                                                                                                                                                                                                    var17_8.append(var9_5 /* !! */ );
                                                                                                                                                                                                    var17_8.append(",  end ");
                                                                                                                                                                                                    var17_8.append(var6_2 /* !! */ );
                                                                                                                                                                                                    throw new UnsupportedOperationException(var17_8.toString());
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var7_3 /* !! */  <= 0) break block209;
                                                                                                                                                                                                var17_8 = new C(var9_5 /* !! */ , var6_2 /* !! */ , var7_3 /* !! */ );
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var1_1 && !this.f()) {
                                                                                                                                                                                                this.a(']');
                                                                                                                                                                                            }
                                                                                                                                                                                            return var17_8;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new UnsupportedOperationException(com.github.catvod.spider.merge.I.r.a("step must greater than zero : ", var7_3 /* !! */ ));
                                                                                                                                                                                    }
                                                                                                                                                                                    throw new UnsupportedOperationException();
                                                                                                                                                                                }
                                                                                                                                                                                if (this.c == '@') {
                                                                                                                                                                                    this.g();
                                                                                                                                                                                    this.a('.');
                                                                                                                                                                                }
                                                                                                                                                                                var21_26 = this.j();
                                                                                                                                                                                this.n();
                                                                                                                                                                                if (var8_4 == 0 || this.c != ')') break block210;
                                                                                                                                                                                this.g();
                                                                                                                                                                                var18_12 = new x(var21_26, false);
                                                                                                                                                                                while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                                                                                                    this.g();
                                                                                                                                                                                }
                                                                                                                                                                                if (var6_2 /* !! */  == 38) break block211;
                                                                                                                                                                                var17_8 = var18_12;
                                                                                                                                                                                if (var6_2 /* !! */  != 124) break block212;
                                                                                                                                                                            }
                                                                                                                                                                            var17_8 = this.d(var18_12);
                                                                                                                                                                        }
                                                                                                                                                                        if (var1_1) {
                                                                                                                                                                            this.a(']');
                                                                                                                                                                        }
                                                                                                                                                                        return var17_8;
                                                                                                                                                                    }
                                                                                                                                                                    if (!var1_1 || this.c != ']') break block213;
                                                                                                                                                                    if (this.f() && var21_26.equals("last")) {
                                                                                                                                                                        return new v(new int[]{-1});
                                                                                                                                                                    }
                                                                                                                                                                    this.g();
                                                                                                                                                                    var18_13 = new x(var21_26, false);
                                                                                                                                                                    while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                                                                                        this.g();
                                                                                                                                                                    }
                                                                                                                                                                    if (var6_2 /* !! */  == 38) break block214;
                                                                                                                                                                    var17_8 = var18_13;
                                                                                                                                                                    if (var6_2 /* !! */  != 124) break block215;
                                                                                                                                                                }
                                                                                                                                                                var17_8 = this.d(var18_13);
                                                                                                                                                            }
                                                                                                                                                            this.a(')');
                                                                                                                                                            if (var8_4 != 0) {
                                                                                                                                                                this.a(')');
                                                                                                                                                            }
                                                                                                                                                            if (var1_1) {
                                                                                                                                                                this.a(']');
                                                                                                                                                            }
                                                                                                                                                            return var17_8;
                                                                                                                                                        }
                                                                                                                                                        this.n();
                                                                                                                                                        if (this.c == '(') {
                                                                                                                                                            this.g();
                                                                                                                                                            this.a(')');
                                                                                                                                                            this.n();
                                                                                                                                                            var13_27 = true;
                                                                                                                                                        } else {
                                                                                                                                                            var13_27 = false;
                                                                                                                                                        }
                                                                                                                                                        var6_2 /* !! */  = this.c;
                                                                                                                                                        if (var6_2 /* !! */  == 61) {
                                                                                                                                                            this.g();
                                                                                                                                                            var6_2 /* !! */  = this.c;
                                                                                                                                                            if (var6_2 /* !! */  == 126) {
                                                                                                                                                                this.g();
                                                                                                                                                                var7_3 /* !! */  = 17;
                                                                                                                                                            } else {
                                                                                                                                                                if (var6_2 /* !! */  == 61) {
                                                                                                                                                                    this.g();
                                                                                                                                                                }
                                                                                                                                                                var7_3 /* !! */  = 1;
                                                                                                                                                            }
                                                                                                                                                        } else if (var6_2 /* !! */  == 33) {
                                                                                                                                                            this.g();
                                                                                                                                                            this.a('=');
                                                                                                                                                            var7_3 /* !! */  = 2;
                                                                                                                                                        } else if (var6_2 /* !! */  == 60) {
                                                                                                                                                            this.g();
                                                                                                                                                            if (this.c == '=') {
                                                                                                                                                                this.g();
                                                                                                                                                                var7_3 /* !! */  = 6;
                                                                                                                                                            } else {
                                                                                                                                                                var7_3 /* !! */  = 5;
                                                                                                                                                            }
                                                                                                                                                        } else if (var6_2 /* !! */  == 62) {
                                                                                                                                                            this.g();
                                                                                                                                                            if (this.c == '=') {
                                                                                                                                                                this.g();
                                                                                                                                                                var7_3 /* !! */  = 4;
                                                                                                                                                            } else {
                                                                                                                                                                var7_3 /* !! */  = 3;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            var7_3 /* !! */  = 0;
                                                                                                                                                        }
                                                                                                                                                        var6_2 /* !! */  = var7_3 /* !! */ ;
                                                                                                                                                        if (var7_3 /* !! */  != 0) break block216;
                                                                                                                                                        var17_8 = this.j();
                                                                                                                                                        if (!"not".equalsIgnoreCase((String)var17_8)) ** GOTO lbl-1000
                                                                                                                                                        this.n();
                                                                                                                                                        var17_8 = this.j();
                                                                                                                                                        if (!"like".equalsIgnoreCase((String)var17_8)) break block217;
                                                                                                                                                        var6_2 /* !! */  = 8;
                                                                                                                                                        break block216;
                                                                                                                                                    }
                                                                                                                                                    if (!"rlike".equalsIgnoreCase((String)var17_8)) break block218;
                                                                                                                                                    var6_2 /* !! */  = 10;
                                                                                                                                                    break block216;
                                                                                                                                                }
                                                                                                                                                if (!"in".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                    if ("between".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                        var6_2 /* !! */  = 14;
                                                                                                                                                    } else {
                                                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl-1000
lbl-1000:
                                                                                                                                                // 1 sources

                                                                                                                                                {
                                                                                                                                                    if ("nin".equalsIgnoreCase((String)var17_8)) lbl-1000:
                                                                                                                                                    // 2 sources

                                                                                                                                                    {
                                                                                                                                                        var6_2 /* !! */  = 12;
                                                                                                                                                    } else if ("like".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                        var6_2 /* !! */  = 7;
                                                                                                                                                    } else if ("rlike".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                        var6_2 /* !! */  = 9;
                                                                                                                                                    } else if ("in".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                        var6_2 /* !! */  = 11;
                                                                                                                                                    } else if ("between".equalsIgnoreCase((String)var17_8)) {
                                                                                                                                                        var6_2 /* !! */  = 13;
                                                                                                                                                    } else {
                                                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            this.n();
                                                                                                                                            if (var6_2 /* !! */  == 13 || var6_2 /* !! */  == 14) break block219;
                                                                                                                                            if (var6_2 /* !! */  == 11 || var6_2 /* !! */  == 12) break block220;
                                                                                                                                            var2_7 = this.c;
                                                                                                                                            if (var2_7 == '\'' || var2_7 == '\"') break block221;
                                                                                                                                            if (!q.e(var2_7)) break block222;
                                                                                                                                            var15_28 = this.i();
                                                                                                                                            var4_30 = 0.0;
                                                                                                                                            if (this.c == '.') {
                                                                                                                                                var7_3 /* !! */  = this.b;
                                                                                                                                                do {
                                                                                                                                                    this.g();
                                                                                                                                                    var10_6 = this.c;
                                                                                                                                                } while (var10_6 >= 48 && var10_6 <= 57);
                                                                                                                                                var10_6 = this.b;
                                                                                                                                                var4_30 = Double.parseDouble(this.a.substring(var7_3 /* !! */  - 1, var10_6 - 1)) + (double)var15_28;
                                                                                                                                            }
                                                                                                                                            var17_8 = var4_30 == 0.0 ? new p(var21_26, var13_27, var15_28, var6_2 /* !! */ ) : new h(var21_26, var13_27, var4_30, var6_2 /* !! */ );
                                                                                                                                            while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                                                                this.g();
                                                                                                                                            }
                                                                                                                                            if (var9_5 /* !! */  > 1 && var6_2 /* !! */  == 41) {
                                                                                                                                                this.g();
                                                                                                                                            }
                                                                                                                                            if ((var6_2 /* !! */  = (int)this.c) == 38) break block223;
                                                                                                                                            var18_14 /* !! */  = var17_8;
                                                                                                                                            if (var6_2 /* !! */  != 124) break block224;
                                                                                                                                        }
                                                                                                                                        var18_14 /* !! */  = (boolean[])this.d((i)var17_8);
                                                                                                                                    }
                                                                                                                                    if (var8_4 != 0) {
                                                                                                                                        this.a(')');
                                                                                                                                    }
                                                                                                                                    if (var1_1) {
                                                                                                                                        this.a(']');
                                                                                                                                    }
                                                                                                                                    return var18_14 /* !! */ ;
                                                                                                                                }
                                                                                                                                var7_3 /* !! */  = this.c;
                                                                                                                                if (var7_3 /* !! */  == 36) {
                                                                                                                                    var17_8 = new D(var21_26, var13_27, this.k(), var6_2 /* !! */ );
                                                                                                                                    this.e = true;
                                                                                                                                    while (this.c == ' ') {
                                                                                                                                        this.g();
                                                                                                                                    }
                                                                                                                                    if (var8_4 != 0) {
                                                                                                                                        this.a(')');
                                                                                                                                    }
                                                                                                                                    if (var1_1) {
                                                                                                                                        this.a(']');
                                                                                                                                    }
                                                                                                                                    return var17_8;
                                                                                                                                }
                                                                                                                                if (var7_3 /* !! */  == 47) {
                                                                                                                                    var17_8 = new StringBuilder();
                                                                                                                                    while (true) {
                                                                                                                                        this.g();
                                                                                                                                        var3_22 = this.c;
                                                                                                                                        if (var3_22 == '/') {
                                                                                                                                            this.g();
                                                                                                                                            if (this.c == 'i') {
                                                                                                                                                this.g();
                                                                                                                                                var6_2 /* !! */  = 2;
                                                                                                                                            } else {
                                                                                                                                                var6_2 /* !! */  = 0;
                                                                                                                                            }
                                                                                                                                            var17_8 = new E(var21_26, var13_27, Pattern.compile(var17_8.toString(), var6_2 /* !! */ ));
                                                                                                                                            if (var8_4 != 0) {
                                                                                                                                                this.a(')');
                                                                                                                                            }
                                                                                                                                            if (var1_1) {
                                                                                                                                                this.a(']');
                                                                                                                                            }
                                                                                                                                            return var17_8;
                                                                                                                                        }
                                                                                                                                        var2_7 = var3_22;
                                                                                                                                        if (var3_22 == '\\') {
                                                                                                                                            this.g();
                                                                                                                                            var2_7 = this.c;
                                                                                                                                        }
                                                                                                                                        var17_8.append(var2_7);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var7_3 /* !! */  != 110) break block225;
                                                                                                                                if (!"null".equals(this.j())) break block226;
                                                                                                                                var17_8 = var6_2 /* !! */  == 1 ? new y(var21_26, var13_27) : (var6_2 /* !! */  == 2 ? new x(var21_26, var13_27) : null);
                                                                                                                                var18_15 = var17_8;
                                                                                                                                if (var17_8 == null) break block227;
                                                                                                                                while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                                                    this.g();
                                                                                                                                }
                                                                                                                                if (var6_2 /* !! */  == 38) break block228;
                                                                                                                                var18_15 = var17_8;
                                                                                                                                if (var6_2 /* !! */  != 124) break block227;
                                                                                                                            }
                                                                                                                            var18_15 = this.d((i)var17_8);
                                                                                                                        }
                                                                                                                        if (var8_4 != 0) {
                                                                                                                            this.a(')');
                                                                                                                        }
                                                                                                                        this.a(']');
                                                                                                                        if (var18_15 != null) {
                                                                                                                            return var18_15;
                                                                                                                        }
                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                    }
                                                                                                                    if (var7_3 /* !! */  != 116) break block229;
                                                                                                                    if (!"true".equals(this.j())) break block226;
                                                                                                                    var17_8 = var6_2 /* !! */  == 1 ? new L(var21_26, var13_27, Boolean.TRUE, true) : (var6_2 /* !! */  == 2 ? (Object)new L(var21_26, var13_27, Boolean.TRUE, false) : null);
                                                                                                                    var18_16 = var17_8;
                                                                                                                    if (var17_8 == null) break block230;
                                                                                                                    while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                                        this.g();
                                                                                                                    }
                                                                                                                    if (var6_2 /* !! */  == 38) break block231;
                                                                                                                    var18_16 = var17_8;
                                                                                                                    if (var6_2 /* !! */  != 124) break block230;
                                                                                                                }
                                                                                                                var18_16 = this.d((i)var17_8);
                                                                                                            }
                                                                                                            if (var8_4 != 0) {
                                                                                                                this.a(')');
                                                                                                            }
                                                                                                            this.a(']');
                                                                                                            if (var18_16 != null) {
                                                                                                                return var18_16;
                                                                                                            }
                                                                                                            throw new UnsupportedOperationException();
                                                                                                        }
                                                                                                        if (var7_3 /* !! */  != 102 || !"false".equals(this.j())) break block226;
                                                                                                        var17_8 = var6_2 /* !! */  == 1 ? (Object)new L(var21_26, var13_27, Boolean.FALSE, true) : (var6_2 /* !! */  == 2 ? (Object)new L(var21_26, var13_27, Boolean.FALSE, false) : null);
                                                                                                        var18_17 = var17_8;
                                                                                                        if (var17_8 == null) break block232;
                                                                                                        while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                            this.g();
                                                                                                        }
                                                                                                        if (var6_2 /* !! */  == 38) break block233;
                                                                                                        var18_17 = var17_8;
                                                                                                        if (var6_2 /* !! */  != 124) break block232;
                                                                                                    }
                                                                                                    var18_17 = this.d((i)var17_8);
                                                                                                }
                                                                                                if (var8_4 != 0) {
                                                                                                    this.a(')');
                                                                                                }
                                                                                                this.a(']');
                                                                                                if (var18_17 != null) {
                                                                                                    return var18_17;
                                                                                                }
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        var18_18 = this.l();
                                                                                        if (var6_2 /* !! */  != 9) break block234;
                                                                                        var17_8 = new F(var21_26, var13_27, (String)var18_18, false);
                                                                                        break block235;
                                                                                    }
                                                                                    if (var6_2 /* !! */  != 10) break block236;
                                                                                    var17_8 = new F(var21_26, var13_27, (String)var18_18, true);
                                                                                    break block235;
                                                                                }
                                                                                var17_8 = var18_18;
                                                                                if (var6_2 /* !! */  == 7) break block237;
                                                                                if (var6_2 /* !! */  == 8) break block238;
                                                                                var17_8 = new J(var21_26, var13_27, (String)var18_18, var6_2 /* !! */ );
                                                                                break block235;
                                                                            }
                                                                            var17_8 = var18_18;
                                                                        }
                                                                        while (var17_8.indexOf("%%") != -1) {
                                                                            var17_8 = var17_8.replaceAll("%%", "%");
                                                                        }
                                                                        var14_31 = var6_2 /* !! */  == 8;
                                                                        var7_3 /* !! */  = var17_8.indexOf(37);
                                                                        if (var7_3 /* !! */  != -1) break block239;
                                                                        var6_2 /* !! */  = var6_2 /* !! */  == 7 ? 1 : 2;
                                                                        var17_8 = new J(var21_26, var13_27, (String)var17_8, var6_2 /* !! */ );
                                                                        break block235;
                                                                    }
                                                                    var19_24 /* !! */  = var17_8.split("%");
                                                                    if (var7_3 /* !! */  != 0) break block240;
                                                                    if (var17_8.charAt(var17_8.length() - 1) != '%') break block241;
                                                                    var6_2 /* !! */  = var19_24 /* !! */ .length - 1;
                                                                    var17_8 = new String[var6_2 /* !! */ ];
                                                                    System.arraycopy(var19_24 /* !! */ , 1, var17_8, 0, var6_2 /* !! */ );
                                                                    break block242;
                                                                }
                                                                var18_18 = var19_24 /* !! */ [var19_24 /* !! */ .length - 1];
                                                                if (var19_24 /* !! */ .length <= 2) break block243;
                                                                var6_2 /* !! */  = var19_24 /* !! */ .length - 2;
                                                                var17_8 = new String[var6_2 /* !! */ ];
                                                                System.arraycopy(var19_24 /* !! */ , 1, var17_8, 0, var6_2 /* !! */ );
                                                                var19_24 /* !! */  = var17_8;
                                                                var17_8 = null;
                                                                break block201;
                                                            }
                                                            var17_8 = null;
lbl435:
                                                            // 2 sources

                                                            while (true) {
                                                                var19_24 /* !! */  = null;
                                                                break block201;
                                                                break;
                                                            }
                                                        }
                                                        if (var17_8.charAt(var17_8.length() - 1) != '%') break block244;
                                                        var17_8 = var19_24 /* !! */ ;
                                                        if (var19_24 /* !! */ .length != 1) break block242;
                                                        var18_18 = var19_24 /* !! */ [0];
                                                        break block245;
                                                    }
                                                    var19_24 /* !! */  = var17_8;
                                                    var17_8 = null;
                                                    var18_18 = null;
                                                    break block201;
                                                }
                                                if (var19_24 /* !! */ .length != 1) break block246;
                                                var18_18 = var19_24 /* !! */ [0];
                                            }
                                            var17_8 = null;
                                            break block247;
                                        }
                                        if (var19_24 /* !! */ .length != 2) break block248;
                                        var18_18 = var19_24 /* !! */ [0];
                                        var17_8 = var19_24 /* !! */ [1];
                                    }
                                    var19_24 /* !! */  = var18_18;
                                    var18_18 = var17_8;
                                    var17_8 = var19_24 /* !! */ ;
                                    ** while (true)
                                }
                                var17_8 = var19_24 /* !! */ [0];
                                var18_18 = var19_24 /* !! */ [var19_24 /* !! */ .length - 1];
                                var6_2 /* !! */  = var19_24 /* !! */ .length - 2;
                                var20_33 = new String[var6_2 /* !! */ ];
                                System.arraycopy(var19_24 /* !! */ , 1, var20_33, 0, var6_2 /* !! */ );
                                var19_24 /* !! */  = var20_33;
                            }
                            var17_8 = new s(var21_26, var13_27, (String)var17_8, (String)var18_18, var19_24 /* !! */ , var14_31);
                        }
                        while ((var6_2 /* !! */  = (int)this.c) == 32) {
                            this.g();
                        }
                        if (var6_2 /* !! */  == 38) break block249;
                        var18_18 = var17_8;
                        if (var6_2 /* !! */  != 124) break block250;
                    }
                    var18_18 = this.d((i)var17_8);
                }
                if (var8_4 != 0) {
                    this.a(')');
                }
                if (var1_1) {
                    this.a(']');
                }
                return var18_18;
            }
            var12_34 = 2;
            var14_32 = var6_2 /* !! */  == 12;
            this.a('(');
            var17_8 = new b();
            while (true) {
                block251: {
                    block267: {
                        block269: {
                            block268: {
                                block261: {
                                    block266: {
                                        block265: {
                                            block262: {
                                                block264: {
                                                    block263: {
                                                        block255: {
                                                            block260: {
                                                                block259: {
                                                                    block256: {
                                                                        block258: {
                                                                            block257: {
                                                                                block252: {
                                                                                    block254: {
                                                                                        block253: {
                                                                                            var17_8.add(this.m());
                                                                                            this.n();
                                                                                            if (this.c == ',') break block251;
                                                                                            var18_19 /* !! */  = var17_8.iterator();
                                                                                            var9_5 /* !! */  = 1;
                                                                                            var7_3 /* !! */  = 1;
                                                                                            var6_2 /* !! */  = 1;
                                                                                            while (var18_19 /* !! */ .hasNext()) {
                                                                                                var19_25 /* !! */  = var18_19 /* !! */ .next();
                                                                                                if (var19_25 /* !! */  == null) {
                                                                                                    if (var6_2 /* !! */  == 0) continue;
                                                                                                    var6_2 /* !! */  = 0;
                                                                                                    continue;
                                                                                                }
                                                                                                var19_25 /* !! */  = var19_25 /* !! */ .getClass();
                                                                                                var11_9 = var7_3 /* !! */ ;
                                                                                                var10_6 = var6_2 /* !! */ ;
                                                                                                if (var6_2 /* !! */  != 0) {
                                                                                                    var11_9 = var7_3 /* !! */ ;
                                                                                                    var10_6 = var6_2 /* !! */ ;
                                                                                                    if (var19_25 /* !! */  != Byte.class) {
                                                                                                        var11_9 = var7_3 /* !! */ ;
                                                                                                        var10_6 = var6_2 /* !! */ ;
                                                                                                        if (var19_25 /* !! */  != Short.class) {
                                                                                                            var11_9 = var7_3 /* !! */ ;
                                                                                                            var10_6 = var6_2 /* !! */ ;
                                                                                                            if (var19_25 /* !! */  != Integer.class) {
                                                                                                                var11_9 = var7_3 /* !! */ ;
                                                                                                                var10_6 = var6_2 /* !! */ ;
                                                                                                                if (var19_25 /* !! */  != Long.class) {
                                                                                                                    var11_9 = 0;
                                                                                                                    var10_6 = 0;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var7_3 /* !! */  = var11_9;
                                                                                                var6_2 /* !! */  = var10_6;
                                                                                                if (var9_5 /* !! */  == 0) continue;
                                                                                                var7_3 /* !! */  = var11_9;
                                                                                                var6_2 /* !! */  = var10_6;
                                                                                                if (var19_25 /* !! */  == String.class) continue;
                                                                                                var9_5 /* !! */  = 0;
                                                                                                var7_3 /* !! */  = var11_9;
                                                                                                var6_2 /* !! */  = var10_6;
                                                                                            }
                                                                                            if (var17_8.size() != 1 || var17_8.get(0) != null) break block252;
                                                                                            var17_8 = var14_32 != false ? (Object)new x(var21_26, var13_27) : (Object)new y(var21_26, var13_27);
                                                                                            while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                                this.g();
                                                                                            }
                                                                                            if (var6_2 /* !! */  == 38) break block253;
                                                                                            var18_19 /* !! */  = var17_8;
                                                                                            if (var6_2 /* !! */  != 124) break block254;
                                                                                        }
                                                                                        var18_19 /* !! */  = this.d((i)var17_8);
                                                                                    }
                                                                                    this.a(')');
                                                                                    if (var8_4 != 0) {
                                                                                        this.a(')');
                                                                                    }
                                                                                    if (var1_1) {
                                                                                        this.a(']');
                                                                                    }
                                                                                    return var18_19 /* !! */ ;
                                                                                }
                                                                                if (var6_2 /* !! */  == 0) break block255;
                                                                                if (var17_8.size() != 1) break block256;
                                                                                var15_29 = A.n0((Number)var17_8.get(0));
                                                                                var6_2 /* !! */  = var14_32 != false ? 2 : 1;
                                                                                var18_19 /* !! */  = new p(var21_26, var13_27, var15_29, var6_2 /* !! */ );
                                                                                while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                                    this.g();
                                                                                }
                                                                                if (var6_2 /* !! */  == 38) break block257;
                                                                                var17_8 = var18_19 /* !! */ ;
                                                                                if (var6_2 /* !! */  != 124) break block258;
                                                                            }
                                                                            var17_8 = this.d((i)var18_19 /* !! */ );
                                                                        }
                                                                        this.a(')');
                                                                        if (var8_4 != 0) {
                                                                            this.a(')');
                                                                        }
                                                                        if (var1_1) {
                                                                            this.a(']');
                                                                        }
                                                                        return var17_8;
                                                                    }
                                                                    var7_3 /* !! */  = var17_8.size();
                                                                    var18_19 /* !! */  = new long[var7_3 /* !! */ ];
                                                                    for (var6_2 /* !! */  = 0; var6_2 /* !! */  < var7_3 /* !! */ ; ++var6_2 /* !! */ ) {
                                                                        var18_19 /* !! */ [var6_2 /* !! */ ] = A.n0((Number)var17_8.get(var6_2 /* !! */ ));
                                                                    }
                                                                    var18_19 /* !! */  = new n(var21_26, var13_27, (long[])var18_19 /* !! */ , var14_32);
                                                                    while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                                        this.g();
                                                                    }
                                                                    if (var6_2 /* !! */  == 38) break block259;
                                                                    var17_8 = var18_19 /* !! */ ;
                                                                    if (var6_2 /* !! */  != 124) break block260;
                                                                }
                                                                var17_8 = this.d((i)var18_19 /* !! */ );
                                                            }
                                                            this.a(')');
                                                            if (var8_4 != 0) {
                                                                this.a(')');
                                                            }
                                                            if (var1_1) {
                                                                this.a(']');
                                                            }
                                                            return var17_8;
                                                        }
                                                        if (var9_5 /* !! */  == 0) break block261;
                                                        if (var17_8.size() != 1) break block262;
                                                        var17_8 = (String)var17_8.get(0);
                                                        var6_2 /* !! */  = var14_32 != false ? var12_34 : 1;
                                                        var18_19 /* !! */  = new J(var21_26, var13_27, (String)var17_8, var6_2 /* !! */ );
                                                        while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                            this.g();
                                                        }
                                                        if (var6_2 /* !! */  == 38) break block263;
                                                        var17_8 = var18_19 /* !! */ ;
                                                        if (var6_2 /* !! */  != 124) break block264;
                                                    }
                                                    var17_8 = this.d((i)var18_19 /* !! */ );
                                                }
                                                this.a(')');
                                                if (var8_4 != 0) {
                                                    this.a(')');
                                                }
                                                if (var1_1) {
                                                    this.a(']');
                                                }
                                                return var17_8;
                                            }
                                            var18_19 /* !! */  = new String[var17_8.size()];
                                            var17_8.toArray(var18_19 /* !! */ );
                                            var18_19 /* !! */  = new I(var21_26, var13_27, (String[])var18_19 /* !! */ , var14_32);
                                            while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                                this.g();
                                            }
                                            if (var6_2 /* !! */  == 38) break block265;
                                            var17_8 = var18_19 /* !! */ ;
                                            if (var6_2 /* !! */  != 124) break block266;
                                        }
                                        var17_8 = this.d((i)var18_19 /* !! */ );
                                    }
                                    this.a(')');
                                    if (var8_4 != 0) {
                                        this.a(')');
                                    }
                                    if (var1_1) {
                                        this.a(']');
                                    }
                                    return var17_8;
                                }
                                if (var7_3 /* !! */  == 0) break block267;
                                var7_3 /* !! */  = var17_8.size();
                                var18_19 /* !! */  = new Long[var7_3 /* !! */ ];
                                for (var6_2 /* !! */  = 0; var6_2 /* !! */  < var7_3 /* !! */ ; ++var6_2 /* !! */ ) {
                                    var19_25 /* !! */  = (Number)var17_8.get(var6_2 /* !! */ );
                                    if (var19_25 /* !! */  == null) continue;
                                    var18_19 /* !! */ [var6_2 /* !! */ ] = A.n0(var19_25 /* !! */ );
                                }
                                var18_19 /* !! */  = new o(var21_26, var13_27, (Long[])var18_19 /* !! */ , var14_32);
                                while ((var6_2 /* !! */  = (int)this.c) == 32) {
                                    this.g();
                                }
                                if (var6_2 /* !! */  == 38) break block268;
                                var17_8 = var18_19 /* !! */ ;
                                if (var6_2 /* !! */  != 124) break block269;
                            }
                            var17_8 = this.d((i)var18_19 /* !! */ );
                        }
                        this.a(')');
                        if (var8_4 != 0) {
                            this.a(')');
                        }
                        if (var1_1) {
                            this.a(']');
                        }
                        return var17_8;
                    }
                    throw new UnsupportedOperationException();
                }
                this.g();
            }
        }
        var1_1 = var6_2 /* !! */  == 14;
        var17_8 = this.m();
        if ("and".equalsIgnoreCase(this.j())) {
            var18_20 = this.m();
            if (var17_8 != null && var18_20 != null) {
                if (N.n(var17_8.getClass()) && N.n(var18_20.getClass())) {
                    return new m(var21_26, var13_27, A.n0((Number)var17_8), A.n0((Number)var18_20), var1_1);
                }
                throw new O(this.a);
            }
            throw new O(this.a);
        }
        throw new O(this.a);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected final long i() {
        int n2;
        int n3 = this.b;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && (n2 = this.c) != 43 && n2 != 45) continue;
            this.g();
        } while ((n2 = this.c) >= 48 && n2 <= 57);
        n2 = this.b;
        return Long.parseLong(this.a.substring(n3 - 1, n2 - 1));
    }

    final String j() {
        this.n();
        char c2 = this.c;
        if (c2 != '\\' && !Character.isJavaIdentifierStart(c2)) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("illeal jsonpath syntax. ");
            stringBuilder.append(this.a);
            throw new O(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!this.f()) {
            c2 = this.c;
            if (c2 == '\\') {
                this.g();
                stringBuilder.append(this.c);
                if (this.f()) {
                    return stringBuilder.toString();
                }
            } else {
                if (!Character.isJavaIdentifierPart(c2)) break;
                stringBuilder.append(this.c);
            }
            this.g();
        }
        if (this.f() && Character.isJavaIdentifierPart(this.c)) {
            stringBuilder.append(this.c);
        }
        return stringBuilder.toString();
    }

    final G k() {
        char c2;
        int n2 = this.d;
        boolean bl = true;
        if (n2 == 0 && this.a.length() == 1) {
            if (q.e(this.c)) {
                return new g(this.c - 48);
            }
            c2 = this.c;
            if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z') {
                return new B(Character.toString(c2), false);
            }
        }
        while (!this.f()) {
            boolean bl2;
            this.n();
            n2 = this.c;
            if (n2 == 36) {
                this.g();
                this.n();
                if (this.c != '?') continue;
                return new k((i)this.h(false));
            }
            if (n2 != 46 && n2 != 47) {
                if (n2 == 91) {
                    Object object = this.h(true);
                    object = object instanceof G ? (G)object : new k((i)object);
                    return object;
                }
                if (this.d == 0) {
                    return new B(this.j(), false);
                }
                if (n2 == 63) {
                    return new k((i)this.h(false));
                }
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("not support jsonpath : ");
                stringBuilder.append(this.a);
                throw new O(stringBuilder.toString());
            }
            this.g();
            if (n2 == 46 && this.c == '.') {
                this.g();
                int n3 = this.a.length();
                n2 = this.b;
                if (n3 > n2 + 3 && this.c == '[' && this.a.charAt(n2) == '*' && this.a.charAt(this.b + 1) == ']' && this.a.charAt(this.b + 2) == '.') {
                    this.g();
                    this.g();
                    this.g();
                    this.g();
                }
                bl2 = true;
            } else {
                bl2 = false;
            }
            c2 = this.c;
            if (!(c2 == '*' || bl2 && c2 == '[')) {
                if (q.e(c2)) {
                    Object object = this.h(false);
                    object = object instanceof G ? (G)object : new k((i)object);
                    return object;
                }
                CharSequence charSequence = this.j();
                if (this.c == '(') {
                    this.g();
                    if (this.c == ')') {
                        if (!this.f()) {
                            this.g();
                        }
                        if (!"size".equals(charSequence) && !"length".equals(charSequence)) {
                            if ("max".equals(charSequence)) {
                                return t.a;
                            }
                            if ("min".equals(charSequence)) {
                                return u.a;
                            }
                            if ("keySet".equals(charSequence)) {
                                return r.a;
                            }
                            if ("type".equals(charSequence)) {
                                return K.a;
                            }
                            if ("floor".equals(charSequence)) {
                                return l.a;
                            }
                            charSequence = com.github.catvod.spider.merge.C.a.c("not support jsonpath : ");
                            ((StringBuilder)charSequence).append(this.a);
                            throw new O(((StringBuilder)charSequence).toString());
                        }
                        return H.a;
                    }
                    charSequence = com.github.catvod.spider.merge.C.a.c("not support jsonpath : ");
                    ((StringBuilder)charSequence).append(this.a);
                    throw new O(((StringBuilder)charSequence).toString());
                }
                return new B((String)charSequence, bl2);
            }
            if (c2 != '[') {
                bl = false;
            }
            if (!this.f()) {
                this.g();
            }
            if (bl2) {
                if (bl) {
                    return M.d;
                }
                return M.c;
            }
            return M.b;
        }
        return null;
    }

    final String l() {
        char c2 = this.c;
        this.g();
        int n2 = this.b;
        while (this.c != c2 && !this.f()) {
            this.g();
        }
        String string = this.a;
        int n3 = this.f() ? this.b : this.b - 1;
        string = string.substring(n2 - 1, n3);
        this.a(c2);
        return string;
    }

    protected final Object m() {
        this.n();
        if (q.e(this.c)) {
            return this.i();
        }
        char c2 = this.c;
        if (c2 != '\"' && c2 != '\'') {
            if (c2 == 'n') {
                if ("null".equals(this.j())) {
                    return null;
                }
                throw new O(this.a);
            }
            throw new UnsupportedOperationException();
        }
        return this.l();
    }

    public final void n() {
        char c2;
        while ((c2 = this.c) <= ' ' && (c2 == ' ' || c2 == '\r' || c2 == '\n' || c2 == '\t' || c2 == '\f' || c2 == '\b')) {
            this.g();
        }
    }
}

