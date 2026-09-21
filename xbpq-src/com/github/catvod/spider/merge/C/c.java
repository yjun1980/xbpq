/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.A.d;
import com.github.catvod.spider.merge.A.e;
import com.github.catvod.spider.merge.A.g;
import com.github.catvod.spider.merge.A.i;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.k;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.b;
import com.github.catvod.spider.merge.C.j;
import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.l;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public final class c {
    static final String c = com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.b.class);
    static final String d = com.github.catvod.spider.merge.H.c.f(f.class);
    public final com.github.catvod.spider.merge.H.b a;
    protected final AtomicLong b = new AtomicLong();

    public c(ClassLoader classLoader) {
        this.a = (com.github.catvod.spider.merge.H.b)classLoader;
    }

    private void a(b b2, i i2, boolean bl) {
        int n2 = com.github.catvod.spider.merge.C.b.c(b2).length;
        for (int i4 = 0; i4 < n2; ++i4) {
            g g2;
            block7: {
                com.github.catvod.spider.merge.H.e e2;
                block14: {
                    int n3;
                    int n4;
                    block11: {
                        block9: {
                            block5: {
                                block13: {
                                    block12: {
                                        Class<?> clazz;
                                        Object object;
                                        block10: {
                                            block8: {
                                                block6: {
                                                    g2 = new g();
                                                    n4 = 21;
                                                    if (bl) {
                                                        object = com.github.catvod.spider.merge.C.a.c("_asm_flag_");
                                                        ((StringBuilder)object).append(i4 / 32);
                                                        i2.m(21, b2.k(((StringBuilder)object).toString()));
                                                        i2.i(1 << i4);
                                                        i2.e(126);
                                                        i2.g(153, g2);
                                                    }
                                                    e2 = com.github.catvod.spider.merge.C.b.c(b2)[i4];
                                                    clazz = e2.e;
                                                    object = e2.f;
                                                    if (clazz == Boolean.TYPE || clazz == Byte.TYPE || clazz == Short.TYPE || clazz == Integer.TYPE || clazz == Character.TYPE) break block5;
                                                    if (clazz != Long.TYPE) break block6;
                                                    i2.m(25, b2.k("instance"));
                                                    i2.m(22, b2.m(e2));
                                                    if (e2.b != null) {
                                                        i2.k(182, com.github.catvod.spider.merge.H.c.f(b2.i()), e2.b.getName(), com.github.catvod.spider.merge.H.c.c(e2.b));
                                                        if (!e2.b.getReturnType().equals(Void.TYPE)) {
                                                            i2.e(87);
                                                        }
                                                    } else {
                                                        i2.c(181, com.github.catvod.spider.merge.H.c.f(e2.g), e2.c.getName(), com.github.catvod.spider.merge.H.c.b(e2.e));
                                                    }
                                                    break block7;
                                                }
                                                if (clazz != Float.TYPE) break block8;
                                                i2.m(25, b2.k("instance"));
                                                n4 = 23;
                                                break block9;
                                            }
                                            if (clazz != Double.TYPE) break block10;
                                            i2.m(25, b2.k("instance"));
                                            n4 = 24;
                                            n3 = b2.m(e2);
                                            break block11;
                                        }
                                        if (clazz == String.class || clazz.isEnum() || !Collection.class.isAssignableFrom(clazz)) break block12;
                                        i2.m(25, b2.k("instance"));
                                        if (A.I((Type)object) != String.class) break block13;
                                        i2.m(25, b2.l(e2));
                                        i2.l(192, com.github.catvod.spider.merge.H.c.f(clazz));
                                        break block14;
                                    }
                                    i2.m(25, b2.k("instance"));
                                }
                                i2.m(25, b2.l(e2));
                                break block14;
                            }
                            i2.m(25, b2.k("instance"));
                        }
                        n3 = b2.l(e2);
                    }
                    i2.m(n4, n3);
                }
                this.m(i2, e2);
            }
            if (!bl) continue;
            i2.h(g2);
        }
    }

    private void b(b b2, i i2) {
        Constructor<?> constructor = com.github.catvod.spider.merge.C.b.a((b)b2).c;
        if (Modifier.isPublic(constructor.getModifiers())) {
            i2.l(187, com.github.catvod.spider.merge.H.c.f(b2.i()));
            i2.e(89);
            i2.k(183, com.github.catvod.spider.merge.H.c.f(constructor.getDeclaringClass()), "<init>", "()V");
        } else {
            i2.m(25, 0);
            i2.m(25, 1);
            i2.m(25, 0);
            i2.c(180, com.github.catvod.spider.merge.H.c.f(q.class), "clazz", "Ljava/lang/Class;");
            i2.k(183, com.github.catvod.spider.merge.H.c.f(q.class), "createInstance", r.c(com.github.catvod.spider.merge.C.a.c("(L"), c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"));
            i2.l(192, com.github.catvod.spider.merge.H.c.f(b2.i()));
        }
        i2.m(58, b2.k("instance"));
    }

    private void c(b b2, i i2, com.github.catvod.spider.merge.H.e e2, Class<?> clazz, int n2) {
        this.i(b2, i2, e2);
        g g2 = new g();
        g g3 = new g();
        if ((e2.j & com.github.catvod.spider.merge.B.c.m.a) != 0) {
            i2.e(89);
            i2.l(193, com.github.catvod.spider.merge.H.c.f(q.class));
            i2.g(153, g2);
            i2.l(192, com.github.catvod.spider.merge.H.c.f(q.class));
            i2.m(25, 1);
            if (e2.f instanceof Class) {
                i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(e2.e)));
            } else {
                i2.m(25, 0);
                i2.i(n2);
                i2.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            i2.i(e2.a);
            i2.i(e2.j);
            i2.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "deserialze", r.c(com.github.catvod.spider.merge.C.a.c("(L"), c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"));
            i2.l(192, com.github.catvod.spider.merge.H.c.f(clazz));
            i2.m(58, b2.l(e2));
            i2.g(167, g3);
            i2.h(g2);
        }
        i2.m(25, 1);
        if (e2.f instanceof Class) {
            i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(e2.e)));
        } else {
            i2.m(25, 0);
            i2.i(n2);
            i2.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        i2.i(e2.a);
        i2.k(185, com.github.catvod.spider.merge.H.c.f(v.class), "deserialze", r.c(com.github.catvod.spider.merge.C.a.c("(L"), c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        i2.l(192, com.github.catvod.spider.merge.H.c.f(clazz));
        i2.m(58, b2.l(e2));
        i2.h(g3);
    }

    private void d(b b2, i i2, g g2) {
        i2.f(21, b2.k("matchedCount"));
        i2.g(158, g2);
        i2.m(25, b2.k("lexer"));
        i2.k(182, d, "token", "()I");
        i2.i(13);
        i2.g(160, g2);
        this.l(b2, i2);
    }

    /*
     * Unable to fully structure code
     */
    private void e(d var1_1, b var2_2) {
        var12_3 = p.class;
        var10_4 = q.class;
        var8_5 = "(L";
        var9_6 = com.github.catvod.spider.merge.C.a.c("(L");
        var7_7 = com.github.catvod.spider.merge.C.c.c;
        var13_8 = new i((d)var1_1, "deserialzeArrayMapping", r.c((StringBuilder)var9_6, (String)var7_7, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), null);
        this.p(var2_2, var13_8);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.m(25, 1);
        var1_1 = new StringBuilder();
        var1_1.append("()");
        var1_1.append(com.github.catvod.spider.merge.H.c.b(p.class));
        var13_8.k(182, (String)var7_7, "getSymbolTable", var1_1.toString());
        var1_1 = com.github.catvod.spider.merge.C.c.d;
        var9_6 = com.github.catvod.spider.merge.C.a.c("(");
        var9_6.append(com.github.catvod.spider.merge.H.c.b(p.class));
        var9_6.append(")Ljava/lang/String;");
        var13_8.k(182, (String)var1_1, "scanTypeName", var9_6.toString());
        var1_1 = com.github.catvod.spider.merge.C.a.b(var13_8, 58, var2_2.k("typeName"));
        var13_8.m(25, var2_2.k("typeName"));
        var13_8.g(198, (g)var1_1);
        var13_8.m(25, 1);
        var9_6 = new StringBuilder();
        var9_6.append("()");
        var9_6.append(com.github.catvod.spider.merge.H.c.b(o.class));
        var13_8.k(182, (String)var7_7, "getConfig", var9_6.toString());
        var13_8.m(25, 0);
        var13_8.c(180, com.github.catvod.spider.merge.H.c.f(q.class), "beanInfo", com.github.catvod.spider.merge.H.c.b(l.class));
        var13_8.m(25, var2_2.k("typeName"));
        var9_6 = com.github.catvod.spider.merge.H.c.f(q.class);
        var11_9 = com.github.catvod.spider.merge.C.a.c("(");
        var11_9.append(com.github.catvod.spider.merge.H.c.b(o.class));
        var11_9.append(com.github.catvod.spider.merge.H.c.b(l.class));
        var11_9.append("Ljava/lang/String;)");
        var11_9.append(com.github.catvod.spider.merge.H.c.b(q.class));
        var13_8.k(184, (String)var9_6, "getSeeAlso", var11_9.toString());
        var13_8.m(58, var2_2.k("userTypeDeser"));
        var13_8.m(25, var2_2.k("userTypeDeser"));
        var13_8.l(193, com.github.catvod.spider.merge.H.c.f(q.class));
        var13_8.g(153, (g)var1_1);
        var13_8.m(25, var2_2.k("userTypeDeser"));
        var13_8.m(25, 1);
        var13_8.m(25, 2);
        var13_8.m(25, 3);
        var13_8.m(25, 4);
        var13_8.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "deserialzeArrayMapping", s.a("(L", (String)var7_7, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"));
        var13_8.e(176);
        var13_8.h((g)var1_1);
        this.b(var2_2, var13_8);
        var11_9 = com.github.catvod.spider.merge.C.b.a((b)var2_2).i;
        var4_10 = var11_9.length;
        var7_7 = this;
        var1_1 = var8_5;
        for (var5_11 = 0; var5_11 < var4_10; ++var5_11) {
            block13: {
                block33: {
                    block32: {
                        block27: {
                            block29: {
                                block31: {
                                    block30: {
                                        block28: {
                                            block26: {
                                                block20: {
                                                    block25: {
                                                        block24: {
                                                            block22: {
                                                                block17: {
                                                                    block23: {
                                                                        block21: {
                                                                            block19: {
                                                                                block18: {
                                                                                    block16: {
                                                                                        block15: {
                                                                                            block14: {
                                                                                                var3_12 = var5_11 == var4_10 - 1 ? 1 : 0;
                                                                                                var6_13 = var3_12 != 0 ? 93 : 44;
                                                                                                var14_14 = var11_9[var5_11];
                                                                                                var8_5 = var14_14.e;
                                                                                                var9_6 = var14_14.f;
                                                                                                if (var8_5 == Byte.TYPE || var8_5 == Short.TYPE || var8_5 == Integer.TYPE) break block13;
                                                                                                if (var8_5 == Byte.class) {
                                                                                                    var13_8.m(25, var2_2.k("lexer"));
                                                                                                    var13_8.m(16, var6_13);
                                                                                                    var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                                                                    var13_8.k(182, (String)var7_7, "scanInt", "(C)I");
                                                                                                    var8_5 = "java/lang/Byte";
                                                                                                    var9_6 = "(B)Ljava/lang/Byte;";
lbl78:
                                                                                                    // 6 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (var8_5 != Short.class) break block14;
                                                                                                var13_8.m(25, var2_2.k("lexer"));
                                                                                                var13_8.m(16, var6_13);
                                                                                                var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                                                                var13_8.k(182, (String)var7_7, "scanInt", "(C)I");
                                                                                                var8_5 = "java/lang/Short";
                                                                                                var9_6 = "(S)Ljava/lang/Short;";
                                                                                                ** GOTO lbl78
                                                                                            }
                                                                                            if (var8_5 != Integer.class) break block15;
                                                                                            var13_8.m(25, var2_2.k("lexer"));
                                                                                            var13_8.m(16, var6_13);
                                                                                            var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                                                            var13_8.k(182, (String)var7_7, "scanInt", "(C)I");
                                                                                            var8_5 = "java/lang/Integer";
                                                                                            var9_6 = "(I)Ljava/lang/Integer;";
                                                                                            ** GOTO lbl78
                                                                                        }
                                                                                        if (var8_5 != Long.TYPE) break block16;
                                                                                        var13_8.m(25, var2_2.k("lexer"));
                                                                                        var13_8.m(16, var6_13);
                                                                                        var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "scanLong", "(C)J");
                                                                                        var3_12 = 55;
                                                                                        break block17;
                                                                                    }
                                                                                    if (var8_5 != Long.class) break block18;
                                                                                    var13_8.m(25, var2_2.k("lexer"));
                                                                                    var13_8.m(16, var6_13);
                                                                                    var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                                                    var13_8.k(182, (String)var7_7, "scanLong", "(C)J");
                                                                                    var8_5 = "java/lang/Long";
                                                                                    var9_6 = "(J)Ljava/lang/Long;";
                                                                                    ** GOTO lbl78
                                                                                }
                                                                                if (var8_5 != Boolean.TYPE) break block19;
                                                                                var13_8.m(25, var2_2.k("lexer"));
                                                                                var13_8.m(16, var6_13);
                                                                                var8_5 = com.github.catvod.spider.merge.C.c.d;
                                                                                var9_6 = "scanBoolean";
                                                                                var7_7 = "(C)Z";
                                                                                break block20;
                                                                            }
                                                                            if (var8_5 != Float.TYPE) break block21;
                                                                            var13_8.m(25, var2_2.k("lexer"));
                                                                            var13_8.m(16, var6_13);
                                                                            var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "scanFloat", "(C)F");
                                                                            var3_12 = 56;
                                                                            var6_13 = var2_2.l(var14_14);
                                                                            break block22;
                                                                        }
                                                                        if (var8_5 != Float.class) break block23;
                                                                        var13_8.m(25, var2_2.k("lexer"));
                                                                        var13_8.m(16, var6_13);
                                                                        var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                                        var13_8.k(182, (String)var7_7, "scanFloat", "(C)F");
                                                                        var8_5 = "java/lang/Float";
                                                                        var9_6 = "(F)Ljava/lang/Float;";
                                                                        ** GOTO lbl78
                                                                    }
                                                                    if (var8_5 != Double.TYPE) break block24;
                                                                    var13_8.m(25, var2_2.k("lexer"));
                                                                    var13_8.m(16, var6_13);
                                                                    var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "scanDouble", "(C)D");
                                                                    var3_12 = 57;
                                                                }
                                                                var6_13 = var2_2.m(var14_14);
                                                            }
                                                            var13_8.m(var3_12, var6_13);
                                                            ** GOTO lbl304
                                                        }
                                                        if (var8_5 == Double.class) {
                                                            var13_8.m(25, var2_2.k("lexer"));
                                                            var13_8.m(16, var6_13);
                                                            var7_7 = com.github.catvod.spider.merge.C.c.d;
                                                            var13_8.k(182, (String)var7_7, "scanDouble", "(C)D");
                                                            var8_5 = "java/lang/Double";
                                                            var9_6 = "(D)Ljava/lang/Double;";
                                                            ** continue;
                                                        }
                                                        break block25;
                                                        var13_8.k(184, (String)var8_5, "valueOf", (String)var9_6);
                                                        var8_5 = com.github.catvod.spider.merge.C.a.b(var13_8, 58, var2_2.l(var14_14));
                                                        var13_8.m(25, var2_2.k("lexer"));
                                                        var13_8.c(180, (String)var7_7, "matchStat", "I");
                                                        var13_8.i(5);
                                                        var13_8.g(160, (g)var8_5);
                                                        var13_8.e(1);
                                                        var13_8.m(58, var2_2.l(var14_14));
                                                        var13_8.h((g)var8_5);
                                                        ** GOTO lbl304
                                                    }
                                                    if (var8_5 != Character.TYPE) break block26;
                                                    var13_8.m(25, var2_2.k("lexer"));
                                                    var13_8.m(16, var6_13);
                                                    var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "scanString", "(C)Ljava/lang/String;");
                                                    var13_8.e(3);
                                                    var8_5 = "java/lang/String";
                                                    var9_6 = "charAt";
                                                    var7_7 = "(I)C";
                                                }
                                                var13_8.k(182, (String)var8_5, (String)var9_6, (String)var7_7);
                                                var6_13 = var2_2.l(var14_14);
                                                var3_12 = 54;
                                                break block27;
                                            }
                                            if (var8_5 != String.class) break block28;
                                            var13_8.m(25, var2_2.k("lexer"));
                                            var13_8.m(16, var6_13);
                                            var7_7 = com.github.catvod.spider.merge.C.c.d;
                                            var8_5 = "scanString";
                                            var9_6 = "(C)Ljava/lang/String;";
                                            break block29;
                                        }
                                        if (var8_5 != BigDecimal.class) break block30;
                                        var13_8.m(25, var2_2.k("lexer"));
                                        var13_8.m(16, var6_13);
                                        var7_7 = com.github.catvod.spider.merge.C.c.d;
                                        var8_5 = "scanDecimal";
                                        var9_6 = "(C)Ljava/math/BigDecimal;";
                                        break block29;
                                    }
                                    if (var8_5 != Date.class) break block31;
                                    var13_8.m(25, var2_2.k("lexer"));
                                    var13_8.m(16, var6_13);
                                    var7_7 = com.github.catvod.spider.merge.C.c.d;
                                    var8_5 = "scanDate";
                                    var9_6 = "(C)Ljava/util/Date;";
                                    break block29;
                                }
                                if (var8_5 != UUID.class) break block32;
                                var13_8.m(25, var2_2.k("lexer"));
                                var13_8.m(16, var6_13);
                                var7_7 = com.github.catvod.spider.merge.C.c.d;
                                var8_5 = "scanUUID";
                                var9_6 = "(C)Ljava/util/UUID;";
                            }
                            var13_8.k(182, (String)var7_7, (String)var8_5, (String)var9_6);
                            var6_13 = var2_2.l(var14_14);
                            var3_12 = 58;
                        }
                        var13_8.m(var3_12, var6_13);
                        ** GOTO lbl304
                    }
                    if (!var8_5.isEnum()) break block33;
                    var9_6 = new g();
                    var7_7 = new g();
                    var15_15 = new g();
                    var17_17 = new g();
                    var13_8.m(25, var2_2.k("lexer"));
                    var16_16 = com.github.catvod.spider.merge.C.c.d;
                    var13_8.k(182, (String)var16_16, "getCurrent", "()C");
                    var13_8.e(89);
                    var13_8.m(54, var2_2.k("ch"));
                    var13_8.i(110);
                    var13_8.g(159, (g)var17_17);
                    var13_8.m(21, var2_2.k("ch"));
                    var13_8.i(34);
                    var13_8.g(160, (g)var9_6);
                    var13_8.h((g)var17_17);
                    var13_8.m(25, var2_2.k("lexer"));
                    var13_8.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var8_5)));
                    var13_8.m(25, 1);
                    var17_17 = com.github.catvod.spider.merge.C.c.c;
                    var18_18 = com.github.catvod.spider.merge.C.a.c("()");
                    var18_18.append(com.github.catvod.spider.merge.H.c.b(var12_3));
                    var13_8.k(182, (String)var17_17, "getSymbolTable", var18_18.toString());
                    var13_8.m(16, var6_13);
                    var17_17 = new StringBuilder();
                    var17_17.append("(Ljava/lang/Class;");
                    var17_17.append(com.github.catvod.spider.merge.H.c.b(var12_3));
                    var17_17.append("C)Ljava/lang/Enum;");
                    var13_8.k(182, (String)var16_16, "scanEnum", var17_17.toString());
                    var13_8.g(167, (g)var15_15);
                    var13_8.h((g)var9_6);
                    var13_8.m(21, var2_2.k("ch"));
                    var13_8.i(48);
                    var13_8.g(161, (g)var7_7);
                    var13_8.m(21, var2_2.k("ch"));
                    var13_8.i(57);
                    var13_8.g(163, (g)var7_7);
                    this.i(var2_2, var13_8, var14_14);
                    var13_8.l(192, com.github.catvod.spider.merge.H.c.f(j.class));
                    var13_8.m(25, var2_2.k("lexer"));
                    var13_8.m(16, var6_13);
                    var13_8.k(182, (String)var16_16, "scanInt", "(C)I");
                    var13_8.k(182, com.github.catvod.spider.merge.H.c.f(j.class), "valueOf", "(I)Ljava/lang/Enum;");
                    var13_8.g(167, (g)var15_15);
                    var13_8.h((g)var7_7);
                    var13_8.m(25, 0);
                    var13_8.m(25, var2_2.k("lexer"));
                    var13_8.m(16, var6_13);
                    var13_8.k(182, com.github.catvod.spider.merge.H.c.f(var10_4), "scanEnum", s.a((String)var1_1, (String)var16_16, ";C)Ljava/lang/Enum;"));
                    var13_8.h((g)var15_15);
                    var13_8.l(192, com.github.catvod.spider.merge.H.c.f(var8_5));
                    var13_8.m(58, var2_2.l(var14_14));
                    ** GOTO lbl304
                }
                if (Collection.class.isAssignableFrom((Class<?>)var8_5)) {
                    var16_16 = A.I((Type)var9_6);
                    if (var16_16 == String.class) {
                        if (var8_5 != List.class && var8_5 != Collections.class && var8_5 != ArrayList.class) {
                            var13_8.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var8_5)));
                            var13_8.k(184, com.github.catvod.spider.merge.H.c.f(A.class), "createCollection", "(Ljava/lang/Class;)Ljava/util/Collection;");
                        } else {
                            var13_8.l(187, com.github.catvod.spider.merge.H.c.f(ArrayList.class));
                            var13_8.e(89);
                            var13_8.k(183, com.github.catvod.spider.merge.H.c.f(ArrayList.class), "<init>", "()V");
                        }
                        var13_8.m(58, var2_2.l(var14_14));
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.m(25, var2_2.l(var14_14));
                        var13_8.m(16, var6_13);
                        var8_5 = com.github.catvod.spider.merge.C.c.d;
                        var13_8.k(182, (String)var8_5, "scanStringArray", "(Ljava/util/Collection;C)V");
                        var7_7 = new g();
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.c(180, (String)var8_5, "matchStat", "I");
                        var13_8.i(5);
                        var13_8.g(160, (g)var7_7);
                        var13_8.e(1);
                        var13_8.m(58, var2_2.l(var14_14));
                        var13_8.h((g)var7_7);
lbl304:
                        // 5 sources

                        var7_7 = var1_1;
                    } else {
                        var7_7 = new g();
                        var13_8.m(25, var2_2.k("lexer"));
                        var15_15 = com.github.catvod.spider.merge.C.c.d;
                        var13_8.k(182, (String)var15_15, "token", "()I");
                        var13_8.m(54, var2_2.k("token"));
                        var13_8.m(21, var2_2.k("token"));
                        var3_12 = var5_11 == 0 ? 14 : 16;
                        var13_8.i(var3_12);
                        var13_8.g(159, (g)var7_7);
                        var13_8.m(25, 1);
                        var13_8.i(var3_12);
                        var9_6 = com.github.catvod.spider.merge.C.c.c;
                        var13_8.k(182, (String)var9_6, "throwException", "(I)V");
                        var13_8.h((g)var7_7);
                        var18_18 = new g();
                        var17_17 = new g();
                        var3_12 = var2_2.k("lexer");
                        var7_7 = var1_1;
                        var13_8.m(25, var3_12);
                        var13_8.k(182, (String)var15_15, "getCurrent", "()C");
                        var13_8.m(16, 91);
                        var13_8.g(160, (g)var18_18);
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.k(182, (String)var15_15, "next", "()C");
                        var13_8.e(87);
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.i(14);
                        var13_8.k(182, (String)var15_15, "setToken", "(I)V");
                        var13_8.g(167, (g)var17_17);
                        var13_8.h((g)var18_18);
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.i(14);
                        var13_8.k(182, (String)var15_15, "nextToken", "(I)V");
                        var13_8.h((g)var17_17);
                        this.j(var13_8, (Class<?>)var8_5, var5_11, false);
                        var13_8.e(89);
                        var13_8.m(58, var2_2.l(var14_14));
                        this.h(var2_2, var13_8, var14_14, var16_16);
                        var13_8.m(25, 1);
                        var13_8.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var16_16)));
                        var13_8.m(25, 3);
                        var8_5 = com.github.catvod.spider.merge.H.c.f(var10_4);
                        var7_7 = com.github.catvod.spider.merge.C.a.c("(Ljava/util/Collection;");
                        var7_7.append(com.github.catvod.spider.merge.H.c.b(v.class));
                        var7_7.append("L");
                        var7_7.append((String)var9_6);
                        var7_7.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                        var13_8.k(184, (String)var8_5, "parseArray", var7_7.toString());
                    }
                } else {
                    var7_7 = var1_1;
                    if (var8_5.isArray()) {
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.i(14);
                        var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "nextToken", "(I)V");
                        var13_8.m(25, 1);
                        var13_8.m(25, 0);
                        var13_8.i(var5_11);
                        var13_8.k(182, com.github.catvod.spider.merge.H.c.f(var10_4), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                        var13_8.k(182, com.github.catvod.spider.merge.C.c.c, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                        var13_8.l(192, com.github.catvod.spider.merge.H.c.f(var8_5));
                        var13_8.m(58, var2_2.l(var14_14));
                    } else {
                        var15_15 = new g();
                        var7_7 = new g();
                        if (var8_5 == Date.class) {
                            var13_8.m(25, var2_2.k("lexer"));
                            var9_6 = com.github.catvod.spider.merge.C.c.d;
                            var13_8.k(182, (String)var9_6, "getCurrent", "()C");
                            var13_8.i(49);
                            var13_8.g(160, (g)var15_15);
                            var13_8.l(187, com.github.catvod.spider.merge.H.c.f(Date.class));
                            var13_8.e(89);
                            var13_8.m(25, var2_2.k("lexer"));
                            var13_8.m(16, var6_13);
                            var13_8.k(182, (String)var9_6, "scanLong", "(C)J");
                            var13_8.k(183, com.github.catvod.spider.merge.H.c.f(Date.class), "<init>", "(J)V");
                            var13_8.m(58, var2_2.l(var14_14));
                            var13_8.g(167, (g)var7_7);
                        }
                        var13_8.h((g)var15_15);
                        this.k(var2_2, var13_8, 14);
                        this.c(var2_2, var13_8, var14_14, (Class<?>)var8_5, var5_11);
                        var13_8.m(25, var2_2.k("lexer"));
                        var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "token", "()I");
                        var13_8.i(15);
                        var13_8.g(159, (g)var7_7);
                        var13_8.m(25, 0);
                        var13_8.m(25, var2_2.k("lexer"));
                        var3_12 = var3_12 == 0 ? 16 : 15;
                        var13_8.i(var3_12);
                        var9_6 = com.github.catvod.spider.merge.H.c.f(var10_4);
                        var8_5 = com.github.catvod.spider.merge.C.a.c("(");
                        var8_5.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.d.class));
                        var8_5.append("I)V");
                        var13_8.k(183, (String)var9_6, "check", var8_5.toString());
                        var13_8.h((g)var7_7);
                    }
                }
                var7_7 = this;
                continue;
            }
            var13_8.m(25, var2_2.k("lexer"));
            var13_8.m(16, var6_13);
            var13_8.k(182, com.github.catvod.spider.merge.C.c.d, "scanInt", "(C)I");
            var13_8.m(54, var2_2.l(var14_14));
        }
        super.a(var2_2, var13_8, false);
        var7_7 = new g();
        var8_5 = new g();
        var9_6 = new g();
        var10_4 = new g();
        var13_8.m(25, var2_2.k("lexer"));
        var1_1 = com.github.catvod.spider.merge.C.c.d;
        var13_8.k(182, (String)var1_1, "getCurrent", "()C");
        var13_8.e(89);
        var13_8.m(54, var2_2.k("ch"));
        var13_8.m(16, 44);
        var13_8.g(160, (g)var8_5);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.k(182, (String)var1_1, "next", "()C");
        var13_8.e(87);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.i(16);
        var13_8.k(182, (String)var1_1, "setToken", "(I)V");
        var13_8.g(167, (g)var10_4);
        var13_8.h((g)var8_5);
        var13_8.m(21, var2_2.k("ch"));
        var13_8.m(16, 93);
        var13_8.g(160, (g)var9_6);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.k(182, (String)var1_1, "next", "()C");
        var13_8.e(87);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.i(15);
        var13_8.k(182, (String)var1_1, "setToken", "(I)V");
        var13_8.g(167, (g)var10_4);
        var13_8.h((g)var9_6);
        var13_8.m(21, var2_2.k("ch"));
        var13_8.m(16, 26);
        var13_8.g(160, (g)var7_7);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.k(182, (String)var1_1, "next", "()C");
        var13_8.e(87);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.i(20);
        var13_8.k(182, (String)var1_1, "setToken", "(I)V");
        var13_8.g(167, (g)var10_4);
        var13_8.h((g)var7_7);
        var13_8.m(25, var2_2.k("lexer"));
        var13_8.i(16);
        var13_8.k(182, (String)var1_1, "nextToken", "(I)V");
        var13_8.h((g)var10_4);
        var13_8.m(25, var2_2.k("instance"));
        var13_8.e(176);
        var13_8.j(5, com.github.catvod.spider.merge.C.b.b(var2_2));
    }

    private void f(b b2, i i2, g g2, com.github.catvod.spider.merge.H.e comparable, Class<?> clazz, Class<?> clazz2, int n2) {
        g g3 = new g();
        String string = d;
        i2.k(182, string, "matchField", "([C)Z");
        i2.g(153, g3);
        this.n(i2, b2, n2);
        Object object = new g();
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(8);
        i2.g(160, (g)object);
        i2.m(25, b2.k("lexer"));
        Integer n3 = 16;
        i2.i(n3);
        i2.k(182, string, "nextToken", "(I)V");
        i2.g(167, g3);
        i2.h((g)object);
        Object object2 = new g();
        object = new g();
        g g4 = new g();
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(21);
        i2.g(160, (g)object);
        i2.m(25, b2.k("lexer"));
        Comparable<Integer> comparable2 = 14;
        i2.i(comparable2);
        i2.k(182, string, "nextToken", "(I)V");
        this.j(i2, clazz, n2, true);
        i2.g(167, (g)object2);
        i2.h((g)object);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(comparable2);
        i2.g(159, g4);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        Integer n4 = 12;
        i2.i(n4);
        i2.g(160, g2);
        this.j(i2, clazz, n2, false);
        i2.m(58, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        this.h(b2, i2, (com.github.catvod.spider.merge.H.e)comparable, clazz2);
        i2.m(25, 1);
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(clazz2)));
        i2.e(3);
        i2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        String string2 = com.github.catvod.spider.merge.H.c.f(v.class);
        comparable2 = com.github.catvod.spider.merge.C.a.c("(L");
        object = c;
        i2.k(185, string2, "deserialze", r.c((StringBuilder)comparable2, (String)object, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        i2.m(58, b2.k("list_item_value"));
        i2.m(25, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        i2.m(25, b2.k("list_item_value"));
        if (clazz.isInterface()) {
            i2.k(185, com.github.catvod.spider.merge.H.c.f(clazz), "add", "(Ljava/lang/Object;)Z");
        } else {
            i2.k(182, com.github.catvod.spider.merge.H.c.f(clazz), "add", "(Ljava/lang/Object;)Z");
        }
        i2.e(87);
        i2.g(167, g3);
        i2.h(g4);
        this.j(i2, clazz, n2, false);
        i2.h((g)object2);
        i2.m(58, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        boolean bl = o.i(((com.github.catvod.spider.merge.H.e)comparable).e);
        this.h(b2, i2, (com.github.catvod.spider.merge.H.e)comparable, clazz2);
        if (bl) {
            i2.k(185, com.github.catvod.spider.merge.H.c.f(v.class), "getFastMatchToken", "()I");
            i2.m(54, b2.k("fastMatchToken"));
            i2.m(25, b2.k("lexer"));
            i2.m(21, b2.k("fastMatchToken"));
            i2.k(182, string, "nextToken", "(I)V");
        } else {
            i2.e(87);
            i2.i(n4);
            i2.m(54, b2.k("fastMatchToken"));
            this.k(b2, i2, 12);
        }
        i2.m(25, 1);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("()");
        ((StringBuilder)object2).append(com.github.catvod.spider.merge.H.c.b(k.class));
        i2.k(182, (String)object, "getContext", ((StringBuilder)object2).toString());
        i2.m(58, b2.k("listContext"));
        i2.m(25, 1);
        i2.m(25, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        i2.i(((com.github.catvod.spider.merge.H.e)comparable).a);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("(Ljava/lang/Object;Ljava/lang/Object;)");
        ((StringBuilder)object2).append(com.github.catvod.spider.merge.H.c.b(k.class));
        i2.k(182, (String)object, "setContext", ((StringBuilder)object2).toString());
        i2.e(87);
        object2 = new g();
        g4 = new g();
        i2.e(3);
        i2.m(54, b2.k("i"));
        i2.h((g)object2);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(15);
        i2.g(159, g4);
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e(b2), r.c(new StringBuilder(), ((com.github.catvod.spider.merge.H.e)comparable).a, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(v.class));
        i2.m(25, 1);
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(clazz2)));
        i2.m(21, b2.k("i"));
        i2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        i2.k(185, com.github.catvod.spider.merge.H.c.f(v.class), "deserialze", s.a("(L", (String)object, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        i2.m(58, b2.k("list_item_value"));
        i2.d(b2.k("i"));
        i2.m(25, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        i2.m(25, b2.k("list_item_value"));
        if (clazz.isInterface()) {
            i2.k(185, com.github.catvod.spider.merge.H.c.f(clazz), "add", "(Ljava/lang/Object;)Z");
        } else {
            i2.k(182, com.github.catvod.spider.merge.H.c.f(clazz), "add", "(Ljava/lang/Object;)Z");
        }
        i2.e(87);
        i2.m(25, 1);
        i2.m(25, b2.l((com.github.catvod.spider.merge.H.e)comparable));
        i2.k(182, (String)object, "checkListResolve", "(Ljava/util/Collection;)V");
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(n3);
        i2.g(160, (g)object2);
        if (bl) {
            i2.m(25, b2.k("lexer"));
            i2.m(21, b2.k("fastMatchToken"));
            i2.k(182, string, "nextToken", "(I)V");
        } else {
            this.k(b2, i2, 12);
        }
        i2.g(167, (g)object2);
        i2.h(g4);
        i2.m(25, 1);
        i2.m(25, b2.k("listContext"));
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("(");
        ((StringBuilder)comparable).append(com.github.catvod.spider.merge.H.c.b(k.class));
        ((StringBuilder)comparable).append(")V");
        i2.k(182, (String)object, "setContext", ((StringBuilder)comparable).toString());
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "token", "()I");
        i2.i(15);
        i2.g(160, g2);
        this.l(b2, i2);
        i2.h(g3);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private void g(b object, i i2, com.github.catvod.spider.merge.H.e comparable, Class object2, int n2) {
        Object object3 = new g();
        g g2 = new g();
        i2.m(25, ((b)object).k("lexer"));
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e((b)object), ((b)object).h((com.github.catvod.spider.merge.H.e)comparable), "[C");
        i2.k(182, d, "matchField", "([C)Z");
        i2.g(154, (g)object3);
        i2.e(1);
        i2.m(58, ((b)object).l((com.github.catvod.spider.merge.H.e)comparable));
        i2.g(167, g2);
        i2.h((g)object3);
        this.n(i2, (b)object, n2);
        i2.m(21, ((b)object).k("matchedCount"));
        i2.e(4);
        i2.e(96);
        i2.m(54, ((b)object).k("matchedCount"));
        this.c((b)object, i2, (com.github.catvod.spider.merge.H.e)comparable, (Class<?>)object2, n2);
        i2.m(25, 1);
        object2 = c;
        i2.k(182, (String)object2, "getResolveStatus", "()I");
        i2.i(1);
        i2.g(160, g2);
        i2.m(25, 1);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("()");
        ((StringBuilder)object3).append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.a.class));
        i2.k(182, (String)object2, "getLastResolveTask", ((StringBuilder)object3).toString());
        i2.m(58, ((b)object).k("resolveTask"));
        i2.m(25, ((b)object).k("resolveTask"));
        i2.m(25, 1);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("()");
        ((StringBuilder)object3).append(com.github.catvod.spider.merge.H.c.b(k.class));
        i2.k(182, (String)object2, "getContext", ((StringBuilder)object3).toString());
        i2.c(181, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.a.class), "ownerContext", com.github.catvod.spider.merge.H.c.b(k.class));
        i2.m(25, ((b)object).k("resolveTask"));
        i2.m(25, 0);
        i2.i(((com.github.catvod.spider.merge.H.e)comparable).a);
        object = com.github.catvod.spider.merge.H.c.f(q.class);
        comparable = com.github.catvod.spider.merge.C.a.c("(Ljava/lang/String;)");
        ((StringBuilder)comparable).append(com.github.catvod.spider.merge.H.c.b(n.class));
        i2.k(182, (String)object, "getFieldDeserializer", ((StringBuilder)comparable).toString());
        i2.c(181, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.a.class), "fieldDeserializer", com.github.catvod.spider.merge.H.c.b(n.class));
        i2.m(25, 1);
        i2.i(0);
        i2.k(182, (String)object2, "setResolveStatus", "(I)V");
        i2.h(g2);
    }

    private void h(b b2, i i2, com.github.catvod.spider.merge.H.e e2, Class<?> serializable) {
        g g2 = new g();
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e(b2), r.c(new StringBuilder(), e2.a, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(v.class));
        i2.g(199, g2);
        i2.m(25, 0);
        i2.m(25, 1);
        String string = c;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("()");
        stringBuilder.append(com.github.catvod.spider.merge.H.c.b(o.class));
        i2.k(182, string, "getConfig", stringBuilder.toString());
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(serializable)));
        string = com.github.catvod.spider.merge.H.c.f(o.class);
        serializable = com.github.catvod.spider.merge.C.a.c("(Ljava/lang/reflect/Type;)");
        ((StringBuilder)serializable).append(com.github.catvod.spider.merge.H.c.b(v.class));
        i2.k(182, string, "getDeserializer", ((StringBuilder)serializable).toString());
        i2.c(181, com.github.catvod.spider.merge.C.b.e(b2), r.c(new StringBuilder(), e2.a, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(v.class));
        i2.h(g2);
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e(b2), r.c(new StringBuilder(), e2.a, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(v.class));
    }

    private void i(b b2, i i2, com.github.catvod.spider.merge.H.e e2) {
        g g2 = new g();
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e(b2), b2.g(e2), com.github.catvod.spider.merge.H.c.b(v.class));
        i2.g(199, g2);
        i2.m(25, 0);
        i2.m(25, 1);
        String string = c;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("()");
        stringBuilder.append(com.github.catvod.spider.merge.H.c.b(o.class));
        i2.k(182, string, "getConfig", stringBuilder.toString());
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(e2.e)));
        string = com.github.catvod.spider.merge.H.c.f(o.class);
        stringBuilder = com.github.catvod.spider.merge.C.a.c("(Ljava/lang/reflect/Type;)");
        stringBuilder.append(com.github.catvod.spider.merge.H.c.b(v.class));
        i2.k(182, string, "getDeserializer", stringBuilder.toString());
        i2.c(181, com.github.catvod.spider.merge.C.b.e(b2), b2.g(e2), com.github.catvod.spider.merge.H.c.b(v.class));
        i2.h(g2);
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.C.b.e(b2), b2.g(e2), com.github.catvod.spider.merge.H.c.b(v.class));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void j(i var1_1, Class<?> var2_2, int var3_3, boolean var4_4) {
        block5: {
            block4: {
                block3: {
                    block2: {
                        if (!var2_2.isAssignableFrom(ArrayList.class) || var4_4) break block2;
                        var5_5 /* !! */  = "java/util/ArrayList";
                        var1_1.l(187, "java/util/ArrayList");
                        var1_1.e(89);
                        ** GOTO lbl31
                    }
                    if (!var2_2.isAssignableFrom(LinkedList.class) || var4_4) break block3;
                    var1_1.l(187, com.github.catvod.spider.merge.H.c.f(LinkedList.class));
                    var1_1.e(89);
                    var5_5 /* !! */  = LinkedList.class;
                    ** GOTO lbl30
                }
                if (var2_2.isAssignableFrom(HashSet.class)) ** GOTO lbl-1000
                if (!var2_2.isAssignableFrom(TreeSet.class)) break block4;
                var1_1.l(187, com.github.catvod.spider.merge.H.c.f(TreeSet.class));
                var1_1.e(89);
                var5_5 /* !! */  = TreeSet.class;
                ** GOTO lbl30
            }
            if (!var2_2.isAssignableFrom(LinkedHashSet.class)) break block5;
            var1_1.l(187, com.github.catvod.spider.merge.H.c.f(LinkedHashSet.class));
            var1_1.e(89);
            var5_5 /* !! */  = LinkedHashSet.class;
            ** GOTO lbl30
        }
        if (var4_4) lbl-1000:
        // 2 sources

        {
            var1_1.l(187, com.github.catvod.spider.merge.H.c.f(HashSet.class));
            var1_1.e(89);
            var5_5 /* !! */  = HashSet.class;
lbl30:
            // 4 sources

            var5_5 /* !! */  = com.github.catvod.spider.merge.H.c.f(var5_5 /* !! */ );
lbl31:
            // 2 sources

            var1_1.k(183, (String)var5_5 /* !! */ , "<init>", "()V");
        } else {
            var1_1.m(25, 0);
            var1_1.i(var3_3);
            var1_1.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            var1_1.k(184, com.github.catvod.spider.merge.H.c.f(A.class), "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
        }
        var1_1.l(192, com.github.catvod.spider.merge.H.c.f(var2_2));
    }

    private void k(b b2, i i2, int n2) {
        block4: {
            int n3;
            String string;
            g g2;
            g g3;
            block3: {
                block2: {
                    g3 = new g();
                    g2 = new g();
                    i2.m(25, b2.k("lexer"));
                    string = d;
                    i2.k(182, string, "getCurrent", "()C");
                    if (n2 != 12) break block2;
                    n3 = 123;
                    break block3;
                }
                if (n2 != 14) break block4;
                n3 = 91;
            }
            i2.m(16, n3);
            i2.g(160, g3);
            i2.m(25, b2.k("lexer"));
            i2.k(182, string, "next", "()C");
            i2.e(87);
            i2.m(25, b2.k("lexer"));
            i2.i(n2);
            i2.k(182, string, "setToken", "(I)V");
            i2.g(167, g2);
            i2.h(g3);
            i2.m(25, b2.k("lexer"));
            i2.i(n2);
            i2.k(182, string, "nextToken", "(I)V");
            i2.h(g2);
            return;
        }
        throw new IllegalStateException();
    }

    private void l(b b2, i i2) {
        g g2 = new g();
        g g3 = new g();
        g g4 = new g();
        g g5 = new g();
        g g6 = new g();
        i2.m(25, b2.k("lexer"));
        String string = d;
        i2.k(182, string, "getCurrent", "()C");
        i2.e(89);
        i2.m(54, b2.k("ch"));
        i2.m(16, 44);
        i2.g(160, g3);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "next", "()C");
        i2.e(87);
        i2.m(25, b2.k("lexer"));
        i2.i(16);
        i2.k(182, string, "setToken", "(I)V");
        i2.g(167, g6);
        i2.h(g3);
        i2.m(21, b2.k("ch"));
        i2.m(16, 125);
        i2.g(160, g4);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "next", "()C");
        i2.e(87);
        i2.m(25, b2.k("lexer"));
        i2.i(13);
        i2.k(182, string, "setToken", "(I)V");
        i2.g(167, g6);
        i2.h(g4);
        i2.m(21, b2.k("ch"));
        i2.m(16, 93);
        i2.g(160, g5);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "next", "()C");
        i2.e(87);
        i2.m(25, b2.k("lexer"));
        i2.i(15);
        i2.k(182, string, "setToken", "(I)V");
        i2.g(167, g6);
        i2.h(g5);
        i2.m(21, b2.k("ch"));
        i2.m(16, 26);
        i2.g(160, g2);
        i2.m(25, b2.k("lexer"));
        i2.i(20);
        i2.k(182, string, "setToken", "(I)V");
        i2.g(167, g6);
        i2.h(g2);
        i2.m(25, b2.k("lexer"));
        i2.k(182, string, "nextToken", "()V");
        i2.h(g6);
    }

    private void m(i i2, com.github.catvod.spider.merge.H.e e2) {
        Method method = e2.b;
        if (method != null) {
            int n2 = method.getDeclaringClass().isInterface() ? 185 : 182;
            i2.k(n2, com.github.catvod.spider.merge.H.c.f(e2.g), method.getName(), com.github.catvod.spider.merge.H.c.c(method));
            if (!e2.b.getReturnType().equals(Void.TYPE)) {
                i2.e(87);
            }
        } else {
            i2.c(181, com.github.catvod.spider.merge.H.c.f(e2.g), e2.c.getName(), com.github.catvod.spider.merge.H.c.b(e2.e));
        }
    }

    private void n(i i2, b b2, int n2) {
        CharSequence charSequence = com.github.catvod.spider.merge.C.a.c("_asm_flag_");
        charSequence.append(n2 / 32);
        charSequence = charSequence.toString();
        i2.m(21, b2.k((String)charSequence));
        i2.i(1 << n2);
        i2.e(128);
        i2.m(54, b2.k((String)charSequence));
    }

    private void p(b b2, i i2) {
        i2.m(25, 1);
        i2.c(180, c, "lexer", com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.d.class));
        i2.l(192, d);
        i2.m(58, b2.k("lexer"));
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final v o(o var1_1, l var2_2) {
        block48: {
            block46: {
                var17_3 = k.class;
                var13_4 = q.class;
                var9_5 = var2_2.a;
                if (var9_5.isPrimitive()) break block48;
                var8_6 = com.github.catvod.spider.merge.C.a.c("FastjsonASMDeserializer_");
                var8_6.append(this.b.incrementAndGet());
                var8_6.append("_");
                var8_6.append(var9_5.getSimpleName());
                var9_5 = var8_6.toString();
                var8_6 = c.class.getPackage();
                if (var8_6 != null) {
                    var8_6 = var8_6.getName();
                    var10_7 = new StringBuilder();
                    var10_7.append(var8_6.replace('.', '/'));
                    var10_7.append("/");
                    var10_7.append((String)var9_5);
                    var11_8 = var10_7.toString();
                    var8_6 = s.a((String)var8_6, ".", (String)var9_5);
                } else {
                    var8_6 = var9_5;
                    var11_8 = var9_5;
                }
                var27_9 = new d();
                var27_9.j((String)var11_8, com.github.catvod.spider.merge.H.c.f(q.class), null);
                var9_5 = new b((String)var11_8, var2_2, 3);
                var4_10 = com.github.catvod.spider.merge.C.b.c((b)var9_5).length;
                for (var3_11 = 0; var3_11 < var4_10; ++var3_11) {
                    new e(var27_9, var9_5.h(com.github.catvod.spider.merge.C.b.c((b)var9_5)[var3_11]), "[C");
                }
                var3_11 = com.github.catvod.spider.merge.C.b.c((b)var9_5).length;
                var12_12 = var8_6;
                for (var4_10 = 0; var4_10 < var3_11; ++var4_10) {
                    var10_7 = com.github.catvod.spider.merge.C.b.c((b)var9_5)[var4_10];
                    var8_6 = var10_7.e;
                    if (var8_6.isPrimitive()) continue;
                    if (Collection.class.isAssignableFrom((Class<?>)var8_6)) {
                        new e(var27_9, r.c(new StringBuilder(), var10_7.a, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(v.class));
                        continue;
                    }
                    new e(var27_9, var9_5.g((com.github.catvod.spider.merge.H.e)var10_7), com.github.catvod.spider.merge.H.c.b(v.class));
                }
                var16_13 = "(";
                var8_6 = com.github.catvod.spider.merge.C.a.c("(");
                var8_6.append(com.github.catvod.spider.merge.H.c.b(o.class));
                var8_6.append(com.github.catvod.spider.merge.H.c.b(l.class));
                var8_6.append(")V");
                var8_6 = new i(var27_9, "<init>", var8_6.toString(), null);
                var8_6.m(25, 0);
                var8_6.m(25, 1);
                var8_6.m(25, 2);
                var10_7 = com.github.catvod.spider.merge.H.c.f(q.class);
                var14_14 = com.github.catvod.spider.merge.C.a.c("(");
                var14_14.append(com.github.catvod.spider.merge.H.c.b(o.class));
                var14_14.append(com.github.catvod.spider.merge.H.c.b(l.class));
                var14_14.append(")V");
                var8_6.k(183, (String)var10_7, "<init>", var14_14.toString());
                var4_10 = com.github.catvod.spider.merge.C.b.c((b)var9_5).length;
                for (var3_11 = 0; var3_11 < var4_10; ++var3_11) {
                    var14_14 = com.github.catvod.spider.merge.C.b.c((b)var9_5)[var3_11];
                    var8_6.m(25, 0);
                    var10_7 = new StringBuilder();
                    var10_7.append("\"");
                    var10_7.append(var14_14.a);
                    var10_7.append("\":");
                    var8_6.i(var10_7.toString());
                    var8_6.k(182, "java/lang/String", "toCharArray", "()[C");
                    var8_6.c(181, com.github.catvod.spider.merge.C.b.e((b)var9_5), var9_5.h((com.github.catvod.spider.merge.H.e)var14_14), "[C");
                }
                var8_6.e(177);
                var8_6.j(4, 4);
                var9_5 = new b((String)var11_8, var2_2, 3);
                if (Modifier.isPublic(com.github.catvod.spider.merge.C.b.a((b)var9_5).c.getModifiers())) {
                    var8_6 = new i(var27_9, "createInstance", r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.C.c.c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"), null);
                    var8_6.l(187, com.github.catvod.spider.merge.H.c.f(var9_5.i()));
                    var8_6.e(89);
                    var8_6.k(183, com.github.catvod.spider.merge.H.c.f(var9_5.i()), "<init>", "()V");
                    var8_6.e(176);
                    var8_6.j(3, 3);
                }
                var28_15 = new b((String)var11_8, var2_2, 5);
                if (com.github.catvod.spider.merge.C.b.c(var28_15).length == 0) break block46;
                for (Object var10_7 : com.github.catvod.spider.merge.C.b.c(var28_15)) {
                    var9_5 = var10_7.e;
                    var10_7 = var10_7.f;
                    if (var9_5 != Character.TYPE && (!Collection.class.isAssignableFrom(var9_5) || var10_7 instanceof ParameterizedType && ((ParameterizedType)var10_7).getActualTypeArguments()[0] instanceof Class)) {
                        continue;
                    }
                    break block46;
                }
                var15_16 = com.github.catvod.spider.merge.C.b.a(var28_15);
                com.github.catvod.spider.merge.C.b.d(var28_15, var15_16.i);
                var8_6 = com.github.catvod.spider.merge.C.a.c("(L");
                var21_17 /* !! */  = com.github.catvod.spider.merge.C.c.c;
                var29_18 = new i(var27_9, "deserialze", r.c((StringBuilder)var8_6, (String)var21_17 /* !! */ , ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"), null);
                var20_19 = new g();
                var14_14 = new g();
                var8_6 = new g();
                var23_20 = new g();
                this.p(var28_15, var29_18);
                var9_5 = new g();
                var22_21 = "lexer";
                var29_18.m(25, var28_15.k("lexer"));
                var10_7 = com.github.catvod.spider.merge.C.c.d;
                var29_18.k(182, (String)var10_7, "token", "()I");
                var29_18.i(14);
                var29_18.g(160, (g)var9_5);
                var3_11 = var15_16.j;
                var15_16 = com.github.catvod.spider.merge.B.c.m;
                if ((var3_11 & var15_16.a) == 0) {
                    var29_18.m(25, var28_15.k("lexer"));
                    var29_18.m(21, 4);
                    var29_18.i(var15_16.a);
                    var29_18.k(182, (String)var10_7, "isEnabled", "(II)Z");
                    var29_18.g(153, (g)var9_5);
                }
                var29_18.m(25, 0);
                var29_18.m(25, 1);
                var29_18.m(25, 2);
                var29_18.m(25, 3);
                var29_18.e(1);
                var18_22 = com.github.catvod.spider.merge.C.b.e(var28_15);
                var15_16 = s.a("(L", (String)var21_17 /* !! */ , ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
                var19_23 = "(L";
                var29_18.k(183, (String)var18_22, "deserialzeArrayMapping", (String)var15_16);
                var29_18.e(176);
                var29_18.h((g)var9_5);
                var29_18.m(25, var28_15.k("lexer"));
                var29_18.i(com.github.catvod.spider.merge.B.c.j.a);
                var29_18.k(182, (String)var10_7, "isEnabled", "(I)Z");
                var9_5 = new g();
                var29_18.g(154, (g)var9_5);
                var29_18.g(200, (g)var14_14);
                var29_18.h((g)var9_5);
                var29_18.m(25, var28_15.k("lexer"));
                var29_18.i(com.github.catvod.spider.merge.C.b.f(var28_15).getName());
                var29_18.k(182, (String)var10_7, "scanType", "(Ljava/lang/String;)I");
                var29_18.i(-1);
                var9_5 = new g();
                var29_18.g(160, (g)var9_5);
                var29_18.g(200, (g)var14_14);
                var29_18.h((g)var9_5);
                var29_18.m(25, 1);
                var9_5 = new StringBuilder();
                var15_16 = "()";
                var9_5.append("()");
                var9_5.append(com.github.catvod.spider.merge.H.c.b(k.class));
                var29_18.k(182, (String)var21_17 /* !! */ , "getContext", var9_5.toString());
                var29_18.m(58, var28_15.k("mark_context"));
                var29_18.e(3);
                var9_5 = "matchedCount";
                var29_18.m(54, var28_15.k("matchedCount"));
                this.b(var28_15, var29_18);
                var29_18.m(25, 1);
                var18_22 = new StringBuilder();
                var18_22.append("()");
                var18_22.append(com.github.catvod.spider.merge.H.c.b(k.class));
                var29_18.k(182, (String)var21_17 /* !! */ , "getContext", var18_22.toString());
                var29_18.m(58, var28_15.k("context"));
                var29_18.m(25, 1);
                var29_18.m(25, var28_15.k("context"));
                var29_18.m(25, var28_15.k("instance"));
                var29_18.m(25, 3);
                var18_22 = new StringBuilder();
                var18_22.append("(");
                var18_22.append(com.github.catvod.spider.merge.H.c.b(k.class));
                var18_22.append("Ljava/lang/Object;Ljava/lang/Object;)");
                var18_22.append(com.github.catvod.spider.merge.H.c.b(k.class));
                var24_24 /* !! */  = var18_22.toString();
                var18_22 = "instance";
                var29_18.k(182, (String)var21_17 /* !! */ , "setContext", (String)var24_24 /* !! */ );
                var29_18.m(58, var28_15.k("childContext"));
                var29_18.m(25, var28_15.k("lexer"));
                var25_25 = "matchStat";
                var26_26 = "I";
                var29_18.c(180, (String)var10_7, "matchStat", "I");
                var29_18.i(4);
                var10_7 = new g();
                var29_18.g(160, (g)var10_7);
                var29_18.g(200, (g)var8_6);
                var29_18.h((g)var10_7);
                var29_18.e(3);
                var29_18.f(54, var28_15.k("matchStat"));
                var6_27 = com.github.catvod.spider.merge.C.b.c(var28_15).length;
                for (var3_11 = 0; var3_11 < var6_27; var3_11 += 32) {
                    var29_18.e(3);
                    var10_7 = new StringBuilder();
                    var10_7.append("_asm_flag_");
                    var10_7.append(var3_11 / 32);
                    var29_18.m(54, var28_15.k(var10_7.toString()));
                }
                var21_17 /* !! */  = var8_6;
                var29_18.m(25, var28_15.k("lexer"));
                var29_18.i(com.github.catvod.spider.merge.B.c.l.a);
                var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "isEnabled", "(I)Z");
                var29_18.f(54, var28_15.k("initStringFieldAsEmpty"));
                var8_6 = var9_5;
                for (var4_10 = 0; var4_10 < var6_27; ++var4_10) {
                    block55: {
                        block49: {
                            block54: {
                                block53: {
                                    block51: {
                                        block52: {
                                            block50: {
                                                var9_5 = com.github.catvod.spider.merge.C.b.c(var28_15)[var4_10];
                                                var24_24 /* !! */  = var9_5.e;
                                                if (var24_24 /* !! */  == Boolean.TYPE || var24_24 /* !! */  == Byte.TYPE || var24_24 /* !! */  == Short.TYPE || var24_24 /* !! */  == Integer.TYPE) break block49;
                                                if (var24_24 /* !! */  != Long.TYPE) break block50;
                                                var29_18.e(9);
                                                var3_11 = 55;
                                                break block51;
                                            }
                                            if (var24_24 /* !! */  != Float.TYPE) break block52;
                                            var29_18.e(11);
                                            var5_28 = 56;
                                            var3_11 = var28_15.l((com.github.catvod.spider.merge.H.e)var9_5);
                                            break block53;
                                        }
                                        if (var24_24 /* !! */  != Double.TYPE) break block54;
                                        var29_18.e(14);
                                        var3_11 = 57;
                                    }
                                    var7_29 = var28_15.m((com.github.catvod.spider.merge.H.e)var9_5);
                                    var5_28 = var3_11;
                                    var3_11 = var7_29;
                                }
                                var29_18.m(var5_28, var3_11);
                                continue;
                            }
                            if (var24_24 /* !! */  == String.class) {
                                var30_30 = new g();
                                var10_7 = new g();
                                var29_18.m(21, var28_15.k("initStringFieldAsEmpty"));
                                var29_18.g(153, (g)var10_7);
                                this.n(var29_18, var28_15, var4_10);
                                var29_18.m(25, var28_15.k("lexer"));
                                var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "stringDefaultValue", "()Ljava/lang/String;");
                                var29_18.g(167, var30_30);
                                var29_18.h((g)var10_7);
                                var29_18.e(1);
                                var29_18.h(var30_30);
                            } else {
                                var29_18.e(1);
                            }
                            var29_18.l(192, com.github.catvod.spider.merge.H.c.f(var24_24 /* !! */ ));
                            var5_28 = var28_15.l((com.github.catvod.spider.merge.H.e)var9_5);
                            var3_11 = 58;
                            break block55;
                        }
                        var29_18.e(3);
                        var5_28 = var28_15.l((com.github.catvod.spider.merge.H.e)var9_5);
                        var3_11 = 54;
                    }
                    var29_18.m(var3_11, var5_28);
                }
                var24_24 /* !! */  = var8_6;
                var4_10 = var6_27;
                for (var5_28 = 0; var5_28 < var4_10; ++var5_28) {
                    block82: {
                        block80: {
                            block81: {
                                block47: {
                                    block62: {
                                        block78: {
                                            block79: {
                                                block77: {
                                                    block70: {
                                                        block76: {
                                                            block75: {
                                                                block74: {
                                                                    block73: {
                                                                        block72: {
                                                                            block71: {
                                                                                block69: {
                                                                                    block68: {
                                                                                        block65: {
                                                                                            block67: {
                                                                                                block66: {
                                                                                                    block64: {
                                                                                                        block63: {
                                                                                                            block61: {
                                                                                                                block59: {
                                                                                                                    block60: {
                                                                                                                        block58: {
                                                                                                                            block57: {
                                                                                                                                block56: {
                                                                                                                                    var31_31 = com.github.catvod.spider.merge.C.b.c(var28_15)[var5_28];
                                                                                                                                    var8_6 = var31_31.e;
                                                                                                                                    var9_5 = var31_31.f;
                                                                                                                                    var30_30 = new g();
                                                                                                                                    if (var8_6 != Boolean.TYPE) break block56;
                                                                                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                                                                                    var29_18.m(25, 0);
                                                                                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                                                    var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldBoolean", "([C)Z");
                                                                                                                                    break block57;
                                                                                                                                }
                                                                                                                                if (var8_6 != Byte.TYPE) break block58;
                                                                                                                                var29_18.m(25, var28_15.k(var22_21));
                                                                                                                                var29_18.m(25, 0);
                                                                                                                                var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                                                var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldInt", "([C)I");
                                                                                                                            }
                                                                                                                            var29_18.m(54, var28_15.l(var31_31));
                                                                                                                            break block47;
                                                                                                                        }
                                                                                                                        if (var8_6 == Byte.class) {
                                                                                                                            var29_18.m(25, var28_15.k(var22_21));
                                                                                                                            var29_18.m(25, 0);
                                                                                                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                                            var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                                                            var29_18.k(182, (String)var8_6, "scanFieldInt", "([C)I");
                                                                                                                            var9_5 = "java/lang/Byte";
                                                                                                                            var10_7 = "(B)Ljava/lang/Byte;";
lbl302:
                                                                                                                            // 5 sources

                                                                                                                            while (true) {
                                                                                                                                continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (var8_6 == Short.TYPE) break block59;
                                                                                                                        if (var8_6 != Short.class) break block60;
                                                                                                                        var29_18.m(25, var28_15.k(var22_21));
                                                                                                                        var29_18.m(25, 0);
                                                                                                                        var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                                        var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                                                        var29_18.k(182, (String)var8_6, "scanFieldInt", "([C)I");
                                                                                                                        var9_5 = "java/lang/Short";
                                                                                                                        var10_7 = "(S)Ljava/lang/Short;";
                                                                                                                        ** GOTO lbl302
                                                                                                                    }
                                                                                                                    if (var8_6 != Integer.TYPE) break block61;
                                                                                                                }
                                                                                                                var29_18.m(25, var28_15.k(var22_21));
                                                                                                                var29_18.m(25, 0);
                                                                                                                var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                                var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldInt", "([C)I");
                                                                                                                var6_27 = var28_15.l(var31_31);
                                                                                                                var3_11 = 54;
                                                                                                                break block62;
                                                                                                            }
                                                                                                            if (var8_6 != Integer.class) break block63;
                                                                                                            var29_18.m(25, var28_15.k(var22_21));
                                                                                                            var29_18.m(25, 0);
                                                                                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                            var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                                            var29_18.k(182, (String)var8_6, "scanFieldInt", "([C)I");
                                                                                                            var9_5 = "java/lang/Integer";
                                                                                                            var10_7 = "(I)Ljava/lang/Integer;";
                                                                                                            ** GOTO lbl302
                                                                                                        }
                                                                                                        if (var8_6 != Long.TYPE) break block64;
                                                                                                        var29_18.m(25, var28_15.k(var22_21));
                                                                                                        var29_18.m(25, 0);
                                                                                                        var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                        var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldLong", "([C)J");
                                                                                                        var3_11 = 55;
                                                                                                        break block65;
                                                                                                    }
                                                                                                    if (var8_6 != Long.class) break block66;
                                                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                                                    var29_18.m(25, 0);
                                                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                    var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                                    var29_18.k(182, (String)var8_6, "scanFieldLong", "([C)J");
                                                                                                    var9_5 = "java/lang/Long";
                                                                                                    var10_7 = "(J)Ljava/lang/Long;";
                                                                                                    ** GOTO lbl302
                                                                                                }
                                                                                                if (var8_6 == Float.TYPE) {
                                                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                                                    var29_18.m(25, 0);
                                                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                    var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldFloat", "([C)F");
                                                                                                    var6_27 = 56;
                                                                                                    var3_11 = var28_15.l(var31_31);
lbl360:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var29_18.m(var6_27, var3_11);
                                                                                                        break block47;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (var8_6 == Float.class) {
                                                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                                                    var29_18.m(25, 0);
                                                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                                    var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                                    var29_18.k(182, (String)var8_6, "scanFieldFloat", "([C)F");
                                                                                                    var9_5 = "java/lang/Float";
                                                                                                    var10_7 = "(F)Ljava/lang/Float;";
                                                                                                    ** continue;
                                                                                                }
                                                                                                break block67;
                                                                                                var29_18.k(184, (String)var9_5, "valueOf", (String)var10_7);
                                                                                                var9_5 = com.github.catvod.spider.merge.C.a.b(var29_18, 58, var28_15.l(var31_31));
                                                                                                var29_18.m(25, var28_15.k(var22_21));
                                                                                                var29_18.c(180, (String)var8_6, var25_25, var26_26);
                                                                                                var29_18.i(5);
                                                                                                var29_18.g(160, (g)var9_5);
                                                                                                var29_18.e(1);
                                                                                                var29_18.m(58, var28_15.l(var31_31));
                                                                                                var8_6 = var9_5;
lbl382:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var29_18.h((g)var8_6);
                                                                                                    break block47;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (var8_6 != Double.TYPE) break block68;
                                                                                            var29_18.m(25, var28_15.k(var22_21));
                                                                                            var29_18.m(25, 0);
                                                                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                            var29_18.k(182, com.github.catvod.spider.merge.C.c.d, "scanFieldDouble", "([C)D");
                                                                                            var3_11 = 57;
                                                                                        }
                                                                                        var7_29 = var28_15.m(var31_31);
                                                                                        var6_27 = var3_11;
                                                                                        var3_11 = var7_29;
                                                                                        ** continue;
                                                                                    }
                                                                                    if (var8_6 == Double.class) {
                                                                                        var29_18.m(25, var28_15.k(var22_21));
                                                                                        var29_18.m(25, 0);
                                                                                        var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                        var9_5 = com.github.catvod.spider.merge.C.c.d;
                                                                                        var29_18.k(182, (String)var9_5, "scanFieldDouble", "([C)D");
                                                                                        var29_18.k(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                                                                        var8_6 = com.github.catvod.spider.merge.C.a.b(var29_18, 58, var28_15.l(var31_31));
                                                                                        var29_18.m(25, var28_15.k(var22_21));
                                                                                        var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                                                                        var29_18.i(5);
                                                                                        var29_18.g(160, (g)var8_6);
                                                                                        var29_18.e(1);
                                                                                        var29_18.m(58, var28_15.l(var31_31));
                                                                                        ** continue;
                                                                                    }
                                                                                    if (var8_6 != String.class) break block69;
                                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                                    var29_18.m(25, 0);
                                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                    var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                    var9_5 = "scanFieldString";
                                                                                    var10_7 = "([C)Ljava/lang/String;";
                                                                                    break block70;
                                                                                }
                                                                                if (var8_6 != Date.class) break block71;
                                                                                var29_18.m(25, var28_15.k(var22_21));
                                                                                var29_18.m(25, 0);
                                                                                var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                                var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                                var9_5 = "scanFieldDate";
                                                                                var10_7 = "([C)Ljava/util/Date;";
                                                                                break block70;
                                                                            }
                                                                            if (var8_6 != UUID.class) break block72;
                                                                            var29_18.m(25, var28_15.k(var22_21));
                                                                            var29_18.m(25, 0);
                                                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                            var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                            var9_5 = "scanFieldUUID";
                                                                            var10_7 = "([C)Ljava/util/UUID;";
                                                                            break block70;
                                                                        }
                                                                        if (var8_6 != BigDecimal.class) break block73;
                                                                        var29_18.m(25, var28_15.k(var22_21));
                                                                        var29_18.m(25, 0);
                                                                        var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                        var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                        var9_5 = "scanFieldDecimal";
                                                                        var10_7 = "([C)Ljava/math/BigDecimal;";
                                                                        break block70;
                                                                    }
                                                                    if (var8_6 != BigInteger.class) break block74;
                                                                    var29_18.m(25, var28_15.k(var22_21));
                                                                    var29_18.m(25, 0);
                                                                    var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                    var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                    var9_5 = "scanFieldBigInteger";
                                                                    var10_7 = "([C)Ljava/math/BigInteger;";
                                                                    break block70;
                                                                }
                                                                if (var8_6 != int[].class) break block75;
                                                                var29_18.m(25, var28_15.k(var22_21));
                                                                var29_18.m(25, 0);
                                                                var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                                var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                                var9_5 = "scanFieldIntArray";
                                                                var10_7 = "([C)[I";
                                                                break block70;
                                                            }
                                                            if (var8_6 != float[].class) break block76;
                                                            var29_18.m(25, var28_15.k(var22_21));
                                                            var29_18.m(25, 0);
                                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                            var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                            var9_5 = "scanFieldFloatArray";
                                                            var10_7 = "([C)[F";
                                                            break block70;
                                                        }
                                                        if (var8_6 != float[][].class) break block77;
                                                        var29_18.m(25, var28_15.k(var22_21));
                                                        var29_18.m(25, 0);
                                                        var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                        var8_6 = com.github.catvod.spider.merge.C.c.d;
                                                        var9_5 = "scanFieldFloatArray2";
                                                        var10_7 = "([C)[[F";
                                                    }
                                                    var29_18.k(182, (String)var8_6, (String)var9_5, (String)var10_7);
                                                    break block78;
                                                }
                                                if (!var8_6.isEnum()) break block79;
                                                var29_18.m(25, 0);
                                                var29_18.m(25, var28_15.k(var22_21));
                                                var29_18.m(25, 0);
                                                var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                                this.i(var28_15, var29_18, var31_31);
                                                var10_7 = com.github.catvod.spider.merge.H.c.f(var13_4);
                                                var9_5 = com.github.catvod.spider.merge.C.a.c(var19_23);
                                                var9_5.append(com.github.catvod.spider.merge.C.c.d);
                                                var9_5.append(";[C");
                                                var9_5.append(com.github.catvod.spider.merge.H.c.b(v.class));
                                                var9_5.append(")Ljava/lang/Enum;");
                                                var29_18.k(182, (String)var10_7, "scanEnum", var9_5.toString());
                                                var29_18.l(192, com.github.catvod.spider.merge.H.c.f(var8_6));
                                                break block78;
                                            }
                                            if (!Collection.class.isAssignableFrom((Class<?>)var8_6)) break block80;
                                            var29_18.m(25, var28_15.k(var22_21));
                                            var29_18.m(25, 0);
                                            var29_18.c(180, com.github.catvod.spider.merge.C.b.e(var28_15), var28_15.h(var31_31), "[C");
                                            var9_5 = A.I(var9_5);
                                            if (var9_5 != String.class) break block81;
                                            var29_18.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var8_6)));
                                            var8_6 = com.github.catvod.spider.merge.C.c.d;
                                            var9_5 = com.github.catvod.spider.merge.C.a.c("([CLjava/lang/Class;)");
                                            var9_5.append(com.github.catvod.spider.merge.H.c.b(Collection.class));
                                            var29_18.k(182, (String)var8_6, "scanFieldStringArray", var9_5.toString());
                                        }
                                        var6_27 = var28_15.l(var31_31);
                                        var3_11 = 58;
                                    }
                                    var29_18.m(var3_11, var6_27);
                                }
                                var29_18.m(25, var28_15.k(var22_21));
                                var9_5 = com.github.catvod.spider.merge.C.c.d;
                                var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                var8_6 = new g();
                                var29_18.g(158, (g)var8_6);
                                this.n(var29_18, var28_15, var5_28);
                                var29_18.h((g)var8_6);
                                var29_18.m(25, var28_15.k(var22_21));
                                var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                var29_18.e(89);
                                var29_18.m(54, var28_15.k(var25_25));
                                var29_18.i(-1);
                                var29_18.g(159, var20_19);
                                var29_18.m(25, var28_15.k(var22_21));
                                var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                var29_18.g(158, var30_30);
                                var29_18.m(21, var28_15.k((String)var24_24 /* !! */ ));
                                var29_18.e(4);
                                var29_18.e(96);
                                var29_18.m(54, var28_15.k((String)var24_24 /* !! */ ));
                                var29_18.m(25, var28_15.k(var22_21));
                                var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                var29_18.i(4);
                                var29_18.g(159, var23_20);
                                var29_18.h(var30_30);
                                if (var5_28 != var4_10 - 1) continue;
                                var29_18.m(25, var28_15.k(var22_21));
                                var29_18.c(180, (String)var9_5, var25_25, var26_26);
                                var29_18.i(4);
                                var29_18.g(160, var20_19);
                                continue;
                            }
                            this.f(var28_15, var29_18, var20_19, var31_31, (Class<?>)var8_6, var9_5, var5_28);
                            if (var5_28 != var4_10 - 1) continue;
                            break block82;
                        }
                        this.g(var28_15, var29_18, var31_31, (Class)var8_6, var5_28);
                        if (var5_28 != var4_10 - 1) continue;
                    }
                    this.d(var28_15, var29_18, var20_19);
                }
                var29_18.h(var23_20);
                if (!com.github.catvod.spider.merge.C.b.f(var28_15).isInterface() && !Modifier.isAbstract(com.github.catvod.spider.merge.C.b.f(var28_15).getModifiers())) {
                    this.a(var28_15, var29_18, true);
                }
                var29_18.h((g)var21_17 /* !! */ );
                var29_18.m(25, 1);
                var29_18.m(25, var28_15.k("context"));
                var8_6 = com.github.catvod.spider.merge.C.c.c;
                var9_5 = com.github.catvod.spider.merge.C.a.c(var16_13);
                var9_5.append(com.github.catvod.spider.merge.H.c.b(var17_3));
                var9_5.append(")V");
                var29_18.k(182, (String)var8_6, "setContext", var9_5.toString());
                var8_6 = new g();
                var29_18.m(25, var28_15.k("childContext"));
                var29_18.g(198, (g)var8_6);
                var29_18.m(25, var28_15.k("childContext"));
                var29_18.m(25, var28_15.k((String)var18_22));
                var29_18.c(181, com.github.catvod.spider.merge.H.c.f(var17_3), "object", "Ljava/lang/Object;");
                var29_18.h((g)var8_6);
                var29_18.m(25, var28_15.k((String)var18_22));
                var8_6 = com.github.catvod.spider.merge.C.b.a((b)var28_15).f;
                if (var8_6 != null) {
                    var10_7 = com.github.catvod.spider.merge.H.c.f(var28_15.i());
                    var9_5 = var8_6.getName();
                    var15_16 = com.github.catvod.spider.merge.C.a.c((String)var15_16);
                    var15_16.append(com.github.catvod.spider.merge.H.c.b(var8_6.getReturnType()));
                    var29_18.k(182, (String)var10_7, (String)var9_5, var15_16.toString());
                }
                var29_18.e(176);
                var29_18.h(var20_19);
                this.a(var28_15, var29_18, true);
                var29_18.m(25, 0);
                var29_18.m(25, 1);
                var29_18.m(25, 2);
                var29_18.m(25, 3);
                var29_18.m(25, var28_15.k((String)var18_22));
                var29_18.m(21, 4);
                var3_11 = var5_28 = var4_10 / 32;
                if (var4_10 != 0) {
                    var3_11 = var5_28;
                    if (var4_10 % 32 != 0) {
                        var3_11 = var5_28 + 1;
                    }
                }
                if (var3_11 == 1) {
                    var29_18.e(4);
                } else {
                    var29_18.f(16, var3_11);
                }
                var29_18.f(188, 10);
                for (var4_10 = 0; var4_10 < var3_11; ++var4_10) {
                    block83: {
                        var29_18.e(89);
                        if (var4_10 != 0) break block83;
                        var5_28 = 3;
                        ** GOTO lbl622
                    }
                    if (var4_10 == 1) {
                        var5_28 = 4;
lbl622:
                        // 2 sources

                        var29_18.e(var5_28);
                    } else {
                        var29_18.f(16, var4_10);
                    }
                    var29_18.m(21, var28_15.k(r.a("_asm_flag_", var4_10)));
                    var29_18.e(79);
                }
                var10_7 = com.github.catvod.spider.merge.H.c.f(var13_4);
                var8_6 = com.github.catvod.spider.merge.C.a.c(var19_23);
                var9_5 = com.github.catvod.spider.merge.C.c.c;
                var29_18.k(182, (String)var10_7, "parseRest", r.c((StringBuilder)var8_6, (String)var9_5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;"));
                var29_18.l(192, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.C.b.f(var28_15)));
                var29_18.e(176);
                var29_18.h((g)var14_14);
                var29_18.m(25, 0);
                var29_18.m(25, 1);
                var29_18.m(25, 2);
                var29_18.m(25, 3);
                var29_18.m(21, 4);
                var29_18.k(183, com.github.catvod.spider.merge.H.c.f(var13_4), "deserialze", s.a(var19_23, (String)var9_5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"));
                var29_18.e(176);
                var29_18.j(10, com.github.catvod.spider.merge.C.b.b(var28_15));
            }
            this.e(var27_9, new b((String)var11_8, var2_2, 4));
            var8_6 = var27_9.i();
            return (v)this.a.a((String)var12_12, (byte[])var8_6, ((com.github.catvod.spider.merge.H.e[])var8_6).length).getConstructor(new Class[]{o.class, l.class}).newInstance(new Object[]{var1_1, var2_2});
        }
        throw new IllegalArgumentException(h.e(var9_5, com.github.catvod.spider.merge.C.a.c("not support type :")));
    }
}

