/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.y.d;
import java.lang.reflect.Type;

public final class B
implements v {
    public static final B a = new B();

    /*
     * Unable to fully structure code
     */
    @Override
    public final <T> T c(b var1_1, Type var2_2, Object var3_3) {
        block11: {
            block12: {
                var10_4 = var1_1.f;
                if (var10_4.p() == 8) {
                    var10_4.nextToken();
                    return null;
                }
                if (var10_4.p() != 12 && var10_4.p() != 16) {
                    var1_1 = com.github.catvod.spider.merge.C.a.c("syntax error: ");
                    var1_1.append(j.f(var10_4.p()));
                    throw new d(var1_1.toString());
                }
                var5_5 = 0;
                var9_6 = null;
                var7_8 = var8_7 = null;
                while (true) {
                    block15: {
                        block34: {
                            block35: {
                                block32: {
                                    block33: {
                                        block28: {
                                            block31: {
                                                block29: {
                                                    block30: {
                                                        block26: {
                                                            block27: {
                                                                block23: {
                                                                    block25: {
                                                                        block24: {
                                                                            block20: {
                                                                                block22: {
                                                                                    block21: {
                                                                                        block17: {
                                                                                            block19: {
                                                                                                block18: {
                                                                                                    block13: {
                                                                                                        block16: {
                                                                                                            block14: {
                                                                                                                if ((var2_2 = var10_4.x(var1_1.b)) == null) {
                                                                                                                    if (var10_4.p() == 13) {
                                                                                                                        var2_2 = var9_6;
                                                                                                                        var3_3 = var8_7;
                                                                                                                        var6_10 = var7_8;
                                                                                                                        var4_9 = var5_5;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if (var10_4.p() == 16 && var10_4.l(c.g)) continue;
                                                                                                                }
                                                                                                                var10_4.a();
                                                                                                                if (!"className".equals(var2_2)) break block13;
                                                                                                                if (var10_4.p() != 8) break block14;
                                                                                                                var2_2 = null;
                                                                                                                var3_3 = var8_7;
                                                                                                                var6_10 = var7_8;
                                                                                                                var4_9 = var5_5;
                                                                                                                break block15;
                                                                                                            }
                                                                                                            if (var10_4.p() != 4) break block16;
                                                                                                            var2_2 = var10_4.K();
                                                                                                            var3_3 = var8_7;
                                                                                                            var6_10 = var7_8;
                                                                                                            var4_9 = var5_5;
                                                                                                            break block15;
                                                                                                        }
                                                                                                        throw new d("syntax error");
                                                                                                    }
                                                                                                    if (!"methodName".equals(var2_2)) break block17;
                                                                                                    if (var10_4.p() != 8) break block18;
                                                                                                    var3_3 = null;
                                                                                                    var2_2 = var9_6;
                                                                                                    var6_10 = var7_8;
                                                                                                    var4_9 = var5_5;
                                                                                                    break block15;
                                                                                                }
                                                                                                if (var10_4.p() != 4) break block19;
                                                                                                var3_3 = var10_4.K();
                                                                                                var2_2 = var9_6;
                                                                                                var6_10 = var7_8;
                                                                                                var4_9 = var5_5;
                                                                                                break block15;
                                                                                            }
                                                                                            throw new d("syntax error");
                                                                                        }
                                                                                        if (!"fileName".equals(var2_2)) break block20;
                                                                                        if (var10_4.p() != 8) break block21;
                                                                                        var6_10 = null;
                                                                                        var2_2 = var9_6;
                                                                                        var3_3 = var8_7;
                                                                                        var4_9 = var5_5;
                                                                                        break block15;
                                                                                    }
                                                                                    if (var10_4.p() != 4) break block22;
                                                                                    var6_10 = var10_4.K();
                                                                                    var2_2 = var9_6;
                                                                                    var3_3 = var8_7;
                                                                                    var4_9 = var5_5;
                                                                                    break block15;
                                                                                }
                                                                                throw new d("syntax error");
                                                                            }
                                                                            if (!"lineNumber".equals(var2_2)) break block23;
                                                                            if (var10_4.p() != 8) break block24;
                                                                            var4_9 = 0;
                                                                            var2_2 = var9_6;
                                                                            var3_3 = var8_7;
                                                                            var6_10 = var7_8;
                                                                            break block15;
                                                                        }
                                                                        if (var10_4.p() != 2) break block25;
                                                                        var4_9 = var10_4.c();
                                                                        var2_2 = var9_6;
                                                                        var3_3 = var8_7;
                                                                        var6_10 = var7_8;
                                                                        break block15;
                                                                    }
                                                                    throw new d("syntax error");
                                                                }
                                                                if (!"nativeMethod".equals(var2_2)) break block26;
                                                                if (var10_4.p() != 8 && var10_4.p() != 6 && var10_4.p() != 7) break block27;
                                                                var10_4.o(16);
                                                                var2_2 = var9_6;
                                                                var3_3 = var8_7;
                                                                var6_10 = var7_8;
                                                                var4_9 = var5_5;
                                                                break block15;
                                                            }
                                                            throw new d("syntax error");
                                                        }
                                                        if (var2_2 != com.github.catvod.spider.merge.y.a.c) break block28;
                                                        if (var10_4.p() != 4) break block29;
                                                        var2_2 = var10_4.K();
                                                        if (!var2_2.equals("java.lang.StackTraceElement")) break block30;
                                                        var2_2 = var9_6;
                                                        var3_3 = var8_7;
                                                        var6_10 = var7_8;
                                                        var4_9 = var5_5;
                                                        break block15;
                                                    }
                                                    throw new d(e.c("syntax error : ", (String)var2_2));
                                                }
                                                if (var10_4.p() != 8) break block31;
                                                var2_2 = var9_6;
                                                var3_3 = var8_7;
                                                var6_10 = var7_8;
                                                var4_9 = var5_5;
                                                break block15;
                                            }
                                            throw new d("syntax error");
                                        }
                                        if (!"moduleName".equals(var2_2)) break block32;
                                        if (var10_4.p() != 8) break block33;
                                        var2_2 = var9_6;
                                        var3_3 = var8_7;
                                        var6_10 = var7_8;
                                        var4_9 = var5_5;
                                        break block15;
                                    }
                                    if (var10_4.p() != 4) {
                                        throw new d("syntax error");
                                    }
                                    ** GOTO lbl155
                                }
                                if (!"moduleVersion".equals(var2_2)) break block34;
                                if (var10_4.p() != 8) break block35;
                                var2_2 = var9_6;
                                var3_3 = var8_7;
                                var6_10 = var7_8;
                                var4_9 = var5_5;
                                break block15;
                            }
                            if (var10_4.p() != 4) {
                                throw new d("syntax error");
                            }
                            ** GOTO lbl155
                        }
                        if (!"classLoaderName".equals(var2_2)) break block11;
                        if (var10_4.p() == 8) {
                            var2_2 = var9_6;
                            var3_3 = var8_7;
                            var6_10 = var7_8;
                            var4_9 = var5_5;
                        } else {
                            if (var10_4.p() != 4) break block12;
lbl155:
                            // 3 sources

                            var10_4.K();
                            var4_9 = var5_5;
                            var6_10 = var7_8;
                            var3_3 = var8_7;
                            var2_2 = var9_6;
                        }
                    }
                    var9_6 = var2_2;
                    var8_7 = var3_3;
                    var7_8 = var6_10;
                    var5_5 = var4_9;
                    if (var10_4.p() == 13) break;
                }
                var10_4.o(16);
                return (T)new StackTraceElement((String)var2_2, (String)var3_3, (String)var6_10, var4_9);
            }
            throw new d("syntax error");
        }
        throw new d(e.c("syntax error : ", (String)var2_2));
    }

    @Override
    public final int e() {
        return 12;
    }
}

