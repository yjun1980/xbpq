/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.E0.E;
import com.github.catvod.spider.merge.E0.F;
import com.github.catvod.spider.merge.E0.I;
import com.github.catvod.spider.merge.E0.N;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.l;
import com.github.catvod.spider.merge.E0.n;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.I.r;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

final class l0 {
    private static final char[] a;

    static {
        char[] cArray = new char[80];
        a = cArray;
        Arrays.fill(cArray, ' ');
    }

    private static void a(int n2, StringBuilder stringBuilder) {
        while (n2 > 0) {
            char[] cArray = a;
            int n3 = 80;
            if (n2 <= 80) {
                n3 = n2;
            }
            stringBuilder.append(cArray, 0, n3);
            n2 -= n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void b(StringBuilder stringBuilder, int n2, String object, Object object2) {
        int n3;
        block15: {
            block14: {
                block13: {
                    if (object2 instanceof List) {
                        object2 = ((List)object2).iterator();
                        while (object2.hasNext()) {
                            l0.b(stringBuilder, n2, (String)object, object2.next());
                        }
                        return;
                    }
                    if (object2 instanceof Map) {
                        object2 = ((Map)object2).entrySet().iterator();
                        while (object2.hasNext()) {
                            l0.b(stringBuilder, n2, (String)object, (Map.Entry)object2.next());
                        }
                        return;
                    }
                    stringBuilder.append('\n');
                    l0.a(n2, stringBuilder);
                    if (!((String)object).isEmpty()) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(Character.toLowerCase(((String)object).charAt(0)));
                        for (n3 = 1; n3 < ((String)object).length(); ++n3) {
                            char c2 = ((String)object).charAt(n3);
                            if (Character.isUpperCase(c2)) {
                                stringBuilder2.append("_");
                            }
                            stringBuilder2.append(Character.toLowerCase(c2));
                        }
                        object = stringBuilder2.toString();
                    }
                    stringBuilder.append((String)object);
                    if (!(object2 instanceof String)) break block13;
                    stringBuilder.append(": \"");
                    object2 = (String)object2;
                    object = n.b;
                    object = o.a(new l(((String)object2).getBytes(N.a)));
                    break block14;
                }
                if (!(object2 instanceof n)) break block15;
                stringBuilder.append(": \"");
                object = o.a((n)object2);
            }
            stringBuilder.append((String)object);
            stringBuilder.append('\"');
            return;
        }
        if (object2 instanceof I) {
            stringBuilder.append(" {");
            l0.c((I)object2, stringBuilder, n2 + 2);
        } else {
            if (!(object2 instanceof Map.Entry)) {
                stringBuilder.append(": ");
                stringBuilder.append(object2);
                return;
            }
            stringBuilder.append(" {");
            object = (Map.Entry)object2;
            n3 = n2 + 2;
            l0.b(stringBuilder, n3, "key", object.getKey());
            l0.b(stringBuilder, n3, "value", object.getValue());
        }
        stringBuilder.append("\n");
        l0.a(n2, stringBuilder);
        stringBuilder.append("}");
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static void c(j0 var0, StringBuilder var1_1, int var2_2) {
        var11_3 = new HashSet<String>();
        var9_4 = new HashMap<String, Object>();
        var10_5 = new TreeMap<String, Object>();
        for (Object var8_9 : var0.getClass().getDeclaredMethods()) {
            if (Modifier.isStatic(var8_9.getModifiers()) || var8_9.getName().length() < 3) continue;
            if (var8_9.getName().startsWith("set")) {
                var11_3.add(var8_9.getName());
                continue;
            }
            if (!Modifier.isPublic(var8_9.getModifiers()) || var8_9.getParameterTypes().length != 0) continue;
            if (var8_9.getName().startsWith("has")) {
                var9_4.put(var8_9.getName(), var8_9);
                continue;
            }
            if (!var8_9.getName().startsWith("get")) continue;
            var10_5.put(var8_9.getName(), var8_9);
        }
        for (Object var7_6 : var10_5.entrySet()) {
            block25: {
                block18: {
                    block20: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        block19: {
                                            block17: {
                                                block16: {
                                                    block15: {
                                                        var8_9 = ((String)var7_6.getKey()).substring(3);
                                                        if (!var8_9.endsWith("List") || var8_9.endsWith("OrBuilderList") || var8_9.equals("List") || (var13_13 = (Method)var7_6.getValue()) == null || !var13_13.getReturnType().equals(List.class)) break block15;
                                                        var7_6 = var8_9.substring(0, var8_9.length() - 4);
                                                        var8_9 = I.j((Method)var13_13, var0, new Object[0]);
                                                        break block16;
                                                    }
                                                    if (!var8_9.endsWith("Map") || var8_9.equals("Map") || (var13_13 = (Method)var7_6.getValue()) == null || !var13_13.getReturnType().equals(Map.class) || var13_13.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(var13_13.getModifiers())) break block17;
                                                    var7_6 = var8_9.substring(0, var8_9.length() - 3);
                                                    var8_9 = I.j((Method)var13_13, var0, new Object[0]);
                                                }
                                                l0.b(var1_1, var2_2, (String)var7_6, var8_9);
                                                continue;
                                            }
                                            var13_13 = new StringBuilder();
                                            var13_13.append("set");
                                            var13_13.append((String)var8_9);
                                            if (!var11_3.contains(var13_13.toString())) continue;
                                            if (var8_9.endsWith("Bytes")) {
                                                var13_13 = com.github.catvod.spider.merge.C.a.c("get");
                                                var13_13.append(var8_9.substring(0, var8_9.length() - 5));
                                                if (var10_5.containsKey(var13_13.toString())) continue;
                                            }
                                            var7_6 = (Method)var7_6.getValue();
                                            var13_13 = new StringBuilder();
                                            var13_13.append("has");
                                            var13_13.append((String)var8_9);
                                            var14_14 = (Method)var9_4.get(var13_13.toString());
                                            if (var7_6 == null) continue;
                                            var13_13 = I.j((Method)var7_6, var0, new Object[0]);
                                            var6_12 = true;
                                            if (var14_14 != null) break block18;
                                            if (!(var13_13 instanceof Boolean)) break block19;
                                            var5_11 = (Boolean)var13_13 ^ true;
                                            break block20;
                                        }
                                        if (!(var13_13 instanceof Integer)) break block21;
                                        if ((Integer)var13_13 != 0) ** GOTO lbl-1000
                                        ** GOTO lbl-1000
                                    }
                                    if (!(var13_13 instanceof Float)) break block22;
                                    if (Float.floatToRawIntBits(((Float)var13_13).floatValue()) != 0) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                if (!(var13_13 instanceof Double)) break block23;
                                if (Double.doubleToRawLongBits((Double)var13_13) != 0L) ** GOTO lbl-1000
                                ** GOTO lbl-1000
                            }
                            if (!(var13_13 instanceof String)) break block24;
                            var7_6 = "";
                            ** GOTO lbl77
                        }
                        if (var13_13 instanceof n) {
                            var7_6 = n.b;
lbl77:
                            // 2 sources

                            var5_11 = var13_13.equals(var7_6);
                        } else if (var13_13 instanceof j0 != false ? var13_13 == ((j0)var13_13).b() : var13_13 instanceof Enum != false && ((Enum)var13_13).ordinal() == 0) lbl-1000:
                        // 4 sources

                        {
                            var5_11 = true;
                        } else lbl-1000:
                        // 4 sources

                        {
                            var5_11 = false;
                        }
                    }
                    var5_11 = !var5_11 ? var6_12 : false;
                    break block25;
                }
                var5_11 = (Boolean)I.j(var14_14, var0, new Object[0]);
            }
            if (!var5_11) continue;
            l0.b(var1_1, var2_2, (String)var8_9, var13_13);
        }
        if (var0 instanceof E) {
            var8_9 = ((E)var0).e.j();
            while (var8_9.hasNext()) {
                var7_6 = (Map.Entry)var8_9.next();
                Objects.requireNonNull((F)var7_6.getKey());
                l0.b(var1_1, var2_2, "[0]", var7_6.getValue());
            }
        }
        if ((var0 = ((I)var0).c) != null) {
            var0.g(var1_1, var2_2);
        }
    }

    static String d(j0 j02, String charSequence) {
        charSequence = r.d("# ", (String)charSequence);
        l0.c(j02, (StringBuilder)charSequence, 0);
        return ((StringBuilder)charSequence).toString();
    }
}

