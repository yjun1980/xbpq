/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.e;
import com.github.catvod.spider.merge.C.h;
import com.github.catvod.spider.merge.C.j;
import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.C.s;
import com.github.catvod.spider.merge.C.t;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.l;
import com.github.catvod.spider.merge.y.T;
import com.github.catvod.spider.merge.z.b;
import com.github.catvod.spider.merge.z.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class q
implements v {
    private final n[] a;
    protected final n[] b;
    protected final Class<?> c;
    public final l d;
    private ConcurrentMap<String, Object> e;
    private final Map<String, n> f;
    private Map<String, n> g;
    private transient long[] h;
    private transient short[] i;
    private final com.github.catvod.spider.merge.B.n j;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public q(o object, l l2) {
        int n2;
        void var8_13;
        int n3;
        void var8_10;
        void var2_5;
        this.c = var2_5.a;
        this.d = var2_5;
        d d2 = var2_5.k;
        if (d2 != null && d2.autoTypeCheckHandler() != com.github.catvod.spider.merge.B.n.class) {
            try {
                com.github.catvod.spider.merge.B.n n4 = var2_5.k.autoTypeCheckHandler().newInstance();
            }
            catch (Exception exception) {}
        }
        Object var8_9 = null;
        this.j = var8_10;
        com.github.catvod.spider.merge.H.e[] eArray = var2_5.i;
        this.b = new n[eArray.length];
        int n5 = eArray.length;
        int n6 = 0;
        Object var8_12 = null;
        for (n3 = 0; n3 < n5; ++n3) {
            Class<?> clazz;
            Object object2;
            Object object3;
            Class<?> clazz2;
            String[] stringArray;
            block15: {
                block14: {
                    stringArray = var2_5.i[n3];
                    Objects.requireNonNull(object);
                    clazz2 = var2_5.a;
                    object3 = stringArray.e;
                    object2 = stringArray.h();
                    if (object2 == null) break block14;
                    clazz = object2.deserializeUsing();
                    object2 = clazz;
                    if (clazz != Void.class) break block15;
                }
                object2 = null;
            }
            object2 = object2 == null && (object3 == List.class || object3 == ArrayList.class) ? new e((Class)clazz2, (com.github.catvod.spider.merge.H.e)stringArray) : new h((Class)clazz2, (com.github.catvod.spider.merge.H.e)stringArray);
            this.b[n3] = object2;
            if (n5 > 128) {
                if (this.g == null) {
                    this.g = new HashMap<String, n>();
                }
                ((HashMap)this.g).put(stringArray.a, (n)object2);
            }
            stringArray = stringArray.t;
            int n7 = stringArray.length;
            clazz = var8_13;
            for (n2 = 0; n2 < n7; ++n2) {
                void var8_17;
                object3 = stringArray[n2];
                Class<?> clazz3 = clazz;
                if (clazz == null) {
                    HashMap hashMap = new HashMap();
                }
                var8_17.put(object3, object2);
                clazz = var8_17;
            }
            Class<?> clazz4 = clazz;
        }
        this.f = var8_13;
        com.github.catvod.spider.merge.H.e[] eArray2 = var2_5.h;
        this.a = new n[eArray2.length];
        n2 = eArray2.length;
        n3 = n6;
        while (n3 < n2) {
            n n8;
            this.a[n3] = n8 = this.k(var2_5.h[n3].a, null);
            ++n3;
        }
        return;
    }

    public q(o o2, Class<?> clazz, Type type) {
        Objects.requireNonNull(o2);
        this(o2, l.b(clazz, type, o2.k));
    }

    private Object b(Object object) {
        return this.d.e.invoke(null, object);
    }

    protected static q l(o o2, l object, String string) {
        object = object.k;
        if (object == null) {
            return null;
        }
        object = object.seeAlso();
        int n2 = ((Class<?>[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = o2.f(object[i2]);
            if (!(object2 instanceof q)) continue;
            q q2 = (q)object2;
            object2 = q2.d;
            if (((l)object2).l.equals(string)) {
                return q2;
            }
            if ((object2 = q.l(o2, (l)object2, string)) == null) continue;
            return object2;
        }
        return null;
    }

    static boolean m(int n2, int[] nArray) {
        boolean bl = false;
        if (nArray == null) {
            return false;
        }
        int n3 = n2 / 32;
        boolean bl2 = bl;
        if (n3 < nArray.length) {
            bl2 = bl;
            if ((1 << n2 % 32 & nArray[n3]) != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public <T> T c(com.github.catvod.spider.merge.B.b b2, Type type, Object object) {
        return this.g(b2, type, object, 0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object d(com.github.catvod.spider.merge.B.b var1_1, Type var2_4) {
        block23: {
            block20: {
                block21: {
                    block22: {
                        var5_6 = var2_4 instanceof Class;
                        var3_7 = 0;
                        if (var5_6 && this.c.isInterface()) {
                            var2_4 = (Class)var2_4;
                            var6_8 = Thread.currentThread().getContextClassLoader();
                            var1_1 = new com.github.catvod.spider.merge.y.e();
                            return Proxy.newProxyInstance(var6_8, new Class[]{var2_4}, (InvocationHandler)var1_1);
                        }
                        var9_10 = this.d;
                        var8_11 = var9_10.c;
                        var7_12 = null;
                        if (var8_11 == null && var9_10.e == null) {
                            return null;
                        }
                        var6_9 = var9_10.e;
                        if (var6_9 != null && var9_10.g > 0) {
                            return null;
                        }
                        if (var9_10.g != 0) ** GOTO lbl24
                        if (var8_11 == null) ** GOTO lbl22
                        var2_4 = var8_11.newInstance(new Object[0]);
                        break block20;
lbl22:
                        // 1 sources

                        var2_4 = var6_9.invoke(null, new Object[0]);
                        break block20;
lbl24:
                        // 1 sources

                        var10_13 = var1_1.f();
                        if (var10_13 == null) ** GOTO lbl73
                        if (var10_13.a == null) ** GOTO lbl73
                        if (!(var2_4 instanceof Class)) ** GOTO lbl71
                        var2_4 = ((Class)var2_4).getName();
                        var9_10 = var2_4.substring(0, var2_4.lastIndexOf(36));
                        var2_4 = var10_13.a;
                        var11_14 = var2_4.getClass().getName();
                        var6_9 = var2_4;
                        if (var11_14.equals(var9_10)) break block21;
                        var6_9 = var10_13.b;
                        if (var6_9 == null) break block22;
                        if (var6_9.a == null || !"java.util.ArrayList".equals(var11_14) && !"java.util.List".equals(var11_14) && !"java.util.Collection".equals(var11_14) && !"java.util.Map".equals(var11_14) && !"java.util.HashMap".equals(var11_14)) break block22;
                        var2_4 = var7_12;
                        if (!var6_9.a.getClass().getName().equals(var9_10)) break block22;
                        var2_4 = var6_9.a;
                    }
                    var6_9 = var2_4;
                }
                if (var6_9 == null) break block23;
                if (var6_9 instanceof Collection && ((Collection)var6_9).isEmpty()) break block23;
                var2_4 = var8_11.newInstance(new Object[]{var6_9});
            }
            if (var1_1 != null && var1_1.f.l(com.github.catvod.spider.merge.B.c.l)) {
                var1_1 = this.d.h;
                var4_15 = ((com.github.catvod.spider.merge.H.e[])var1_1).length;
                while (var3_7 < var4_15) {
                    var6_9 = var1_1[var3_7];
                    if (var6_9.e == String.class) {
                        try {
                            var6_9.n(var2_4, "");
                        }
                        catch (Exception var2_5) {
                            var1_1 = com.github.catvod.spider.merge.C.a.c("create instance error, class ");
                            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(this.c, (StringBuilder)var1_1), var2_5);
                        }
                    }
                    ++var3_7;
                }
            }
            return var2_4;
        }
        try {
            var1_1 = new com.github.catvod.spider.merge.y.d("can't create non-static inner class instance.");
            throw var1_1;
lbl71:
            // 1 sources

            var1_1 = new com.github.catvod.spider.merge.y.d("can't create non-static inner class instance.");
            throw var1_1;
lbl73:
            // 2 sources

            var1_1 = new com.github.catvod.spider.merge.y.d("can't create non-static inner class instance.");
            throw var1_1;
        }
        catch (Exception var1_2) {
            var2_4 = com.github.catvod.spider.merge.C.a.c("create instance error, class ");
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(this.c, (StringBuilder)var2_4), var1_2);
        }
        catch (com.github.catvod.spider.merge.y.d var1_3) {
            throw var1_3;
        }
    }

    @Override
    public int e() {
        return 12;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final Object f(Map<String, Object> var1_1, o var2_5) {
        block95: {
            block97: {
                var19_7 = this.d;
                if (var19_7.d != null || var19_7.e != null) break block97;
                var20_8 = this.d(null, this.c);
                block34: for (Object var19_7 : var1_1.entrySet()) {
                    block98: {
                        block106: {
                            block108: {
                                block109: {
                                    block94: {
                                        block107: {
                                            block102: {
                                                block103: {
                                                    block93: {
                                                        block101: {
                                                            block100: {
                                                                block99: {
                                                                    var1_1 = (String)var19_7.getKey();
                                                                    var24_32 = var19_7.getValue();
                                                                    var19_7 = this.p((String)var1_1, null);
                                                                    if (var19_7 == null) continue;
                                                                    var1_1 = var19_7.a;
                                                                    var22_28 = var1_1.c;
                                                                    var23_30 = var1_1.f;
                                                                    var25_34 = var1_1.e;
                                                                    var26_36 = var1_1.h();
                                                                    if (var1_1.g != null && (!var25_34.isInstance(var24_32) || var26_36 != null && var26_36.deserializeUsing() != Void.class)) {
                                                                        if (!(var24_32 instanceof String) || !T.c((String)(var1_1 = (String)var24_32)).g()) {
                                                                            var1_1 = com.github.catvod.spider.merge.y.a.m(var24_32);
                                                                        }
                                                                        var19_7.d(new com.github.catvod.spider.merge.B.b((String)var1_1, o.v, com.github.catvod.spider.merge.y.a.f), var20_8, var23_30, null);
                                                                        continue;
                                                                    }
                                                                    if (var22_28 == null || var1_1.b != null) break block98;
                                                                    var25_34 = var22_28.getType();
                                                                    if (var25_34 != Boolean.TYPE) break block99;
                                                                    if (var24_32 == Boolean.FALSE) {
                                                                        var22_28.setBoolean(var20_8, false);
                                                                        continue;
                                                                    }
                                                                    if (var24_32 == Boolean.TRUE) {
                                                                        var22_28.setBoolean(var20_8, true);
                                                                        continue;
                                                                    }
                                                                    break block98;
                                                                }
                                                                if (var25_34 != Integer.TYPE) break block100;
                                                                if (var24_32 instanceof Number) {
                                                                    var22_28.setInt(var20_8, ((Number)var24_32).intValue());
                                                                    continue;
                                                                }
                                                                break block98;
                                                            }
                                                            if (var25_34 != Long.TYPE) break block101;
                                                            if (var24_32 instanceof Number) {
                                                                var22_28.setLong(var20_8, ((Number)var24_32).longValue());
                                                                continue;
                                                            }
                                                            break block98;
                                                        }
                                                        if (var25_34 != Float.TYPE) break block102;
                                                        if (var24_32 instanceof Number) {
                                                            var7_14 = ((Number)var24_32).floatValue();
lbl45:
                                                            // 5 sources

                                                            while (true) {
                                                                var22_28.setFloat(var20_8, var7_14);
                                                                continue block34;
                                                                break;
                                                            }
                                                        }
                                                        if (!(var24_32 instanceof String)) break block98;
                                                        var1_1 = (String)var24_32;
                                                        if (var1_1.length() > 10) break block103;
                                                        var18_27 = A.b;
                                                        var12_22 = var1_1.length();
                                                        if (var12_22 >= 10) {
                                                            var19_7 = var1_1;
lbl55:
                                                            // 4 sources

                                                            while (true) {
                                                                var1_1 = var19_7;
                                                                break block93;
                                                                break;
                                                            }
                                                        }
                                                        var11_20 = false;
                                                        var9_16 = 0;
                                                        var14_25 = 0L;
                                                        for (var10_18 = 0; var10_18 < var12_22; ++var10_18) {
                                                            block104: {
                                                                block105: {
                                                                    var13_24 = var1_1.charAt(var10_18);
                                                                    if (var13_24 == '-' && var10_18 == 0) {
                                                                        var11_20 = true;
                                                                        continue;
                                                                    }
                                                                    if (var13_24 != '.') break block104;
                                                                    if (var9_16 == 0) break block105;
                                                                    var19_7 = var1_1;
                                                                    ** GOTO lbl55
                                                                }
                                                                var9_16 = var12_22 - var10_18 - 1;
                                                                continue;
                                                            }
                                                            var19_7 = var1_1;
                                                            if (var13_24 < '0') ** GOTO lbl55
                                                            var19_7 = var1_1;
                                                            if (var13_24 <= '9') ** break;
                                                            ** continue;
                                                            var14_25 = var14_25 * 10L + (long)(var13_24 - 48);
                                                        }
                                                        var16_26 = var14_25;
                                                        if (var11_20) {
                                                            var16_26 = -var14_25;
                                                        }
                                                        switch (var9_16) {
                                                            default: {
                                                                break block93;
                                                            }
                                                            case 9: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 1.0E9f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 8: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 1.0E8f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 7: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 1.0E7f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 6: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 1000000.0f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 5: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 100000.0f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 4: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 10000.0f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 3: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 1000.0f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 2: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 100.0f;
                                                                ** GOTO lbl122
                                                            }
                                                            case 1: {
                                                                var7_14 = var16_26;
                                                                var8_15 = 10.0f;
lbl122:
                                                                // 9 sources

                                                                var7_14 /= var8_15;
                                                                ** GOTO lbl45
                                                            }
                                                            case 0: 
                                                        }
                                                        var7_14 = var16_26;
                                                        ** GOTO lbl45
                                                    }
                                                    var7_14 = Float.parseFloat((String)var1_1);
                                                    ** GOTO lbl45
                                                }
                                                var7_14 = Float.parseFloat((String)var1_1);
                                                ** continue;
                                            }
                                            if (var25_34 != Double.TYPE) break block106;
                                            if (!(var24_32 instanceof Number)) break block107;
                                            var3_12 = ((Number)var24_32).doubleValue();
                                            break block108;
                                        }
                                        if (!(var24_32 instanceof String)) break block98;
                                        var1_1 = (String)var24_32;
                                        if (var1_1.length() > 10) break block109;
                                        var18_27 = A.b;
                                        var12_22 = var1_1.length();
                                        if (var12_22 > 10) break block94;
                                        var11_20 = false;
                                        var10_18 = 0;
                                        var14_25 = 0L;
                                        for (var9_16 = 0; var9_16 < var12_22; ++var9_16) {
                                            var13_24 = var1_1.charAt(var9_16);
                                            if (var13_24 == '-' && var9_16 == 0) {
                                                var11_20 = true;
                                                continue;
                                            }
                                            if (var13_24 == '.') {
                                                if (var10_18 == 0) {
                                                    var10_18 = var12_22 - var9_16 - 1;
                                                    continue;
                                                }
                                            } else if (var13_24 >= '0' && var13_24 <= '9') {
                                                var14_25 = var14_25 * 10L + (long)(var13_24 - 48);
                                                continue;
                                            }
                                            break block94;
                                        }
                                        var16_26 = var14_25;
                                        if (var11_20) {
                                            var16_26 = -var14_25;
                                        }
                                        switch (var10_18) {
                                            default: {
                                                break block94;
                                            }
                                            case 9: {
                                                var3_12 = var16_26;
                                                var5_13 = 1.0E9;
                                                ** GOTO lbl203
                                            }
                                            case 8: {
                                                var3_12 = var16_26;
                                                var5_13 = 1.0E8;
                                                ** GOTO lbl203
                                            }
                                            case 7: {
                                                var3_12 = var16_26;
                                                var5_13 = 1.0E7;
                                                ** GOTO lbl203
                                            }
                                            case 6: {
                                                var3_12 = var16_26;
                                                var5_13 = 1000000.0;
                                                ** GOTO lbl203
                                            }
                                            case 5: {
                                                var3_12 = var16_26;
                                                var5_13 = 100000.0;
                                                ** GOTO lbl203
                                            }
                                            case 4: {
                                                var3_12 = var16_26;
                                                var5_13 = 10000.0;
                                                ** GOTO lbl203
                                            }
                                            case 3: {
                                                var3_12 = var16_26;
                                                var5_13 = 1000.0;
                                                ** GOTO lbl203
                                            }
                                            case 2: {
                                                var3_12 = var16_26;
                                                var5_13 = 100.0;
                                                ** GOTO lbl203
                                            }
                                            case 1: {
                                                var3_12 = var16_26;
                                                var5_13 = 10.0;
lbl203:
                                                // 9 sources

                                                var3_12 /= var5_13;
                                                break block108;
                                            }
                                            case 0: 
                                        }
                                        var3_12 = var16_26;
                                        break block108;
                                    }
                                    var3_12 = Double.parseDouble((String)var1_1);
                                    break block108;
                                }
                                var3_12 = Double.parseDouble((String)var1_1);
                            }
                            var22_28.setDouble(var20_8, var3_12);
                            continue;
                        }
                        if (var24_32 != null && var23_30 == var24_32.getClass()) {
                            var22_28.set(var20_8, var24_32);
                            continue;
                        }
                    }
                    var1_1 = (var1_1 = var1_1.s) != null && var23_30 == Date.class ? A.l(var24_32, (String)var1_1) : (var1_1 != null && var23_30 instanceof Class != false && ((Class)var23_30).getName().equals("java.time.LocalDateTime") != false ? s.g(var24_32, (String)var1_1) : (var23_30 instanceof ParameterizedType != false ? A.e(var24_32, (ParameterizedType)var23_30, (o)var2_5) : A.f(var24_32, var23_30, (o)var2_5)));
                    var19_7.e(var20_8, var1_1);
                }
                var1_1 = this.d.f;
                if (var1_1 != null) {
                    try {
                        var1_1 = var1_1.invoke(var20_8, new Object[0]);
                        return var1_1;
                    }
                    catch (Exception var1_2) {
                        throw new com.github.catvod.spider.merge.y.d("build object error", var1_2);
                    }
                }
                return var20_8;
            }
            var24_33 = var19_7.h;
            var12_23 = var24_33.length;
            var23_31 = new Object[var12_23];
            var20_9 = null;
            for (var9_17 = 0; var9_17 < var12_23; ++var9_17) {
                var25_35 = var24_33[var9_17];
                var19_7 = var1_1.get(var25_35.a);
                var21_11 = var20_9;
                var22_29 /* !! */  = var19_7;
                if (var19_7 == null) {
                    var21_11 = var25_35.e;
                    if (var21_11 == Integer.TYPE) {
                        var19_7 = 0;
                    } else if (var21_11 == Long.TYPE) {
                        var19_7 = 0L;
                    } else if (var21_11 == Short.TYPE) {
                        var19_7 = (short)0;
                    } else if (var21_11 == Byte.TYPE) {
                        var19_7 = (byte)0;
                    } else if (var21_11 == Float.TYPE) {
                        var19_7 = Float.valueOf(0.0f);
                    } else if (var21_11 == Double.TYPE) {
                        var19_7 = 0.0;
                    } else if (var21_11 == Character.TYPE) {
                        var19_7 = Character.valueOf('0');
                    } else if (var21_11 == Boolean.TYPE) {
                        var19_7 = Boolean.FALSE;
                    }
                    var21_11 = var20_9;
                    if (var20_9 == null) {
                        var21_11 = new HashMap<String, Integer>();
                    }
                    var21_11.put(var25_35.a, var9_17);
                    var22_29 /* !! */  = var19_7;
                }
                var23_31[var9_17] = var22_29 /* !! */ ;
                var20_9 = var21_11;
            }
            if (var20_9 != null) {
                for (Object var19_7 : var1_1.entrySet()) {
                    var21_11 = (String)var19_7.getKey();
                    var19_7 = var19_7.getValue();
                    if ((var21_11 = this.p((String)var21_11, null)) == null || (var21_11 = (Integer)var20_9.get(var21_11.a.a)) == null) continue;
                    var23_31[var21_11.intValue()] = var19_7;
                }
            }
            var1_1 = this.d;
            if (var1_1.d != null) {
                if (var1_1.q) {
                    var10_19 = 0;
                    var9_17 = 0;
                    while (true) {
                        var11_21 = var9_17;
                        if (var10_19 < var12_23) {
                            var20_9 = var23_31[var10_19];
                            if (var20_9 == null) {
                                var1_1 = this.d.h;
                                var11_21 = var9_17;
                                if (var1_1 != null) {
                                    var11_21 = var9_17;
                                    if (var10_19 < ((Object)var1_1).length) {
                                        var11_21 = var9_17;
                                        if (var1_1[var10_19].e == String.class) {
                                            var11_21 = 1;
                                        }
                                    }
                                }
                            } else {
                                var1_1 = var20_9.getClass();
                                var19_7 = this.d.h;
                                var11_21 = var9_17;
                                if (var1_1 != var19_7[var10_19].e) {
                                    var23_31[var10_19] = A.d(var20_9, var19_7[var10_19].e, (o)var2_5);
                                    var11_21 = var9_17;
                                }
                            }
                            ++var10_19;
                            var9_17 = var11_21;
                            continue;
                        }
                        break;
                    }
                } else {
                    var11_21 = 0;
                }
                if (var11_21 != 0 && (var1_1 = this.d.r) != null) {
                    try {
                        var2_5 = var1_1.newInstance(new Object[0]);
                        var9_17 = 0;
                    }
                    catch (Exception var1_3) {
                        var2_5 = com.github.catvod.spider.merge.C.a.c("create instance error, ");
                        var2_5.append(this.d.d.toGenericString());
                        throw new com.github.catvod.spider.merge.y.d(var2_5.toString(), var1_3);
                    }
                    while (true) {
                        block96: {
                            var1_1 = var2_5;
                            if (var9_17 >= var12_23) break block95;
                            var19_7 = var23_31[var9_17];
                            if (var19_7 != null) {
                                var1_1 = this.d.h;
                                if (var1_1 == null) break block96;
                                if (var9_17 >= ((Object)var1_1).length) break block96;
                                var1_1[var9_17].n(var2_5, var19_7);
                            }
                        }
                        ++var9_17;
                    }
                }
                try {
                    var1_1 = this.d.d.newInstance(var23_31);
                }
                catch (Exception var2_6) {
                    var1_1 = com.github.catvod.spider.merge.C.a.c("create instance error, ");
                    var1_1.append(this.d.d.toGenericString());
                    throw new com.github.catvod.spider.merge.y.d(var1_1.toString(), var2_6);
                }
            }
            var1_1 = var1_1.e;
            if (var1_1 != null) {
                try {
                    var1_1 = var1_1.invoke(null, var23_31);
                }
                catch (Exception var1_4) {
                    var2_5 = com.github.catvod.spider.merge.C.a.c("create factory method error, ");
                    var2_5.append(this.d.e.toString());
                    throw new com.github.catvod.spider.merge.y.d(var2_5.toString(), var1_4);
                }
            } else {
                var1_1 = null;
            }
        }
        return var1_1;
    }

    public final <T> T g(com.github.catvod.spider.merge.B.b b2, Type type, Object object, int n2) {
        return (T)this.h(b2, type, object, n2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Exception decompiling
     */
    protected final Object h(com.github.catvod.spider.merge.B.b var1_1, Type var2_2, Object var3_21, int var4_24) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [12 : 390->411)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Unable to fully structure code
     */
    public final Object i(com.github.catvod.spider.merge.B.b var1_1, Type var2_2, Object var3_3) {
        block11: {
            block10: {
                var10_4 = var1_1.f;
                if (var10_4.p() != 14) break block11;
                var11_5 = var10_4.C(var1_1.b);
                if (var11_5 != null) {
                    var9_6 = q.l(var1_1.e(), this.d, var11_5);
                    var8_7 = var9_6;
                    if (var9_6 == null) {
                        var8_7 = A.G(var2_2);
                        var8_7 = var1_1.e().b(var11_5, (Class<?>)var8_7, var10_4.w());
                        var8_7 = var1_1.e().f((Type)var8_7);
                    }
                    if (var8_7 instanceof q) {
                        return ((q)var8_7).i((com.github.catvod.spider.merge.B.b)var1_1, var2_2, var3_3);
                    }
                }
                var3_3 = this.d((com.github.catvod.spider.merge.B.b)var1_1, var2_2);
                var5_8 = 0;
                var7_9 = this.b.length;
                while (true) {
                    block13: {
                        block20: {
                            block19: {
                                block18: {
                                    block17: {
                                        block16: {
                                            block15: {
                                                block14: {
                                                    block12: {
                                                        var6_11 = 16;
                                                        if (var5_8 >= var7_9) break block10;
                                                        var4_10 = var5_8 == var7_9 - 1 ? ']' : ',';
                                                        var8_7 = this.b[var5_8];
                                                        var2_2 = var8_7.a.e;
                                                        if (var2_2 != Integer.TYPE) break block12;
                                                        var8_7.e(var3_3, var10_4.u(var4_10));
                                                        break block13;
                                                    }
                                                    if (var2_2 != String.class) break block14;
                                                    var8_7.e(var3_3, var10_4.r(var4_10));
                                                    break block13;
                                                }
                                                if (var2_2 != Long.TYPE) break block15;
                                                var8_7.e(var3_3, var10_4.j(var4_10));
                                                break block13;
                                            }
                                            if (!var2_2.isEnum()) break block16;
                                            var6_11 = var10_4.F();
                                            if (var6_11 == 34 || var6_11 == 110) ** GOTO lbl45
                                            if (var6_11 >= 48 && var6_11 <= 57) {
                                                var6_11 = var10_4.u(var4_10);
                                                var2_2 = ((j)((h)var8_7).g((o)var1_1.e())).c[var6_11];
                                            } else {
                                                var1_1 = com.github.catvod.spider.merge.C.a.c("illegal enum. ");
                                                var1_1.append(var10_4.f());
                                                throw new com.github.catvod.spider.merge.y.d(var1_1.toString());
lbl45:
                                                // 1 sources

                                                var2_2 = var10_4.v(var2_2, var1_1.b, var4_10);
                                            }
                                            ** GOTO lbl66
                                        }
                                        if (var2_2 != Boolean.TYPE) break block17;
                                        var8_7.e(var3_3, var10_4.t(var4_10));
                                        break block13;
                                    }
                                    if (var2_2 != Float.TYPE) break block18;
                                    var2_2 = Float.valueOf(var10_4.D(var4_10));
                                    ** GOTO lbl66
                                }
                                if (var2_2 != Double.TYPE) break block19;
                                var2_2 = var10_4.B(var4_10);
                                ** GOTO lbl66
                            }
                            if (var2_2 != Date.class || var10_4.F() != '1') break block20;
                            var2_2 = new Date(var10_4.j(var4_10));
                            ** GOTO lbl66
                        }
                        if (var2_2 == BigDecimal.class) {
                            var2_2 = var10_4.n();
lbl66:
                            // 6 sources

                            var8_7.e(var3_3, var2_2);
                        } else {
                            var10_4.o(14);
                            var2_2 = var8_7.a;
                            var8_7.e(var3_3, var1_1.t(var2_2.f, var2_2.a));
                            if (var10_4.p() != 15) {
                                if (var4_10 == ']') {
                                    var6_11 = 15;
                                }
                                if (var10_4.p() != var6_11) break;
                            }
                            break block10;
                        }
                    }
                    ++var5_8;
                }
                throw new com.github.catvod.spider.merge.y.d("syntax error");
            }
            var10_4.o(16);
            return var3_3;
        }
        throw new com.github.catvod.spider.merge.y.d("error");
    }

    public final n j(String string) {
        return this.k(string, null);
    }

    public final n k(String string, int[] object) {
        if (string == null) {
            return null;
        }
        Map<String, n> map = this.g;
        if (map != null && (map = (n)((HashMap)map).get(string)) != null) {
            return map;
        }
        int n2 = 0;
        int n3 = this.b.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = this.b[n4].a.a.compareTo(string);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            if (q.m(n4, (int[])object)) {
                return null;
            }
            return this.b[n4];
        }
        object = this.f;
        if (object != null) {
            return (n)object.get(string);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean n(com.github.catvod.spider.merge.B.b object, String string, Object object2, Type type, Map<String, Object> map, int[] nArray) {
        Object object3;
        int n2;
        int n3;
        com.github.catvod.spider.merge.B.d d2;
        block30: {
            Object object4;
            block31: {
                Object object5;
                int n4;
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                d2 = ((com.github.catvod.spider.merge.B.b)object).f;
                n3 = com.github.catvod.spider.merge.B.c.s.a;
                n2 = com.github.catvod.spider.merge.B.c.l.a;
                object3 = !d2.isEnabled(n3) && (n3 & this.d.j) == 0 ? (!d2.isEnabled(n2) && (this.d.j & n2) == 0 ? this.p(string, nArray) : this.p(string, null)) : this.k(string, null);
                n2 = com.github.catvod.spider.merge.B.c.q.a;
                if (object3 == null && (d2.isEnabled(n2) || (n2 & this.d.j) != 0)) {
                    if (this.e == null) {
                        object9 = new ConcurrentHashMap<String, Object>(1, 0.75f, 1);
                        for (object4 = this.c; object4 != null && object4 != Object.class; object4 = ((Class)object4).getSuperclass()) {
                            object8 = ((Class)object4).getDeclaredFields();
                            n3 = ((Field[])object8).length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                object7 = object8[n2];
                                object6 = ((Field)object7).getName();
                                if (this.k((String)object6, null) != null || ((n4 = ((Field)object7).getModifiers()) & 0x10) != 0 || (n4 & 8) != 0) continue;
                                object5 = A.E((Field)object7, b.class);
                                if (object5 != null && !"".equals(object5 = object5.name())) {
                                    object6 = object5;
                                }
                                ((ConcurrentHashMap)object9).put(object6, object7);
                            }
                        }
                        this.e = object9;
                    }
                    if ((object4 = ((ConcurrentHashMap)this.e).get(string)) != null) {
                        if (object4 instanceof n) {
                            object3 = (n)object4;
                        } else {
                            object3 = (Field)object4;
                            ((AccessibleObject)object3).setAccessible(true);
                            object3 = new com.github.catvod.spider.merge.H.e(string, ((Field)object3).getDeclaringClass(), ((Field)object3).getType(), ((Field)object3).getGenericType(), (Field)object3, 0, 0, 0);
                            object3 = new h((Class)this.c, (com.github.catvod.spider.merge.H.e)object3);
                            ((ConcurrentHashMap)this.e).put(string, object3);
                        }
                    }
                }
                if (object3 != null) break block31;
                if (!d2.l(com.github.catvod.spider.merge.B.c.i)) {
                    object = com.github.catvod.spider.merge.C.a.c("setter not found, class ");
                    ((StringBuilder)object).append(this.c.getName());
                    ((StringBuilder)object).append(", property ");
                    ((StringBuilder)object).append(string);
                    throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
                }
                n3 = -1;
                for (n2 = 0; n2 < ((n[])(object3 = this.b)).length; ++n2) {
                    block32: {
                        block33: {
                            object6 = object3[n2];
                            object5 = ((n)object6).a;
                            n4 = n3;
                            if (!((com.github.catvod.spider.merge.H.e)object5).r) break block32;
                            n4 = n3;
                            if (!(object6 instanceof h)) break block32;
                            if (((com.github.catvod.spider.merge.H.e)object5).c == null) break block33;
                            object8 = (h)object6;
                            object7 = ((h)object8).g(((com.github.catvod.spider.merge.B.b)object).e());
                            if (object7 instanceof q) {
                                object9 = ((q)object7).k(string, null);
                                n4 = n3;
                                if (object9 != null) {
                                    try {
                                        object3 = object4 = ((com.github.catvod.spider.merge.H.e)object5).c.get(object2);
                                        if (object4 == null) {
                                            object3 = ((q)object7).d((com.github.catvod.spider.merge.B.b)object, ((com.github.catvod.spider.merge.H.e)object5).f);
                                            ((n)object6).e(object2, object3);
                                        }
                                        if ((object4 = ((h)object8).c) != null) {
                                            object4.e();
                                        }
                                        d2.a();
                                        ((n)object9).d((com.github.catvod.spider.merge.B.b)object, object3, type, map);
                                    }
                                    catch (Exception exception) {
                                        throw new com.github.catvod.spider.merge.y.d("parse unwrapped field error.", exception);
                                    }
                                }
                                break block32;
                            } else {
                                n4 = n3;
                                if (object7 instanceof t) {
                                    object9 = (t)object7;
                                    try {
                                        object3 = object4 = (Map)((com.github.catvod.spider.merge.H.e)object5).c.get(object2);
                                        if (object4 == null) {
                                            object3 = ((t)object9).g(((com.github.catvod.spider.merge.H.e)object5).f);
                                            ((n)object6).e(object2, object3);
                                        }
                                        d2.q();
                                        object3.put(string, ((com.github.catvod.spider.merge.B.b)object).o(string));
                                    }
                                    catch (Exception exception) {
                                        throw new com.github.catvod.spider.merge.y.d("parse unwrapped field error.", exception);
                                    }
                                }
                            }
                            break block32;
                        }
                        n4 = n3;
                        if (((com.github.catvod.spider.merge.H.e)object5).b.getParameterTypes().length == 2) {
                            d2.q();
                            object3 = ((com.github.catvod.spider.merge.B.b)object).o(string);
                            try {
                                ((com.github.catvod.spider.merge.H.e)object5).b.invoke(object2, string, object3);
                            }
                            catch (Exception exception) {
                                throw new com.github.catvod.spider.merge.y.d("parse unwrapped field error.", exception);
                            }
                        }
                        break block32;
                        n4 = n2;
                    }
                    n3 = n4;
                }
                if (n3 == -1) {
                    ((com.github.catvod.spider.merge.B.b)object).r(object2, string);
                    return false;
                }
                if (nArray != null) {
                    n2 = n3 / 32;
                    nArray[n2] = nArray[n2] | 1 << n3 % 32;
                }
                return true;
            }
            for (n2 = 0; n2 < ((n[])(object4 = this.b)).length; ++n2) {
                if (object4[n2] != object3) {
                    continue;
                }
                break block30;
            }
            n2 = -1;
        }
        if (n2 != -1 && nArray != null && string.startsWith("_") && q.m(n2, nArray)) {
            ((com.github.catvod.spider.merge.B.b)object).r(object2, string);
            return false;
        }
        ((n)object3).b();
        d2.a();
        ((n)object3).d((com.github.catvod.spider.merge.B.b)object, object2, type, map);
        if (nArray != null) {
            n3 = n2 / 32;
            nArray[n3] = nArray[n3] | 1 << n2 % 32;
        }
        return true;
    }

    protected final Enum o(f object, char[] object2, v v2) {
        if ((v2 = v2 instanceof j ? (j)v2 : null) == null) {
            ((f)object).m = -1;
            return null;
        }
        long l2 = ((f)object).a0((char[])object2);
        if (((f)object).m > 0) {
            object2 = ((j)v2).b(l2);
            if (object2 == null) {
                if (l2 == -3750763034362895579L) {
                    return null;
                }
                if (((f)object).l(com.github.catvod.spider.merge.B.c.w)) {
                    object = com.github.catvod.spider.merge.C.a.c("not match enum value, ");
                    ((StringBuilder)object).append(((j)v2).a);
                    throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
                }
            }
            return object2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final n p(String object, int[] object2) {
        boolean bl;
        int n2;
        int n3;
        void var10_17;
        n n4;
        Object var12_5 = null;
        if (object == null) {
            return null;
        }
        n n5 = n4 = this.k((String)object, (int[])object2);
        if (n4 != null) return var10_17;
        long[] lArray = this.h;
        int n6 = 0;
        if (lArray == null) {
            n[] nArray;
            long[] lArray2 = new long[this.b.length];
            for (n3 = 0; n3 < (nArray = this.b).length; ++n3) {
                lArray2[n3] = nArray[n3].a.u;
            }
            Arrays.sort(lArray2);
            this.h = lArray2;
        }
        long l2 = A.B((String)object);
        n3 = n2 = Arrays.binarySearch(this.h, l2);
        if (n2 < 0) {
            l2 = A.A((String)object);
            n3 = Arrays.binarySearch(this.h, l2);
        }
        if (n3 < 0) {
            boolean bl2;
            bl = bl2 = ((String)object).startsWith("is");
            if (bl2) {
                l2 = A.A(((String)object).substring(2));
                n3 = Arrays.binarySearch(this.h, l2);
                bl = bl2;
            }
        } else {
            bl = false;
        }
        object = n4;
        if (n3 >= 0) {
            if (this.i == null) {
                n[] nArray;
                object = new short[this.h.length];
                Arrays.fill((short[])object, (short)-1);
                while (n6 < (nArray = this.b).length) {
                    n2 = Arrays.binarySearch(this.h, nArray[n6].a.u);
                    if (n2 >= 0) {
                        object[n2] = (short)n6;
                    }
                    ++n6;
                }
                this.i = (short[])object;
            }
            n3 = this.i[n3];
            object = n4;
            if (n3 != -1) {
                object = n4;
                if (!q.m(n3, object2)) {
                    object = this.b[n3];
                }
            }
        }
        Object object3 = object;
        if (object == null) return var10_17;
        com.github.catvod.spider.merge.H.e e2 = ((n)object).a;
        if ((e2.j & com.github.catvod.spider.merge.B.c.s.a) != 0) {
            return null;
        }
        Class<?> clazz = e2.e;
        Object object4 = object;
        if (!bl) return var10_17;
        Object object5 = object;
        if (clazz == Boolean.TYPE) return var10_17;
        Object object6 = object;
        if (clazz == Boolean.class) return var10_17;
        return var12_5;
    }
}

