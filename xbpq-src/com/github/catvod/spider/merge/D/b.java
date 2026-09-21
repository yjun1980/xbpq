/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.A.e;
import com.github.catvod.spider.merge.A.g;
import com.github.catvod.spider.merge.A.i;
import com.github.catvod.spider.merge.A.j;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.M;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.a;
import com.github.catvod.spider.merge.D.c0;
import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.D.g0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.D.k;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.c;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.y.z;
import com.github.catvod.spider.merge.z.d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class b {
    static final String c;
    static final String d;
    static final String e;
    static final String f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    protected final com.github.catvod.spider.merge.H.b a = new com.github.catvod.spider.merge.H.b();
    private final AtomicLong b = new AtomicLong();

    static {
        String string;
        c = com.github.catvod.spider.merge.H.c.f(L.class);
        d = string = com.github.catvod.spider.merge.H.c.f(X.class);
        e = s.a("L", string, ";");
        f = string = com.github.catvod.spider.merge.H.c.f(h0.class);
        g = s.a("L", string, ";");
        h = com.github.catvod.spider.merge.H.c.f(M.class);
        com.github.catvod.spider.merge.H.c.f(M.class);
        i = com.github.catvod.spider.merge.H.c.b(c0.class);
        j = com.github.catvod.spider.merge.H.c.b(g0.class);
    }

    /*
     * Unable to fully structure code
     */
    private void a(i var1_1, com.github.catvod.spider.merge.H.e var2_2, a var3_3, g var4_4) {
        block43: {
            block42: {
                block41: {
                    block40: {
                        block39: {
                            block38: {
                                block37: {
                                    block36: {
                                        block35: {
                                            block34: {
                                                block33: {
                                                    block32: {
                                                        block31: {
                                                            block30: {
                                                                block29: {
                                                                    block28: {
                                                                        block27: {
                                                                            block26: {
                                                                                block25: {
                                                                                    block24: {
                                                                                        block23: {
                                                                                            block12: {
                                                                                                block22: {
                                                                                                    block18: {
                                                                                                        block20: {
                                                                                                            block21: {
                                                                                                                block19: {
                                                                                                                    block17: {
                                                                                                                        block14: {
                                                                                                                            block16: {
                                                                                                                                block15: {
                                                                                                                                    block13: {
                                                                                                                                        if (var2_2.n) {
                                                                                                                                            var1_1.m(25, var3_3.g("out"));
                                                                                                                                            var1_1.i(i0.l.a);
                                                                                                                                            var1_1.k(182, com.github.catvod.spider.merge.D.b.f, "isEnabled", "(I)Z");
                                                                                                                                            var1_1.g(154, var4_4);
                                                                                                                                        }
                                                                                                                                        if (com.github.catvod.spider.merge.D.a.a(var3_3)) break block12;
                                                                                                                                        var8_5 = new g();
                                                                                                                                        var1_1.m(21, var3_3.g("notWriteDefaultValue"));
                                                                                                                                        var1_1.g(153, (g)var8_5);
                                                                                                                                        var7_6 = var2_2.e;
                                                                                                                                        if (var7_6 != Boolean.TYPE) break block13;
                                                                                                                                        var7_6 = "boolean";
                                                                                                                                        break block14;
                                                                                                                                    }
                                                                                                                                    if (var7_6 != Byte.TYPE) break block15;
                                                                                                                                    var7_6 = "byte";
                                                                                                                                    break block14;
                                                                                                                                }
                                                                                                                                if (var7_6 != Short.TYPE) break block16;
                                                                                                                                var7_6 = "short";
                                                                                                                                break block14;
                                                                                                                            }
                                                                                                                            if (var7_6 != Integer.TYPE) break block17;
                                                                                                                            var7_6 = "int";
                                                                                                                        }
                                                                                                                        var1_1.m(21, var3_3.g((String)var7_6));
                                                                                                                        break block18;
                                                                                                                    }
                                                                                                                    if (var7_6 != Long.TYPE) break block19;
                                                                                                                    var1_1.m(22, var3_3.g("long"));
                                                                                                                    var1_1.e(9);
                                                                                                                    var5_7 = 148;
                                                                                                                    break block20;
                                                                                                                }
                                                                                                                if (var7_6 != Float.TYPE) break block21;
                                                                                                                var1_1.m(23, var3_3.g("float"));
                                                                                                                var1_1.e(11);
                                                                                                                var5_7 = 149;
                                                                                                                break block20;
                                                                                                            }
                                                                                                            if (var7_6 != Double.TYPE) break block22;
                                                                                                            var1_1.m(24, var3_3.g("double"));
                                                                                                            var1_1.e(14);
                                                                                                            var5_7 = 151;
                                                                                                        }
                                                                                                        var1_1.e(var5_7);
                                                                                                    }
                                                                                                    var1_1.g(153, var4_4);
                                                                                                }
                                                                                                var1_1.h((g)var8_5);
                                                                                            }
                                                                                            if (com.github.catvod.spider.merge.D.a.a(var3_3)) {
                                                                                                return;
                                                                                            }
                                                                                            var7_6 = var2_2.e;
                                                                                            var1_1.m(25, 0);
                                                                                            var1_1.m(25, 1);
                                                                                            var1_1.m(25, 2);
                                                                                            var1_1.m(25, 6);
                                                                                            if (var7_6 != Byte.TYPE) break block23;
                                                                                            var1_1.m(21, var3_3.g("byte"));
                                                                                            var7_6 = "java/lang/Byte";
                                                                                            var8_5 = "(B)Ljava/lang/Byte;";
                                                                                            ** GOTO lbl105
                                                                                        }
                                                                                        if (var7_6 != Short.TYPE) break block24;
                                                                                        var1_1.m(21, var3_3.g("short"));
                                                                                        var8_5 = "(S)Ljava/lang/Short;";
                                                                                        var7_6 = "java/lang/Short";
                                                                                        ** GOTO lbl105
                                                                                    }
                                                                                    if (var7_6 != Integer.TYPE) break block25;
                                                                                    var1_1.m(21, var3_3.g("int"));
                                                                                    var8_5 = "(I)Ljava/lang/Integer;";
                                                                                    var7_6 = "java/lang/Integer";
                                                                                    ** GOTO lbl105
                                                                                }
                                                                                if (var7_6 != Character.TYPE) break block26;
                                                                                var1_1.m(21, var3_3.g("char"));
                                                                                var8_5 = "(C)Ljava/lang/Character;";
                                                                                var7_6 = "java/lang/Character";
                                                                                ** GOTO lbl105
                                                                            }
                                                                            if (var7_6 != Long.TYPE) break block27;
                                                                            var1_1.m(22, var3_3.h("long"));
                                                                            var7_6 = "java/lang/Long";
                                                                            var8_5 = "(J)Ljava/lang/Long;";
                                                                            ** GOTO lbl105
                                                                        }
                                                                        if (var7_6 != Float.TYPE) break block28;
                                                                        var1_1.m(23, var3_3.g("float"));
                                                                        var7_6 = "java/lang/Float";
                                                                        var8_5 = "(F)Ljava/lang/Float;";
                                                                        ** GOTO lbl105
                                                                    }
                                                                    if (var7_6 != Double.TYPE) break block29;
                                                                    var1_1.m(24, var3_3.h("double"));
                                                                    var7_6 = "java/lang/Double";
                                                                    var8_5 = "(D)Ljava/lang/Double;";
                                                                    ** GOTO lbl105
                                                                }
                                                                if (var7_6 == Boolean.TYPE) {
                                                                    var1_1.m(21, var3_3.g("boolean"));
                                                                    var7_6 = "java/lang/Boolean";
                                                                    var8_5 = "(Z)Ljava/lang/Boolean;";
lbl105:
                                                                    // 8 sources

                                                                    var1_1.k(184, (String)var7_6, "valueOf", (String)var8_5);
                                                                } else {
                                                                    var7_6 = var7_6 == BigDecimal.class ? "decimal" : (var7_6 == String.class ? "string" : (var7_6.isEnum() != false ? "enum" : (List.class.isAssignableFrom((Class<?>)var7_6) != false ? "list" : "object")));
                                                                    var1_1.m(25, var3_3.g((String)var7_6));
                                                                }
                                                                var9_8 = com.github.catvod.spider.merge.D.b.h;
                                                                var7_6 = com.github.catvod.spider.merge.C.a.c("(L");
                                                                var10_9 = com.github.catvod.spider.merge.D.b.c;
                                                                var1_1.k(182, var9_8, "apply", r.c((StringBuilder)var7_6, var10_9, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z"));
                                                                var1_1.g(153, var4_4);
                                                                var11_10 = new g();
                                                                var1_1.m(21, var3_3.g("hasNameFilters"));
                                                                var1_1.g(153, var11_10);
                                                                var7_6 = var2_2.e;
                                                                var1_1.m(25, 0);
                                                                var1_1.m(25, 1);
                                                                var1_1.m(25, 2);
                                                                var1_1.m(25, 6);
                                                                if (var7_6 != Byte.TYPE) break block30;
                                                                var1_1.m(21, var3_3.g("byte"));
                                                                var8_5 = "(B)Ljava/lang/Byte;";
                                                                var7_6 = "java/lang/Byte";
                                                                ** GOTO lbl168
                                                            }
                                                            if (var7_6 != Short.TYPE) break block31;
                                                            var1_1.m(21, var3_3.g("short"));
                                                            var8_5 = "(S)Ljava/lang/Short;";
                                                            var7_6 = "java/lang/Short";
                                                            ** GOTO lbl168
                                                        }
                                                        if (var7_6 != Integer.TYPE) break block32;
                                                        var1_1.m(21, var3_3.g("int"));
                                                        var8_5 = "(I)Ljava/lang/Integer;";
                                                        var7_6 = "java/lang/Integer";
                                                        ** GOTO lbl168
                                                    }
                                                    if (var7_6 != Character.TYPE) break block33;
                                                    var1_1.m(21, var3_3.g("char"));
                                                    var8_5 = "(C)Ljava/lang/Character;";
                                                    var7_6 = "java/lang/Character";
                                                    ** GOTO lbl168
                                                }
                                                if (var7_6 != Long.TYPE) break block34;
                                                var1_1.m(22, var3_3.h("long"));
                                                var7_6 = "java/lang/Long";
                                                var8_5 = "(J)Ljava/lang/Long;";
                                                ** GOTO lbl168
                                            }
                                            if (var7_6 != Float.TYPE) break block35;
                                            var1_1.m(23, var3_3.g("float"));
                                            var7_6 = "java/lang/Float";
                                            var8_5 = "(F)Ljava/lang/Float;";
                                            ** GOTO lbl168
                                        }
                                        if (var7_6 != Double.TYPE) break block36;
                                        var1_1.m(24, var3_3.h("double"));
                                        var7_6 = "java/lang/Double";
                                        var8_5 = "(D)Ljava/lang/Double;";
                                        ** GOTO lbl168
                                    }
                                    if (var7_6 == Boolean.TYPE) {
                                        var1_1.m(21, var3_3.g("boolean"));
                                        var7_6 = "java/lang/Boolean";
                                        var8_5 = "(Z)Ljava/lang/Boolean;";
lbl168:
                                        // 8 sources

                                        var1_1.k(184, (String)var7_6, "valueOf", (String)var8_5);
                                    } else {
                                        var7_6 = var7_6 == BigDecimal.class ? "decimal" : (var7_6 == String.class ? "string" : (var7_6.isEnum() != false ? "enum" : (List.class.isAssignableFrom((Class<?>)var7_6) != false ? "list" : "object")));
                                        var1_1.m(25, var3_3.g((String)var7_6));
                                    }
                                    var1_1.k(182, var9_8, "processKey", s.a("(L", var10_9, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;"));
                                    var1_1.m(58, 6);
                                    var1_1.h(var11_10);
                                    var11_10 = new g();
                                    var7_6 = var2_2.e;
                                    if (var7_6.isPrimitive()) {
                                        var8_5 = new g();
                                        var1_1.m(21, var3_3.g("checkValue"));
                                        var1_1.g(154, (g)var8_5);
                                        var1_1.e(1);
                                        var1_1.e(89);
                                        var1_1.m(58, 7);
                                        var1_1.m(58, 8);
                                        var1_1.g(167, var11_10);
                                        var1_1.h((g)var8_5);
                                    }
                                    var1_1.m(25, 0);
                                    var1_1.m(25, 1);
                                    var1_1.m(25, 0);
                                    var1_1.i(var3_3.f(var2_2.a));
                                    var8_5 = new StringBuilder();
                                    var8_5.append("(I)");
                                    var8_5.append(com.github.catvod.spider.merge.H.c.b(k.class));
                                    var1_1.k(182, var9_8, "getBeanContext", var8_5.toString());
                                    var1_1.m(25, 2);
                                    var1_1.m(25, 6);
                                    if (var7_6 != Byte.TYPE) break block37;
                                    var1_1.m(21, var3_3.g("byte"));
                                    var7_6 = "(B)Ljava/lang/Byte;";
                                    var8_5 = "java/lang/Byte";
                                    ** GOTO lbl245
                                }
                                if (var7_6 != Short.TYPE) break block38;
                                var1_1.m(21, var3_3.g("short"));
                                var7_6 = "(S)Ljava/lang/Short;";
                                var8_5 = "java/lang/Short";
                                ** GOTO lbl245
                            }
                            if (var7_6 != Integer.TYPE) break block39;
                            var1_1.m(21, var3_3.g("int"));
                            var7_6 = "(I)Ljava/lang/Integer;";
                            var8_5 = "java/lang/Integer";
                            ** GOTO lbl245
                        }
                        if (var7_6 != Character.TYPE) break block40;
                        var1_1.m(21, var3_3.g("char"));
                        var7_6 = "(C)Ljava/lang/Character;";
                        var8_5 = "java/lang/Character";
                        ** GOTO lbl245
                    }
                    if (var7_6 != Long.TYPE) break block41;
                    var1_1.m(22, var3_3.h("long"));
                    var8_5 = "java/lang/Long";
                    var7_6 = "(J)Ljava/lang/Long;";
                    ** GOTO lbl245
                }
                if (var7_6 != Float.TYPE) break block42;
                var1_1.m(23, var3_3.g("float"));
                var8_5 = "java/lang/Float";
                var7_6 = "(F)Ljava/lang/Float;";
                ** GOTO lbl245
            }
            if (var7_6 != Double.TYPE) break block43;
            var1_1.m(24, var3_3.h("double"));
            var8_5 = "java/lang/Double";
            var7_6 = "(D)Ljava/lang/Double;";
            ** GOTO lbl245
        }
        if (var7_6 == Boolean.TYPE) {
            var1_1.m(21, var3_3.g("boolean"));
            var8_5 = "java/lang/Boolean";
            var7_6 = "(Z)Ljava/lang/Boolean;";
lbl245:
            // 8 sources

            var1_1.k(184, (String)var8_5, "valueOf", (String)var7_6);
            var1_1.e(89);
            var5_7 = 58;
        } else {
            var7_6 = var7_6 == BigDecimal.class ? "decimal" : (var7_6 == String.class ? "string" : (var7_6.isEnum() != false ? "enum" : (List.class.isAssignableFrom((Class<?>)var7_6) != false ? "list" : "object")));
            var6_11 = var3_3.g((String)var7_6);
            var5_7 = 25;
            var1_1.m(25, var6_11);
            var1_1.m(58, 7);
        }
        var1_1.m(var5_7, 7);
        var7_6 = new StringBuilder();
        var7_6.append("(L");
        var7_6.append(var10_9);
        var7_6.append(";");
        var7_6.append(com.github.catvod.spider.merge.H.c.b(k.class));
        var7_6.append("Ljava/lang/Object;Ljava/lang/String;");
        var7_6.append("Ljava/lang/Object;");
        var7_6.append(")Ljava/lang/Object;");
        var1_1.k(182, var9_8, "processValue", var7_6.toString());
        var1_1.m(58, 8);
        var1_1.m(25, 7);
        var1_1.m(25, 8);
        var1_1.g(165, var11_10);
        this.j(var1_1, var2_2, var3_3, var4_4);
        var1_1.g(167, var4_4);
        var1_1.h(var11_10);
    }

    private void b(i i2, a clazz, com.github.catvod.spider.merge.H.e e2) {
        block3: {
            block4: {
                block2: {
                    Method method = e2.b;
                    i2.m(25, ((a)((Object)clazz)).g("entity"));
                    if (method == null) break block2;
                    clazz = method.getDeclaringClass();
                    int n2 = clazz.isInterface() ? 185 : 182;
                    i2.k(n2, com.github.catvod.spider.merge.H.c.f(clazz), method.getName(), com.github.catvod.spider.merge.H.c.c(method));
                    if (method.getReturnType().equals(e2.e)) break block3;
                    break block4;
                }
                clazz = e2.c;
                i2.c(180, com.github.catvod.spider.merge.H.c.f(e2.g), ((Field)((Object)clazz)).getName(), com.github.catvod.spider.merge.H.c.b(((Field)((Object)clazz)).getType()));
                if (((Field)((Object)clazz)).getType().equals(e2.e)) break block3;
            }
            i2.l(192, com.github.catvod.spider.merge.H.c.f(e2.e));
        }
    }

    private void c(a a2, i i2, com.github.catvod.spider.merge.H.e e2) {
        g g2 = new g();
        i2.m(25, 0);
        String string = com.github.catvod.spider.merge.D.a.d(a2);
        String string2 = r.c(new StringBuilder(), e2.a, "_asm_ser_");
        String string3 = e;
        i2.c(180, string, string2, string3);
        i2.g(199, g2);
        i2.m(25, 0);
        i2.m(25, 1);
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(e2.e)));
        i2.k(182, c, "getObjectWriter", com.github.catvod.spider.merge.B.e.c("(Ljava/lang/Class;)", string3));
        i2.c(181, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), e2.a, "_asm_ser_"), string3);
        i2.h(g2);
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), e2.a, "_asm_ser_"), string3);
    }

    private void d(a a2, i i2, com.github.catvod.spider.merge.H.e e2, Class<?> clazz) {
        g g2 = new g();
        i2.m(25, 0);
        String string = com.github.catvod.spider.merge.D.a.d(a2);
        String string2 = r.c(new StringBuilder(), e2.a, "_asm_list_item_ser_");
        String string3 = e;
        i2.c(180, string, string2, string3);
        i2.g(199, g2);
        i2.m(25, 0);
        i2.m(25, 1);
        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(clazz)));
        i2.k(182, c, "getObjectWriter", com.github.catvod.spider.merge.B.e.c("(Ljava/lang/Class;)", string3));
        i2.c(181, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), e2.a, "_asm_list_item_ser_"), string3);
        i2.h(g2);
        i2.m(25, 0);
        i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), e2.a, "_asm_list_item_ser_"), string3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void e(i var1_1, com.github.catvod.spider.merge.H.e var2_2, a var3_3) {
        block12: {
            block9: {
                block7: {
                    block11: {
                        block10: {
                            block8: {
                                block6: {
                                    block5: {
                                        block4: {
                                            var8_4 = var2_2.e;
                                            var10_5 = new g();
                                            var6_6 = new g();
                                            var9_7 = new g();
                                            var7_8 = new g();
                                            var1_1.h(var10_5);
                                            var2_2 = var2_2.h();
                                            var4_9 = var2_2 != null ? i0.h(var2_2.serialzeFeatures()) : 0;
                                            var2_2 = com.github.catvod.spider.merge.D.a.e((a)var3_3).d;
                                            var5_10 = var4_9;
                                            if (var2_2 != null) {
                                                var5_10 = var4_9 | i0.h(var2_2.serialzeFeatures());
                                            }
                                            if (var8_4 != String.class) break block4;
                                            var4_9 = i0.d.a;
                                            var2_2 = i0.i;
                                            ** GOTO lbl31
                                        }
                                        if (!Number.class.isAssignableFrom(var8_4)) break block5;
                                        var4_9 = i0.d.a;
                                        var2_2 = i0.j;
                                        ** GOTO lbl31
                                    }
                                    if (!Collection.class.isAssignableFrom(var8_4)) break block6;
                                    var4_9 = i0.d.a;
                                    var2_2 = i0.h;
                                    ** GOTO lbl31
                                }
                                if (Boolean.class == var8_4) {
                                    var4_9 = i0.d.a;
                                    var2_2 = i0.k;
lbl31:
                                    // 4 sources

                                    var4_9 |= var2_2.a;
                                } else {
                                    var4_9 = i0.E;
                                }
                                if ((var5_10 & var4_9) == 0) {
                                    var1_1.m(25, var3_3.g("out"));
                                    var1_1.i(var4_9);
                                    var1_1.k(182, com.github.catvod.spider.merge.D.b.f, "isEnabled", "(I)Z");
                                    var1_1.g(153, var6_6);
                                }
                                var1_1.h((g)var9_7);
                                var1_1.m(25, var3_3.g("out"));
                                var1_1.m(21, var3_3.g("seperator"));
                                var9_7 = com.github.catvod.spider.merge.D.b.f;
                                var1_1.k(182, (String)var9_7, "write", "(I)V");
                                this.i(var1_1, var3_3);
                                var1_1.m(25, var3_3.g("out"));
                                var1_1.i(var5_10);
                                if (var8_4 == String.class || var8_4 == Character.class) break block7;
                                if (!Number.class.isAssignableFrom(var8_4)) break block8;
                                var2_2 = i0.j;
                                break block9;
                            }
                            if (var8_4 != Boolean.class) break block10;
                            var2_2 = i0.k;
                            break block9;
                        }
                        if (Collection.class.isAssignableFrom(var8_4) || var8_4.isArray()) break block11;
                        var4_9 = 0;
                        break block12;
                    }
                    var2_2 = i0.h;
                    break block9;
                }
                var2_2 = i0.i;
            }
            var4_9 = var2_2.a;
        }
        var1_1.i(var4_9);
        var1_1.k(182, (String)var9_7, "writeNull", "(II)V");
        this.h(var1_1, var3_3);
        var1_1.g(167, var7_8);
        var1_1.h(var6_6);
        var1_1.h(var7_8);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private void f(i i2, com.github.catvod.spider.merge.H.e object, a a2, int n2, char c2) {
        g g2 = new g();
        this.g(i2, (com.github.catvod.spider.merge.H.e)object, a2, g2);
        this.b(i2, a2, (com.github.catvod.spider.merge.H.e)object);
        i2.m(54, n2);
        this.a(i2, (com.github.catvod.spider.merge.H.e)object, a2, g2);
        i2.m(25, a2.g("out"));
        i2.m(21, a2.g("seperator"));
        i2.m(25, 6);
        i2.m(21, n2);
        object = f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(CLjava/lang/String;");
        stringBuilder.append(c2);
        stringBuilder.append(")V");
        i2.k(182, (String)object, "writeFieldValue", stringBuilder.toString());
        this.h(i2, a2);
        i2.h(g2);
    }

    private void g(i i2, com.github.catvod.spider.merge.H.e e2, a a2, g g2) {
        if (!com.github.catvod.spider.merge.D.a.a(a2)) {
            i2.m(25, 0);
            i2.m(25, 1);
            i2.m(25, 2);
            i2.m(25, 6);
            String string = h;
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("(L");
            String string2 = c;
            i2.k(182, string, "applyName", r.c(stringBuilder, string2, ";Ljava/lang/Object;Ljava/lang/String;)Z"));
            i2.g(153, g2);
            i2.m(25, 0);
            i2.m(25, 1);
            i2.i(e2.k);
            stringBuilder = new StringBuilder();
            stringBuilder.append("(L");
            stringBuilder.append(string2);
            stringBuilder.append(";Ljava/lang/String;)Z");
            i2.k(182, string, "applyLabel", stringBuilder.toString());
            i2.g(153, g2);
        }
        if (e2.c == null) {
            i2.m(25, a2.g("out"));
            i2.i(i0.y.a);
            i2.k(182, f, "isEnabled", "(I)Z");
            i2.g(154, g2);
        }
    }

    private void h(i i2, a a2) {
        i2.m(16, 44);
        i2.m(54, a2.g("seperator"));
    }

    private void i(i i2, a object) {
        String string;
        String string2;
        boolean bl = com.github.catvod.spider.merge.D.a.a((a)object);
        i2.m(25, ((a)object).g("out"));
        i2.m(25, 6);
        if (bl) {
            string2 = f;
            object = "writeFieldNameDirect";
            string = "(Ljava/lang/String;)V";
        } else {
            i2.e(3);
            string2 = f;
            object = "writeFieldName";
            string = "(Ljava/lang/String;Z)V";
        }
        i2.k(182, string2, (String)object, string);
    }

    private void j(i i2, com.github.catvod.spider.merge.H.e object, a a2, g object2) {
        int n2;
        String string = ((com.github.catvod.spider.merge.H.e)object).s;
        Object object3 = ((com.github.catvod.spider.merge.H.e)object).e;
        g g2 = new g();
        if (com.github.catvod.spider.merge.D.a.a(a2)) {
            i2.m(25, a2.g("object"));
        } else {
            i2.m(25, 8);
        }
        i2.e(89);
        i2.m(58, a2.g("object"));
        i2.g(199, g2);
        this.e(i2, (com.github.catvod.spider.merge.H.e)object, a2);
        i2.g(167, (g)object2);
        i2.h(g2);
        i2.m(25, a2.g("out"));
        i2.m(21, a2.g("seperator"));
        i2.k(182, f, "write", "(I)V");
        this.i(i2, a2);
        g2 = new g();
        g g3 = new g();
        if (Modifier.isPublic(((Class)object3).getModifiers()) && !o.i(object3)) {
            i2.m(25, a2.g("object"));
            i2.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object3)));
            i2.g(166, g3);
            this.c(a2, i2, (com.github.catvod.spider.merge.H.e)object);
            object3 = com.github.catvod.spider.merge.C.a.b(i2, 58, a2.g("fied_ser"));
            g g4 = new g();
            i2.m(25, a2.g("fied_ser"));
            String string2 = h;
            i2.l(193, string2);
            i2.g(153, (g)object3);
            int n3 = ((com.github.catvod.spider.merge.H.e)object).i;
            n2 = (i0.p.a & n3) != 0 ? 1 : 0;
            n3 = (i0.u.a & n3) != 0 ? 1 : 0;
            object2 = !(n2 != 0 || com.github.catvod.spider.merge.D.a.c(a2) && com.github.catvod.spider.merge.D.a.a(a2)) ? (n3 != 0 ? "writeAsArray" : "write") : (n3 != 0 ? "writeAsArrayNonContext" : "writeDirectNonContext");
            i2.m(25, a2.g("fied_ser"));
            i2.l(192, string2);
            i2.m(25, 1);
            i2.m(25, a2.g("object"));
            i2.m(25, 6);
            i2.m(25, 0);
            i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), ((com.github.catvod.spider.merge.H.e)object).a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            i2.i(((com.github.catvod.spider.merge.H.e)object).i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(L");
            String string3 = c;
            i2.k(182, string2, (String)object2, r.c(stringBuilder, string3, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            i2.g(167, g4);
            i2.h((g)object3);
            i2.m(25, a2.g("fied_ser"));
            i2.m(25, 1);
            i2.m(25, a2.g("object"));
            i2.m(25, 6);
            i2.m(25, 0);
            i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), ((com.github.catvod.spider.merge.H.e)object).a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            i2.i(((com.github.catvod.spider.merge.H.e)object).i);
            i2.k(185, d, "write", s.a("(L", string3, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            i2.h(g4);
            i2.g(167, g2);
        }
        i2.h(g3);
        i2.m(25, 1);
        n2 = com.github.catvod.spider.merge.D.a.a(a2) ? a2.g("object") : 8;
        i2.m(25, n2);
        if (string != null) {
            i2.i(string);
            i2.k(182, c, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            i2.m(25, 6);
            object2 = ((com.github.catvod.spider.merge.H.e)object).f;
            if (object2 instanceof Class && ((Class)object2).isPrimitive()) {
                object = c;
                object2 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
            } else {
                if (((com.github.catvod.spider.merge.H.e)object).e == String.class) {
                    i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(String.class)));
                } else {
                    i2.m(25, 0);
                    i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), ((com.github.catvod.spider.merge.H.e)object).a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                }
                i2.i(((com.github.catvod.spider.merge.H.e)object).i);
                object = c;
                object2 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
            }
            i2.k(182, (String)object, "writeWithFieldName", (String)object2);
        }
        i2.h(g2);
        this.h(i2, a2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Enabled aggressive block sorting
     */
    private void l(i i2, com.github.catvod.spider.merge.H.e[] eArray, a a2) {
        Object object = new g();
        i2.m(25, 1);
        i2.m(25, 0);
        Object object2 = c;
        i2.k(182, (String)object2, "hasPropertyFilters", r.c(com.github.catvod.spider.merge.C.a.c("("), j, ")Z"));
        i2.g(154, (g)object);
        i2.m(25, 0);
        i2.m(25, 1);
        i2.m(25, 2);
        i2.m(25, 3);
        i2.m(25, 4);
        i2.m(21, 5);
        Object object3 = h;
        String string = "(L";
        String string2 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        i2.k(183, (String)object3, "writeNoneASM", s.a("(L", (String)object2, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
        i2.e(177);
        i2.h((g)object);
        object2 = "out";
        i2.m(25, a2.g("out"));
        i2.m(16, 91);
        object = f;
        object3 = "(I)V";
        i2.k(182, (String)object, "write", "(I)V");
        int n2 = eArray.length;
        if (n2 == 0) {
            i2.m(25, a2.g("out"));
            i2.m(16, 93);
            i2.k(182, (String)object, "write", "(I)V");
            return;
        }
        int n3 = 0;
        Object object4 = this;
        while (true) {
            block36: {
                block40: {
                    com.github.catvod.spider.merge.H.e e2;
                    int n4;
                    block24: {
                        Object object5;
                        g g2;
                        Object object6;
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        block37: {
                            block39: {
                                block38: {
                                    block35: {
                                        block34: {
                                            block30: {
                                                block26: {
                                                    block33: {
                                                        block32: {
                                                            block31: {
                                                                block29: {
                                                                    block28: {
                                                                        block27: {
                                                                            block25: {
                                                                                if (n3 >= n2) {
                                                                                    return;
                                                                                }
                                                                                n4 = n3 == n2 - 1 ? 93 : 44;
                                                                                e2 = eArray[n3];
                                                                                object = e2.e;
                                                                                i2.i(e2.a);
                                                                                i2.m(58, 6);
                                                                                if (object == Byte.TYPE || object == Short.TYPE || object == Integer.TYPE) break block24;
                                                                                if (object != Long.TYPE) break block25;
                                                                                i2.m(25, a2.g((String)object2));
                                                                                i2.e(89);
                                                                                ((b)object4).b(i2, a2, e2);
                                                                                object = f;
                                                                                object10 = "writeLong";
                                                                                object9 = "(J)V";
                                                                                break block26;
                                                                            }
                                                                            if (object != Float.TYPE) break block27;
                                                                            i2.m(25, a2.g((String)object2));
                                                                            i2.e(89);
                                                                            ((b)object4).b(i2, a2, e2);
                                                                            i2.e(4);
                                                                            object = f;
                                                                            object10 = "writeFloat";
                                                                            object9 = "(FZ)V";
                                                                            break block26;
                                                                        }
                                                                        if (object != Double.TYPE) break block28;
                                                                        i2.m(25, a2.g((String)object2));
                                                                        i2.e(89);
                                                                        ((b)object4).b(i2, a2, e2);
                                                                        i2.e(4);
                                                                        object = f;
                                                                        object10 = "writeDouble";
                                                                        object9 = "(DZ)V";
                                                                        break block26;
                                                                    }
                                                                    if (object != Boolean.TYPE) break block29;
                                                                    i2.m(25, a2.g((String)object2));
                                                                    i2.e(89);
                                                                    ((b)object4).b(i2, a2, e2);
                                                                    object = f;
                                                                    i2.k(182, (String)object, "write", "(Z)V");
                                                                    break block30;
                                                                }
                                                                if (object != Character.TYPE) break block31;
                                                                i2.m(25, a2.g((String)object2));
                                                                ((b)object4).b(i2, a2, e2);
                                                                i2.k(184, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                                                                break block32;
                                                            }
                                                            if (object != String.class) break block33;
                                                            i2.m(25, a2.g((String)object2));
                                                            ((b)object4).b(i2, a2, e2);
                                                        }
                                                        i2.m(16, n4);
                                                        i2.k(182, f, "writeString", "(Ljava/lang/String;C)V");
                                                        break block34;
                                                    }
                                                    if (!((Class)object).isEnum()) break block35;
                                                    i2.m(25, a2.g((String)object2));
                                                    i2.e(89);
                                                    super.b(i2, a2, e2);
                                                    object = f;
                                                    object10 = "writeEnum";
                                                    object9 = "(Ljava/lang/Enum;)V";
                                                }
                                                i2.k(182, (String)object, (String)object10, (String)object9);
                                            }
                                            i2.m(16, n4);
                                            i2.k(182, (String)object, "write", (String)object3);
                                        }
                                        object = object2;
                                        object2 = object3;
                                        object3 = object;
                                        break block36;
                                    }
                                    if (!List.class.isAssignableFrom((Class<?>)object)) break block37;
                                    object = e2.f;
                                    object10 = object instanceof Class ? Object.class : ((ParameterizedType)object).getActualTypeArguments()[0];
                                    if (!(object10 instanceof Class)) break block38;
                                    object9 = object = (Class)object10;
                                    if (object != Object.class) break block39;
                                }
                                object9 = null;
                            }
                            super.b(i2, a2, e2);
                            i2.l(192, "java/util/List");
                            i2.m(58, a2.g("list"));
                            if (object9 == String.class && com.github.catvod.spider.merge.D.a.a(a2)) {
                                i2.m(25, a2.g((String)object2));
                                i2.m(25, a2.g("list"));
                                i2.k(182, f, "write", "(Ljava/util/List;)V");
                                object = object2;
                                object = object3;
                            } else {
                                object8 = new g();
                                object = new g();
                                i2.m(25, a2.g("list"));
                                i2.g(199, (g)object);
                                i2.m(25, a2.g((String)object2));
                                object7 = f;
                                i2.k(182, (String)object7, "writeNull", "()V");
                                i2.g(167, (g)object8);
                                i2.h((g)object);
                                i2.m(25, a2.g("list"));
                                i2.k(185, "java/util/List", "size", "()I");
                                i2.m(54, a2.g("size"));
                                i2.m(25, a2.g((String)object2));
                                i2.m(16, 91);
                                i2.k(182, (String)object7, "write", (String)object3);
                                object6 = new g();
                                object = new g();
                                g2 = new g();
                                i2.e(3);
                                i2.m(54, a2.g("i"));
                                i2.h((g)object6);
                                i2.m(21, a2.g("i"));
                                i2.m(21, a2.g("size"));
                                i2.g(162, g2);
                                i2.m(21, a2.g("i"));
                                i2.g(153, (g)object);
                                i2.m(25, a2.g((String)object2));
                                i2.m(16, 44);
                                i2.k(182, (String)object7, "write", (String)object3);
                                i2.h((g)object);
                                i2.m(25, a2.g("list"));
                                i2.m(21, a2.g("i"));
                                i2.k(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                object5 = com.github.catvod.spider.merge.C.a.b(i2, 58, a2.g("list_item"));
                                object = new g();
                                i2.m(25, a2.g("list_item"));
                                i2.g(199, (g)object);
                                i2.m(25, a2.g((String)object2));
                                i2.k(182, (String)object7, "writeNull", "()V");
                                i2.g(167, (g)object5);
                                i2.h((g)object);
                                object = new g();
                                g g3 = new g();
                                if (object9 != null && Modifier.isPublic(((Class)object9).getModifiers())) {
                                    i2.m(25, a2.g("list_item"));
                                    i2.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                    i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object9)));
                                    i2.g(166, g3);
                                    super.d(a2, i2, e2, (Class<?>)object9);
                                    object4 = com.github.catvod.spider.merge.C.a.b(i2, 58, a2.g("list_item_desc"));
                                    g g4 = new g();
                                    if (com.github.catvod.spider.merge.D.a.a(a2)) {
                                        i2.m(25, a2.g("list_item_desc"));
                                        String string3 = h;
                                        i2.l(193, string3);
                                        i2.g(153, (g)object4);
                                        i2.m(25, a2.g("list_item_desc"));
                                        i2.l(192, string3);
                                        i2.m(25, 1);
                                        i2.m(25, a2.g("list_item"));
                                        if (com.github.catvod.spider.merge.D.a.c(a2)) {
                                            i2.e(1);
                                        } else {
                                            i2.m(21, a2.g("i"));
                                            i2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                        }
                                        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object9)));
                                        i2.i(e2.i);
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(string);
                                        i2.k(182, string3, "writeAsArrayNonContext", r.c(stringBuilder, c, string2));
                                        i2.g(167, g4);
                                        i2.h((g)object4);
                                    }
                                    i2.m(25, a2.g("list_item_desc"));
                                    i2.m(25, 1);
                                    i2.m(25, a2.g("list_item"));
                                    if (com.github.catvod.spider.merge.D.a.c(a2)) {
                                        i2.e(1);
                                    } else {
                                        i2.m(21, a2.g("i"));
                                        i2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object9)));
                                    i2.i(e2.i);
                                    i2.k(185, d, "write", r.c(com.github.catvod.spider.merge.C.a.c(string), c, string2));
                                    i2.h(g4);
                                    object4 = object;
                                    i2.g(167, (g)object4);
                                } else {
                                    object4 = object;
                                }
                                object4 = object;
                                i2.h(g3);
                                i2.m(25, 1);
                                i2.m(25, a2.g("list_item"));
                                if (com.github.catvod.spider.merge.D.a.c(a2)) {
                                    i2.e(1);
                                } else {
                                    i2.m(21, a2.g("i"));
                                    i2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                }
                                if (object9 != null && Modifier.isPublic(((Class)object9).getModifiers())) {
                                    i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b((Class)object10)));
                                    i2.i(e2.i);
                                    object = c;
                                    object10 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                } else {
                                    object = c;
                                    object10 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                }
                                i2.k(182, (String)object, "writeWithFieldName", (String)object10);
                                i2.h((g)object4);
                                i2.h((g)object5);
                                i2.d(a2.g("i"));
                                i2.g(167, (g)object6);
                                i2.h(g2);
                                object = object2;
                                i2.m(25, a2.g((String)object));
                                i2.m(16, 93);
                                object = object3;
                                i2.k(182, (String)object7, "write", (String)object);
                                i2.h((g)object8);
                            }
                            object = object2;
                            i2.m(25, a2.g((String)object));
                            i2.m(16, n4);
                            i2.k(182, f, "write", (String)object3);
                            object2 = object3;
                            object3 = object;
                            break block40;
                        }
                        object4 = new g();
                        object10 = new g();
                        this.b(i2, a2, e2);
                        i2.e(89);
                        object9 = new StringBuilder();
                        ((StringBuilder)object9).append("field_");
                        i2.m(58, a2.g(com.github.catvod.spider.merge.B.h.e(e2.e, (StringBuilder)object9)));
                        i2.g(199, (g)object10);
                        i2.m(25, a2.g((String)object2));
                        object9 = f;
                        i2.k(182, (String)object9, "writeNull", "()V");
                        i2.g(167, (g)object4);
                        i2.h((g)object10);
                        object7 = new g();
                        object10 = new g();
                        object8 = com.github.catvod.spider.merge.C.a.c("field_");
                        i2.m(25, a2.g(com.github.catvod.spider.merge.B.h.e(e2.e, (StringBuilder)object8)));
                        i2.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object)));
                        i2.g(166, (g)object10);
                        this.c(a2, i2, e2);
                        object8 = com.github.catvod.spider.merge.C.a.b(i2, 58, a2.g("fied_ser"));
                        g2 = new g();
                        if (com.github.catvod.spider.merge.D.a.a(a2) && Modifier.isPublic(((Class)object).getModifiers())) {
                            i2.m(25, a2.g("fied_ser"));
                            object6 = h;
                            i2.l(193, (String)object6);
                            i2.g(153, (g)object8);
                            i2.m(25, a2.g("fied_ser"));
                            i2.l(192, (String)object6);
                            i2.m(25, 1);
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append("field_");
                            i2.m(25, a2.g(com.github.catvod.spider.merge.B.h.e(e2.e, (StringBuilder)object5)));
                            i2.m(25, 6);
                            i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object)));
                            i2.i(e2.i);
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append(string);
                            i2.k(182, (String)object6, "writeAsArrayNonContext", r.c((StringBuilder)object5, c, string2));
                            i2.g(167, g2);
                            i2.h((g)object8);
                        }
                        i2.m(25, a2.g("fied_ser"));
                        i2.m(25, 1);
                        object8 = new StringBuilder();
                        ((StringBuilder)object8).append("field_");
                        i2.m(25, a2.g(com.github.catvod.spider.merge.B.h.e(e2.e, (StringBuilder)object8)));
                        i2.m(25, 6);
                        i2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(object)));
                        i2.i(e2.i);
                        object6 = d;
                        object = com.github.catvod.spider.merge.C.a.c(string);
                        object8 = c;
                        i2.k(185, (String)object6, "write", r.c((StringBuilder)object, (String)object8, string2));
                        i2.h(g2);
                        i2.g(167, (g)object7);
                        i2.h((g)object10);
                        object10 = e2.s;
                        i2.m(25, 1);
                        object = new StringBuilder();
                        ((StringBuilder)object).append("field_");
                        i2.m(25, a2.g(com.github.catvod.spider.merge.B.h.e(e2.e, (StringBuilder)object)));
                        if (object10 != null) {
                            i2.i(object10);
                            object = "writeWithFormat";
                            object10 = "(Ljava/lang/Object;Ljava/lang/String;)V";
                        } else {
                            i2.m(25, 6);
                            object = e2.f;
                            if (object instanceof Class && ((Class)object).isPrimitive()) {
                                object10 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                object = "writeWithFieldName";
                            } else {
                                i2.m(25, 0);
                                i2.c(180, com.github.catvod.spider.merge.D.a.d(a2), r.c(new StringBuilder(), e2.a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                                i2.i(e2.i);
                                object10 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                object = "writeWithFieldName";
                            }
                        }
                        i2.k(182, (String)object8, (String)object, (String)object10);
                        i2.h((g)object7);
                        i2.h((g)object4);
                        object = object2;
                        i2.m(25, a2.g((String)object));
                        i2.m(16, n4);
                        i2.k(182, (String)object9, "write", (String)object3);
                        object2 = object3;
                        object3 = object;
                        break block40;
                    }
                    object = object2;
                    i2.m(25, a2.g((String)object));
                    i2.e(89);
                    this.b(i2, a2, e2);
                    object2 = f;
                    i2.k(182, (String)object2, "writeInt", (String)object3);
                    i2.m(16, n4);
                    i2.k(182, (String)object2, "write", (String)object3);
                    object2 = object3;
                    object3 = object;
                }
                object4 = this;
            }
            object = object2;
            ++n3;
            object2 = object3;
            object3 = object;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void m(Class<?> var1_1, i var2_2, com.github.catvod.spider.merge.H.e[] var3_3, a var4_4) {
        var21_5 = new g();
        var8_6 = var3_3 /* !! */ .length;
        var9_7 = com.github.catvod.spider.merge.D.a.a(var4_4);
        var10_8 /* !! */  = "write";
        var17_9 = "(L";
        var11_10 = "out";
        if (!var9_7) {
            block51: {
                var12_11 = new g();
                var1_1 = new g();
                var2_2.m(25, var4_4.g("out"));
                var2_2.i(i0.n.a);
                var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "isEnabled", "(I)Z");
                var2_2.g(154, (g)var1_1);
                var6_12 = var3_3 /* !! */ .length;
                for (var7_13 = 0; var7_13 < var6_12; ++var7_13) {
                    if (var3_3 /* !! */ [var7_13].b == null) continue;
                    var6_12 = 1;
                    break block51;
                }
                var6_12 = 0;
            }
            if (var6_12 != 0) {
                var2_2.m(25, var4_4.g("out"));
                var2_2.i(i0.A.a);
                var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "isEnabled", "(I)Z");
                var6_12 = 153;
            } else {
                var6_12 = 167;
            }
            var2_2.g(var6_12, (g)var12_11);
            var2_2.h((g)var1_1);
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(25, 3);
            var2_2.m(25, 4);
            var2_2.m(21, 5);
            var2_2.k(183, com.github.catvod.spider.merge.D.b.h, "write", r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            var2_2.e(177);
            var2_2.h((g)var12_11);
        }
        if (!com.github.catvod.spider.merge.D.a.c(var4_4)) {
            var1_1 = new g();
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(21, 5);
            var2_2.k(182, com.github.catvod.spider.merge.D.b.h, "writeReference", r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;I)Z"));
            var2_2.g(153, (g)var1_1);
            var2_2.e(177);
            var2_2.h((g)var1_1);
        }
        var1_1 = com.github.catvod.spider.merge.D.a.a(var4_4) ? (com.github.catvod.spider.merge.D.a.c(var4_4) ? "writeAsArrayNonContext" : "writeAsArray") : "writeAsArrayNormal";
        var6_12 = com.github.catvod.spider.merge.D.a.e((a)var4_4).g;
        var13_14 /* !! */  = i0.u;
        if ((var6_12 & var13_14 /* !! */ .a) == 0) {
            var12_11 = new g();
            var2_2.m(25, var4_4.g("out"));
            var2_2.i(var13_14 /* !! */ .a);
            var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "isEnabled", "(I)Z");
            var2_2.g(153, (g)var12_11);
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(25, 3);
            var2_2.m(25, 4);
            var2_2.m(21, 5);
            var2_2.k(182, com.github.catvod.spider.merge.D.a.d(var4_4), (String)var1_1, r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            var2_2.e(177);
            var2_2.h((g)var12_11);
        } else {
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(25, 3);
            var2_2.m(25, 4);
            var2_2.m(21, 5);
            var2_2.k(182, com.github.catvod.spider.merge.D.a.d(var4_4), (String)var1_1, r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            var2_2.e(177);
        }
        var9_7 = com.github.catvod.spider.merge.D.a.c(var4_4);
        var12_11 = "(";
        if (!var9_7) {
            var2_2.m(25, 1);
            var13_14 /* !! */  = com.github.catvod.spider.merge.D.b.c;
            var14_15 /* !! */  = com.github.catvod.spider.merge.C.a.c("()");
            var1_1 = com.github.catvod.spider.merge.D.b.i;
            var14_15 /* !! */ .append((String)var1_1);
            var2_2.k(182, (String)var13_14 /* !! */ , "getContext", var14_15 /* !! */ .toString());
            var2_2.m(58, var4_4.g("parent"));
            var2_2.m(25, 1);
            var2_2.m(25, var4_4.g("parent"));
            var2_2.m(25, 2);
            var2_2.m(25, 3);
            var2_2.i(com.github.catvod.spider.merge.D.a.e((a)var4_4).g);
            var14_15 /* !! */  = new StringBuilder();
            var14_15 /* !! */ .append("(");
            var14_15 /* !! */ .append((String)var1_1);
            var14_15 /* !! */ .append("Ljava/lang/Object;Ljava/lang/Object;I)V");
            var2_2.k(182, (String)var13_14 /* !! */ , "setContext", var14_15 /* !! */ .toString());
        }
        var6_12 = (com.github.catvod.spider.merge.D.a.e((a)var4_4).g & i0.o.a) != 0 ? 1 : 0;
        var14_15 /* !! */  = "(I)V";
        if (var6_12 == 0 && com.github.catvod.spider.merge.D.a.a(var4_4)) {
            var2_2.m(16, 123);
        } else {
            var1_1 = new g();
            var13_14 /* !! */  = new g();
            var15_16 /* !! */  = new g();
            if (var6_12 == 0) {
                var2_2.m(25, 1);
                var2_2.m(25, 4);
                var2_2.m(25, 2);
                var2_2.k(182, com.github.catvod.spider.merge.D.b.c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                var2_2.g(153, (g)var13_14 /* !! */ );
            }
            var2_2.m(25, 4);
            var2_2.m(25, 2);
            var2_2.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            var2_2.g(165, (g)var13_14 /* !! */ );
            var2_2.h((g)var15_16 /* !! */ );
            var2_2.m(25, var4_4.g("out"));
            var2_2.m(16, 123);
            var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "write", "(I)V");
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            if (com.github.catvod.spider.merge.D.a.e((a)var4_4).c != null) {
                var2_2.i(com.github.catvod.spider.merge.D.a.e((a)var4_4).c);
            } else {
                var2_2.e(1);
            }
            var2_2.m(25, 2);
            var2_2.k(182, com.github.catvod.spider.merge.D.b.h, "writeClassName", r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/String;Ljava/lang/Object;)V"));
            var2_2.m(16, 44);
            var2_2.g(167, (g)var1_1);
            var2_2.h((g)var13_14 /* !! */ );
            var2_2.m(16, 123);
            var2_2.h((g)var1_1);
        }
        var13_14 /* !! */  = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        var16_17 = "seperator";
        var2_2.m(54, var4_4.g("seperator"));
        if (!com.github.catvod.spider.merge.D.a.a(var4_4)) {
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(21, var4_4.g("seperator"));
            var2_2.k(182, com.github.catvod.spider.merge.D.b.h, "writeBefore", r.c(com.github.catvod.spider.merge.C.a.c("(L"), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;C)C"));
            var2_2.m(54, var4_4.g("seperator"));
        }
        if (!com.github.catvod.spider.merge.D.a.a(var4_4)) {
            var2_2.m(25, var4_4.g("out"));
            var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "isNotWriteDefaultValue", "()Z");
            var2_2.m(54, var4_4.g("notWriteDefaultValue"));
            var2_2.m(25, 1);
            var2_2.m(25, 0);
            var1_1 = com.github.catvod.spider.merge.D.b.c;
            var18_18 = com.github.catvod.spider.merge.C.a.c("(");
            var15_16 /* !! */  = com.github.catvod.spider.merge.D.b.j;
            var2_2.k(182, (String)var1_1, "checkValue", r.c((StringBuilder)var18_18, (String)var15_16 /* !! */ , ")Z"));
            var2_2.m(54, var4_4.g("checkValue"));
            var2_2.m(25, 1);
            var2_2.m(25, 0);
            var2_2.k(182, (String)var1_1, "hasNameFilters", z.b(new StringBuilder(), "(", (String)var15_16 /* !! */ , ")Z"));
            var2_2.m(54, var4_4.g("hasNameFilters"));
        }
        var1_1 = var10_8 /* !! */ ;
        var6_12 = var8_6;
        var10_8 /* !! */  = var14_15 /* !! */ ;
        for (var7_13 = 0; var7_13 < var6_12; ++var7_13) {
            block53: {
                block52: {
                    block58: {
                        block57: {
                            block55: {
                                block56: {
                                    block54: {
                                        var14_15 /* !! */  = var3_3 /* !! */ [var7_13];
                                        var20_21 = var14_15 /* !! */ .e;
                                        var2_2.i(var14_15 /* !! */ .a);
                                        var2_2.m(58, 6);
                                        if (var20_21 == Byte.TYPE || var20_21 == Short.TYPE || var20_21 == Integer.TYPE) break block53;
                                        var18_18 = Long.TYPE;
                                        var15_16 /* !! */  = "writeFieldValue";
                                        if (var20_21 != var18_18) break block54;
                                        var15_16 /* !! */  = new g();
                                        this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                        this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                                        var2_2.m(55, var4_4.h("long"));
                                        this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                        var2_2.m(25, var4_4.g(var11_10));
                                        var2_2.m(21, var4_4.g(var16_17));
                                        var2_2.m(25, 6);
                                        var2_2.m(22, var4_4.h("long"));
                                        var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "writeFieldValue", "(CLjava/lang/String;J)V");
                                        this.h(var2_2, var4_4);
                                        var2_2.h((g)var15_16 /* !! */ );
                                        break block55;
                                    }
                                    if (var20_21 != Float.TYPE) break block56;
                                    var15_16 /* !! */  = new g();
                                    this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                    this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                                    var2_2.m(56, var4_4.g("float"));
                                    this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                    var2_2.m(25, var4_4.g(var11_10));
                                    var2_2.m(21, var4_4.g(var16_17));
                                    var2_2.m(25, 6);
                                    var2_2.m(23, var4_4.g("float"));
                                    var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "writeFieldValue", "(CLjava/lang/String;F)V");
                                    this.h(var2_2, var4_4);
                                    var2_2.h((g)var15_16 /* !! */ );
                                    break block55;
                                }
                                if (var20_21 != Double.TYPE) break block57;
                                var15_16 /* !! */  = new g();
                                this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                                var2_2.m(57, var4_4.h("double"));
                                this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                                var2_2.m(25, var4_4.g(var11_10));
                                var2_2.m(21, var4_4.g(var16_17));
                                var2_2.m(25, 6);
                                var2_2.m(24, var4_4.h("double"));
                                var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "writeFieldValue", "(CLjava/lang/String;D)V");
                                this.h(var2_2, var4_4);
                                var2_2.h((g)var15_16 /* !! */ );
                            }
                            var14_15 /* !! */  = var10_8 /* !! */ ;
                            var14_15 /* !! */  = var12_11;
lbl217:
                            // 2 sources

                            while (true) {
                                var14_15 /* !! */  = var12_11;
                                var14_15 /* !! */  = var10_8 /* !! */ ;
                                var14_15 /* !! */  = var1_1;
                                var14_15 /* !! */  = var11_10;
                                break block52;
                                break;
                            }
                        }
                        if (var20_21 == Boolean.TYPE) {
                            var8_6 = var4_4.g("boolean");
                            var5_19 = 90;
lbl227:
                            // 2 sources

                            while (true) {
                                this.f(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, var8_6, (char)var5_19);
lbl229:
                                // 3 sources

                                while (true) {
                                    var14_15 /* !! */  = var12_11;
                                    var14_15 /* !! */  = var10_8 /* !! */ ;
                                    ** continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var19_20 = var10_8 /* !! */ ;
                        var18_18 = var12_11;
                        if (var20_21 == Character.TYPE) {
                            var8_6 = var4_4.g("char");
                            var5_19 = 67;
                            ** continue;
                        }
                        if (var20_21 != String.class) break block58;
                        var19_20 = new g();
                        if (var14_15 /* !! */ .a.equals(com.github.catvod.spider.merge.D.a.e((a)var4_4).c)) {
                            var2_2.m(25, 1);
                            var2_2.m(25, 4);
                            var2_2.m(25, 2);
                            var2_2.k(182, com.github.catvod.spider.merge.D.b.c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                            var2_2.g(154, (g)var19_20);
                        }
                        this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var19_20);
                        this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                        var2_2.m(58, var4_4.g("string"));
                        this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var19_20);
                        var18_18 = new g();
                        var20_21 = new g();
                        var2_2.m(25, var4_4.g("string"));
                        var2_2.g(199, (g)var18_18);
                        this.e(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4);
                        var2_2.g(167, (g)var20_21);
                        var2_2.h((g)var18_18);
                        if ("trim".equals(var14_15 /* !! */ .s)) {
                            var2_2.m(25, var4_4.g("string"));
                            var2_2.k(182, "java/lang/String", "trim", "()Ljava/lang/String;");
                            var2_2.m(58, var4_4.g("string"));
                        }
                        if (com.github.catvod.spider.merge.D.a.a(var4_4)) {
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.m(21, var4_4.g(var16_17));
                            var2_2.m(25, 6);
                            var2_2.m(25, var4_4.g("string"));
                            var15_16 /* !! */  = com.github.catvod.spider.merge.D.b.f;
                            var14_15 /* !! */  = "writeFieldValueStringWithDoubleQuoteCheck";
                        } else {
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.m(21, var4_4.g(var16_17));
                            var2_2.m(25, 6);
                            var2_2.m(25, var4_4.g("string"));
                            var18_18 = com.github.catvod.spider.merge.D.b.f;
                            var14_15 /* !! */  = var15_16 /* !! */ ;
                            var15_16 /* !! */  = var18_18;
                        }
                        var2_2.k(182, (String)var15_16 /* !! */ , (String)var14_15 /* !! */ , "(CLjava/lang/String;Ljava/lang/String;)V");
                        this.h(var2_2, var4_4);
                        var2_2.h((g)var20_21);
                        var2_2.h((g)var19_20);
                        ** GOTO lbl229
                    }
                    if (var20_21 == BigDecimal.class) {
                        var15_16 /* !! */  = new g();
                        this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                        this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                        var2_2.m(58, var4_4.g("decimal"));
                        this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                        var19_20 = new g();
                        var18_18 = new g();
                        var20_21 = new g();
                        var2_2.h((g)var19_20);
                        var2_2.m(25, var4_4.g("decimal"));
                        var2_2.g(199, (g)var18_18);
                        this.e(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4);
                        var2_2.g(167, (g)var20_21);
                        var2_2.h((g)var18_18);
                        var2_2.m(25, var4_4.g(var11_10));
                        var2_2.m(21, var4_4.g(var16_17));
                        var2_2.m(25, 6);
                        var2_2.m(25, var4_4.g("decimal"));
                        var2_2.k(182, com.github.catvod.spider.merge.D.b.f, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
                        this.h(var2_2, var4_4);
                        var2_2.g(167, (g)var20_21);
                        var2_2.h((g)var20_21);
                        var2_2.h((g)var15_16 /* !! */ );
                        ** continue;
                    }
                    if (List.class.isAssignableFrom((Class<?>)var20_21)) {
                        var26_26 = A.L(var14_15 /* !! */ .f);
                        var9_7 = var26_26 instanceof Class;
                        var20_21 = null;
                        var15_16 /* !! */  = var9_7 != false ? (Class)var26_26 : null;
                        var18_18 = var20_21;
                        if (var15_16 /* !! */  != Object.class) {
                            var18_18 = var15_16 /* !! */  == Serializable.class ? var20_21 : var15_16 /* !! */ ;
                        }
                        var23_23 = new g();
                        var15_16 /* !! */  = new g();
                        var22_22 = new g();
                        this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var23_23);
                        this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                        var2_2.l(192, "java/util/List");
                        var2_2.m(58, var4_4.g("list"));
                        this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var23_23);
                        var2_2.m(25, var4_4.g("list"));
                        var2_2.g(199, (g)var15_16 /* !! */ );
                        this.e(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4);
                        var2_2.g(167, var22_22);
                        var2_2.h((g)var15_16 /* !! */ );
                        var2_2.m(25, var4_4.g(var11_10));
                        var2_2.m(21, var4_4.g(var16_17));
                        var25_25 = com.github.catvod.spider.merge.D.b.f;
                        var2_2.k(182, var25_25, (String)var1_1, (String)var19_20);
                        this.i(var2_2, var4_4);
                        var2_2.m(25, var4_4.g("list"));
                        var2_2.k(185, "java/util/List", "size", "()I");
                        var15_16 /* !! */  = com.github.catvod.spider.merge.C.a.b(var2_2, 54, var4_4.g("size"));
                        var24_24 = new g();
                        var2_2.m(21, var4_4.g("size"));
                        var2_2.e(3);
                        var2_2.g(160, (g)var15_16 /* !! */ );
                        var2_2.m(25, var4_4.g(var11_10));
                        var2_2.i("[]");
                        var2_2.k(182, var25_25, (String)var1_1, "(Ljava/lang/String;)V");
                        var2_2.g(167, var24_24);
                        var2_2.h((g)var15_16 /* !! */ );
                        if (!com.github.catvod.spider.merge.D.a.c(var4_4)) {
                            var2_2.m(25, 1);
                            var2_2.m(25, var4_4.g("list"));
                            var2_2.m(25, 6);
                            var2_2.k(182, com.github.catvod.spider.merge.D.b.c, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                        }
                        if (var26_26 == String.class && com.github.catvod.spider.merge.D.a.a(var4_4)) {
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.m(25, var4_4.g("list"));
                            var2_2.k(182, var25_25, (String)var1_1, "(Ljava/util/List;)V");
                            var14_15 /* !! */  = var1_1;
                            var14_15 /* !! */  = var11_10;
                        } else {
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.m(16, 91);
                            var2_2.k(182, var25_25, (String)var1_1, (String)var19_20);
                            var27_27 = new g();
                            var15_16 /* !! */  = new g();
                            var28_28 = new g();
                            var2_2.e(3);
                            var2_2.m(54, var4_4.g("i"));
                            var2_2.h(var27_27);
                            var2_2.m(21, var4_4.g("i"));
                            var2_2.m(21, var4_4.g("size"));
                            var2_2.g(162, var28_28);
                            var2_2.m(21, var4_4.g("i"));
                            var2_2.g(153, (g)var15_16 /* !! */ );
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.m(16, 44);
                            var2_2.k(182, var25_25, (String)var1_1, (String)var19_20);
                            var2_2.h((g)var15_16 /* !! */ );
                            var2_2.m(25, var4_4.g("list"));
                            var2_2.m(21, var4_4.g("i"));
                            var2_2.k(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                            var29_29 = com.github.catvod.spider.merge.C.a.b(var2_2, 58, var4_4.g("list_item"));
                            var15_16 /* !! */  = new g();
                            var2_2.m(25, var4_4.g("list_item"));
                            var2_2.g(199, (g)var15_16 /* !! */ );
                            var2_2.m(25, var4_4.g(var11_10));
                            var2_2.k(182, var25_25, "writeNull", "()V");
                            var2_2.g(167, var29_29);
                            var2_2.h((g)var15_16 /* !! */ );
                            var15_16 /* !! */  = new g();
                            var30_30 = new g();
                            if (var18_18 != null && Modifier.isPublic(var18_18.getModifiers())) {
                                var2_2.m(25, var4_4.g("list_item"));
                                var2_2.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                var2_2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var18_18)));
                                var2_2.g(166, var30_30);
                                this.d(var4_4, var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , (Class<?>)var18_18);
                                var31_31 = com.github.catvod.spider.merge.C.a.b(var2_2, 58, var4_4.g("list_item_desc"));
                                var20_21 = new g();
                                if (com.github.catvod.spider.merge.D.a.a(var4_4)) {
                                    var19_20 = com.github.catvod.spider.merge.D.a.c(var4_4) != false && com.github.catvod.spider.merge.D.a.a(var4_4) != false ? "writeDirectNonContext" : var1_1;
                                    var2_2.m(25, var4_4.g("list_item_desc"));
                                    var32_32 = com.github.catvod.spider.merge.D.b.h;
                                    var2_2.l(193, var32_32);
                                    var2_2.g(153, (g)var31_31);
                                    var2_2.m(25, var4_4.g("list_item_desc"));
                                    var2_2.l(192, var32_32);
                                    var2_2.m(25, 1);
                                    var2_2.m(25, var4_4.g("list_item"));
                                    if (com.github.catvod.spider.merge.D.a.c(var4_4)) {
                                        var2_2.e(1);
                                    } else {
                                        var2_2.m(21, var4_4.g("i"));
                                        var2_2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    var2_2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var18_18)));
                                    var2_2.i(var14_15 /* !! */ .i);
                                    var33_33 = new StringBuilder();
                                    var33_33.append(var17_9);
                                    var2_2.k(182, var32_32, (String)var19_20, r.c(var33_33, com.github.catvod.spider.merge.D.b.c, (String)var13_14 /* !! */ ));
                                    var2_2.g(167, (g)var20_21);
                                    var2_2.h((g)var31_31);
                                }
                                var2_2.m(25, var4_4.g("list_item_desc"));
                                var2_2.m(25, 1);
                                var2_2.m(25, var4_4.g("list_item"));
                                if (com.github.catvod.spider.merge.D.a.c(var4_4)) {
                                    var2_2.e(1);
                                } else {
                                    var2_2.m(21, var4_4.g("i"));
                                    var2_2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                }
                                var2_2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var18_18)));
                                var19_20 = var14_15 /* !! */ ;
                                var2_2.i(var19_20.i);
                                var31_31 = com.github.catvod.spider.merge.D.b.d;
                                var32_32 = r.c(com.github.catvod.spider.merge.C.a.c(var17_9), com.github.catvod.spider.merge.D.b.c, (String)var13_14 /* !! */ );
                                var19_20 = var1_1;
                                var2_2.k(185, (String)var31_31, (String)var19_20, var32_32);
                                var2_2.h((g)var20_21);
                                var19_20 = var15_16 /* !! */ ;
                                var2_2.g(167, (g)var19_20);
                            } else {
                                var19_20 = var1_1;
                                var19_20 = var15_16 /* !! */ ;
                                var19_20 = var14_15 /* !! */ ;
                            }
                            var19_20 = var1_1;
                            var20_21 = var15_16 /* !! */ ;
                            var2_2.h(var30_30);
                            var2_2.m(25, 1);
                            var2_2.m(25, var4_4.g("list_item"));
                            if (com.github.catvod.spider.merge.D.a.c(var4_4)) {
                                var2_2.e(1);
                            } else {
                                var2_2.m(21, var4_4.g("i"));
                                var2_2.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                            }
                            if (var18_18 != null && Modifier.isPublic(var18_18.getModifiers())) {
                                var2_2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b((Class)var26_26)));
                                var2_2.i(var14_15 /* !! */ .i);
                                var15_16 /* !! */  = com.github.catvod.spider.merge.D.b.c;
                                var14_15 /* !! */  = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                            } else {
                                var15_16 /* !! */  = com.github.catvod.spider.merge.D.b.c;
                                var14_15 /* !! */  = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                            }
                            var2_2.k(182, (String)var15_16 /* !! */ , "writeWithFieldName", (String)var14_15 /* !! */ );
                            var2_2.h((g)var20_21);
                            var2_2.h(var29_29);
                            var2_2.d(var4_4.g("i"));
                            var2_2.g(167, var27_27);
                            var2_2.h(var28_28);
                            var14_15 /* !! */  = var11_10;
                            var2_2.m(25, var4_4.g((String)var14_15 /* !! */ ));
                            var2_2.m(16, 93);
                            var14_15 /* !! */  = var10_8 /* !! */ ;
                            var2_2.k(182, var25_25, (String)var19_20, (String)var14_15 /* !! */ );
                        }
                        var14_15 /* !! */  = var1_1;
                        var14_15 /* !! */  = var10_8 /* !! */ ;
                        var14_15 /* !! */  = var11_10;
                        var2_2.m(25, 1);
                        var2_2.k(182, com.github.catvod.spider.merge.D.b.c, "popContext", "()V");
                        var2_2.h(var24_24);
                        this.h(var2_2, var4_4);
                        var2_2.h(var22_22);
                        var2_2.h((g)var23_23);
                    } else {
                        var18_18 = var1_1;
                        var15_16 /* !! */  = var11_10;
                        if (var20_21.isEnum()) {
                            var23_23 = new g();
                            var20_21 = new g();
                            var22_22 = new g();
                            this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, var22_22);
                            this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                            var2_2.l(192, "java/lang/Enum");
                            var2_2.m(58, var4_4.g("enum"));
                            this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, var22_22);
                            var2_2.m(25, var4_4.g("enum"));
                            var2_2.g(199, (g)var23_23);
                            this.e(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4);
                            var2_2.g(167, (g)var20_21);
                            var2_2.h((g)var23_23);
                            if (com.github.catvod.spider.merge.D.a.a(var4_4)) {
                                var2_2.m(25, var4_4.g((String)var15_16 /* !! */ ));
                                var2_2.m(21, var4_4.g(var16_17));
                                var2_2.m(25, 6);
                                var2_2.m(25, var4_4.g("enum"));
                                var2_2.k(182, "java/lang/Enum", "name", "()Ljava/lang/String;");
                                var18_18 = com.github.catvod.spider.merge.D.b.f;
                                var15_16 /* !! */  = "writeFieldValueStringWithDoubleQuote";
                                var14_15 /* !! */  = "(CLjava/lang/String;Ljava/lang/String;)V";
                            } else {
                                var2_2.m(25, var4_4.g((String)var15_16 /* !! */ ));
                                var2_2.m(21, var4_4.g(var16_17));
                                var23_23 = com.github.catvod.spider.merge.D.b.f;
                                var2_2.k(182, (String)var23_23, (String)var18_18, (String)var19_20);
                                var2_2.m(25, var4_4.g((String)var15_16 /* !! */ ));
                                var2_2.m(25, 6);
                                var2_2.e(3);
                                var2_2.k(182, (String)var23_23, "writeFieldName", "(Ljava/lang/String;Z)V");
                                var2_2.m(25, 1);
                                var2_2.m(25, var4_4.g("enum"));
                                var2_2.m(25, 6);
                                var2_2.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(var14_15 /* !! */ .e)));
                                var2_2.i(var14_15 /* !! */ .i);
                                var18_18 = com.github.catvod.spider.merge.D.b.c;
                                var15_16 /* !! */  = "writeWithFieldName";
                                var14_15 /* !! */  = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                            }
                            var2_2.k(182, (String)var18_18, (String)var15_16 /* !! */ , (String)var14_15 /* !! */ );
                            this.h(var2_2, var4_4);
                            var2_2.h((g)var20_21);
                            var2_2.h(var22_22);
                        } else {
                            var15_16 /* !! */  = new g();
                            this.g(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                            this.b(var2_2, var4_4, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ );
                            var2_2.m(58, var4_4.g("object"));
                            this.a(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                            this.j(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, (g)var15_16 /* !! */ );
                            var2_2.h((g)var15_16 /* !! */ );
                        }
                    }
                }
                var14_15 /* !! */  = var12_11;
                var14_15 /* !! */  = var1_1;
                var14_15 /* !! */  = var10_8 /* !! */ ;
                var14_15 /* !! */  = var11_10;
                var14_15 /* !! */  = var13_14 /* !! */ ;
                continue;
            }
            var15_16 /* !! */  = var10_8 /* !! */ ;
            var15_16 /* !! */  = var12_11;
            var15_16 /* !! */  = var1_1;
            var15_16 /* !! */  = var11_10;
            var8_6 = var4_4.g(var20_21.getName());
            var15_16 /* !! */  = var13_14 /* !! */ ;
            this.f(var2_2, (com.github.catvod.spider.merge.H.e)var14_15 /* !! */ , var4_4, var8_6, 'I');
        }
        if (!com.github.catvod.spider.merge.D.a.a(var4_4)) {
            var2_2.m(25, 0);
            var2_2.m(25, 1);
            var2_2.m(25, 2);
            var2_2.m(21, var4_4.g(var16_17));
            var2_2.k(182, com.github.catvod.spider.merge.D.b.h, "writeAfter", r.c(com.github.catvod.spider.merge.C.a.c(var17_9), com.github.catvod.spider.merge.D.b.c, ";Ljava/lang/Object;C)C"));
            var2_2.m(54, var4_4.g(var16_17));
        }
        var3_3 /* !! */  = new g();
        var13_14 /* !! */  = new g();
        var2_2.m(21, var4_4.g(var16_17));
        var2_2.f(16, 123);
        var2_2.g(160, (g)var3_3 /* !! */ );
        var2_2.m(25, var4_4.g(var11_10));
        var2_2.m(16, 123);
        var14_15 /* !! */  = com.github.catvod.spider.merge.D.b.f;
        var2_2.k(182, (String)var14_15 /* !! */ , (String)var1_1, var10_8 /* !! */ );
        var2_2.h((g)var3_3 /* !! */ );
        var2_2.m(25, var4_4.g(var11_10));
        var2_2.m(16, 125);
        var2_2.k(182, (String)var14_15 /* !! */ , (String)var1_1, var10_8 /* !! */ );
        var2_2.h((g)var13_14 /* !! */ );
        var2_2.h(var21_5);
        if (!com.github.catvod.spider.merge.D.a.c(var4_4)) {
            var2_2.m(25, 1);
            var2_2.m(25, var4_4.g("parent"));
            var2_2.k(182, com.github.catvod.spider.merge.D.b.c, "setContext", r.c(com.github.catvod.spider.merge.C.a.c((String)var12_11), com.github.catvod.spider.merge.D.b.i, ")V"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public final M k(d0 d02) {
        Object object = String.class;
        Class<d0> clazz = d0.class;
        Class<?> clazz2 = d02.a;
        if (!clazz2.isPrimitive()) {
            com.github.catvod.spider.merge.H.e[] eArray;
            boolean bl;
            boolean bl2;
            boolean bl3;
            void var8_17;
            CharSequence charSequence;
            int n2;
            Object object3 = A.D(clazz2, d.class);
            for (com.github.catvod.spider.merge.H.e e2 : d02.e) {
                Method method;
                if (e2.c != null || (method = e2.b) == null || !method.getDeclaringClass().isInterface()) continue;
                return new M(d02);
            }
            com.github.catvod.spider.merge.H.e[] eArray2 = d02.f;
            int n3 = eArray2 == d02.e ? 1 : 0;
            if (eArray2.length > 256) {
                return new M(d02);
            }
            int n4 = eArray2.length;
            for (n2 = 0; n2 < n4; ++n2) {
                if (com.github.catvod.spider.merge.H.c.a(eArray2[n2].l().getName())) continue;
                return new M(d02);
            }
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("ASMSerializer_");
            stringBuilder.append(this.b.incrementAndGet());
            stringBuilder.append("_");
            stringBuilder.append(clazz2.getSimpleName());
            Object object2 = stringBuilder.toString();
            Package package_ = b.class.getPackage();
            if (package_ != null) {
                String string = package_.getName();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string.replace('.', '/'));
                ((StringBuilder)charSequence).append("/");
                ((StringBuilder)charSequence).append((String)object2);
                charSequence = ((StringBuilder)charSequence).toString();
                String string2 = s.a(string, ".", (String)object2);
            } else {
                String string = object2;
                charSequence = object2;
            }
            object2 = new com.github.catvod.spider.merge.A.d();
            ((com.github.catvod.spider.merge.A.d)object2).j((String)charSequence, h, new String[]{d});
            n4 = eArray2.length;
            void var11_37 = var8_17;
            for (n2 = 0; n2 < n4; ++n2) {
                com.github.catvod.spider.merge.H.e e3 = eArray2[n2];
                if (e3.e.isPrimitive() || e3.e == String.class) continue;
                new e((com.github.catvod.spider.merge.A.d)object2, r.c(new StringBuilder(), e3.a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                if (List.class.isAssignableFrom(e3.e)) {
                    new e((com.github.catvod.spider.merge.A.d)object2, r.c(new StringBuilder(), e3.a, "_asm_list_item_ser_"), e);
                }
                new e((com.github.catvod.spider.merge.A.d)object2, r.c(new StringBuilder(), e3.a, "_asm_ser_"), e);
            }
            StringBuilder stringBuilder2 = com.github.catvod.spider.merge.C.a.c("(");
            stringBuilder2.append(com.github.catvod.spider.merge.H.c.b(d0.class));
            stringBuilder2.append(")V");
            Object object4 = new i((com.github.catvod.spider.merge.A.d)object2, "<init>", stringBuilder2.toString(), null);
            ((i)object4).m(25, 0);
            ((i)object4).m(25, 1);
            String string = h;
            Object object5 = com.github.catvod.spider.merge.C.a.c("(");
            ((StringBuilder)object5).append(com.github.catvod.spider.merge.H.c.b(d0.class));
            ((StringBuilder)object5).append(")V");
            ((i)object4).k(183, string, "<init>", ((StringBuilder)object5).toString());
            Class<String> clazz3 = object;
            for (n2 = 0; n2 < eArray2.length; ++n2) {
                object = eArray2[n2];
                if (((com.github.catvod.spider.merge.H.e)object).e.isPrimitive() || ((com.github.catvod.spider.merge.H.e)object).e == clazz3) continue;
                ((i)object4).m(25, 0);
                if (((com.github.catvod.spider.merge.H.e)object).b != null) {
                    ((i)object4).i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(((com.github.catvod.spider.merge.H.e)object).g)));
                    ((i)object4).i(((com.github.catvod.spider.merge.H.e)object).b.getName());
                    ((i)object4).k(184, com.github.catvod.spider.merge.H.c.f(c.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                } else {
                    ((i)object4).m(25, 0);
                    ((i)object4).i(n2);
                    ((i)object4).k(183, h, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                }
                ((i)object4).c(181, (String)charSequence, r.c(new StringBuilder(), ((com.github.catvod.spider.merge.H.e)object).a, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            }
            ((i)object4).e(177);
            ((i)object4).j(4, 4);
            if (object3 != null) {
                i0[] i0Array = object3.serialzeFeatures();
                n4 = i0Array.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    if (i0Array[n2] != i0.p) continue;
                    bl3 = true;
                    break;
                }
            } else {
                bl3 = false;
            }
            com.github.catvod.spider.merge.H.e[] eArray3 = eArray2;
            eArray2 = object2;
            for (n2 = 0; n2 < 3; ++n2) {
                if (n2 == 0) {
                    bl2 = true;
                    bl = bl3;
                    object2 = "write";
                } else if (n2 == 1) {
                    bl = bl3;
                    object2 = "writeNormal";
                    bl2 = false;
                } else {
                    object2 = "writeDirectNonContext";
                    bl2 = true;
                    bl = true;
                }
                object4 = new a(eArray3, d02, (String)charSequence, bl2, bl);
                object5 = com.github.catvod.spider.merge.C.a.c("(L");
                object = c;
                object2 = new i((com.github.catvod.spider.merge.A.d)eArray2, (String)object2, r.c((StringBuilder)object5, (String)object, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                object5 = new g();
                ((i)object2).m(25, 2);
                ((i)object2).g(199, (g)object5);
                ((i)object2).m(25, 1);
                ((i)object2).k(182, (String)object, "writeNull", "()V");
                ((i)object2).e(177);
                ((i)object2).h((g)object5);
                ((i)object2).m(25, 1);
                ((i)object2).c(180, (String)object, "out", g);
                ((i)object2).m(58, ((a)object4).g("out"));
                if (n3 == 0 && !com.github.catvod.spider.merge.D.a.a((a)object4) && (object3 == null || object3.alphabetic())) {
                    object5 = new g();
                    ((i)object2).m(25, ((a)object4).g("out"));
                    ((i)object2).k(182, f, "isSortField", "()Z");
                    ((i)object2).g(154, (g)object5);
                    ((i)object2).m(25, 0);
                    ((i)object2).m(25, 1);
                    ((i)object2).m(25, 2);
                    ((i)object2).m(25, 3);
                    ((i)object2).m(25, 4);
                    ((i)object2).m(21, 5);
                    ((i)object2).k(182, (String)charSequence, "writeUnsorted", z.b(new StringBuilder(), "(L", (String)object, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                    ((i)object2).e(177);
                    ((i)object2).h((g)object5);
                }
                if (com.github.catvod.spider.merge.D.a.a((a)object4) && !bl) {
                    object5 = new g();
                    g g2 = new g();
                    ((i)object2).m(25, 0);
                    ((i)object2).m(25, 1);
                    ((i)object2).k(182, h, "writeDirect", s.a("(L", (String)object, ";)Z"));
                    ((i)object2).g(154, g2);
                    ((i)object2).m(25, 0);
                    ((i)object2).m(25, 1);
                    ((i)object2).m(25, 2);
                    ((i)object2).m(25, 3);
                    ((i)object2).m(25, 4);
                    ((i)object2).m(21, 5);
                    ((i)object2).k(182, (String)charSequence, "writeNormal", z.b(new StringBuilder(), "(L", (String)object, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                    ((i)object2).e(177);
                    ((i)object2).h(g2);
                    ((i)object2).m(25, ((a)object4).g("out"));
                    ((i)object2).i(i0.p.a);
                    ((i)object2).k(182, f, "isEnabled", "(I)Z");
                    ((i)object2).g(153, (g)object5);
                    ((i)object2).m(25, 0);
                    ((i)object2).m(25, 1);
                    ((i)object2).m(25, 2);
                    ((i)object2).m(25, 3);
                    ((i)object2).m(25, 4);
                    ((i)object2).m(21, 5);
                    ((i)object2).k(182, (String)charSequence, "writeDirectNonContext", z.b(new StringBuilder(), "(L", (String)object, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                    ((i)object2).e(177);
                    ((i)object2).h((g)object5);
                }
                ((i)object2).m(25, 2);
                ((i)object2).l(192, com.github.catvod.spider.merge.H.c.f(clazz2));
                ((i)object2).m(58, ((a)object4).g("entity"));
                this.m(clazz2, (i)object2, eArray3, (a)object4);
                ((i)object2).e(177);
                ((i)object2).j(7, com.github.catvod.spider.merge.D.a.b((a)object4) + 2);
            }
            if (n3 == 0) {
                object = new a(eArray3, d02, (String)charSequence, false, bl3);
                object3 = com.github.catvod.spider.merge.C.a.c("(L");
                object2 = c;
                object3 = new i((com.github.catvod.spider.merge.A.d)eArray2, "writeUnsorted", r.c((StringBuilder)object3, (String)object2, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                ((i)object3).m(25, 1);
                ((i)object3).c(180, (String)object2, "out", g);
                ((i)object3).m(58, ((a)object).g("out"));
                ((i)object3).m(25, 2);
                ((i)object3).l(192, com.github.catvod.spider.merge.H.c.f(clazz2));
                ((i)object3).m(58, ((a)object).g("entity"));
                this.m(clazz2, (i)object3, eArray, (a)object);
                ((i)object3).e(177);
                ((i)object3).j(7, com.github.catvod.spider.merge.D.a.b((a)object) + 2);
            }
            object2 = eArray3;
            for (n3 = 0; n3 < 3; ++n3) {
                void var8_30;
                if (n3 == 0) {
                    String string3 = "writeAsArray";
                    bl = bl3;
                    bl2 = true;
                } else if (n3 == 1) {
                    String string4 = "writeAsArrayNormal";
                    bl = bl3;
                    bl2 = false;
                } else {
                    String string5 = "writeAsArrayNonContext";
                    bl2 = true;
                    bl = true;
                }
                object = new a((com.github.catvod.spider.merge.H.e[])object2, d02, (String)charSequence, bl2, bl);
                object3 = com.github.catvod.spider.merge.C.a.c("(L");
                eArray = c;
                i i2 = new i((com.github.catvod.spider.merge.A.d)eArray2, (String)var8_30, r.c((StringBuilder)object3, (String)eArray, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
                i2.m(25, 1);
                i2.c(180, (String)eArray, "out", g);
                i2.m(58, ((a)object).g("out"));
                i2.m(25, 2);
                i2.l(192, com.github.catvod.spider.merge.H.c.f(clazz2));
                i2.m(58, ((a)object).g("entity"));
                this.l(i2, (com.github.catvod.spider.merge.H.e[])object2, (a)object);
                i2.e(177);
                i2.j(7, com.github.catvod.spider.merge.D.a.b((a)object) + 2);
            }
            byte[] byArray = eArray2.i();
            return (M)this.a.a((String)var11_37, byArray, byArray.length).getConstructor(clazz).newInstance(d02);
        }
        throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz2, com.github.catvod.spider.merge.C.a.c("unsupportd class ")));
    }
}

