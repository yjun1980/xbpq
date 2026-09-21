/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.B.k;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.g;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class t
extends g {
    public static t a = new t();

    @Override
    public final int e() {
        return 12;
    }

    @Override
    public final <T> T f(com.github.catvod.spider.merge.B.b b2, Type map, Object object, String object2, int n2) {
        k k2;
        block6: {
            if (map == e.class && b2.i() == null) {
                return (T)b2.s();
            }
            object2 = b2.f;
            if (object2.p() == 8) {
                object2.o(16);
                return null;
            }
            boolean bl = map instanceof Class && "java.util.Collections$UnmodifiableMap".equals(((Class)((Object)map)).getName());
            object2 = (object2.w() & c.n.a) != 0 ? this.h((Type)((Object)map), object2.w()) : this.g((Type)((Object)map));
            k2 = b2.f();
            b2.z(k2, object2, object);
            object = this.i(b2, (Type)((Object)map), object, (Map)object2, n2);
            map = object;
            if (!bl) break block6;
            map = Collections.unmodifiableMap((Map)object);
        }
        return (T)map;
        finally {
            b2.B(k2);
        }
    }

    public final Map<Object, Object> g(Type type) {
        return this.h(type, com.github.catvod.spider.merge.y.a.g);
    }

    public final Map<Object, Object> h(Type object, int n2) {
        if (object == Properties.class) {
            return new Properties();
        }
        if (object == Hashtable.class) {
            return new Hashtable<Object, Object>();
        }
        if (object == IdentityHashMap.class) {
            return new IdentityHashMap<Object, Object>();
        }
        if (object != SortedMap.class && object != TreeMap.class) {
            if (object != ConcurrentMap.class && object != ConcurrentHashMap.class) {
                if (object == Map.class) {
                    object = (c.n.a & n2) != 0 ? new LinkedHashMap() : new HashMap<Object, Object>();
                    return object;
                }
                if (object == HashMap.class) {
                    return new HashMap<Object, Object>();
                }
                if (object == LinkedHashMap.class) {
                    return new LinkedHashMap<Object, Object>();
                }
                if (object instanceof ParameterizedType) {
                    Type type = (object = (ParameterizedType)object).getRawType();
                    if (EnumMap.class.equals((Object)type)) {
                        return new EnumMap<Object, Object>((Class)object.getActualTypeArguments()[0]);
                    }
                    return this.h(type, n2);
                }
                Object object2 = (Class)object;
                if (!((Class)object2).isInterface()) {
                    if ("java.util.Collections$UnmodifiableMap".equals(((Class)object2).getName())) {
                        return new HashMap<Object, Object>();
                    }
                    try {
                        object2 = (Map)((Class)object2).newInstance();
                        return object2;
                    }
                    catch (Exception exception) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("unsupport type ");
                        ((StringBuilder)object2).append(object);
                        throw new d(((StringBuilder)object2).toString(), exception);
                    }
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("unsupport type ");
                ((StringBuilder)object2).append(object);
                throw new d(((StringBuilder)object2).toString());
            }
            return new ConcurrentHashMap<Object, Object>();
        }
        return new TreeMap<Object, Object>();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Object i(com.github.catvod.spider.merge.B.b var1_1, Type var2_2, Object var3_6, Map var4_7, int var5_8) {
        block52: {
            block51: {
                if (var2_2 instanceof ParameterizedType == false) return var1_1.v((Map)var4_7, var3_6);
                var2_2 = (ParameterizedType)var2_2;
                var13_9 = var2_2.getActualTypeArguments()[0];
                var11_10 = var4_7.getClass().getName().equals("org.springframework.util.LinkedMultiValueMap") != false ? List.class : var2_2.getActualTypeArguments()[1];
                if (String.class != var13_9) break block51;
                var13_9 = var1_1.f;
                var7_11 = var13_9.p();
                if (var7_11 != 12) {
                    if (var7_11 == 4) {
                        var2_2 = var13_9.K();
                        if (var2_2.length() == 0) return null;
                        if (var2_2.equals("null")) {
                            return null;
                        }
                    }
                    var2_2 = com.github.catvod.spider.merge.C.a.c("syntax error, expect {, actual ");
                    var2_2.append(var13_9.y());
                    var2_2 = var4_7 = var2_2.toString();
                    if (var3_6 instanceof String) {
                        var2_2 = com.github.catvod.spider.merge.A.c.a(com.github.catvod.spider.merge.B.e.c((String)var4_7, ", fieldName "), var3_6);
                    }
                    var2_2 = com.github.catvod.spider.merge.C.a.c(com.github.catvod.spider.merge.B.e.c((String)var2_2, ", "));
                    var2_2.append(var13_9.f());
                    var2_2 = var2_2.toString();
                    if (var7_11 == 4) throw new d((String)var2_2);
                    var4_7 = new b();
                    var1_1.q((Collection)var4_7, var3_6);
                    if (var4_7.size() != 1) throw new d((String)var2_2);
                    var1_1 = var4_7.get(0);
                    if (var1_1 instanceof e == false) throw new d((String)var2_2);
                    return (e)var1_1;
                }
                break block52;
            }
            var12_19 = var1_1.f;
            if (var12_19.p() != 12 && var12_19.p() != 16) {
                var1_1 = com.github.catvod.spider.merge.C.a.c("syntax error, expect {, actual ");
                var1_1.append(var12_19.y());
                throw new d(var1_1.toString());
            }
            var15_20 = var1_1.e().f((Type)var13_9);
            var14_13 = var1_1.e().f((Type)var11_10);
            var12_19.o(var15_20.e());
            var3_6 = var1_1.f();
            ** try [egrp 4[TRYBLOCK] [29 : 1201->1395)] { 
lbl44:
            // 1 sources

            ** GOTO lbl-1000
        }
        var14_12 = var1_1.f();
        var8_14 = 0;
        while (true) {
            block50: {
                block58: {
                    block47: {
                        block49: {
                            block48: {
                                try {
                                    block56: {
                                        block57: {
                                            block54: {
                                                block55: {
                                                    block53: {
                                                        var13_9.d();
                                                        var9_16 = var7_11 = (int)var13_9.F();
                                                        if (var13_9.l(c.g)) {
                                                            while (true) {
                                                                var9_16 = var7_11;
                                                                if (var7_11 != 44) break;
                                                                var13_9.next();
                                                                var13_9.d();
                                                                var7_11 = var13_9.F();
                                                            }
                                                        }
                                                        if (var9_16 != 34) break block53;
                                                        var2_2 = var13_9.I(var1_1.b, '\"');
                                                        var13_9.d();
                                                        if (var13_9.F() != ':') {
                                                            var2_2 = new StringBuilder();
                                                            var2_2.append("expect ':' at ");
                                                            var2_2.append(var13_9.b());
                                                            var3_6 = new d(var2_2.toString());
                                                            throw var3_6;
                                                        }
                                                        break block54;
                                                    }
                                                    if (var9_16 == 125) {
                                                        var13_9.next();
                                                        var13_9.e();
                                                        break block47;
                                                    }
                                                    if (var9_16 != 39) break block55;
                                                    if (!var13_9.l(c.d)) {
                                                        var2_2 = new d("syntax error");
                                                        throw var2_2;
                                                    }
                                                    var2_2 = var13_9.I(var1_1.b, '\'');
                                                    var13_9.d();
                                                    if (var13_9.F() != ':') {
                                                        var3_6 = new StringBuilder();
                                                        var3_6.append("expect ':' at ");
                                                        var3_6.append(var13_9.b());
                                                        var2_2 = new d(var3_6.toString());
                                                        throw var2_2;
                                                    }
                                                    break block54;
                                                }
                                                if (!var13_9.l(c.c)) break block56;
                                                var2_2 = var13_9.E(var1_1.b);
                                                var13_9.d();
                                                var6_15 = var13_9.F();
                                                if (var6_15 != ':') break block57;
                                            }
                                            var13_9.next();
                                            var13_9.d();
                                            var13_9.F();
                                            var13_9.e();
                                            if (var2_2 == com.github.catvod.spider.merge.y.a.c && !var13_9.l((c)(var12_18 = c.o)) && (var7_11 = (var5_8 & var12_18.a) != 0 ? 1 : 0) == 0) {
                                                var2_2 = var13_9.I(var1_1.b, '\"');
                                                var12_18 = var1_1.e();
                                                if (var2_2.equals("java.util.HashMap")) break block48;
                                                if (var2_2.equals("java.util.LinkedHashMap")) {
                                                    var2_2 = LinkedHashMap.class;
                                                    break block49;
                                                }
                                                var10_17 = var12_18.j();
                                                if (var10_17) break block48;
                                                var2_2 = var12_18.b((String)var2_2, null, var13_9.w());
                                                break block49;
                                            }
                                            var13_9.nextToken();
                                            if (var8_14 != 0) {
                                                var1_1.B(var14_12);
                                            }
                                            if (var13_9.p() == 8) {
                                                var13_9.nextToken();
                                                var12_18 = null;
                                            } else {
                                                var12_18 = var1_1.t((Type)var11_10, var2_2);
                                            }
                                            var4_7.put(var2_2, var12_18);
                                            var1_1.d((Map)var4_7, var2_2);
                                            var1_1.z(var14_12, var12_18, var2_2);
                                            var1_1.B(var14_12);
                                            var7_11 = var13_9.p();
                                            if (var7_11 == 20 || var7_11 == 15) break;
                                            if (var7_11 == 13) {
                                                var13_9.nextToken();
                                                break;
                                            }
                                            break block50;
                                        }
                                        var2_2 = new StringBuilder();
                                        var2_2.append("expect ':' at ");
                                        var2_2.append(var13_9.b());
                                        var2_2.append(", actual ");
                                        var2_2.append(var6_15);
                                        var3_6 = new d(var2_2.toString());
                                        throw var3_6;
                                    }
                                    var2_2 = new d("syntax error");
                                    throw var2_2;
                                }
                                catch (Throwable var2_3) {
                                    var1_1.B(var14_12);
                                    throw var2_3;
                                }
                                catch (d var2_5) {}
                            }
                            var2_2 = HashMap.class;
                        }
                        if (!Map.class.isAssignableFrom((Class<?>)var2_2)) break block58;
                        var13_9.o(16);
                        if (var13_9.p() != 13) break block50;
                    }
                    var13_9.o(16);
                    break;
                }
                var4_7 = var12_18.f((Type)var2_2);
                var13_9.o(16);
                var1_1.k = 2;
                if (var14_12 != null && !(var3_6 instanceof Integer)) {
                    var1_1.x();
                }
                var2_2 = (Map)var4_7.c((com.github.catvod.spider.merge.B.b)var1_1, (Type)var2_2, var3_6);
                var1_1.B(var14_12);
                return var2_2;
            }
            ++var8_14;
        }
        var1_1.B(var14_12);
        return var4_7;
lbl-1000:
        // 1 sources

        {
            while (true) {
                block66: {
                    block67: {
                        block60: {
                            block61: {
                                block65: {
                                    block64: {
                                        block63: {
                                            block62: {
                                                block59: {
                                                    if (var12_19.p() != 13) break block59;
                                                    var12_19.o(16);
                                                    break block60;
                                                }
                                                if (var12_19.p() != 4 || !var12_19.H() || var12_19.l(c.o)) break block61;
                                                var12_19.a();
                                                if (var12_19.p() != 4) {
                                                    var2_2 = new StringBuilder();
                                                    var2_2.append("illegal ref, ");
                                                    var2_2.append(j.f(var12_19.p()));
                                                    var4_7 = new d(var2_2.toString());
                                                    throw var4_7;
                                                }
                                                var2_2 = var12_19.K();
                                                if (!"..".equals(var2_2)) break block62;
                                                var2_2 = var3_6.b;
                                                break block63;
                                            }
                                            if ("$".equals(var2_2)) {
                                                var2_2 = var3_6;
                                                while ((var4_7 = var2_2.b) != null) {
                                                    var2_2 = var4_7;
                                                }
                                            }
                                            break block64;
                                        }
                                        var2_2 = var2_2.a;
                                        break block65;
                                    }
                                    var4_7 = new com.github.catvod.spider.merge.B.a((k)var3_6, (String)var2_2);
                                    var1_1.b((com.github.catvod.spider.merge.B.a)var4_7);
                                    var1_1.k = 1;
                                    var2_2 = null;
                                }
                                var12_19.o(13);
                                if (var12_19.p() == 13) {
                                    var12_19.o(16);
                                    return var2_2;
                                }
                                var2_2 = new d("illegal ref");
                                throw var2_2;
                            }
                            if (var4_7.size() != 0 || var12_19.p() != 4 || !com.github.catvod.spider.merge.y.a.c.equals(var12_19.K()) || var12_19.l(c.o)) break block66;
                            var12_19.a();
                            var12_19.o(16);
                            if (var12_19.p() != 13) break block67;
                            var12_19.nextToken();
                        }
                        var2_2 = var4_7;
                        return var2_2;
                    }
                    var12_19.o(var15_20.e());
                }
                if (var12_19.p() == 4 && var15_20 instanceof q) {
                    var2_2 = var12_19.K();
                    var12_19.nextToken();
                    var16_21 /* !! */  = new com.github.catvod.spider.merge.B.b((String)var2_2, var1_1.e(), var1_1.f.w());
                    var16_21 /* !! */ .C(var1_1.g());
                    var2_2 = var15_20.c(var16_21 /* !! */ , (Type)var13_9, null);
                } else {
                    var2_2 = var15_20.c((com.github.catvod.spider.merge.B.b)var1_1, (Type)var13_9, null);
                }
                if (var12_19.p() != 17) break;
                var12_19.o(var14_13.e());
                var16_21 /* !! */  = var14_13.c((com.github.catvod.spider.merge.B.b)var1_1, (Type)var11_10, var2_2);
                var1_1.d((Map)var4_7, var2_2);
                var4_7.put(var2_2, var16_21 /* !! */ );
                if (var12_19.p() != 16) continue;
                var12_19.o(var15_20.e());
            }
            var4_7 = new StringBuilder();
            var4_7.append("syntax error, expect :, actual ");
            var4_7.append(var12_19.p());
            var2_2 = new d(var4_7.toString());
            throw var2_2;
        }
lbl259:
        // 1 sources

        finally {
            var1_1.B((k)var3_6);
        }
    }
}

