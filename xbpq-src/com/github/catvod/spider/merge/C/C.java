/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class C
extends q {
    public C(o o2, Class<?> clazz) {
        super(o2, clazz, clazz);
    }

    private Throwable q(String string, Throwable throwable, Class<?> genericDeclaration) {
        block14: {
            block12: {
                GenericDeclaration genericDeclaration2;
                block13: {
                    Constructor constructor;
                    block11: {
                        Constructor<?>[] constructorArray = ((Class)genericDeclaration).getConstructors();
                        int n2 = constructorArray.length;
                        Constructor constructor2 = null;
                        genericDeclaration2 = constructor = null;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            GenericDeclaration genericDeclaration3;
                            GenericDeclaration genericDeclaration4;
                            GenericDeclaration genericDeclaration5;
                            genericDeclaration = constructorArray[i2];
                            Class<?>[] classArray = ((Constructor)genericDeclaration).getParameterTypes();
                            if (classArray.length == 0) {
                                genericDeclaration5 = constructor2;
                                genericDeclaration4 = constructor;
                                genericDeclaration3 = genericDeclaration;
                            } else if (classArray.length == 1 && classArray[0] == String.class) {
                                genericDeclaration5 = constructor2;
                                genericDeclaration4 = genericDeclaration;
                                genericDeclaration3 = genericDeclaration2;
                            } else {
                                genericDeclaration5 = constructor2;
                                genericDeclaration4 = constructor;
                                genericDeclaration3 = genericDeclaration2;
                                if (classArray.length == 2) {
                                    genericDeclaration5 = constructor2;
                                    genericDeclaration4 = constructor;
                                    genericDeclaration3 = genericDeclaration2;
                                    if (classArray[0] == String.class) {
                                        genericDeclaration5 = constructor2;
                                        genericDeclaration4 = constructor;
                                        genericDeclaration3 = genericDeclaration2;
                                        if (classArray[1] == Throwable.class) {
                                            genericDeclaration3 = genericDeclaration2;
                                            genericDeclaration4 = constructor;
                                            genericDeclaration5 = genericDeclaration;
                                        }
                                    }
                                }
                            }
                            constructor2 = genericDeclaration5;
                            constructor = genericDeclaration4;
                            genericDeclaration2 = genericDeclaration3;
                        }
                        if (constructor2 == null) break block11;
                        string = constructor2.newInstance(string, throwable);
                        break block12;
                    }
                    if (constructor == null) break block13;
                    string = constructor.newInstance(string);
                    break block12;
                }
                if (genericDeclaration2 == null) break block14;
                string = genericDeclaration2.newInstance(new Object[0]);
            }
            return (Throwable)((Object)string);
        }
        return null;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public final <T> T c(b var1_1, Type var2_3, Object var3_4) {
        block27: {
            block33: {
                block34: {
                    block24: {
                        block32: {
                            block23: {
                                block26: {
                                    block25: {
                                        var12_5 = var1_1.f;
                                        if (var12_5.p() == 8) {
                                            var12_5.nextToken();
                                            return null;
                                        }
                                        if (var1_1.k != 2) break block25;
                                        var1_1.k = 0;
                                        break block26;
                                    }
                                    if (var12_5.p() != 12) break block27;
                                }
                                if (var2_3 /* !! */  == null || !(var2_3 /* !! */  instanceof Class) || !Throwable.class.isAssignableFrom((Class<?>)(var3_4 = (Class)var2_3 /* !! */ ))) {
                                    var3_4 = null;
                                }
                                var2_3 /* !! */  = null;
                                var6_6 = null;
                                var5_7 = var6_6;
                                var4_8 /* !! */  = var5_7;
                                while (true) {
                                    block30: {
                                        block31: {
                                            block28: {
                                                block29: {
                                                    if ((var8_10 = var12_5.x(var1_1.b)) == null) {
                                                        if (var12_5.p() == 13) {
                                                            var7_9 = var2_3 /* !! */ ;
                                                            break block23;
                                                        }
                                                        if (var12_5.p() == 16 && var12_5.l(com.github.catvod.spider.merge.B.c.g)) continue;
                                                    }
                                                    var12_5.a();
                                                    if (!com.github.catvod.spider.merge.y.a.c.equals(var8_10)) break block28;
                                                    if (var12_5.p() != 4) break block29;
                                                    var3_4 = var12_5.K();
                                                    var11_13 = var1_1.e().b((String)var3_4, Throwable.class, var12_5.w());
                                                    var12_5.o(16);
                                                    var7_9 = var2_3 /* !! */ ;
                                                    var8_10 = var6_6;
                                                    var9_11 = var5_7;
                                                    var10_12 /* !! */  = var4_8 /* !! */ ;
                                                    break block30;
                                                }
                                                throw new d("syntax error");
                                            }
                                            if (!"message".equals(var8_10)) ** GOTO lbl51
                                            if (var12_5.p() != 8) break block31;
                                            var9_11 = null;
                                            ** GOTO lbl44
                                        }
                                        if (var12_5.p() == 4) {
                                            var9_11 = var12_5.K();
lbl44:
                                            // 2 sources

                                            var12_5.nextToken();
                                            var7_9 = var2_3 /* !! */ ;
                                            var8_10 = var6_6;
                                            var10_12 /* !! */  = var4_8 /* !! */ ;
                                            var11_13 = var3_4;
                                        } else {
                                            throw new d("syntax error");
lbl51:
                                            // 1 sources

                                            if ("cause".equals(var8_10)) {
                                                var8_10 = (Throwable)this.c(var1_1, null, "cause");
                                                var7_9 = var2_3 /* !! */ ;
                                                var9_11 = var5_7;
                                                var10_12 /* !! */  = var4_8 /* !! */ ;
                                                var11_13 = var3_4;
                                            } else if ("stackTrace".equals(var8_10)) {
                                                var10_12 /* !! */  = (StackTraceElement[])var1_1.t((Type)StackTraceElement[].class, null);
                                                var7_9 = var2_3 /* !! */ ;
                                                var8_10 = var6_6;
                                                var9_11 = var5_7;
                                                var11_13 = var3_4;
                                            } else {
                                                var7_9 = var2_3 /* !! */ ;
                                                if (var2_3 /* !! */  == null) {
                                                    var7_9 = new HashMap<Iterator<Map.Entry<K, V>>, Object>();
                                                }
                                                var7_9.put(var8_10, var1_1.o(null));
                                                var11_13 = var3_4;
                                                var10_12 /* !! */  = var4_8 /* !! */ ;
                                                var9_11 = var5_7;
                                                var8_10 = var6_6;
                                            }
                                        }
                                    }
                                    var2_3 /* !! */  = var7_9;
                                    var6_6 = var8_10;
                                    var5_7 = var9_11;
                                    var4_8 /* !! */  = var10_12 /* !! */ ;
                                    var3_4 = var11_13;
                                    if (var12_5.p() == 13) break;
                                }
                                var3_4 = var11_13;
                                var4_8 /* !! */  = var10_12 /* !! */ ;
                                var5_7 = var9_11;
                                var6_6 = var8_10;
                            }
                            var12_5.o(16);
                            if (var3_4 != null) break block32;
                            var2_3 /* !! */  = new Exception((String)var5_7, (Throwable)var6_6);
                            break block24;
                        }
                        if (!Throwable.class.isAssignableFrom((Class<?>)var3_4)) break block33;
                        var8_10 = this.q((String)var5_7, (Throwable)var6_6, (Class<?>)var3_4);
                        var2_3 /* !! */  = var8_10;
                        if (var8_10 != null) break block24;
                        try {
                            var2_3 /* !! */  = new Exception((String)var5_7, (Throwable)var6_6);
                        }
                        catch (Exception var1_2) {
                            throw new d("create instance error", var1_2);
                        }
                    }
                    if (var4_8 /* !! */  != null) {
                        var2_3 /* !! */ .setStackTrace(var4_8 /* !! */ );
                    }
                    if (var7_9 == null) break block34;
                    if (var3_4 == null) ** GOTO lbl-1000
                    if (var3_4 == this.c) {
                        var3_4 = this;
                    } else {
                        var3_4 = var1_1.e().f((Type)var3_4);
                        if (var3_4 instanceof q) {
                            var3_4 = (q)var3_4;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_4 = null;
                        }
                    }
                    if (var3_4 != null) {
                        for (Object var5_7 : var7_9.entrySet()) {
                            var4_8 /* !! */  = (String)var5_7.getKey();
                            var5_7 = var5_7.getValue();
                            var7_9 = var3_4.k((String)var4_8 /* !! */ , null);
                            if (var7_9 == null) continue;
                            var8_10 = var7_9.a;
                            var4_8 /* !! */  = var5_7;
                            if (!var8_10.e.isInstance(var5_7)) {
                                var4_8 /* !! */  = A.f(var5_7, var8_10.f, var1_1.e());
                            }
                            var7_9.e(var2_3 /* !! */ , var4_8 /* !! */ );
                        }
                    }
                }
                return (T)var2_3 /* !! */ ;
            }
            throw new d(h.e((Class)var3_4, a.c("type not match, not Throwable. ")));
        }
        throw new d("syntax error");
    }

    @Override
    public final int e() {
        return 12;
    }
}

