/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.z.b;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;

public final class j
implements v {
    protected final Class<?> a;
    protected final Enum[] b;
    protected final Enum[] c;
    protected long[] d;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j(Class<?> var1_1) {
        super();
        this.a = var1_1;
        this.c = (Enum[])var1_1.getEnumConstants();
        var17_2 = new HashMap<Long, Enum>();
        var2_3 = 0;
        while (true) {
            block17: {
                block18: {
                    if (var2_3 >= ((Enum[])(var12_10 = this.c)).length) break block18;
                    var18_17 = var12_10[var2_3];
                    var15_15 = var18_17.name();
                    var13_12 = null;
                    var12_10 = A.E(var1_1.getField(var15_15), b.class);
                    var14_14 = var15_15;
                    var13_12 = var12_10;
                    if (var12_10 == null) break block17;
                    try {
                        var16_16 = var12_10.name();
                        var14_14 = var15_15;
                        var13_12 = var12_10;
                        if (var16_16 == null) break block17;
                        var3_4 = var16_16.length();
                        var14_14 = var15_15;
                        var13_12 = var12_10;
                        if (var3_4 > 0) {
                            var14_14 = var16_16;
                            var13_12 = var12_10;
                        }
                    }
                    catch (Exception var13_13) {}
                    ** GOTO lbl-1000
                }
                this.d = new long[var17_2.size()];
                var1_1 = var17_2.keySet().iterator();
                var2_3 = 0;
                while (var1_1.hasNext()) {
                    var12_10 = (Long)var1_1.next();
                    this.d[var2_3] = var12_10.longValue();
                    ++var2_3;
                }
                Arrays.sort(this.d);
                this.b = new Enum[this.d.length];
                var2_3 = 0;
                while (true) {
                    if (var2_3 >= ((Object)(var1_1 = (Object)this.d)).length) {
                        return;
                    }
                    this.b[var2_3] = var1_1 = (Enum)var17_2.get((long)var1_1[var2_3]);
                    ++var2_3;
                }
                catch (Exception var12_11) {
                    var12_10 = var13_12;
                }
lbl-1000:
                // 2 sources

                {
                    var13_12 = var12_10;
                    var14_14 = var15_15;
                }
            }
            var6_7 = -3750763034362895579L;
            var8_8 = -3750763034362895579L;
            for (var3_4 = 0; var3_4 < var14_14.length(); ++var3_4) {
                var5_6 = var14_14.charAt(var3_4);
                var10_9 = var5_6;
                var4_5 = var5_6;
                if (var5_6 >= 65) {
                    var4_5 = var5_6;
                    if (var5_6 <= 90) {
                        var4_5 = var5_6 + 32;
                    }
                }
                var8_8 = ((long)var4_5 ^ var8_8) * 1099511628211L;
                var6_7 = (var10_9 ^ var6_7) * 1099511628211L;
            }
            var17_2.put(var6_7, var18_17);
            if (var6_7 != var8_8) {
                var17_2.put(var8_8, var18_17);
            }
            var4_5 = var2_3;
            if (var13_12 != null) {
                var13_12 = var13_12.alternateNames();
                var5_6 = ((Object)var13_12).length;
                var3_4 = 0;
                while (true) {
                    var4_5 = var2_3;
                    if (var3_4 >= var5_6) break;
                    var12_10 = var13_12[var3_4];
                    var10_9 = -3750763034362895579L;
                    for (var4_5 = 0; var4_5 < var12_10.length(); ++var4_5) {
                        var10_9 = (var10_9 ^ (long)var12_10.charAt(var4_5)) * 1099511628211L;
                    }
                    if (var10_9 != var6_7 && var10_9 != var8_8) {
                        var17_2.put(var10_9, var18_17);
                    }
                    ++var3_4;
                }
            }
            var2_3 = var4_5 + 1;
        }
    }

    public final Enum b(long l2) {
        if (this.b == null) {
            return null;
        }
        int n2 = Arrays.binarySearch(this.d, l2);
        if (n2 < 0) {
            return null;
        }
        return this.b[n2];
    }

    @Override
    public final <T> T c(com.github.catvod.spider.merge.B.b object, Type object2, Object object3) {
        int n2;
        com.github.catvod.spider.merge.B.d d2;
        block19: {
            block20: {
                d2 = ((com.github.catvod.spider.merge.B.b)object).f;
                n2 = d2.p();
                if (n2 != 2) break block19;
                n2 = d2.c();
                d2.o(16);
                if (n2 < 0) break block20;
                object = this.c;
                if (n2 >= ((Enum[])object).length) break block20;
                return (T)object[n2];
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("parse enum ");
            ((StringBuilder)object).append(this.a.getName());
            ((StringBuilder)object).append(" error, value : ");
            ((StringBuilder)object).append(n2);
            object2 = new d(((StringBuilder)object).toString());
            throw object2;
        }
        if (n2 == 4) {
            block23: {
                block22: {
                    block21: {
                        object3 = d2.K();
                        d2.o(16);
                        if (((String)object3).length() != 0) break block21;
                        return null;
                    }
                    n2 = 0;
                    long l2 = -3750763034362895579L;
                    long l3 = -3750763034362895579L;
                    while (true) {
                        if (n2 >= ((String)object3).length()) break;
                        int n3 = ((String)object3).charAt(n2);
                        long l4 = n3;
                        int n4 = n3;
                        if (n3 >= 65) {
                            n4 = n3;
                            if (n3 <= 90) {
                                n4 = n3 + 32;
                            }
                        }
                        long l5 = n4;
                        l2 = (l2 ^ l4) * 1099511628211L;
                        l3 = (l3 ^ l5) * 1099511628211L;
                        ++n2;
                    }
                    object = object2 = this.b(l2);
                    if (object2 != null) break block22;
                    object = object2;
                    if (l3 == l2) break block22;
                    object = this.b(l3);
                }
                if (object == null) {
                    if (!d2.l(com.github.catvod.spider.merge.B.c.w)) break block23;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("not match enum value, ");
                    ((StringBuilder)object2).append(this.a.getName());
                    ((StringBuilder)object2).append(" : ");
                    ((StringBuilder)object2).append((String)object3);
                    object = new d(((StringBuilder)object2).toString());
                    throw object;
                }
            }
            return (T)object;
        }
        if (n2 == 8) {
            d2.o(16);
            return null;
        }
        try {
            object3 = ((com.github.catvod.spider.merge.B.b)object).o(null);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("parse enum ");
            ((StringBuilder)object2).append(this.a.getName());
            ((StringBuilder)object2).append(" error, value : ");
            ((StringBuilder)object2).append(object3);
            object = new d(((StringBuilder)object2).toString());
            throw object;
        }
        catch (Exception exception) {
            throw new d(exception.getMessage(), exception);
        }
        catch (d d3) {
            throw d3;
        }
    }

    @Override
    public final int e() {
        return 2;
    }
}

